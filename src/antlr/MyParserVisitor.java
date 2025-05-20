// Generated from C:/Users/ASUS/IdeaProjects/CompilerProject/src/antlr/MyParser.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link MyParser#classStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStatment(MyParser.ClassStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MyParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#htmlDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDeclare(MyParser.HtmlDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(MyParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(MyParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(MyParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(MyParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#htmlBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlBody(MyParser.HtmlBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(MyParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#variable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_type(MyParser.Variable_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(MyParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(MyParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(MyParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MyParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#marks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarks(MyParser.MarksContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MyParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#templateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateExpression(MyParser.TemplateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(MyParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(MyParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(MyParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MyParser.AssignmentContext ctx);
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
	 * Visit a parse tree produced by {@link MyParser#directivesStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectivesStatment(MyParser.DirectivesStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#ifElseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStat(MyParser.IfElseStatContext ctx);
}