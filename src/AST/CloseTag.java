package AST;

public class CloseTag extends AstNode {
     String identifier;

    public CloseTag(String identifier) {
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
        return "</" + identifier + ">";
    }
}

