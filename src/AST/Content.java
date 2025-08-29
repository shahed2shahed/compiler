package AST;

public class Content extends FunctionExp{
    Values values;
    VariableDeclaration variableDeclaration;

    public Content(Values v, VariableDeclaration vd){
        this.values = v;
        this.variableDeclaration = vd;
    }

    @Override
    public String generate(){
        StringBuilder sb = new StringBuilder();
        if (variableDeclaration != null){
            sb.append(variableDeclaration.generate());
        }
        if (values != null){
            sb.append(values.generate());
        }
        return sb.toString();
    }


    @Override
    public String generateJS(){
    StringBuilder sb = new StringBuilder();
    if (variableDeclaration != null){
        sb.append(variableDeclaration.generate());
    }
    return sb.toString();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Content { \n");
        if (this.values != null) {
            sb.append(this.values.toString());
        }

        if (variableDeclaration!=null) {
            sb.append(this.variableDeclaration.toString());

        }

        sb.append("}\n");

        return sb.toString();
    }
}
