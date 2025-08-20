package ErrorHandling;
import SymbolTableStructure.SymbolTable;

public class FormsModuleException extends Exception {
    private SymbolTable table;
    public FormsModuleException(String message) {
        super(message);
        this.table = table;
    }

    public SymbolTable getTable() {
        return table;
    }
}
