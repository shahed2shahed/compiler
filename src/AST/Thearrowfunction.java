package AST;

public class Thearrowfunction extends AstNode {

    private String variableType; // LET أو VAR أو CONST
    private String identifier;
    private Parameter parameters;
    private Type returnType;
    private Arrowbody body;

    public Thearrowfunction (String variableType, String identifier, Parameter parameters, Type returnType, Arrowbody body) {
        this.variableType = variableType;
        this.identifier = identifier;
        this.parameters = parameters;
        this.returnType = returnType;
        this.body = body;
    }

    public String getVariableType() {
        return variableType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Parameter getParameters() {
        return parameters;
    }

    public Type  getReturnType() {
        return returnType;
    }

    public Arrowbody getBody() {
        return body;
    }
}
