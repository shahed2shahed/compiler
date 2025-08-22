package AST;

public class StyleNode extends StatementNode {
    private final String css;

    public StyleNode(String css) {
        this.css = css;
    }

    @Override
    public String generateCSS() {
        return css;
    }
}
