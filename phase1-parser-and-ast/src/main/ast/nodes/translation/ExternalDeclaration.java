package main.ast.nodes.translation;

import main.ast.nodes.Node;
import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.function.FunctionDefinition;
import main.visitor.IVisitor;

public class ExternalDeclaration extends Node {

    public ExternalDeclaration() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public FunctionDefinition getFunctionDefinition() {
        return functionDefinition;
    }

    public void setFunctionDefinition(FunctionDefinition functionDefinition) {
        this.functionDefinition = functionDefinition;
    }

    private FunctionDefinition functionDefinition;

    public Declaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(Declaration declaration) {
        this.declaration = declaration;
    }

    private Declaration declaration;
}
