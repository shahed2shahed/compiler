package AST;

import java.util.ArrayList;
import java.util.List;

public class OpenTag extends NormalHtmlTagNode  {
    String tagName;
    List<Types> content ;
    private String lastGeneratedId;

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

        if (content != null && !content.isEmpty()) {

            sb.append("<");
            for (Types child : content) {
                sb.append(child.generate());
                sb.append(" ");

                    if(tagName.equals("button") && !autoIdAdded){
                        sb.append("id = ");
                        lastGeneratedId = "addBtn" + (i++);
                        sb.append("\"").append(lastGeneratedId).append("\" ");
                        autoIdAdded = true;
                    }

                    if(child.getClass().getSimpleName().equals("NgIfDirective") && !autoIdAdded){
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
                    else if (!(attr instanceof TemplateExpression)) { // الباقي attributes
                       sb.append(attr.generate().trim()).append(" ");
                    }
                }
            }

            sb.append(">");
        }

        return sb.toString();
    }

//    @Override
//    public String generateJSS() {
//        StringBuilder sb = new StringBuilder();
//        if(tagName.equals("button")) {
//            System.out.println("yessssssssssssssssssssssssssssssss");
//            sb.append("<button");
//            for (Types attr : content) {
//                System.out.println(attr.getClass().getSimpleName() + "Herrrrreyessssssssssssssssssssssssssssssss");
//
//                if (attr instanceof EventBinding) {
//                    EventBinding eb = (EventBinding) attr;
//                    String expr = eb.functionName.replaceAll("\\{\\{\\s*(.*?)\\s*\\}\\}", "\\$\\{$1\\}");
//                    sb.append(" onclick=\"").append(expr).append("\"");
//                }
//            }
//            sb.append(">");
//            if (content != null) {
//                for (Types attr : content) {
//                    sb.append(attr.generate());
//                }
//            }
//            sb.append("</button>");
//        }
//        return sb.toString();
//    }

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
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        for (Types item : content) {
            sb.append(item).append(" ");
        }
        sb.append(">");
        return sb.toString();
    }


}


