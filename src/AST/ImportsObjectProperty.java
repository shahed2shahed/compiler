package AST;

public class ImportsObjectProperty extends ObjectProperty {
    String imports;
    Expression expression;
    public ImportsObjectProperty(String imports, Expression expression) {
        this.imports = imports;
        this.expression = expression;
    }
    public String getImports() {
        return imports;
    }
    public void setImports(String imports) {
        this.imports = imports;
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
        builder.append("imports");
        builder.append(imports);
        builder.append("\n");
        builder.append("expression");
        builder.append(expression);
        builder.append("\n");
        return builder.toString();
    }
}
