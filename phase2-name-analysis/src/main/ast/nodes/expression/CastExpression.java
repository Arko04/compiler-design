package main.ast.nodes.expression;

import main.ast.nodes.type.TypeName;
import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class CastExpression extends Node {

    public CastExpression() { }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public CastExpression getCastExpression() {
        return castExpression;
    }

    public void setCastExpression(CastExpression castExpression) {
        this.castExpression = castExpression;
    }

    private CastExpression castExpression;

    public TypeName getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeName typeName) {
        this.typeName = typeName;
    }

    private TypeName typeName;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    private Expression expression;

    public DigitSequence getDigitSequence() {
        return digitSequence;
    }

    public void setDigitSequence(DigitSequence digitSequence) {
        this.digitSequence = digitSequence;
    }

    private DigitSequence digitSequence;
}
