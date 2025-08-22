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

//    @Override
//    public String generateJS() {
//        StringBuilder sb = new StringBuilder();
//        for (NgForExpression child : ngForExpression) {
//            sb.append(child.generateJS());
//            sb.append("\n");
//        }
//        return sb.toString();
//    }

    @Override
    public String generateJS() {
        StringBuilder js = new StringBuilder();

        for (NgForExpression node : this.ngForExpression) {

            js.append(node.getIterable())
                    .append(".forEach((")
                    .append(node.getItemVar());

            if (node.getIndexVar() != null) {
                js.append(", ").append(node.getIndexVar());
            }

            js.append(") => {\n");
            js.append("   const el = document.createElement('div');\n");
            js.append("   el.textContent = ").append(node.getItemVar()).append(";\n");
            js.append("   container.appendChild(el);\n");
            js.append("});\n");
        }
        return js.toString();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
      //  sb.append("Ng For Value { \n");
        for (NgForExpression child : this.ngForExpression) {
            sb.append(child + "\n");
        }
     //   sb.append("}\n");

        return sb.toString();
    }

}
