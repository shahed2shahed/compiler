package AST;

import java.util.List;

public abstract class AstNode {
    Integer i = 0;
    public String generate() { return ""; }
    public String generateHTML() { return ""; }
    public String generateCSS()  { return ""; }
    public String generateJS()   { return ""; }
    public OpenTag getOpenTag() { return new OpenTag(); }
    public String generateID()  { return ""; }
    public String generateJS(String varAdd)   { return ""; }
    public String generateJS(StringBuilder varAdd)   { return ""; }
    public String generateJS(List<Types>  htmlBody)   { return ""; }
    public String generateJS(List<Types>  htmlBody , String varAdd)   { return ""; }
    public String generateJS(List<Types> htmlBody , StringBuilder classN)   { return ""; }
    public String generateWithBody(List<Types> bodyChildren)   { return ""; }
    public String generateWithBody(List<Types> bodyChildren , StringBuilder classN)   { return ""; }

}
