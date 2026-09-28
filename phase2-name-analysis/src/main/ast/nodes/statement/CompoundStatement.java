package main.ast.nodes.statement;

import main.ast.nodes.Node;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class CompoundStatement extends Statement {

    public CompoundStatement() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<BlockItem> getBlockItems() {
        return blockItems;
    }

    public void setBlockItems(ArrayList<BlockItem> blockItems) {
        this.blockItems = blockItems;
    }

    public void addBlockItem(BlockItem blockItem) {
        this.blockItems.add(blockItem);
    }

    ArrayList<BlockItem> blockItems = new ArrayList<>();

    private SymbolTable symbolTable;
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

}
