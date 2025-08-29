package Visitor;
import AST.*;
import AST.Map;
import AST.Module;
import AST.Void;
import AST.Number;
import java.util.*;

import ErrorHandling.*;
import SymbolTableStructure.*;

import antlr.*;

public class MyVisitor extends MyParserBaseVisitor<AstNode> {

    public SymbolTable symbolTable2 = new SymbolTable();

    String[] ngModel = {"input" , "textarea" , "select"};

    private void visitFunctionFirst(MyParser.ProgramContext ctx){
        for (var c : ctx.statement()) {
            if (c.classStatment() != null) {
                visit(c.classStatment());
            }
        }
    }

    @Override
    public Program visitProgram(MyParser.ProgramContext ctx) {
        visitFunctionFirst(ctx);
        Program program = new Program();
        for (var child : ctx.statement()){
            program.addChild( (StatementNode) visit(child));
        }
        return program;
    }

    @Override
    public StatementNode visitImportStatment(MyParser.ImportStatmentContext ctx) {
        String string;
        if (ctx.IMPORT().getText()!=null){
            string = ctx.IMPORT().getText() + ctx.IDENTIFIER().toString() + ctx.FROM().getText() + ctx.STRING().getText();
            return new ImportStatment(string);
        }
        string = ctx.BEHAVIORSUBJECT().getText() + ctx.IDENTIFIER().toString() + ctx.FROM().getText() + ctx.STRING().getText();
        return new ImportStatment(string);
    }
    @Override
    public StatementNode visitComponentDeclaration(MyParser.ComponentDeclarationContext ctx) {
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();
        return new ComponentDeclaration( (Module) visitModule(ctx.module())  , (ComponentBody) visitComponentBody(ctx.componentBody()) );
    }


    @Override
    public ComponentDeclaration visitModule(MyParser.ModuleContext ctx) {
        String mark = ctx.getText();
        return new Module(mark);    }

    @Override
    public ComponentDeclaration visitComponentBody(MyParser.ComponentBodyContext ctx) {
        ComponentBody componentBody = new ComponentBody();
        for (var child : ctx.componentEle()){
            componentBody.addComponentEle( (ComponentEle) visit(child));
        }
        return componentBody;
    }

    @Override
    public ComponentEle visitSelectorProperty(MyParser.SelectorPropertyContext ctx) {
        String selector = ctx.STRING().getText();

        if(symbolTable2.getSelectorTable().isSelectorValueDuplicated(selector)){
            ErrorHandler.logError(new SelectorRepaitException("Selector Value " + ctx.STRING().getText() + " is already exist"),  ctx.STRING().getSymbol().getLine(), ctx.STRING().getSymbol().getCharPositionInLine());
            throw new RuntimeException("Selector Value " + ctx.STRING().getText() + " is already exist");
        }

        symbolTable2.getSelectorTable().addSelector(ctx.SELECTOR().getText(),selector);
        return new SelectorElement(selector);
    }

    @Override
    public ComponentEle visitStandaloneProperty(MyParser.StandalonePropertyContext ctx) {
        boolean isStandalone = Boolean.parseBoolean(ctx.BOOLEAN().getText());
        return new StandaloneElement(isStandalone);
    }

    @Override
    public ComponentEle visitImportsProperty(MyParser.ImportsPropertyContext ctx) {
        ImportsElement importsElement = new ImportsElement();

        PropertyStat property = (PropertyStat) visit(ctx.propertyStat());
        importsElement.setProperty(property);

        for (String id : property.getIdentifiers()) {
            importsElement.addChild(id);

            symbolTable2.getFormsModuleTracker().addImport(ctx.IMPORTS().getText(), id);
            symbolTable2.getComponentTable().addImport(ctx.IMPORTS().getText(), id);
        }

        if (property.getFunc() != null) {
            String funcName = property.getFunc().toString();
            importsElement.addChild(funcName);

            symbolTable2.getFormsModuleTracker().addImport(ctx.IMPORTS().getText(), funcName);
            symbolTable2.getComponentTable().addImport(ctx.IMPORTS().getText(), funcName);
        }

        return importsElement;
    }

    @Override
    public ComponentEle visitExportsProperty(MyParser.ExportsPropertyContext ctx) {
        ExportsElement exportsElement = new ExportsElement();

        PropertyStat property = (PropertyStat) visit(ctx.propertyStat());
        exportsElement.setProperty(property);

        for (String id : property.getIdentifiers()) {
            exportsElement.addChild(id);
        }

        if (property.getFunc() != null) {
            String funcName = property.getFunc().toString();
            exportsElement.addChild(funcName);
        }

        return exportsElement;
    }

    @Override
    public ComponentEle visitBootstrapProperty(MyParser.BootstrapPropertyContext ctx) {
        BootstrapElement bootstrapElement = new BootstrapElement();

        PropertyStat property = (PropertyStat) visit(ctx.propertyStat());
        bootstrapElement.setProperty(property);

        for (String id : property.getIdentifiers()) {
            bootstrapElement.addChild(id);
        }

        if (property.getFunc() != null) {
            String funcName = property.getFunc().toString();
            bootstrapElement.addChild(funcName);
        }

        return bootstrapElement;
    }

