package AST;

public class ArrayNumberType extends Type{
    String identifiers;
    public ArrayNumberType(String identifiers) {
        this.identifiers = identifiers;
    }


    public String getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(String identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(identifiers);
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
//        sb.append("Array Number Type {\n");
        sb.append(String.join(", ", this.identifiers)).append("[]");
        sb.append("\n");
//        sb.append("} \n");
        return sb.toString();
    }
}
