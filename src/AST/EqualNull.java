package AST;

public class EqualNull extends ConditionExpression{
    EqualOperation equalOperation;

    public EqualNull(EqualOperation equalOperation) {
        this.equalOperation = equalOperation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equal Null Exp :\n");
        if (equalOperation != null) {
            sb.append("Equal Operation: ").append(equalOperation).append("\n");
        }


        return sb.toString();

    }
}