    @Override
    public AstNode visitPropertyStat(MyParser.PropertyStatContext ctx) {
        PropertyStat property = new PropertyStat();
//        if (ctx.propertyFun() != null) {
//            property.setFunc((FunctionCall) visit(ctx.propertyFun()));
//        }
        for (var id : ctx.IDENTIFIER()) {
            property.addIdentifier(id.getText());
        }

        return property;
    }

    @Override
    public Expression visitNavigate(MyParser.NavigateContext ctx) {
        Navigate nav = new Navigate();
        for (var child  : ctx.content()) {
            nav.addChild((Content) visitContent(child));
        }
        return nav;
    }

    @Override
    public Expression visitFunctionExp(MyParser.FunctionExpContext ctx) {
        FunctionExp nav = new FunctionExp();

        if (ctx.content() != null) {
            for (var child  : ctx.content()) {
                nav.addChild((Content) visitContent(child));
            }
        }


        if(ctx.propertyAccess() != null) {
            for (var child  : ctx.propertyAccess()) {
                nav.addChild((PropertyAccess) visitPropertyAccess(child));
            }
        }

        return nav;
    }

    @Override
    public Content visitContent(MyParser.ContentContext ctx) {
        Values value = null;
        if(ctx.values()!=null){
            value = (Values) visitValues(ctx.values());
        }
        VariableDeclaration var = null;
        if(ctx.variableDeclaration()!=null){
            var = (VariableDeclaration) visitVariableDeclaration(ctx.variableDeclaration());
        }
        return new Content(value , var);
    }

    @Override
    public TemplateHtmlDeclaration visitStyle(MyParser.StyleContext ctx) {

        return new Style( ctx.STYLE().getText() , ctx.COLON().getText() , ctx.STRING().getText());
    }

    @Override
    public TemplateElement visitTemplateHtmlDeclaration(MyParser.TemplateHtmlDeclarationContext ctx) {
//        TemplateHtmlDeclaration templateElement = new TemplateHtmlDeclaration();
        List<HtmlDeclare> declare = new ArrayList<>();
        for (var child : ctx.htmlDeclare()){
            declare.add((HtmlDeclare) visit(child));
        }

        Style style = null;
        if(ctx.style()!=null){
            style = (Style)visitStyle(ctx.style());
        }
        return new TemplateHtmlDeclaration(declare , style);
    }

    @Override
    public TemplateElement visitTemplateHtmlUrl(MyParser.TemplateHtmlUrlContext ctx) {
        String string = ctx.IDENTIFIER().getText() + ctx.COLON() + ctx.STRING().getText();

        return new TemplateHtmlUrl(string);
    }

    @Override
    public HtmlDeclare visitNormalHtmlTag(MyParser.NormalHtmlTagContext ctx) {
        OpenTag openTag = visitOpenTag(ctx.openTag());
        CloseTag closeTag = visitCloseTag(ctx.closeTag());

        List <Types> typesHtml = new ArrayList<>();
        for (var child : ctx.types()){
            typesHtml.add((Types) visit(child));
        }

        return new NormalHtmlTagNode(openTag , typesHtml , closeTag);
    }

    @Override
    public OpenTag visitOpenTag(MyParser.OpenTagContext ctx) {
        String tag = ctx.types(0).getText();
        OpenTag openTag = new OpenTag(tag);
        Boolean isExisted = false;
        for (var child : ctx.types()){
            openTag.addTypes( (Types) visit(child));
            if (child.getText().equals("ngModel")){
//                if(!formsModule.check()){
//                    ErrorHandler.logError(new FormsModuleException("Can't bind to '" + child.getText() + "' since it isn't a known property of " + ctx.types(0).getText()), child.getStart().getLine() , child.getStart().getCharPositionInLine());
//                }

                for(var i : ngModel) {
                    if (i.equals(ctx.types(0).getText())){
                        isExisted = true;
                    }
                }

                if (!isExisted){
                    ErrorHandler.logError(new NgModelSupportedElementException("[(ngModel)] cannot be used on "+ ctx.types(0).getText()+". Only supported on form elements like <input>, <select>, or <textarea>."), ctx.types(0).getStart().getLine(), ctx.types(0).getStart().getCharPositionInLine());
                    throw new RuntimeException("[(ngModel)] cannot be used on "+ ctx.types(0).getText()+". Only supported on form elements like <input>, <select>, or <textarea>.");

                }
            }
        }
        return openTag;
    }

    @Override
    public CloseTag visitCloseTag(MyParser.CloseTagContext ctx) {
        return new CloseTag(ctx.IDENTIFIER().getText());
    }

    /// visit types
    ///1 visit type
    ///1.1 visit primitive type
    @Override
    public PrimitiveTypeNode visitIdPrimitiveType(MyParser.IdPrimitiveTypeContext ctx) {
        return new Identifier(ctx.IDENTIFIER().getText());
    }

    @Override
    public PrimitiveTypeNode visitNumberPrimitiveType(MyParser.NumberPrimitiveTypeContext ctx) {
        return new Number(ctx.NUMBER().getText());    }

