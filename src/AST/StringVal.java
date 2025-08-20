package AST;

public class StringVal extends Expression{
    private String value;

    public StringVal(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return value;
    }
}
