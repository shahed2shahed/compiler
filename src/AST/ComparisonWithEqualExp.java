package AST;

public class ComparisonWithEqualExp extends ConditionExpression{
    EqualOperation equalOperation;
    LogicalTerm logicalTerm1;
    LogicalTerm logicalTerm2;

    public ComparisonWithEqualExp(EqualOperation equalOperation , LogicalTerm logicalTerm1 , LogicalTerm logicalTerm2) {
        this.equalOperation = equalOperation;
        this.logicalTerm1 = logicalTerm1;
        this.logicalTerm2 = logicalTerm2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comparison With Equal Exp :\n");

        if (logicalTerm2 != null) {
            sb.append("Logical Term2: ").append(logicalTerm2.toString());
        }
        else{
            sb.append("No Logical Term2");
        }
        if(equalOperation != null) {
            sb.append("Equal Operation: ").append(equalOperation.toString());
        }
        else {
            sb.append("No Equal Operation");
        }

        sb.append("Logical Term1: ").append(logicalTerm1).append("\n");

        return sb.toString();

    }
}