    @Override
    public PrimitiveTypeNode visitVoidPrimitiveType(MyParser.VoidPrimitiveTypeContext ctx) {
        return new Void(ctx.VOID().getText());
    }

    @Override
    public PrimitiveTypeNode visitNullPrimitiveType(MyParser.NullPrimitiveTypeContext ctx) {
        return new Null(ctx.NULL().getText());    }

    @Override
    public PrimitiveTypeNode visitAnyPrimitiveType(MyParser.AnyPrimitiveTypeContext ctx) {
        return new Any(ctx.ANY().getText());
    }

    @Override
    public PrimitiveTypeNode visitStringEXPrimitiveType(MyParser.StringEXPrimitiveTypeContext ctx) {
        return new StringExpression(ctx.STRING_EX().getText());
    }

    @Override
    public PrimitiveTypeNode visitClassPrimitiveType(MyParser.ClassPrimitiveTypeContext ctx) {
        return new ClassEx(ctx.CLASS().getText());
    }

    @Override
    public PrimitiveTypeNode visitTemplateExPrimitiveType(MyParser.TemplateExPrimitiveTypeContext ctx) {
        TemplateExpression templateExpression = new TemplateExpression();
        for (var child : ctx.templateExpression().types()){
            templateExpression.addTypes((Types)visit(child));
        }
        return templateExpression;
    }
    ///1.2 visit array string type
    @Override
    public Type visitArrayStringType(MyParser.ArrayStringTypeContext ctx) {
        String string1 = ctx.ARRAY().getText();
        String string2 =  ctx.STRING_EX().getText();
        return new ArrayStringType(string1 , string2);
    }
    ///1.3 visit array number type
    @Override
    public Type visitArrayNumberType(MyParser.ArrayNumberTypeContext ctx) {
        String string = ctx.NUMBER().getText();
        return new ArrayNumberType(string);
    }
//    ///1.4 visit tuple type
//    @Override
//    public Type visitTupleType(MyParser.TupleTypeContext ctx) {
//        TupleType tupleType = new TupleType();
//        for (var child : ctx.type()){
//            Type node = (Type) visit(child);
//            tupleType.addChild(node);
//        }
//        return tupleType;
//    }

    /// 1.5 visit simple array
    @Override
    public AstNode visitSimpleArray(MyParser.SimpleArrayContext ctx) {
        String mark = ctx.getText();
        return new SimpleArray(mark);
    }

    ///  1.6 visit map
    @Override
    public Type visitMap(MyParser.MapContext ctx) {
        Map map = new Map();
        for (var child : ctx.values()){
            map.addChild( (Values) visit(child));
        }
        return map;
    }

    @Override
    public AstNode visitValues(MyParser.ValuesContext ctx) {
        String mark = ctx.getText();
        return new Values(mark);
    }

    ///2 visit marks
    @Override
    public Types visitMarks(MyParser.MarksContext ctx) {
        if (ctx.operations() != null){
            return new Marks((Operations) visit(ctx.operations()));
        }
        String mark = ctx.getText();
        return new Marks(mark);
    }

    @Override
    public AstNode visitOperations(MyParser.OperationsContext ctx) {
        String mark = ctx.getText();
        return new Operations(mark);
    }

    ///3 visit expression
    /// 3.1  array declaration Expr
    @Override
    public Expression visitArrayDeclaration(MyParser.ArrayDeclarationContext ctx) {
        ArrayDeclaration arrayDeclaration = new ArrayDeclaration();
        for (var child : ctx.expression()){
            arrayDeclaration.addExpressions((Expression) visit(child));
        }
        return arrayDeclaration;
    }

    /// 3.2 directiveExpr
    @Override
    public DirectiveStatementNode visitNgForDirective(MyParser.NgForDirectiveContext ctx) {
        if (!symbolTable2.getComponentTable().checkCommon()){
            ErrorHandler.logError(new CommonModuleException("Missing Module Import , Directive " + ctx.NgFor().getText() + " requires CommonModule to be imported"),  ctx.NgFor().getSymbol().getLine(), ctx.NgFor().getSymbol().getCharPositionInLine());
            throw new RuntimeException("Missing Module Import , Directive " + ctx.NgFor().getText() + " requires CommonModule to be imported");

        }

        return new NgForDirective(visitNgForValue(ctx.ngForValue()));
    }

    @Override
    public DirectiveStatementNode visitNgIfDirective(MyParser.NgIfDirectiveContext ctx) {

        if (!symbolTable2.getComponentTable().checkCommon()){
            ErrorHandler.logError(new CommonModuleException("Missing Module Import , Directive " + ctx.NgIf().getText() + " requires CommonModule to be imported"),  ctx.NgIf().getSymbol().getLine(), ctx.NgIf().getSymbol().getCharPositionInLine());
            throw new RuntimeException("Missing Module Import , Directive " + ctx.NgIf().getText() + " requires CommonModule to be imported");
        }
        return new NgIfDirective(visitNgIfValue(ctx.ngIfValue()));
    }

