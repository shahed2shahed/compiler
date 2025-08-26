package AST;

import java.util.List;

public class NormalfunctionDecl extends FunctionDeclaration{
    VariableType returnType;
    String functionName;
    FunctionDeclarationStat stat;
    List<Body> body;

    public NormalfunctionDecl(){

    }
    public NormalfunctionDecl(String functionName , VariableType returnType, FunctionDeclarationStat stat , List<Body> body) {
        this.returnType = returnType;
        this.functionName = functionName;
        this.stat = stat;
        this.body = body;
    }
    public void addChild(Body node) {
        this.body.add(node);
    }

    @Override
    public String generateJS(){

        StringBuilder s = new StringBuilder();

        s.append("\n");
        if (functionName.equals("ngOnInit")) {
            s.append(" function getProductIdFromUrl() {\n");
            s.append(" const params = new URLSearchParams(window.location.search);\n");
            s.append(" return Number(params.get(\"id\")); } \n");
            return s.toString();

        }

        if(functionName.equals("constructor")){
            s.append(stat.generateRoutJS());
            return s.toString();
        }

            s.append("function ").append(functionName).append("(");
            s.append(stat.generateJS());
            s.append(") {\n");
            if (functionName.equals("addProduct")) {
                s.append("window.location.href = 'add-product.html';\n");
            }
            if (functionName.equals("editProduct")) {
                s.append("window.location.href = 'edit-product.html?id=' + id;\n");
            }

            if (functionName.equals("viewDetails")) {
                s.append("window.location.href = 'details.html?id=' + id;\n");
            }

            if (functionName.equals("goBack")) {
                s.append("window.location.href = \"index.html\";\n");
            }
            s.append("}\n");



        return s.toString();

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Normal Function Declaration :");
        sb.append("\n");
        if(returnType != null){
            sb.append("Variable Type: ");
            sb.append(returnType);
            sb.append("\n");
        }
        sb.append(stat + "\n");

        if(body != null){
            sb.append("Body: ");
            for(Body b : this.body){
                sb.append(b);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
