package AST;

public class PropertyAccess extends Types{
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

    public String generate(){
        StringBuilder sb = new StringBuilder();
            sb.append(mark);
        return sb.toString();
    }

    @Override
    public String toString() {
        return   mark;
    }
}
