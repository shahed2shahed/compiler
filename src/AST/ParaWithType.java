package AST;

import java.util.ArrayList;
import java.util.List;

public class ParaWithType extends ParametersType{
    String name;
    List<Type> type;
    public ParaWithType(List<Type> type , String name) {
        this.type = new ArrayList<Type>();
    }

    public List<Type> getType() {
        return type;
    }
    public void setType(List<Type> type ) {
        this.type = type;
    }

    public void addChild(Type node) {
        this.type.add(node);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parameters :");

        sb.append(name);

        if (type.isEmpty()) {
            return "";
        }
        else {
            for (Type child : this.type) {
                sb.append(child + "\n");
            }
        }

        return sb.toString();
    }
}
