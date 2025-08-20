package AST;

public class IdentifierObjectProperty extends ObjectProperty {
    String identifier;
    Expression expression;
    public IdentifierObjectProperty(String identifier, Expression expression) {
        this.identifier = identifier;
        this.expression = expression;
    }
    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    public Expression getExpression() {
        return expression;
    }
    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Object Property :");
        builder.append("\n");
        builder.append("identifier");
        builder.append(identifier);
        builder.append("\n");
        builder.append("expression");
        builder.append(expression);
        builder.append("\n");
        return builder.toString();
    }
}
