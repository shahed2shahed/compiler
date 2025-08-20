package ErrorHandling;
import SymbolTableStructure.SymbolTable;

public class CommonModuleException extends Exception {
    private SymbolTable table;

    public CommonModuleException(String message) {
        super(message);
        this.table = table;
    }

    public SymbolTable getTable() {
        return table;
    }
}


