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

// HTML
//    @Override
//    public String generate(){
//        StringBuilder sb = new StringBuilder();
//
//        if (openTag != null) {
//            sb.append(openTag.generate());
//        }
//
//        if (htmlBody != null && !htmlBody.isEmpty()) {
//            for (Types child : htmlBody) {
//                sb.append(child.generate());
//                sb.append("\n");
//            }
//        }
//
//        if (closeTag != null) {
//            sb.append(closeTag);
//        }
//
//        return sb.toString();
//    }


    //Old
//    @Override
//    public String generate() {
//        StringBuilder sb = new StringBuilder();
//
//        if (openTag != null) {
//            sb.append(openTag.generateJS());
//        }
//
//        if (htmlBody != null && !htmlBody.isEmpty()) {
//            for (Types child : htmlBody) {
//                sb.append(child.generate());
//                sb.append("\n");
//            }
//        }
//
//        return sb.toString();
//    }


    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();

        // [DEBUG] تتبع OpenTag
        if (openTag != null) {
            boolean hasNgFor = false;

            for (Types child : openTag.getContent()) {
                if (child instanceof NgForDirective) {
                    hasNgFor = true;
                    sb.append(child.generateWithBody(htmlBody));
                    System.out.println(child.getClass().getSimpleName() + "OOOOOO irj");
                }
            }

            if (!hasNgFor) {
                sb.append(openTag.generate());
                if (htmlBody != null) {
                    for (Types child : htmlBody) {
                        System.out.println(child.getClass().getSimpleName() + "FFFsekw irj");
                        sb.append(child.generate());
                    }
                }
            }
        }


        return sb.toString();
    }

//    @Override
//    public String generateJS() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(openTag.generateJS());
//        if (htmlBody != null) {
//            for (Types child : htmlBody) {
//                 System.out.println(child.getClass().getSimpleName() + "FFFsekw irj");
//                    sb.append(child.generate());
//            }
//        }
//    return sb.toString();
//    }
@Override
public String generateJS() {
    StringBuilder sb = new StringBuilder();

    if (openTag != null) {

        boolean isNgFor = false;
        for (Types child : openTag.getContent()) {
            if (child instanceof NgForDirective) {
                isNgFor = true;
                // تمرير htmlBody + اسم المتغير الحالي للـ loop
                sb.append(((NgForDirective) child).generateWithBody(htmlBody));
            }
        }

        if (!isNgFor) {
            String tagVar = openTag.getTagName();
            sb.append("const ").append(tagVar)
                    .append(" = document.createElement('").append(tagVar).append("');\n");

            for (Types child : openTag.getContent()) {
                if (child instanceof EventBinding) {
                    EventBinding eb = (EventBinding) child;
                    // بدون index لأنه مش ضمن NgFor
                    sb.append(tagVar)
                            .append(".addEventListener('").append(eb.click)
                            .append("', () => ").append(eb.functionName).append("());\n");
                }
            }

            if (htmlBody != null && !htmlBody.isEmpty()) {
                for (Types child : htmlBody) {
                    sb.append(tagVar).append(".textContent = '")
                            .append(child.toString()).append("';\n");
                }
            }

            sb.append("container.appendChild(").append(tagVar).append(");\n");
        }
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
//                    sb.append("    - ");
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
