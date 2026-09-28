package main.ast.nodes.expression;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class UnaryOperator extends Node {

    public UnaryOperator(String unaryOperator) {
        this.unaryOperator = unaryOperator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String getUnaryOperator() {
        return unaryOperator;
    }

    public void setUnaryOperator(String unaryOperator) {
        this.unaryOperator = unaryOperator;
    }

    private String unaryOperator;
}
