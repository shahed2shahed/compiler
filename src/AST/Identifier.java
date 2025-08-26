package AST;

import java.util.List;

public class Identifier extends PrimitiveTypeNode {

    private String value;

    public Identifier(String value) {
        this.value = value;
    }

    public String getIdentifierNode() {
        return value;
    }

    public void setIdentifierNode(String value) {
        this.value = value;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        return sb.toString();
    }

    @Override
    public String generateJSS() {
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        return sb.toString();
    }


    @Override
    public String generateJSWithBody(List<Types> htmlBody) {
            StringBuilder js = new StringBuilder();
            String tagVar = "ele" + i++;


                js.append("\n");
                js.append("function renderDetails(product) {");
                js.append('\n');
                js.append("div0.innerHTML = `\n");

                if (htmlBody != null && !htmlBody.isEmpty()) {
                    for (Types child : htmlBody) {
                        System.out.println("OOOOOOOOOOOOOO9" + child.getClass().getSimpleName());

                        js.append(child.generateJSS()).append("\n");
                    }
                    js.append("`;");
                    js.append("\n");

                }

                js.append("}\n");
                js.append("renderDetails(product);\n");


            return js.toString();
    }



    @Override
    public String toString() {
        return value;
    }
}
