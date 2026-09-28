import main.ast.nodes.program.Program;
import main.grammar.SimpleLangLexer;
import main.grammar.SimpleLangParser;
import main.visitor.TestVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Stack;

public class SimpleLang {

    private static final int SPACES_PER_INDENT = 4;

    /**
     * Removes CPY-style comments (starting with '#' or '//') from the input code.
     * @param cpyCodeWithComments The CPY code string that might contain comments.
     * @return The CPY code string with comments removed, preserving line structure.
     */
    private static String removeComments(String cpyCodeWithComments) {
        StringBuilder resultBuilder = new StringBuilder();
        // Split by any common newline sequence, -1 limit preserves trailing empty strings
        // which represent original newlines.
        String[] originalLines = cpyCodeWithComments.split("\r\n|\r|\n", -1);

        for (int i = 0; i < originalLines.length; i++) {
            String currentLine = originalLines[i];
            String lineWithoutComment = currentLine;

            int hashIndex = currentLine.indexOf('#');
            int slashIndex = currentLine.indexOf("//");
            int commentStartIndex = -1;

            if (hashIndex != -1 && slashIndex != -1) {
                commentStartIndex = Math.min(hashIndex, slashIndex);
            } else if (hashIndex != -1) {
                commentStartIndex = hashIndex;
            } else if (slashIndex != -1) {
                commentStartIndex = slashIndex;
            }

            if (commentStartIndex != -1) {
                // Comment found, take the part before it.
                // This part might be empty or just whitespace if it's a full-line comment.
                lineWithoutComment = currentLine.substring(0, commentStartIndex);
            }

            resultBuilder.append(lineWithoutComment);

            // Add back the newline for all lines except the very last one in the split array,
            // as split with -1 will give an empty string if the original input ended with a newline.
            // If the original file did not end with a newline, the last line also shouldn't get one here.
            if (i < originalLines.length - 1) {
                resultBuilder.append("\n");
            }
        }
        // If the original input string ended with a newline, the split(..., -1) ensures the last element
        // of originalLines is an empty string. The loop above appends (originalLines.length - 1) newlines.
        // This reconstruction should be faithful to the original line count and trailing newline presence.
        return resultBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("Usage: java SimpleLang <path_to_cpy_file>");
            return;
        }

        String filePath = args[0];
        String cpyFileContent;
        try {
            cpyFileContent = Files.readString(Path.of(filePath));
        } catch (IOException e) {
            System.err.println("Error reading file: " + filePath + " - " + e.getMessage());
            return;
        }

        // Step 1: Remove comments from the CPY code
        String cpyWithoutComments = removeComments(cpyFileContent);

        // Step 2: Convert the comment-free CPY code to C-style syntax
        String preprocessedCode = convertCPY(cpyWithoutComments);

        // Optional: For debugging the intermediate steps
        // System.out.println("--- CPY Code Without Comments ---");
        // System.out.println(cpyWithoutComments);
        // System.out.println("------------------------------");

//        System.out.println("--- Converted C-style Code ---");
//        System.out.println(preprocessedCode); // This should now be comment-free
//        System.out.println("------------------------------");

        CharStream reader = CharStreams.fromString(preprocessedCode);
        SimpleLangLexer lexer = new SimpleLangLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleLangParser parser = new SimpleLangParser(tokens);
        Program program = parser.program().programRet;

