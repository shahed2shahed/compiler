package SymbolTableStructure;

import java.util.HashMap;

public class SymbolTable {

     HashMap<String, String> symbolTable;

    private ComponentSymbolTable componentSymbolTable = new ComponentSymbolTable();
    private SelectorRepait selectorRepait = new SelectorRepait();
    private EventBindingToNonFunction eventBindingToNonFunction = new EventBindingToNonFunction();
    private FormsModule formsModule = new FormsModule();

    public SymbolTable() {
        this.symbolTable = new HashMap<>();
    }

    public boolean check(String identifier) {
        return symbolTable.containsValue(identifier);
    }


    public void insert(String identifier, String type) {
        symbolTable.put(identifier, type);
    }

    public String getType(String identifier) {
        return symbolTable.get(identifier);
    }

    public void removeAll() {
        symbolTable.clear();
    }

    public HashMap<String, String> getTable() {
        return symbolTable;
    }

    public ComponentSymbolTable getComponentTable() {
        return componentSymbolTable;
    }

    public SelectorRepait getSelectorTable() {
        return selectorRepait;
    }

    public FormsModule getFormsModuleTracker() {
        return formsModule;
    }

    public EventBindingToNonFunction getEventBindingTable() {
        return eventBindingToNonFunction;
    }


@Override
public String toString() {
    return "[Symbol Table]\n" +
            selectorRepait.toString() + "\n" +
            componentSymbolTable.toString() + "\n" +
            eventBindingToNonFunction.toString() + "\n" +
            formsModule.toString() + "\n";

}
}