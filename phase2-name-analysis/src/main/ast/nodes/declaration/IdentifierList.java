package main.ast.nodes.declaration;

import main.ast.nodes.expression.IdentifierExpression;
import main.ast.nodes.statement.BlockItem;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class IdentifierList extends BlockItem {

    public IdentifierList() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<IdentifierExpression> getIdentifierExpressions() {
        return identifierExpressions;
    }

    public void setIdentifierExpressions(ArrayList<IdentifierExpression> identifierExpressions) {
        this.identifierExpressions = identifierExpressions;
    }

    public void addIdentifierExpression(IdentifierExpression identifierExpression) {
        this.identifierExpressions.add(identifierExpression);
    }

    ArrayList<IdentifierExpression> identifierExpressions =  new ArrayList<>();
}