    @Override
    public NgForValue visitNgForValue(MyParser.NgForValueContext ctx) {
        NgForValue ngForValue = new NgForValue();
        for (var child : ctx.ngForExpression()){
            ngForValue.addChild(visitNgForExpression(child));
        }
        return ngForValue;
    }

    @Override
    public NgForExpression visitNgForExpression(MyParser.NgForExpressionContext ctx) {

        NgForExpression node = new NgForExpression();

        if (ctx.OF1() != null) {
                // "let product of products"
                node.setItemVar(ctx.ID1(0).getText());   // product
                node.setIterable(ctx.ID1(1).getText());  // products
            }
        if (ctx.EQUAL1() != null) {
                // "let i = index"
                node.setIndexVar(ctx.ID1(2).getText());  // i
                node.setIndexExpr(ctx.ID1(3).getText()); // index
            }
        return node;
    }

    @Override
    public NgIfValue visitNgIfValue(MyParser.NgIfValueContext ctx) {
        return new NgIfValue( (ConditionExpression) visit(ctx.conditionExpression()));
    }

    @Override
    public ConditionExpression visitEqualNull(MyParser.EqualNullContext ctx) {
        if(ctx.equalOperation()!=null){
            return new EqualNull(visitEqualOperation(ctx.equalOperation()) , ctx.ID2().getText());
        }
        return new EqualNull(null , ctx.ID2().getText());
    }

    @Override
    public EqualOperation visitEqualOperation(MyParser.EqualOperationContext ctx) {
        if (ctx.getText()!=null){
            return new EqualOperation(ctx.getText());
        }
        return new EqualOperation(null);
    }

    @Override
    public ConditionExpression visitComparisonExp(MyParser.ComparisonExpContext ctx) {
        LogicalTerm logicalTerm;
        EqualOperation equalOperation;
        logicalTerm = visitLogicalTerm(ctx.logicalTerm());
        if(ctx.equalOperation() != null){
            equalOperation = visitEqualOperation(ctx.equalOperation());
            return new ComparisonExp(logicalTerm,equalOperation);
        }
        return new ComparisonExp(logicalTerm,null);
    }

    @Override
    public LogicalTerm visitLogicalTerm(MyParser.LogicalTermContext ctx) {
        return new LogicalTerm(ctx.getText());
    }

    @Override
    public ConditionExpression visitComparisonWithEqualExp(MyParser.ComparisonWithEqualExpContext ctx) {
        EqualOperation equalOperation = visitEqualOperation(ctx.equalOperation());
        LogicalTerm logicalTerm2 = visitLogicalTerm(ctx.logicalTerm(1));
        LogicalTerm logicalTerm1 = visitLogicalTerm(ctx.logicalTerm(0));
        return new ComparisonWithEqualExp(equalOperation , logicalTerm1 , logicalTerm2);
    }

    /// 3.3 variable declaration expression
    @Override
    public Expression visitVariableDeclaration(MyParser.VariableDeclarationContext ctx) {

        List <PropertyAccess> propertyAccess = new ArrayList<>();

        VariableDeclarationStat variableDeclarationStat = (VariableDeclarationStat) visit(ctx.variableDeclarationStat());

        for (var child : ctx.propertyAccess()){
            propertyAccess.add( (PropertyAccess) visit(child));
        }

        if (ctx.variable_type() != null){
            return new VariableDeclaration(visitVariable_type(ctx.variable_type()) , propertyAccess , variableDeclarationStat);
        }
        return new VariableDeclaration(propertyAccess , variableDeclarationStat);
    }

    /// variable declaration stat
    /// 1.1 Typed Variable Decl
    @Override
    public VariableDeclarationStat visitTypedVariableDecl(MyParser.TypedVariableDeclContext ctx) {
        return new TypedVariableDecl(visitUnionType(ctx.unionType()) , (Types) visit(ctx.types()));
    }

    /// 1.2 Inferred Variable Decl
    @Override
    public VariableDeclarationStat visitInferredVariableDecl(MyParser.InferredVariableDeclContext ctx) {
        if (ctx.types() != null){
            return new InferredVariableDecl((Types) visit(ctx.types()));
        }
        else {
            return new InferredVariableDecl((Conditions) visit(ctx.conditions()));
        }
    }

    /// conditions
    @Override
    public Conditions visitConditionEqualty(MyParser.ConditionEqualtyContext ctx) {
        return new ConditionEqualty((PropertyAccess) visitPropertyAccess(ctx.propertyAccess(0)) , (PropertyAccess) visitPropertyAccess(ctx.propertyAccess(1)) , (PropertyAccess) visitPropertyAccess(ctx.propertyAccess(2)) );
    }

    @Override
    public Conditions visitConditionValue(MyParser.ConditionValueContext ctx) {
        return new ConditionValue((PropertyAccess) visitPropertyAccess(ctx.propertyAccess(0)) , (Parameters) visitParameters(ctx.parameters(0)) , (PropertyAccess) visitPropertyAccess(ctx.propertyAccess(1)) , (Parameters) visitParameters(ctx.parameters(1)) , (Operations) visitOperations(ctx.operations()));
    }

