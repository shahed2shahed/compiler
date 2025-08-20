package AST;

public class CommonRelation extends ClassRelation{

    String name;
    ClassType classType;

    public CommonRelation(String name , ClassType classType){
        this.classType = classType;
        this.name = name;
    }

    public CommonRelation(String name){
        this.name = name;
    }

    public ClassType getClassType() {
        return classType;
    }
    public void setClassType(ClassType classType) {
        this.classType = classType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ClassRelation :");
        builder.append("ClassName :");
        builder.append(name);

        if (classType != null) {
            builder.append(classType.toString());
        }
        return builder.toString();
    }
}
