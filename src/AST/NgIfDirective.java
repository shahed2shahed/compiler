package AST;

public class NgIfDirective extends DirectiveStatementNode {
     private NgIfValue value;

    public NgIfDirective(NgIfValue value) {
        this.value = value;
    }

    public NgIfValue getValue() {
        return value;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Ng IF Directive { \n");
        sb.append(value + "\n");
        sb.append("}\n");

        return sb.toString();
    }


}
