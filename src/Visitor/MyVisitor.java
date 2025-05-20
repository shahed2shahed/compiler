package Visitor;

import AST.*;
import AST.Class;
import AST.Number;
import AST.Void;
import SymbolTableStructure.SymbolTable2;
import antlr.*;

import java.util.*;

public class MyVisitor extends MyParserBaseVisitor {

    public SymbolTable2 s = new SymbolTable2();

    @Override
    public Program visitProgram(MyParser.ProgramContext ctx) {
        Program program = new Program();

        for (var child : ctx.children) {
            Object node = visit(child);
            if (node != null) {
                program.addChild(node);
            }
        }

        return program;
    }

    @Override
    public ImportStatment visitImportStatment(MyParser.ImportStatmentContext ctx) {
        String string = ctx.IMPORT().getText() + ctx.IDENTIFIER().toString() + ctx.FROM().getText() + ctx.STRING().getText();

        ImportStatment importStatment = new ImportStatment(string);
        return importStatment;
    }

    @Override
    public ComponentDeclaration visitComponentDeclaration(MyParser.ComponentDeclarationContext ctx) {
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();

        for (var child : ctx.componentBody()) {
            ComponentBody node = visitComponentBody(child);
            if (node != null) {
                componentDeclaration.addComponentBody(node);
            }

        }
        return componentDeclaration;

    }

    @Override
    public ComponentBody visitComponentBody(MyParser.ComponentBodyContext ctx) {

        if (ctx.SELECTOR() != null) {
            return visitSelector(ctx);
        } else if (ctx.STANDALONE() != null) {
            return visitStandalone(ctx);
        } else if (ctx.IMPORTS() != null) {
            return visitImports(ctx);
        } else if (ctx.TEMPLATE() != null) {
            return visitTemplate(ctx);
        }
        return null;
    }

    public SelectorElement visitSelector(MyParser.ComponentBodyContext ctx) {
        String selector = ctx.STRING().getText();
        s.addVariable("selector", ctx.SELECTOR().toString(), ctx.STRING().getText());

        return new SelectorElement(selector);
    }

    public StandaloneElement visitStandalone(MyParser.ComponentBodyContext ctx) {
        boolean isStandalone = Boolean.parseBoolean(ctx.BOOLEAN().getText());
        s.addVariable("Standalone", ctx.STANDALONE() .toString(), Boolean.parseBoolean(ctx.BOOLEAN().getText()));

        return new StandaloneElement(isStandalone);
    }

    public ImportsElement visitImports(MyParser.ComponentBodyContext ctx) {

        String string = ctx.IMPORTS().getText() + ':' + ctx.IDENTIFIER().toString();

        ImportsElement importsElement = new ImportsElement(string);
        s.addVariable("imports", ctx.IMPORTS() .toString(), string);

        return importsElement;
    }

    public TemplateElement visitTemplate(MyParser.ComponentBodyContext ctx) {

        TemplateElement templateElement = new TemplateElement();

        for (var child : ctx.htmlDeclare()) {
            HtmlDeclare node = visitHtmlDeclare(child);
            if (node != null) {
                templateElement.addHtmlDeclare(node);
            }
        }

        return templateElement;
    }

    @Override
    public HtmlDeclare visitHtmlDeclare(MyParser.HtmlDeclareContext ctx) {

        if (ctx.openTag() != null && ctx.htmlBody() != null && ctx.closeTag() != null) {
            OpenTag openTag = visitOpenTag(ctx.openTag());

            CloseTag closeTag = visitCloseTag(ctx.closeTag());

            if (visitHtmlBody(ctx.htmlBody()) != null) {
                List<Types> htmlBody = new ArrayList<>(visitHtmlBody(ctx.htmlBody()).getContent()) ;
                return new HtmlDeclare(openTag,htmlBody,closeTag);

            }
                else {
                return new HtmlDeclare(openTag,null,closeTag);

            }

        } else if (ctx.selfClosingTag() != null) {
            SelfClosingTag selfClosingTag = visitSelfClosingTag(ctx.selfClosingTag());
            return new HtmlDeclare(selfClosingTag);
        }

        return null;
    }


