package AST;

public class Null extends PrimitiveTypeNode{

    private String value;

    public Null(String value) {
        this.value = value;
    }

    public String getNullNode() {
        return value;
    }

    public void setNullNode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}