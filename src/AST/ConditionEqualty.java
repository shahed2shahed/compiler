package AST;

public class ConditionEqualty extends Conditions{

    PropertyAccess left;
    PropertyAccess right;
    PropertyAccess operator;

    public ConditionEqualty(PropertyAccess left, PropertyAccess right, PropertyAccess operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }
    public PropertyAccess getLeft() {
        return left;
    }
    public void setLeft(PropertyAccess left) {
        this.left = left;
    }
    public PropertyAccess getRight() {
        return right;
    }
    public void setRight(PropertyAccess right) {
        this.right = right;
    }
    public PropertyAccess getOperator() {
        return operator;
    }
    public void setOperator(PropertyAccess operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Conditions :");
        builder.append("\n");
        builder.append("left property access : ");
        builder.append(left);
        builder.append("\n");
        builder.append("right property access : ");
        builder.append(right);
        builder.append("\n");
        builder.append("operator property access : ");
        builder.append(operator);
        builder.append("\n");
        return builder.toString();
    }
}
