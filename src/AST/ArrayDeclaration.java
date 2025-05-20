package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ArrayDeclaration extends Expression {

    List<Expression> expressions;

    public ArrayDeclaration() {
        this.expressions = new ArrayList<>();
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public void addExpressions(Expression node) {
        this.expressions.add(node);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.expressions != null && !this.expressions.isEmpty()) {
            sb.append("Array Declaration : \n");

            for (Expression item : expressions) {

                sb.append(item).append("\n");
            }
        }
        sb.append("\n");
        return sb.toString();
    }

}