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
//public class SimpleLang {
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
//    }
//}

import main.ast.nodes.program.Program;
import main.grammar.SimpleLangLexer;
import main.grammar.SimpleLangParser;
import main.visitor.TestVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Stack;


public class SimpleLangTXT {
    public static void main(String[] args) throws IOException {
        String preprocessedCode = preprocessCPY(args[0]);

        CharStream reader = CharStreams.fromString(preprocessedCode);
        SimpleLangLexer simpleLangLexer = new SimpleLangLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(simpleLangLexer);
        SimpleLangParser flParser = new SimpleLangParser(tokens);
        Program program = flParser.program().programRet;

        TestVisitor my_visitor = new TestVisitor();
        my_visitor.visit(program);
    }

    private static String preprocessCPY(String filePath) throws IOException {
        StringBuilder result = new StringBuilder();
        BufferedReader reader = Files.newBufferedReader(Path.of(filePath));

        Stack<Integer> indentStack = new Stack<>();
        indentStack.push(0);

        String line;
        while ((line = reader.readLine()) != null) {
            int currentIndent = countLeadingTabs(line);
            String trimmed = line.trim();

            // Handle dedents
            while (currentIndent < indentStack.peek()) {
                indentStack.pop();
                result.append("}\n");
            }

            // Handle indents (block start)
            if (currentIndent > indentStack.peek()) {
                indentStack.push(currentIndent);
                result.append("{\n");
            }

            if (trimmed.equals("end")) {
                result.append("}\n");
                indentStack.pop();
            } else if (!trimmed.isEmpty()) {
                result.append(trimmed);
                // Add semicolon if it looks like a statement
                if (!trimmed.endsWith("{") && !trimmed.endsWith("}") && !trimmed.endsWith(";")) {
                    result.append(";");
                }
                result.append("\n");
            }
        }

        // Close any remaining open blocks
        while (indentStack.size() > 1) {
            result.append("}\n");
            indentStack.pop();
        }

        return result.toString();
    }

    private static int countLeadingTabs(String line) {
        int count = 0;
        for (char c : line.toCharArray()) {
            if (c == '\t') count++;
            else break;
        }
        return count;
    }
}
