

//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ErrorHandler {
//    private final List<SemanticException> errorList = new ArrayList<>();
//    private final String logFile = "error_log.txt";
//
//    public void report(String type, String message, int line) {
//        SemanticException error = new SemanticException(type, message, line);
//        errorList.add(error);
//
//        // عرض الخطأ على الشاشة
//        System.err.println(error.toString());
//
//        // تسجيل الخطأ في ملف
//        try (FileWriter writer = new FileWriter(logFile, true)) {
//            writer.write(error.toString() + "\n");
//        } catch (IOException e) {
//            System.err.println("Failed to write to log file: " + e.getMessage());
//        }
//    }
//
//    public boolean hasErrors() {
//        return !errorList.isEmpty();
//    }
//
//    public List<SemanticException> getErrors() {
//        return errorList;
//    }
//}

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

