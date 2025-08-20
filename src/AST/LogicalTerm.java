package AST;

public class LogicalTerm extends AstNode{
    private String string;

    public LogicalTerm(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(" { \n");
        sb.append(string + "\n");
        sb.append("}\n");

        return sb.toString();
    }
}
