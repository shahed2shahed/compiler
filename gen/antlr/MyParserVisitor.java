// Generated from C:/Users/ASUS/IdeaProjects/CompilerProjectFinal/src/antlr/MyParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MyParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#importStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatment(MyParser.ImportStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(MyParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentBody(MyParser.ComponentBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#selectorProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorProperty(MyParser.SelectorPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#standaloneProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneProperty(MyParser.StandalonePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#importsProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsProperty(MyParser.ImportsPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#templateProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateProperty(MyParser.TemplatePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#componentEle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentEle(MyParser.ComponentEleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#classStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStatment(MyParser.ClassStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(MyParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#print_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_error(MyParser.Print_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#print_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stat(MyParser.Print_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callWithPara}
	 * labeled alternative in {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallWithPara(MyParser.CallWithParaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callWithoutPara}
	 * labeled alternative in {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallWithoutPara(MyParser.CallWithoutParaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedFunctionDecl}
	 * labeled alternative in {@link MyParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedFunctionDecl(MyParser.NamedFunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowFunctionAsFunctionDecl}
	 * labeled alternative in {@link MyParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionAsFunctionDecl(MyParser.ArrowFunctionAsFunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignedFunctionDecl}
	 * labeled alternative in {@link MyParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignedFunctionDecl(MyParser.AssignedFunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paraWithType}
	 * labeled alternative in {@link MyParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaWithType(MyParser.ParaWithTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paraWithoutType}
	 * labeled alternative in {@link MyParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaWithoutType(MyParser.ParaWithoutTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleAssignment}
	 * labeled alternative in {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssignment(MyParser.SimpleAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dotAssignment}
	 * labeled alternative in {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotAssignment(MyParser.DotAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#templateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateExpression(MyParser.TemplateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(MyParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#htmlDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDeclare(MyParser.HtmlDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#normalHtmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalHtmlTag(MyParser.NormalHtmlTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(MyParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(MyParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(MyParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MyParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPrimitiveType(MyParser.IdPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberPrimitiveType(MyParser.NumberPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidPrimitiveType(MyParser.VoidPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullPrimitiveType(MyParser.NullPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyPrimitiveType(MyParser.AnyPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringEXPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringEXPrimitiveType(MyParser.StringEXPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassPrimitiveType(MyParser.ClassPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code templateExPrimitiveType}
	 * labeled alternative in {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateExPrimitiveType(MyParser.TemplateExPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#arrayStringType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayStringType(MyParser.ArrayStringTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#arrayNumberType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayNumberType(MyParser.ArrayNumberTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#tupleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleType(MyParser.TupleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#marks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarks(MyParser.MarksContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(MyParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(MyParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(MyParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(MyParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseExpr(MyParser.IfElseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpr(MyParser.ObjectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(MyParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directiveExpr}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveExpr(MyParser.DirectiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ngForDirective}
	 * labeled alternative in {@link MyParser#directivesStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgForDirective(MyParser.NgForDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ngIfDirective}
	 * labeled alternative in {@link MyParser#directivesStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIfDirective(MyParser.NgIfDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#ngForValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgForValue(MyParser.NgForValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#ngForExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgForExpression(MyParser.NgForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#ngIfValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIfValue(MyParser.NgIfValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalNull}
	 * labeled alternative in {@link MyParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualNull(MyParser.EqualNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonExp}
	 * labeled alternative in {@link MyParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExp(MyParser.ComparisonExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonWithEqualExp}
	 * labeled alternative in {@link MyParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonWithEqualExp(MyParser.ComparisonWithEqualExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#equalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualOperation(MyParser.EqualOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#logicalTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalTerm(MyParser.LogicalTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#ifElseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStat(MyParser.IfElseStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#variable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_type(MyParser.Variable_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#unionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionType(MyParser.UnionTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typedVariableDecl}
	 * labeled alternative in {@link MyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedVariableDecl(MyParser.TypedVariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inferredVariableDecl}
	 * labeled alternative in {@link MyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredVariableDecl(MyParser.InferredVariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(MyParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#arrowBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowBody(MyParser.ArrowBodyContext ctx);
}