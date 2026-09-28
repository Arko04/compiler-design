package main.ast.nodes.program;

import main.ast.nodes.Node;
import main.ast.nodes.translation.TranslationUnit;
import main.visitor.IVisitor;

public class Program extends Node {
    
    public Program() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public TranslationUnit getTranslationUnit() {
        return translationUnit;
    }

    public void setTranslationUnit(TranslationUnit translationUnit) {
        this.translationUnit = translationUnit;
    }

    private TranslationUnit translationUnit;
}
