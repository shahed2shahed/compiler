package AST;

import java.util.ArrayList;
import java.util.List;

public class TupleType extends Type {

    private List<Type> elementTypes;

    public TupleType() {
        this.elementTypes = new ArrayList<>();
    }

    public List<Type> getElementTypes() {
        return elementTypes;
    }

    public void addChild(Type node) {
        this.elementTypes.add(node);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Tuple Type { \n");
        for (Type child : this.elementTypes) {
            sb.append(child + "\n");
        }
        sb.append("}\n");

        return sb.toString();
    }
}

