package AST;

public class Marks extends Types {
    private String mark;
    Operations operations;

    public Marks(String mark) {
        this.mark = mark;
    }

    public Marks(Operations operations) {
        this.operations = operations;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        if (mark != null) {
            sb.append(mark);
        }
        else {
            sb.append(operations.toString());
        }
        return sb.toString();
    }
}
