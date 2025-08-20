package AST;

public class IfReturn extends IfElseStat{
    IfStat ifStat;

    public IfReturn(IfStat ifStat) {
        this.ifStat = ifStat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IfElse Statement :\n");
        sb.append(ifStat.toString());
        return sb.toString();
    }
}
