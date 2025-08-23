package AST;

public class CloseTag extends NormalHtmlTagNode {
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
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(identifier);
        return sb.toString();
    }

    @Override
    public String toString() {
        return "</" + identifier + ">";
    }
}

