package AST;

public class ArrayStringType extends Type {
    String identifiers1;
    String identifiers2;

    public ArrayStringType(String identifiers1, String identifiers2) {
        this.identifiers1 = identifiers1;
        this.identifiers2 = identifiers2;

    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Array String Type {\n");
        sb.append(this.identifiers1).append("<").append(this.identifiers2).append(">\n");
        sb.append("} \n");
        return sb.toString();
    }
}

