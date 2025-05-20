package AST;

import java.util.List;

public class ClassBody extends Node {

      Node bodyElements;

    public ClassBody(Node bodyElements) {
        this.bodyElements = bodyElements;
    }

    @Override
    public String toString() {
        if (bodyElements == null) {
            return "Class Body: [Empty]";
        }
        StringBuilder sb = new StringBuilder();
            sb.append("  ").append(bodyElements).append("\n");
        return sb.toString();
    }
}
