package AST;

import java.util.List;

public class HtmlDeclare extends Types {

     OpenTag openTag;
     List<Types> htmlBody;
     CloseTag closeTag;
     SelfClosingTag selfClosingTag;

    public HtmlDeclare(OpenTag openTag, List<Types> htmlBody, CloseTag closeTag) {
        this.openTag = openTag;
        this.htmlBody = htmlBody;
        this.closeTag = closeTag;

    }

    public HtmlDeclare(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
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

    public SelfClosingTag getSelfClosingTag() {
        return selfClosingTag;
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

    public void setSelfClosingTag(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
//        sb.append("Html Element:\n");
        if (openTag != null && closeTag != null) {

//            if (openTag != null) {
            sb.append("  Open Tag: ").append(openTag).append("\n");

//            }
//            else {
//                sb.append("  No Open Tag\n");
//
//            }
            if (htmlBody != null) {
                sb.append("  Html Body: {\n");
                for (Types bodyElement : htmlBody) {
                    sb.append("    - ").append(bodyElement).append("\n");
                }
                sb.append(" }\n");
            } else {
                sb.append("  No Html Body\n");
            }

            sb.append("  Close Tag: ").append(closeTag).append("\n");
        }

else if (selfClosingTag != null) {
    sb.append("  Self Closing Tag: ").append(selfClosingTag).append("\n");
        }
        return sb.toString();

     }
}