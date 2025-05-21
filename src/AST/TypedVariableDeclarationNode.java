package AST;

public class TypedVariableDeclarationNode extends VariableDeclaration {
    private UnionTypeNode unionType;
    private Expression value;

    public TypedVariableDeclarationNode(String variableType, String identifier, UnionTypeNode unionType, Expression value) {
        super(variableType, identifier);
        this.unionType = unionType;
        this.value = value;
    }

    public UnionTypeNode getUnionType() {
        return unionType;
    }

    public Expression getValue() {
        return value;
    }
}
