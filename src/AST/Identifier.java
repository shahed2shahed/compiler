package AST;

public class Identifier extends PrimitiveTypeNode {

    private String value;

    public Identifier(String value) {
        this.value = value;
    }

    public String getIdentifierNode() {
        return value;
    }

    public void setIdentifierNode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
