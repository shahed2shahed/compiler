package AST;

public class ConditionValue extends Conditions{
    PropertyAccess left;
    Parameters leftParams;
    PropertyAccess right;
    Parameters rightParams;
    Operations operations;

    public ConditionValue(PropertyAccess left ,Parameters leftParams , PropertyAccess right , Parameters rightParams , Operations operations ){
        this.left = left;
        this.leftParams = leftParams;
        this.right = right;
        this.rightParams = rightParams;
        this.operations = operations;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Conditions :");
        builder.append("\n");
        builder.append(" left property access : ");
        builder.append(left);
        builder.append("\n");
        builder.append(" left parameters : ");
        builder.append(leftParams);
        builder.append("\n");
        builder.append(" right property access : ");
        builder.append(right);
        builder.append("\n");
        builder.append(" right parameters : ");
        builder.append(rightParams);
        builder.append("\n");
        builder.append(" operation : ");
        builder.append(operations);
        builder.append("\n");
        return builder.toString();
    }
}
