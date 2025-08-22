package AST;

public class TemplateNode extends StatementNode {
    private final String html;

    public TemplateNode(String html) {
        this.html = html;
    }

    @Override
    public String generateHTML() {
        return html;
    }
}
