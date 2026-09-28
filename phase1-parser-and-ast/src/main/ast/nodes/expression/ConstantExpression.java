package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class ConstantExpression extends Expression {

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;
    public ConstantExpression(String value) { this.value = value; }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
