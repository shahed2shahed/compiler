package AST;

public class SelectorElement extends ComponentBody {
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
