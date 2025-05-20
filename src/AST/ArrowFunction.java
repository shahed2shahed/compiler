package AST;

public class ArrowFunction {
    VariableType variableType;
    Parameters parameters;
    Type type;

    public ArrowFunction(VariableType variableType, Parameters parameters, Type type) {
        this.variableType = variableType;
        this.parameters = parameters;
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        sb.append("Variable Type : ").append(variableType);
            sb.append("\n");
        sb.append("Parameters : ").append(parameters);
            sb.append("\n");
        sb.append("Type : ").append(type);
            sb.append("\n");
        return sb.toString();
    }
}
