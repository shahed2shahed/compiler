package AST;

import java.util.ArrayList;
import java.util.List;

public class ConditionStat extends AstNode{
    List<Expression> expressions;

    public ConditionStat() {
        this.expressions = new ArrayList<>();
    }

    public void addChild(Expression node) {
        this.expressions.add(node);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Condition Statement:\n");

        if (expressions.size() > 0) {
            sb.append("expressions :");
            for (Expression e : expressions) {
                sb.append(e.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
