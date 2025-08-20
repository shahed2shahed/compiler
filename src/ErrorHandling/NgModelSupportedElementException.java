package ErrorHandling;
import SymbolTableStructure.SymbolTable;

public class NgModelSupportedElementException extends Exception {
    private SymbolTable table;

    public NgModelSupportedElementException(String message) {
        super(message);
    }

    public SymbolTable getTable() {
        return table;
    }
}
