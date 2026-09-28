package main.symbolTable.item;

import main.ast.nodes.function.FunctionDefinition;
import main.visitor.NameAnalyzer;

public class FunctionDeclarationSymbolTableItem extends SymbolTableItem {
    public static final String START_KEY = "Function_";

    private FunctionDefinition functionDefinition;
//    private String functionName;

    public FunctionDeclarationSymbolTableItem(FunctionDefinition functionDefinition) {
        this.functionDefinition = functionDefinition;
//        if (functionDefinition != null && functionDefinition.getDeclarator() != null) {
//            this.functionName = NameAnalyzer.getIdentifierFromDeclarator(functionDefinition.getDeclarator());
//        } else {
//            this.functionName = null;
//        }
    }

    public FunctionDefinition getFunctionDefinition() {
        return functionDefinition;
    }
//
//    public String getFunctionName() {
//        return functionName;
//    }

    @Override
    public String getKey() {
        if (this.functionDefinition.getFunctionName() == null) {
            return START_KEY + "UNNAMED_FUNCTION_ERROR";
        }
        return START_KEY + this.functionDefinition.getFunctionName();
    }
}

//package main.symbolTable.item;
//
//import main.ast.nodes.function.FunctionDefinition;
//import main.visitor.NameAnalyzer; // Assuming static helpers are here
//
//import java.util.ArrayList;
//
//public class FunctionDeclarationSymbolTableItem extends SymbolTableItem {
//    public static final String START_KEY = "Function_";
//
//    private FunctionDefinition functionDefinition;
//    private String functionName;
//
////    public ArrayList<String> getParameters() {
////        return parameters;
////    }
////
////    ArrayList<String> parameters =  new ArrayList<>();
//
//    public FunctionDeclarationSymbolTableItem(FunctionDefinition functionDefinition) {
//        this.functionDefinition = functionDefinition;
//        if (functionDefinition != null && functionDefinition.getDeclarator() != null) {
//            this.functionName = NameAnalyzer.getIdentifierFromDeclarator(functionDefinition.getDeclarator());
//        }
//        else {
//            this.functionName = null; // Or handle error
//        }
////        if ((functionDefinition != null && functionDefinition.getDeclarator() != null &&
////                functionDefinition.getDeclarator().getDirectDeclarator().getParameterList() != null) {
////            this.parameters = NameAnalyzer.getIdentifierFromParameterList(functionDefinition.getDeclarator().getDirectDeclarator().getParameterList());
////        }
////        else
////        {
////            this.parameters = null;
////        }
//    }
//
//    public FunctionDefinition getFunctionDefinition() {
//        return functionDefinition;
//    }
//
//    public String getFunctionName() {
//        return functionName;
//    }
//
//    @Override
//    public String getKey() {
//        if (this.functionName == null) {
//            // This indicates an issue, either an unnamed function (not typical for definitions)
//            // or a problem extracting the name.
//            // Consider logging an error or returning a special key.
//            // For now, to avoid NullPointerException with START_KEY + null:
//            return START_KEY + "UNNAMED_FUNCTION_ERROR";
//        }
//        return START_KEY + this.functionName;
//    }
//
////    public String getParametersName() {
////        String Answer = "parameters: ";
////        for (String parameter:this.parameters) {
////            Answer += parameter + ",";
////        }
////        return Answer;
////    }
//
//
//
//}