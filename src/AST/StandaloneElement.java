package AST;

public class StandaloneElement extends ComponentBody {
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
