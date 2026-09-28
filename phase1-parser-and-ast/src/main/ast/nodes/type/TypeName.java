package main.ast.nodes.type;

import main.ast.nodes.Node;
import main.ast.nodes.declaration.AbstractDeclarator;
import main.visitor.IVisitor;

public class TypeName extends Node {

    public TypeName() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public SpecifierQualifierList getSpecifierQualifierList() {
        return specifierQualifierList;
    }

    public void setSpecifierQualifierList(SpecifierQualifierList specifierQualifierList) {
        this.specifierQualifierList = specifierQualifierList;
    }

    private SpecifierQualifierList specifierQualifierList;

    public AbstractDeclarator getAbstractDeclarator() {
        return abstractDeclarator;
    }

    public void setAbstractDeclarator(AbstractDeclarator abstractDeclarator) {
        this.abstractDeclarator = abstractDeclarator;
    }

    private AbstractDeclarator abstractDeclarator;
}
