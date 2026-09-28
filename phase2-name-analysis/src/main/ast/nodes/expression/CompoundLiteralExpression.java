package main.ast.nodes.expression;

import main.ast.nodes.initializer.InitializerList;
import main.ast.nodes.type.TypeName;
import main.visitor.IVisitor;

public class CompoundLiteralExpression extends Expression {

    public CompoundLiteralExpression() { }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public TypeName getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeName typeName) {
        this.typeName = typeName;
    }

    private TypeName typeName;

    public InitializerList getInitializerList() {
        return initializerList;
    }

    public void setInitializerList(InitializerList initializerList) {
        this.initializerList = initializerList;
    }

    private InitializerList initializerList;

}
