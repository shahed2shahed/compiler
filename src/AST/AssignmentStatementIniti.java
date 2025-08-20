package AST;

public class AssignmentStatementIniti extends Assignment{
    PropertyAccess property;
    ObjectLiteral value;

    public AssignmentStatementIniti(PropertyAccess property, ObjectLiteral value) {
        this.value = value;
        this.property = property;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("Assignment ");
        builder.append("\n");

        builder.append("Property Access: ");
        builder.append(property);
        builder.append("\n");

        builder.append("Object Literal: ");
        builder.append(value);
        builder.append("\n");

        return builder.toString();
    }
}
