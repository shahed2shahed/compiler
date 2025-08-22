package AST;
import java.util.List;

public class NormalHtmlTagNode extends HtmlDeclare {

     OpenTag openTag;
     List<Types> htmlBody;
     CloseTag closeTag;


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
        if (openTag != null) {
            sb.append(openTag.toString());
        }
        if (htmlBody != null && !htmlBody.isEmpty()) {
            sb.append(htmlBody.toString());
        }
        if (closeTag != null) {
            sb.append(closeTag.toString());
        }

        return sb.toString();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
//            sb.append("  Open Tag: ").append(openTag).append("\n");

        sb.append(openTag.toString());
            if (htmlBody != null) {
//                sb.append("  Html Body: {\n");
                for (Types bodyElement : htmlBody) {
//                    sb.append("    - ")
                   sb.append(bodyElement);
                    sb.append("\n");
                }
                //sb.append(" }\n");
            }
//            else {
//                sb.append("  No Html Body\n");
//            }

           // sb.append("  Close Tag: ").
                    sb.append(closeTag).append("\n");
        return sb.toString();}
}
