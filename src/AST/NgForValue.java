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

//    @Override
//    public String generateJS() {
//        StringBuilder sb = new StringBuilder();
//        for (NgForExpression child : ngForExpression) {
//            sb.append(child.generateJS());
//            sb.append("\n");
//        }
//        return sb.toString();
//    }

    //olddd
//    @Override
//    public String generateJS() {
//        StringBuilder js = new StringBuilder();
//
//        for (NgForExpression node : this.ngForExpression) {
//
//            js.append(node.getIterable())
//                    .append(".forEach((")
//                    .append(node.getItemVar());
//
//            if (node.getIndexVar() != null) {
//                js.append(", ").append(node.getIndexVar());
//            }
//
////            node.getc
//
//            js.append(") => {\n");
//            js.append("   const el = document.createElement('div');\n");
//            js.append("   el.textContent = ").append(node.getItemVar()).append(";\n");
//            js.append("   container.appendChild(el);\n");
//            js.append("});\n");
//        }
//        return js.toString();
//    }


// توليد JS مع تمرير الأبناء (htmlBody)
@Override
public String generateJS(List<Types> bodyChildren) {
    StringBuilder js = new StringBuilder();

    for (NgForExpression node : this.ngForExpression) {
        String iterable = node.getIterable();
        String itemVar = node.getItemVar();
        String indexVar = node.getIndexVar() != null ? node.getIndexVar() : "i";

        js.append(iterable).append(".forEach((").append(itemVar)
                .append(", ").append(indexVar).append(") => {\n");

        if (bodyChildren != null && !bodyChildren.isEmpty()) {
            for (Types child : bodyChildren) {
                if (child instanceof NormalHtmlTagNode) {
                    NormalHtmlTagNode nht = (NormalHtmlTagNode) child;
                    String tagVar = nht.getOpenTag().getTagName();

                    // توليد زر مع تمرير indexVar أو itemVar للـ click handler
                    js.append("const ").append(tagVar).append(" = document.createElement('")
                            .append(tagVar).append("');\n");

                    for (Types innerChild : nht.getOpenTag().getContent()) {
                        if (innerChild instanceof EventBinding) {
                            EventBinding eb = (EventBinding) innerChild;
                            js.append(tagVar).append(".addEventListener('")
                                    .append(eb.click).append("', () => ")
                                    .append(eb.functionName).append("(").append(indexVar).append(")")
                                    .append(");\n");
                        }
                    }

                    if (nht.getHtmlBody() != null) {
                        for (Types textChild : nht.getHtmlBody()) {
                            js.append(tagVar).append(".textContent = '")
                                    .append(textChild.toString()).append("';\n");
                        }
                    }

                    js.append("container.appendChild(").append(tagVar).append(");\n");
                }
            }
        }

        js.append("});\n");
    }

    return js.toString();
}


    @Override
    public String generateJS() {
        return generateJS(null); // بدون bodyChildren
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
