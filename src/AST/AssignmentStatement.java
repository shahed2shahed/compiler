package AST;

import java.util.ArrayList;
import java.util.List;

public class AssignmentStatement extends Assignment{

    Assignment left;
    Assignment right;
    PrimitiveTypeNode typeList;

    public AssignmentStatement(Assignment left, Assignment right, PrimitiveTypeNode typeList) {
        this.left = left;
        this.right = right;
        this.typeList = typeList;
    }

    public AssignmentStatement(Assignment left, Assignment right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Assignment :");
        sb.append("\n");
        sb.append("Assignment Left :");
        sb.append(left.toString());
        sb.append("\n Assignment Right :");
        sb.append(right.toString());
        sb.append("\n");

        if (typeList != null) {
            sb.append("Primitive Type Node : ");
                sb.append(typeList + "\n");
        }
        return sb.toString();
    }
}
