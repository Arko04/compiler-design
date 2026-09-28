package main.ast.nodes.type;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class TypeSpecifier extends Node {

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;
    public TypeSpecifier(String type) { this.type = type; }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