    /// parameters
    @Override
    public AstNode visitParameters(MyParser.ParametersContext ctx) {
        Parameters parameters = new Parameters();
        for (var child : ctx.parametersContent()){
            parameters.addChild( (ParametersContent) visit(child));
        }
        return parameters;
    }

    ///parameters content
    @Override
    public ParametersContent visitParaHasAccessModifiers(MyParser.ParaHasAccessModifiersContext ctx) {
        Type type = null;
        ParametersType paraType = null;
        if(ctx.type() != null){
            type = (Type) visit(ctx.type());
            paraType = (ParametersType) visit(ctx.parametersType());
        }
        return new ParaHasAccessModifiers(ctx.IDENTIFIER().getText() , type , paraType);
    }

    @Override
    public ParametersContent visitParaHasPropertyAccess(MyParser.ParaHasPropertyAccessContext ctx) {
        ParaHasPropertyAccess paraHasPropertyAccess = new ParaHasPropertyAccess();
        for (var child : ctx.propertyAccess()){
            paraHasPropertyAccess.addChild( (PropertyAccess) visit(child));
        }
        return paraHasPropertyAccess;
    }

    /// parameters type
    @Override
    public ParaWithType visitParaWithType(MyParser.ParaWithTypeContext ctx) {
        ArrayList<Type> type1 = new ArrayList<>() ;
        for (var child : ctx.type()){
            type1.add((Type) visit(child));
        }
        String name = ctx.IDENTIFIER().toString() + ctx.COLON().toString();
        return new ParaWithType( type1 , name);
    }

    @Override
    public ParametersType visitParaValue(MyParser.ParaValueContext ctx) {

        if (ctx.type() != null){

            ArrayList<Type> type = new ArrayList<>() ;
            for (var child : ctx.type()){
                type.add((Type) visit(child));
            }

            ArrayList<Values> values = new ArrayList<>() ;
            for (var child : ctx.values()){
                values.add((Values) visit(child));
            }

            return new ParaValue((Values) visitValues(ctx.values(0)) , type ,  values);
        }

        return new ParaValue((Values) visitValues(ctx.values(0)));
    }

    /// 1.3 Object From Class Variable Decl
    @Override
    public VariableDeclarationStat visitObjectFromClass(MyParser.ObjectFromClassContext ctx) {
        return new ObjectFromClass((NewObjectFromClass) visitNewObjectFromClass(ctx.newObjectFromClass()));
    }

    @Override
    public VariableDeclarationStat visitNewObjectFromClass(MyParser.NewObjectFromClassContext ctx) {
        if (ctx.toString()!= null){
            return new NewObjectFromClass((Parameters) visitParameters(ctx.parameters()) , (ToString) visitToStringNode(ctx.toStringNode()));
        }
        return new NewObjectFromClass((Parameters) visitParameters(ctx.parameters()));
    }

    @Override
    public NewObjectFromClass visitToStringNode(MyParser.ToStringNodeContext ctx) {
        return new ToString(ctx.TOSTRING().getText() , (Parameters) visitParameters(ctx.parameters()));
    }

    @Override
    public AstNode visitPropertyAccess(MyParser.PropertyAccessContext ctx) {
        return new PropertyAccess(ctx.getText());
    }

    /// 3.4 IfElse Statement
    @Override
    public IfElseStat visitIfQuestionMark(MyParser.IfQuestionMarkContext ctx) {
        return new IfQuestionMark((Type) visit(ctx.type(0)) , (Type)visit(ctx.type(1)));
    }

    @Override
    public IfElseStat visitIfReturn(MyParser.IfReturnContext ctx) {
        return new IfReturn((IfStat)visitIfStat(ctx.ifStat()));
    }

    @Override
    public IfElseStat visitIfStat(MyParser.IfStatContext ctx) {
        IfStat types = new IfStat() ;
        for (var child : ctx.types()){
            types.addChild((Types) visit(child));
        }

        return types;
    }

    @Override
    public IfElseStat visitIfElse(MyParser.IfElseContext ctx) {
        if (ctx.conditionStat(1)!= null){
            return new IfElse((IfStat) visitIfStat(ctx.ifStat()) , (ConditionStat) visitConditionStat(ctx.conditionStat(0)) , (ConditionStat) visitConditionStat(ctx.conditionStat(1)));
        }
        return new IfElse((IfStat) visitIfStat(ctx.ifStat()) , (ConditionStat) visitConditionStat(ctx.conditionStat(0)));
    }

    @Override
    public AstNode visitConditionStat(MyParser.ConditionStatContext ctx) {
        ConditionStat expression = new ConditionStat() ;
        for (var child : ctx.expression()){
            expression.addChild((Expression) visit(child));
        }

        return expression;
    }

    /// 3.5 try Statement
    @Override
    public Expression visitTryStat(MyParser.TryStatContext ctx) {
        return new TryStat(ctx.TRY().getText() , (ConditionStat) visitConditionStat(ctx.conditionStat()));
    }

    /// 3.6 catch Statement
    @Override
    public Expression visitCatchStat(MyParser.CatchStatContext ctx) {
        return new CatchStat(ctx.CATCH().getText() , (ConditionStat) visitConditionStat(ctx.conditionStat()));
    }

