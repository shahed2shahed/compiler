package AST;

import java.util.List;

public class VariableDeclaration extends Node {

     VariableType variable_type;
     String identifier;
     List<Type> type;
     Types types;
     Expression expression;

    public VariableDeclaration(VariableType variable_type ,String identifier, List<Type> type,Types types) {
        this.variable_type = variable_type;
        this.identifier = identifier;
        this.type = type;
        this.types = types;
    }

    public VariableDeclaration(String identifier, List<Type> type,Types types) {
        this.identifier = identifier;
        this.type = type;
        this.types = types;
    }


    public VariableDeclaration(VariableType variable_type ,String identifier, Expression expression) {
        this.variable_type = variable_type;
        this.identifier = identifier;
        this.expression = expression;
    }

    public VariableDeclaration(String identifier, Expression expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    @Override
    public String toString() {

        if(expression != null && variable_type!=null) {
            return "VariableDeclaration : ( \n"+ "variable type" + variable_type + "\n" + "identifier: " + identifier + "\n" + "expression: " + expression + ") \n";

        }
        if(expression != null  && variable_type == null) {
            return "VariableDeclaration : ( \n" + "identifier: " + identifier + "\n" + "expression: " + expression + ") \n";
        }

        if (expression == null && variable_type != null) {
            return "VariableDeclaration : ( \n"+ "variable type" + variable_type + "\n" + "identifier: " + identifier + "\n" + "type: " + type  + "\n" + "types: " + types + ") \n";
        }

        if (expression == null && variable_type == null) {
            return "VariableDeclaration : ( \n" + "identifier: " + identifier + "\n" + "type: " + type  + "\n" + "types: " + types + ") \n";
        }
              return null;
    }


}
