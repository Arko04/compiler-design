package main.ast.nodes.translation;

import main.ast.nodes.Node;
import main.ast.nodes.translation.ExternalDeclaration;
import main.visitor.IVisitor;
import java.util.ArrayList;


public class TranslationUnit extends Node {

    public TranslationUnit() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<ExternalDeclaration> getExternalDeclaration() {
        return externalDeclarations;
    }

    public void addExternalDeclaration(ExternalDeclaration externalDeclaration) {
        this.externalDeclarations.add(externalDeclaration);
    }

    public ArrayList<ExternalDeclaration> getExternalDeclarations() {
        return externalDeclarations;
    }

    public void setExternalDeclarations(ArrayList<ExternalDeclaration> externalDeclarations) {
        this.externalDeclarations = externalDeclarations;
    }

    private ArrayList<ExternalDeclaration> externalDeclarations = new ArrayList<>();
}
