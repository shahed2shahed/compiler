package AST;

import java.util.ArrayList;

public class AssignedFunctionDecl extends  FunctionDeclaration{
    Parameters parameters;
    VariableType variableType;
    Type type;
    ArrayList<Body> bodies;


    public AssignedFunctionDecl(VariableType variableType ,Parameters parameters , Type type ,  ArrayList<Body> bodies) {
        this.variableType = variableType;
        this.parameters = parameters;
        this.type = type;
        this.bodies =bodies;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Assigned Function Decl :\n");

        sb.append("Variable Type: ").append(variableType).append("\n");

        if (parameters != null) {
            sb.append("Parameters: ").append(parameters).append("\n");

        } else {
            sb.append(" No parameters  \n");

        }

        if (type != null) {
            sb.append("Type: ").append(type).append("\n");

        } else {
            sb.append(" No type \n");

        }

        sb.append("body : ");
        for (Body child : this.bodies) {
            sb.append(child).append("\n");
        }

        return sb.toString();
    }
}
