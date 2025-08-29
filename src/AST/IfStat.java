package AST;

import java.util.ArrayList;
import java.util.List;

public class IfStat extends IfElseStat{
    List<Types> types ;

    public IfStat() {
        this.types = new ArrayList<>();
    }

    public void addChild(Types node) {
        this.types.add(node);
    }

    @Override
    public String generate() {
        StringBuilder str = new StringBuilder();
        str.append("if (");
        for(var chaild : this.types){
            str.append(chaild.generate());
        }
        str.append(") ");
        str.append("return;");
        str.append("\n");

        return str.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("If Statement : \n");
        sb.append("Types : \n");
        if(types.size() > 0){
            for (Types t : types) {
                sb.append(t.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
