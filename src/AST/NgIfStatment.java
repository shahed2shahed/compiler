package AST;

public class NgIfStatment extends Expression{
    private String condition;

    public NgIfStatment(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "ngIf " + condition;
    }
}
