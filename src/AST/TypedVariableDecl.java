package AST;

public class TypedVariableDecl extends VariableDeclarationStat{

    UnionTypeNode unionType;

    public TypedVariableDecl(UnionTypeNode unionType){
        this.unionType = unionType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Variable Declaration Statement : \n ");
        sb.append("Union Type : " + unionType.toString() + "\n");
        return sb.toString();
    }
}
