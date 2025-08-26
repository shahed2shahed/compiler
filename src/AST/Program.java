package AST;

import java.util.ArrayList;

public class Program extends AstNode {

    ArrayList<StatementNode> children;

    public Program() {
        this.children = new ArrayList<>();
    }

    public void addChild(StatementNode node) {
        this.children.add(node);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Program { \n");
        for (StatementNode child : this.children) {
            sb.append(child + "\n");
        }
        sb.append("}\n");

        return sb.toString();
    }


    @Override
    public String generateHTML(String css , String js) {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n<html>\n<head>\n");
        sb.append("<title>Generated</title>\n");

        // استدعاء ملف CSS
        if (css != null && !css.isEmpty()) {
            sb.append("<link rel=\"stylesheet\" href=\"")
                    .append(css)
                    .append("\" />\n");
        }

        sb.append("</head>\n<body>\n");

        for (StatementNode child : children) {
            sb.append(child.generate());
            sb.append("\n");
        }

        if (js != null && !js.isEmpty()) {
            sb.append("<script src=\"")
                    .append(js)
                    .append("\"></script>\n");
        }

        sb.append("</body>\n</html>");
        return sb.toString();
    }


    public String arrayDeclaration() {
        StringBuilder sb = new StringBuilder();

        for (StatementNode child : children) {
            if (!(child instanceof ClassStatement)) {
                continue;
            }
            sb.append(child.generateJS());
            sb.append("\n");
        }

        return sb.toString();
    }

    @Override
    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        sb.append(arrayDeclaration());

        for (StatementNode child : children) {
            if (child instanceof ClassStatement) {
                continue;
            }
            sb.append(child.generateJS());
            sb.append("\n");
        }
        return sb.toString();
    }


}
