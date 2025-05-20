package AST;

public class Marks extends Type {
    private String mark;

    public Marks(String mark) {
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
