package main.ast.nodes.expression;

import main.ast.nodes.initializer.InitializerList;
import main.ast.nodes.type.TypeName;
import main.visitor.IVisitor;

public class TypeCastExpression extends Expression {

    public TypeCastExpression() { }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public TypeName getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeName typeName) {
        this.typeName = typeName;
    }

    private TypeName typeName;

    public CastExpression getCastExpression() {
        return castExpression;
    }

    public void setCastExpression(CastExpression castExpression) {
        this.castExpression = castExpression;
    }

    private CastExpression castExpression;

}
