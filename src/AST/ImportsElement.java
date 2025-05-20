package AST;

import org.stringtemplate.v4.ST;

import java.util.List;

public class ImportsElement extends ComponentBody {
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
