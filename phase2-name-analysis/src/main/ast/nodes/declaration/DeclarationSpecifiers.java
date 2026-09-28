package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class DeclarationSpecifiers extends Node {

    public DeclarationSpecifiers() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<DeclarationSpecifier> getDeclarationSpecifiers() {
        return declarationSpecifiers;
    }

    public void setDeclarationSpecifiers(ArrayList<DeclarationSpecifier> declarationSpecifiers) {
        this.declarationSpecifiers = declarationSpecifiers;
    }

    public void addDeclarationSpecifier(DeclarationSpecifier declarationSpecifier) {
        this.declarationSpecifiers.add(declarationSpecifier);
    }

    ArrayList<DeclarationSpecifier> declarationSpecifiers = new ArrayList<>();
}
