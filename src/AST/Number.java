package AST;

public class Number extends Type {

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
    public String toString() {
        return value;
    }
}