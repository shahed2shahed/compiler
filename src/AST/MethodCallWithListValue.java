package AST;

public class MethodCallWithListValue extends FunctionCall{

    PropertyAccess property;
    ArgumentList argumentList;

    public MethodCallWithListValue(PropertyAccess property, ArgumentList argumentList) {
        this.property = property;
        this.argumentList = argumentList;
    }

    public MethodCallWithListValue(PropertyAccess property) {
        this.property = property;
    }


    public PropertyAccess getProperty() {
        return property;
    }
    public ArgumentList getArgumentList() {
        return argumentList;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Function Call : ");
        builder.append(" Property Access :");
        builder.append(property);
        builder.append("\n");

        if (argumentList != null) {
            builder.append(" Argument List :");
            builder.append(argumentList.toString());
            builder.append("\n");
        }

        return builder.toString();
    }
}