    @Override
    public SelfClosingTag visitSelfClosingTag(MyParser.SelfClosingTagContext ctx) {
        SelfClosingTag selfClosingTag = new SelfClosingTag();
        for (var child : ctx.types()) {
            Types node = visitTypes(child);
            if (node != null) {
                selfClosingTag.addTypes(node);
            }
            s.addVariable(ctx.types(0).getText(), "selfClosingTag" , " ");

        }

        return selfClosingTag;
    }

    @Override
    public OpenTag visitOpenTag(MyParser.OpenTagContext ctx) {

        OpenTag openTag = new OpenTag();

        for (var child : ctx.types()) {
            Types node = visitTypes(child);
            if (node != null) {
                openTag.addTypes(node);
            }
            s.addVariable(ctx.types(0).getText(), "openTag" , " ");
        }

        return openTag;

    }

    @Override
    public Types visitTypes(MyParser.TypesContext ctx) {

         if (ctx.expression() != null) {
            return visitExpression(ctx.expression());
        }
         if (ctx.type() != null) {
            return visitType(ctx.type());
        }
         if (ctx.htmlDeclare() != null) {
            return visitHtmlDeclare(ctx.htmlDeclare());
        }
        return null;
    }

    @Override
    public CloseTag visitCloseTag(MyParser.CloseTagContext ctx) {
        String tagName = ctx.IDENTIFIER().getText();
        s.addVariable(tagName.toString(), "closeTag" , " ");

        return new CloseTag(tagName) ;

    }

    @Override
    public HtmlBody visitHtmlBody(MyParser.HtmlBodyContext ctx) {

        HtmlBody htmlBody = new HtmlBody();
        if (ctx.types() != null) {

            for (var child : ctx.types()) {
                Types node = visitTypes(child);
                if (node != null) {
                    htmlBody.addNode(node);
                }
            }
            return htmlBody;
        }

        return null;
    }

    @Override
    public Expression visitExpression(MyParser.ExpressionContext ctx) {

         List<Expression> expressions = new ArrayList<>();

        if (ctx.STRING() != null) {
            return new StringExpression(ctx.STRING().getText());
        }

        if (ctx.NUMBER_VAL() != null) {
            return new NumberValExpression(Double.parseDouble(ctx.NUMBER_VAL().getText()));
        }

        if (ctx.arrayDeclaration() != null) {
            return visitArrayDeclaration(ctx.arrayDeclaration());
        }

        if (ctx.ifElseStat() != null) {
            return visitIfElseStat(ctx.ifElseStat());
        }

        if (ctx.directivesStatment() != null) {
            return visitDirectivesStatment(ctx.directivesStatment());
        }

        if (ctx.BOOLEAN() != null) {
            return new BooleanVal(ctx.BOOLEAN().getText());
        }

        if (ctx.expression() != null && ctx.expression().size() > 1) {
            StringBuilder sb = new StringBuilder();
            for (var child : ctx.expression()) {
                Expression e = visitExpression(child);
                expressions.add(e);
                sb.append(e.toString());
            }
            return new StringExpression(sb.toString());
        }




//        if (ctx.ngForStatment() != null) {
//            return visitNgForStatment(ctx.ngForStatment());
//        }
//
//        if (ctx.ngIfStatment() != null) {
//            return visitNgIfStatment(ctx.ngIfStatment());
//        }

        return null;
    }

    @Override
    public Type visitType(MyParser.TypeContext ctx) {
        String string = ctx.getText();


        if (ctx.IDENTIFIER() != null) {
            return new Identifier(ctx.IDENTIFIER().getText() );
        }
        else if (ctx.NUMBER() != null) {
            return new Number(ctx.NUMBER().getText());
        }

        else if (ctx.VOID() != null) {
            return new Void(ctx.VOID().getText());
        }
        else if (ctx.NULL() != null) {
            return new Null(ctx.NULL().getText());
        }
        else if (ctx.ANY() != null) {
            return new Any(ctx.ANY().getText());
        }
        else if (ctx.CLASS() != null) {
            return new Class(ctx.CLASS().getText());
        }
        else if (ctx.templateExpression() != null) {
            return visitTemplateExpression(ctx.templateExpression());
        }
        else if (ctx.marks() != null) {
            return visitMarks(ctx.marks());
        }

        return null;
    }


