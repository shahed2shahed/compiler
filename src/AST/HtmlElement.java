package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement extends HtmlDeclare {
    private OpenTag openTag;
    private List<Types> htmlBody;
    private CloseTag closeTag;

    public HtmlElement(OpenTag openTag , List<Types> htmlBody , CloseTag closeTag) {
        this.openTag = openTag;
        this.htmlBody = htmlBody;
        this.closeTag =closeTag;
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Html Element:\n");
        if (openTag != null) {
            sb.append("  Open Tag: ").append(openTag).append("\n");

        }
        else {
            sb.append("  No Open Tag\n");

        }
        if (htmlBody != null) {
            sb.append("  Html Body:\n");
            for (Types bodyElement : htmlBody) {
                sb.append("    - ").append(bodyElement).append("\n");
            }
        }
        else {
            sb.append("  No Html Body\n");
        }

        sb.append("  Close Tag: ").append(closeTag).append("\n");
        return sb.toString();
    }

}
