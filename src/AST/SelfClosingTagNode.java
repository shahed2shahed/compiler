package AST;

import java.util.List;

public class SelfClosingTagNode extends HtmlDeclare {
      SelfClosingTag selfClosingTag;

    public SelfClosingTagNode(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
    }


    public SelfClosingTag getSelfClosingTag() {
        return selfClosingTag;
    }


    public void setSelfClosingTag(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
    }

      @Override
    public String toString() { 
        StringBuilder sb = new StringBuilder();
 if (selfClosingTag != null) {
    sb.append("  Self Closing Tag: ").append(selfClosingTag).append("\n");
        }
        return sb.toString();
    }
}
