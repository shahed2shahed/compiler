package AST;

import java.util.List;

public class NgForDirective extends DirectiveStatementNode {

    NgForValue value;

    public NgForDirective(NgForValue value) {
        this.value = value;
    }

    public NgForValue getValue() {
        return value;
    }


    @Override
    public String generateJSWithBody(List<Types> bodyChildren) {
        StringBuilder sb = new StringBuilder();
        if (bodyChildren != null) {
                sb.append(value.generateJS(bodyChildren));

        }
        return sb.toString();
    }

    @Override
    public String generateJSWithBody(List<Types> bodyChildren , StringBuilder s) {
        StringBuilder sb = new StringBuilder();
        if (bodyChildren != null) {
            sb.append(value.generateJS(bodyChildren , s));

        }
        return sb.toString();
    }

    @Override
    public String generateJS() {
        // بدون bodyChildren
        return value.generateJS();
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
