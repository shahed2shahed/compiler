package AST;

public class DotAssignment extends  Assignment {
    PropertyAccess property;
    SubDotAssignment subDotAssignment;
    Type type;
    Operations operations;
    Values values;

    public DotAssignment(PropertyAccess property , SubDotAssignment subDotAssignment , Type type , Operations operations , Values values) {
        this.property = property;
        this.subDotAssignment = subDotAssignment;
        this.type = type;
        this.operations = operations;
        this.values = values;
    }

    @Override
    public String generateVarJS(){
        StringBuilder varJS = new StringBuilder();
        varJS.append(property.generate());
        varJS.append(subDotAssignment.generate());
        varJS.append(";");
        return varJS.toString();
    }

    @Override
    public String generateJS(){
        StringBuilder varJS = new StringBuilder();
        varJS.append(property.generateJS());
        //    varJS.append(subDotAssignment.generate());
        return varJS.toString();
    }

    @Override
    public String generate(){
        StringBuilder varJS = new StringBuilder();
        varJS.append(property.generate());
    //    varJS.append(subDotAssignment.generate());
        return varJS.toString();
    }

    public DotAssignment(PropertyAccess property , SubDotAssignment subDotAssignment , Type type) {
        this.property = property;
        this.subDotAssignment = subDotAssignment;
        this.type = type;
    }

    public DotAssignment(PropertyAccess property , SubDotAssignment subDotAssignment) {
        this.property = property;
        this.subDotAssignment = subDotAssignment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dot Assignment :\n");

        sb.append("Property Access :");
        sb.append(property.toString());
        sb.append("\n");

        sb.append(subDotAssignment.toString());
        sb.append("\n");

        if (type != null) {
            sb.append("Type :");
            sb.append(type.toString());
            sb.append("\n");

            if (operations != null && values!=null) {
                sb.append("Operations :");
                sb.append(operations.toString());
                sb.append("\n");
                sb.append("Values :");
                sb.append(values.toString());
                sb.append("\n");
            }

        }
        return sb.toString();
    }
}
