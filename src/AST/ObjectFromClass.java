package AST;

public class ObjectFromClass extends VariableDeclarationStat{
    NewObjectFromClass obj ;

    public ObjectFromClass(NewObjectFromClass obj){
        this.obj = obj;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Variable Declaration Statement : \n ");
        builder.append(obj.toString());
        return builder.toString();
    }
}
