package main.ast.nodes.function;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ParameterList extends Node {

    public ParameterList() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<ParameterDeclaration> getParameterDeclarations() {
        return parameterDeclarations;
    }

    public void setParameterDeclarations(ArrayList<ParameterDeclaration> parameterDeclarations) {
        this.parameterDeclarations = parameterDeclarations;
    }

    public void addParameterDeclaration(ParameterDeclaration parameterDeclaration) {
        this.parameterDeclarations.add(parameterDeclaration);
    }


    ArrayList<ParameterDeclaration> parameterDeclarations = new ArrayList<>();
}
