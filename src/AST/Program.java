package AST;

import java.util.ArrayList;

public class Program extends AstNode {

    ArrayList<StatementNode> children;

    public Program() {
        this.children = new ArrayList<>();
    }

    public void addChild(StatementNode node) {
        this.children.add(node);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Program { \n");
        for (StatementNode child : this.children) {
            sb.append(child + "\n");
        }
        sb.append("}\n");

        return sb.toString();
    }
}