    ///  3.7 assignment
    @Override
    public Assignment visitSimpleAssignment(MyParser.SimpleAssignmentContext ctx) {
        Expression expression = (Expression) visit(ctx.expression());
        return new SimpleAssignment(expression);
    }

    @Override
    public Assignment visitDotAssignment(MyParser.DotAssignmentContext ctx) {
        if (ctx.type() != null){
            if (ctx.operations() != null && ctx.values() != null){
                return new DotAssignment((PropertyAccess) visitPropertyAccess(ctx.propertyAccess()) , (SubDotAssignment) visitSubDotAssignment(ctx.subDotAssignment())
                        , (Type) visit(ctx.type()) , (Operations) visitOperations(ctx.operations()) , (Values) visitValues(ctx.values()));
            }
            return new DotAssignment((PropertyAccess) visitPropertyAccess(ctx.propertyAccess()) , (SubDotAssignment) visitSubDotAssignment(ctx.subDotAssignment())
                    , (Type) visit(ctx.type()));
        }
        return new DotAssignment((PropertyAccess) visitPropertyAccess(ctx.propertyAccess()) , (SubDotAssignment) visitSubDotAssignment(ctx.subDotAssignment()));
    }

    @Override
    public Assignment visitSubDotAssignment(MyParser.SubDotAssignmentContext ctx) {
        SubDotAssignment subDotAssignment = new SubDotAssignment() ;
        for (var child : ctx.values()){
            subDotAssignment.addChild((Values) visitValues(child));
        }
        return subDotAssignment;
    }

    @Override
    public Assignment visitAssignmentStatement(MyParser.AssignmentStatementContext ctx) {
        if(ctx.primitiveType() != null){
            return new AssignmentStatement((Assignment) visit(ctx.assignment(0)) ,(Assignment) visit(ctx.assignment(1)) , (PrimitiveTypeNode) visit(ctx.primitiveType()));
        }
        return new AssignmentStatement((Assignment) visit(ctx.assignment(0)) ,(Assignment) visit(ctx.assignment(1)));
    }

    @Override
    public Assignment visitAssignmentStatementIniti(MyParser.AssignmentStatementInitiContext ctx) {
        return new AssignmentStatementIniti((PropertyAccess) visitPropertyAccess(ctx.propertyAccess()) , (ObjectLiteral) visitObjectLiteral(ctx.objectLiteral()));
    }

    @Override
    public AstNode visitObjectLiteral(MyParser.ObjectLiteralContext ctx) {
        ObjectLiteral objectLiteral = new ObjectLiteral() ;
        for (var child : ctx.objectProperty()){
            objectLiteral.addChild((ObjectProperty) visit(child));
        }
        return objectLiteral;
    }

    /// object property
    @Override
    public ObjectProperty visitIdentifierObjectProperty(MyParser.IdentifierObjectPropertyContext ctx) {
        return new IdentifierObjectProperty(ctx.IDENTIFIER().getText() , (Expression) visit(ctx.expression()));
    }

    @Override
    public ObjectProperty visitImportsObjectProperty(MyParser.ImportsObjectPropertyContext ctx) {
        return new ImportsObjectProperty(ctx.IMPORTS().getText() , (Expression) visit(ctx.expression()));
    }

    @Override
    public ObjectProperty visitExportsObjectProperty(MyParser.ExportsObjectPropertyContext ctx) {
        return new ExportsObjectProperty(ctx.EXPORTS().getText() , (Expression) visit(ctx.expression()));
    }

    @Override
    public ObjectProperty visitDotPropertyAccessObjectProperty(MyParser.DotPropertyAccessObjectPropertyContext ctx) {
        return new IdentifierObjectProperty(ctx.DOT().toString() , (Expression) visit(ctx.propertyAccess()));
    }

    /// 3.8 question condition
    @Override
    public Expression visitQuestionCondition(MyParser.QuestionConditionContext ctx) {
        return new QuestionCondition((PropertyAccess) visitPropertyAccess(ctx.propertyAccess()) , (Values) visitValues(ctx.values()));
    }

    /// 3.9 operation Expression
    @Override
    public Expression visitOperationExpr(MyParser.OperationExprContext ctx) {
        if (ctx.operations() != null){
            return new OperationExpr((Values) visitValues(ctx.values(0)) , (Operations) visitOperations(ctx.operations()) , (Values) visitValues(ctx.values(1)));
        }
        return new OperationExpr((Values) visitValues(ctx.values(0)));
    }

    ///  function call
    @Override
    public FunctionCall visitCallFunctionPara(MyParser.CallFunctionParaContext ctx) {
        return new CallFunctionPara((Parameters) visitParameters(ctx.parameters(0)) , (Parameters) visitParameters(ctx.parameters(1)) , (PrintError) visitPrint_error(ctx.print_error()));
    }

    @Override
    public AstNode visitMethodCallWithValue(MyParser.MethodCallWithValueContext ctx) {
        if(ctx.simpleArray()!= null){
            return new MethodCallWithValue((PropertyAccess) visitPropertyAccess(ctx.propertyAccess()) , (Parameters) visitParameters(ctx.parameters()) , (SimpleArray) visitSimpleArray(ctx.simpleArray()));
        }
        return new MethodCallWithValue((PropertyAccess) visitPropertyAccess(ctx.propertyAccess()) , (Parameters) visitParameters(ctx.parameters()));
    }

