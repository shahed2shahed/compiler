package AST;

public class OtherRelation extends ClassRelation{

    String name;
    ClassType classType;

    public OtherRelation(ClassType classType, String name){
        this.classType = classType;
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
        builder.append(classType.toString());
        builder.append("ClassName :");
        builder.append(name);

        return builder.toString();
        }

}
