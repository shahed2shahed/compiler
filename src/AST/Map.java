package AST;

import java.util.ArrayList;
import java.util.List;

public class Map extends Type{
    List<Values> right;

    public Map() {
        this.right = new ArrayList<>();
    }

    public void addChild(Values node) {
        this.right.add(node);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Map :");
        sb.append("\n");

        if (!right.isEmpty()) {
            sb.append("Values : ");
            for (Values child : this.right) {
                sb.append(child + "\n");
            }
        }

        return sb.toString();
    }
}
