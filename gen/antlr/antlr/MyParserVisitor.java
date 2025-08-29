// Generated from C:/Users/ASUS/Desktop/compiler/src/antlr/antlr/MyParser.g4 by ANTLR 4.13.2
package antlr.antlr;
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
	 * Visit a parse tree produced by {@link MyParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(MyParser.ModuleContext ctx);
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
	 * Visit a parse tree produced by {@link MyParser#componentEle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentEle(MyParser.ComponentEleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(MyParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code templateHtmlDeclaration}
	 * labeled alternative in {@link MyParser#templateProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlDeclaration(MyParser.TemplateHtmlDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code templateHtmlUrl}
	 * labeled alternative in {@link MyParser#templateProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlUrl(MyParser.TemplateHtmlUrlContext ctx);
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
	 * Visit a parse tree produced by {@link MyParser#propertyFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyFun(MyParser.PropertyFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#propertyStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyStat(MyParser.PropertyStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#importsProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsProperty(MyParser.ImportsPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#exportsProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportsProperty(MyParser.ExportsPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#bootstrapProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBootstrapProperty(MyParser.BootstrapPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(MyParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commonRelation}
	 * labeled alternative in {@link MyParser#classRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonRelation(MyParser.CommonRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code otherRelation}
	 * labeled alternative in {@link MyParser#classRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherRelation(MyParser.OtherRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#classStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStatment(MyParser.ClassStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(MyParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(MyParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#stateManagement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateManagement(MyParser.StateManagementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#expressionInBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInBody(MyParser.ExpressionInBodyContext ctx);
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
	 * Visit a parse tree produced by the {@code callFunctionPara}
	 * labeled alternative in {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunctionPara(MyParser.CallFunctionParaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallWithValue}
	 * labeled alternative in {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallWithValue(MyParser.MethodCallWithValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallWithListValue}
	 * labeled alternative in {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallWithListValue(MyParser.MethodCallWithListValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectLiteralArgumentList}
	 * labeled alternative in {@link MyParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralArgumentList(MyParser.ObjectLiteralArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withObjectPropertyArgumentList}
	 * labeled alternative in {@link MyParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithObjectPropertyArgumentList(MyParser.WithObjectPropertyArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withExpressionArgumentList}
	 * labeled alternative in {@link MyParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithExpressionArgumentList(MyParser.WithExpressionArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionEqualty}
	 * labeled alternative in {@link MyParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionEqualty(MyParser.ConditionEqualtyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionValue}
	 * labeled alternative in {@link MyParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionValue(MyParser.ConditionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(MyParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(MyParser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(MyParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierObjectProperty}
	 * labeled alternative in {@link MyParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierObjectProperty(MyParser.IdentifierObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importsObjectProperty}
	 * labeled alternative in {@link MyParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsObjectProperty(MyParser.ImportsObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exportsObjectProperty}
	 * labeled alternative in {@link MyParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportsObjectProperty(MyParser.ExportsObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dotPropertyAccessObjectProperty}
	 * labeled alternative in {@link MyParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotPropertyAccessObjectProperty(MyParser.DotPropertyAccessObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#propertyAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccess(MyParser.PropertyAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleDecStat}
	 * labeled alternative in {@link MyParser#functionDeclarationStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDecStat(MyParser.SimpleDecStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleArrayDecStat}
	 * labeled alternative in {@link MyParser#functionDeclarationStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleArrayDecStat(MyParser.SimpleArrayDecStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#normalfunctionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalfunctionDecl(MyParser.NormalfunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(MyParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paraWithType}
	 * labeled alternative in {@link MyParser#parametersType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaWithType(MyParser.ParaWithTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paraValue}
	 * labeled alternative in {@link MyParser#parametersType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaValue(MyParser.ParaValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paraHasAccessModifiers}
	 * labeled alternative in {@link MyParser#parametersContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaHasAccessModifiers(MyParser.ParaHasAccessModifiersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paraHasPropertyAccess}
	 * labeled alternative in {@link MyParser#parametersContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaHasPropertyAccess(MyParser.ParaHasPropertyAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(MyParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code values}
	 * labeled alternative in {@link MyParser#templatePropertytemplatePropertyclassRelationclassRelationfunctionCallfunctionCallfunctionCallargumentListargumentListargumentListconditionsconditionsobjectPropertyobjectPropertyobjectPropertyobjectPropertyfunctionDeclarationStatfunctionDeclarationStatparametersTypeparametersTypeparametersContentparametersContentassignmentassignmentassignmentassignmentprimitiveTypeprimitiveTypeprimitiveTypeprimitiveTypeprimitiveTypeprimitiveTypeprimitiveTypeprimitiveTypedirectivesStatmentdirectivesStatmentconditionExpressionconditionExpressionconditionExpressionifElseStatifElseStatifElseStatvariableDeclarationStatvariableDeclarationStatvariableDeclarationStatarrowFunctionarrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(MyParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(MyParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#subDotAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubDotAssignment(MyParser.SubDotAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dotAssignment}
	 * labeled alternative in {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotAssignment(MyParser.DotAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(MyParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatementIniti}
	 * labeled alternative in {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatementIniti(MyParser.AssignmentStatementInitiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleAssignment}
	 * labeled alternative in {@link MyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssignment(MyParser.SimpleAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#templateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateExpression(MyParser.TemplateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#eventBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(MyParser.EventBindingContext ctx);
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
	 * Visit a parse tree produced by {@link MyParser#simpleArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleArray(MyParser.SimpleArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(MyParser.MapContext ctx);
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
	 * Visit a parse tree produced by {@link MyParser#conditionStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionStat(MyParser.ConditionStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#tryStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStat(MyParser.TryStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#catchStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchStat(MyParser.CatchStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#operationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationExpr(MyParser.OperationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#questionCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionCondition(MyParser.QuestionConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#navigate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigate(MyParser.NavigateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#functionExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExp(MyParser.FunctionExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(MyParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MyParser.ExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link MyParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(MyParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifQuestionMark}
	 * labeled alternative in {@link MyParser#ifElseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfQuestionMark(MyParser.IfQuestionMarkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifReturn}
	 * labeled alternative in {@link MyParser#ifElseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfReturn(MyParser.IfReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link MyParser#ifElseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(MyParser.IfElseContext ctx);
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
	 * Visit a parse tree produced by {@link MyParser#newObjectFromClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObjectFromClass(MyParser.NewObjectFromClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#toStringNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToStringNode(MyParser.ToStringNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typedVariableDecl}
	 * labeled alternative in {@link MyParser#variableDeclarationStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedVariableDecl(MyParser.TypedVariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inferredVariableDecl}
	 * labeled alternative in {@link MyParser#variableDeclarationStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredVariableDecl(MyParser.InferredVariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectFromClass}
	 * labeled alternative in {@link MyParser#variableDeclarationStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFromClass(MyParser.ObjectFromClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(MyParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varArrowFunction}
	 * labeled alternative in {@link MyParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarArrowFunction(MyParser.VarArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eventHandlerArrowFunction}
	 * labeled alternative in {@link MyParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventHandlerArrowFunction(MyParser.EventHandlerArrowFunctionContext ctx);
}