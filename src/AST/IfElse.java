package AST;

public class IfElse extends IfElseStat{

    IfStat ifStat;
    ConditionStat ifConditionStat;
    ConditionStat elseConditionStat;

    public IfElse(IfStat ifStat , ConditionStat ifConditionStat , ConditionStat elseConditionStat){
        this.ifStat = ifStat;
        this.ifConditionStat = ifConditionStat;
        this.elseConditionStat = elseConditionStat;
    }

    public IfElse(IfStat ifStat , ConditionStat ifConditionStat){
        this.ifStat = ifStat;
        this.ifConditionStat = ifConditionStat;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("IfElse Statement : \n");

        sb.append(ifStat.toString());
        sb.append(ifConditionStat.toString());

        if (elseConditionStat != null) {
            sb.append(elseConditionStat.toString());
        }
        return sb.toString();
    }
}
