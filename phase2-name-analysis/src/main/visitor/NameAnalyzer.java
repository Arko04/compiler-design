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
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.item.ForDeclarationSymbolTableItem;
import main.symbolTable.item.FunctionDeclarationSymbolTableItem;
import main.symbolTable.item.ParameterDeclarationSymbolTableItem;
import main.symbolTable.item.VariableDeclarationSymbolTableItem;

import java.util.ArrayList;

public class NameAnalyzer extends Visitor<Void> {

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
            if (current.getIdentifier() != null) {
                return  current.getIdentifier();
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

    public String getIdentifierFromForDeclaration(ForDeclaration forDeclaration) {
        if (forDeclaration != null && forDeclaration.getInitDeclaratorList() != null) {
            InitDeclarator initDeclarator =  forDeclaration.getInitDeclaratorList().getInitDeclarators().getFirst();
            if (initDeclarator != null) {
                return getIdentifierFromDeclarator(initDeclarator.getDeclarator());
            }
        }
        if (forDeclaration != null && forDeclaration.getDeclarationSpecifiers() != null) {
            DeclarationSpecifiers  dss = forDeclaration.getDeclarationSpecifiers();
            if (dss.getDeclarationSpecifiers() != null && !dss.getDeclarationSpecifiers().isEmpty()){
                DeclarationSpecifier declarationSpecifier= dss.getDeclarationSpecifiers().getLast();
                return declarationSpecifier.getTypeSpecifier().getType();
            }
        }
        return null;
    }

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = SymbolTable.root;

        FunctionDefinition printfDef = new FunctionDefinition();
        printfDef.setFunctionName("printf");
        try {
            SymbolTable.top.put(new FunctionDeclarationSymbolTableItem(printfDef));
        } catch (ItemAlreadyExistsException e) {
        }

        if (program.getTranslationUnit() != null) {
            program.getTranslationUnit().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(TranslationUnit translationUnit) {
        if (translationUnit.getExternalDeclarations() != null) {
            for (ExternalDeclaration ed : translationUnit.getExternalDeclarations()) {
                if (ed != null) ed.accept(this);
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
        functionDefinition.setFunctionName(funcName);

        FunctionDeclarationSymbolTableItem funcItem = new FunctionDeclarationSymbolTableItem(functionDefinition);
        try {
            SymbolTable.top.put(funcItem);
        } catch (ItemAlreadyExistsException e) {
            System.out.printf("Line:%d-> function %s already has been declared%n", functionDefinition.getLine(), funcName);
        }

        // if (funcName != null) {
        //     System.out.printf("Line %d: Entering new scope for function %s%n", functionDefinition.getLine(), funcName);
        // }

        SymbolTable.push(new SymbolTable(SymbolTable.top));

        if (functionDefinition.getDeclarationSpecifiers() != null) functionDefinition.getDeclarationSpecifiers().accept(this);
        if (functionDefinition.getDeclarator() != null) functionDefinition.getDeclarator().accept(this);
        if (functionDefinition.getDeclarationList() != null) functionDefinition.getDeclarationList().accept(this);
        if (functionDefinition.getCompoundStatement() != null) functionDefinition.getCompoundStatement().accept(this);

        SymbolTable.pop();

        // if (funcName != null) {
        //     System.out.printf("Line %d: Exiting scope for function %s%n", functionDefinition.getLine(), funcName);
        // }
        return null;
    }

    @Override
    public Void visit(CompoundStatement compoundStatement) {
        if (compoundStatement.getBlockItems() != null) {
            for (BlockItem item : compoundStatement.getBlockItems()) {
                if (item != null) item.accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visit(IdentifierExpression identifier) {
        // if (identifier.getName() != null) {
        //     System.out.printf("Line %d: Expr %s%n", identifier.getLine(), identifier.getName());
        // }

        try {
            SymbolTable.top.getItem(VariableDeclarationSymbolTableItem.START_KEY + identifier.getName());
        } catch (ItemNotFoundException e) {
            System.out.printf("Line:%d-> %s not declared%n", identifier.getLine(), identifier.getName());
        }
        return null;
    }

    @Override
    public Void visit(FunctionCallExpression functionCallExpression) {
        if (functionCallExpression.getExpression() instanceof IdentifierExpression) {
            String funcName = ((IdentifierExpression) functionCallExpression.getExpression()).getName();
            // System.out.printf("Line %d: Expr %s%n", functionCallExpression.getLine(), funcName);

            try {
                SymbolTable.top.getItem(FunctionDeclarationSymbolTableItem.START_KEY + funcName);
            } catch (ItemNotFoundException e) {
                System.out.printf("Line:%d-> function %s not declared%n", functionCallExpression.getLine(), funcName);
            }
        } else {
            functionCallExpression.getExpression().accept(this);
        }

        if (functionCallExpression.getArgumentExpressionList() != null) {
            functionCallExpression.getArgumentExpressionList().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(Declaration declaration) {
        if (declaration.getInitDeclaratorList() != null) {
            for (InitDeclarator id : declaration.getInitDeclaratorList().getInitDeclarators()) {
                String vardec = getIdentifierFromDeclarator(id.getDeclarator());
                // System.out.printf("VariableDeclarationSymbolTableItem: %s%n", vardec);

                if (vardec != null) {
                    VariableDeclarationSymbolTableItem varItem = new VariableDeclarationSymbolTableItem(vardec);
                    try {
                        SymbolTable.top.put(varItem);
                    } catch (ItemAlreadyExistsException e) {
                        System.out.printf("Line:%d-> %s is already declared in this scope%n", id.getLine(), vardec);
                    }
                }
            }
        } else if (declaration.getDeclarationSpecifiers() != null) {
            DeclarationSpecifier dc =  declaration.getDeclarationSpecifiers().getDeclarationSpecifiers().getLast();
            String vardec = dc.getTypeSpecifier().getType();
            // System.out.printf("VariableDeclarationSymbolTableItem: %s%n", vardec);
            if (vardec != null) {
                VariableDeclarationSymbolTableItem varItem = new VariableDeclarationSymbolTableItem(vardec);
                try {
                    SymbolTable.top.put(varItem);
                } catch (ItemAlreadyExistsException e) {
                    System.out.printf("Line:%d-> %s is already declared in this scope%n", dc.getLine(), vardec);
                }
            }
        }

        if (declaration.getDeclarationSpecifiers() != null) {
            declaration.getDeclarationSpecifiers().accept(this);
        }
        if (declaration.getInitDeclaratorList() != null) {
            declaration.getInitDeclaratorList().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ParameterDeclaration parameterDeclaration) {
        String paramName = null;

        if (parameterDeclaration.getDeclarationSpecifiers() != null) {
            paramName = parameterDeclaration.getDeclarationSpecifiers().getDeclarationSpecifiers().getLast().getTypeSpecifier().getType();
        }
        if (parameterDeclaration.getDeclarator() != null) {
            paramName = getIdentifierFromDeclarator(parameterDeclaration.getDeclarator());
        }

        if (paramName != null) {
            // System.out.printf("Line %d: ParameterDeclarationSymbolTableItem: %s%n",
            //         parameterDeclaration.getLine(), paramName);
            ParameterDeclarationSymbolTableItem paramItem = new ParameterDeclarationSymbolTableItem(paramName);
            try {
                SymbolTable.top.put(paramItem);
            } catch (ItemAlreadyExistsException e) {
                System.out.printf("Line:%d-> parameter %s already has been declared%n", parameterDeclaration.getLine(), paramName);
            }
        }

        if(parameterDeclaration.getDeclarationSpecifiers() != null) parameterDeclaration.getDeclarationSpecifiers().accept(this);
        if(parameterDeclaration.getDeclarator() != null) parameterDeclaration.getDeclarator().accept(this);
        else if(parameterDeclaration.getAbstractDeclarator() != null) parameterDeclaration.getAbstractDeclarator().accept(this);

        return null;
    }

    @Override
    public Void visit(IterationStatement iterationStatement) {
        String loopType = "loop";
        if (iterationStatement.getForCondition() != null) { loopType = "for"; }
        else if (iterationStatement.getExpression() != null) { loopType = "while"; }

        SymbolTable.push(new SymbolTable(SymbolTable.top));

        if (loopType.equals("while")) {
            iterationStatement.getExpression().accept(this);
        }
        // int bodyStmtCount = getStatementCount(iterationStatement.getStatement());
        // System.out.printf("Line %d: Stmt %s = %d%n", iterationStatement.getLine(), loopType, bodyStmtCount);
        // if (loopType.equals("for")) {
        //     String variableName = getIdentifierFromForDeclaration(iterationStatement.getForCondition().getForDeclaration());
        //     System.out.printf("Variable initialized: %s%n", variableName);
        // }

        if (iterationStatement.getForCondition() != null) iterationStatement.getForCondition().accept(this);
        if (loopType.equals("for") && iterationStatement.getExpression() != null) {
            iterationStatement.getExpression().accept(this);
        }
        if (iterationStatement.getStatement() != null) iterationStatement.getStatement().accept(this);

        SymbolTable.pop();
        return null;
    }
    @Override
    public Void visit(SelectionStatement selectionStatement) {
        if (selectionStatement.getExpression() != null) {
            selectionStatement.getExpression().accept(this);
        }

        if (selectionStatement.getIfStatement() != null) {
            // int ifBranchStmtCount = getStatementCount(selectionStatement.getIfStatement());
            // System.out.printf("Line %d: Stmt selection = %d%n",
            //         selectionStatement.getExpression() != null ? selectionStatement.getExpression().getLine() : selectionStatement.getLine(),
            //         ifBranchStmtCount);
            SymbolTable.push(new SymbolTable(SymbolTable.top));
            selectionStatement.getIfStatement().accept(this);
            SymbolTable.pop();
        }

        if (selectionStatement.getElseStatement() != null) {
            Statement elseStmt = selectionStatement.getElseStatement();
            // if (!(elseStmt instanceof SelectionStatement)) {
            //     int elseBranchStmtCount = getStatementCount(elseStmt);
            //     System.out.printf("Line %d: Stmt selection = %d%n", elseStmt.getLine(), elseBranchStmtCount);
            // }
            SymbolTable.push(new SymbolTable(SymbolTable.top));
            elseStmt.accept(this);
            SymbolTable.pop();
        }
        return null;
    }

    //<editor-fold desc="All other visit methods">
    @Override public Void visit(ConstantExpression c) { /*if (c.getValue() != null) System.out.printf("Line %d: Expr %s%n", c.getLine(), c.getValue().toString());*/ return null; }
    @Override public Void visit(StringLiteralExpression s) { return null; }
    @Override public Void visit(InitDeclarator i) { if (i.getDeclarator() != null) i.getDeclarator().accept(this); if (i.getInitializer() != null) i.getInitializer().accept(this); return null; }
    @Override public Void visit(BinaryExpression b) { if (b.getLeft() != null) b.getLeft().accept(this); /*System.out.printf("Line %d: Expr %s%n", b.getLine(), b.getOperator());*/ if (b.getRight() != null) b.getRight().accept(this); return null; }
    @Override public Void visit(PrefixExpression p) { /*System.out.printf("Line %d: Expr %s%n", p.getLine(), p.getUnaryOperator());*/ if (p.getExpression() != null) p.getExpression().accept(this); return null; }
    @Override public Void visit(PostfixExpression p) { if (p.getExpression() != null) p.getExpression().accept(this); /*System.out.printf("Line %d: Expr %s%n", p.getLine(), p.getPostfix());*/ return null; }
    @Override public Void visit(AssignmentExpression a) { if (a.getLeft() != null) a.getLeft().accept(this); /*System.out.printf("Line %d: Expr %s%n", a.getLine(), a.getAssignmentOperator().getOperator());*/ if (a.getRight() != null) a.getRight().accept(this); return null; }
    @Override public Void visit(CommaExpression c) { ArrayList<Expression> ex = c.getExpressions(); if (ex != null) for (int i = 0; i < ex.size(); i++) { if (ex.get(i) != null) ex.get(i).accept(this); /*if (i < ex.size() - 1) System.out.printf("Line %d: Expr ,%n", c.getLine());*/ } return null; }
    @Override public Void visit(DirectDeclarator n) { if (n.getDeclarator() != null) n.getDeclarator().accept(this); if (n.getDirectDeclarator() != null) n.getDirectDeclarator().accept(this); if (n.getIdentifierExpression() != null) n.getIdentifierExpression().accept(this); if (n.getExpression() != null) n.getExpression().accept(this); if (n.getIdentifierList() != null) n.getIdentifierList().accept(this); if (n.getParameterList() != null) n.getParameterList().accept(this); return null; }
    @Override public Void visit(Declarator d) { if (d.getPointer() != null) d.getPointer().accept(this); if (d.getDirectDeclarator() != null) d.getDirectDeclarator().accept(this); return null; }
    @Override public Void visit(DeclarationSpecifiers d) { if (d.getDeclarationSpecifiers() != null) for (DeclarationSpecifier ds : d.getDeclarationSpecifiers()) ds.accept(this); return null; }
    @Override public Void visit(DeclarationList d) { if (d.getDeclarations() != null) for (Declaration decl : d.getDeclarations()) decl.accept(this); return null; }
    @Override public Void visit(UnaryOperator u) { return null; }
    @Override public Void visit(TypeName t) { if (t.getSpecifierQualifierList() != null) t.getSpecifierQualifierList().accept(this); if (t.getAbstractDeclarator() != null) t.getAbstractDeclarator().accept(this); return null; }
    @Override public Void visit(CastExpression c) { if (c.getTypeName() != null) c.getTypeName().accept(this); if (c.getExpression() != null) c.getExpression().accept(this); else if (c.getCastExpression() != null) c.getCastExpression().accept(this); return null; }
    @Override public Void visit(DigitSequence d) { return null; }
    @Override public Void visit(ArgumentExpressionList a) { if (a.getExpressions() != null) for (Expression e : a.getExpressions()) e.accept(this); return null; }
    @Override public Void visit(AssignmentOperator a) { return null; }
    @Override public Void visit(InitDeclaratorList i) { if (i.getInitDeclarators() != null) for (InitDeclarator id : i.getInitDeclarators()) id.accept(this); return null; }
    @Override public Void visit(ForExpression f) { if (f.getExpressions() != null) for (Expression e : f.getExpressions()) e.accept(this); return null; }
    @Override public Void visit(ForDeclaration f) { if(f.getDeclarationSpecifiers() != null) f.getDeclarationSpecifiers().accept(this); if(f.getInitDeclaratorList() != null) { for (InitDeclarator id : f.getInitDeclaratorList().getInitDeclarators()) { String varName = getIdentifierFromDeclarator(id.getDeclarator()); if (varName != null) { try { SymbolTable.top.put(new ForDeclarationSymbolTableItem(varName)); } catch (ItemAlreadyExistsException e) { System.out.printf("Line:%d-> %s is already declared in this scope%n", id.getLine(), varName); } } } f.getInitDeclaratorList().accept(this); } return null; }
    @Override public Void visit(ExpressionStatement e) { if (e.getExpression() != null) e.getExpression().accept(this); return null; }
    @Override public Void visit(JumpStatement j) { if (j.getExpression() != null) j.getExpression().accept(this); return null; }
    @Override public Void visit(ForCondition f) { if (f.getForDeclaration() != null) f.getForDeclaration().accept(this); else if (f.getExpression() != null) f.getExpression().accept(this); if (f.getForExpression1() != null) f.getForExpression1().accept(this); if (f.getForExpression2() != null) f.getForExpression2().accept(this); return null; }
    @Override public Void visit(Designator d) { if (d.getExpression() != null) d.getExpression().accept(this); return null; }
    @Override public Void visit(Designation d) { if (d.getDesignators() != null) for (Designator des : d.getDesignators()) des.accept(this); return null; }
    @Override public Void visit(InitializerList i) { if (i.getDesignations() != null) for (Designation d : i.getDesignations()) d.accept(this); if (i.getInitializers() != null) for (Initializer ini : i.getInitializers()) ini.accept(this); return null; }
    @Override public Void visit(Initializer i) { if (i.getExpression() != null) i.getExpression().accept(this); if (i.getInitializerList() != null) i.getInitializerList().accept(this); return null; }
    @Override public Void visit(Pointer p) { return null; }
    @Override public Void visit(ParameterList p) { if (p.getParameterDeclarations() != null) for (ParameterDeclaration pd : p.getParameterDeclarations()) pd.accept(this); return null; }
    @Override public Void visit(IdentifierList i) { if (i.getIdentifierExpressions() != null) for (IdentifierExpression id : i.getIdentifierExpressions()) id.accept(this); return null; }
    @Override public Void visit(AbstractDeclarator a) { if (a.getPointer() != null) a.getPointer().accept(this); if (a.getDirectAbstractDeclarator() != null) a.getDirectAbstractDeclarator().accept(this); return null; }
    @Override public Void visit(DirectAbstractDeclarator d) { if (d.getAbstractDeclarator() != null) d.getAbstractDeclarator().accept(this); if (d.getDirectAbstractDeclarator() != null) d.getDirectAbstractDeclarator().accept(this); if (d.getExpression() != null) d.getExpression().accept(this); if (d.getParameterList() != null) d.getParameterList().accept(this); return null; }
    @Override public Void visit(DeclarationSpecifier d) { if (d.getTypeSpecifier() != null) d.getTypeSpecifier().accept(this); return null; }
    @Override public Void visit(IdentifierDeclarator i) { return null; }
    @Override public Void visit(ParenDeclarator p) { if (p.getDeclarator() != null) p.getDeclarator().accept(this); return null; }
    @Override public Void visit(ArrayDeclarator a) { if (a.getDirectDeclarator() != null) a.getDirectDeclarator().accept(this); if (a.getExpression() != null) a.getExpression().accept(this); return null; }
    @Override public Void visit(FunctionDeclarator f) { if (f.getDirectDeclarator() != null) f.getDirectDeclarator().accept(this); if (f.getParameterList() != null) f.getParameterList().accept(this); if (f.getIdentifierList() != null) f.getIdentifierList().accept(this); return null; }
    @Override public Void visit(TypeSpecifier t) { return null; }
    @Override public Void visit(SpecifierQualifierList s) { if (s.getTypeSpecifier() != null) s.getTypeSpecifier().accept(this); if (s.getSpecifierQualifierList() != null) s.getSpecifierQualifierList().accept(this); return null; }
    @Override public Void visit(ParenExpression p) { if (p.getExpression() != null) p.getExpression().accept(this); return null; }
    @Override public Void visit(TernaryExpression t) { if (t.getCondition() != null) t.getCondition().accept(this); if (t.getThenExpression() != null) t.getThenExpression().accept(this); if (t.getElseExpression() != null) t.getElseExpression().accept(this); return null; }
    @Override public Void visit(CompoundLiteralExpression c) { if (c.getTypeName() != null) c.getTypeName().accept(this); if (c.getInitializerList() != null) c.getInitializerList().accept(this); return null; }
    @Override public Void visit(TypeCastExpression t) { if (t.getTypeName() != null) t.getTypeName().accept(this); if (t.getCastExpression() != null) t.getCastExpression().accept(this); return null; }

}