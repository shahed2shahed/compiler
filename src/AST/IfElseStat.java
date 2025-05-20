package AST;

public class IfElseStat extends Expression {
    private String identifier;
    private Type type1;
    private Type type2;

    public IfElseStat(String identifier, Type type1, Type type2) {
        this.identifier = identifier;
        this.type1 = type1;
        this.type2 = type2;
    }

    @Override
    public String toString() {
        return identifier + " ? " + type1.toString() + " : " + type2.toString();
    }
}
