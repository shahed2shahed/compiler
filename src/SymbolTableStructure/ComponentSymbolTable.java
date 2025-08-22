package SymbolTableStructure;

import java.util.ArrayList;
import java.util.List;

public class ComponentSymbolTable{

    public class ImportEntry {
        public String key;
        public String moduleName;

        public ImportEntry(String key, String moduleName) {
            this.key = key;
            this.moduleName = moduleName;
        }
    }

    List<ImportEntry> importedModules = new ArrayList<>();
    public void addImport(String key, String moduleName) {
        importedModules.add(new ImportEntry(key, moduleName));
    }


    public boolean checkCommon() {
        for (ImportEntry entry : importedModules) {
            if ("CommonModule".equals(entry.moduleName)) {
                return true;
            }
        }
        return false;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Component Symbol Table:\n");
        sb.append("*").append("*".repeat(100)).append("*\n");
        sb.append(String.format("| %-10s | %-30s | %-55s |\n", "ID", "Key", "Imported Module"));
        sb.append("*").append("*".repeat(100)).append("*\n");

        int id = 1;
        for (ImportEntry entry : importedModules) {
            sb.append(String.format("| %-10d | %-30s | %-55s |\n", id++, entry.key, entry.moduleName));
            sb.append("*").append("*".repeat(100)).append("*\n");
        }

        return sb.toString();
    }



}

