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

public class SimpleLangCopy_2 {

    // Define spaces per indent based on your CPY code's convention
    // If your example uses 3 spaces, change this to 3. The image shows 3 spaces.
    private static final int SPACES_PER_INDENT = 3;

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

        // 1. Convert CPY to C-style syntax
        String preprocessedCode = convertCPY(cpyFileContent);

        // Print the converted code
        System.out.println("--- Converted C-style Code ---");
        System.out.println(preprocessedCode);
        System.out.println("------------------------------");

        // 2. Lex and parse
        CharStream reader = CharStreams.fromString(preprocessedCode);
        SimpleLangLexer lexer = new SimpleLangLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleLangParser parser = new SimpleLangParser(tokens);
        Program program = parser.program().programRet; // Assuming programRet is correctly set by your grammar

        // 3. Visit the AST
        TestVisitor my_visitor = new TestVisitor();
        my_visitor.visit(program);
    }

    private static String convertCPY(String input) {
        Stack<Integer> indentStack = new Stack<>();
        indentStack.push(0); // Initial indent level for the file
        StringBuilder output = new StringBuilder();
        String[] lines = input.split("\r\n|\r|\n"); // Handle different line endings

        for (int idx = 0; idx < lines.length; idx++) {
            String line = lines[idx]; // Keep leading spaces for now to count them
            String trimmedLine = line.trim();

            if (trimmedLine.isEmpty()) {
                // Preserve empty lines if desired, or skip. For C, usually skip.
                output.append("\n"); // Add a newline to maintain spacing
                continue;
            }

            int currentLineIndent = countLeadingSpaces(line);

            // Handle dedents first
            // Pop from stack and add '}' until current indent matches top of stack
            while (currentLineIndent < indentStack.peek() && indentStack.size() > 1) {
                indentStack.pop();
                output.append("}\n");
            }

            // Special handling for 'end' keyword (explicit block closer)
            if (trimmedLine.equals("end")) {
                if (indentStack.size() > 1) {
                    indentStack.pop();
                    output.append("}\n");
                }
                continue; // Processed 'end', move to next line
            }

            // Check if the line opens a new block (ends with ':' or is 'else')
            boolean opensBlock = trimmedLine.endsWith(":");
            if (opensBlock) {
                // Remove the colon and append ' {'
                output.append(trimmedLine.substring(0, trimmedLine.length() - 1)).append(" {\n");
                // Push the new expected indent level for the next line inside this block
                indentStack.push(currentLineIndent + SPACES_PER_INDENT);
            } else {
                // This is a regular statement or a line not opening a block
                output.append(trimmedLine);
                // Add semicolon if it's a statement, not a comment, and not already ending with } or ;
                // Also, exclude lines that might be the start of a multi-line comment or preprocessor directives
                if (!trimmedLine.endsWith(";") && !trimmedLine.endsWith("}") &&
                        !trimmedLine.startsWith("//") && !trimmedLine.startsWith("/*") &&
                        !trimmedLine.startsWith("#")) { // Basic check for preprocessor
                    output.append(";");
                }
                output.append("\n");
            }
        }

        // Close any remaining open blocks at the end of the file
        while (indentStack.size() > 1) {
            output.append("}\n");
            indentStack.pop();
        }

        return output.toString();
    }

    /**
     * Counts leading space characters to determine indentation level.
     * @param line The string line to check.
     * @return The number of leading spaces.
     */
    private static int countLeadingSpaces(String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                count++;
            } else if (line.charAt(i) == '\t') {
                // If tabs are used, define how many spaces a tab counts for.
                // For this input, it seems to be spaces.
                count += SPACES_PER_INDENT;
            } else {
                break; // Stop counting as soon as a non-whitespace character is found
            }
        }
        return count;
    }

    // The trimTrailingWhitespace method is not strictly necessary with this approach,
    // as we use .trim() on the line content that's being appended.
    // However, it's harmless to keep if you prefer.
    private static String trimTrailingWhitespace(String str) {
        if (str == null) return null;
        int len = str.length();
        while (len > 0 && Character.isWhitespace(str.charAt(len - 1))) len--;
        return str.substring(0, len);
    }
}
//import main.ast.nodes.program.Program;
//import main.grammar.SimpleLangLexer;
//import main.grammar.SimpleLangParser;
//import main.visitor.TestVisitor;
//import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.List; // Added for Files.readAllLines if you switch back from Files.readString
//import java.util.Stack;
//
//public class SimpleLang {
//
//    private static final int SPACES_PER_INDENT = 4; // Standard 4 spaces for indentation
//
//    public static void main(String[] args) throws IOException {
//        if (args.length == 0) {
////            System.err.println("Error: No input file specified.");
//            // Assuming SimpleLang is in package main for the usage instruction
////            System.err.println("Usage: java main.SimpleLang <path_to_cpy_file>");
//            return;
//        }
//        String filePath = args[0];
//
//        // 1. Read the entire .cpy file content into a single string
//        String cpyFileContent;
//        try {
//            cpyFileContent = Files.readString(Path.of(filePath));
//        } catch (IOException e) {
////            System.err.println("Error reading file '" + filePath + "': " + e.getMessage());
//            return;
//        }
//
//        // 2. Convert the CPY code using static helper methods
//        String preprocessedCode = convertCPY(cpyFileContent);
//
//        // Optional: For debugging the preprocessor's output:
//        // System.out.println("--- Preprocessed C-like Code ---");
//        // System.out.println(preprocessedCode);
//        // System.out.println("--------------------------------");
//
//        // 3. Create a CharStream from the in-memory preprocessed C-like code
//        CharStream reader = CharStreams.fromString(preprocessedCode);
//
//        // 4. Lex and parse the preprocessed C-like code
//        SimpleLangLexer simpleLangLexer = new SimpleLangLexer(reader);
//        CommonTokenStream tokens = new CommonTokenStream(simpleLangLexer);
//        SimpleLangParser parser = new SimpleLangParser(tokens); // Use your ANTLR parser
//        Program program = parser.program().programRet; // Ensure 'program()' is your start rule and '.programRet' is how you get your AST root
//
//        // 5. Visit the Abstract Syntax Tree
//        TestVisitor my_visitor = new TestVisitor();
//        my_visitor.visit(program);
//    }
//
//    /**
//     * Converts a CPY (Python-like indented) code string to a C-like string with braces and semicolons.
//     * @param input The CPY code as a single string.
//     * @return The converted C-like code as a string.
//     */
//    private static String convertCPY(String input) {
//        Stack<Integer> indentStack = new Stack<>();
//        indentStack.push(0); // Base indentation (0 spaces, global scope)
//        StringBuilder output = new StringBuilder();
//        String[] lines = input.split("\r\n|\r|\n"); // Handle various newline conventions
//
//        for (String line : lines) {
//            String trimmedLineWithOriginalIndentation = trimTrailingWhitespace(line);
//
//            // Skip truly empty lines after trimming all whitespace
//            if (trimmedLineWithOriginalIndentation.trim().isEmpty()) {
//                // output.append("\n"); // Optionally preserve blank lines in output
//                continue;
//            }
//
//            int currentIndentSpaces = countLeadingSpaces(trimmedLineWithOriginalIndentation);
//            String actualContent = trimmedLineWithOriginalIndentation.trim(); // Line content without any leading/trailing spaces
//
//            if (currentIndentSpaces % SPACES_PER_INDENT != 0 && !actualContent.isEmpty()) {
////                System.err.println("Warning: Line with irregular indentation (not a multiple of " + SPACES_PER_INDENT +
////                        " spaces): \"" + trimmedLineWithOriginalIndentation + "\"");
//            }
//
//            while (currentIndentSpaces < indentStack.peek() && indentStack.size() > 1) {
//                output.append("}\n");
//                indentStack.pop();
//            }
//
//            if (actualContent.equals("end")) {
//                if (indentStack.size() > 1) {
//                    indentStack.pop();
//                    output.append("}\n");
//                } else {
////                    System.err.println("Warning: 'end' keyword found at base indent level or with empty stack: \"" + line + "\"");
//                }
//                continue;
//            }
//
//            output.append(actualContent);
//
//            if (actualContent.endsWith(":")) {
//                output.setLength(output.length() - 1);
//                output.append(" {\n");
//                indentStack.push(currentIndentSpaces + SPACES_PER_INDENT);
//            } else {
//                if (!actualContent.startsWith("#") && !actualContent.endsWith(";") && !actualContent.endsWith("{") /*already handled*/ ) {
//                    output.append(";");
//                }
//                output.append("\n");
//            }
//        }
//
//        while (indentStack.size() > 1) {
//            output.append("}\n");
//            indentStack.pop();
//        }
//        return output.toString();
//    }
//
//    /**
//     * Counts leading space characters in a string.
//     * @param line The string to inspect.
//     * @return The number of leading spaces.
//     */
//    private static int countLeadingSpaces(String line) {
//        int count = 0;
//        for (int i = 0; i < line.length(); i++) {
//            if (line.charAt(i) == ' ') {
//                count++;
//            } else {
//                break;
//            }
//        }
//        return count;
//    }
//
//    /**
//     * Trims trailing whitespace characters from a string.
//     * @param str The string to trim.
//     * @return The string with trailing whitespace removed, or null if input is null.
//     */
//    private static String trimTrailingWhitespace(String str) {
//        if (str == null) {
//            return null;
//        }
//        int len = str.length();
//        while (len > 0 && Character.isWhitespace(str.charAt(len - 1))) {
//            len--;
//        }
//        return str.substring(0, len);
//    }
//}
// ///////////////// ///////////////// ///////////////// ///////////////// ///////////////
//import main.ast.nodes.program.Program;
//import main.grammar.SimpleLangLexer;
//import main.grammar.SimpleLangParser;
//import main.visitor.TestVisitor;
//import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//
//import java.io.IOException;
//
//public class SimpleLang{
//    public static void main(String[] args) throws IOException {
//        CharStream reader = CharStreams.fromFileName(args[0]);
//        SimpleLangLexer simpleLangLexer = new SimpleLangLexer(reader);
//        CommonTokenStream tokens = new CommonTokenStream(simpleLangLexer);
//        SimpleLangParser flParser = new SimpleLangParser(tokens);
//        Program program = flParser.program().programRet;
//        System.out.println();
//
//        TestVisitor my_visitor = new TestVisitor();
//        my_visitor.visit(program);
//        System.out.println();
//    }
//}
///// ///////////////////// ///////////////////// ///////////////////// //////////////////
//import main.ast.nodes.program.Program;
//import main.grammar.SimpleLangLexer;
//import main.grammar.SimpleLangParser;
//import main.visitor.TestVisitor;
//import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//
//import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.Stack;
//
//import main.ast.nodes.program.Program;
//import main.grammar.SimpleLangLexer;
//import main.grammar.SimpleLangParser;
//import main.visitor.TestVisitor;
//import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//
//import java.io.IOException;
//
//
//public class SimpleLang {
//    public static void main(String[] args) throws IOException {
//        String preprocessedCode = preprocessCPY(args[0]);
//
//        CharStream reader = CharStreams.fromString(preprocessedCode);
//        SimpleLangLexer simpleLangLexer = new SimpleLangLexer(reader);
//        CommonTokenStream tokens = new CommonTokenStream(simpleLangLexer);
//        SimpleLangParser flParser = new SimpleLangParser(tokens);
//        Program program = flParser.program().programRet;
//
//        TestVisitor my_visitor = new TestVisitor();
//        my_visitor.visit(program);
//    }
//
//    private static String preprocessCPY(String filePath) throws IOException {
//        StringBuilder result = new StringBuilder();
//        BufferedReader reader = Files.newBufferedReader(Path.of(filePath));
//
//        Stack<Integer> indentStack = new Stack<>();
//        indentStack.push(0);
//
//        String line;
//        while ((line = reader.readLine()) != null) {
//            int currentIndent = countLeadingTabs(line);
//            String trimmed = line.trim();
//
//            // Handle dedents
//            while (currentIndent < indentStack.peek()) {
//                indentStack.pop();
//                result.append("}\n");
//            }
//
//            // Handle indents (block start)
//            if (currentIndent > indentStack.peek()) {
//                indentStack.push(currentIndent);
//                result.append("{\n");
//            }
//
//            if (trimmed.equals("end")) {
//                result.append("}\n");
//                indentStack.pop();
//            } else if (!trimmed.isEmpty()) {
//                result.append(trimmed);
//                // Add semicolon if it looks like a statement
//                if (!trimmed.endsWith("{") && !trimmed.endsWith("}") && !trimmed.endsWith(";")) {
//                    result.append(";");
//                }
//                result.append("\n");
//            }
//        }
//
//        // Close any remaining open blocks
//        while (indentStack.size() > 1) {
//            result.append("}\n");
//            indentStack.pop();
//        }
//
//        return result.toString();
//    }
//
//    private static int countLeadingTabs(String line) {
//        int count = 0;
//        for (char c : line.toCharArray()) {
//            if (c == '\t') count++;
//            else break;
//        }
//        return count;
//    }
//}
/// ///////////////////// ///////////////////// ///////////////////// ///////////////////// ///////////////////// //////////////////
//import main.ast.nodes.program.Program;
//import main.grammar.SimpleLangLexer;
//import main.grammar.SimpleLangParser;
//import main.visitor.TestVisitor;
//import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.Stack;
//
//public class SimpleLang {
//    public static void main(String[] args) throws IOException {
//        if (args.length == 0) {
//            System.err.println("Usage: java SimpleLang <path_to_cpy_file>");
//            return;
//        }
//
//        // Read the CPY-style code from the input file
//        String cpyCode = Files.readString(Path.of(args[0]));
//
//        // Preprocess the CPY code to transform it into C-like syntax
//        String preprocessedCode = preprocessCPY(cpyCode);
//
//        // Create a CharStream directly from the in-memory preprocessed code
//        CharStream reader = CharStreams.fromString(preprocessedCode);
//
//        // Lex and parse the preprocessed C-like code
//        SimpleLangLexer simpleLangLexer = new SimpleLangLexer(reader);
//        CommonTokenStream tokens = new CommonTokenStream(simpleLangLexer);
//        SimpleLangParser flParser = new SimpleLangParser(tokens);
//        Program program = flParser.program().programRet;
//
//        // You can optionally print the preprocessed code for debugging:
//        // System.out.println("--- Preprocessed C-like Code ---");
//        // System.out.println(preprocessedCode);
//        // System.out.println("--------------------------------");
//
//        // Visit the Abstract Syntax Tree
//        TestVisitor my_visitor = new TestVisitor();
//        my_visitor.visit(program);
//    }
//
//    /**
//     * Preprocesses CPY-style code string into C-like syntax.
//     * This method now takes a String directly instead of a file path.
//     * @param cpyCode The CPY-style code as a String.
//     * @return The transformed C-like code as a String.
//     * @throws IOException If there's an issue reading the input (though less likely with String input).
//     */
//    private static String preprocessCPY(String cpyCode) throws IOException {
//        StringBuilder result = new StringBuilder();
//        // Use StringReader to treat the input String as if it were a file stream
//        BufferedReader reader = new BufferedReader(new java.io.StringReader(cpyCode));
//
//        Stack<Integer> indentStack = new Stack<>();
//        indentStack.push(0); // Initialize with a base indent of 0
//
//        String line;
//        while ((line = reader.readLine()) != null) {
//            int currentIndent = countLeadingTabs(line);
//            String trimmed = line.trim();
//
//            // Handle dedents: pop from stack and add closing braces
//            while (currentIndent < indentStack.peek()) {
//                indentStack.pop();
//                result.append("}\n");
//            }
//
//            // Handle indents (block start): push to stack and add opening brace
//            if (currentIndent > indentStack.peek()) {
//                indentStack.push(currentIndent);
//                result.append("{\n");
//            }
//
//            // Specific handling for 'end' keyword (CPY's block end)
//            if (trimmed.equals("end")) {
//                result.append("}\n");
//                indentStack.pop(); // Pop corresponding indent
//            } else if (!trimmed.isEmpty()) { // Process non-empty lines
//                result.append(trimmed);
//                // Add semicolon if it looks like a statement and doesn't already have one
//                if (!trimmed.endsWith("{") && !trimmed.endsWith("}") && !trimmed.endsWith(";") && !trimmed.startsWith("//") && !trimmed.startsWith("/*")) {
//                    result.append(";");
//                }
//                result.append("\n");
//            }
//        }
//
//        // Close any remaining open blocks at the end of the file
//        while (indentStack.size() > 1) {
//            result.append("}\n");
//            indentStack.pop();
//        }
//
//        return result.toString();
//    }
//
//    /**
//     * Counts leading tab characters to determine indentation level.
//     * @param line The string line to check.
//     * @return The number of leading tabs.
//     */
//    private static int countLeadingTabs(String line) {
//        int count = 0;
//        for (char c : line.toCharArray()) {
//            if (c == '\t') {
//                count++;
//            } else {
//                break; // Stop counting as soon as a non-tab character is found
//            }
//        }
//        return count;
//    }
//}