    @Override
    public Marks visitMarks(MyParser.MarksContext ctx) {
        String mark = ctx.getText();
        return new Marks(mark);
    }

    @Override
    public ArrayDeclaration visitArrayDeclaration(MyParser.ArrayDeclarationContext ctx) {
        ArrayDeclaration arrayDeclaration = new ArrayDeclaration();
        List<Expression> expressions = new ArrayList<>();

         if (ctx.expression() != null) {
             for (var child : ctx.expression()) {
                 expressions.add(visitExpression(child));
             }
             arrayDeclaration.setExpressions(expressions);
              return arrayDeclaration;
         }

        return null;

    }

    @Override
    public TemplateExpression visitTemplateExpression(MyParser.TemplateExpressionContext ctx) {
        TemplateExpression templateExpression = new TemplateExpression();

        for (var child : ctx.types()) {
            Types node = visitTypes(child);
            if (node != null) {
                templateExpression.addTypes(node);
            }
        }
        s.addVariable(templateExpression.toString(), "templateExpression" ,"") ;

        return templateExpression;
    }

    @Override
    public IfElseStat visitIfElseStat(MyParser.IfElseStatContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();

        Type type1 = (Type) visit(ctx.type(0));

        Type type2 = (Type) visit(ctx.type(1));

        s.addVariable("", "IfElseStat" ,ctx.IDENTIFIER().getText()) ;

        return new IfElseStat(identifier, type1, type2);
    }

    @Override
    public DirectivesStatment visitDirectivesStatment(MyParser.DirectivesStatmentContext ctx) {
        String condition = ctx.STRING().getText();
        String id = ctx.DIRECTIVES().getText();
        s.addVariable("Directives", "DirectivesStatment" ,ctx.STRING().getText()) ;

        return new DirectivesStatment(id + " " + condition);
    }

   @Override
    public FunctionCall visitFunctionCall(MyParser.FunctionCallContext ctx) {

        Parameters parameters = null;

        if (ctx.parameters() != null) {
            parameters = visitParameters(ctx.parameters());
        }

        PrintError block = visitPrint_error(ctx.print_error());

        if (parameters != null) {
            return new FunctionCall(parameters, block);

        }
        else {
            return new FunctionCall(null, block);

        }
    }

    @Override
    public ClassStatement visitClassStatment(MyParser.ClassStatmentContext ctx) {
        String export = ctx.EXPORT().getText();

        String className = ctx.IDENTIFIER().getText();

        List<ClassBody> bodyElements = new ArrayList<>();

        if (ctx.classBody() != null) {
            for (MyParser.ClassBodyContext bodyCtx : ctx.classBody()) {
                bodyElements.add(visitClassBody(bodyCtx));
            }
        }

        s.addVariable(className, "ClassStatement" , /*classBody*/"") ;

        return new ClassStatement(export, className, bodyElements);
    }

    @Override
    public ClassBody visitClassBody(MyParser.ClassBodyContext ctx) {
        if (ctx.variableDeclaration() != null) {
            VariableDeclaration variableDeclarationNode = visitVariableDeclaration(ctx.variableDeclaration());
            return new ClassBody(variableDeclarationNode);
        }

        if (ctx.functionDeclaration() != null) {
            FunctionDeclaration functionDeclarationNode = visitFunctionDeclaration(ctx.functionDeclaration());
            return new ClassBody(functionDeclarationNode);

        }

        if (ctx.print_error() != null) {
            PrintError printErrorNode = visitPrint_error(ctx.print_error());
            return new ClassBody(printErrorNode);

        }

        if (ctx.print_stat() != null) {
            PrintStat printStatNode = visitPrint_stat(ctx.print_stat());
            return new ClassBody(printStatNode);

        }
        return null;
    }

    @Override
    public VariableType visitVariable_type(MyParser.Variable_typeContext ctx) {
        if (ctx.VAR() != null) {
            return new VariableType(ctx.VAR().getText());
        }
        else if (ctx.CONST() != null) {
            return new VariableType(ctx.CONST().getText());
        }

        else if (ctx.LET() != null) {
            return new VariableType(ctx.LET().getText());
        }
        else {
            return null;
        }
    }

