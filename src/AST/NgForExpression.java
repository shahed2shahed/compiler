package AST;

public class NgForExpression extends AstNode {
    private String itemVar;     // product
    private String iterable;    // products
    private String indexVar;    // i
    private String indexExpr;   // index

//    public NgForExpression(String identifier) {
//        this.identifier = identifier;
//    }

    public String getItemVar() {
        return itemVar;
    }

    public void setItemVar(String itemVar) {
        this.itemVar = itemVar;
    }

    public String getIterable() {
        return iterable;
    }

    public void setIterable(String iterable) {
        this.iterable = iterable;
    }

    public String getIndexVar() {
        return indexVar;
    }

    public void setIndexVar(String indexVar) {
        this.indexVar = indexVar;
    }

    public String getIndexExpr() {
        return indexExpr;
    }

    public void setIndexExpr(String indexExpr) {
        this.indexExpr = indexExpr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
      //  sb.append("Ng For Expression { \n");
        sb.append(itemVar + "\n");
        sb.append(iterable + "\n");
        sb.append(indexVar + "\n");
        sb.append(indexExpr + "\n");

     //   sb.append("}\n");

        return sb.toString();

    }
}
