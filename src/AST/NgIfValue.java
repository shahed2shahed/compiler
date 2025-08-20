package AST;

public class NgIfValue extends AstNode {
    ConditionExpression conditionExpression;

    public NgIfValue( ConditionExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Ng IF Value { \n");
        sb.append(conditionExpression + "\n");
        sb.append("}\n");

        return sb.toString();
    }
}
