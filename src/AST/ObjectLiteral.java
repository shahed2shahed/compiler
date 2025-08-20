package AST;

import java.util.ArrayList;
import java.util.List;

public class ObjectLiteral extends AstNode {
    List<ObjectProperty> right;

    public ObjectLiteral() {
        this.right = new ArrayList<ObjectProperty>();
    }


    public List<ObjectProperty> getRight() {
        return right;
    }

    public void setRight(List<ObjectProperty> right) {
        this.right = right;
    }

    public void addChild(ObjectProperty node) {
        this.right.add(node);
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Object Literal :");
        if (right.size() > 0) {
            sb.append("\n Object Property :");
            for (ObjectProperty child : this.right) {
                sb.append(child + "\n");
            }
        }
        sb.append("\n");
        return sb.toString();
    }
}
