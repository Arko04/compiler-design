package main.ast.nodes.function;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;
import main.ast.nodes.function.DirectDeclarator;

public class ArrayDeclarator extends DirectDeclarator {
//public class Declarator extends AbstractDeclarator {


    public DirectDeclarator getDirectDeclarator() {
        return directDeclarator;
    }

    public void setDirectDeclarator(DirectDeclarator directDeclarator) {
        this.directDeclarator = directDeclarator;
    }

    private DirectDeclarator directDeclarator;


    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    private Expression expression;

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
