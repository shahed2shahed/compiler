package AST;

public class InferredVariableDeclarationNode extends VariableDeclaration {
    private Expression value;

    public InferredVariableDeclarationNode(String variableType, String identifier, Expression value) {
        super(variableType, identifier);
        this.value = value;
    }

    public Expression getValue() {
        return value;
    }
}
