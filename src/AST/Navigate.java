package AST;

import java.util.ArrayList;

public class Navigate extends Expression {
    ArrayList<Values> children;

    public Navigate() {
        this.children = new ArrayList<>();
    }

    public void addChild(Values node) {
        this.children.add(node);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Navigate { \n");
        for (Values child : this.children) {
            sb.append(child + "\n");
        }
        sb.append("}\n");

        return sb.toString();
    }
}
