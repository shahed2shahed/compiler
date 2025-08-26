package AST;

import java.util.ArrayList;
import java.util.List;

public class ParaHasPropertyAccess extends ParametersContent{
    List<PropertyAccess> right;

    public ParaHasPropertyAccess() {
        this.right = new ArrayList<>();
    }

    public void addChild(PropertyAccess node) {
        this.right.add(node);
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Parameter Content :");
        sb.append("\n");

        sb.append("Property Access :");
        for (PropertyAccess child : this.right) {
            sb.append(child + "\n");
        }
        return sb.toString();
    }
}
