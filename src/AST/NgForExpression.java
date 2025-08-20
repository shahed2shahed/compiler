package AST;

public class NgForExpression extends AstNode {
    private String identifier;

    public NgForExpression(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ng For Expression { \n");
        sb.append(identifier + "\n");
        sb.append("}\n");

        return sb.toString();

    }
}
