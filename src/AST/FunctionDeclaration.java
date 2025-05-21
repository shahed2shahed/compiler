package AST;

public class FunctionDeclaration extends ClassPropertyNode {
     Parameters parameters;
     Type returnType;
     FunctionBody functionBody;
     VariableType variableType;
     ArrowFunction arrowFunction;

    public FunctionDeclaration(Parameters parameters, Type returnType, FunctionBody functionBody) {
        this.parameters = parameters;
        this.returnType = returnType;
        this.functionBody = functionBody;
    }

    public FunctionDeclaration(Type returnType, FunctionBody functionBody) {
        this.returnType = returnType;
        this.functionBody = functionBody;
    }

    public FunctionDeclaration(Parameters parameters, FunctionBody functionBody) {
        this.parameters = parameters;
        this.functionBody = functionBody;
    }

    public FunctionDeclaration(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    public FunctionDeclaration(VariableType variableType,Parameters parameters, Type returnType, FunctionBody functionBody) {
        this.variableType = variableType;
        this.parameters = parameters;
        this.returnType = returnType;
        this.functionBody = functionBody;
    }

    public FunctionDeclaration(VariableType variableType , Type returnType, FunctionBody functionBody) {
        this.variableType = variableType;
        this.returnType = returnType;
        this.functionBody = functionBody;
    }

    public FunctionDeclaration(VariableType variableType , Parameters parameters, FunctionBody functionBody) {
        this.variableType = variableType;
        this.parameters = parameters;
        this.functionBody = functionBody;
    }

    public FunctionDeclaration(VariableType variableType , FunctionBody functionBody) {
        this.variableType = variableType;
        this.functionBody = functionBody;
    }

    public FunctionDeclaration(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public Type getReturnType() {
        return returnType;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Function Declaration : \n");
        if (variableType != null) {
            builder.append("Variable Type : " + variableType.toString() + "\n");
        }
        if (parameters != null) {
            builder.append("Parameters : " + parameters + "\n");
        }

        if (returnType != null) {
            builder.append("Type : " + returnType.toString() + "\n");
        }

        if (functionBody != null) {
            builder.append("Function Body : " + functionBody + "\n");
        }


        if (arrowFunction != null) {
            builder.append("Arrow Function : " + arrowFunction + "\n");
        }


        return builder.toString();
    }
}

