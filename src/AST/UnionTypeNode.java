package AST;

public class UnionTypeNode extends AstNode {
    private Type left;
    private Type right; // يمكن أن تكون null

    public UnionTypeNode(Type left, Type right) {
        this.left = left;
        this.right = right;
    }

    public Type getLeft() {
        return left;
    }

    public Type getRight() {
        return right;
    }

    public boolean isUnion() {
        return right != null;
    }
}
