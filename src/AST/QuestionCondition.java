package AST;

public class QuestionCondition extends Expression {
    PropertyAccess property;
    Values values;

    public QuestionCondition(PropertyAccess property, Values values) {
        this.property = property;
        this.values = values;
    }
    @Override
    public String generateJSS(){
        StringBuilder s = new StringBuilder();
        s.append(property.generateVarJS());
        return s.toString();
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Property Access : ");
        builder.append(property);
        builder.append("\n");

        builder.append("Values : ");
        builder.append(values);
        builder.append("\n");

        return builder.toString();
    }
}
