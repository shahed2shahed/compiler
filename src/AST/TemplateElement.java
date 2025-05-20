package AST;

import java.util.ArrayList;
import java.util.List;

public class TemplateElement extends ComponentBody {
     List<HtmlDeclare> templateBody;

    public TemplateElement() {
        this.templateBody = new ArrayList<>();
    }

    public List<HtmlDeclare> getTemplateBody() {
        return templateBody;
    }

    public void setTemplateBody(List<HtmlDeclare> templateBody) {
        this.templateBody = templateBody;
    }

    public void addHtmlDeclare(HtmlDeclare node) {
        this.templateBody.add(node);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Template Declaration:\n");
        sb.append("  Template Body:\n");
        for (int i = 0; i < templateBody.size(); i++) {
            HtmlDeclare content = templateBody.get(i);
            String prefix = (i == templateBody.size() - 1) ? "    └── " : "    ├── ";
            sb.append(prefix).append(content.toString().replace("\n", "\n    ")).append("\n");
        }
        return sb.toString();
    }
}
