package AST;

public class PrintStat extends ClassPropertyNode {
    private String console;
    private String log;
    private String identifier;

    public PrintStat(String console, String log, String identifier) {
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

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return "Print Statement : "+ console + "." + log + "(" + identifier + ")";
    }
}
