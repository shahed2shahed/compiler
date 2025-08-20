package AST;

public class UnionTypeNode extends AstNode {
    private Type left;
    private Type right;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Typed Variable Declaration :\n");
        if (right != null) {
            sb.append(right).append("\n");

        } else {
            sb.append(" No  type \n");

        }
        sb.append(left).append("\n");
        return sb.toString();
    }
}
