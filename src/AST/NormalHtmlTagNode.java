package AST;
import java.util.List;

public class NormalHtmlTagNode extends HtmlDeclare {

     OpenTag openTag;
     List<Types> htmlBody;
     CloseTag closeTag;
     private boolean autoIdAdded = false;

     public NormalHtmlTagNode() {}
     public NormalHtmlTagNode(OpenTag openTag, List<Types> htmlBody, CloseTag closeTag) {
        this.openTag = openTag;
        this.htmlBody = htmlBody;
        this.closeTag = closeTag;
    }

    public OpenTag getOpenTag() {
        return openTag;
    }

    public List<Types> getHtmlBody() {
        return htmlBody;
    }

    public CloseTag getCloseTag() {
        return closeTag;
    }



    public void setOpenTag(OpenTag openTag) {
        this.openTag = openTag;
    }

    public void setHtmlBody(List<Types> htmlBody) {
        this.htmlBody = htmlBody;
    }

    public void setCloseTag(CloseTag closeTag) {
        this.closeTag = closeTag;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        boolean childHasNgFor = false;
        boolean childH = false;


        if (openTag != null) {
            boolean isNgDirective = false;
            String classValue = "";

            for (Types child : openTag.getContent()) {
                if (child instanceof NgForDirective || child.toString().equals("h5")) {
                    isNgDirective = true;
                }

            }

            if (htmlBody != null) {
                for (Types child : htmlBody) {
                    if (child instanceof NormalHtmlTagNode) {
                        NormalHtmlTagNode elem = (NormalHtmlTagNode) child;
                        if (elem.getOpenTag() != null) {
                            for (Types c : elem.getOpenTag().getContent()) {

                                if (c instanceof NgForDirective || c.toString().equals("h5")) {
                                    childHasNgFor = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }

            if (!isNgDirective) {
                sb.append("\n");
                if(!childHasNgFor) {
                    sb.append(openTag.generate());
                }
                if(childHasNgFor && !autoIdAdded) {
                    sb.append(openTag.generateID());
                    autoIdAdded = true;
                }

                 if(htmlBody != null) {
                    for (Types child : htmlBody) {
                            sb.append(child.generate());
                            sb.append(" ");
                    }
                }
                sb.append(closeTag.generate());
            }
        }
        return sb.toString();
    }

    @Override
    public String generateJSS() {
            StringBuilder sb = new StringBuilder();

            if (openTag != null) {
                boolean isNgDirective = false;
                String classValue = "";

                for (Types child : openTag.getContent()) {
                    if (child instanceof NgForDirective) {
                        isNgDirective = true;
                    }
                }

                if (!isNgDirective) {
                    sb.append("\n");
                    if (openTag.getTagName().equals("button")) {
                        sb.append(openTag.generateJSS());
                    }
                    else{
                        sb.append(openTag.generate());
                    }

                    // ✅ توليد htmlBody مع تحويل {{ ... }} إلى ${ ... }
                    if (htmlBody != null) {
                        for (Types child : htmlBody) {
                            if (child instanceof TemplateExpression) {
                                String expr = ((TemplateExpression) child).generate();
                                sb.append("${").append(expr).append("}");
                            }
                            else {
                                sb.append(child.generateJSS());
                            }
                        }
                    }

                    sb.append(closeTag.generate());
                }
            }
            return sb.toString();
    }


@Override
public String generateJS() {
    StringBuilder sb = new StringBuilder();
    boolean isNgDirective = false;
    String classValue = "";
    StringBuilder s = new StringBuilder();

        for (Types child : openTag.getContent()) {


            if(child.toString().equals("h5")) {
                isNgDirective = true;
                sb.append(child.generateJSWithBody(htmlBody )).append(" ");
            }

                if (child instanceof NgForDirective) {
                    isNgDirective = true;

                  //  sb.append(((NgForDirective) child).generateJS());
                    for (Types attr : openTag.getContent()) {
                        System.out.println("opeeen" + attr.getClass().getSimpleName());
                        if (attr instanceof ClassEx) {
                            for (Types v : openTag.getContent()) {
                                if (v instanceof Values) {
                                    classValue += ((Values) v).getMark();
                                    classValue = classValue.replaceAll("^\"|\"$", "");
                                }
                            }
                             s.append(".className = \"").append(classValue).append("\";\n");
                        }
                    }

                    System.out.println("sOHH" + s);
                    sb.append(child.generateJSWithBody(htmlBody , s)).append(" ");
                  //  sb.append(child.generateJS(openTag.getTagName())).append("\n");
                }

            if (!isNgDirective) {
            if (child instanceof EventBinding | child instanceof NgIfDirective) {
                sb.append(" const " + openTag.getTagName()).
                        append(" = document.getElementById('").
                        append(openTag.generateJS()).append("');");
                sb.append("\n");
            }
        }
            }

    boolean childHasNgFor = false;
    if (htmlBody != null) {
        for (Types child : htmlBody) {
            if (child instanceof NormalHtmlTagNode) {
                NormalHtmlTagNode elem = (NormalHtmlTagNode) child;
                if (elem.getOpenTag() != null) {
                    for (Types c : elem.getOpenTag().getContent()) {
                        if (c instanceof NgForDirective || c.toString().equals("h5")) {
                            childHasNgFor = true;
                            break;
                        }
                    }
                }
            }
        }
    }

    if(childHasNgFor) {
        sb.append(" const " + openTag.getTagName()+i++).
                append(" = document.getElementById('").
                append(openTag.generateJS()).append("');");
        sb.append("\n");
    }

            if (!isNgDirective) {
                if(htmlBody != null) {
                    for (Types child : htmlBody) {
                        sb.append(child.generateJS());
                        sb.append(" ");
                    }
                  }
                }
        return sb.toString();
    }




//    @Override
//    public String generateJS(String varAdd){
//         StringBuilder builder = new StringBuilder();
//        if (openTag != null) {
//            boolean isNgDirective = false;
//            String classValue = "";
//
//            for (Types attr : openTag.getContent()) {
//                System.out.println("opeeen" + attr.getClass().getSimpleName());
//                if (attr instanceof ClassEx) {
//                    for (Types v : openTag.getContent()) {
//                        if (v instanceof Values) {
//                            classValue += ((Values) v).getMark();
//                            classValue = classValue.replaceAll("^\"|\"$", "");
//                        }
//                    }
//                    builder.append(".className = \"").append(classValue).append("\";\n");
//                }
//            }
//        }
//        return builder.toString();
//}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
           sb.append("  Open Tag: ").append(openTag).append("\n");

        sb.append(openTag.toString());
            if (htmlBody != null) {
            sb.append("  Html Body: {\n");
                for (Types bodyElement : htmlBody) {
                    sb.append("    - ");
                   sb.append(bodyElement);
                    sb.append("\n");
                }
                sb.append(" }\n");
            }
//            else {
//                sb.append("  No Html Body\n");
//            }

            sb.append("  Close Tag: ");
                    sb.append(closeTag).append("\n");
        return sb.toString();}
}
