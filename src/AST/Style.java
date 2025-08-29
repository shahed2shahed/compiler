package AST;

public class Style extends TemplateHtmlDeclaration{
    String style;
    String colon;
    String name;

    public Style(String style, String colon, String name) {
        this.style = style;
        this.colon = colon;
        this.name = name;
    }

    @Override
    public String generateCSS() {
        StringBuilder sb = new StringBuilder();
        sb.append(name.replace("\"", ""));
        return sb.toString();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Style CSS :\n");
        sb.append(style).append("\n");
        sb.append(colon).append("\n");
        sb.append(name).append("\n");
        return sb.toString();
    }

}


