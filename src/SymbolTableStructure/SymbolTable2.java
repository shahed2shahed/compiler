package SymbolTableStructure;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable2 {

    private static class SymbolEntry {
        String type;
        Object value;

        SymbolEntry(String type, Object value) {
            this.type = type;
            this.value = value;
        }
    }

    private Map<String, SymbolEntry> symbolTable;

    public SymbolTable2() {
        this.symbolTable = new HashMap<>();
    }

    // Function to add a variable with its type and value to the symbol table
    public void addVariable(String variableName, String type, Object value) {
        symbolTable.put(variableName, new SymbolEntry(type, value));
    }

    // Function to update the value of an existing variable in the symbol table
    public void updateVariable(String variableName, Object newValue) {
        if (symbolTable.containsKey(variableName)) {
            symbolTable.get(variableName).value = newValue;
        } else {
            System.out.println("Variable " + variableName + " does not exist in the symbol table.");
        }
    }

    // Function to update the type of an existing variable in the symbol table
    public void updateType(String variableName, String newType) {
        if (symbolTable.containsKey(variableName)) {
            symbolTable.get(variableName).type = newType;
        } else {
            System.out.println("Variable " + variableName + " does not exist in the symbol table.");
        }
    }

    // Function to get the value of a variable from the symbol table
    public Object getValue(String variableName) {
        if (symbolTable.containsKey(variableName)) {
            return symbolTable.get(variableName).value;
        } else {
            System.out.println("Variable " + variableName + " does not exist in the symbol table.");
            return null;
        }
    }

    // Function to get the type of a variable from the symbol table
    public String getType(String variableName) {
        if (symbolTable.containsKey(variableName)) {
            return symbolTable.get(variableName).type;
        } else {
            System.out.println("Variable " + variableName + " does not exist in the symbol table.");
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Symbol Table:\n");
        stringBuilder.append("*").append("*".repeat(220)).append("*\n");
        stringBuilder.append(String.format("| %-10s | %-65s | %-20s | %-65s \n", "ID", "Variable", "Type", "Value"));
        stringBuilder.append("*").append("*".repeat(220)).append("*\n");

        Map<String, Integer> keyIdMap = new HashMap<>(); // To store IDs for each unique key

        for (Map.Entry<String, SymbolEntry> entry : symbolTable.entrySet()) {
            String key = entry.getKey();
            if (!keyIdMap.containsKey(key)) {
                keyIdMap.put(key, keyIdMap.size() + 1); // Increment ID for each unique key
            }
        }

        for (Map.Entry<String, SymbolEntry> entry : symbolTable.entrySet()) {
            SymbolEntry symbolEntry = entry.getValue();
            String value = String.valueOf(symbolEntry.value);

            String[] valueLines = value.split("\\n");
            int maxValueLines = Math.max(valueLines.length, 1);

            String[] variableNameLines = entry.getKey().split("\\n");
            int maxVariableNameLines = Math.max(variableNameLines.length, 1);

            int maxLines = Math.max(maxValueLines, maxVariableNameLines);

            int keyId = keyIdMap.get(entry.getKey()); // Retrieve ID for the key

            // Print the ID only once for each key
            stringBuilder.append(String.format("| %-10s | %-65s | %-20s | %-65s \n",
                    keyId, variableNameLines[0], symbolEntry.type, valueLines[0]));

            for (int i = 1; i < maxLines; i++) {
                stringBuilder.append(String.format("| %-10s | %-65s | %-20s | %-65s\n", "", (i < variableNameLines.length) ? variableNameLines[i] : "", "", (i <
                        valueLines.length) ? valueLines[i] : ""));
            }

            stringBuilder.append("*").append("*".repeat(220)).append("*\n");
        }

        return stringBuilder.toString();
    }

}
