package AST;

public class Null extends Type{

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