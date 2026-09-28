package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class InitDeclaratorList extends Node {

    public InitDeclaratorList() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<InitDeclarator> getInitDeclarators() {
        return initDeclarators;
    }

    public void setInitDeclarators(ArrayList<InitDeclarator> initDeclarators) {
        this.initDeclarators = initDeclarators;
    }

    public void addInitDeclarator(InitDeclarator initDeclarator) {
        this.initDeclarators.add(initDeclarator);
    }

    ArrayList<InitDeclarator> initDeclarators =  new ArrayList<>();

}
