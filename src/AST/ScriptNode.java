package AST;

public class ScriptNode extends StatementNode {
    private final String js;

    public ScriptNode(String js) {
        this.js = js;
    }

    @Override
    public String generateJS() {
        return js;
    }
}
