package AST;

public class NgIfDirective extends DirectiveStatementNode {
   
    
     private NgIfDirective value;

    public NgIfDirective(NgIfDirective value) {
        this.value = value;
    }

    public NgIfDirective getValue() {
        return value;
    }
}
