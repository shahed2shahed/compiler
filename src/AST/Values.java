package AST;

public class Values extends Type {
    private String mark;

    public Values(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(mark);
        return sb.toString();
    }

    @Override
    public String toString() {
        return   mark;
    }
}
