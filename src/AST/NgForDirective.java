package AST;

public class NgForDirective extends DirectiveStatementNode {

    NgForValue value;

    public NgForDirective(NgForValue value) {
        this.value = value;
    }

    public NgForValue getValue() {
        return value;
    }

    @Override
    public String generateJS() {
        StringBuilder s = new StringBuilder();
        s.append(value.generateJS());
        return s.toString();
    }

        @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
       // sb.append("Ng For Directive { \n");
        sb.append(value + "\n");
      //  sb.append("}\n");

        return sb.toString();
    }
}
