package AST;

import java.util.ArrayList;
import java.util.List;

public class Parameters extends AstNode{

    List<ParametersContent> parameters;


    public Parameters(){
        this.parameters = new ArrayList<>();
    }
    public List<ParametersContent> getParameters(){
        return parameters;
    }
    public void setParameters(List<ParametersContent> parameters){
        this.parameters = parameters;
    }

    public void addChild(ParametersContent node) {
        this.parameters.add(node);
    }

    @Override
    public String generateJS(){
        StringBuilder str = new StringBuilder();
        for(ParametersContent node : parameters){
            str.append(node.generateJS());
        }
        return str.toString();
    }

    @Override
    public String generateRoutJS(){
        StringBuilder str = new StringBuilder();
        for(ParametersContent node : parameters){
            str.append(node.generateRoutJS());
        }
        return str.toString();
    }

    @Override
    public String generate(){
        StringBuilder str = new StringBuilder();
        str.append("()");
        return str.toString();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Parameters :");
        sb.append("\n");
        for(ParametersContent p : parameters){
            sb.append(p.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
