package main.symbolTable.item;

import main.ast.nodes.declaration.DeclarationSpecifier;
import main.ast.nodes.declaration.DeclarationSpecifiers;
import main.ast.nodes.declaration.InitDeclarator;
import main.visitor.NameAnalyzer;

public class VariableDeclarationSymbolTableItem extends SymbolTableItem {
    public static final String START_KEY = "Variable_";

    private String variableName;

    public VariableDeclarationSymbolTableItem(InitDeclarator initDeclaratorNode) {
        if (initDeclaratorNode != null && initDeclaratorNode.getDeclarator() != null) {
//            this.variableName = NameAnalyzer.getIdentifierFromDeclarator(initDeclaratorNode.getDeclarator());
        } else {
            this.variableName = null;
        }
    }

    public VariableDeclarationSymbolTableItem(DeclarationSpecifier declarationSpecifier) {
        if (declarationSpecifier != null && declarationSpecifier.getTypeSpecifier() != null) {
            this.variableName = declarationSpecifier.getTypeSpecifier().getType();
        } else {
            this.variableName = null;
        }
    }

    public VariableDeclarationSymbolTableItem(String variableName) {
        this.variableName = variableName;
    }

    public VariableDeclarationSymbolTableItem(DeclarationSpecifiers declarationSpecifiers) {
        if (declarationSpecifiers != null && !declarationSpecifiers.getDeclarationSpecifiers().isEmpty()) {
            DeclarationSpecifier lastSpecifier = declarationSpecifiers.getDeclarationSpecifiers().getLast();
            if (lastSpecifier != null && lastSpecifier.getTypeSpecifier() != null) {
                this.variableName = lastSpecifier.getTypeSpecifier().getType();
            } else {
                this.variableName = null;
            }
        } else {
            this.variableName = null;
        }
    }

    public String getVariableName() {
        return variableName;
    }

    @Override
    public String getKey() {
        if (this.variableName == null) {
            return START_KEY + "UNNAMED_VARIABLE_ERROR";
        }
        return START_KEY + this.variableName;
    }
}

//package main.symbolTable.item;
//
//import main.ast.nodes.declaration.Declaration;
//import main.ast.nodes.declaration.DeclarationSpecifier;
//import main.ast.nodes.declaration.DeclarationSpecifiers;
//import main.ast.nodes.declaration.InitDeclarator;
//import main.visitor.NameAnalyzer; // Assuming static helpers are here
//
//public class VariableDeclarationSymbolTableItem extends SymbolTableItem {
//    public static final String START_KEY = "Variable_";
//
//    private InitDeclarator initDeclaratorNode;
//    private String variableName;
//
//    //if initDeclaratorList != null {initDeclaratorList.getInitDeclarator}
//    // if initDeclaratorList == null {last DeclarationSpecifier}
//
//    public VariableDeclarationSymbolTableItem(InitDeclarator initDeclaratorNode) {
//        this.initDeclaratorNode = initDeclaratorNode;
//        if (initDeclaratorNode != null && initDeclaratorNode.getDeclarator() != null) {
//            this.variableName = NameAnalyzer.getIdentifierFromDeclarator(initDeclaratorNode.getDeclarator());
//        } else {
//            this.variableName = null;
//        }
//    }
//    public VariableDeclarationSymbolTableItem(DeclarationSpecifier declarationSpecifier) {
//        if (declarationSpecifier != null) {
//            this.variableName = declarationSpecifier.getTypeSpecifier().getType();
//        } else {
//            this.variableName = null;
//        }
//    }
//    public VariableDeclarationSymbolTableItem(DeclarationSpecifiers declarationSpecifiers) {
//        if (declarationSpecifiers != null) {
//            this.variableName = declarationSpecifiers.getDeclarationSpecifiers().getLast().getTypeSpecifier().getType();
//        } else {
//            this.variableName = null;
//        }
//    }
//
//    public String getVariableName() {
//        return variableName;
//    }
//
//    @Override
//    public String getKey() {
//        if (this.variableName == null) {
//            return START_KEY + "UNNAMED_VARIABLE_ERROR";
//        }
//        return START_KEY + this.variableName;
//    }
//}