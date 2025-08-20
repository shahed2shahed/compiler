package AST;

public class SimpleAssignment extends Assignment{
    Expression expression;

    public SimpleAssignment(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Simple Assignment :\n");

        sb.append("Expression : ").append(expression).append("\n");

        return sb.toString();
    }
}
