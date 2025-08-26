package AST;

import java.util.ArrayList;
import java.util.List;

public class VariableDeclaration extends Expression {

    VariableType type;
    List<PropertyAccess> access;
    VariableDeclarationStat stat;

    public VariableDeclaration() {
        super();
    }

    public VariableDeclaration(VariableType type, List<PropertyAccess> access, VariableDeclarationStat stat) {
        this.type = type;
        this.access = access;
        this.stat = stat;
    }

    public VariableDeclaration(List<PropertyAccess> access , VariableDeclarationStat stat) {
        this.access = access;
        this.stat = stat;
    }

    @Override
    public String generateJS(){
        StringBuilder sb = new StringBuilder();
//        if (access != null) {
//            sb.append("const ");
//            for (PropertyAccess pa : access) {
//                sb.append(pa.generate());
//            }
//        }
//
        if (stat.getClass().getSimpleName().equals("TypedVariableDecl")) {
            sb.append(stat.generate());
        }

        for (PropertyAccess pa : access) {
            sb.append(pa.generate());
        }

        if (stat != null) {
            sb.append(stat.generate());
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Variable Declaration : \n");
        if (type != null) {
            sb.append(type.toString());
            sb.append("\n");
        }

        for (PropertyAccess child : this.access) {
            sb.append(child + "\n");
        }

        sb.append(stat.toString());
        sb.append("\n");

        return sb.toString();
  }
}
