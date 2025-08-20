package AST;

import java.util.ArrayList;
import java.util.List;

public class PropertyStat extends AstNode {
    private List<String> identifiers = new ArrayList<>();
    private FunctionCall func;

    public PropertyStat() {}

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void addIdentifier(String identifier) {
        this.identifiers.add(identifier);
    }

    public FunctionCall getFunc() {
        return func;
    }
    public void setFunc(FunctionCall func) {
        this.func = func;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!identifiers.isEmpty()) {
            sb.append(identifiers);
        }
        if (func != null) {
            sb.append(func.toString());
        }
        return sb.toString();
    }
}
