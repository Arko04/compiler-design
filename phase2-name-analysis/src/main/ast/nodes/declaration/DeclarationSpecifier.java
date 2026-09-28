package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.ast.nodes.type.TypeSpecifier;
import main.visitor.IVisitor;

public class DeclarationSpecifier extends Node {

    public DeclarationSpecifier() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public TypeSpecifier getTypeSpecifier() {
        return typeSpecifier;
    }

    public void setTypeSpecifier(TypeSpecifier typeSpecifier) {
        this.typeSpecifier = typeSpecifier;
    }

    private TypeSpecifier typeSpecifier;
}
