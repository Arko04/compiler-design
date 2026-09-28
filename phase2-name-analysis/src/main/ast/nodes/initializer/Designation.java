package main.ast.nodes.initializer;

import main.ast.nodes.Node;
import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class Designation extends Node {

    public Designation() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Designator> getDesignators() {
        return designators;
    }

    public void setDesignators(ArrayList<Designator> designators) {
        this.designators = designators;
    }

    public void addDesignator(Designator designator) {
        this.designators.add(designator);
    }

    ArrayList<Designator>  designators;

}
