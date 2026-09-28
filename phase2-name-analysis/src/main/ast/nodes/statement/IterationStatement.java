package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

public class IterationStatement extends Statement {

    public IterationStatement() {}

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

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    private Statement statement;

    public ForCondition getForCondition() {
        return forCondition;
    }

    public void setForCondition(ForCondition forCondition) {
        this.forCondition = forCondition;
    }

    private ForCondition forCondition;

    private SymbolTable symbolTable;
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

}
