package AST;

public class OperationExpr extends Expression{
    Values left;
    Operations operator;
    Values right;

    public OperationExpr(Values left, Operations operator, Values right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public OperationExpr(Values left) {
        this.left = left;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Operation Expression :");
        builder.append("\n");
        builder.append("Value Left :");
        builder.append(left.toString());
        builder.append("\n");

        if(operator!=null && operator!=null){
            builder.append("Operation :");
            builder.append(operator.toString());
            builder.append("\n");

            builder.append("Value Right :");
            builder.append(right.toString());
            builder.append("\n");
        }

        return builder.toString();
    }
}
