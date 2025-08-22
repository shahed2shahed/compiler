package AST;

import java.util.ArrayList;
import java.util.List;

public class OpenTag extends NormalHtmlTagNode  {

    List<Types> content ;

    public OpenTag() {
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

//   HTML
//    @Override
//    public String generate() {
//        StringBuilder sb = new StringBuilder();
//        if (content != null && !content.isEmpty()) {
//            sb.append("<");
//            for (Types child : content) {
//
//                if (!(child instanceof NgForDirective)){
//                    sb.append(child.generate());
//                    sb.append("\n");
//                }
//            }
//        }
//        sb.append(">");
//        return sb.toString();
//    }

    @Override
    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        if (content != null && !content.isEmpty()) {
//            sb.append("<");
            for (Types child : content) {

                if (child instanceof NgForDirective){
                    sb.append(child.generateJS());
                }
            }
        }
//        sb.append(">");
        return sb.toString();
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
