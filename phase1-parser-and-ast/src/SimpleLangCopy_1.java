import main.ast.nodes.program.Program;
import main.grammar.SimpleLangLexer;
import main.grammar.SimpleLangParser;
import main.visitor.TestVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class SimpleLangCopy_1 {
    public static void main(String[] args) throws IOException {
        CharStream reader = CharStreams.fromFileName(args[0]);
        SimpleLangLexer simpleLangLexer = new SimpleLangLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(simpleLangLexer);
        SimpleLangParser flParser = new SimpleLangParser(tokens);
        Program program = flParser.program().programRet;
        System.out.println();

        TestVisitor my_visitor = new TestVisitor();
        my_visitor.visit(program);
        System.out.println();
    }
}
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