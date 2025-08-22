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

            String path = "Tests/test1.txt";
            CharStream input = fromFileName(path);
            MyLexer lexer = new MyLexer(input);
            CommonTokenStream token = new CommonTokenStream(lexer);
            MyParser parser = new MyParser(token);
            MyParser.ProgramContext tree = parser.program();

            MyVisitor astVisitor = new MyVisitor();
            Program program = (astVisitor.visitProgram(tree));
            String htmlCode = program.generateHTML();
            String jsCode = program.generateHTML();
            String cssCode = program.generateHTML();


            CodeGenerator.writeFile("index.html",  htmlCode);
            CodeGenerator.writeFile("script.js",  jsCode);
            CodeGenerator.writeFile("style.css",  cssCode);

            System.out.println(program);
            System.out.println(astVisitor.symbolTable2.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//import AST.*;
//import CodeGeneration.CodeGenerator;
//
//public class Main {
//    public static void main(String[] args) {
//        // نبني AST يدويًا للتجربة
//        Program program = new Program();
//
//        // HTML (مبسّط جدًا)
//        String html = """
//            <div class="container">
//              <div class="product-list">
//                <div>
//                  <button id="btn-0">tes</button>
//                  <img src="images/butterfly.jpg" alt="Product 1" />
//                  <p>Product 1</p>
//                </div>
//                <div>
//                  <button id="btn-1">tes</button>
//                  <img src="images/coffeemood.jpg" alt="Product 2" />
//                  <p>Product 2</p>
//                </div>
//                <div>
//                  <button id="btn-2">tes</button>
//                  <img src="images/lovelycats.jpg" alt="Product 3" />
//                  <p>Product 3</p>
//                </div>
//              </div>
//
//              <div class="product-details" id="details" style="display:none">
//                <h2 id="details-name"></h2>
//                <img id="details-img" alt="" />
//                <p id="details-desc"></p>
//              </div>
//            </div>
//        """;
//        program.addChild(new TemplateNode(html));
//
//        // JS بسيط يبدّل تفاصيل المنتج عند الضغط
//        String js = """
//            const products = [
//              { name: 'Product 1', image: 'images/butterfly.jpg', details: 'Butterfly' },
//              { name: 'Product 2', image: 'images/coffeemood.jpg', details: 'Coffeemood' },
//              { name: 'Product 3', image: 'images/lovelycats.jpg', details: 'Lovelycats' }
//            ];
//
//            const details = document.getElementById('details');
//            const nameEl = document.getElementById('details-name');
//            const imgEl  = document.getElementById('details-img');
//            const descEl = document.getElementById('details-desc');
//
//            function selectProduct(i) {
//              const p = products[i];
//              nameEl.textContent = p.name;
//              imgEl.src = p.image;
//              imgEl.alt = p.name;
//              descEl.textContent = p.details;
//              details.style.display = 'block';
//            }
//
//            for (let i = 0; i < products.length; i++) {
//              const btn = document.getElementById('btn-' + i);
//              if (btn) btn.addEventListener('click', () => selectProduct(i));
//            }
//        """;
//        program.addChild(new ScriptNode(js));
//
//        // توليد الملفات
//        CodeGenerator.writeFile("index.html", program.generateHTML());
//        CodeGenerator.writeFile("style.css",  program.generateCSS());
//        CodeGenerator.writeFile("script.js",  program.generateJS());
//
//        System.out.println("✅ جاهز! افتحي output/index.html");
//    }
//}
