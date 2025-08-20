package AST;

public class CatchStat extends Expression {
    String catch_name;
    ConditionStat stat;

    public CatchStat(String catch_name, ConditionStat stat) {
        this.catch_name = catch_name;
        this.stat = stat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Catch Stat :");
        sb.append("\n");

        sb.append(catch_name);
        sb.append("\n");

        sb.append(stat);
        sb.append("\n");
        return sb.toString();
    }
}
