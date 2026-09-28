package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class ParenExpression extends Expression {

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    private Expression expression;
    public ParenExpression(Expression expression) {this.expression = expression;}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
