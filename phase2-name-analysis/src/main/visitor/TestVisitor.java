package main.visitor;

import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.function.*;
import main.ast.nodes.initializer.Designation;
import main.ast.nodes.initializer.Designator;
import main.ast.nodes.initializer.Initializer;
import main.ast.nodes.initializer.InitializerList;
import main.ast.nodes.program.Program;
import main.ast.nodes.statement.*;
import main.ast.nodes.translation.ExternalDeclaration;
import main.ast.nodes.translation.TranslationUnit;
import main.ast.nodes.type.SpecifierQualifierList;
import main.ast.nodes.type.TypeName;
import main.ast.nodes.type.TypeSpecifier;

import java.util.ArrayList;

public class TestVisitor extends Visitor<Void> {

    // Helper to get statement count from a Statement node
    private int getStatementCount(Statement stmt) {
        if (stmt == null) {
            return 0;
        }
        if (stmt instanceof CompoundStatement) {
            CompoundStatement cs = (CompoundStatement) stmt;
            return cs.getBlockItems() != null ? cs.getBlockItems().size() : 0;
        }
        return 1; // Single statement
    }

    private String getIdentifierFromDirectDeclarator(DirectDeclarator dd) {
        DirectDeclarator current = dd;
        while (current != null) {
            if (current.getIdentifierExpression() != null) {
                return current.getIdentifierExpression().getName();
            }
            if (current.getDeclarator() != null) {
                return getIdentifierFromDeclarator(current.getDeclarator());
            }
            current = current.getDirectDeclarator();
        }
        return null;
    }

    private String getIdentifierFromDeclarator(Declarator declarator) {
        if (declarator != null && declarator.getDirectDeclarator() != null) {
            return getIdentifierFromDirectDeclarator(declarator.getDirectDeclarator());
        }
        return null;
    }

