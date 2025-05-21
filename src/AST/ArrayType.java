package AST;

public class ArrayType extends Type {
    private Type elementType;

    public ArrayType(Type  elementType) {
        this.elementType = elementType;
    }

    public Type  getElementType() {
        return elementType;
    }
}
