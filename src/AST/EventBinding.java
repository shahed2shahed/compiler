package AST;

import java.util.List;

public class EventBinding extends Types {
    String click;
    String functionName;
    String index;


    public EventBinding(String click , String functionName , String index) {
        this.click = click;
        this.functionName = functionName;
        this.index = index;
    }

    @Override
    public String generateJS() {
        return "";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
//        sb.append("click").append(click);
sb.append(click);
sb.append(" ");
//        sb.append("function name").append(functionName);
sb.append(functionName);
        return   sb.toString();
    }
}
