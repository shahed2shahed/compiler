package AST;

public class TemplateHtmlUrl extends TemplateElement{
    String url;

    public TemplateHtmlUrl(String url) {
    this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Template Declaration:\n");
        sb.append("  Template Body:\n");
        sb.append(String.join(", ", this.url));
        sb.append("\n");
        return sb.toString();    }
}
