
package CodeGeneration;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CodeGenerator {

    private static final String OUT_DIR = "output";

    private static void ensureOutDir() {
        File dir = new File(OUT_DIR);
        if (!dir.exists()) dir.mkdirs();
    }

    public static void writeFile(String filename, String content) {
        ensureOutDir();
        try (FileWriter w = new FileWriter(OUT_DIR + "/" + filename)) {
            w.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}