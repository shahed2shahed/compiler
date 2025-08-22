package AST;

public class StringExpression extends PrimitiveTypeNode {
    private String value;

    public StringExpression(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
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
        return  value ;
    }
}
