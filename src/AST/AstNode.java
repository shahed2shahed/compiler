package AST;

import java.util.List;

public abstract class AstNode {
    public String generate() { return ""; }
    public String generateHTML() { return ""; }
    public String generateCSS()  { return ""; }
    public String generateJS()   { return ""; }
    public String generateJS(List<Types>  htmlBody)   { return ""; }
    public String generateWithBody(List<Types> bodyChildren)   { return ""; }
}
