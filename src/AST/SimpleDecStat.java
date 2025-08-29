package AST;

public class SimpleDecStat extends FunctionDeclarationStat{
    String name;
    Parameters parameters;
    UnionTypeNode unionTypeNode;

    public SimpleDecStat(String name , Parameters parameters, UnionTypeNode unionTypeNode){
        this.name = name;
        this.parameters = parameters;
        this.unionTypeNode = unionTypeNode;
    }

        @Override
    public String generateJS(){
        StringBuilder sb = new StringBuilder();
        sb.append(parameters.generateJS());
        return sb.toString();
    }

    @Override
    public String generateRoutJS(){
        StringBuilder sb = new StringBuilder();
        sb.append(parameters.generateRoutJS());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Function Declaration Statement : \n");
        sb.append(name);
        sb.append("\n");

        if(parameters != null){
            sb.append("parameters: ");
            sb.append(parameters.toString());
            sb.append("\n");
        }
        if(unionTypeNode != null){
            sb.append("unionTypeNode: ");
            sb.append(unionTypeNode.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
