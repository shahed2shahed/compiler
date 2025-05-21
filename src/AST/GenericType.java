package AST;

public class GenericType extends Type{
  
    private String genericName; 
    private Type genericParameter;

    public GenericType (String genericName, Type genericParameter) {
        this.genericName = genericName;
        this.genericParameter = genericParameter;
    }

    public String getGenericName() {
        return genericName;
    }

    public Type getGenericParameter() {
        return genericParameter;
    }

}
