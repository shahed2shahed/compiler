package AST;

import java.util.ArrayList;

public class NgForValue extends AstNode{
     ArrayList<NgForExpression> ngForExpression;

    public NgForValue() {
        this.ngForExpression = new ArrayList<>();
    }
    public void addChild(NgForExpression node) {
        this.ngForExpression.add(node);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Ng For Value { \n");
        for (NgForExpression child : this.ngForExpression) {
            sb.append(child + "\n");
        }
        sb.append("}\n");

        return sb.toString();
    }

}
