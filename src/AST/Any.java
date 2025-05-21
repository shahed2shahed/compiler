package AST;

public class Any extends PrimitiveTypeNode {
    private String value;

    public Any(String value) {
        this.value = value;
    }

    public String getAnyNode() {
        return value;
    }

    public void setAnyNode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Any { value: " + value + " }";
    }


    ////test
    int x =0;
}