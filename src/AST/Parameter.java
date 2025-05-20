package AST;


public class Parameter extends Node {
    private String identifier;
    private Type type;

    public Parameter(String identifier, Type type) {
        this.identifier = identifier;
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return identifier + ": " + type.toString();
    }
}
