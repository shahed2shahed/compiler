package AST;

public class PrintError extends Body {
     String console;
     String error;
     Values identifier;

    public PrintError(String console, String error, Values identifier) {
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

    public Values getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return console + "." + error + "(" + identifier + ")";
    }
}
