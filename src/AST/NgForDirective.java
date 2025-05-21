package AST;

public class NgForDirective extends DirectiveStatementNode {

private NgForDirective value;

    public NgForDirective(NgForDirective value) {
        this.value = value;
    }

    public NgForDirective getValue() {
        return value;
    }
}
