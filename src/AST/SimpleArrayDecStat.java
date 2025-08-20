package AST;

public class SimpleArrayDecStat extends FunctionDeclarationStat{
    Parameters parameters;
    SimpleArray array;

    public SimpleArrayDecStat(Parameters parameters, SimpleArray array){
        this.parameters = parameters;
        this.array = array;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Function Declaration Statement :");
        str.append("\n");
        str.append("Parameters: ");
        str.append(parameters.toString());
        str.append("\n");
        str.append("Simple Array: ");
        str.append(array.toString());
        str.append("\n");
        return str.toString();
    }
}
