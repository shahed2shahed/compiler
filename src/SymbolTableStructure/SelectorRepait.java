package SymbolTableStructure;

import java.util.*;

public class SelectorRepait {

    public class SelectorEntry {
        public String key;
        public String moduleName;

        public SelectorEntry(String key, String moduleName) {
            this.key = key;
            this.moduleName = moduleName;
        }
    }
    List<SelectorEntry> selectorEntries = new ArrayList<>();

    public void addSelector(String selectorName, String selectorValue) {
        selectorEntries.add(new SelectorEntry(selectorName, selectorValue));
    }



    public boolean isSelectorValueDuplicated(String selectorValue) {
        for (SelectorEntry entry : selectorEntries) {
            if (selectorValue.equals(entry.moduleName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Selector Symbol Table:\n");
        sb.append("*").append("*".repeat(100)).append("*\n");
        sb.append(String.format("| %-10s | %-30s | %-55s |\n", "ID", "Key", "Value"));
        sb.append("*").append("*".repeat(100)).append("*\n");

        int id = 1;
        for (SelectorEntry entry : selectorEntries) {
            sb.append(String.format("| %-10d | %-30s | %-55s |\n", id++, entry.key, entry.moduleName));
            sb.append("*").append("*".repeat(100)).append("*\n");
        }

        return sb.toString();
    }


}
