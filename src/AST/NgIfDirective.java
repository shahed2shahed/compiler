package AST;

import java.util.List;

public class NgIfDirective extends DirectiveStatementNode {
     private NgIfValue value;

    public NgIfDirective(NgIfValue value) {
        this.value = value;
    }

    public NgIfValue getValue() {
        return value;
    }

    @Override
    public String generateWithBody(List<Types> bodyChildren , StringBuilder classN) {
        StringBuilder sb = new StringBuilder();

        sb.append("if (").append(value.getConditionExpression().generateJS()).append(") {\n");
        if (bodyChildren != null) {
            sb.append(value.generateJS(bodyChildren , classN));
        }
        sb.append("}\n");

        return sb.toString();
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
