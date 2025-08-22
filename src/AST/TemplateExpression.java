package AST;

import java.util.ArrayList;
import java.util.List;

public class TemplateExpression extends PrimitiveTypeNode {


        private List<Types> content;

        public TemplateExpression() {
            this.content = new ArrayList<Types>();
        }

    public void addTypes(Types node) {
        this.content.add(node);
    }


    @Override
        public String toString() {

        StringBuilder sb = new StringBuilder();
     //   sb.append("Template Expression : {{ ");
        sb.append(" {{ ");
        for (Types child : this.content) {
            sb.append(child);
        }
        sb.append("}\n");

        return sb.toString();
        }

    }



