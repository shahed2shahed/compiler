package AST;

import java.util.List;

public class NgIfValue extends AstNode {
    ConditionExpression conditionExpression;

    public NgIfValue( ConditionExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
    }


    public ConditionExpression getConditionExpression() {
        return conditionExpression;
    }

    @Override
    public String generateJS(List<Types> bodyChildren , StringBuilder classN) {
        StringBuilder sb = new StringBuilder();
        String tagVar = "ele" + i++;
            sb.append(conditionExpression.generateJS(bodyChildren));
        if (bodyChildren != null && bodyChildren.size() > 0) {
            sb.append("const "+tagVar+" = document.createElement('div');\n");
            sb.append(tagVar+classN);
                    for (Types child : bodyChildren) {
                        sb.append(child.generateJS(tagVar)).append("\n");
                    }
            sb.append("container.appendChild("+tagVar+");\n");

        }
         else {
            sb.append("   const el = document.createElement('div');\n");
            sb.append("   "+classN);
            sb.append("   el.textContent = ").append("itemVar").append(";\n");
            sb.append("   container.appendChild(el);\n");
        }

//        js.append("const div = document.createElement('div');\n");
//
//        if (bodyChildren != null && !bodyChildren.isEmpty()) {
//            for (Types child : bodyChildren) {
//                js.append(child.generateJS()).append("\n");
//            }
//            js.append("container.appendChild(div);\n");
//
//        } else {
//            js.append("   const el = document.createElement('div');\n");
//            js.append("   el.textContent = ").append(itemVar).append(";\n");
//            js.append("   container.appendChild(el);\n");
//        }
//
//        js.append("});\n");


        return sb.toString();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Ng IF Value { \n");
        sb.append(conditionExpression + "\n");
        sb.append("}\n");

        return sb.toString();
    }
}
