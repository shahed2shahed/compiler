package AST;

public class EventBinding extends Types {
    String click;
    String functionName;


    public EventBinding(String click , String functionName) {
        this.click = click;
        this.functionName = functionName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("click").append(click);
        sb.append("function name").append(functionName);
        return   sb.toString();
    }
}
