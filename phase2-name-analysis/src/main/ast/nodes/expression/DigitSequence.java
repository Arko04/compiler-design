package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class DigitSequence extends Expression {

    public String getDigits() {
        return digits;
    }

    public void setDigits(String digits) {
        this.digits = digits;
    }

    private String digits;
    public DigitSequence(String _digits) {this.digits = _digits;}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
