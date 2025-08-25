package app;


import AST.Program;
import Visitor.MyVisitor;
import antlr.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import CodeGeneration.CodeGenerator;

import java.io.IOException;
import java.nio.file.Files;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {

        try {

            String path = "Tests/testAddProduct.txt";
            CharStream input = fromFileName(path);
            MyLexer lexer = new MyLexer(input);
            CommonTokenStream token = new CommonTokenStream(lexer);
            MyParser parser = new MyParser(token);
            MyParser.ProgramContext tree = parser.program();

            MyVisitor astVisitor = new MyVisitor();
            Program program = (astVisitor.visitProgram(tree));
            String htmlCode = program.generateHTML();
            String jsCode = program.generateJS();
        //    String cssCode = program.generateCSS();


            CodeGenerator.writeFile("index.html",  htmlCode);
            CodeGenerator.writeFile("script.js",  jsCode);
        //    CodeGenerator.writeFile("style.css",  cssCode);

            System.out.println(program);
            System.out.println(astVisitor.symbolTable2.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
