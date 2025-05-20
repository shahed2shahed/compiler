package AST;

import java.util.List;

public class ClassStatement extends Node{
    private String export;
    private String className;
    List<ClassBody> classBody ;


    public ClassStatement(String export, String className,  List<ClassBody> classBody) {
        this.export = export;
        this.className = className;
        this.classBody = classBody;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Class Statement:\n");

        sb.append(export);
        sb.append(" class\n");
        sb.append("  Class Name: ").append(className).append("\n");
        sb.append("  Class Body: {\n");

        if (classBody != null && !classBody.isEmpty()) {
            for (ClassBody bodyElement : classBody) {
                sb.append("    ").append(bodyElement).append("\n");
            }
        } else {
            sb.append("    [Empty]\n");
        }

        sb.append("  }");
        return sb.toString();
    }

}

