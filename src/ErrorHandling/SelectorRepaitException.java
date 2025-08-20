package ErrorHandling;
import SymbolTableStructure.SymbolTable;

public class SelectorRepaitException extends Exception {
    private SymbolTable table;


    public SelectorRepaitException(String message) {
        super(message);
        this.table = table;
    }
}
