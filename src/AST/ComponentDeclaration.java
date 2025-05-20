package AST;

import java.util.ArrayList;
import java.util.List;

public class ComponentDeclaration extends Program{

    List<ComponentBody> componentBodies ;

        public ComponentDeclaration() {
        this.componentBodies = new ArrayList<>();
    }

    public List<ComponentBody> getComponentBodies() {
        return componentBodies;
    }

    public void setComponentBodies(List<ComponentBody> componentBodies) {
        this.componentBodies = componentBodies;
    }

    public void addComponentBody(ComponentBody node) {
        this.componentBodies.add(node);
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Component Declaration : \n");
        sb.append("Component Bodies: { \n");
        if(this.componentBodies !=null)
        {
            for (ComponentBody componentBody : this.componentBodies) {
                sb.append(componentBody + "\n");
            }
            sb.append("}\n");

            return sb.toString();
        }

        else {
            sb.append(" ");
            sb.append("  }\n");
            sb.append("}");
           return sb.toString();
              }
        }

}
