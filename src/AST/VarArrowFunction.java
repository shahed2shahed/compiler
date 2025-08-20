package AST;

public class VarArrowFunction extends ArrowFunction{
    VariableType varType;
    Parameters parameters;
    Type returnType;
    Body body;

    public VarArrowFunction(VariableType varType, Parameters parameters, Type returnType, Body body) {
        this.varType = varType;
        this.parameters = parameters;
        this.returnType = returnType;
        this.body = body;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Arrow Function : \n");
        sb.append("Variable Type : " + varType + "\n");
        sb.append("Parameter : " + parameters + "\n");

        if (returnType != null) {
            sb.append("Type : " + returnType + "\n");
        }
        sb.append("Body : " + body + "\n");
        return sb.toString();

    }
}
