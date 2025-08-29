package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static AST.SelfClosingTag.stripOuterQuotes;

public class OpenTag extends NormalHtmlTagNode  {
    String tagName;
    List<Types> content ;
    private String lastGeneratedId;
    static String lastGenerated;

    private boolean autoIdAdded = false;

    public OpenTag() {
        this.content = new ArrayList<>();
    }

    public OpenTag(String tagName) {
        this.tagName = tagName;
        this.content = new ArrayList<>();
    }

    public String getTagName() {
        return tagName;
    }

    public List<Types> getContent() {
        return content;
    }

    public void setContent(List<Types> content) {
        this.content = content;
    }

    public void addTypes(Types node) {
        node.setParent(this);
        this.content.add(node);
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();

        boolean hasNgModel = content.stream()
                .anyMatch(child -> "ngModel".equalsIgnoreCase(child.toString()));

        if (hasNgModel) {
            sb.append(generateHTML());
            return sb.toString();
        }

        boolean buttonHasDisabled = false;

        if (content != null && !content.isEmpty()) {

            sb.append("<");

            if (tagName.equals("button")) {
                buttonHasDisabled = content.stream()
                        .anyMatch(child -> child.toString().contains("disabled"));
            }

            boolean skipAngularAttr = false;

            for (Types child : content) {
                String childStr = child.toString().trim();

                if (childStr.equals("[")) {
                    skipAngularAttr = true;
                    continue;
                }

                if (skipAngularAttr) {
                    if (childStr.endsWith("\"")) {
                        skipAngularAttr = false;
                    }
                    continue;
                }

                sb.append(child.generate());
                sb.append(" ");

                if (tagName.equals("button") && !autoIdAdded && !buttonHasDisabled) {
                    sb.append("id = ");
                    lastGeneratedId = "addBtn" + (i++);
                    sb.append("\"").append(lastGeneratedId).append("\" ");
                    autoIdAdded = true;
                }

                if (child.getClass().getSimpleName().equals("NgIfDirective") && !autoIdAdded) {
                    sb.append("id = \"");
                    lastGeneratedId = child.getClass().getSimpleName() + (i++);
                    sb.append(lastGeneratedId).append("\" ");
                    autoIdAdded = true;
                }
            }
        }

        sb.append(">");
        return sb.toString();
    }




    @Override
    public String generateHTML() {
        StringBuilder sb = new StringBuilder();

        if (content != null && !content.isEmpty()) {

            String tagName = content.getFirst().generate().trim();
            sb.append("<").append(tagName);

            Set<String> booleanAttributes = Set.of("required", "disabled", "checked", "readonly", "autofocus");

            String currentName = null;
            boolean haveEquals = false;
            String currentValue = null;

            for (int i = 1; i < content.size(); i++) {
                String part = content.get(i).generate().trim();
                if (part.isEmpty()) continue;

                if ("[".equals(part) && i + 4 < content.size() &&
                        "(".equals(content.get(i + 1).generate().trim()) &&
                        "ngModel".equalsIgnoreCase(content.get(i + 2).generate().trim()) &&
                        ")".equals(content.get(i + 3).generate().trim()) &&
                        "]".equals(content.get(i + 4).generate().trim())) {

                    i += 4;
                    if (i + 2 < content.size() && "=".equals(content.get(i + 1).generate().trim())) {
                        i += 2;
                    }
                    continue;
                }

                if ("=".equals(part)) {
                    haveEquals = true;
                    continue;
                }

                if (currentName == null && !haveEquals) {
                    currentName = part;

                    // name -> id
                    if ("name".equals(currentName)) {
                        currentName = "id";
                    }

                    if (booleanAttributes.contains(currentName.toLowerCase())) {
                        sb.append(" ").append(currentName);
                        currentName = null;
                    }

                    continue;
                }

                if (haveEquals && (part.startsWith("\"") || part.startsWith("'"))) {
                    currentValue = stripOuterQuotes(part);
                    sb.append(" ").append(currentName).append("=\"").append(currentValue).append("\"");

                    currentName = null;
                    haveEquals = false;
                    currentValue = null;
                }
            }
                sb.append(">");

        }

        return sb.toString();
    }

    @Override
    public String generateJSS() {
        StringBuilder sb = new StringBuilder();

        if (tagName.equals("button")) {
            sb.append("<");

            if (content != null) {
                for (Types attr : content) {
                    if (attr instanceof EventBinding) {
                        EventBinding eb = (EventBinding) attr;
                        String expr = eb.functionName.replaceAll("\\{\\{\\s*(.*?)\\s*\\}\\}", "\\$\\{$1\\}");
                        sb.append(" onclick=\"").append(expr + "(${"+eb.index+"})").append("\"");
                    }
                    else if (!(attr instanceof TemplateExpression)) {
                       sb.append(attr.generate().trim()).append(" ");
                    }
                }
            }

            sb.append(">");
        }

        return sb.toString();
    }


    @Override
    public String generateNgSubmit() {
        StringBuilder sb = new StringBuilder();
        if (content != null && !content.isEmpty()) {
            sb.append("<");
            sb.append(tagName);
            sb.append(" ");
            sb.append("id = \"");
            lastGeneratedId =  tagName+"Product"+i++;
            sb.append(lastGeneratedId).append("\" ");
        }
        sb.append(">");
        return sb.toString();
    }


    @Override
    public String generateID() {
        StringBuilder sb = new StringBuilder();
        if (content != null && !content.isEmpty()) {
            sb.append("<");
            for (Types child : content) {
                sb.append(child.generate());
                sb.append(" ");
            }
            sb.append("id = \"");
            lastGeneratedId = content.getFirst().getClass().getSimpleName() + (i++);
            sb.append(lastGeneratedId).append("\" ");
        }
        sb.append(">");
        return sb.toString();
    }


    public String getLastGeneratedId() {
        return lastGeneratedId;
    }

        @Override
        public String generateJS() {

            return getLastGeneratedId();
        }



    @Override
    public String generateJSWithBody(List<Types> htmlBody){
        StringBuilder stringBuilder = new StringBuilder();

        if (content != null && !content.isEmpty()) {

            for (Types type : content) {
                stringBuilder.append(type.generateJS(htmlBody));
            }
        }

        return  stringBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        for (Types item : content) {
            sb.append(item).append(" ");
        }
        sb.append(">");
        return sb.toString();
    }


}


