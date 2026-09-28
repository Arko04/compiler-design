package main.ast.nodes.initializer;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class InitializerList extends Node {

    public InitializerList() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }


    public ArrayList<Designation> getDesignations() {
        return designations;
    }

    public void setDesignations(ArrayList<Designation> designations) {
        this.designations = designations;
    }

    public void addDesignation(Designation designation) {
        this.designations.add(designation);
    }

    private ArrayList<Designation> designations = new ArrayList<>();


    public ArrayList<Initializer> getInitializers() {
        return initializers;
    }

    public void setInitializers(ArrayList<Initializer> initializers) {
        this.initializers = initializers;
    }

    public void addInitializer(Initializer initializer) {
        this.initializers.add(initializer);
    }

    private ArrayList<Initializer> initializers = new ArrayList<>();



}
