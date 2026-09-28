package main.ast.nodes.declaration;

import main.ast.nodes.statement.BlockItem;
import main.visitor.IVisitor;

public class Pointer extends BlockItem {

    public Pointer() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }


}
