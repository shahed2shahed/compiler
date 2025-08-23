package AST;

import java.util.ArrayList;
import java.util.List;

public class OpenTag extends NormalHtmlTagNode  {
    String tagName;
    List<Types> content ;

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
        System.out.println("[DEBUG] Adding to OpenTag content: " + node.getClass().getSimpleName());
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


    /// old
//    @Override
//    public String generateJS() {
//        StringBuilder sb = new StringBuilder();
//        if (content != null && !content.isEmpty()) {
////            sb.append("<");
//            for (Types child : content) {
//
//                if (child instanceof NgForDirective){
//                    sb.append(child.generateJS());
//                }
//            }
//        }
////        sb.append(">");
//        return sb.toString();
//    }

        // التعديل الأساسي لتوليد JS مع تمرير الأبناء
        public String generateJS() {
            StringBuilder sb = new StringBuilder();
//System.out.println("Inside generateJS");
//            if (content != null && !content.isEmpty()) {
//                System.out.println("Inside generateJS1");
               for (Types child : content) {
//                    System.out.println(child.getClass().getSimpleName() + "IN");
//                //    if (child instanceof NgForDirective) {
//                        System.out.println("[DEBUG] OpenTag: Generating NgForDirective for child with bodyChildren size: " +
//                                (bodyChildren == null ? 0 : bodyChildren.size()));
//
//                        sb.append(child.generateWithBody(bodyChildren));
                  //  }
//                    else {

                        System.out.println("[DEBUG] OpenTag: Generating normal child: " + child.getClass().getSimpleName());
                        sb.append(child.generate());
//                    }

            }

            return sb.toString();
        }

        @Override
        public String generate() {
            return generateHTML(); // بدون bodyChildren
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
