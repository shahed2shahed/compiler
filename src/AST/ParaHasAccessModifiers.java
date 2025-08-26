package AST;

public class ParaHasAccessModifiers extends ParametersContent{
    String name;
    Type type;
    ParametersType access;

    public ParaHasAccessModifiers(String name , Type type, ParametersType access) {
        this.type = type;
        this.access = access;
        this.name = name;
    }

    @Override
    public String generateJS(){
        StringBuilder str = new StringBuilder();
            str.append(name);
        return str.toString();
    }

    @Override
    public String generateRoutJS(){
        StringBuilder str = new StringBuilder();
        if(type.generate().equals("ActivatedRoute")){
            str.append("const id = getProductIdFromUrl();\n");
            str.append("const product = products.find(p => p.id === id);\n");
        }
        return str.toString();
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
