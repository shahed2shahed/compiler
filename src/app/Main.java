package app;


import AST.Program;
import SymbolTableStructure.SymbolTable2;
import Visitor.MyVisitor;
import antlr.MyLexer;
import antlr.MyParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        try {

            String path = "Tests/test2.txt";
            CharStream input = fromFileName(path);
            MyLexer lexer = new MyLexer(input);
            CommonTokenStream token = new CommonTokenStream(lexer);
            MyParser parser = new MyParser(token);
            MyParser.ProgramContext tree = parser.program();
            MyVisitor astVisitor = new MyVisitor();
            Program program = (astVisitor.visitProgram(tree));
            System.out.println(program);
          System.out.println(astVisitor.s.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

