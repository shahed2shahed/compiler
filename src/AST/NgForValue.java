package AST;

import java.util.ArrayList;
import java.util.List;

public class NgForValue extends AstNode{
     ArrayList<NgForExpression> ngForExpression;

    public NgForValue() {
        this.ngForExpression = new ArrayList<>();
    }
    public void addChild(NgForExpression node) {
        this.ngForExpression.add(node);
    }



@Override
public String generateJS(List<Types> bodyChildren) {
    StringBuilder js = new StringBuilder();
    String tagVar = "ele" + i++;
    for (NgForExpression node : this.ngForExpression) {
        String iterable = node.getIterable();
        String itemVar = node.getItemVar();
        String indexVar = node.getIndexVar();

        js.append(iterable).append(".forEach((").append(itemVar);
        if (indexVar != null) {
            js.append(", ").append(indexVar);
        }
        js.append(") => {\n");
        js.append("const "+tagVar+" = document.createElement('div');\n");

        if (bodyChildren != null && !bodyChildren.isEmpty()) {
            for (Types child : bodyChildren) {
                    js.append(child.generateJS(tagVar)).append("\n");
            }
            js.append("container.appendChild("+tagVar+");\n");

        } else {
            js.append("   const el = document.createElement('div');\n");
            js.append("   el.textContent = ").append(itemVar).append(";\n");
            js.append("   container.appendChild(el);\n");
        }

        js.append("});\n");
    }

    return js.toString();
}

    @Override
    public String generateJS() {
        return generateJS();
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
