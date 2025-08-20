package SymbolTableStructure;

import java.util.Map;

public class CompositionComponentTable extends SymbolTable{

    private static class classEntry {
        String selector;
        String imports;

        classEntry(String selector, String imports) {
            this.selector = selector;
            this.imports = imports;
        }
    }

    private Map<String, classEntry> componentSymbolTable;

    public void addComponent(String className , String selector, String imports) {
        classEntry entry = new classEntry(selector, imports);
        componentSymbolTable.put(className , entry);
    }

}
