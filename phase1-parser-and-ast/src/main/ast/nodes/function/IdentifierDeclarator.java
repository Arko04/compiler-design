package main.ast.nodes.function;

import main.visitor.IVisitor;
import main.ast.nodes.function.DirectDeclarator;
public class IdentifierDeclarator extends DirectDeclarator {
//public class Declarator extends AbstractDeclarator {

    private String identifier;

    public IdentifierDeclarator() {}

    public String getIdentifier() { return identifier; }

    public void setIdentifier(String identifier) { this.identifier = identifier; }

   @Override
   public <T> T accept(IVisitor<T> visitor) {
       return visitor.visit(this);
   }


}