    @Override
    public VariableDeclaration visitVariableDeclaration(MyParser.VariableDeclarationContext ctx) {
        VariableType variable_type;
        Types types;
        Expression expression;
        String identifier = ctx.IDENTIFIER().getText();
        List<Type> type = new ArrayList<>();


        if (ctx.expression() == null && ctx.variable_type() != null) {
             variable_type = visitVariable_type(ctx.variable_type());
             types = visitTypes(ctx.types());
            if (ctx.type().size() > 1) {

                for (MyParser.TypeContext typeCtx : ctx.type()) {
                    type.add(visitType(typeCtx));
                }


            } else {
                type.add(visitType(ctx.type(0)));
            }
            return new VariableDeclaration(variable_type , identifier, type, types);
        }

        else if (ctx.expression() == null && ctx.variable_type() == null){
             types = visitTypes(ctx.types());
            if (ctx.type().size() > 1) {
                for (MyParser.TypeContext typeCtx : ctx.type()) {
                    type.add(visitType(typeCtx));
                }

            } else {
                type.add(visitType(ctx.type(0)));
            }

            return new VariableDeclaration(identifier, type, types);
        }

        else if (ctx.expression() != null && ctx.variable_type() != null){
             expression = visitExpression(ctx.expression());
             variable_type = visitVariable_type(ctx.variable_type());
            return new VariableDeclaration(variable_type,identifier,expression);
        }

        else {
             expression = visitExpression(ctx.expression());
            return new VariableDeclaration(identifier,expression);
        }

//        s.addVariable(identifier, "VariableDeclaration", type.isEmpty() ? expression : type );

    }

    @Override
    public FunctionDeclaration visitFunctionDeclaration(MyParser.FunctionDeclarationContext ctx) {
        ArrowFunction arrowFunction;
        FunctionBody functionBody;
        Parameters parameters;
        Type type;
        VariableType variable_type;

       if (ctx.arrowFunction() != null) {
           arrowFunction = visitArrowFunction(ctx.arrowFunction());
           return new FunctionDeclaration(arrowFunction);
       }

        if (ctx.parameters() !=null && ctx.type() != null && ctx.functionBody() != null) {
            functionBody = visitFunctionBody(ctx.functionBody());
            parameters = visitParameters(ctx.parameters());
            type = visitType(ctx.type());
            return new FunctionDeclaration(parameters,type,functionBody);
        }

        if (ctx.variable_type() !=null && ctx.parameters() !=null && ctx.type() != null && ctx.functionBody() != null) {
            functionBody = visitFunctionBody(ctx.functionBody());
            variable_type = visitVariable_type(ctx.variable_type());
            parameters = visitParameters(ctx.parameters());
            type = visitType(ctx.type());
            return new FunctionDeclaration(variable_type,parameters,type,functionBody);
        }

        if (ctx.type() != null && ctx.functionBody() != null) {
            functionBody = visitFunctionBody(ctx.functionBody());
            type = visitType(ctx.type());
            return new FunctionDeclaration(type,functionBody);
        }

        if (ctx.variable_type() !=null && ctx.type() != null && ctx.functionBody() != null) {
            functionBody = visitFunctionBody(ctx.functionBody());
            variable_type = visitVariable_type(ctx.variable_type());
            type = visitType(ctx.type());
            return new FunctionDeclaration(variable_type,type,functionBody);
        }

        if (ctx.parameters() !=null && ctx.functionBody() != null) {
            functionBody = visitFunctionBody(ctx.functionBody());
            parameters = visitParameters(ctx.parameters());
            return new FunctionDeclaration(parameters,functionBody);
        }

        if (ctx.variable_type() !=null && ctx.parameters() !=null && ctx.functionBody() != null) {
            functionBody = visitFunctionBody(ctx.functionBody());
            variable_type = visitVariable_type(ctx.variable_type());
            parameters = visitParameters(ctx.parameters());
            return new FunctionDeclaration(variable_type,parameters,functionBody);
        }

        if (ctx.functionBody() != null) {
            functionBody = visitFunctionBody(ctx.functionBody());
            return new FunctionDeclaration(functionBody);
        }

        if (ctx.variable_type() !=null && ctx.functionBody() != null) {
            functionBody = visitFunctionBody(ctx.functionBody());
            variable_type = visitVariable_type(ctx.variable_type());
            return new FunctionDeclaration(variable_type,functionBody);
        }
    return null;
    }