    @Override
    public FunctionCall visitMethodCallWithListValue(MyParser.MethodCallWithListValueContext ctx) {
        if(ctx.argumentList()!= null){
            return new MethodCallWithListValue((PropertyAccess) visitPropertyAccess(ctx.propertyAccess()) , (ArgumentList) visit(ctx.argumentList()));
        }
        return new MethodCallWithListValue((PropertyAccess) visitPropertyAccess(ctx.propertyAccess()));
    }

    //argument list
    @Override
    public ArgumentList visitWithObjectPropertyArgumentList(MyParser.WithObjectPropertyArgumentListContext ctx) {
        return new WithObjectPropertyArgumentList((ObjectProperty) visit(ctx.objectProperty()));
    }

    @Override
    public ArgumentList visitWithExpressionArgumentList(MyParser.WithExpressionArgumentListContext ctx) {
        WithExpressionArgumentList withExpressionArgumentList = new WithExpressionArgumentList();
        for (var child : ctx.expression()){
            withExpressionArgumentList.addChild((Expression) visit(child));
        }
        return withExpressionArgumentList;
    }



    @Override
    public HtmlDeclare visitSelfClosingTag(MyParser.SelfClosingTagContext ctx) {
        SelfClosingTag selfClosingTag = new SelfClosingTag();
        Boolean isExisted = false;

        for (var child : ctx.types()){
            selfClosingTag.addTypes( (Types) visit(child));
            if (child.getText().equals("ngModel")){
                if(!symbolTable2.getFormsModuleTracker().checkForms()){
                    ErrorHandler.logError(new FormsModuleException("Can't bind to '" + child.getText() + "' since it isn't a known property of " + ctx.types(0).getText()), child.getStart().getLine() , child.getStart().getCharPositionInLine());
                    throw new RuntimeException("Can't bind to '" + child.getText() + "' since it isn't a known property of " + ctx.types(0).getText());

                }
                for(var i : ngModel) {
                    if (i.equals(ctx.types(0).getText())){
                        isExisted = true;
                    }
                }
                if (!isExisted){
                    ErrorHandler.logError(new NgModelSupportedElementException("[(ngModel)] cannot be used on "+ ctx.types(0).getText()+". Only supported on form elements like <input>, <select>, or <textarea>."), ctx.types(0).getStart().getLine(), ctx.types(0).getStart().getCharPositionInLine());
                    throw new RuntimeException("[(ngModel)] cannot be used on "+ ctx.types(0).getText()+". Only supported on form elements like <input>, <select>, or <textarea>.");
                }
            }
        }
        return selfClosingTag;
    }

    @Override
    public StatementNode visitClassStatment(MyParser.ClassStatmentContext ctx) {
        if (ctx.body()!= null){
            List<Body> bodyList = new ArrayList<>();
            for (var child : ctx.body()){
                bodyList.add((Body) visit(child));
            }
            return new ClassStatement(ctx.EXPORT().getText() , (ClassRelation) visit(ctx.classRelation()) , bodyList);
        }
        return new ClassStatement(ctx.EXPORT().getText() , (ClassRelation) visit(ctx.classRelation()));
    }

    //class relation
    @Override
    public ClassRelation visitCommonRelation(MyParser.CommonRelationContext ctx) {
        if(ctx.classType() != null){
            return new CommonRelation(ctx.IDENTIFIER(0).getText() , (ClassType)visitClassType(ctx.classType()));
        }
        return new CommonRelation(ctx.IDENTIFIER(0).getText());
    }

    @Override
    public ClassRelation visitOtherRelation(MyParser.OtherRelationContext ctx) {
        return new OtherRelation((ClassType)visitClassType(ctx.classType()) , ctx.IDENTIFIER(0).getText());
    }

    //class type
    @Override
    public ClassRelation visitClassType(MyParser.ClassTypeContext ctx) {
        if (ctx.variable_type()!= null){
            return new ClassType(visitVariable_type(ctx.variable_type()));
        }
        return new ClassType(ctx.getText());
    }

    @Override
    public VariableType visitVariable_type(MyParser.Variable_typeContext ctx) {
        return new VariableType(ctx.getText());
    }

    @Override
    public UnionTypeNode visitUnionType(MyParser.UnionTypeContext ctx) {
        if (ctx.type(1) != null){
            return new UnionTypeNode((Type) visit(ctx.type(0)) , (Type) visit (ctx.type(1)));
        }
        return new UnionTypeNode((Type) visit(ctx.type(0)) , null);
    }



