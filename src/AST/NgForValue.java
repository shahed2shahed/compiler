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
public String generateJS(List<Types> bodyChildren ,StringBuilder s) {
    StringBuilder js = new StringBuilder();
    String tagVar = "ele" + i++;
    for (NgForExpression node : this.ngForExpression) {
        String iterable = node.getIterable();
        String itemVar = node.getItemVar();
        String indexVar = node.getIndexVar();

        js.append("\n");
        js.append(" let products = JSON.parse(localStorage.getItem(\"products\") || \"[]\");\n");

        js.append("function renderProducts() {");
        js.append('\n');
        js.append("div").append(getI() -1).append(".innerHTML = '';\n");

        js.append("\n");

            js.append(iterable).append(".forEach((").append(itemVar);
        if (indexVar != null) {
            js.append(", ").append(indexVar);
        }
        js.append(") => {\n");
        js.append("const "+tagVar+" = document.createElement('div');\n");

        js.append(tagVar + s);
        js.append(tagVar + ".innerHTML = `");
        if (bodyChildren != null && !bodyChildren.isEmpty()) {
            for (Types child : bodyChildren) {
                System.out.println("OOOOOOOOOOOOOO9" + child.getClass().getSimpleName());

                js.append(child.generateJSS()).append("\n");
            }
            js.append("`;");
            js.append("\n");

            js.append("div").append(getI() -1).append(".appendChild("+tagVar+");\n");

        } else {
            js.append("   const el = document.createElement('div');\n");
            js.append("   el.textContent = ").append(itemVar).append(";\n");
            js.append("   container.appendChild(el);\n");
        }

        js.append("});\n");
        js.append('}');
        js.append("\n");
        js.append("button.addEventListener('click', addProduct);");
        js.append("\n");
        js.append("renderProducts();\n");
    }

    return js.toString();
}

    @Override
    public String generateJS() {
        return generateJS();
    }

//    public String Pirnt(String itemVar) {
//        return itemVar;
//    }

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
