package AST;

public class ReturnStat extends Body{
    ReturnType type;
    public ReturnStat(ReturnType type) {
        this.type = type;
    }

    public ReturnType getType() {
        return type;
    }
    public void setType(ReturnType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Return Statement : \n");
        sb.append("Return Type : \n");
        sb.append(type.toString());
        return sb.toString();
    }
}
