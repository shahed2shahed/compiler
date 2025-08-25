package AST;

public abstract class Types extends Body {
    private Types parent;

    public Types getParent() {
        return parent;
    }

    public void setParent(Types parent) {
        this.parent = parent;
    }
}
