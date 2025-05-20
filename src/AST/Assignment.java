package AST;

public class Assignment extends Node {
     String identifier;
     Expression expression;
     Type type;


    public Assignment(String identifier, Expression expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    public Assignment(String identifier, Type type) {
        this.identifier = identifier;
        this.type = type;
    }

    public Assignment(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }


    public Expression getExpression() {
        return expression;
    }

    public Type getType() {
        return type;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Assignment: \n");
        builder.append("  Identifier: ").append(identifier).append("\n");

        if (expression != null) {
            builder.append("  Expression Assignment: ").append(expression).append("\n");
        }

        if (type != null) {
            builder.append("  Type Assignment: ").append(type).append("\n");
        }
        return builder.toString();
    }

}
