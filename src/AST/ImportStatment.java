package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportStatment extends StatementNode {

    String identifiers;
    public ImportStatment(String identifiers) {
        this.identifiers = identifiers;
    }


    public String getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(String identifiers) {
        this.identifiers = identifiers;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Import Statement {\n");
        sb.append(String.join(", ", this.identifiers));
        sb.append("\n");
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