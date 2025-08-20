package AST;

public class Module extends ComponentDeclaration {
    private String mark;

    public Module(String mark) {
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
