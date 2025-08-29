package AST;

import java.util.ArrayList;
import java.util.List;

public class TemplateHtmlDeclaration extends TemplateElement{
    List<HtmlDeclare> templateBody;
    Style style;

    public TemplateHtmlDeclaration(){}
    public TemplateHtmlDeclaration(List<HtmlDeclare> templateBody, Style style) {
        this.templateBody = templateBody;
        this.style = style;
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
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (HtmlDeclare decl : templateBody) {
            sb.append(decl.generate());
        }
        return sb.toString();
    }

    @Override
    public String generateCSS() {
        StringBuilder sb = new StringBuilder();
            sb.append(style.generateCSS());
        return sb.toString();
    }

    @Override
    public String generateJS() {
        StringBuilder sb = new StringBuilder();

        for (HtmlDeclare decl : templateBody) {
            sb.append(decl.generateJS());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Template Declaration:\n");
        sb.append("  Template Body:\n");
        if (templateBody != null) {
            for (int i = 0; i < templateBody.size(); i++) {
                HtmlDeclare content = templateBody.get(i);
                String prefix = (i == templateBody.size() - 1) ? "    └── " : "    ├── ";
                sb.append(prefix).append(content.toString().replace("\n", "\n    ")).append("\n");
            }
        }

        if(style != null) {
            sb.append(style);
        }

        return sb.toString();
    }
}
