// Generated from C:/Users/ASUS/IdeaProjects/CompilerProjectFinal/src/antlr/antlr/MyParser.g4 by ANTLR 4.13.2
package antlr.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyParser}.
 */
public interface MyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#importStatment}.
	 * @param ctx the parse tree
	 */
	void enterImportStatment(MyParser.ImportStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#importStatment}.
	 * @param ctx the parse tree
	 */
	void exitImportStatment(MyParser.ImportStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(MyParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(MyParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterComponentBody(MyParser.ComponentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitComponentBody(MyParser.ComponentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#selectorProperty}.
	 * @param ctx the parse tree
	 */
	void enterSelectorProperty(MyParser.SelectorPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#selectorProperty}.
	 * @param ctx the parse tree
	 */
	void exitSelectorProperty(MyParser.SelectorPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#standaloneProperty}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneProperty(MyParser.StandalonePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#standaloneProperty}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneProperty(MyParser.StandalonePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#importsProperty}.
	 * @param ctx the parse tree
	 */
	void enterImportsProperty(MyParser.ImportsPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#importsProperty}.
	 * @param ctx the parse tree
	 */
	void exitImportsProperty(MyParser.ImportsPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#templateProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateProperty(MyParser.TemplatePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#templateProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateProperty(MyParser.TemplatePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#componentEle}.
	 * @param ctx the parse tree
	 */
	void enterComponentEle(MyParser.ComponentEleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#componentEle}.
	 * @param ctx the parse tree
	 */
	void exitComponentEle(MyParser.ComponentEleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#classStatment}.
	 * @param ctx the parse tree
	 */
	void enterClassStatment(MyParser.ClassStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#classStatment}.
	 * @param ctx the parse tree
	 */
	void exitClassStatment(MyParser.ClassStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(MyParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(MyParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MyParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MyParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#print_error}.
	 * @param ctx the parse tree
	 */
	void enterPrint_error(MyParser.Print_errorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#print_error}.
	 * @param ctx the parse tree
	 */
	void exitPrint_error(MyParser.Print_errorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#print_stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stat(MyParser.Print_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#print_stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stat(MyParser.Print_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callWithPara}
	 * labeled alternative in {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterCallWithPara(MyParser.CallWithParaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callWithPara}
	 * labeled alternative in {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitCallWithPara(MyParser.CallWithParaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callWithoutPara}
	 * labeled alternative in {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterCallWithoutPara(MyParser.CallWithoutParaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callWithoutPara}
	 * labeled alternative in {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitCallWithoutPara(MyParser.CallWithoutParaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedFunctionDecl}
	 * labeled alternative in {@link MyParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamedFunctionDecl(MyParser.NamedFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedFunctionDecl}
	 * labeled alternative in {@link MyParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamedFunctionDecl(MyParser.NamedFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrowFunctionAsFunctionDecl}
	 * labeled alternative in {@link MyParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionAsFunctionDecl(MyParser.ArrowFunctionAsFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrowFunctionAsFunctionDecl}
	 * labeled alternative in {@link MyParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionAsFunctionDecl(MyParser.ArrowFunctionAsFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignedFunctionDecl}
	 * labeled alternative in {@link MyParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAssignedFunctionDecl(MyParser.AssignedFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignedFunctionDecl}
	 * labeled alternative in {@link MyParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAssignedFunctionDecl(MyParser.AssignedFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paraWithType}
	 * labeled alternative in {@link MyParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParaWithType(MyParser.ParaWithTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paraWithType}
	 * labeled alternative in {@link MyParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParaWithType(MyParser.ParaWithTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paraWithoutType}
	 * labeled alternative in {@link MyParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParaWithoutType(MyParser.ParaWithoutTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paraWithoutType}
	 * labeled alternative in {@link MyParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParaWithoutType(MyParser.ParaWithoutTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleAssignment}
	 * labeled alternative in {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAssignment(MyParser.SimpleAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleAssignment}
	 * labeled alternative in {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAssignment(MyParser.SimpleAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dotAssignment}
	 * labeled alternative in {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterDotAssignment(MyParser.DotAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dotAssignment}
	 * labeled alternative in {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitDotAssignment(MyParser.DotAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#templateExpression}.
	 * @param ctx the parse tree
	 */
	void enterTemplateExpression(MyParser.TemplateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#templateExpression}.
	 * @param ctx the parse tree
	 */
	void exitTemplateExpression(MyParser.TemplateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(MyParser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(MyParser.EventBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#htmlDeclare}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDeclare(MyParser.HtmlDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#htmlDeclare}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDeclare(MyParser.HtmlDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#normalHtmlTag}.
	 * @param ctx the parse tree
	 */
	void enterNormalHtmlTag(MyParser.NormalHtmlTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#normalHtmlTag}.
	 * @param ctx the parse tree
	 */
	void exitNormalHtmlTag(MyParser.NormalHtmlTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(MyParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(MyParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(MyParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(MyParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(MyParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(MyParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MyParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterIdPrimitiveType(MyParser.IdPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitIdPrimitiveType(MyParser.IdPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterNumberPrimitiveType(MyParser.NumberPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitNumberPrimitiveType(MyParser.NumberPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterVoidPrimitiveType(MyParser.VoidPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitVoidPrimitiveType(MyParser.VoidPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterNullPrimitiveType(MyParser.NullPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitNullPrimitiveType(MyParser.NullPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterAnyPrimitiveType(MyParser.AnyPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitAnyPrimitiveType(MyParser.AnyPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringEXPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterStringEXPrimitiveType(MyParser.StringEXPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringEXPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitStringEXPrimitiveType(MyParser.StringEXPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterClassPrimitiveType(MyParser.ClassPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitClassPrimitiveType(MyParser.ClassPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code templateExPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterTemplateExPrimitiveType(MyParser.TemplateExPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templateExPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitTemplateExPrimitiveType(MyParser.TemplateExPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#arrayStringType}.
	 * @param ctx the parse tree
	 */
	void enterArrayStringType(MyParser.ArrayStringTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#arrayStringType}.
	 * @param ctx the parse tree
	 */
	void exitArrayStringType(MyParser.ArrayStringTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#arrayNumberType}.
	 * @param ctx the parse tree
	 */
	void enterArrayNumberType(MyParser.ArrayNumberTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#arrayNumberType}.
	 * @param ctx the parse tree
	 */
	void exitArrayNumberType(MyParser.ArrayNumberTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(MyParser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(MyParser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#marks}.
	 * @param ctx the parse tree
	 */
	void enterMarks(MyParser.MarksContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#marks}.
	 * @param ctx the parse tree
	 */
	void exitMarks(MyParser.MarksContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(MyParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(MyParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(MyParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(MyParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(MyParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(MyParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(MyParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(MyParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIfElseExpr(MyParser.IfElseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIfElseExpr(MyParser.IfElseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpr(MyParser.ObjectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpr(MyParser.ObjectExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(MyParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(MyParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directiveExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveExpr(MyParser.DirectiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directiveExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveExpr(MyParser.DirectiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngForDirective}
	 * labeled alternative in {@link MyParser#directivesStatment}.
	 * @param ctx the parse tree
	 */
	void enterNgForDirective(MyParser.NgForDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngForDirective}
	 * labeled alternative in {@link MyParser#directivesStatment}.
	 * @param ctx the parse tree
	 */
	void exitNgForDirective(MyParser.NgForDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngIfDirective}
	 * labeled alternative in {@link MyParser#directivesStatment}.
	 * @param ctx the parse tree
	 */
	void enterNgIfDirective(MyParser.NgIfDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngIfDirective}
	 * labeled alternative in {@link MyParser#directivesStatment}.
	 * @param ctx the parse tree
	 */
	void exitNgIfDirective(MyParser.NgIfDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#ngForValue}.
	 * @param ctx the parse tree
	 */
	void enterNgForValue(MyParser.NgForValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#ngForValue}.
	 * @param ctx the parse tree
	 */
	void exitNgForValue(MyParser.NgForValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#ngForExpression}.
	 * @param ctx the parse tree
	 */
	void enterNgForExpression(MyParser.NgForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#ngForExpression}.
	 * @param ctx the parse tree
	 */
	void exitNgForExpression(MyParser.NgForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#ngIfValue}.
	 * @param ctx the parse tree
	 */
	void enterNgIfValue(MyParser.NgIfValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#ngIfValue}.
	 * @param ctx the parse tree
	 */
	void exitNgIfValue(MyParser.NgIfValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalNull}
	 * labeled alternative in {@link MyParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualNull(MyParser.EqualNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalNull}
	 * labeled alternative in {@link MyParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualNull(MyParser.EqualNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonExp}
	 * labeled alternative in {@link MyParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExp(MyParser.ComparisonExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExp}
	 * labeled alternative in {@link MyParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExp(MyParser.ComparisonExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonWithEqualExp}
	 * labeled alternative in {@link MyParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonWithEqualExp(MyParser.ComparisonWithEqualExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonWithEqualExp}
	 * labeled alternative in {@link MyParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonWithEqualExp(MyParser.ComparisonWithEqualExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#equalOperation}.
	 * @param ctx the parse tree
	 */
	void enterEqualOperation(MyParser.EqualOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#equalOperation}.
	 * @param ctx the parse tree
	 */
	void exitEqualOperation(MyParser.EqualOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#logicalTerm}.
	 * @param ctx the parse tree
	 */
	void enterLogicalTerm(MyParser.LogicalTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#logicalTerm}.
	 * @param ctx the parse tree
	 */
	void exitLogicalTerm(MyParser.LogicalTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#ifElseStat}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStat(MyParser.IfElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#ifElseStat}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStat(MyParser.IfElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterVariable_type(MyParser.Variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitVariable_type(MyParser.Variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#unionType}.
	 * @param ctx the parse tree
	 */
	void enterUnionType(MyParser.UnionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#unionType}.
	 * @param ctx the parse tree
	 */
	void exitUnionType(MyParser.UnionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#newObjectFromClass}.
	 * @param ctx the parse tree
	 */
	void enterNewObjectFromClass(MyParser.NewObjectFromClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#newObjectFromClass}.
	 * @param ctx the parse tree
	 */
	void exitNewObjectFromClass(MyParser.NewObjectFromClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typedVariableDecl}
	 * labeled alternative in {@link MyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedVariableDecl(MyParser.TypedVariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typedVariableDecl}
	 * labeled alternative in {@link MyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedVariableDecl(MyParser.TypedVariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inferredVariableDecl}
	 * labeled alternative in {@link MyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInferredVariableDecl(MyParser.InferredVariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inferredVariableDecl}
	 * labeled alternative in {@link MyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInferredVariableDecl(MyParser.InferredVariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectFromClass}
	 * labeled alternative in {@link MyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectFromClass(MyParser.ObjectFromClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectFromClass}
	 * labeled alternative in {@link MyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectFromClass(MyParser.ObjectFromClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(MyParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(MyParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#arrowBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowBody(MyParser.ArrowBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#arrowBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowBody(MyParser.ArrowBodyContext ctx);
}