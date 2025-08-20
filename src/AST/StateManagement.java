package AST;

public class StateManagement extends Body{
    VariableType variableType;
    SimpleArray array;
    Brackets brackets;

    public StateManagement(VariableType variableType, SimpleArray array, Brackets brackets) {
        this.variableType = variableType;
        this.array = array;
        this.brackets = brackets;
    }
    public VariableType getVariableType() {
        return variableType;
    }
    public void setVariableType(VariableType variableType) {
        this.variableType = variableType;
    }
    public SimpleArray getArray() {
        return array;
    }
    public void setArray(SimpleArray array) {
        this.array = array;
    }
    public Brackets getBrackets() {
        return brackets;
    }
    public void setBrackets(Brackets brackets) {
        this.brackets = brackets;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StateManagement :");
        sb.append("  variableType :");
        sb.append(variableType.toString());
        sb.append("\n");
        sb.append("  array :");
        sb.append(array.toString());
        sb.append("\n");
        sb.append("  brackets :");
        sb.append(brackets.toString());
        sb.append("\n");
        return sb.toString();
    }
}
