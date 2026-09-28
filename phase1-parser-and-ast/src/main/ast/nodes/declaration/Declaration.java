package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.ast.nodes.statement.BlockItem;
import main.visitor.IVisitor;

public class Declaration extends BlockItem {

    public Declaration() {}

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

    public InitDeclaratorList getInitDeclaratorList() {
        return initDeclaratorList;
    }

    public void setInitDeclaratorList(InitDeclaratorList initDeclaratorList) {
        this.initDeclaratorList = initDeclaratorList;
    }

    private InitDeclaratorList initDeclaratorList;
}
