package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class DeclarationList extends Node {

    public DeclarationList() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public void addDeclaration(Declaration declaration)
    {
        declarations.add(declaration);
    }

    public ArrayList<Declaration> getDeclarations() {
        return declarations;
    }

    public void setDeclarations(ArrayList<Declaration> declarations) {
        this.declarations = declarations;
    }

    private ArrayList<Declaration> declarations =  new ArrayList<>();

}
