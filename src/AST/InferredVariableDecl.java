package AST;

public class InferredVariableDecl extends VariableDeclarationStat{
    Types types;
    Conditions condition;

    public InferredVariableDecl(Types types){
        this.types = types;
    }

    public InferredVariableDecl(Conditions condition){
        this.condition = condition;
    }

    @Override
    public String generate(){
        StringBuilder sb = new StringBuilder();
        if(condition != null){
            sb.append(condition.generate());
        }
        if(types != null){
            sb.append(" = ");
            sb.append("\n");
            sb.append(types.generate());
        }
        return sb.toString();
    }

    @Override
    public String generateVarJS(){
        StringBuilder sb = new StringBuilder();
        if(condition != null){
            sb.append(condition.generate());
        }
        if(types != null){
            sb.append(" = ");
            sb.append(types.generate());
            sb.append(" ");
        }
        return sb.toString();
    }

    @Override
    public String generateJS(){
    StringBuilder sb = new StringBuilder();
    sb.append(" : ");
    if(types != null){
        if(types instanceof PrimitiveTypeNode){
            sb.append(getImage());
        }
        else {
            sb.append(types.generateJSS());
        }
    }
    return sb.toString();
    }

    @Override
    public String generateJSS(){
        StringBuilder sb = new StringBuilder();
        if(types != null){
            sb.append(types.generateJSS());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("variable Declaration Statement : \n");

        if (types != null){
            sb.append("Types: " + types + "\n");
        }
        if (condition != null){
            sb.append("Condition: " + condition + "\n");
        }
        return sb.toString();
    }
}
