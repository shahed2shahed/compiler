package ErrorHandling;
import SymbolTableStructure.SymbolTable;

public class EventBindingException extends Exception {
    private SymbolTable table;
    public EventBindingException(String message) {
        super(message);
        this.table = table;
    }

    public SymbolTable getTable() {
        return table;
    }
}
