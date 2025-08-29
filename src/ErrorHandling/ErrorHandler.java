
package ErrorHandling;
import java.io.FileWriter;
import java.io.IOException;

public class ErrorHandler {
    public static void logError(Exception e, int line, int column) {
        try (FileWriter fw = new FileWriter("Errors.txt", true)) {
            fw.write("Line " + line + ", Column " + column + ": " + e.getMessage() + "\n");
        } catch (IOException io) {
            System.out.println("Error writing to file: " + io.getMessage());
        }
    }
}

