package main.symbolTable.item;


import main.ast.nodes.declaration.ForDeclaration;
import main.visitor.NameAnalyzer;

public class ForDeclarationSymbolTableItem extends SymbolTableItem {
    public static final String START_KEY = "Variable_";

    private String variableName;

    private ForDeclaration forDeclaration;

    public ForDeclarationSymbolTableItem(ForDeclaration forDeclaration) {
        this.forDeclaration = forDeclaration;
        if (forDeclaration != null) {
//            this.variableName = NameAnalyzer.getIdentifierFromForDeclaration(forDeclaration);
        } else {
            this.variableName = null;
        }
    }


    public ForDeclarationSymbolTableItem(String variableName) {
        this.variableName = variableName;
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

////package main.symbolTable.item;
////
////import main.ast.nodes.declaration.ForDeclaration;
////import main.ast.nodes.declaration.InitDeclarator;
////import main.visitor.NameAnalyzer; // Assuming static helpers are here
////
////public class ForDeclarationSymbolTableItem extends SymbolTableItem {
////    public static final String START_KEY = "ForVariable_";
////
////    private InitDeclarator initDeclaratorNode;
////    private String variableName;
////
////    public ForDeclarationSymbolTableItem(InitDeclarator initDeclaratorNode) {
////        this.initDeclaratorNode = initDeclaratorNode;
////        if (initDeclaratorNode != null && initDeclaratorNode.getDeclarator() != null) {
////            this.variableName = NameAnalyzer.getIdentifierFromDeclarator(initDeclaratorNode.getDeclarator());
////        } else {
////            this.variableName = null;
////        }
////    }
////
////    public InitDeclarator getInitDeclaratorNode() {
////        return initDeclaratorNode;
////    }
////
////    public String getVariableName() {
////        return variableName;
////    }
////
////    @Override
////    public String getKey() {
////        if (this.variableName == null) {
////            return START_KEY + "UNNAMED_FOR_VARIABLE_ERROR";
////        }
////        return START_KEY + this.variableName;
////    }
////}
//
//package main.symbolTable.item;
//
//import main.ast.nodes.declaration.Declaration;
//import main.ast.nodes.declaration.DeclarationSpecifier;
//import main.ast.nodes.declaration.ForDeclaration;
//import main.ast.nodes.declaration.InitDeclarator;
//import main.visitor.NameAnalyzer; // Assuming static helpers are here
//
//public class ForDeclarationSymbolTableItem extends SymbolTableItem {
//    public static final String START_KEY = "Variable_";
//
////    private InitDeclarator initDeclaratorNode;
//    private String variableName;
//
//    ForDeclaration forDeclaration;
//
//    //if initDeclaratorList != null {initDeclaratorList.getInitDeclarators();}
//    // if initDeclaratorList == null {last DeclarationSpecifier}
//
////    public ForDeclarationSymbolTableItem(InitDeclarator initDeclaratorNode) {
////        this.initDeclaratorNode = initDeclaratorNode;
////        if (initDeclaratorNode != null && initDeclaratorNode.getDeclarator() != null) {
////            this.variableName = NameAnalyzer.getIdentifierFromDeclarator(initDeclaratorNode.getDeclarator());
////        } else {
////            this.variableName = null;
////        }
////    }
//    public ForDeclarationSymbolTableItem(ForDeclaration forDeclaration) {
//        this.forDeclaration = forDeclaration;
//        if (forDeclaration != null) {
//            this.variableName = NameAnalyzer.getIdentifierFromForDeclaration(forDeclaration);
//        } else {
//            this.variableName = null;
//        }
//    }
//
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