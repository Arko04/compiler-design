package main.ast.nodes.function;

import main.ast.nodes.Node;
import main.ast.nodes.declaration.AbstractDeclarator;
import main.ast.nodes.declaration.Pointer;
import main.visitor.IVisitor;

 public class Declarator extends Node {
//public class Declarator extends AbstractDeclarator {

    public Declarator() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

     public Pointer getPointer() {
         return pointer;
     }

     public void setPointer(Pointer pointer) {
         this.pointer = pointer;
     }

     private Pointer pointer;

     public DirectDeclarator getDirectDeclarator() {
         return directDeclarator;
     }

     public void setDirectDeclarator(DirectDeclarator directDeclarator) {
         this.directDeclarator = directDeclarator;
     }

     private DirectDeclarator directDeclarator;
}
