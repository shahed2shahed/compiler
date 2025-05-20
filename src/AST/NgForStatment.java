package AST;

public class NgForStatment extends Expression {
    private String identifier1;
    private String identifier2;

    public NgForStatment(String identifier1, String identifier2) {
        this.identifier1 = identifier1;
        this.identifier2 = identifier2;
    }

    @Override
    public String toString() {
        return "ngFor " + identifier1 + " in " + identifier2;
    }
}
