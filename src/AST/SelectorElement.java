package AST;

public class SelectorElement extends ComponentPropertyNode {
    private String value;

    public SelectorElement(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Selector: " + value;
    }
}


/*
 public class SelectorPropertyNode extends ComponentPropertyNode {
    private String selector;

    public SelectorPropertyNode(String selector) {
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }

    @Override
    public String toString() {
        return "SelectorPropertyNode{" +
                "selector='" + selector + '\'' +
                '}';
    }
}

 */