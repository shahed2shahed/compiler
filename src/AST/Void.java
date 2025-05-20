package AST;

public class Void extends Type {

    private String value;

    public Void(String value) {
        this.value = value;
    }

    public String getVoidNode() {
        return value;
    }

    public void setVoidNode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}