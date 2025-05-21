package AST;

public class FunctionCall extends StatementNode {

//    private String functionName;
//    private String argument;
//    private String catchIdentifier;
    private Parameters parameters;
    private PrintError block;

//    private boolean hasParameters;

//    public FunctionCall(String functionName, String argument, Parameters parameters, PrintError block) {
            public FunctionCall(Parameters parameters, PrintError block) {

//            this.functionName = functionName;
//        this.argument = argument;
        this.parameters = parameters;
        this.block = block;
//        this.catchIdentifier = null;
//        this.hasParameters = true;
    }

//    public FunctionCall(String functionName, String argument, String catchIdentifier, PrintError block) {
//        this.functionName = functionName;
//        this.argument = argument;
//        this.catchIdentifier = catchIdentifier;
//        this.block = block;
//        this.parameters = null;
//        this.hasParameters = false;
//    }

//    public String getFunctionName() {
//        return functionName;
//    }
//
//    public String getArgument() {
//        return argument;
//    }
//
//    public String getCatchIdentifier() {
//        return catchIdentifier;
//    }

    public Parameters getParameters() {
        return parameters;
    }

    public PrintError getBlock() {
        return block;
    }

//    public boolean hasParameters() {
//        return hasParameters;
//    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Function Call : \n");
//        builder.append(" identefer : ");
//        builder.append(functionName + "\n")
//                .append("(").append(argument).append(")")
//                .append(".catch( \n");

//        if (hasParameters && parameters != null) {
            if (parameters != null) {

                builder.append("Parameters : ");
            builder.append("( ").append(parameters.toString()).append(" ) ");
        }
//        else if (catchIdentifier != null) {
//            builder.append(catchIdentifier);
//        }

        builder.append(" => ");
        builder.append("Block : " + block.toString());
//                builder.append("\n );");
        return builder.toString();
    }
}
