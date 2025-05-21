package AST;

import java.util.ArrayList;
import java.util.List;

public class TemplateExpression extends AstNode {


        private List<Types> content;

        public TemplateExpression() {
            this.content = new ArrayList<Types>();
        }

        public List<Types> getContent() {
            return content;
        }

        public void setContent(List<Types> content) {
            this.content = content;
        }
    public void addTypes(Types node) {
        this.content.add(node);
    }


    @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();

        sb.append("Template Expression : ").append("{{ ");
            for (int i = 0; i < content.size(); i++) {
                sb.append(content.get(i).toString());
                if (i < content.size() - 1) {
                    sb.append(" ");
                }
            }
            sb.append("}");
            return sb.toString();
        }

    }



