package AST;

import java.util.Map;

public class ObjectExpr extends Expression {

    private Map<String, Expression> properties;

    public ObjectExpr(Map<String, Expression> properties) {
        this.properties = properties;
    }

    public Map<String, Expression> getProperties() {
        return properties;
    }
}
   
