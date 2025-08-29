package AST;

import java.util.List;

import static AST.NormalHtmlTagNode.getLastGenerated;
import static AST.NormalfunctionDecl.getSave;

public class Values extends Expression {
    private String mark;

    public Values(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
    private static boolean visited = false;
    private static int k = 0;
    static String s;


    @Override
    public String generateVarJS(){
        StringBuilder sb = new StringBuilder();
        sb.append(generate());
        sb.append("()");
        sb.append(";");
        sb.append("\n");
        return sb.toString();
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(mark);
        sb.append(" ");
        return sb.toString();
    }

    @Override
    public String generateJSWithBody(List<Types> htmlBody) {
        StringBuilder stringBuilder = new StringBuilder();
        k++;
        if (!visited) {
            stringBuilder.append(getLastGenerated())
                    .append(".addEventListener(\"submit\", (e) => {\n")
                    .append("e.preventDefault();\n");
            visited = true;
        }


        for (Types type : htmlBody) {
            for (var child : type.getOpenTag().getContent()) {
                if (child.toString().equals("ngModel")) {
                    for (int j = 0; j < type.getOpenTag().getContent().size(); j++) {
                        String token = type.getOpenTag().getContent().get(j).generate().trim();
                        if (token.equals("name")) {
                            if (j + 2 < type.getOpenTag().getContent().size()) {
                                String value = type.getOpenTag().getContent().get(j + 2).generate().trim();
                                value = value.replace("\"", "");

                                if (!value.isEmpty()) {
                                    System.out.println("Adding ngModel for: " + value);
                                    if (value.equals("name")) {
                                         s = (value+i++);
                                        stringBuilder.append("const ").append(s).append(" = ")
                                                .append("document.getElementById('")
                                                .append(value).append("').value.trim();\n");
                                    } else {
                                        stringBuilder.append("const ").append(value).append(i++).append(" = ")
                                                .append("document.getElementById('")
                                                .append(value).append("').value;\n");
                                    }
                                } else {
                                    System.out.println("Skipped null or empty value");
                                }
                            }
                        }
                    }
                }
            }
        }


        if(k == 3) {
            stringBuilder.append("if (!").append("name0").append(") {\n").append("alert(\"Product name is required!\");\n  return;}\n");
            stringBuilder.append(" const newId = products.length > 0\n").append("? Math.max(...products.map(p => p.id || 0)) + 1\n").
                    append(": 1;\n");

            stringBuilder.append(getSave());

            stringBuilder.append("products.push(newProduct);\n")
                    .append("localStorage.setItem(\"products\", JSON.stringify(products));\n")
                    .append("window.location.href = \"index.html\";\n")
                    .append("});\n");
        }
        return stringBuilder.toString();
    }

    public static String getTag(){
        return s;
    }

    @Override
    public String toString() {
        return mark;
    }
}
