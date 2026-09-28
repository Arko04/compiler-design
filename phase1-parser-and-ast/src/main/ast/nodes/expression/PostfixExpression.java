package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class PostfixExpression extends Expression {

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    private Expression expression;

    public String getPostfix() {
        return postfix;
    }

    public void setPostfix(String postfix) {
        this.postfix = postfix;
    }

    private String postfix;
    public PostfixExpression(Expression expression, String postfix) {
        this.expression = expression;
        this.postfix = postfix;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
