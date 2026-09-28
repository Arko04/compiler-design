package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class ArrayAccessExpression extends Expression {

    public Expression getOuterExpression() {
        return outerExpression;
    }

    public void setOuterExpression(Expression outterExpression) {
        this.outerExpression = outterExpression;
    }

    private Expression outerExpression;

    public Expression getInnerExpression() {
        return innerExpression;
    }

    public void setInnerExpression(Expression innerExpression) {
        this.innerExpression = innerExpression;
    }

    private Expression innerExpression;
    public ArrayAccessExpression() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
