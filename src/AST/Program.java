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

    public String generateHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n<html>\n<head>\n");
        sb.append("<title>Generated</title>\n");
        sb.append("</head>\n<body>\n");
        sb.append("<link rel=\"stylesheet\" href=\"style.css\" />\n");

        for (StatementNode child : children) {
            sb.append(child.generate());
            sb.append("\n");
        }

        sb.append("<script src=\"script.js\"></script>\n\n");
        sb.append("</body>\n</html>");
        return sb.toString();
    }
}
