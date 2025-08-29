package app;

import AST.Program;
import Visitor.MyVisitor;
import antlr.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import CodeGeneration.CodeGenerator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        try {
            String testsDir = "GenerateTest";
            File folder = new File(testsDir);

            String[] html = {"index.html", "details.html" , "add-product.html" , "edit-product.html"};
            String[] js = {"script.js", "details-script.js" , "add-product.js" , "edit-product.js"};
            String[] css = {"style.css", "details-style.css" , "add-product.css" , "edit-product.css"};


            int testIndex = 0;

            for (File file : folder.listFiles()) {
                if (file.isFile() && file.getName().endsWith(".txt")) {

                    CharStream input = fromFileName(file.getPath());
                    MyLexer lexer = new MyLexer(input);
                    CommonTokenStream token = new CommonTokenStream(lexer);
                    MyParser parser = new MyParser(token);
                    MyParser.ProgramContext tree = parser.program();

                    MyVisitor astVisitor = new MyVisitor();
                    Program program = astVisitor.visitProgram(tree);

                    String htmlCode = program.generateHTML(css[testIndex], js[testIndex]);
                    String jsCode = program.generateJS();
                    String cssCode = program.generateCSS();


                    CodeGenerator.writeFile(html[testIndex], htmlCode);
                    CodeGenerator.writeFile(js[testIndex], jsCode);
                    CodeGenerator.writeFile(css[testIndex], cssCode);
                    System.out.println(program);
                    System.out.println(astVisitor.symbolTable2.toString());
                    testIndex++;
        }
    }
} catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}