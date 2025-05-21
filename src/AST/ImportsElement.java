package AST;

import org.stringtemplate.v4.ST;

import java.util.List;

public class ImportsElement extends ComponentPropertyNode {
//     List<String> identifiers;
     String identifiers;

    public ImportsElement(String identifiers) {
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
        sb.append(String.join(", ", this.identifiers));
        return sb.toString();

    }
}

/*import java.util.List;

public class ImportsPropertyNode extends ComponentPropertyNode {
    private List<String> imports;

    public ImportsPropertyNode(List<String> imports) {
        this.imports = imports;
    }

    public List<String> getImports() {
        return imports;
    }

    @Override
    public String toString() {
        return "ImportsPropertyNode{" +
                "imports=" + imports +
                '}';
    }
}
 */
