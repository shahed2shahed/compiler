package AST;

import java.util.ArrayList;
import java.util.List;

public class VariableDeclaration extends Expression {

    VariableType type;
    List<PropertyAccess> access;
    VariableDeclarationStat stat;
    private static String image;

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
    public String generateVarJS(){
        StringBuilder sb = new StringBuilder();
        if (type != null) {
            sb.append(type.generate());
        }

        if (access != null && access.size() > 0) {
            for(PropertyAccess p : access){
                sb.append(p.generate());
            }
        }

        if (stat != null) {
            sb.append(stat.generateVarJS());
        }
        return sb.toString();
    }

    @Override
    public String generateJS(){
        StringBuilder sb = new StringBuilder();

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
    public String generate(){
        StringBuilder sb = new StringBuilder();
        if (access != null && access.size() > 0) {

            for(PropertyAccess p : access){
                if(p.toString().equals("imageValue")){
                    StringBuilder e = new StringBuilder();

                    image = e.append(stat.generateJSS()).toString();
                    sb.append("");
                }
                else {
                    sb.append(p.generate());

                    if (stat != null) {
                        sb.append(stat.generateJS());
                    }
                }
            }
        }

        return sb.toString();
    }

    public static String getImage() {
        return image;
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
