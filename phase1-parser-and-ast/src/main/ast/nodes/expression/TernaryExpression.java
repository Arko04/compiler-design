package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class TernaryExpression extends Expression {

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    private Expression condition;

    public Expression getThenExpression() {
        return thenExpression;
    }

    public void setThenExpression(Expression thenExpression) {
        this.thenExpression = thenExpression;
    }

    private Expression thenExpression;

    public Expression getElseExpression() {
        return elseExpression;
    }

    public void setElseExpression(Expression elseExpression) {
        this.elseExpression = elseExpression;
    }

    private Expression elseExpression;
    public TernaryExpression(Expression condition, Expression thenExpr, Expression elseExpr) {
        this.condition = condition;
        this.thenExpression = thenExpr;
        this.elseExpression = elseExpr;
    }


    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
