package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class AssignmentExpression extends Expression {
    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    private Expression left;

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    private Expression right;


    public AssignmentOperator getAssignmentOperator() {
        return assignmentOperator;
    }

    public void setAssignmentOperator(AssignmentOperator assignmentOperator) {
        this.assignmentOperator = assignmentOperator;
    }

    private AssignmentOperator assignmentOperator;
//    public AssignmentExpression() {}
    public AssignmentExpression(Expression left, Expression right, AssignmentOperator operator) {
        this.left = left;
        this.right = right;
        this.assignmentOperator = operator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
