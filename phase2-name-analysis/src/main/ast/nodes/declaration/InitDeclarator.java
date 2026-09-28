package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.ast.nodes.function.Declarator;
import main.ast.nodes.initializer.Initializer;
import main.visitor.IVisitor;

public class InitDeclarator extends AbstractDeclarator {

    public InitDeclarator() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Declarator getDeclarator() {
        return declarator;
    }

    public void setDeclarator(Declarator declarator) {
        this.declarator = declarator;
    }

    private Declarator declarator;

    public Initializer getInitializer() {
        return initializer;
    }

    public void setInitializer(Initializer initializer) {
        this.initializer = initializer;
    }

    private Initializer initializer;

}
