package AST;

public class ToString extends NewObjectFromClass{
    String name;
    Parameters parameters;

    public ToString(String name , Parameters parameters) {
        this.name = name;
        this.parameters =parameters;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(this.name);
        str.append("\n");

        str.append("Parameters: ");
        str.append(this.parameters);
        str.append("\n");
        return str.toString();
    }
}
