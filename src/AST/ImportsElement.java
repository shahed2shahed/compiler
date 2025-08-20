package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportsElement extends ComponentEle {
    private List<String> children = new ArrayList<>();
    private PropertyStat property;

    public ImportsElement() {
    }

    public ImportsElement(List<String> children, PropertyStat property) {
        this.children = children;
        this.property = property;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }

    public void addChild(String child) {
        this.children.add(child);
    }

    public PropertyStat getProperty() {
        return property;
    }

    public void setProperty(PropertyStat property) {
        this.property = property;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Imports {\n");

        sb.append("  Imports: ");
        sb.append(children);
        sb.append("\n");

        sb.append("  property: ");
        sb.append(property);
        sb.append("\n");

        sb.append("}\n");
        return sb.toString();
    }
}
