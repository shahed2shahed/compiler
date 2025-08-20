package AST;

public class CallFunctionPara extends FunctionCall{
    Parameters left;
    Parameters right;
    PrintError error;

    public CallFunctionPara(Parameters left, Parameters right, PrintError error) {
        this.left = left;
        this.right = right;
        this.error = error;
    }

    public Parameters getLeft() {
        return left;
    }
    public Parameters getRight() {
        return right;
    }
    public PrintError getError() {
        return error;
    }

    public void setLeft(Parameters left) {
        this.left = left;
    }
    public void setRight(Parameters right) {
        this.right = right;
    }
    public void setError(PrintError error) {
        this.error = error;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Function Call :");
        builder.append("\n");
        builder.append("  left parameter:");
        builder.append(left);
        builder.append("\n");
        builder.append("  right parameter:");
        builder.append(right);
        builder.append("\n");
        builder.append("  print error:");
        builder.append(error);
        builder.append("\n");
        return builder.toString();
    }
}

