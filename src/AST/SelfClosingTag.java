package AST;

import java.util.ArrayList;
import java.util.List;

public class SelfClosingTag{

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
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        for (Types item : content) {
            sb.append(item.toString()).append(" ");
        }
        sb.append("/>");
        return sb.toString().trim();
    }

}
