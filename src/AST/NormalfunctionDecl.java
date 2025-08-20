package AST;

import java.util.List;

public class NormalfunctionDecl extends FunctionDeclaration{
    VariableType returnType;
    FunctionDeclarationStat stat;
    List<Body> body;

    public NormalfunctionDecl(){

    }
    public NormalfunctionDecl(VariableType returnType, FunctionDeclarationStat stat , List<Body> body) {
        this.returnType = returnType;
        this.stat = stat;
        this.body = body;
    }
    public void addChild(Body node) {
        this.body.add(node);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Normal Function Declaration :");
        sb.append("\n");
        if(returnType != null){
            sb.append("Variable Type: ");
            sb.append(returnType);
            sb.append("\n");
        }
        sb.append(stat + "\n");

        if(body != null){
            sb.append("Body: ");
            for(Body b : this.body){
                sb.append(b);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
