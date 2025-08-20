package AST;

public class StandaloneElement extends ComponentEle {
    private boolean value;

    public StandaloneElement(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Standalone: " + value;
    }
}

/*public class StandalonePropertyNode extends ComponentPropertyNode {
    private boolean standalone;

    public StandalonePropertyNode(boolean standalone) {
        this.standalone = standalone;
    }

    public boolean isStandalone() {
        return standalone;
    }

    @Override
    public String toString() {
        return "StandalonePropertyNode{" +
                "standalone=" + standalone +
                '}';
    }
}
 */