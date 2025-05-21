package AST;

import java.util.List;

public class TupleType  extends Type {

    private List<Type> elementTypes;

    public TupleType(List<Type> elementTypes) {
        this.elementTypes = elementTypes;
    }

    public List<Type> getElementTypes() {
        return elementTypes;
    }
}

