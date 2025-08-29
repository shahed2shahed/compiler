package AST;

public class TypedVariableDecl extends VariableDeclarationStat{

    UnionTypeNode unionType;
    Types types;

    public TypedVariableDecl(UnionTypeNode unionType , Types types) {
        this.unionType = unionType;
        this.types = types;
    }

    @Override
    public String generateVarJS(){
        StringBuilder sb = new StringBuilder();
        sb.append("= "+ types.generateVarJS()+"\n");
        return sb.toString();
    }

    @Override
    public String generate(){
        StringBuilder sb = new StringBuilder();
        System.out.println("Variab" + unionType.getLeft().generate());

        if ("any".equals(unionType.getLeft().generate())) {
            sb.append("let ");
        } else {
            sb.append("const ");
        }

        return sb.toString();
    }

    @Override
    public String generateJS(){
        StringBuilder sb = new StringBuilder();
        sb.append(" = ");
        sb.append(types.generate());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Variable Declaration Statement : \n ");
        sb.append("Union Type : " + unionType.toString() + "\n");
        sb.append("Types : " + types.toString() + "\n");
        return sb.toString();
    }
}
