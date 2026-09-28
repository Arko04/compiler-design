package main.ast.nodes.statement;

import main.ast.nodes.declaration.ForDeclaration;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.ForExpression;
import main.visitor.IVisitor;

public class ForCondition extends Statement {

    public ForCondition() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ForDeclaration getForDeclaration() {
        return forDeclaration;
    }

    public void setForDeclaration(ForDeclaration forDeclaration) {
        this.forDeclaration = forDeclaration;
    }

    private ForDeclaration forDeclaration;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    private Expression expression;

    public ForExpression getForExpression1() {
        return forExpression1;
    }

    public void setForExpression1(ForExpression forExpression1) {
        this.forExpression1 = forExpression1;
    }

    private ForExpression forExpression1;

    public ForExpression getForExpression2() {
        return forExpression2;
    }

    public void setForExpression2(ForExpression forExpression2) {
        this.forExpression2 = forExpression2;
    }

    private ForExpression forExpression2;


}
