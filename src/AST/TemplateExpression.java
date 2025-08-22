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
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(" {{ ");
        for (Types decl : content) {
            sb.append(decl.generate());
        }
        sb.append("}\n");
        return sb.toString();
    }

    @Override
        public String toString() {

        StringBuilder sb = new StringBuilder();
     //   sb.append("Template Expression : {{ ");
        sb.append(" {{ ");
        for (Types child : this.content) {
            sb.append(child.generate());
        }
        sb.append("}\n");

        return sb.toString();
        }

    }



