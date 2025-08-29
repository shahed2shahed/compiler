package AST;

import static AST.VariableDeclaration.getImage;

public class PropertyAccess extends Types{
    private String mark;

    public PropertyAccess(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String generate(){
        StringBuilder sb = new StringBuilder();
            sb.append(mark);
        return sb.toString();
    }
    @Override
    public String generateJS(){
        StringBuilder sb = new StringBuilder();
        sb.append(mark);
        sb.delete(0 , 5);
        return sb.toString();
    }

    @Override
    public String generateJSS(){
        StringBuilder sb = new StringBuilder();

            sb.append(mark);
            sb.delete(0, 13);
            sb.append("0");

        return sb.toString();
    }

    @Override
    public String  generateVarJS(){
        StringBuilder sb = new StringBuilder();
        sb.append(mark);
        sb.delete(0 , 5);
        return sb.toString();
    }


    @Override
    public String toString() {
        return   mark;
    }
}
