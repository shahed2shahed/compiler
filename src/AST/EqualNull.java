package AST;

public class EqualNull extends ConditionExpression{
    String identifier;
    EqualOperation equalOperation;

    public EqualNull(EqualOperation equalOperation, String identifier) {
        this.equalOperation = equalOperation;
        this.identifier = identifier;
    }

    @Override
    public String generateJS() {
        // نولد جافاسكربت حسب العملية
        return identifier + " " + equalOperation + " null";
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
