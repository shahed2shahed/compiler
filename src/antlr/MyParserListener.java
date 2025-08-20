// Generated from C:/Users/ASUS/IdeaProjects/CompilerProjectFinal/src/antlr/MyParser.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link MyParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(MyParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(MyParser.ModuleContext ctx);
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
	 * Enter a parse tree produced by {@link MyParser#propertyStat}.
	 * @param ctx the parse tree
	 */
	void enterPropertyStat(MyParser.PropertyStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#propertyStat}.
	 * @param ctx the parse tree
	 */
	void exitPropertyStat(MyParser.PropertyStatContext ctx);
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
	 * Enter a parse tree produced by {@link MyParser#exportsProperty}.
	 * @param ctx the parse tree
	 */
	void enterExportsProperty(MyParser.ExportsPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#exportsProperty}.
	 * @param ctx the parse tree
	 */
	void exitExportsProperty(MyParser.ExportsPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#bootstrapProperty}.
	 * @param ctx the parse tree
	 */
	void enterBootstrapProperty(MyParser.BootstrapPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#bootstrapProperty}.
	 * @param ctx the parse tree
	 */
	void exitBootstrapProperty(MyParser.BootstrapPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code templateHtmlDeclaration}
	 * labeled alternative in {@link MyParser#templateProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlDeclaration(MyParser.TemplateHtmlDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templateHtmlDeclaration}
	 * labeled alternative in {@link MyParser#templateProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlDeclaration(MyParser.TemplateHtmlDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code templateHtmlUrl}
	 * labeled alternative in {@link MyParser#templateProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlUrl(MyParser.TemplateHtmlUrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templateHtmlUrl}
	 * labeled alternative in {@link MyParser#templateProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlUrl(MyParser.TemplateHtmlUrlContext ctx);
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
	 * Enter a parse tree produced by {@link MyParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(MyParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(MyParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commonRelation}
	 * labeled alternative in {@link MyParser#classRelation}.
	 * @param ctx the parse tree
	 */
	void enterCommonRelation(MyParser.CommonRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commonRelation}
	 * labeled alternative in {@link MyParser#classRelation}.
	 * @param ctx the parse tree
	 */
	void exitCommonRelation(MyParser.CommonRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code otherRelation}
	 * labeled alternative in {@link MyParser#classRelation}.
	 * @param ctx the parse tree
	 */
	void enterOtherRelation(MyParser.OtherRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code otherRelation}
	 * labeled alternative in {@link MyParser#classRelation}.
	 * @param ctx the parse tree
	 */
	void exitOtherRelation(MyParser.OtherRelationContext ctx);
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
	 * Enter a parse tree produced by {@link MyParser#brackets}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(MyParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#brackets}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(MyParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#stateManagement}.
	 * @param ctx the parse tree
	 */
	void enterStateManagement(MyParser.StateManagementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#stateManagement}.
	 * @param ctx the parse tree
	 */
	void exitStateManagement(MyParser.StateManagementContext ctx);
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
	 * Enter a parse tree produced by the {@code callFunctionPara}
	 * labeled alternative in {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterCallFunctionPara(MyParser.CallFunctionParaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callFunctionPara}
	 * labeled alternative in {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitCallFunctionPara(MyParser.CallFunctionParaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallWithValue}
	 * labeled alternative in {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallWithValue(MyParser.MethodCallWithValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallWithValue}
	 * labeled alternative in {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallWithValue(MyParser.MethodCallWithValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallWithListValue}
	 * labeled alternative in {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallWithListValue(MyParser.MethodCallWithListValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallWithListValue}
	 * labeled alternative in {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallWithListValue(MyParser.MethodCallWithListValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectLiteralArgumentList}
	 * labeled alternative in {@link MyParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralArgumentList(MyParser.ObjectLiteralArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectLiteralArgumentList}
	 * labeled alternative in {@link MyParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralArgumentList(MyParser.ObjectLiteralArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withObjectPropertyArgumentList}
	 * labeled alternative in {@link MyParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterWithObjectPropertyArgumentList(MyParser.WithObjectPropertyArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withObjectPropertyArgumentList}
	 * labeled alternative in {@link MyParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitWithObjectPropertyArgumentList(MyParser.WithObjectPropertyArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withExpressionArgumentList}
	 * labeled alternative in {@link MyParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterWithExpressionArgumentList(MyParser.WithExpressionArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withExpressionArgumentList}
	 * labeled alternative in {@link MyParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitWithExpressionArgumentList(MyParser.WithExpressionArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionEqualty}
	 * labeled alternative in {@link MyParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditionEqualty(MyParser.ConditionEqualtyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionEqualty}
	 * labeled alternative in {@link MyParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditionEqualty(MyParser.ConditionEqualtyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionValue}
	 * labeled alternative in {@link MyParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditionValue(MyParser.ConditionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionValue}
	 * labeled alternative in {@link MyParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditionValue(MyParser.ConditionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(MyParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(MyParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(MyParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(MyParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(MyParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(MyParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierObjectProperty}
	 * labeled alternative in {@link MyParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierObjectProperty(MyParser.IdentifierObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierObjectProperty}
	 * labeled alternative in {@link MyParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierObjectProperty(MyParser.IdentifierObjectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importsObjectProperty}
	 * labeled alternative in {@link MyParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterImportsObjectProperty(MyParser.ImportsObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importsObjectProperty}
	 * labeled alternative in {@link MyParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitImportsObjectProperty(MyParser.ImportsObjectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exportsObjectProperty}
	 * labeled alternative in {@link MyParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterExportsObjectProperty(MyParser.ExportsObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exportsObjectProperty}
	 * labeled alternative in {@link MyParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitExportsObjectProperty(MyParser.ExportsObjectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dotPropertyAccessObjectProperty}
	 * labeled alternative in {@link MyParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterDotPropertyAccessObjectProperty(MyParser.DotPropertyAccessObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dotPropertyAccessObjectProperty}
	 * labeled alternative in {@link MyParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitDotPropertyAccessObjectProperty(MyParser.DotPropertyAccessObjectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccess(MyParser.PropertyAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccess(MyParser.PropertyAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleDecStat}
	 * labeled alternative in {@link MyParser#functionDeclarationStat}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDecStat(MyParser.SimpleDecStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleDecStat}
	 * labeled alternative in {@link MyParser#functionDeclarationStat}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDecStat(MyParser.SimpleDecStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleArrayDecStat}
	 * labeled alternative in {@link MyParser#functionDeclarationStat}.
	 * @param ctx the parse tree
	 */
	void enterSimpleArrayDecStat(MyParser.SimpleArrayDecStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleArrayDecStat}
	 * labeled alternative in {@link MyParser#functionDeclarationStat}.
	 * @param ctx the parse tree
	 */
	void exitSimpleArrayDecStat(MyParser.SimpleArrayDecStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#normalfunctionDecl}.
	 * @param ctx the parse tree
	 */
	void enterNormalfunctionDecl(MyParser.NormalfunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#normalfunctionDecl}.
	 * @param ctx the parse tree
	 */
	void exitNormalfunctionDecl(MyParser.NormalfunctionDeclContext ctx);
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
	 * Enter a parse tree produced by the {@code paraWithType}
	 * labeled alternative in {@link MyParser#parametersType}.
	 * @param ctx the parse tree
	 */
	void enterParaWithType(MyParser.ParaWithTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paraWithType}
	 * labeled alternative in {@link MyParser#parametersType}.
	 * @param ctx the parse tree
	 */
	void exitParaWithType(MyParser.ParaWithTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paraValue}
	 * labeled alternative in {@link MyParser#parametersType}.
	 * @param ctx the parse tree
	 */
	void enterParaValue(MyParser.ParaValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paraValue}
	 * labeled alternative in {@link MyParser#parametersType}.
	 * @param ctx the parse tree
	 */
	void exitParaValue(MyParser.ParaValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paraHasAccessModifiers}
	 * labeled alternative in {@link MyParser#parametersContent}.
	 * @param ctx the parse tree
	 */
	void enterParaHasAccessModifiers(MyParser.ParaHasAccessModifiersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paraHasAccessModifiers}
	 * labeled alternative in {@link MyParser#parametersContent}.
	 * @param ctx the parse tree
	 */
	void exitParaHasAccessModifiers(MyParser.ParaHasAccessModifiersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paraHasPropertyAccess}
	 * labeled alternative in {@link MyParser#parametersContent}.
	 * @param ctx the parse tree
	 */
	void enterParaHasPropertyAccess(MyParser.ParaHasPropertyAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paraHasPropertyAccess}
	 * labeled alternative in {@link MyParser#parametersContent}.
	 * @param ctx the parse tree
	 */
	void exitParaHasPropertyAccess(MyParser.ParaHasPropertyAccessContext ctx);
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
	 * Enter a parse tree produced by the {@code values}
	 * labeled alternative in {@link MyParser#templatePropertytemplatePropertyclassRelationclassRelationfunctionCallfunctionCallfunctionCallargumentListargumentListargumentListconditionsconditionsobjectPropertyobjectPropertyobjectPropertyobjectPropertyfunctionDeclarationStatfunctionDeclarationStatparametersTypeparametersTypeparametersContentparametersContentassignmentassignmentassignmentassignmentprimitiveTypeprimitiveTypeprimitiveTypeprimitiveTypeprimitiveTypeprimitiveTypeprimitiveTypeprimitiveTypedirectivesStatmentdirectivesStatmentconditionExpressionconditionExpressionconditionExpressionifElseStatifElseStatifElseStatvariableDeclarationStatvariableDeclarationStatvariableDeclarationStatarrowFunctionarrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterValues(MyParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code values}
	 * labeled alternative in {@link MyParser#templatePropertytemplatePropertyclassRelationclassRelationfunctionCallfunctionCallfunctionCallargumentListargumentListargumentListconditionsconditionsobjectPropertyobjectPropertyobjectPropertyobjectPropertyfunctionDeclarationStatfunctionDeclarationStatparametersTypeparametersTypeparametersContentparametersContentassignmentassignmentassignmentassignmentprimitiveTypeprimitiveTypeprimitiveTypeprimitiveTypeprimitiveTypeprimitiveTypeprimitiveTypeprimitiveTypedirectivesStatmentdirectivesStatmentconditionExpressionconditionExpressionconditionExpressionifElseStatifElseStatifElseStatvariableDeclarationStatvariableDeclarationStatvariableDeclarationStatarrowFunctionarrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitValues(MyParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(MyParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(MyParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#subDotAssignment}.
	 * @param ctx the parse tree
	 */
	void enterSubDotAssignment(MyParser.SubDotAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#subDotAssignment}.
	 * @param ctx the parse tree
	 */
	void exitSubDotAssignment(MyParser.SubDotAssignmentContext ctx);
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
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(MyParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(MyParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatementIniti}
	 * labeled alternative in {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatementIniti(MyParser.AssignmentStatementInitiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatementIniti}
	 * labeled alternative in {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatementIniti(MyParser.AssignmentStatementInitiContext ctx);
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
	 * Enter a parse tree produced by {@link MyParser#simpleArray}.
	 * @param ctx the parse tree
	 */
	void enterSimpleArray(MyParser.SimpleArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#simpleArray}.
	 * @param ctx the parse tree
	 */
	void exitSimpleArray(MyParser.SimpleArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(MyParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(MyParser.MapContext ctx);
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
	 * Enter a parse tree produced by {@link MyParser#conditionStat}.
	 * @param ctx the parse tree
	 */
	void enterConditionStat(MyParser.ConditionStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#conditionStat}.
	 * @param ctx the parse tree
	 */
	void exitConditionStat(MyParser.ConditionStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#tryStat}.
	 * @param ctx the parse tree
	 */
	void enterTryStat(MyParser.TryStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#tryStat}.
	 * @param ctx the parse tree
	 */
	void exitTryStat(MyParser.TryStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#catchStat}.
	 * @param ctx the parse tree
	 */
	void enterCatchStat(MyParser.CatchStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#catchStat}.
	 * @param ctx the parse tree
	 */
	void exitCatchStat(MyParser.CatchStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#operationExpr}.
	 * @param ctx the parse tree
	 */
	void enterOperationExpr(MyParser.OperationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#operationExpr}.
	 * @param ctx the parse tree
	 */
	void exitOperationExpr(MyParser.OperationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#questionCondition}.
	 * @param ctx the parse tree
	 */
	void enterQuestionCondition(MyParser.QuestionConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#questionCondition}.
	 * @param ctx the parse tree
	 */
	void exitQuestionCondition(MyParser.QuestionConditionContext ctx);
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
	 * Enter a parse tree produced by {@link MyParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(MyParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(MyParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifQuestionMark}
	 * labeled alternative in {@link MyParser#ifElseStat}.
	 * @param ctx the parse tree
	 */
	void enterIfQuestionMark(MyParser.IfQuestionMarkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifQuestionMark}
	 * labeled alternative in {@link MyParser#ifElseStat}.
	 * @param ctx the parse tree
	 */
	void exitIfQuestionMark(MyParser.IfQuestionMarkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifReturn}
	 * labeled alternative in {@link MyParser#ifElseStat}.
	 * @param ctx the parse tree
	 */
	void enterIfReturn(MyParser.IfReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifReturn}
	 * labeled alternative in {@link MyParser#ifElseStat}.
	 * @param ctx the parse tree
	 */
	void exitIfReturn(MyParser.IfReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link MyParser#ifElseStat}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(MyParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link MyParser#ifElseStat}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(MyParser.IfElseContext ctx);
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
	 * Enter a parse tree produced by {@link MyParser#toString}.
	 * @param ctx the parse tree
	 */
	void enterToString(MyParser.ToStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#toString}.
	 * @param ctx the parse tree
	 */
	void exitToString(MyParser.ToStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typedVariableDecl}
	 * labeled alternative in {@link MyParser#variableDeclarationStat}.
	 * @param ctx the parse tree
	 */
	void enterTypedVariableDecl(MyParser.TypedVariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typedVariableDecl}
	 * labeled alternative in {@link MyParser#variableDeclarationStat}.
	 * @param ctx the parse tree
	 */
	void exitTypedVariableDecl(MyParser.TypedVariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inferredVariableDecl}
	 * labeled alternative in {@link MyParser#variableDeclarationStat}.
	 * @param ctx the parse tree
	 */
	void enterInferredVariableDecl(MyParser.InferredVariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inferredVariableDecl}
	 * labeled alternative in {@link MyParser#variableDeclarationStat}.
	 * @param ctx the parse tree
	 */
	void exitInferredVariableDecl(MyParser.InferredVariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectFromClass}
	 * labeled alternative in {@link MyParser#variableDeclarationStat}.
	 * @param ctx the parse tree
	 */
	void enterObjectFromClass(MyParser.ObjectFromClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectFromClass}
	 * labeled alternative in {@link MyParser#variableDeclarationStat}.
	 * @param ctx the parse tree
	 */
	void exitObjectFromClass(MyParser.ObjectFromClassContext ctx);
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
	 * Enter a parse tree produced by the {@code varArrowFunction}
	 * labeled alternative in {@link MyParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterVarArrowFunction(MyParser.VarArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varArrowFunction}
	 * labeled alternative in {@link MyParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitVarArrowFunction(MyParser.VarArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eventHandlerArrowFunction}
	 * labeled alternative in {@link MyParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterEventHandlerArrowFunction(MyParser.EventHandlerArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eventHandlerArrowFunction}
	 * labeled alternative in {@link MyParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitEventHandlerArrowFunction(MyParser.EventHandlerArrowFunctionContext ctx);
}