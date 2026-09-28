package main.ast.nodes.expression;

import main.visitor.IVisitor;
import java.util.List;

public class StringLiteralExpression extends Expression {
    public List<String> getParts() {
        return parts;
    }

    public void setParts(List<String> parts) {
        this.parts = parts;
    }

    private List<String> parts;
    public StringLiteralExpression(List<String> parts) { this.parts = parts; }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
