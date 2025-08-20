package AST;

public class WithObjectPropertyArgumentList extends ArgumentList{
    ObjectProperty objectProperty;

    public WithObjectPropertyArgumentList(ObjectProperty objectProperty){
        this.objectProperty = objectProperty;
    }
    public ObjectProperty getObjectProperty() {
        return objectProperty;
    }
    public void setObjectProperty(ObjectProperty objectProperty) {
        this.objectProperty = objectProperty;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("Argument List :");
        builder.append("\n");
        builder.append("Object Property: ");
        builder.append(objectProperty);
        builder.append("\n");
        return builder.toString();
    }
}
