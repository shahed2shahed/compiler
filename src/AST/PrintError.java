package AST;

public class PrintError extends Node {
    private String console;
    private String error;
    private String identifier;

    public PrintError(String console, String error, String identifier) {
        this.console = console;
        this.error = error;
        this.identifier = identifier;
    }

    public String getConsole() {
        return console;
    }

    public String getError() {
        return error;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return "Print Error : " + console + "." + error + "(" + identifier + ")";
    }
}
