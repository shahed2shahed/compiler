package AST;

import java.util.ArrayList;
import java.util.List;

public class EventHandlerArrowFunction extends ArrowFunction{
    PropertyAccess property;
    Parameters parameters;
    Type type;
    List<Body> body;

    public EventHandlerArrowFunction(){
        this.property = property;
        this.parameters = parameters;
        this.type = type;
        this.body = new ArrayList<Body>();
    }

    public void addChild(Body node) {
        this.body.add(node);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Arrow Function : \n");

        sb.append("Property Access : " + property + "\n");
        if (parameters != null) {
            sb.append("Parameter : " + parameters + "\n");
        }
        if (type != null) {
            sb.append("Type : " + type + "\n");
        }
        if (body != null) {
            sb.append("Body : \n");
            for (Body child : this.body) {
                sb.append(child + "\n");
            }
        }
        return sb.toString();
    }
}
