package main.ast.nodes.expression;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class ForExpression extends Expression {

    public ForExpression(){}

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

    private ArrayList<Expression> expressions = new ArrayList<>();

}
