package AST;

public class ParaHasAccessModifiers extends ParametersContent{
    Type type;
    ParametersType access;

    public ParaHasAccessModifiers(Type type, ParametersType access) {
        this.type = type;
        this.access = access;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("Parameter Content :");
        builder.append("\n");

        if(type != null && access != null) {

            builder.append("Type :");
            builder.append(type.toString());
            builder.append("\n");

            builder.append("Property Access :");
            builder.append(access.toString());
            builder.append("\n");
        }
        else {
            builder.append("null");
        }

        return builder.toString();
    }
}
