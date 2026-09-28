package main.ast.nodes.type;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class SpecifierQualifierList extends Node {

    public SpecifierQualifierList() {}

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

    public SpecifierQualifierList getSpecifierQualifierList() {
        return specifierQualifierList;
    }

    public void setSpecifierQualifierList(SpecifierQualifierList specifierQualifierList) {
        this.specifierQualifierList = specifierQualifierList;
    }

    private SpecifierQualifierList specifierQualifierList;
}
