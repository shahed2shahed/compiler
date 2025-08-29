package AST;
import java.util.List;

import static AST.SelfClosingTag.getLast;

public class NormalHtmlTagNode extends HtmlDeclare {

     OpenTag openTag;
     List<Types> htmlBody;
     CloseTag closeTag;
     static int  r = 0;
     private boolean autoIdAdded = false;

    static String  var;
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
        boolean isNgSubmit = false;


        if (openTag != null) {
            boolean isNgDirective = false;
            String classValue = "";

            for (Types child : openTag.getContent()) {
                if (child instanceof NgForDirective || child.toString().equals("h5")) {
                    isNgDirective = true;
                }

                if(child.toString().equals("ngSubmit")){
                    isNgSubmit = true;
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
                if(!childHasNgFor && !isNgSubmit) {
                    sb.append(openTag.generate());
                }

                if(childHasNgFor && !autoIdAdded) {
                    sb.append(openTag.generateID());
                    autoIdAdded = true;
                }

                if(isNgSubmit && !autoIdAdded) {
                    sb.append(openTag.generateNgSubmit());
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
        boolean isNgSubmit = false;
        String classValue = "";
        String classV = "";

        StringBuilder s = new StringBuilder();

        for (Types child : openTag.getContent()) {
            if (child instanceof ClassEx) {
                for (Types v : openTag.getContent()) {
                    if (v instanceof Values) {
                        classV += ((Values) v).getMark();
                        classV = classV.replaceAll("^\"|\"$", "");
                        if (classV.equals("form-group")) {

                             if (getLast() != null) {
                                    sb.append(getLast());
                                }

                            sb.append(v.generateJSWithBody(htmlBody));
                        }
                    }
                }
            }

            if (child.toString().equals("ngSubmit")) {
                isNgSubmit = true;
            }

            if (child.toString().equals("h5")) {
                isNgDirective = true;
                sb.append(child.generateJSWithBody(htmlBody)).append(" ");
            }

            if (child instanceof NgForDirective) {
                isNgDirective = true;
                for (Types attr : openTag.getContent()) {
                    if (attr instanceof ClassEx) {
                        for (Types v : openTag.getContent()) {
                            if (v instanceof Values) {
                                classValue += ((Values) v).getMark();
                                classValue = classValue.replaceAll("^\"|\"$", "");
                            }
                        }
                        s.append(".className = \"").append(classValue).append("\"\n");
                    }
                }
                sb.append(child.generateJSWithBody(htmlBody , s)).append(" ");
            }

            if (!isNgDirective || !isNgSubmit) {
                if (child instanceof EventBinding || child instanceof NgIfDirective) {
                    sb.append(" const " + openTag.getTagName())
                            .append(" = document.getElementById('")
                            .append(openTag.generateJS()).append("');\n");
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

        if (isNgSubmit) {
            sb.append("let products = JSON.parse(localStorage.getItem(\"products\") || \"[]\");\n");
            sb.append("let fileDataUrl = null;\n");
            var = openTag.getTagName() + i++;
            sb.append(" const " + var)
                    .append(" = document.getElementById('")
                    .append(openTag.generateJS()).append("');\n");
        }

        if (childHasNgFor) {
            var = openTag.getTagName() + i++;
            sb.append(" const " + var)
                    .append(" = document.getElementById('")
                    .append(openTag.generateJS()).append("');\n");
        }

        if (!isNgDirective) {
            if (htmlBody != null) {
                for (Types child : htmlBody) {
                    sb.append(child.generateJS()).append(" ");
                }
            }
        }

        return sb.toString();
    }



    public static String getLastGenerated() {
        return var;
    }



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
            sb.append("  Close Tag: ");
                    sb.append(closeTag).append("\n");
        return sb.toString();}
}
