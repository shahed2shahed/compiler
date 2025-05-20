package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionBody{
    ArrayList<Object> children;

    public FunctionBody() {
        this.children = new ArrayList<>();
    }

    public void addChild(Object node) {
        this.children.add(node);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(" { \n");
        for (Object child : this.children) {
            sb.append(child + "\n");
        }
        sb.append("}\n");

        return sb.toString();
    }
}
