package AST;

import java.util.ArrayList;
import java.util.List;

public class ParaValue extends ParametersType{
    Values left;
    List<Type> type;
    List<Values> right;

    public ParaValue(Values left, List<Type> type, List<Values> right) {
        this.left = left;
        this.type = new ArrayList<>();
        this.right = new ArrayList<>();
    }

    public ParaValue(Values left) {
        this.left = left;
    }

    public void addChildType(Type node) {
        this.type.add(node);
    }

    public void addChildValues(Values node) {
        this.right.add(node);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Parameters :");
        sb.append("\n");

        sb.append("Left Value: ");
        sb.append(left.toString());
        sb.append("\n");

        if (!type.isEmpty()) {
            sb.append("Type : ");
            for (Type child : this.type) {
                sb.append(child + "\n");
            }
        }
        if (!right.isEmpty()) {
            sb.append("Right Value: ");
            for (Values child : this.right) {
                sb.append(child + "\n");
            }
        }

        return sb.toString();
    }
}
