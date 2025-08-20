package AST;

import java.util.ArrayList;

public class ComparisonExp extends ConditionExpression{
    LogicalTerm logicalTerm;
    EqualOperation equalOperation;

    public ComparisonExp(LogicalTerm logicalTerm ,  EqualOperation equalOperation) {
        this.logicalTerm = logicalTerm;
        this.equalOperation = equalOperation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comparison Exp :\n");
        if (equalOperation != null) {
            sb.append("Equal Operation: ").append(equalOperation).append("\n");

        } else {
            sb.append(" No Operation  \n");
        }

        sb.append("Logical Term: ").append(logicalTerm).append("\n");

        return sb.toString();

    }
}
