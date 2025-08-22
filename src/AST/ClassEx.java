package AST;

public class ClassEx extends PrimitiveTypeNode {
    private String value;

    public ClassEx(String value) {
        this.value = value;
    }

    public String getClassNode() {
        return value;
    }

    public void setClassNode(String value) {
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