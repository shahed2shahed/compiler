package AST;

public class ClassType extends ClassRelation {

    String name;
    VariableType type;

    public ClassType(VariableType type) {
        this.type = type;
    }

    public ClassType(String name) {
        this.name = name;
    }

    public VariableType getType() {
        return type;
    }
    public void setType(VariableType type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("ClassType :");
     if (type != null) {
         sb.append(type.toString());
     }
     if (name != null) {
         sb.append(name);
     }
    return sb.toString();
    }
}
