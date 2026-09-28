package main.ast.nodes.function;

import main.ast.nodes.declaration.IdentifierList;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.IdentifierExpression;
import main.visitor.IVisitor;
import main.ast.nodes.function.DirectDeclarator;
import java.util.List;

public class FunctionDeclarator extends DirectDeclarator {

    public DirectDeclarator getDirectDeclarator() {
        return directDeclarator;
    }

    public void setDirectDeclarator(DirectDeclarator directDeclarator) {
        this.directDeclarator = directDeclarator;
    }

    //public class Declarator extends AbstractDeclarator {
    private DirectDeclarator directDeclarator;

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    private ParameterList parameterList;

    public IdentifierList getIdentifierList() {
        return identifierList;
    }

    public void setIdentifierList(IdentifierList identifierList) {
        this.identifierList = identifierList;
    }

    private IdentifierList identifierList;

   @Override
   public <T> T accept(IVisitor<T> visitor) {
       return visitor.visit(this);
   }

}
