package AST;

public class ExportsObjectProperty extends ObjectProperty {
    String exports;
    Expression expression;
    public ExportsObjectProperty(String exports, Expression expression) {
        this.exports = exports;
        this.expression = expression;
    }
    public String getExports() {
        return exports;
    }
    public void setExports(String exports) {
        this.exports = exports;
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
        builder.append("exports");
        builder.append(exports);
        builder.append("\n");
        builder.append("expression");
        builder.append(expression);
        builder.append("\n");
        return builder.toString();
    }
}
