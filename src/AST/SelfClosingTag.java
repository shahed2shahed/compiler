package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SelfClosingTag extends HtmlDeclare{

    List<Types> content ;

    public SelfClosingTag() {

        this.content = new ArrayList<>();
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
    public String generate() {
        StringBuilder sb = new StringBuilder();
        if (content != null && !content.isEmpty()) {
            sb.append("<");
            for (Types child : content) {
                sb.append(child.generate());
                sb.append("\n");
            }
        }
        sb.append("/>");
        return sb.toString();
    }

    @Override
    public String generateJS(String tagVar) {
        if (content == null || content.isEmpty()) return "";

        String tagName = content.get(0).toString().trim(); // أول عنصر هو اسم التاغ
        String varName = "elem";
        StringBuilder sb = new StringBuilder();

        // إنشاء العنصر
        sb.append("const ").append(varName).append(" = document.createElement('")
                .append(tagName).append("');\n");

        // معالجة بقية الـ content كـ Attributes
        StringBuilder rawLineBuilder = new StringBuilder();
        for (int i = 1; i < content.size(); i++) {
            rawLineBuilder.append(content.get(i).toString().trim());
            rawLineBuilder.append(" ");
        }
        String rawLine = rawLineBuilder.toString().trim();
        System.out.println("[DEBUG] Raw attribute line: " + rawLine);

        // Regex لالتقاط attributes من الشكل: [src]="product.image" أو alt="{{ product.name }}"
        Pattern pattern = Pattern.compile("(\\[[^\\]]+\\]|\\w+)\\s*=\\s*\"([^\"]+)\"");
        Matcher matcher = pattern.matcher(rawLine);

        while (matcher.find()) {
            String attrName = matcher.group(1).trim();
            String attrValue = matcher.group(2).trim();

            // التعامل مع [src] إلى src
            if (attrName.startsWith("[") && attrName.endsWith("]")) {
                    attrName = attrName.substring(1, attrName.length() - 1).trim();
            }

            // التعامل مع {{ ... }} داخل alt
            if (attrValue.startsWith("{{") && attrValue.endsWith("}}")) {
                attrValue = attrValue.substring(2, attrValue.length() - 2).trim();
            }

            System.out.println("[DEBUG] Processed attribute: " + attrName + " = " + attrValue);

            sb.append(varName).append(".").append(attrName).append(" = ").append(attrValue).append(";\n");
        }

        // إضافة العنصر إلى div
        sb.append(tagVar+".appendChild(").append(varName).append(");\n");

        System.out.println("[DEBUG] Finished element generation: " + varName);
        return sb.toString();
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        for (Types item : content) {
            sb.append(item.toString()).append(" ");
        }
        sb.append("/>");
        return sb.toString().trim();
    }

}
