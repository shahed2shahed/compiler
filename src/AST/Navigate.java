package AST;

import java.util.ArrayList;

public class Navigate extends Expression {
    ArrayList<Content> children;

    public Navigate() {
        this.children = new ArrayList<>();
    }

    public void addChild(Content node) {
        this.children.add(node);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Navigate { \n");
        for (Content child : this.children) {
            sb.append(child + "\n");
        }
        sb.append("}\n");

        return sb.toString();
    }
}
