// Generated from C:/Users/ASUS/IdeaProjects/CompilerProject/src/antlr/MyParser.g4 by ANTLR 4.13.2
package antlr;
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
	 * Enter a parse tree produced by {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MyParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MyParser.FunctionCallContext ctx);
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
	 * Enter a parse tree produced by {@link MyParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBody(MyParser.HtmlBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBody(MyParser.HtmlBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(MyParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(MyParser.ClassBodyContext ctx);
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
	 * Enter a parse tree produced by {@link MyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(MyParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(MyParser.VariableDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link MyParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MyParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MyParser.FunctionDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MyParser.ExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link MyParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MyParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MyParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(MyParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(MyParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MyParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MyParser.AssignmentContext ctx);
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
	 * Enter a parse tree produced by {@link MyParser#directivesStatment}.
	 * @param ctx the parse tree
	 */
	void enterDirectivesStatment(MyParser.DirectivesStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#directivesStatment}.
	 * @param ctx the parse tree
	 */
	void exitDirectivesStatment(MyParser.DirectivesStatmentContext ctx);
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
}