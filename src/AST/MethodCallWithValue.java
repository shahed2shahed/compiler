package AST;

public class MethodCallWithValue extends FunctionCall{

    PropertyAccess property;
    Parameters parameters;
    SimpleArray arguments;

    public MethodCallWithValue(PropertyAccess property, Parameters parameters , SimpleArray arguments) {
        this.arguments = arguments;
        this.property = property;
        this.parameters = parameters;
    }

    public MethodCallWithValue(PropertyAccess property, Parameters parameters) {
        this.property = property;
        this.parameters = parameters;
    }

    public SimpleArray getArguments() {
        return arguments;
    }
    public PropertyAccess getProperty() {
        return property;
    }
    public Parameters getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Function Call : ");

        builder.append(" Property Access :");
        builder.append(property);
        builder.append("\n");

        builder.append(" Parameters :");
        builder.append(parameters);
        builder.append("\n");

        if (arguments != null) {
            builder.append("Simple Array : ");
            builder.append(arguments.toString());
            builder.append("\n");
        }

        return builder.toString();
    }
}
