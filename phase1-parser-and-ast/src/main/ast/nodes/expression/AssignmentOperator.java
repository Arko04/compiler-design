package main.ast.nodes.expression;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class AssignmentOperator extends Node {

    public AssignmentOperator() {
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {return visitor.visit(this); }
    // Enum for assignment operators
//    public enum Operator {
//        ASSIGN,
//        STAR_ASSIGN,
//        DIV_ASSIGN,
//        MOD_ASSIGN,
//        PLUS_ASSIGN,
//        MINUS_ASSIGN,
//        LEFT_SHIFT_ASSIGN,
//        RIGHT_SHIFT_ASSIGN,
//        AND_ASSIGN,
//        XOR_ASSIGN,
//        OR_ASSIGN
//    }
    //private Operator operator
    private String operator;
    // Setter for the operator
    public void setOperator(String operator) {
        this.operator = operator;
    }

    // Getter for the operator
    public String getOperator() {
        return this.operator;
    }
}
