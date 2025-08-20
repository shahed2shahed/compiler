package AST;

public class DotPropertyAccessObjectProperty extends ObjectProperty {
    String dot;
    PropertyAccess propertyAccess;

    public DotPropertyAccessObjectProperty(String dot, PropertyAccess propertyAccess) {
        this.dot = dot;
        this.propertyAccess = propertyAccess;
    }
    public DotPropertyAccessObjectProperty(PropertyAccess propertyAccess) {
        this.propertyAccess = propertyAccess;
    }
    public String getDot() {
        return dot;
    }
    public void setDot(String dot) {
        this.dot = dot;
    }
    public PropertyAccess getPropertyAccess() {
        return propertyAccess;
    }
    public void setPropertyAccess(PropertyAccess propertyAccess) {
        this.propertyAccess = propertyAccess;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Object Property :");
        builder.append("\n");

        if (dot != null) {
            builder.append("dot");
            builder.append(dot);
            builder.append("\n");
        }
        builder.append(" property Access :");
        builder.append(propertyAccess);
        builder.append("\n");
        return builder.toString();
    }
}
