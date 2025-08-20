package AST;

public class PrintStat extends Body {
     String console;
     String log;
     Values identifier;

    public PrintStat(String console, String log, Values identifier) {
        this.console = console;
        this.log = log;
        this.identifier = identifier;
    }

    public String getConsole() {
        return console;
    }

    public String getLog() {
        return log;
    }

    public Values getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return console + "." + log + "(" + identifier + ")";
    }
}
