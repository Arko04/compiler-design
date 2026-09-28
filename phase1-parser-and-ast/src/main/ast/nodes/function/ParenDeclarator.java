package main.ast.nodes.function;

import main.ast.nodes.Node;
import main.ast.nodes.declaration.Pointer;
import main.visitor.IVisitor;
import main.ast.nodes.function.DirectDeclarator;


public class ParenDeclarator extends DirectDeclarator {
//public class Declarator extends AbstractDeclarator {

    private Declarator declarator;

    public Declarator getDeclarator() { return declarator; }

    public void setDeclarator(Declarator declarator) { this.declarator = declarator; }

   @Override
   public <T> T accept(IVisitor<T> visitor) {
       return visitor.visit(this);
   }

}
