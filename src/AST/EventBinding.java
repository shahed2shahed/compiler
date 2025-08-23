package AST;

import java.util.List;

public class EventBinding extends Types {
    String click;
    String functionName;


    public EventBinding(String click , String functionName) {
        this.click = click;
        this.functionName = functionName;
    }

//    @Override
//    public String generate() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("const button = document.createElement('button');\n");
//        sb.append("button.textContent = '").append(functionName).append("';\n");
//        sb.append("button.addEventListener('").append(click).append("', () => ").append(functionName).append("());\n");
//        sb.append("container.appendChild(button);\n");
//        return sb.toString();
//    }

    @Override
    public String generateJS() {
        // التعامل مع توليد الزر سيكون من NormalHtmlTagNode
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
