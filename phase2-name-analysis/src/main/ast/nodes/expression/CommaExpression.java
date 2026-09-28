package main.ast.nodes.expression;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class CommaExpression extends Expression {

    public CommaExpression() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(ArrayList<Expression> expressions) {
        this.expressions = expressions;
    }

    public void addExpression(Expression expression) {
        this.expressions.add(expression);
    }

    ArrayList<Expression> expressions = new ArrayList<>();
}
