package AST;

import java.util.ArrayList;

public class Program {
    ArrayList<Object> children;

    public Program() {
        this.children = new ArrayList<>();
    }

    public void addChild(Object node) {
        this.children.add(node);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Program { \n");
        for (Object child : this.children) {
            sb.append(child + "\n");
        }
        sb.append("}\n");

        return sb.toString();
    }
}
