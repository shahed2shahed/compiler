package AST;

import java.util.ArrayList;
import java.util.List;

public class WithExpressionArgumentList extends ArgumentList{
    List<Expression> expressionRight;

    public WithExpressionArgumentList() {
        this.expressionRight = new ArrayList<>();
    }

    public List<Expression> getExpressionRight() {
        return expressionRight;
    }
    public void setExpressionRight(List<Expression> expressionRight) {
        this.expressionRight = expressionRight;
    }
    public void addChild(Expression node) {
        this.expressionRight.add(node);
    }


    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Argument List :");
    sb.append("\n");

    if (expressionRight != null) {
        sb.append(" expression :");
        for (Expression child : this.expressionRight) {
            sb.append(child + "\n");
        }
    }
    return sb.toString();
    }
}
