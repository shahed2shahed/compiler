package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportStatment extends StatementNode {

//    List<String> identifiers;
    String identifiers;
//    public ImportStatment(List<String> identifiers , String string) {
    public ImportStatment(String identifiers) {
        this.identifiers = identifiers;
//        this.string = string;
    }


    public String getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(String identifiers) {
        this.identifiers = identifiers;
    }

//    public String getString() {
//        return string;
//    }
//
//    public void setString(String string) {
//        this.string = string;
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Import Statement {\n");
//        sb.append("  Identifiers: [");
        sb.append(String.join(", ", this.identifiers));
//        sb.append("]\n");
        sb.append("\n");
//        sb.append(" string Path: ").append(this.string).append("\n");
        sb.append("} \n");
        return sb.toString();
    }
}










/*import java.util.List;

public class ImportStatementNode extends StatementNode {
    private List<String> identifiers;
    private String fromModule;

    public ImportStatementNode(List<String> identifiers, String fromModule) {
        this.identifiers = identifiers;
        this.fromModule = fromModule;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public String getFromModule() {
        return fromModule;
    }

    @Override
    public String toString() {
        return "ImportStatementNode{" +
                "identifiers=" + identifiers +
                ", fromModule='" + fromModule + '\'' +
                '}';
    }
}
 */