    /// visit body
    /// 1.1  function declaration
    @Override
    public FunctionDeclaration visitNormalfunctionDecl(MyParser.NormalfunctionDeclContext ctx) {
        VariableType returnType = null;
        if (ctx.FUNCTION() != null || ctx.variable_type() != null) {
            returnType = new VariableType(ctx.getStart().getText());
        }
        // FunctionDeclarationStat
        FunctionDeclarationStat stat = (FunctionDeclarationStat) visit(ctx.functionDeclarationStat());
        symbolTable2.getEventBindingTable().addFunctionName(ctx.IDENTIFIER().getText());
        // Body
        List<Body> bodyList = new ArrayList<>();
        for (var b : ctx.body()) {
            bodyList.add((Body) visit(b));
        }
        return new NormalfunctionDecl(ctx.IDENTIFIER().getText() , returnType, stat, bodyList);
    }

    /// function Declaration Stat
    @Override
    public FunctionDeclarationStat visitSimpleDecStat(MyParser.SimpleDecStatContext ctx) {
        String returnType = null;
        if (ctx.FUNCTION() != null) {
            returnType = ctx.FUNCTION().getText();
        }
        // Parameters
        Parameters para = null;
        if(ctx.parameters()!= null){
            para = (Parameters) visitParameters(ctx.parameters());

        }
        UnionTypeNode union = null;
        if(ctx.unionType()!= null){
            union = visitUnionType(ctx.unionType());

        }


        return new SimpleDecStat(returnType, para, union);
    }

    @Override
    public FunctionDeclarationStat visitSimpleArrayDecStat(MyParser.SimpleArrayDecStatContext ctx) {
        return new SimpleArrayDecStat((Parameters) visitParameters(ctx.parameters()) , (SimpleArray) visitSimpleArray(ctx.simpleArray()));
    }

    /// arrow function
    @Override
    public ArrowFunction visitVarArrowFunction(MyParser.VarArrowFunctionContext ctx) {
        symbolTable2.getEventBindingTable().addFunctionName(ctx.IDENTIFIER().getText());
        Type returnType = null;

        if (ctx.type() != null) {
            returnType = (Type) visit(ctx.type());
        }
        return new VarArrowFunction(visitVariable_type(ctx.variable_type()) , (Parameters) visitParameters(ctx.parameters()) , returnType , (Body) visit(ctx.body()));
    }

    @Override
    public ArrowFunction visitEventHandlerArrowFunction(MyParser.EventHandlerArrowFunctionContext ctx) {
        Parameters parameter = null;
        if (ctx.parameters() != null) {
            parameter = (Parameters) visitParameters(ctx.parameters());
        }

        Type type = null;
        if (ctx.type() != null) {
            type = (Type) visit(ctx.type());
        }

        List<Body> bodyList = new ArrayList<>();
        for (var b : ctx.body()) {
            bodyList.add((Body) visit(b));
        }

        symbolTable2.getEventBindingTable().addFunctionName(ctx.propertyAccess().getText());

        return new EventHandlerArrowFunction((PropertyAccess) visitPropertyAccess(ctx.propertyAccess()) , parameter , type , bodyList);
    }

    @Override
    public Body visitStateManagement(MyParser.StateManagementContext ctx) {
        return new StateManagement((VariableType) visitVariable_type(ctx.variable_type()) , (SimpleArray) visitSimpleArray(ctx.simpleArray()) , (Brackets) visitBrackets(ctx.brackets()) );
    }

    @Override
    public StateManagement visitBrackets(MyParser.BracketsContext ctx) {
        String mark = ctx.getText();
        return new Brackets(mark);
    }

    @Override
    public Body visitReturnStat(MyParser.ReturnStatContext ctx) {
        return new ReturnStat((ReturnType) visit(ctx.returnType()));
    }

    @Override
    public Types visitEventBinding(MyParser.EventBindingContext ctx) {
        if (!symbolTable2.getEventBindingTable().checkEvent(ctx.ID3(0).getText())) {
            ErrorHandler.logError(new EventBindingException("Event Binding To NonFunction'" + ctx.ID3(0).getText() + "'. You have to define this function."),  ctx.ID3(0).getSymbol().getLine(),  ctx.ID3(0).getSymbol().getCharPositionInLine());
            throw new RuntimeException("Event Binding To NonFunction'" + ctx.ID3(0).getText() + "'. You have to define this function.");
        }
        String mark = "";
        if (ctx.DOT3() != null && !ctx.DOT3().isEmpty()) {
            System.out.println("DOT3 is present: " + ctx.DOT3(0).getText());

                mark = ctx.ID3().get(1).getText() + ctx.DOT3(0).getText() + ctx.ID3().get(2).getText();
                System.out.println("Generated mark: " + mark);
            return new EventBinding(ctx.CLICK().getText(), ctx.ID3(0).getText() ,mark);

        }
        else {
            System.out.println("DOT3 is null");
        }

        return new EventBinding(ctx.CLICK().getText(), ctx.ID3(0).getText() ,null);
    }

    @Override
    public Body visitPrint_error(MyParser.Print_errorContext ctx) {
        return new PrintError(ctx.CONSOLE().getText() , ctx.ERROR().getText() , (Values) visitValues(ctx.values()));
    }

    @Override
    public Body visitPrint_stat(MyParser.Print_statContext ctx) {
        return new PrintError(ctx.CONSOLE().getText() , ctx.LOG().getText() , (Values) visitValues(ctx.values()));
    }
}
