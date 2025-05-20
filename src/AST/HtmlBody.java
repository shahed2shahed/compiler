package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlBody extends Types{

    List<Types> content ;

    public HtmlBody() {
        this.content = new ArrayList<>();
    }

    public List<Types> getContent() {
        return content;
    }

    public void setContent(List<Types> content) {
        this.content = content;
    }

    public void addNode(Types node) {
        this.content.add(node);
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (content != null) {
            for (Types item : content) {
                sb.append(item.toString()).append(" ");
            }
        }

        else {
            sb.append("No content");
        }

        return sb.toString();
    }
}


