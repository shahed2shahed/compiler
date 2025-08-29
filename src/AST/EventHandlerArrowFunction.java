package AST;

import java.util.List;

public class EventHandlerArrowFunction extends ArrowFunction{
    PropertyAccess property;
    Parameters parameters;
    Type type;
    List<Body> body;

    public EventHandlerArrowFunction(PropertyAccess property , Parameters parameters, Type type, List<Body> body) {
        this.property = property;
        this.parameters = parameters;
        this.type = type;
        this.body = body;
    }

    @Override
    public String generateVarJS() {
        StringBuilder s = new StringBuilder();
        if (property!=null){
            s.append(property.generate());
        }
        s.append(" =");
        s.append(parameters.generate());
        s.append("=> { \n");

        if (!body.isEmpty()){
            for (var bodyI : body) {
                s.append(bodyI.generate());
                s.append("\n");
            }
        }
        s.append("};");
        s.append("\n");
        return s.toString();
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
        if (body != null && !body.isEmpty()) {
            sb.append("Body : \n");
            for (Body child : this.body) {
                sb.append(child + "\n");
            }
        }
        return sb.toString();
    }
}