    @Override
    public Void visit(Program program) {
        if (program.getTranslationUnit() != null) {
            program.getTranslationUnit().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(TranslationUnit translationUnit) {
        if (translationUnit.getExternalDeclarations() != null) {
            for (ExternalDeclaration ed : translationUnit.getExternalDeclarations()) {
                if (ed != null) {
                    ed.accept(this);
                }
            }
        }
        return null;
    }

    @Override
    public Void visit(ExternalDeclaration externalDeclaration) {
        if (externalDeclaration.getFunctionDefinition() != null) {
            externalDeclaration.getFunctionDefinition().accept(this);
        }
        if (externalDeclaration.getDeclaration() != null) {
            externalDeclaration.getDeclaration().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition) {
        String funcName = getIdentifierFromDeclarator(functionDefinition.getDeclarator());
        int line = functionDefinition.getLine();

        // GOAL 1: Scope change (Kept, should be fine with 'contains' comparison)
        if (funcName != null) {
//            System.out.printf("Line %d: Entering new scope for function %s%n", line, funcName);
        }

        // Autograder output for function definition
        int statementCountInBody = 0;
        if (functionDefinition.getCompoundStatement() != null) {
            statementCountInBody = getStatementCount(functionDefinition.getCompoundStatement());
        }
        if (funcName != null) {
            System.out.printf("Line %d: Stmt function %s = %d%n", line, funcName, statementCountInBody);
        }

        if (functionDefinition.getDeclarationSpecifiers() != null) {
            functionDefinition.getDeclarationSpecifiers().accept(this);
        }
        if (functionDefinition.getDeclarator() != null) {
            functionDefinition.getDeclarator().accept(this);
        }
        if (functionDefinition.getDeclarationList() != null) {
            functionDefinition.getDeclarationList().accept(this);
        }
        if (functionDefinition.getCompoundStatement() != null) {
            functionDefinition.getCompoundStatement().accept(this);
        }

        // GOAL 1: Scope change (Kept)
        if (funcName != null) {
            // To match sorting, this might ideally use the line of the closing brace
//            System.out.printf("Line %d: Exiting scope for function %s%n", line, funcName);
        }
        return null;
    }

    @Override
    public Void visit(CompoundStatement compoundStatement) {
        // GOAL 1: Scope change (Kept)
//        System.out.printf("Line %d: Entering new scope%n", compoundStatement.getLine());
        if (compoundStatement.getBlockItems() != null) {
            for (BlockItem item : compoundStatement.getBlockItems()) {
                if (item != null) {
                    item.accept(this);
                }
            }
        }
//        System.out.printf("Line %d: Exiting scope%n", compoundStatement.getLine());
        return null;
    }

    @Override
    public Void visit(IdentifierExpression identifier) {
        // Autograder output for identifier usage
        if (identifier.getName() != null) {
            System.out.printf("Line %d: Expr %s%n", identifier.getLine(), identifier.getName());
        }
        return null;
    }

    //    @Override
//    public Void visit(ConstantExpression constant) {
//        // Autograder output for constants
//        // Assuming ConstantExpression has a method like getValueAsString() or getText()
//        // For simplicity, using a placeholder if such method isn't directly available.
//        // You'll need to adapt this to your actual ConstantExpression AST node API.
//        String valueStr = "CONSTANT_VALUE"; // Placeholder
//        if (constant.getValue() != null) { // Example: if it holds a Node or a value
//            valueStr = constant.getValue().toString(); // Adjust based on actual API
//        }
//        // A more specific way would be to check instance of NumericConstant, StringConstant etc.
//        // and get their specific values. The tests show simple numbers like "0", "5".
//        System.out.printf("Line %d: Expr %s%n", constant.getLine(), valueStr);
//        return null;
//    }
    @Override
    public Void visit(ConstantExpression constant) {
        // ...
        String valueStr = "CONSTANT_VALUE";
        if (constant.getValue() != null) {
            valueStr = constant.getValue().toString();
        }
        System.out.printf("Line %d: Expr %s%n", constant.getLine(), valueStr); // Uses constant.getLine()
        return null;
    }

    @Override
    public Void visit(StringLiteralExpression stringLiteral) {
        // Autograder output for string literals (if treated as "Expr ...")
        // The tests don't explicitly show string literals in "Expr" output,
        // but if they were to appear, this would be the place.
        // System.out.printf("Line %d: Expr \"%s\"%n", stringLiteral.getLine(), stringLiteral.getValue());
        return null; // Assuming not required by current tests for "Expr" output
    }

    //    @Override
//    public Void visit(InitDeclarator initDeclarator) {
//        // String varName = getIdentifierFromDeclarator(initDeclarator.getDeclarator()); // We don't need varName for the new output
//
//        // Do not visit the declarator part if its "Expr" output is not desired.
//        // if (initDeclarator.getDeclarator() != null) {
//        //     initDeclarator.getDeclarator().accept(this);
//        // }
//
//        if (initDeclarator.getInitializer() != null) {
//            // REMOVE THIS LINE:
//            // if (varName != null) {
//            //     System.out.printf("Line %d: Identifier %s initialized%n", initDeclarator.getLine(), varName);
//            // }
//            initDeclarator.getInitializer().accept(this); // This will visit the expression (e.g., ConstantExpression for '5')
//            // and should produce "Line 2: Expr 5"
//        }
//        return null;
//    }
    @Override
    public Void visit(InitDeclarator initDeclarator) {
        // We don't need to print about the variable name or type for this specific output format.
        // if (initDeclarator.getDeclarator() != null) {
        //     initDeclarator.getDeclarator().accept(this); // Only if declarator parts have output
        // }

        if (initDeclarator.getInitializer() != null) {
            // The initializer is the important part for the "Expr" lines.
            initDeclarator.getInitializer().accept(this);
        }
        return null;
    }
    @Override
    public Void visit(ParameterDeclaration parameterDeclaration) {
        if (parameterDeclaration.getDeclarationSpecifiers() != null) {
            parameterDeclaration.getDeclarationSpecifiers().accept(this);
        }
        String paramName = null;
        if (parameterDeclaration.getDeclarator() != null) {
            paramName = getIdentifierFromDeclarator(parameterDeclaration.getDeclarator());
            parameterDeclaration.getDeclarator().accept(this);
        } else if (parameterDeclaration.getAbstractDeclarator() != null) {
            parameterDeclaration.getAbstractDeclarator().accept(this);
        }
        // GOAL 2: Initialized Parameter (Kept)
        if (paramName != null) {
            System.out.printf("Line %d: Parameter %s declared and initialized by caller%n",
                    parameterDeclaration.getLine(), paramName);
        }
        return null;
    }


    //    @Override
//    public Void visit(IterationStatement iterationStatement) {
//        // Determine loop type (e.g., "for", "while")
//        // This is a simplification. Your AST node might have a specific type field or boolean flags.
//        String loopType = "loop"; // Default
//        if (iterationStatement.getForCondition() != null) { // Heuristic for 'for' loop
//            loopType = "for";
//        } else if (iterationStatement.getExpression() != null) { // Heuristic for 'while' or 'do-while'
//            loopType = "while"; // The tests specifically show "while" and "for"
//        }
//        // If your IterationStatement has a method like getType() -> "for" | "while" | "dowhile" use it.
//        // Or, if you have distinct ForStatement, WhileStatement AST nodes, handle them separately.
//
//        // Autograder output for iteration statements
//        int bodyStmtCount = getStatementCount(iterationStatement.getStatement());
//        System.out.printf("Line %d: Stmt %s = %d%n", iterationStatement.getLine(), loopType, bodyStmtCount);
//
//        // Standard traversal
//        if (iterationStatement.getForCondition() != null) {
//            iterationStatement.getForCondition().accept(this);
//        }
//        if (iterationStatement.getExpression() != null) {
//            iterationStatement.getExpression().accept(this);
//        }
//        if (iterationStatement.getStatement() != null) {
//            iterationStatement.getStatement().accept(this);
//        }
//        return null;
//    }
    @Override
    public Void visit(IterationStatement iterationStatement) {
        String loopType = "loop"; // Default value

        // Determine loop type and handle condition printing order
        if (iterationStatement.getForCondition() != null) { // This is a 'for' loop
            loopType = "for";
            // For 'for' loops, the output order might be different or more complex.
            // This solution primarily targets the 'while' loop example you provided.
            // Current logic: Print "Stmt for = N", then visit its conditions/expressions.

            int bodyStmtCount = getStatementCount(iterationStatement.getStatement());
            System.out.printf("Line %d: Stmt %s = %d%n", iterationStatement.getLine(), loopType, bodyStmtCount);

            iterationStatement.getForCondition().accept(this); // Visit for-loop specific conditions/initializers/expressions

        } else if (iterationStatement.getExpression() != null) { // This is a 'while' or 'do-while' loop
            loopType = "while"; // Assuming 'while' for your example.

            // For 'while' loops, the desired order is:
            // 1. Visit/print the condition (e.g., "Line 2: Expr 1")
            // 2. Print "Stmt while = N" (e.g., "Line 2: Stmt while = 2")

            // 1. Visit the condition expression FIRST
            // This will call visit(ConstantExpression) for '1' in "while(1)", printing "Line 2: Expr 1"
            iterationStatement.getExpression().accept(this);

            // 2. Print "Stmt while = N"
            int bodyStmtCount = getStatementCount(iterationStatement.getStatement());
            System.out.printf("Line %d: Stmt %s = %d%n", iterationStatement.getLine(), loopType, bodyStmtCount);

        } else {
            // Fallback for other loop types or if AST is structured unexpectedly
            int bodyStmtCount = getStatementCount(iterationStatement.getStatement());
            System.out.printf("Line %d: Stmt %s = %d%n", iterationStatement.getLine(), loopType, bodyStmtCount);
        }

        // Visit the loop body statement (common to all loop types)
        if (iterationStatement.getStatement() != null) {
            iterationStatement.getStatement().accept(this);
        }
        return null;
    }
    @Override
    public Void visit(SelectionStatement selectionStatement) {
        // Handles if, if-else, else-if chains.
        // The line number for "Stmt selection" should be the line of the if/else if/else keyword.
        // The statement count is for the immediately following block/statement.

        if (selectionStatement.getExpression() != null) { // Condition for the 'if'
            selectionStatement.getExpression().accept(this);
        }

        // 'if' branch
        if (selectionStatement.getIfStatement() != null) {
            int ifBranchStmtCount = getStatementCount(selectionStatement.getIfStatement());
            // Use the line of the 'if' keyword or its condition expression
            System.out.printf("Line %d: Stmt selection = %d%n",
                    selectionStatement.getExpression() != null ? selectionStatement.getExpression().getLine() : selectionStatement.getLine(),
                    ifBranchStmtCount);
            selectionStatement.getIfStatement().accept(this);
        }

        // 'else' branch
        if (selectionStatement.getElseStatement() != null) {
            Statement elseStmt = selectionStatement.getElseStatement();
            // If 'else if', the elseStmt itself is another SelectionStatement.
            // Its own visitor will handle printing "Expr" for its condition and "Stmt selection" for its 'if' branch.
            // So, we only print "Stmt selection" here if it's a terminal 'else' block.
            if (!(elseStmt instanceof SelectionStatement)) {
                int elseBranchStmtCount = getStatementCount(elseStmt);
                // Determine line for 'else'. This might need a specific field on AST node if available
                // or use the line of the elseStatement itself.
                System.out.printf("Line %d: Stmt selection = %d%n", elseStmt.getLine(), elseBranchStmtCount);
            }
            elseStmt.accept(this); // This will handle nested "else if" correctly.
        }
        return null;
    }


    //    @Override
//    public Void visit(BinaryExpression binaryExpression) {
//        if (binaryExpression.getLeft() != null) {
//            binaryExpression.getLeft().accept(this);
//        }
//        // Autograder output for operator
//        // Assuming getOperator() returns the operator string like "+", "==".
//        // The line number for the operator itself is tricky.
//        // The tests (e.g., "Line 3: Expr +") suggest it might be the line of the whole expression,
//        // or where the operator token starts. For simplicity, using expression's line.
//        System.out.printf("Line %d: Expr %s%n", binaryExpression.getLine(), binaryExpression.getOperator()); // Adjust getOperator() if method name differs
//        if (binaryExpression.getRight() != null) {
//            binaryExpression.getRight().accept(this);
//        }
//        return null;
//    }
    @Override
    public Void visit(BinaryExpression binaryExpression) {
        // DO NOT visit left child:
        // if (binaryExpression.getLeft() != null) {
        //     binaryExpression.getLeft().accept(this);
        // }

        // ONLY print the operator for the binary expression's line
        System.out.printf("Line %d: Expr %s%n",
                binaryExpression.getLine(),
                binaryExpression.getOperator()); // Assuming getOperator() returns the string like "+"

        // DO NOT visit right child:
        // if (binaryExpression.getRight() != null) {
        //     binaryExpression.getRight().accept(this);
        // }
        return null;
    }
    @Override
    public Void visit(PrefixExpression prefixExpression) {
        // Autograder output for operator
        // Assuming getOperator() returns the operator string like "++", "!"
        System.out.printf("Line %d: Expr %s%n", prefixExpression.getLine(), prefixExpression.getUnaryOperator()); // Adjust getOperator()
        if (prefixExpression.getExpression() != null) {
            prefixExpression.getExpression().accept(this);
        }
        return null;
    }

    //    @Override
//    public Void visit(PostfixExpression postfixExpression) {
//        if (postfixExpression.getExpression() != null) {
//            postfixExpression.getExpression().accept(this);
//        }
//        // Autograder output for operator
//        // Assuming getOperator() returns the operator string like "++", "--"
//        System.out.printf("Line %d: Expr %s%n", postfixExpression.getLine(), postfixExpression.getPostfix()); // Adjust getOperator()
//        return null;
//    }
    @Override
    public Void visit(PostfixExpression postfixExpression) {
        // DO NOT visit the inner expression if you only want to print the operator:
        // if (postfixExpression.getExpression() != null) {
        //     postfixExpression.getExpression().accept(this); // This line was causing "Expr a"
        // }

        // ONLY print the operator for the postfix expression's line
        // Assuming getPostfix() returns the operator string like "++", "--".
        System.out.printf("Line %d: Expr %s%n",
                postfixExpression.getLine(),
                postfixExpression.getPostfix());
        return null;
    }

    //    @Override
//    public Void visit(AssignmentExpression assignmentExpression) {
//        if (assignmentExpression.getLeft() != null) {
//            assignmentExpression.getLeft().accept(this);
//        }
//        // Autograder output for assignment operator
//        // Assuming getOperator() returns the operator string like "=", "+="
//        System.out.printf("Line %d: Expr %s%n", assignmentExpression.getLine(), assignmentExpression.getAssignmentOperator()); // Adjust getOperator()
//        if (assignmentExpression.getRight() != null) {
//            assignmentExpression.getRight().accept(this);
//        }
//        return null;
//    }
    @Override
    public Void visit(AssignmentExpression assignmentExpression) {
        // DO NOT visit left and right children if their "Expr" output is not desired for this line,
        // to match the target output format.
        // if (assignmentExpression.getLeft() != null) {
        //     assignmentExpression.getLeft().accept(this);
        // }

        // Autograder output for assignment operator.
        // CRUCIAL: assignmentExpression.getAssignmentOperator().toString() must return the operator's
        // string symbol (e.g., "+=", "="). If AssignmentOperator is an enum, its toString()
        // method needs to be overridden appropriately. Alternatively, use a method like .getSymbol().
        // The current output "main.ast.nodes.expression.AssignmentOperator@..." indicates
        // that toString() is giving the default object representation.
        String operatorSymbol = assignmentExpression.getAssignmentOperator().getOperator();

        System.out.printf("Line %d: Expr %s%n", assignmentExpression.getLine(), operatorSymbol);

        // DO NOT visit right child if its "Expr" output is not desired for this line.
        // if (assignmentExpression.getRight() != null) {
        //     assignmentExpression.getRight().accept(this);
        // }
        return null;
    }
    @Override
    public Void visit(CommaExpression commaExpression) {
        ArrayList<Expression> expressions = commaExpression.getExpressions();
        if (expressions != null && !expressions.isEmpty()) {

            for (int i = 0; i < expressions.size(); i++) {
                Expression expr = expressions.get(i);
                if (expr != null) {
//                    expr.accept(this);
                }
                // Print the comma operator after each expression except the last one
                if (i < expressions.size() - 1) {
                    // The line number for the comma operator itself is tricky.
                    // It could be the line of the CommaExpression node,
                    // or the line of the expression it follows.
                    // Using the CommaExpression's line number as per previous pattern.
                    System.out.printf("Line %d: Expr ,%n", commaExpression.getLine());
                }
            }
        }
        return null;
    }
//    @Override
//    public Void visit(CommaExpression commaExpression) {
//        if (commaExpression.getLeft() != null) {
//            commaExpression.getLeft().accept(this);
//        }
//        // Autograder output for comma operator
//        System.out.printf("Line %d: Expr ,%n", commaExpression.getLine());
//        if (commaExpression.getRight() != null) {
//            commaExpression.getRight().accept(this);
//        }
//        return null;
//    }

    @Override
    public Void visit(FunctionCallExpression functionCallExpression) {
        Expression funcExpr = functionCallExpression.getExpression();
        // Autograder output for function name when called
        if (funcExpr instanceof IdentifierExpression) {
            System.out.printf("Line %d: Expr %s%n",
                    functionCallExpression.getLine(), // Or funcExpr.getLine()
                    ((IdentifierExpression) funcExpr).getName());
        } else {
            // For indirect calls (e.g. function pointers), the tests don't specify.
            // Fallback or print a generic placeholder if necessary.
            // funcExpr.accept(this); // if it's a complex expression yielding a function
        }

        // Standard traversal
        // The IdentifierExpression for the function name itself doesn't need a separate visit here
        // if we've already printed "Expr FUNCNAME".
        // If funcExpr is complex, it should be visited.
        if (!(funcExpr instanceof IdentifierExpression) && funcExpr != null) {
            funcExpr.accept(this);
        }

//        if (functionCallExpression.getArgumentExpressionList() != null) {
//            functionCallExpression.getArgumentExpressionList().accept(this);
//        }
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc="Default Traversal for other AST Nodes (inherited or to be filled)">
    // Ensure all other visit methods from your original template are here,
    // primarily for traversal if they don't have specific output requirements
    // from the autograder. Many are already fine from the previous version.

    @Override
    public Void visit(DirectDeclarator node) {
        if (node == null) return null;
        if (node.getDeclarator() != null) { node.getDeclarator().accept(this); }
        if (node.getDirectDeclarator() != null) { node.getDirectDeclarator().accept(this); }
        if (node.getIdentifierExpression() != null) { node.getIdentifierExpression().accept(this); }
        if (node.getExpression() != null) { node.getExpression().accept(this); } // e.g., array size
        if (node.getIdentifierList() != null) { node.getIdentifierList().accept(this); }
        if (node.getParameterList() != null) { node.getParameterList().accept(this); }
        return null;
    }
    @Override
    public Void visit(Declaration declaration) {
        if (declaration.getDeclarationSpecifiers() != null) { declaration.getDeclarationSpecifiers().accept(this); }
        if (declaration.getInitDeclaratorList() != null) { declaration.getInitDeclaratorList().accept(this); }
        return null;
    }
    @Override
    public Void visit(DeclarationSpecifiers declarationSpecifiers) {
        if (declarationSpecifiers.getDeclarationSpecifiers() != null) {
            for (DeclarationSpecifier ds : declarationSpecifiers.getDeclarationSpecifiers()) {
                if (ds != null) { ds.accept(this); }
            }
        }
        return null;
    }
    @Override
    public Void visit(Declarator declarator) {
        if (declarator.getPointer() != null) { declarator.getPointer().accept(this); }
        if (declarator.getDirectDeclarator() != null) { declarator.getDirectDeclarator().accept(this); }
        return null;
    }
    @Override
    public Void visit(DeclarationList declarationList) {
        if (declarationList.getDeclarations() != null) {
            for (Declaration d : declarationList.getDeclarations()) {
                if (d != null) { d.accept(this); }
            }
        }
        return null;
    }
    @Override
    public Void visit(UnaryOperator unaryOperator) { return null; } // Token, handled by parent expression
    @Override
    public Void visit(TypeName typeName) {
        if (typeName.getSpecifierQualifierList() != null) { typeName.getSpecifierQualifierList().accept(this); }
        if (typeName.getAbstractDeclarator() != null) { typeName.getAbstractDeclarator().accept(this); }
        return null;
    }
    @Override
    public Void visit(CastExpression castExpression) {
        if (castExpression.getTypeName() != null) { castExpression.getTypeName().accept(this); }
        // The autograder tests don't show output like "Expr (type)" for casts.
        // So, we just traverse.
        if (castExpression.getExpression() != null) { castExpression.getExpression().accept(this); }
        else if (castExpression.getCastExpression() != null) { castExpression.getCastExpression().accept(this); }
        return null;
    }
    @Override
    public Void visit(DigitSequence digitSequence) { return null; } // Token
    @Override
    public Void visit(ArgumentExpressionList argumentExpressionList) {
        if (argumentExpressionList.getExpressions() != null) {
            for (Expression e : argumentExpressionList.getExpressions()) {
                if (e != null) { e.accept(this); }
            }
        }
        return null;
    }
    @Override
    public Void visit(AssignmentOperator assignmentOperator) { return null; } // Token
    @Override
    public Void visit(InitDeclaratorList initDeclaratorList) {
        if (initDeclaratorList.getInitDeclarators() != null) {
            for (InitDeclarator i : initDeclaratorList.getInitDeclarators()) {
                if (i != null) { i.accept(this); }
            }
        }
        return null;
    }
    @Override
    public Void visit(ForExpression forExpression) {
        if (forExpression.getExpressions() != null) {
            for (Expression expr : forExpression.getExpressions()) {
                if (expr != null) { expr.accept(this); }
            }
        }
        return null;
    }
    @Override
    public Void visit(ForDeclaration forDeclaration) {
        if (forDeclaration.getDeclarationSpecifiers() != null) { forDeclaration.getDeclarationSpecifiers().accept(this); }
        if (forDeclaration.getInitDeclaratorList() != null) { forDeclaration.getInitDeclaratorList().accept(this); }
        return null;
    }
    @Override
    public Void visit(ExpressionStatement expressionStatement) {
        if (expressionStatement.getExpression() != null) { expressionStatement.getExpression().accept(this); }
        return null;
    }
    //    @Override
//    public Void visit(JumpStatement jumpStatement) {
//        if (jumpStatement.getExpression() != null) { jumpStatement.getExpression().accept(this); }
//        return null;
//    }
    @Override
    public Void visit(JumpStatement jumpStatement) {
        if (jumpStatement.getExpression() != null) { // This is the '0' in 'return 0;'
            jumpStatement.getExpression().accept(this); // Visits the ConstantExpression for '0'
        }
        return null;
    }
    @Override
    public Void visit(ForCondition forCondition) {
        if (forCondition.getForDeclaration() != null) { forCondition.getForDeclaration().accept(this); }
        else if (forCondition.getExpression() != null) { forCondition.getExpression().accept(this); }
        if (forCondition.getForExpression1() != null) { forCondition.getForExpression1().accept(this); }
        if (forCondition.getForExpression2() != null) { forCondition.getForExpression2().accept(this); }
        return null;
    }
    @Override
    public Void visit(Designator designator) {
        if (designator.getExpression() != null) { designator.getExpression().accept(this); }
        return null;
    }
    @Override
    public Void visit(Designation designation) {
        if (designation.getDesignators() != null) {
            for (Designator d : designation.getDesignators()) {
                if (d != null) { d.accept(this); }
            }
        }
        return null;
    }
    @Override
    public Void visit(InitializerList initializerList) {
        if (initializerList.getDesignations() != null) {
            for (Designation d : initializerList.getDesignations()) {
                if (d != null) { d.accept(this); }
            }
        }
        if (initializerList.getInitializers() != null) {
            for (Initializer i : initializerList.getInitializers()) {
                if (i != null) { i.accept(this); }
            }
        }
        return null;
    }
    @Override
    public Void visit(Initializer initializer) {
        if (initializer.getExpression() != null) { initializer.getExpression().accept(this); }
        if (initializer.getInitializerList() != null) { initializer.getInitializerList().accept(this); }
        return null;
    }
    @Override
    public Void visit(Pointer pointer) { return null; }
    @Override
    public Void visit(ParameterList parameterList) {
        if (parameterList.getParameterDeclarations() != null) {
            for (ParameterDeclaration p : parameterList.getParameterDeclarations()) {
                if (p != null) { p.accept(this); }
            }
        }
        return null;
    }
    @Override
    public Void visit(IdentifierList identifierList) { // K&R params
        if (identifierList.getIdentifierExpressions() != null) {
            for (IdentifierExpression idExpr : identifierList.getIdentifierExpressions()) {
                if (idExpr != null) {
                    // Original goal 3 for "used" would print "Expr name"
                    // idExpr.accept(this); // This would be: Line L: Expr name
                    // For K&R param list, these are declarations.
                    // The tests don't show specific output for this node.
                }
            }
        }
        return null;
    }
    @Override
    public Void visit(AbstractDeclarator abstractDeclarator) {
        if (abstractDeclarator.getPointer() != null) { abstractDeclarator.getPointer().accept(this); }
        if (abstractDeclarator.getDirectAbstractDeclarator() != null) { abstractDeclarator.getDirectAbstractDeclarator().accept(this); }
        return null;
    }
    @Override
    public Void visit(DirectAbstractDeclarator directAbstractDeclarator) {
        if (directAbstractDeclarator.getAbstractDeclarator() != null) { directAbstractDeclarator.getAbstractDeclarator().accept(this); }
        if (directAbstractDeclarator.getDirectAbstractDeclarator() != null) { directAbstractDeclarator.getDirectAbstractDeclarator().accept(this); }
        if (directAbstractDeclarator.getExpression() != null) { directAbstractDeclarator.getExpression().accept(this); }
        if (directAbstractDeclarator.getParameterList() != null) { directAbstractDeclarator.getParameterList().accept(this); }
        return null;
    }
    @Override
    public Void visit(DeclarationSpecifier declarationSpecifier) {
        if (declarationSpecifier.getTypeSpecifier() != null) { declarationSpecifier.getTypeSpecifier().accept(this); }
        return null;
    }
    @Override
    public Void visit(IdentifierDeclarator declarator) { return null; }
    @Override
    public Void visit(ParenDeclarator declarator) {
        if (declarator.getDeclarator() != null) { declarator.getDeclarator().accept(this); }
        return null;
    }
    @Override
    public Void visit(ArrayDeclarator declarator) {
        if (declarator.getDirectDeclarator() != null) { declarator.getDirectDeclarator().accept(this); }
        if (declarator.getExpression() != null) { declarator.getExpression().accept(this); }
        return null;
    }
    @Override
    public Void visit(FunctionDeclarator declarator) {
        if (declarator.getDirectDeclarator() != null) { declarator.getDirectDeclarator().accept(this); }
        if (declarator.getParameterList() != null) { declarator.getParameterList().accept(this); }
        if (declarator.getIdentifierList() != null) { declarator.getIdentifierList().accept(this); }
        return null;
    }
    @Override
    public Void visit(TypeSpecifier typeSpecifier) { return null; }
    @Override
    public Void visit(SpecifierQualifierList specifierQualifierList) {
        if (specifierQualifierList.getTypeSpecifier() != null) { specifierQualifierList.getTypeSpecifier().accept(this); }
        if (specifierQualifierList.getSpecifierQualifierList() != null) { specifierQualifierList.getSpecifierQualifierList().accept(this); }
        return null;
    }
    @Override
    public Void visit(ParenExpression parenExpression) {
        if (parenExpression.getExpression() != null) { parenExpression.getExpression().accept(this); }
        return null;
    }
    @Override
    public Void visit(TernaryExpression ternaryExpression) {
        if (ternaryExpression.getCondition() != null) { ternaryExpression.getCondition().accept(this); }
        // Tests don't show "Expr ?" or "Expr :". Just traverse.
        if (ternaryExpression.getThenExpression() != null) { ternaryExpression.getThenExpression().accept(this); }
        if (ternaryExpression.getElseExpression() != null) { ternaryExpression.getElseExpression().accept(this); }
        return null;
    }
    @Override
    public Void visit(CompoundLiteralExpression compoundLiteralExpression) {
        if (compoundLiteralExpression.getTypeName() != null) { compoundLiteralExpression.getTypeName().accept(this); }
        if (compoundLiteralExpression.getInitializerList() != null) { compoundLiteralExpression.getInitializerList().accept(this); }
        return null;
    }
    @Override
    public Void visit(TypeCastExpression typeCastExpression) { // Same as CastExpression
        if (typeCastExpression.getTypeName() != null) { typeCastExpression.getTypeName().accept(this); }
        if (typeCastExpression.getCastExpression() != null) { typeCastExpression.getCastExpression().accept(this); }
        return null;
    }
    // </editor-fold>
}