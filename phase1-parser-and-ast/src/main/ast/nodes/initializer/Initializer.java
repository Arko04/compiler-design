package main.ast.nodes.initializer;

import main.ast.nodes.Node;
import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

public class Initializer extends Node {

    public Initializer() {}

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

    public InitializerList getInitializerList() {
        return initializerList;
    }

    public void setInitializerList(InitializerList initializerList) {
        this.initializerList = initializerList;
    }

    private InitializerList initializerList;





}
