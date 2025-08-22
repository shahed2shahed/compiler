package AST;

public class NewObjectFromClass extends VariableDeclarationStat{
    Parameters parameters;
    ToString toString;

    public NewObjectFromClass(){}
    public NewObjectFromClass(Parameters parameters, ToString toString){
        this.parameters = parameters;
        this.toString = toString;
    }

    public NewObjectFromClass(Parameters parameters){
        this.parameters = parameters;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("New Object From Class :");
        str.append("\n");

        str.append("Parameter :");
        str.append(parameters.toString());
        str.append("\n");

        if (toString!=null){
            str.append("ToString function ");
            str.append(toString.toString());
            str.append("\n");
        }

        return str.toString();
    }
}
