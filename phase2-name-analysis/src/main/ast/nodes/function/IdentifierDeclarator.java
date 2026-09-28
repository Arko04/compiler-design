package main.ast.nodes.function;

import main.ast.nodes.expression.IdentifierExpression;
import main.visitor.IVisitor;
import main.ast.nodes.function.DirectDeclarator;
public class IdentifierDeclarator extends DirectDeclarator {
//public class Declarator extends AbstractDeclarator {

    private IdentifierExpression identifierExpression;

    public IdentifierDeclarator() {}

    public IdentifierExpression getIdentifierExpression() { return identifierExpression; }

    public void setIdentifierExpression(IdentifierExpression identifier) { this.identifierExpression = identifier; }

   @Override
   public <T> T accept(IVisitor<T> visitor) {
       return visitor.visit(this);
   }


}
