package AST;

import java.util.ArrayList;
import java.util.List;

public class SubDotAssignment extends Assignment{
    List<Values> values;

    public SubDotAssignment() {
        this.values = new ArrayList<Values>();
    }

    public void addChild(Values node) {
        this.values.add(node);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("SubDotAssignment ");
        sb.append("\n");
        if (!values.isEmpty()) {
            sb.append(" values : ");
            for (Values child : this.values) {
                sb.append(child + "\n");
            }
        }

        return sb.toString();
    }
}
