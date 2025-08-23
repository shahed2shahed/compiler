package AST;

import java.util.List;

public class NgForDirective extends DirectiveStatementNode {

    NgForValue value;

    public NgForDirective(NgForValue value) {
        this.value = value;
    }

    public NgForValue getValue() {
        return value;
    }

 //   oldd
//
//    @Override
//    public String generateJS() {
//        StringBuilder s = new StringBuilder();
//        s.append(value.generateJS());
//        return s.toString();
//    }


    @Override
    public String generateWithBody(List<Types> bodyChildren) {
        StringBuilder sb = new StringBuilder();
      //  sb.append("for(...) {\n");
        if (bodyChildren != null) {
          //  for (Types child : bodyChildren) {
                sb.append(value.generateJS(bodyChildren));
              //  sb.append(child.generate()).append("\n"); // إضافة newline
            //}
        }
    //    sb.append("}\n");
        return sb.toString();
    }


    @Override
    public String generateJS() {
        // بدون bodyChildren
        return value.generateJS(null);
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
       // sb.append("Ng For Directive { \n");
        sb.append(value + "\n");
      //  sb.append("}\n");

        return sb.toString();
    }
}
