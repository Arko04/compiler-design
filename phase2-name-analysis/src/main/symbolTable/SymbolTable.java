package main.symbolTable;


import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.item.SymbolTableItem;

import java.util.*;


public class SymbolTable {

    //Start of static members

    public static SymbolTable top;
    public static SymbolTable root;
    private static Stack<SymbolTable> stack = new Stack<>();

    public static void push(SymbolTable symbolTable) {
        if (top != null)
            stack.push(top);
        top = symbolTable;
    }

    public static void pop() {
        top = stack.pop();
    }

    public SymbolTable pre;
    public Map<String, SymbolTableItem> items;

    public SymbolTable() {
        this(null);
    }

    public SymbolTable(SymbolTable pre) {
        this.pre = pre;
        this.items = new HashMap<>();
    }

    public static Stack<SymbolTable> getStack() {
        return stack;
    }

    public void put(SymbolTableItem item) throws ItemAlreadyExistsException {
        if (items.containsKey(item.getKey()))
            throw new ItemAlreadyExistsException();
        items.put(item.getKey(), item);
    }

    public SymbolTableItem getItem(String key) throws ItemNotFoundException {
        SymbolTable currentSymbolTable = this;

        while(currentSymbolTable != null) {
            SymbolTableItem symbolTableItem = currentSymbolTable.items.get(key);
            if( symbolTableItem != null )
                return symbolTableItem;
            currentSymbolTable = currentSymbolTable.pre;
        }
        throw new ItemNotFoundException();
    }

    // In your SymbolTable.java
/*
    @Override
    public String toString() { // Or a more descriptive name like toDebugString()
        StringBuilder sb = new StringBuilder();
        sb.append("SymbolTable@").append(Integer.toHexString(hashCode()));
        if (this.pre != null) { // Assuming 'parent' is the field for the parent SymbolTable
            sb.append(" (Parent: SymbolTable@").append(Integer.toHexString(this.pre.hashCode())).append(")\n");
        } else {
            sb.append(" (Global Scope, Parent: null)\n");
        }
        if (this.items.isEmpty()) { // Assuming 'items' is your Map<String, SymbolTableItem>
            sb.append("  Items: <empty>\n");
        } else {
            sb.append("  Items:\n");
            for (java.util.Map.Entry<String, main.symbolTable.item.SymbolTableItem> entry : this.items.entrySet()) {
                sb.append("    - Key: '").append(entry.getKey()).append("', ItemType: ").append(entry.getValue().getClass().getSimpleName()).append("\n");
            }
        }
        return sb.toString();
    }

 */

    public int getItemsSize() {
        return this.items.size();
    }
}
