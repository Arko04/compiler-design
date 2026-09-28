package main.ast.nodes.function;

import main.ast.nodes.Node;

import main.ast.nodes.Node;
import main.ast.nodes.declaration.IdentifierList;
import main.ast.nodes.declaration.Pointer;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.IdentifierExpression;
import main.visitor.IVisitor;

public class DirectDeclarator extends Node {
//public class Declarator extends AbstractDeclarator {

   public DirectDeclarator() {}

   @Override
   public <T> T accept(IVisitor<T> visitor) {
       return visitor.visit(this);
   }

//    public IdentifierExpression getIdentifierExpression() {
//        return identifierExpression;
//    }
public IdentifierExpression getIdentifierExpression() {
//    System.out.printf("checking getIdentifierExpression function: identifier=%s, identifierExpression=%s%n",
//            identifier, identifierExpression);
    if (this.identifierExpression == null && this.identifier != null) {
        this.identifierExpression = new IdentifierExpression(identifier);
    }
    return this.identifierExpression;
}


//    public void setIdentifierExpression(IdentifierExpression identifierExpression) {
//        this.identifierExpression = identifierExpression;
//    }

    private IdentifierExpression identifierExpression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    private Expression expression;

    public Declarator getDeclarator() {
        return declarator;
    }

    public void setDeclarator(Declarator declarator) {
        this.declarator = declarator;
    }

    private Declarator declarator;

    public DirectDeclarator getDirectDeclarator() {
        return directDeclarator;
    }

    public void setDirectDeclarator(DirectDeclarator directDeclarator) {
        this.directDeclarator = directDeclarator;
    }

    private DirectDeclarator directDeclarator;

    public IdentifierList getIdentifierList() {
        return identifierList;
    }

    public void setIdentifierList(IdentifierList identifierList) {
        this.identifierList = identifierList;
    }

    private IdentifierList identifierList;

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    private ParameterList parameterList;

    public String getIdentifier() {
        if (identifierExpression!=null) {
//            System.out.printf("Checking in getIdentifier() function identifier=%s, identifierExpression=%s%n",
//                    identifier, identifierExpression.getName());
        }
        if  (this.identifierExpression == null){
//            System.out.printf("IdentifierExpression is null%n");
        }
        else
        {
//            System.out.printf("IdentifierExpression is not null and is %s%n", this.identifierExpression.getName());
        }
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
        this.identifierExpression = new IdentifierExpression(identifier);
//        System.out.printf("i got this:%s%n", this.identifierExpression.getName());

    }

    private String identifier;


}


//package main.ast.nodes.function;
//
//import main.ast.nodes.Node;
//
//import main.ast.nodes.Node;
//import main.ast.nodes.declaration.IdentifierList;
//import main.ast.nodes.declaration.Pointer;
//import main.ast.nodes.expression.Expression;
//import main.ast.nodes.expression.IdentifierExpression;
//import main.visitor.IVisitor;
//
//public class DirectDeclarator extends Node {
////public class Declarator extends AbstractDeclarator {
//
//    public DirectDeclarator() {}
//
//    @Override
//    public <T> T accept(IVisitor<T> visitor) {
//        return visitor.visit(this);
//    }
//
//    //    public IdentifierExpression getIdentifierExpression() {
////        return identifierExpression;
////    }
//    public IdentifierExpression getIdentifierExpression() {
//        System.out.printf("checking getIdentifierExpression function: identifier=%s, identifierExpression=%s%n",
//                identifier, identifierExpression);
//        if (this.identifierExpression == null && this.identifier != null) {
//            this.identifierExpression = new IdentifierExpression(identifier);
//        }
//        return this.identifierExpression;
//    }
//
//
////    public void setIdentifierExpression(IdentifierExpression identifierExpression) {
////        this.identifierExpression = identifierExpression;
////    }
//
//    private IdentifierExpression identifierExpression;
//
//    public Expression getExpression() {
//        return expression;
//    }
//
//    public void setExpression(Expression expression) {
//        this.expression = expression;
//    }
//
//    private Expression expression;
//
//    public Declarator getDeclarator() {
//        return declarator;
//    }
//
//    public void setDeclarator(Declarator declarator) {
//        this.declarator = declarator;
//    }
//
//    private Declarator declarator;
//
//    public DirectDeclarator getDirectDeclarator() {
//        return directDeclarator;
//    }
//
//    public void setDirectDeclarator(DirectDeclarator directDeclarator) {
//        this.directDeclarator = directDeclarator;
//    }
//
//    private DirectDeclarator directDeclarator;
//
//    public IdentifierList getIdentifierList() {
//        return identifierList;
//    }
//
//    public void setIdentifierList(IdentifierList identifierList) {
//        this.identifierList = identifierList;
//    }
//
//    private IdentifierList identifierList;
//
//    public ParameterList getParameterList() {
//        return parameterList;
//    }
//
//    public void setParameterList(ParameterList parameterList) {
//        this.parameterList = parameterList;
//    }
//
//    private ParameterList parameterList;
//
//    public String getIdentifier() {
//        if (identifierExpression!=null) {
//            System.out.printf("Checking in getIdentifier() function identifier=%s, identifierExpression=%s%n",
//                    identifier, identifierExpression.getName());
//        }
//        if  (this.identifierExpression == null){
//            System.out.printf("IdentifierExpression is null%n");
//        }
//        else
//        {
//            System.out.printf("IdentifierExpression is not null and is %s%n", this.identifierExpression.getName());
//        }
//        return identifier;
//    }
//
//    public void setIdentifier(String identifier) {
//        this.identifier = identifier;
//        this.identifierExpression = new IdentifierExpression(identifier);
//        System.out.printf("i got this:%s%n", this.identifierExpression.getName());
//
//    }
//
//    private String identifier;
//
//
//}
