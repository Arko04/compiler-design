package main.ast.nodes.function;

import main.ast.nodes.Node;
import main.ast.nodes.declaration.DeclarationList;
import main.ast.nodes.declaration.DeclarationSpecifiers;
import main.ast.nodes.statement.CompoundStatement;
import main.visitor.IVisitor;

public class FunctionDefinition extends Node {

    public FunctionDefinition() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public DeclarationSpecifiers getDeclarationSpecifiers() {
        return declarationSpecifiers;
    }

    public void setDeclarationSpecifiers(DeclarationSpecifiers declarationSpecifiers) {
        this.declarationSpecifiers = declarationSpecifiers;
    }

    private DeclarationSpecifiers declarationSpecifiers;

    public Declarator getDeclarator() {
        return declarator;
    }

    public void setDeclarator(Declarator declarator) {
        this.declarator = declarator;
    }

    private Declarator declarator;

    public DeclarationList getDeclarationList() {
        return declarationList;
    }

    public void setDeclarationList(DeclarationList declarationList) {
        this.declarationList = declarationList;
    }

    private DeclarationList declarationList;

    public CompoundStatement getCompoundStatement() {
        return compoundStatement;
    }

    public void setCompoundStatement(CompoundStatement compoundStatement) {
        this.compoundStatement = compoundStatement;
    }

    private CompoundStatement compoundStatement;

}
