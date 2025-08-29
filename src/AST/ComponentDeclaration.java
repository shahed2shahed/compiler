package AST;

import java.util.ArrayList;
import java.util.List;

public class ComponentDeclaration extends StatementNode{
     Module module;
     ComponentBody componentBodies ;

    public ComponentDeclaration() {
        this.module = module;
        this.componentBodies = componentBodies;
    }
        public ComponentDeclaration(Module module , ComponentBody componentBodies) {
        this.module = module;
        this.componentBodies = componentBodies;
    }

    public ComponentBody getComponentBodies() {
        return componentBodies;
    }
    public Module getModule() {
        return module;
    }

    public void setComponentBodies(ComponentBody componentBodies) {
        this.componentBodies = componentBodies;
    }
    public void setModule(Module module) {
            this.module = module;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(componentBodies.generate());
        return sb.toString();
    }

    @Override
    public String generateCSS() {
        StringBuilder sb = new StringBuilder();
        sb.append(componentBodies.generateCSS());
        return sb.toString();
    }

    @Override
    public String generateJS() {
        StringBuilder sb = new StringBuilder();
            sb.append(componentBodies.generateJS());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Component Declaration : \n");
        sb.append("Module : ").append(module).append("\n");
        sb.append("Component Bodies: { \n");
                sb.append(componentBodies + "\n");
            sb.append("}\n");

            return sb.toString();
        }

}
