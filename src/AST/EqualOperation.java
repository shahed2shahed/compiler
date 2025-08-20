package AST;

public class EqualOperation extends AstNode {
    String equalT;

    public EqualOperation(String equalT) {
        this.equalT = equalT;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(equalT).append("\n");
        return sb.toString();
    }
}
