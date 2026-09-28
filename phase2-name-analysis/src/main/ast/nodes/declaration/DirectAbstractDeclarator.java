package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.function.ParameterList;
import main.visitor.IVisitor;

public class DirectAbstractDeclarator extends Node {
    public DirectAbstractDeclarator() {}

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

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    private ParameterList parameterList;

    public AbstractDeclarator getAbstractDeclarator() {
        return abstractDeclarator;
    }

    public void setAbstractDeclarator(AbstractDeclarator abstractDeclarator) {
        this.abstractDeclarator = abstractDeclarator;
    }

    private AbstractDeclarator abstractDeclarator;

    public DirectAbstractDeclarator getDirectAbstractDeclarator() {
        return directAbstractDeclarator;
    }

    public void setDirectAbstractDeclarator(DirectAbstractDeclarator directAbstractDeclarator) {
        this.directAbstractDeclarator = directAbstractDeclarator;
    }

    private DirectAbstractDeclarator directAbstractDeclarator;

}
