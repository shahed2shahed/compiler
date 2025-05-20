package AST;

public class Class extends Type {
    private String value;

    public Class(String value) {
        this.value = value;
    }

    public String getClassNode() {
        return value;
    }

    public void setClassNode(String value) {
        this.value = value;
    }

    @Override
//    public String toString() {
//        return  "Class Value\n" + value;
//    }
    public String toString() {
        return value;
    }

}