    @Override
    public Parameters visitParameters(MyParser.ParametersContext ctx) {
        List<Parameter> parametersList = new ArrayList<>();

        if (ctx.IDENTIFIER() != null) {
            String firstIdentifier = ctx.IDENTIFIER(0).getText();
            Type firstType = (Type) visit(ctx.type(0));
            parametersList.add(new Parameter(firstIdentifier, firstType));

            for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
                String identifier = ctx.IDENTIFIER(i).getText();
                Type type = (Type) visit(ctx.type(i));
                parametersList.add(new Parameter(identifier, type));
            }
        }

        s.addVariable(parametersList.toString(), "Parameters", "");
        return new Parameters(parametersList);
    }

    @Override
    public FunctionBody visitFunctionBody(MyParser.FunctionBodyContext ctx) {
        FunctionBody body = new FunctionBody();

        for (var child : ctx.children) {
            Object node = visit(child);
            if (node != null) {
                body.addChild(node);
            }
        }

        return body;
    }

    @Override
    public Assignment visitAssignment(MyParser.AssignmentContext ctx) {
        if (ctx.expression() != null) {
            String identifier = ctx.IDENTIFIER(0).getText();
            Expression expression = visitExpression(ctx.expression());
            s.updateVariable(identifier, expression);

            return new Assignment(identifier, expression);
        }
        if (ctx.type() != null) {
            String identifier = ctx.IDENTIFIER(0).getText();
            String memberIdentifier = ctx.IDENTIFIER(1).getText();
            Type type = visitType(ctx.type());
            s.updateType(identifier, type.toString());

            return new Assignment(identifier +"."+ memberIdentifier, type);
        }
        if(ctx.expression() == null && ctx.type() == null){
            String identifier = ctx.IDENTIFIER(0).getText();
            String memberIdentifier = ctx.IDENTIFIER(1).getText();


            return new Assignment(identifier +"."+ memberIdentifier);
        }

        return null;
    }


    @Override
    public PrintError visitPrint_error(MyParser.Print_errorContext ctx) {
        String console = ctx.CONSOLE().getText();
        String error = ctx.ERROR().getText();

        String identifier;
        if ( ctx.IDENTIFIER() != null) {
            identifier = ctx.IDENTIFIER().getText();
            s.addVariable(identifier, "Block", console+error+identifier);

            return new PrintError(console, error, identifier);
        }
        if ( ctx.STRING() != null) {
            identifier = ctx.STRING().getText();
            s.addVariable(identifier, "Block", console+error+identifier);

            return new PrintError(console, error, identifier);
        }

        if ( ctx.NUMBER_VAL() != null) {
            identifier = ctx.NUMBER_VAL().getText();
            s.addVariable(identifier, "Block", console+error+identifier);

            return new PrintError(console, error, identifier);
        }

        return null;
    }

    @Override
    public PrintStat visitPrint_stat(MyParser.Print_statContext ctx) {
        String console = ctx.CONSOLE().getText();
        String log = ctx.LOG().getText();
        String identifier;
        if ( ctx.IDENTIFIER() != null) {
             identifier = ctx.IDENTIFIER().getText();
            s.addVariable(identifier, "Print", console+log+identifier);

            return new PrintStat(console, log, identifier);
        }
        if ( ctx.STRING() != null) {
            identifier = ctx.STRING().getText();
            s.addVariable(identifier, "Print", console+log+identifier);

            return new PrintStat(console, log, identifier);
        }

        if ( ctx.NUMBER_VAL() != null) {
            identifier = ctx.NUMBER_VAL().getText();
            s.addVariable(identifier, "Print", console+log+identifier);

            return new PrintStat(console, log, identifier);
        }

   return null;
    }

    @Override
    public ArrowFunction visitArrowFunction(MyParser.ArrowFunctionContext ctx) {

        VariableType variableType = visitVariable_type(ctx.variable_type());
        Parameters parameters = visitParameters(ctx.parameters());
        Type type = visitType(ctx.type());

        return new ArrowFunction(variableType, parameters, type);
    }
}