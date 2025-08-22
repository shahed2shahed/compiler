package AST;

public class Number extends PrimitiveTypeNode {

    private String value;

    public Number(String value) {
        this.value = value;
    }

    public String getNumberNode() {
        return value;
    }

    public void setNumberNode(String value) {
        this.value = value;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        return sb.toString();
    }

    @Override
    public String toString() {
        return value;
    }
}