        TestVisitor my_visitor = new TestVisitor();
        my_visitor.visit(program);
    }

    private static int countLeadingSpaces(String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    private static String getCOutputIndentationString(int indentLevel) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.max(0, indentLevel); i++) {
            sb.append(' ');
        }
        return sb.toString();
    }

    public static String convertCPY(String input) {
        Stack<Integer> indentStack = new Stack<>();
        indentStack.push(0);
        StringBuilder output = new StringBuilder();
        String[] lines = input.split("\r\n|\r|\n", -1);
        boolean lastAppendedBrace = false;
        int indentOfLastAppendedBrace = -1;

        for (int idx = 0; idx < lines.length; idx++) {
            String line = lines[idx];
            // After comment removal, a line might be all whitespace. Trim it to check if it's effectively empty.
            String trimmedLine = line.trim();
            int currentLineActualIndent = countLeadingSpaces(line);

            if (trimmedLine.isEmpty()) {
                if (lastAppendedBrace) {
                    output.append("\n");
                    lastAppendedBrace = false;
                    indentOfLastAppendedBrace = -1;
                } else {
                    if (output.length() > 0 && output.charAt(output.length() -1) != '\n') {
                        output.append("\n");
                    } else if (output.length() > 0 || idx < lines.length - 1) {
                        output.append("\n");
                    }
                }
                continue;
            }

            // Handle dedents first
            while (indentStack.size() > 1 && currentLineActualIndent < indentStack.peek()) {
                int expectedContentLevel = indentStack.pop();
                int braceActualIndent = expectedContentLevel - SPACES_PER_INDENT;
                if (lastAppendedBrace) {
                    output.append("}");
                } else {
                    output.append(getCOutputIndentationString(braceActualIndent)).append("}");
                }
                lastAppendedBrace = true;
                indentOfLastAppendedBrace = braceActualIndent;
            }

            if (trimmedLine.equals("end")) {
                if (indentStack.size() > 1) {
                    int expectedContentLevel = indentStack.pop();
                    int braceActualIndent = expectedContentLevel - SPACES_PER_INDENT;
                    if (lastAppendedBrace) {
                        output.append("}");
                    } else {
                        output.append(getCOutputIndentationString(braceActualIndent)).append("}");
                    }
                    lastAppendedBrace = true;
                    indentOfLastAppendedBrace = braceActualIndent;
                } else {
                    if (lastAppendedBrace) {
                        output.append("\n");
                        lastAppendedBrace = false;
                        indentOfLastAppendedBrace = -1;
                    }
                }
                continue;
            }

            String prefixBeforeLineContent;
            boolean opensBlockFromCPY = trimmedLine.endsWith(":");

            if (lastAppendedBrace) {
                boolean canAttach = (currentLineActualIndent == indentOfLastAppendedBrace && indentOfLastAppendedBrace != -1);

                if (canAttach) {
                    prefixBeforeLineContent = "";
                } else {
                    prefixBeforeLineContent = "\n" + getCOutputIndentationString(currentLineActualIndent);
                }
                lastAppendedBrace = false;
                indentOfLastAppendedBrace = -1;
            } else {
                prefixBeforeLineContent = getCOutputIndentationString(currentLineActualIndent);
            }
            output.append(prefixBeforeLineContent);

            if (opensBlockFromCPY) {
                output.append(trimmedLine.substring(0, trimmedLine.length() - 1)).append(" {\n");
                indentStack.push(currentLineActualIndent + SPACES_PER_INDENT);
            } else { // Statement
                output.append(trimmedLine);
                // Comments should have been removed before this stage.
                // The check for # and // here is a safeguard but ideally not needed if removeComments works.
                if (!trimmedLine.endsWith(";") && !trimmedLine.endsWith("}") &&
                        !trimmedLine.startsWith("#") && !trimmedLine.startsWith("//")) {
                    output.append(";");
                }
                output.append("\n");
            }
        }

        // Close any remaining open blocks at the end of the file
        while (indentStack.size() > 1) {
            int expectedContentLevel = indentStack.pop();
            int braceActualIndent = expectedContentLevel - SPACES_PER_INDENT;
            if (lastAppendedBrace) {
                output.append("}");
            } else {
                output.append(getCOutputIndentationString(braceActualIndent)).append("}");
            }
            lastAppendedBrace = true;
            // indentOfLastAppendedBrace = braceActualIndent; // Not strictly needed here for next line logic
        }
        if (lastAppendedBrace) {
            output.append("\n");
        }

        // Ensure the final output (if not empty) ends with exactly one newline.
        String resultString = output.toString();
        // Trim all trailing newlines first
        while (resultString.endsWith("\n") || resultString.endsWith("\r")) {
            resultString = resultString.substring(0, resultString.length() -1);
        }
        // Add back one newline if there's content
        if (!resultString.isEmpty()) {
            resultString += "\n";
        }


        return resultString;
    }

    private static String trimTrailingWhitespace(String str) {
        if (str == null) return null;
        int len = str.length();
        while (len > 0 && Character.isWhitespace(str.charAt(len - 1))) len--;
        return str.substring(0, len);
    }
}
