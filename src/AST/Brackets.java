package AST;

public class Brackets extends StateManagement{
    private String mark;

    public Brackets(String mark) {
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
