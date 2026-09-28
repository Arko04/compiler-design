package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

public class SelectionStatement extends Statement {

    public SelectionStatement() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    private Expression expression;

    public Statement getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(Statement ifStatement) {
        this.ifStatement = ifStatement;
    }

    private Statement ifStatement;

    public Statement getElseStatement() {
        return elseStatement;
    }

    public void setElseStatement(Statement elseStatement) {
        this.elseStatement = elseStatement;
    }

    private Statement elseStatement;

}
