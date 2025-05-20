package AST;

public class BooleanVal extends Expression {
     String  value;

    public BooleanVal(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return " Boolean Value\n" + value;
    }

}
