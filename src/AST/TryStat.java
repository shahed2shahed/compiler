package AST;

public class TryStat extends Expression{
    String try_name;
    ConditionStat stat;

    public TryStat(String try_name, ConditionStat stat){
        this.try_name = try_name;
        this.stat = stat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Try Stat :");
        sb.append("\n");

        sb.append(try_name);
        sb.append("\n");

        sb.append(stat);
        sb.append("\n");
        return sb.toString();
    }
}
