package AST;

public class PropertyAccess extends AstNode{
    private String mark;

    public PropertyAccess(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return   mark;
    }
}
