package main.ast.nodes.function;

import main.ast.nodes.Node;
import main.ast.nodes.declaration.AbstractDeclarator;
import main.ast.nodes.declaration.DeclarationSpecifiers;
import main.visitor.IVisitor;

public class ParameterDeclaration extends Node {

    public ParameterDeclaration() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public DeclarationSpecifiers getDeclarationSpecifiers() {
        return declarationSpecifiers;
    }

    public void setDeclarationSpecifiers(DeclarationSpecifiers declarationSpecifiers) {
        this.declarationSpecifiers = declarationSpecifiers;
    }

    private DeclarationSpecifiers declarationSpecifiers;

    public Declarator getDeclarator() {
        return declarator;
    }

    public void setDeclarator(Declarator declarator) {
        this.declarator = declarator;
    }

    private Declarator declarator;

    public AbstractDeclarator getAbstractDeclarator() {
        return abstractDeclarator;
    }

    public void setAbstractDeclarator(AbstractDeclarator abstractDeclarator) {
        this.abstractDeclarator = abstractDeclarator;
    }

    private AbstractDeclarator abstractDeclarator;
}
