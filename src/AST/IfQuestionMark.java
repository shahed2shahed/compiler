package AST;

public class IfQuestionMark extends IfElseStat{
    Type left;
    Type right;

    public IfQuestionMark(Type left, Type right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("IfELse Statement :");
        builder.append("\n");

        builder.append("Left Type");
        builder.append(left);
        builder.append("\n");

        builder.append("Right Type");
        builder.append(right);
        builder.append("\n");

        return builder.toString();
    }
}
