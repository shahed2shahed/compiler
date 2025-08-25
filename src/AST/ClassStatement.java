package AST;

import java.util.List;

public class ClassStatement extends StatementNode{
    String export;
    ClassRelation classRelation;
    List<Body> classBody ;


    public ClassStatement(){
    }

    public ClassStatement(String export , ClassRelation classRelation ,List<Body> classBody) {
        this.export = export;
        this.classBody = classBody;
        this.classRelation = classRelation;
    }

    public ClassStatement(String export , ClassRelation classRelation) {
        this.export = export;
        this.classRelation = classRelation;
    }

    @Override
    public String generateJS(){
        StringBuilder sb = new StringBuilder();
        for (Body body : classBody) {
            sb.append(body.generateJS());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Class Statement:\n");

        sb.append(export);
        sb.append(" class\n");

        sb.append("classRelation");
        sb.append(classRelation);
        sb.append("\n");

        sb.append("  Class Body: {\n");

        if (classBody != null && !classBody.isEmpty()) {
            for (Body bodyElement : classBody) {
                sb.append("    ").append(bodyElement).append("\n");
            }
        } else {
            sb.append("    [Empty]\n");
        }

        sb.append("  }");
        return sb.toString();
    }

}


/*public class ClassStatement extends StatementNode {
    private List<ClassPropertyNode> properties;

    public ClassStatement(List<ClassPropertyNode> properties) {
        this.properties = properties;
    }

    public List<ClassPropertyNode> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return "ClassPropertyNode{" +
                "properties=" + properties +
                '}';
    }
}

 */

