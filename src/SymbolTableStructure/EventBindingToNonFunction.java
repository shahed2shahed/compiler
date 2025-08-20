package SymbolTableStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EventBindingToNonFunction{
    Set<String> functionNameDe = new HashSet<>();

    public void addFunctionName(String functionName) {
        functionNameDe.add(functionName);
    }

    public boolean checkEvent(String functionName ) {
        return functionNameDe.contains(functionName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Function Symbol Table:\n");
        sb.append("*").append("*".repeat(80)).append("*\n");
        sb.append(String.format("| %-10s | %-65s |\n", "ID", "Function Name"));
        sb.append("*").append("*".repeat(80)).append("*\n");

        int id = 1;
        for (String function : functionNameDe) {
            sb.append(String.format("| %-10d | %-65s |\n", id++, function));
            sb.append("*").append("*".repeat(80)).append("*\n");
        }

        return sb.toString();
    }

}
