package AST;

public class DirectivesStatment extends Expression{
     String condition;

    public DirectivesStatment(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "directive : " + condition;
    }
}
