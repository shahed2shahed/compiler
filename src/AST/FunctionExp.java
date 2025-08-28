package AST;

import java.util.ArrayList;

public class FunctionExp extends Expression{
    ArrayList<Content> children;
    ArrayList<PropertyAccess> propertyAccesses;


    public FunctionExp() {
        this.children = new ArrayList<>();
        this.propertyAccesses = new ArrayList<>();
    }

    public void addChild(Content node) {
        this.children.add(node);
    }
    public void addChild(PropertyAccess node) {
        this.propertyAccesses.add(node);
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Function Ex { \n");
        if (this.children.size() > 0) {
            for (Content child : this.children) {
                sb.append(child + "\n");
            }
        }

        if (this.propertyAccesses.size() > 0) {
            for (PropertyAccess child : this.propertyAccesses) {
                sb.append(child + "\n");
            }
        }

        sb.append("}\n");

        return sb.toString();
    }

}
