package AST;

public class NgForDirective extends DirectiveStatementNode {

private NgForValue value;

    public NgForDirective(NgForValue value) {
        this.value = value;
    }

    public NgForValue getValue() {
        return value;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Ng For Directive { \n");
        sb.append(value + "\n");
        sb.append("}\n");

        return sb.toString();
    }
}
