package AST;

public class VariableType {
    private String value;

    public VariableType(String value) {
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
