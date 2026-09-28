
package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class FunctionCallExpression extends Expression {

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    private Expression expression;

    public ArgumentExpressionList getArgumentExpressionList() {
        return argumentExpressionList;
    }

    public void setArgumentExpressionList(ArgumentExpressionList argumentExpressionList) {
        this.argumentExpressionList = argumentExpressionList;
    }

    private ArgumentExpressionList argumentExpressionList;
    public FunctionCallExpression() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
