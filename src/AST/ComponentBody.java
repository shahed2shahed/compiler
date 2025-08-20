package AST;

import java.util.ArrayList;
import java.util.List;

public class ComponentBody extends ComponentDeclaration{
    List<ComponentEle> componentEle ;

    public ComponentBody() {
        this.componentEle = new ArrayList<>();
    }

    public List<ComponentEle> getComponentEle() {
        return componentEle;
    }

    public void setComponentEle(List<ComponentEle> componentEle) {
        this.componentEle = componentEle;
    }

    public void addComponentEle(ComponentEle node) {
        this.componentEle.add(node);
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Component Element : \n");
        sb.append("{\n");

        for (ComponentEle componentEle : this.componentEle) {
                sb.append(componentEle + "\n");
            }
            sb.append("}\n");

            return sb.toString();

    }

}
