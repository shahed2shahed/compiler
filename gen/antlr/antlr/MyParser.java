// Generated from C:/Users/ASUS/Desktop/compiler/src/antlr/antlr/MyParser.g4 by ANTLR 4.13.2
package antlr.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, CLICK=2, FROM=3, STYLE=4, LET=5, VAR=6, CONST=7, OF=8, ARRAY=9, 
		FUNCTION=10, IMPLEMENTS=11, IF=12, ELSE=13, RETURN=14, AS=15, AT=16, ROUTER=17, 
		NAVIGATE=18, COMPONENT=19, SELECTOR=20, STANDALONE=21, IMPORTS=22, TEMPLATE=23, 
		EXPORT=24, EXPORTS=25, INTERFACE=26, NGMODULE=27, INJECTABLE=28, CLASS=29, 
		TRY=30, CATCH=31, CONSOLE=32, ERROR=33, LOG=34, ANY=35, NUMBER=36, STRING_EX=37, 
		VOID=38, NULL=39, TOSTRING=40, NgFor=41, NgIf=42, BIT_OR=43, AND=44, OR=45, 
		NOT=46, EQUAL_EQUAL=47, EQUALTHIRD=48, NOT_EQUAL=49, NOT_EQUAL_EQUAL=50, 
		LT_EQUAL=51, GT_EQUAL=52, SQUARE_OPEN_BRACKET=53, SQUARE_CLOSE_BRACKET=54, 
		OPEN_BRACKET=55, CLOSE_BRACKET=56, CURLY_OPEN_BRACKET=57, CURLY_CLOSE_BRACKET=58, 
		DOUBLE_CURLY_OPEN_BRACKET=59, DOUBLE_CURLY_CLOSE_BRACKET=60, ARROW=61, 
		LT=62, GT=63, SLASH=64, DQUOT=65, QUOT=66, STRING=67, NUMBER_VAL=68, BOOLEAN=69, 
		AccessModifiers=70, BEHAVIORSUBJECT=71, SEMI_COLON=72, COMMA=73, COLON=74, 
		DOT=75, QUESTION_MARK=76, HASH_TAG=77, EQUAL=78, PLUS=79, MIN=80, MULT=81, 
		S_DOlOR=82, WS=83, NEWLINE=84, MultiLineComment=85, SingleLineComment=86, 
		IDENTIFIER=87, WS1=88, EQUAL1=89, DQUOT1=90, LET1=91, SEMI_COLON5=92, 
		OF1=93, ID1=94, DQUOT2=95, WS2=96, NUMBER_VAL1=97, EQUAL2=98, NULL1=99, 
		DQUOT3=100, BIT_OR1=101, AND1=102, OR1=103, NOT1=104, EQUAL_EQUAL1=105, 
		EQUAL_EQUAL2=106, NOT_EQUAL1=107, NOT_EQUAL2=108, LT_EQUAL1=109, GT_EQUAL1=110, 
		PLUS1=111, MIN1=112, MULT1=113, COMMA1=114, COLON1=115, DOT1=116, QUESTION_MARK1=117, 
		ARROW1=118, LT1=119, GT1=120, SQUARE_OPEN_BRACKET1=121, SQUARE_CLOSE_BRACKET1=122, 
		OPEN_BRACKET1=123, CLOSE_BRACKET1=124, CURLY_OPEN_BRACKET1=125, CURLY_CLOSE_BRACKET1=126, 
		ID2=127, DQUOT4=128, WS3=129, CLOSE_BRACKET2=130, NUMBER_VAL2=131, EQUAL3=132, 
		NOT2=133, PLUS2=134, MIN2=135, MULT2=136, DOT3=137, DQUOT5=138, ID3=139, 
		OPEN_BRACKET2=140, DQUOT6=141;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importStatment = 2, RULE_module = 3, 
		RULE_componentDeclaration = 4, RULE_componentBody = 5, RULE_componentEle = 6, 
		RULE_style = 7, RULE_templateProperty = 8, RULE_selectorProperty = 9, 
		RULE_standaloneProperty = 10, RULE_propertyFun = 11, RULE_propertyStat = 12, 
		RULE_importsProperty = 13, RULE_exportsProperty = 14, RULE_bootstrapProperty = 15, 
		RULE_classType = 16, RULE_classRelation = 17, RULE_classStatment = 18, 
		RULE_types = 19, RULE_brackets = 20, RULE_stateManagement = 21, RULE_expressionInBody = 22, 
		RULE_body = 23, RULE_print_error = 24, RULE_print_stat = 25, RULE_functionCall = 26, 
		RULE_argumentList = 27, RULE_conditions = 28, RULE_returnType = 29, RULE_returnStat = 30, 
		RULE_objectLiteral = 31, RULE_objectProperty = 32, RULE_propertyAccess = 33, 
		RULE_functionDeclarationStat = 34, RULE_normalfunctionDecl = 35, RULE_functionDeclaration = 36, 
		RULE_parametersType = 37, RULE_parametersContent = 38, RULE_parameters = 39, 
		RULE_values = 40, RULE_operations = 41, RULE_subDotAssignment = 42, RULE_assignment = 43, 
		RULE_templateExpression = 44, RULE_eventBinding = 45, RULE_htmlDeclare = 46, 
		RULE_normalHtmlTag = 47, RULE_selfClosingTag = 48, RULE_openTag = 49, 
		RULE_closeTag = 50, RULE_simpleArray = 51, RULE_map = 52, RULE_type = 53, 
		RULE_primitiveType = 54, RULE_arrayStringType = 55, RULE_arrayNumberType = 56, 
		RULE_marks = 57, RULE_arrayDeclaration = 58, RULE_conditionStat = 59, 
		RULE_tryStat = 60, RULE_catchStat = 61, RULE_operationExpr = 62, RULE_questionCondition = 63, 
		RULE_navigate = 64, RULE_functionExp = 65, RULE_content = 66, RULE_expression = 67, 
		RULE_directivesStatment = 68, RULE_ngForValue = 69, RULE_ngForExpression = 70, 
		RULE_ngIfValue = 71, RULE_conditionExpression = 72, RULE_equalOperation = 73, 
		RULE_logicalTerm = 74, RULE_ifStat = 75, RULE_ifElseStat = 76, RULE_variable_type = 77, 
		RULE_unionType = 78, RULE_newObjectFromClass = 79, RULE_toStringNode = 80, 
		RULE_variableDeclarationStat = 81, RULE_variableDeclaration = 82, RULE_arrowFunction = 83;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStatment", "module", "componentDeclaration", 
			"componentBody", "componentEle", "style", "templateProperty", "selectorProperty", 
			"standaloneProperty", "propertyFun", "propertyStat", "importsProperty", 
			"exportsProperty", "bootstrapProperty", "classType", "classRelation", 
			"classStatment", "types", "brackets", "stateManagement", "expressionInBody", 
			"body", "print_error", "print_stat", "functionCall", "argumentList", 
			"conditions", "returnType", "returnStat", "objectLiteral", "objectProperty", 
			"propertyAccess", "functionDeclarationStat", "normalfunctionDecl", "functionDeclaration", 
			"parametersType", "parametersContent", "parameters", "values", "operations", 
			"subDotAssignment", "assignment", "templateExpression", "eventBinding", 
			"htmlDeclare", "normalHtmlTag", "selfClosingTag", "openTag", "closeTag", 
			"simpleArray", "map", "type", "primitiveType", "arrayStringType", "arrayNumberType", 
			"marks", "arrayDeclaration", "conditionStat", "tryStat", "catchStat", 
			"operationExpr", "questionCondition", "navigate", "functionExp", "content", 
			"expression", "directivesStatment", "ngForValue", "ngForExpression", 
			"ngIfValue", "conditionExpression", "equalOperation", "logicalTerm", 
			"ifStat", "ifElseStat", "variable_type", "unionType", "newObjectFromClass", 
			"toStringNode", "variableDeclarationStat", "variableDeclaration", "arrowFunction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'click'", "'from'", "'styles'", null, "'var'", "'const'", 
			null, "'Array'", "'function'", "'implements'", "'if'", "'else'", "'return'", 
			"'as'", "'@'", "'router'", "'navigate'", "'@Component'", "'selector'", 
			"'standalone'", "'imports'", "'template'", "'export'", "'exports'", "'interface'", 
			"'@NgModule'", "'@Injectable'", "'class'", "'try'", "'catch'", "'console'", 
			"'error'", "'log'", "'any'", "'number'", "'string'", "'void'", null, 
			"'toISOString'", "'*ngFor'", "'*ngIf'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'{{'", 
			"'}}'", null, null, null, "'/'", null, "'`'", null, null, null, "'private'", 
			"'BehaviorSubject'", null, null, null, null, null, "'#'", null, null, 
			null, null, "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "CLICK", "FROM", "STYLE", "LET", "VAR", "CONST", "OF", 
			"ARRAY", "FUNCTION", "IMPLEMENTS", "IF", "ELSE", "RETURN", "AS", "AT", 
			"ROUTER", "NAVIGATE", "COMPONENT", "SELECTOR", "STANDALONE", "IMPORTS", 
			"TEMPLATE", "EXPORT", "EXPORTS", "INTERFACE", "NGMODULE", "INJECTABLE", 
			"CLASS", "TRY", "CATCH", "CONSOLE", "ERROR", "LOG", "ANY", "NUMBER", 
			"STRING_EX", "VOID", "NULL", "TOSTRING", "NgFor", "NgIf", "BIT_OR", "AND", 
			"OR", "NOT", "EQUAL_EQUAL", "EQUALTHIRD", "NOT_EQUAL", "NOT_EQUAL_EQUAL", 
			"LT_EQUAL", "GT_EQUAL", "SQUARE_OPEN_BRACKET", "SQUARE_CLOSE_BRACKET", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "CURLY_OPEN_BRACKET", "CURLY_CLOSE_BRACKET", 
			"DOUBLE_CURLY_OPEN_BRACKET", "DOUBLE_CURLY_CLOSE_BRACKET", "ARROW", "LT", 
			"GT", "SLASH", "DQUOT", "QUOT", "STRING", "NUMBER_VAL", "BOOLEAN", "AccessModifiers", 
			"BEHAVIORSUBJECT", "SEMI_COLON", "COMMA", "COLON", "DOT", "QUESTION_MARK", 
			"HASH_TAG", "EQUAL", "PLUS", "MIN", "MULT", "S_DOlOR", "WS", "NEWLINE", 
			"MultiLineComment", "SingleLineComment", "IDENTIFIER", "WS1", "EQUAL1", 
			"DQUOT1", "LET1", "SEMI_COLON5", "OF1", "ID1", "DQUOT2", "WS2", "NUMBER_VAL1", 
			"EQUAL2", "NULL1", "DQUOT3", "BIT_OR1", "AND1", "OR1", "NOT1", "EQUAL_EQUAL1", 
			"EQUAL_EQUAL2", "NOT_EQUAL1", "NOT_EQUAL2", "LT_EQUAL1", "GT_EQUAL1", 
			"PLUS1", "MIN1", "MULT1", "COMMA1", "COLON1", "DOT1", "QUESTION_MARK1", 
			"ARROW1", "LT1", "GT1", "SQUARE_OPEN_BRACKET1", "SQUARE_CLOSE_BRACKET1", 
			"OPEN_BRACKET1", "CLOSE_BRACKET1", "CURLY_OPEN_BRACKET1", "CURLY_CLOSE_BRACKET1", 
			"ID2", "DQUOT4", "WS3", "CLOSE_BRACKET2", "NUMBER_VAL2", "EQUAL3", "NOT2", 
			"PLUS2", "MIN2", "MULT2", "DOT3", "DQUOT5", "ID3", "OPEN_BRACKET2", "DQUOT6"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 419954690L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(168);
				statement();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ImportStatmentContext importStatment() {
			return getRuleContext(ImportStatmentContext.class,0);
		}
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public ClassStatmentContext classStatment() {
			return getRuleContext(ClassStatmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				importStatment();
				}
				break;
			case COMPONENT:
			case NGMODULE:
			case INJECTABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				componentDeclaration();
				}
				break;
			case EXPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				classStatment();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				functionCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatmentContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(MyParser.IMPORT, 0); }
		public TerminalNode CURLY_OPEN_BRACKET() { return getToken(MyParser.CURLY_OPEN_BRACKET, 0); }
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
		public TerminalNode FROM() { return getToken(MyParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(MyParser.STRING, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public TerminalNode BEHAVIORSUBJECT() { return getToken(MyParser.BEHAVIORSUBJECT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public ImportStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterImportStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitImportStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitImportStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatmentContext importStatment() throws RecognitionException {
		ImportStatmentContext _localctx = new ImportStatmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IMPORT);
			setState(181);
			match(CURLY_OPEN_BRACKET);
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==BEHAVIORSUBJECT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(183);
				match(COMMA);
				setState(184);
				match(IDENTIFIER);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(CURLY_CLOSE_BRACKET);
			setState(191);
			match(FROM);
			setState(192);
			match(STRING);
			setState(193);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(MyParser.COMPONENT, 0); }
		public TerminalNode NGMODULE() { return getToken(MyParser.NGMODULE, 0); }
		public TerminalNode INJECTABLE() { return getToken(MyParser.INJECTABLE, 0); }
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 403177472L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode CURLY_OPEN_BRACKET() { return getToken(MyParser.CURLY_OPEN_BRACKET, 0); }
		public ComponentBodyContext componentBody() {
			return getRuleContext(ComponentBodyContext.class,0);
		}
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(MyParser.COMMA, 0); }
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			module();
			setState(198);
			match(OPEN_BRACKET);
			setState(199);
			match(CURLY_OPEN_BRACKET);
			setState(200);
			componentBody();
			setState(201);
			match(CURLY_CLOSE_BRACKET);
			setState(202);
			match(CLOSE_BRACKET);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(203);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentBodyContext extends ParserRuleContext {
		public List<ComponentEleContext> componentEle() {
			return getRuleContexts(ComponentEleContext.class);
		}
		public ComponentEleContext componentEle(int i) {
			return getRuleContext(ComponentEleContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public ComponentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterComponentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitComponentBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitComponentBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentBodyContext componentBody() throws RecognitionException {
		ComponentBodyContext _localctx = new ComponentBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			componentEle();
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					match(COMMA);
					setState(208);
					componentEle();
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(214);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentEleContext extends ParserRuleContext {
		public SelectorPropertyContext selectorProperty() {
			return getRuleContext(SelectorPropertyContext.class,0);
		}
		public StandalonePropertyContext standaloneProperty() {
			return getRuleContext(StandalonePropertyContext.class,0);
		}
		public ImportsPropertyContext importsProperty() {
			return getRuleContext(ImportsPropertyContext.class,0);
		}
		public ExportsPropertyContext exportsProperty() {
			return getRuleContext(ExportsPropertyContext.class,0);
		}
		public BootstrapPropertyContext bootstrapProperty() {
			return getRuleContext(BootstrapPropertyContext.class,0);
		}
		public TemplatePropertyContext templateProperty() {
			return getRuleContext(TemplatePropertyContext.class,0);
		}
		public ComponentEleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentEle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterComponentEle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitComponentEle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitComponentEle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentEleContext componentEle() throws RecognitionException {
		ComponentEleContext _localctx = new ComponentEleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_componentEle);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				selectorProperty();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				standaloneProperty();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				importsProperty();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				exportsProperty();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				bootstrapProperty();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				templateProperty();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(MyParser.STYLE, 0); }
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(MyParser.SQUARE_OPEN_BRACKET, 0); }
		public List<TerminalNode> QUOT() { return getTokens(MyParser.QUOT); }
		public TerminalNode QUOT(int i) {
			return getToken(MyParser.QUOT, i);
		}
		public TerminalNode STRING() { return getToken(MyParser.STRING, 0); }
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(MyParser.SQUARE_CLOSE_BRACKET, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(STYLE);
			setState(226);
			match(COLON);
			setState(227);
			match(SQUARE_OPEN_BRACKET);
			setState(228);
			match(QUOT);
			setState(229);
			match(STRING);
			setState(230);
			match(QUOT);
			setState(231);
			match(SQUARE_CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplatePropertyContext extends ParserRuleContext {
		public TemplatePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateProperty; }
	 
		public TemplatePropertyContext() { }
		public void copyFrom(TemplatePropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlUrlContext extends TemplatePropertyContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(MyParser.STRING, 0); }
		public TemplateHtmlUrlContext(TemplatePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTemplateHtmlUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTemplateHtmlUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitTemplateHtmlUrl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlDeclarationContext extends TemplatePropertyContext {
		public TerminalNode TEMPLATE() { return getToken(MyParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public List<TerminalNode> QUOT() { return getTokens(MyParser.QUOT); }
		public TerminalNode QUOT(int i) {
			return getToken(MyParser.QUOT, i);
		}
		public List<HtmlDeclareContext> htmlDeclare() {
			return getRuleContexts(HtmlDeclareContext.class);
		}
		public HtmlDeclareContext htmlDeclare(int i) {
			return getRuleContext(HtmlDeclareContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(MyParser.COMMA, 0); }
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public TemplateHtmlDeclarationContext(TemplatePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTemplateHtmlDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTemplateHtmlDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitTemplateHtmlDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatePropertyContext templateProperty() throws RecognitionException {
		TemplatePropertyContext _localctx = new TemplatePropertyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_templateProperty);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE:
				_localctx = new TemplateHtmlDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(TEMPLATE);
				setState(234);
				match(COLON);
				setState(235);
				match(QUOT);
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(236);
					htmlDeclare();
					}
					}
					setState(239); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LT );
				setState(241);
				match(QUOT);
				setState(244);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(242);
					match(COMMA);
					setState(243);
					style();
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				_localctx = new TemplateHtmlUrlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(IDENTIFIER);
				setState(247);
				match(COLON);
				setState(248);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorPropertyContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(MyParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(MyParser.STRING, 0); }
		public SelectorPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterSelectorProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitSelectorProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitSelectorProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorPropertyContext selectorProperty() throws RecognitionException {
		SelectorPropertyContext _localctx = new SelectorPropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectorProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(SELECTOR);
			setState(252);
			match(COLON);
			setState(253);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StandalonePropertyContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(MyParser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public TerminalNode BOOLEAN() { return getToken(MyParser.BOOLEAN, 0); }
		public StandalonePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStandaloneProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStandaloneProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStandaloneProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandalonePropertyContext standaloneProperty() throws RecognitionException {
		StandalonePropertyContext _localctx = new StandalonePropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_standaloneProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(STANDALONE);
			setState(256);
			match(COLON);
			setState(257);
			match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyFunContext extends ParserRuleContext {
		public PropertyFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPropertyFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPropertyFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitPropertyFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyFunContext propertyFun() throws RecognitionException {
		PropertyFunContext _localctx = new PropertyFunContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_propertyFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyStatContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(MyParser.SQUARE_OPEN_BRACKET, 0); }
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(MyParser.SQUARE_CLOSE_BRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public PropertyFunContext propertyFun() {
			return getRuleContext(PropertyFunContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public PropertyStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPropertyStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPropertyStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitPropertyStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyStatContext propertyStat() throws RecognitionException {
		PropertyStatContext _localctx = new PropertyStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_propertyStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(COLON);
			setState(262);
			match(SQUARE_OPEN_BRACKET);
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(263);
				match(IDENTIFIER);
				}
				break;
			case SQUARE_CLOSE_BRACKET:
			case COMMA:
				{
				setState(264);
				propertyFun();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(267);
				match(COMMA);
				setState(268);
				match(IDENTIFIER);
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(SQUARE_CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsPropertyContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(MyParser.IMPORTS, 0); }
		public PropertyStatContext propertyStat() {
			return getRuleContext(PropertyStatContext.class,0);
		}
		public ImportsPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importsProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterImportsProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitImportsProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitImportsProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsPropertyContext importsProperty() throws RecognitionException {
		ImportsPropertyContext _localctx = new ImportsPropertyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_importsProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(IMPORTS);
			setState(277);
			propertyStat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportsPropertyContext extends ParserRuleContext {
		public TerminalNode EXPORTS() { return getToken(MyParser.EXPORTS, 0); }
		public PropertyStatContext propertyStat() {
			return getRuleContext(PropertyStatContext.class,0);
		}
		public ExportsPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportsProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExportsProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExportsProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitExportsProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportsPropertyContext exportsProperty() throws RecognitionException {
		ExportsPropertyContext _localctx = new ExportsPropertyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exportsProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(EXPORTS);
			setState(280);
			propertyStat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BootstrapPropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public PropertyStatContext propertyStat() {
			return getRuleContext(PropertyStatContext.class,0);
		}
		public BootstrapPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bootstrapProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterBootstrapProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitBootstrapProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitBootstrapProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BootstrapPropertyContext bootstrapProperty() throws RecognitionException {
		BootstrapPropertyContext _localctx = new BootstrapPropertyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bootstrapProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(IDENTIFIER);
			setState(283);
			propertyStat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(MyParser.IMPLEMENTS, 0); }
		public TerminalNode INTERFACE() { return getToken(MyParser.INTERFACE, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classType);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPLEMENTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(IMPLEMENTS);
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(INTERFACE);
				}
				break;
			case LET:
			case VAR:
			case CONST:
			case AccessModifiers:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				variable_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassRelationContext extends ParserRuleContext {
		public ClassRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classRelation; }
	 
		public ClassRelationContext() { }
		public void copyFrom(ClassRelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommonRelationContext extends ClassRelationContext {
		public TerminalNode CLASS() { return getToken(MyParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public CommonRelationContext(ClassRelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCommonRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCommonRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitCommonRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OtherRelationContext extends ClassRelationContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public OtherRelationContext(ClassRelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterOtherRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitOtherRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitOtherRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassRelationContext classRelation() throws RecognitionException {
		ClassRelationContext _localctx = new ClassRelationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classRelation);
		int _la;
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				_localctx = new CommonRelationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(CLASS);
				setState(291);
				match(IDENTIFIER);
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(292);
					classType();
					setState(293);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case LET:
			case VAR:
			case CONST:
			case IMPLEMENTS:
			case INTERFACE:
			case AccessModifiers:
				_localctx = new OtherRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				classType();
				setState(298);
				match(IDENTIFIER);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(299);
					match(COLON);
					setState(300);
					match(IDENTIFIER);
					setState(301);
					match(EQUAL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassStatmentContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(MyParser.EXPORT, 0); }
		public ClassRelationContext classRelation() {
			return getRuleContext(ClassRelationContext.class,0);
		}
		public TerminalNode CURLY_OPEN_BRACKET() { return getToken(MyParser.CURLY_OPEN_BRACKET, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
		public ClassStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterClassStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitClassStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitClassStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStatmentContext classStatment() throws RecognitionException {
		ClassStatmentContext _localctx = new ClassStatmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classStatment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(EXPORT);
			setState(307);
			classRelation();
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(308);
				match(CURLY_OPEN_BRACKET);
				}
				break;
			}
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(311);
					body();
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_CLOSE_BRACKET) {
				{
				setState(317);
				match(CURLY_CLOSE_BRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypesContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MarksContext marks() {
			return getRuleContext(MarksContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public HtmlDeclareContext htmlDeclare() {
			return getRuleContext(HtmlDeclareContext.class,0);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_types);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				marks();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				eventBinding();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(324);
				htmlDeclare();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BracketsContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(MyParser.SQUARE_OPEN_BRACKET, 0); }
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(MyParser.SQUARE_CLOSE_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public BracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketsContext brackets() throws RecognitionException {
		BracketsContext _localctx = new BracketsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_brackets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(OPEN_BRACKET);
			setState(328);
			match(SQUARE_OPEN_BRACKET);
			setState(329);
			match(SQUARE_CLOSE_BRACKET);
			setState(330);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateManagementContext extends ParserRuleContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public TerminalNode S_DOlOR() { return getToken(MyParser.S_DOlOR, 0); }
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public TerminalNode BEHAVIORSUBJECT() { return getToken(MyParser.BEHAVIORSUBJECT, 0); }
		public TerminalNode LT() { return getToken(MyParser.LT, 0); }
		public SimpleArrayContext simpleArray() {
			return getRuleContext(SimpleArrayContext.class,0);
		}
		public TerminalNode GT() { return getToken(MyParser.GT, 0); }
		public BracketsContext brackets() {
			return getRuleContext(BracketsContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public StateManagementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateManagement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStateManagement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStateManagement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStateManagement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateManagementContext stateManagement() throws RecognitionException {
		StateManagementContext _localctx = new StateManagementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stateManagement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			variable_type();
			setState(333);
			match(IDENTIFIER);
			setState(334);
			match(S_DOlOR);
			setState(335);
			match(EQUAL);
			setState(336);
			match(IDENTIFIER);
			setState(337);
			match(BEHAVIORSUBJECT);
			setState(338);
			match(LT);
			setState(339);
			simpleArray();
			setState(340);
			match(GT);
			setState(341);
			brackets();
			setState(342);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionInBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionInBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExpressionInBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExpressionInBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitExpressionInBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionInBodyContext expressionInBody() throws RecognitionException {
		ExpressionInBodyContext _localctx = new ExpressionInBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionInBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public Print_statContext print_stat() {
			return getRuleContext(Print_statContext.class,0);
		}
		public Print_errorContext print_error() {
			return getRuleContext(Print_errorContext.class,0);
		}
		public ExpressionInBodyContext expressionInBody() {
			return getRuleContext(ExpressionInBodyContext.class,0);
		}
		public StateManagementContext stateManagement() {
			return getRuleContext(StateManagementContext.class,0);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_body);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				print_stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				print_error();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				expressionInBody();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(350);
				stateManagement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(351);
				returnStat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_errorContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(MyParser.CONSOLE, 0); }
		public TerminalNode DOT() { return getToken(MyParser.DOT, 0); }
		public TerminalNode ERROR() { return getToken(MyParser.ERROR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public Print_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPrint_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPrint_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitPrint_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_errorContext print_error() throws RecognitionException {
		Print_errorContext _localctx = new Print_errorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_print_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(CONSOLE);
			setState(355);
			match(DOT);
			setState(356);
			match(ERROR);
			setState(357);
			match(OPEN_BRACKET);
			setState(358);
			values();
			setState(359);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_statContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(MyParser.CONSOLE, 0); }
		public TerminalNode DOT() { return getToken(MyParser.DOT, 0); }
		public TerminalNode LOG() { return getToken(MyParser.LOG, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public Print_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPrint_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPrint_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitPrint_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statContext print_stat() throws RecognitionException {
		Print_statContext _localctx = new Print_statContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_print_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(CONSOLE);
			setState(362);
			match(DOT);
			setState(363);
			match(LOG);
			setState(364);
			match(OPEN_BRACKET);
			setState(365);
			values();
			setState(366);
			match(CLOSE_BRACKET);
			setState(367);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionParaContext extends FunctionCallContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public TerminalNode DOT() { return getToken(MyParser.DOT, 0); }
		public TerminalNode CATCH() { return getToken(MyParser.CATCH, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode ARROW() { return getToken(MyParser.ARROW, 0); }
		public Print_errorContext print_error() {
			return getRuleContext(Print_errorContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public CallFunctionParaContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCallFunctionPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCallFunctionPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitCallFunctionPara(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallWithValueContext extends FunctionCallContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode AS() { return getToken(MyParser.AS, 0); }
		public SimpleArrayContext simpleArray() {
			return getRuleContext(SimpleArrayContext.class,0);
		}
		public MethodCallWithValueContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterMethodCallWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitMethodCallWithValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMethodCallWithValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallWithListValueContext extends FunctionCallContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public MethodCallWithListValueContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterMethodCallWithListValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitMethodCallWithListValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMethodCallWithListValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionCall);
		int _la;
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new CallFunctionParaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(IDENTIFIER);
				setState(370);
				parameters();
				setState(371);
				match(DOT);
				setState(372);
				match(CATCH);
				setState(373);
				match(OPEN_BRACKET);
				setState(374);
				parameters();
				setState(375);
				match(ARROW);
				setState(376);
				print_error();
				setState(377);
				match(CLOSE_BRACKET);
				setState(378);
				match(SEMI_COLON);
				}
				break;
			case 2:
				_localctx = new MethodCallWithValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				propertyAccess();
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(381);
					match(IDENTIFIER);
					}
				}

				setState(384);
				parameters();
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(385);
					match(AS);
					setState(386);
					simpleArray();
					}
				}

				setState(389);
				match(SEMI_COLON);
				}
				break;
			case 3:
				_localctx = new MethodCallWithListValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				propertyAccess();
				setState(392);
				match(OPEN_BRACKET);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 189157853360034016L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1048591L) != 0)) {
					{
					setState(393);
					argumentList();
					}
				}

				setState(396);
				match(CLOSE_BRACKET);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_COLON) {
					{
					setState(397);
					match(SEMI_COLON);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	 
		public ArgumentListContext() { }
		public void copyFrom(ArgumentListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WithObjectPropertyArgumentListContext extends ArgumentListContext {
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(MyParser.SQUARE_OPEN_BRACKET, 0); }
		public ObjectPropertyContext objectProperty() {
			return getRuleContext(ObjectPropertyContext.class,0);
		}
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(MyParser.SQUARE_CLOSE_BRACKET, 0); }
		public WithObjectPropertyArgumentListContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterWithObjectPropertyArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitWithObjectPropertyArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitWithObjectPropertyArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralArgumentListContext extends ArgumentListContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralArgumentListContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterObjectLiteralArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitObjectLiteralArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitObjectLiteralArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WithExpressionArgumentListContext extends ArgumentListContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public WithExpressionArgumentListContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterWithExpressionArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitWithExpressionArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitWithExpressionArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_argumentList);
		int _la;
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new ObjectLiteralArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				objectLiteral();
				}
				break;
			case 2:
				_localctx = new WithObjectPropertyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(SQUARE_OPEN_BRACKET);
				setState(404);
				objectProperty();
				setState(405);
				match(SQUARE_CLOSE_BRACKET);
				}
				break;
			case 3:
				_localctx = new WithExpressionArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				expression();
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(408);
					match(COMMA);
					setState(409);
					expression();
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionsContext extends ParserRuleContext {
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
	 
		public ConditionsContext() { }
		public void copyFrom(ConditionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionValueContext extends ConditionsContext {
		public List<PropertyAccessContext> propertyAccess() {
			return getRuleContexts(PropertyAccessContext.class);
		}
		public PropertyAccessContext propertyAccess(int i) {
			return getRuleContext(PropertyAccessContext.class,i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(MyParser.ARROW, 0); }
		public TerminalNode COMMA() { return getToken(MyParser.COMMA, 0); }
		public List<TerminalNode> NUMBER_VAL() { return getTokens(MyParser.NUMBER_VAL); }
		public TerminalNode NUMBER_VAL(int i) {
			return getToken(MyParser.NUMBER_VAL, i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public ConditionValueContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterConditionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitConditionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitConditionValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionEqualtyContext extends ConditionsContext {
		public List<PropertyAccessContext> propertyAccess() {
			return getRuleContexts(PropertyAccessContext.class);
		}
		public PropertyAccessContext propertyAccess(int i) {
			return getRuleContext(PropertyAccessContext.class,i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode ARROW() { return getToken(MyParser.ARROW, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public TerminalNode EQUALTHIRD() { return getToken(MyParser.EQUALTHIRD, 0); }
		public TerminalNode NOT_EQUAL_EQUAL() { return getToken(MyParser.NOT_EQUAL_EQUAL, 0); }
		public ConditionEqualtyContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterConditionEqualty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitConditionEqualty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitConditionEqualty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_conditions);
		int _la;
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new ConditionEqualtyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				propertyAccess();
				setState(418);
				match(OPEN_BRACKET);
				setState(419);
				match(IDENTIFIER);
				setState(420);
				match(ARROW);
				setState(421);
				propertyAccess();
				setState(422);
				_la = _input.LA(1);
				if ( !(_la==EQUALTHIRD || _la==NOT_EQUAL_EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(423);
				propertyAccess();
				setState(424);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				_localctx = new ConditionValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				propertyAccess();
				setState(427);
				match(OPEN_BRACKET);
				setState(428);
				parameters();
				setState(429);
				match(ARROW);
				setState(430);
				propertyAccess();
				setState(431);
				parameters();
				setState(432);
				match(COMMA);
				setState(433);
				match(NUMBER_VAL);
				setState(434);
				match(CLOSE_BRACKET);
				setState(435);
				operations();
				setState(436);
				match(NUMBER_VAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnTypeContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_returnType);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				argumentList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				conditions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				values();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MyParser.RETURN, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitReturnStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(RETURN);
			setState(446);
			returnType();
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(447);
				match(SEMI_COLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode CURLY_OPEN_BRACKET() { return getToken(MyParser.CURLY_OPEN_BRACKET, 0); }
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(CURLY_OPEN_BRACKET);
			setState(451);
			objectProperty();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(452);
				match(COMMA);
				setState(453);
				objectProperty();
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
			match(CURLY_CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropertyContext extends ParserRuleContext {
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
	 
		public ObjectPropertyContext() { }
		public void copyFrom(ObjectPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportsObjectPropertyContext extends ObjectPropertyContext {
		public TerminalNode IMPORTS() { return getToken(MyParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ImportsObjectPropertyContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterImportsObjectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitImportsObjectProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitImportsObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportsObjectPropertyContext extends ObjectPropertyContext {
		public TerminalNode EXPORTS() { return getToken(MyParser.EXPORTS, 0); }
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExportsObjectPropertyContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExportsObjectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExportsObjectProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitExportsObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotPropertyAccessObjectPropertyContext extends ObjectPropertyContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(MyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MyParser.DOT, i);
		}
		public DotPropertyAccessObjectPropertyContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterDotPropertyAccessObjectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitDotPropertyAccessObjectProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitDotPropertyAccessObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierObjectPropertyContext extends ObjectPropertyContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierObjectPropertyContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIdentifierObjectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIdentifierObjectProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitIdentifierObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_objectProperty);
		int _la;
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new IdentifierObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				match(IDENTIFIER);
				setState(462);
				match(COLON);
				setState(463);
				expression();
				}
				break;
			case 2:
				_localctx = new ImportsObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(IMPORTS);
				setState(465);
				match(COLON);
				setState(466);
				expression();
				}
				break;
			case 3:
				_localctx = new ExportsObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				match(EXPORTS);
				setState(468);
				match(COLON);
				setState(469);
				expression();
				}
				break;
			case 4:
				_localctx = new DotPropertyAccessObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(470);
					match(DOT);
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(476);
				propertyAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(MyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MyParser.DOT, i);
		}
		public List<TerminalNode> S_DOlOR() { return getTokens(MyParser.S_DOlOR); }
		public TerminalNode S_DOlOR(int i) {
			return getToken(MyParser.S_DOlOR, i);
		}
		public List<TerminalNode> SQUARE_OPEN_BRACKET() { return getTokens(MyParser.SQUARE_OPEN_BRACKET); }
		public TerminalNode SQUARE_OPEN_BRACKET(int i) {
			return getToken(MyParser.SQUARE_OPEN_BRACKET, i);
		}
		public List<TerminalNode> SQUARE_CLOSE_BRACKET() { return getTokens(MyParser.SQUARE_CLOSE_BRACKET); }
		public TerminalNode SQUARE_CLOSE_BRACKET(int i) {
			return getToken(MyParser.SQUARE_CLOSE_BRACKET, i);
		}
		public PropertyAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPropertyAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPropertyAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitPropertyAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAccessContext propertyAccess() throws RecognitionException {
		PropertyAccessContext _localctx = new PropertyAccessContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_propertyAccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(IDENTIFIER);
			setState(492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(480);
					match(DOT);
					setState(481);
					match(IDENTIFIER);
					setState(483);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(482);
						match(S_DOlOR);
						}
						break;
					}
					setState(488);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(485);
						match(SQUARE_OPEN_BRACKET);
						setState(486);
						match(IDENTIFIER);
						setState(487);
						match(SQUARE_CLOSE_BRACKET);
						}
						break;
					}
					}
					} 
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationStatContext extends ParserRuleContext {
		public FunctionDeclarationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarationStat; }
	 
		public FunctionDeclarationStatContext() { }
		public void copyFrom(FunctionDeclarationStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleDecStatContext extends FunctionDeclarationStatContext {
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public TerminalNode FUNCTION() { return getToken(MyParser.FUNCTION, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public SimpleDecStatContext(FunctionDeclarationStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterSimpleDecStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitSimpleDecStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitSimpleDecStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleArrayDecStatContext extends FunctionDeclarationStatContext {
		public TerminalNode S_DOlOR() { return getToken(MyParser.S_DOlOR, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode LT() { return getToken(MyParser.LT, 0); }
		public SimpleArrayContext simpleArray() {
			return getRuleContext(SimpleArrayContext.class,0);
		}
		public TerminalNode GT() { return getToken(MyParser.GT, 0); }
		public SimpleArrayDecStatContext(FunctionDeclarationStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterSimpleArrayDecStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitSimpleArrayDecStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitSimpleArrayDecStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationStatContext functionDeclarationStat() throws RecognitionException {
		FunctionDeclarationStatContext _localctx = new FunctionDeclarationStatContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionDeclarationStat);
		int _la;
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
			case CURLY_OPEN_BRACKET:
			case COLON:
			case EQUAL:
				_localctx = new SimpleDecStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(495);
					match(EQUAL);
					setState(496);
					match(FUNCTION);
					}
				}

				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(499);
					parameters();
					}
				}

				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(502);
					match(COLON);
					setState(503);
					unionType();
					}
				}

				}
				break;
			case S_DOlOR:
				_localctx = new SimpleArrayDecStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(S_DOlOR);
				setState(507);
				parameters();
				setState(508);
				match(COLON);
				setState(509);
				match(IDENTIFIER);
				setState(510);
				match(LT);
				setState(511);
				simpleArray();
				setState(512);
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NormalfunctionDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public FunctionDeclarationStatContext functionDeclarationStat() {
			return getRuleContext(FunctionDeclarationStatContext.class,0);
		}
		public TerminalNode CURLY_OPEN_BRACKET() { return getToken(MyParser.CURLY_OPEN_BRACKET, 0); }
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
		public TerminalNode FUNCTION() { return getToken(MyParser.FUNCTION, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public NormalfunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalfunctionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNormalfunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNormalfunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNormalfunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalfunctionDeclContext normalfunctionDecl() throws RecognitionException {
		NormalfunctionDeclContext _localctx = new NormalfunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_normalfunctionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				setState(516);
				match(FUNCTION);
				}
				break;
			case LET:
			case VAR:
			case CONST:
			case AccessModifiers:
				{
				setState(517);
				variable_type();
				}
				break;
			case IDENTIFIER:
				break;
			default:
				break;
			}
			setState(520);
			match(IDENTIFIER);
			setState(521);
			functionDeclarationStat();
			setState(522);
			match(CURLY_OPEN_BRACKET);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 189157857655018720L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1048591L) != 0)) {
				{
				{
				setState(523);
				body();
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
			match(CURLY_CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public NormalfunctionDeclContext normalfunctionDecl() {
			return getRuleContext(NormalfunctionDeclContext.class,0);
		}
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functionDeclaration);
		try {
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				normalfunctionDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				arrowFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersTypeContext extends ParserRuleContext {
		public ParametersTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersType; }
	 
		public ParametersTypeContext() { }
		public void copyFrom(ParametersTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParaValueContext extends ParametersTypeContext {
		public List<TerminalNode> EQUAL() { return getTokens(MyParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(MyParser.EQUAL, i);
		}
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(MyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MyParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ParaValueContext(ParametersTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterParaValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitParaValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitParaValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParaWithTypeContext extends ParametersTypeContext {
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(MyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MyParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> AccessModifiers() { return getTokens(MyParser.AccessModifiers); }
		public TerminalNode AccessModifiers(int i) {
			return getToken(MyParser.AccessModifiers, i);
		}
		public ParaWithTypeContext(ParametersTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterParaWithType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitParaWithType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitParaWithType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersTypeContext parametersType() throws RecognitionException {
		ParametersTypeContext _localctx = new ParametersTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parametersType);
		int _la;
		try {
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_BRACKET:
			case AccessModifiers:
			case COMMA:
			case IDENTIFIER:
				_localctx = new ParaWithTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(535);
					match(COMMA);
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AccessModifiers) {
						{
						setState(536);
						match(AccessModifiers);
						}
					}

					setState(539);
					match(IDENTIFIER);
					setState(540);
					match(COLON);
					setState(541);
					type();
					}
					}
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EQUAL:
				_localctx = new ParaValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(EQUAL);
				setState(548);
				values();
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(549);
					match(COMMA);
					setState(550);
					match(IDENTIFIER);
					setState(551);
					match(COLON);
					setState(552);
					type();
					setState(553);
					match(EQUAL);
					setState(554);
					values();
					}
					}
					setState(560);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContentContext extends ParserRuleContext {
		public ParametersContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersContent; }
	 
		public ParametersContentContext() { }
		public void copyFrom(ParametersContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParaHasAccessModifiersContext extends ParametersContentContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode AccessModifiers() { return getToken(MyParser.AccessModifiers, 0); }
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParametersTypeContext parametersType() {
			return getRuleContext(ParametersTypeContext.class,0);
		}
		public ParaHasAccessModifiersContext(ParametersContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterParaHasAccessModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitParaHasAccessModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitParaHasAccessModifiers(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParaHasPropertyAccessContext extends ParametersContentContext {
		public List<PropertyAccessContext> propertyAccess() {
			return getRuleContexts(PropertyAccessContext.class);
		}
		public PropertyAccessContext propertyAccess(int i) {
			return getRuleContext(PropertyAccessContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public ParaHasPropertyAccessContext(ParametersContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterParaHasPropertyAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitParaHasPropertyAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitParaHasPropertyAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContentContext parametersContent() throws RecognitionException {
		ParametersContentContext _localctx = new ParametersContentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parametersContent);
		int _la;
		try {
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new ParaHasAccessModifiersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AccessModifiers) {
					{
					setState(563);
					match(AccessModifiers);
					}
				}

				setState(566);
				match(IDENTIFIER);
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(567);
					match(COLON);
					setState(568);
					type();
					setState(569);
					parametersType();
					}
				}

				}
				break;
			case 2:
				_localctx = new ParaHasPropertyAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				propertyAccess();
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(574);
					match(COMMA);
					setState(575);
					propertyAccess();
					}
					}
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public List<ParametersContentContext> parametersContent() {
			return getRuleContexts(ParametersContentContext.class);
		}
		public ParametersContentContext parametersContent(int i) {
			return getRuleContext(ParametersContentContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(OPEN_BRACKET);
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AccessModifiers || _la==IDENTIFIER) {
				{
				{
				setState(584);
				parametersContent();
				}
				}
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(590);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MyParser.STRING, 0); }
		public TerminalNode NUMBER_VAL() { return getToken(MyParser.NUMBER_VAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(MyParser.BOOLEAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1048583L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationsContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MyParser.PLUS, 0); }
		public TerminalNode MIN() { return getToken(MyParser.MIN, 0); }
		public TerminalNode MULT() { return getToken(MyParser.MULT, 0); }
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubDotAssignmentContext extends ParserRuleContext {
		public List<TerminalNode> QUESTION_MARK() { return getTokens(MyParser.QUESTION_MARK); }
		public TerminalNode QUESTION_MARK(int i) {
			return getToken(MyParser.QUESTION_MARK, i);
		}
		public List<TerminalNode> DOT() { return getTokens(MyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MyParser.DOT, i);
		}
		public List<TerminalNode> SQUARE_OPEN_BRACKET() { return getTokens(MyParser.SQUARE_OPEN_BRACKET); }
		public TerminalNode SQUARE_OPEN_BRACKET(int i) {
			return getToken(MyParser.SQUARE_OPEN_BRACKET, i);
		}
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> SQUARE_CLOSE_BRACKET() { return getTokens(MyParser.SQUARE_CLOSE_BRACKET); }
		public TerminalNode SQUARE_CLOSE_BRACKET(int i) {
			return getToken(MyParser.SQUARE_CLOSE_BRACKET, i);
		}
		public SubDotAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subDotAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterSubDotAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitSubDotAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitSubDotAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubDotAssignmentContext subDotAssignment() throws RecognitionException {
		SubDotAssignmentContext _localctx = new SubDotAssignmentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_subDotAssignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(596);
					match(QUESTION_MARK);
					setState(597);
					match(DOT);
					setState(598);
					match(SQUARE_OPEN_BRACKET);
					setState(599);
					values();
					setState(600);
					match(SQUARE_CLOSE_BRACKET);
					}
					} 
				}
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotAssignmentContext extends AssignmentContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public SubDotAssignmentContext subDotAssignment() {
			return getRuleContext(SubDotAssignmentContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public TerminalNode NOT() { return getToken(MyParser.NOT, 0); }
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public DotAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterDotAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitDotAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitDotAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends AssignmentContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public TerminalNode AS() { return getToken(MyParser.AS, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public AssignmentStatementContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementInitiContext extends AssignmentContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public AssignmentStatementInitiContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAssignmentStatementIniti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAssignmentStatementIniti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAssignmentStatementIniti(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleAssignmentContext extends AssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public SimpleAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterSimpleAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitSimpleAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitSimpleAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		return assignment(0);
	}

	private AssignmentContext assignment(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AssignmentContext _localctx = new AssignmentContext(_ctx, _parentState);
		AssignmentContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_assignment, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(608);
				match(IDENTIFIER);
				setState(609);
				match(EQUAL);
				setState(610);
				expression();
				setState(611);
				match(SEMI_COLON);
				}
				break;
			case 2:
				{
				_localctx = new DotAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(613);
				propertyAccess();
				setState(614);
				subDotAssignment();
				setState(625);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(615);
					match(EQUAL);
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(616);
						match(NOT);
						}
					}

					setState(619);
					type();
					setState(623);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						setState(620);
						operations();
						setState(621);
						values();
						}
						break;
					}
					}
					break;
				}
				setState(628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(627);
					match(SEMI_COLON);
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new AssignmentStatementInitiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(630);
				propertyAccess();
				setState(631);
				match(EQUAL);
				setState(632);
				objectLiteral();
				setState(633);
				match(SEMI_COLON);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(648);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AssignmentStatementContext(new AssignmentContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_assignment);
					setState(637);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(638);
					match(EQUAL);
					setState(639);
					assignment(0);
					setState(644);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						setState(640);
						match(AS);
						setState(641);
						primitiveType();
						setState(642);
						match(SEMI_COLON);
						}
						break;
					}
					}
					} 
				}
				setState(650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateExpressionContext extends ParserRuleContext {
		public TerminalNode CURLY_OPEN_BRACKET() { return getToken(MyParser.CURLY_OPEN_BRACKET, 0); }
		public TerminalNode DOUBLE_CURLY_OPEN_BRACKET() { return getToken(MyParser.DOUBLE_CURLY_OPEN_BRACKET, 0); }
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
		public TerminalNode DOUBLE_CURLY_CLOSE_BRACKET() { return getToken(MyParser.DOUBLE_CURLY_CLOSE_BRACKET, 0); }
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public TerminalNode BIT_OR() { return getToken(MyParser.BIT_OR, 0); }
		public TemplateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTemplateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTemplateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitTemplateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateExpressionContext templateExpression() throws RecognitionException {
		TemplateExpressionContext _localctx = new TemplateExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_templateExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			_la = _input.LA(1);
			if ( !(_la==CURLY_OPEN_BRACKET || _la==DOUBLE_CURLY_OPEN_BRACKET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5467447982351717088L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1114095L) != 0)) {
				{
				{
				setState(652);
				types();
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIT_OR) {
				{
				setState(658);
				match(BIT_OR);
				setState(660); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(659);
					types();
					}
					}
					setState(662); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 5467447982351717088L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1114095L) != 0) );
				}
			}

			setState(666);
			_la = _input.LA(1);
			if ( !(_la==CURLY_CLOSE_BRACKET || _la==DOUBLE_CURLY_CLOSE_BRACKET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventBindingContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode CLICK() { return getToken(MyParser.CLICK, 0); }
		public List<TerminalNode> CLOSE_BRACKET2() { return getTokens(MyParser.CLOSE_BRACKET2); }
		public TerminalNode CLOSE_BRACKET2(int i) {
			return getToken(MyParser.CLOSE_BRACKET2, i);
		}
		public TerminalNode EQUAL3() { return getToken(MyParser.EQUAL3, 0); }
		public TerminalNode DQUOT5() { return getToken(MyParser.DQUOT5, 0); }
		public List<TerminalNode> ID3() { return getTokens(MyParser.ID3); }
		public TerminalNode ID3(int i) {
			return getToken(MyParser.ID3, i);
		}
		public TerminalNode OPEN_BRACKET2() { return getToken(MyParser.OPEN_BRACKET2, 0); }
		public TerminalNode DQUOT6() { return getToken(MyParser.DQUOT6, 0); }
		public List<TerminalNode> DOT3() { return getTokens(MyParser.DOT3); }
		public TerminalNode DOT3(int i) {
			return getToken(MyParser.DOT3, i);
		}
		public EventBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventBindingContext eventBinding() throws RecognitionException {
		EventBindingContext _localctx = new EventBindingContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_eventBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(OPEN_BRACKET);
			setState(669);
			match(CLICK);
			setState(670);
			match(CLOSE_BRACKET2);
			setState(671);
			match(EQUAL3);
			setState(672);
			match(DQUOT5);
			setState(673);
			match(ID3);
			setState(674);
			match(OPEN_BRACKET2);
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID3) {
				{
				setState(675);
				match(ID3);
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT3) {
					{
					{
					setState(676);
					match(DOT3);
					setState(677);
					match(ID3);
					}
					}
					setState(682);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(685);
			match(CLOSE_BRACKET2);
			setState(686);
			match(DQUOT6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDeclareContext extends ParserRuleContext {
		public NormalHtmlTagContext normalHtmlTag() {
			return getRuleContext(NormalHtmlTagContext.class,0);
		}
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public HtmlDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterHtmlDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitHtmlDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitHtmlDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDeclareContext htmlDeclare() throws RecognitionException {
		HtmlDeclareContext _localctx = new HtmlDeclareContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_htmlDeclare);
		try {
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				normalHtmlTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				selfClosingTag();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NormalHtmlTagContext extends ParserRuleContext {
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public NormalHtmlTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalHtmlTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNormalHtmlTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNormalHtmlTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNormalHtmlTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalHtmlTagContext normalHtmlTag() throws RecognitionException {
		NormalHtmlTagContext _localctx = new NormalHtmlTagContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_normalHtmlTag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			openTag();
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(693);
					types();
					}
					} 
				}
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(699);
			closeTag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(MyParser.LT, 0); }
		public TerminalNode SLASH() { return getToken(MyParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(MyParser.GT, 0); }
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(LT);
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5467447982351717088L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1114095L) != 0)) {
				{
				{
				setState(702);
				types();
				}
				}
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(708);
			match(SLASH);
			setState(709);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(MyParser.LT, 0); }
		public TerminalNode GT() { return getToken(MyParser.GT, 0); }
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(LT);
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5467447982351717088L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1114095L) != 0)) {
				{
				{
				setState(712);
				types();
				}
				}
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(718);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(MyParser.LT, 0); }
		public TerminalNode SLASH() { return getToken(MyParser.SLASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode GT() { return getToken(MyParser.GT, 0); }
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(LT);
			setState(721);
			match(SLASH);
			setState(722);
			match(IDENTIFIER);
			setState(723);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleArrayContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(MyParser.SQUARE_OPEN_BRACKET, 0); }
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(MyParser.SQUARE_CLOSE_BRACKET, 0); }
		public SimpleArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterSimpleArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitSimpleArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitSimpleArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleArrayContext simpleArray() throws RecognitionException {
		SimpleArrayContext _localctx = new SimpleArrayContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_simpleArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(IDENTIFIER);
			setState(726);
			match(SQUARE_OPEN_BRACKET);
			setState(727);
			match(SQUARE_CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode LT() { return getToken(MyParser.LT, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public TerminalNode GT() { return getToken(MyParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(IDENTIFIER);
			setState(730);
			match(LT);
			setState(731);
			values();
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(732);
				match(COMMA);
				setState(733);
				values();
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(739);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayStringTypeContext arrayStringType() {
			return getRuleContext(ArrayStringTypeContext.class,0);
		}
		public SimpleArrayContext simpleArray() {
			return getRuleContext(SimpleArrayContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public ArrayNumberTypeContext arrayNumberType() {
			return getRuleContext(ArrayNumberTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_type);
		try {
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				arrayStringType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(743);
				simpleArray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(744);
				map();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(745);
				arrayNumberType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	 
		public PrimitiveTypeContext() { }
		public void copyFrom(PrimitiveTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberPrimitiveTypeContext extends PrimitiveTypeContext {
		public TerminalNode NUMBER() { return getToken(MyParser.NUMBER, 0); }
		public NumberPrimitiveTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNumberPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNumberPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNumberPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidPrimitiveTypeContext extends PrimitiveTypeContext {
		public TerminalNode VOID() { return getToken(MyParser.VOID, 0); }
		public VoidPrimitiveTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterVoidPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitVoidPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitVoidPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringEXPrimitiveTypeContext extends PrimitiveTypeContext {
		public TerminalNode STRING_EX() { return getToken(MyParser.STRING_EX, 0); }
		public StringEXPrimitiveTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStringEXPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStringEXPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStringEXPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyPrimitiveTypeContext extends PrimitiveTypeContext {
		public TerminalNode ANY() { return getToken(MyParser.ANY, 0); }
		public AnyPrimitiveTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAnyPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAnyPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAnyPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateExPrimitiveTypeContext extends PrimitiveTypeContext {
		public TemplateExpressionContext templateExpression() {
			return getRuleContext(TemplateExpressionContext.class,0);
		}
		public TemplateExPrimitiveTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTemplateExPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTemplateExPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitTemplateExPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdPrimitiveTypeContext extends PrimitiveTypeContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public IdPrimitiveTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIdPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIdPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitIdPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullPrimitiveTypeContext extends PrimitiveTypeContext {
		public TerminalNode NULL() { return getToken(MyParser.NULL, 0); }
		public NullPrimitiveTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNullPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNullPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNullPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassPrimitiveTypeContext extends PrimitiveTypeContext {
		public TerminalNode CLASS() { return getToken(MyParser.CLASS, 0); }
		public ClassPrimitiveTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterClassPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitClassPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitClassPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_primitiveType);
		try {
			setState(756);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				_localctx = new NumberPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				match(NUMBER);
				}
				break;
			case VOID:
				_localctx = new VoidPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(750);
				match(VOID);
				}
				break;
			case NULL:
				_localctx = new NullPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(751);
				match(NULL);
				}
				break;
			case ANY:
				_localctx = new AnyPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(752);
				match(ANY);
				}
				break;
			case STRING_EX:
				_localctx = new StringEXPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(753);
				match(STRING_EX);
				}
				break;
			case CLASS:
				_localctx = new ClassPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(754);
				match(CLASS);
				}
				break;
			case CURLY_OPEN_BRACKET:
			case DOUBLE_CURLY_OPEN_BRACKET:
				_localctx = new TemplateExPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(755);
				templateExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayStringTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(MyParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(MyParser.LT, 0); }
		public TerminalNode STRING_EX() { return getToken(MyParser.STRING_EX, 0); }
		public TerminalNode GT() { return getToken(MyParser.GT, 0); }
		public ArrayStringTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayStringType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterArrayStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitArrayStringType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitArrayStringType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayStringTypeContext arrayStringType() throws RecognitionException {
		ArrayStringTypeContext _localctx = new ArrayStringTypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_arrayStringType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(ARRAY);
			setState(759);
			match(LT);
			setState(760);
			match(STRING_EX);
			setState(761);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayNumberTypeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MyParser.NUMBER, 0); }
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(MyParser.SQUARE_OPEN_BRACKET, 0); }
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(MyParser.SQUARE_CLOSE_BRACKET, 0); }
		public ArrayNumberTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayNumberType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterArrayNumberType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitArrayNumberType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitArrayNumberType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayNumberTypeContext arrayNumberType() throws RecognitionException {
		ArrayNumberTypeContext _localctx = new ArrayNumberTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_arrayNumberType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(NUMBER);
			setState(764);
			match(SQUARE_OPEN_BRACKET);
			setState(765);
			match(SQUARE_CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MarksContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public TerminalNode COMMA() { return getToken(MyParser.COMMA, 0); }
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public TerminalNode DOT() { return getToken(MyParser.DOT, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(MyParser.QUESTION_MARK, 0); }
		public TerminalNode HASH_TAG() { return getToken(MyParser.HASH_TAG, 0); }
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public TerminalNode S_DOlOR() { return getToken(MyParser.S_DOlOR, 0); }
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(MyParser.SQUARE_OPEN_BRACKET, 0); }
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(MyParser.SQUARE_CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public TerminalNode NOT() { return getToken(MyParser.NOT, 0); }
		public MarksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterMarks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitMarks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMarks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarksContext marks() throws RecognitionException {
		MarksContext _localctx = new MarksContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_marks);
		try {
			setState(781);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI_COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				match(SEMI_COLON);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				match(COMMA);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(769);
				match(COLON);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(770);
				match(DOT);
				}
				break;
			case QUESTION_MARK:
				enterOuterAlt(_localctx, 5);
				{
				setState(771);
				match(QUESTION_MARK);
				}
				break;
			case HASH_TAG:
				enterOuterAlt(_localctx, 6);
				{
				setState(772);
				match(HASH_TAG);
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(773);
				match(EQUAL);
				}
				break;
			case PLUS:
			case MIN:
			case MULT:
				enterOuterAlt(_localctx, 8);
				{
				setState(774);
				operations();
				}
				break;
			case S_DOlOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(775);
				match(S_DOlOR);
				}
				break;
			case SQUARE_OPEN_BRACKET:
				enterOuterAlt(_localctx, 10);
				{
				setState(776);
				match(SQUARE_OPEN_BRACKET);
				}
				break;
			case SQUARE_CLOSE_BRACKET:
				enterOuterAlt(_localctx, 11);
				{
				setState(777);
				match(SQUARE_CLOSE_BRACKET);
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 12);
				{
				setState(778);
				match(OPEN_BRACKET);
				}
				break;
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 13);
				{
				setState(779);
				match(CLOSE_BRACKET);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 14);
				{
				setState(780);
				match(NOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(MyParser.SQUARE_OPEN_BRACKET, 0); }
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(MyParser.SQUARE_CLOSE_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_arrayDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(SQUARE_OPEN_BRACKET);
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 189157853360034016L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1048591L) != 0)) {
				{
				setState(784);
				expression();
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(785);
					match(COMMA);
					setState(786);
					expression();
					setState(790);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(787);
							match(COMMA);
							}
							} 
						}
						setState(792);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
					}
					}
					}
					setState(797);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(800);
			match(SQUARE_CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionStatContext extends ParserRuleContext {
		public TerminalNode CURLY_OPEN_BRACKET() { return getToken(MyParser.CURLY_OPEN_BRACKET, 0); }
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterConditionStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitConditionStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitConditionStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionStatContext conditionStat() throws RecognitionException {
		ConditionStatContext _localctx = new ConditionStatContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_conditionStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(CURLY_OPEN_BRACKET);
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 189157853360034016L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1048591L) != 0)) {
				{
				{
				setState(803);
				expression();
				}
				}
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(809);
			match(CURLY_CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryStatContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(MyParser.TRY, 0); }
		public ConditionStatContext conditionStat() {
			return getRuleContext(ConditionStatContext.class,0);
		}
		public TryStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTryStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTryStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitTryStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatContext tryStat() throws RecognitionException {
		TryStatContext _localctx = new TryStatContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_tryStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(TRY);
			setState(812);
			conditionStat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchStatContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(MyParser.CATCH, 0); }
		public ConditionStatContext conditionStat() {
			return getRuleContext(ConditionStatContext.class,0);
		}
		public CatchStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCatchStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCatchStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitCatchStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchStatContext catchStat() throws RecognitionException {
		CatchStatContext _localctx = new CatchStatContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_catchStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(CATCH);
			setState(815);
			conditionStat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationExprContext extends ParserRuleContext {
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public OperationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterOperationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitOperationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitOperationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationExprContext operationExpr() throws RecognitionException {
		OperationExprContext _localctx = new OperationExprContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_operationExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			values();
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(818);
				operations();
				setState(819);
				values();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionConditionContext extends ParserRuleContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public List<TerminalNode> QUESTION_MARK() { return getTokens(MyParser.QUESTION_MARK); }
		public TerminalNode QUESTION_MARK(int i) {
			return getToken(MyParser.QUESTION_MARK, i);
		}
		public QuestionConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterQuestionCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitQuestionCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitQuestionCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionConditionContext questionCondition() throws RecognitionException {
		QuestionConditionContext _localctx = new QuestionConditionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_questionCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			propertyAccess();
			setState(825); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(824);
				match(QUESTION_MARK);
				}
				}
				setState(827); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==QUESTION_MARK );
			setState(829);
			values();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NavigateContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public List<TerminalNode> DOT() { return getTokens(MyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MyParser.DOT, i);
		}
		public TerminalNode ROUTER() { return getToken(MyParser.ROUTER, 0); }
		public TerminalNode NAVIGATE() { return getToken(MyParser.NAVIGATE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(MyParser.SQUARE_OPEN_BRACKET, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(MyParser.SQUARE_CLOSE_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public NavigateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNavigate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNavigate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNavigate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigateContext navigate() throws RecognitionException {
		NavigateContext _localctx = new NavigateContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_navigate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(IDENTIFIER);
			setState(832);
			match(DOT);
			setState(833);
			match(ROUTER);
			setState(834);
			match(DOT);
			setState(835);
			match(NAVIGATE);
			setState(836);
			match(OPEN_BRACKET);
			setState(837);
			match(SQUARE_OPEN_BRACKET);
			setState(838);
			content();
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(839);
				match(COMMA);
				setState(840);
				content();
				}
				}
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(846);
			match(SQUARE_CLOSE_BRACKET);
			setState(847);
			match(CLOSE_BRACKET);
			setState(848);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExpContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(MyParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(MyParser.OPEN_BRACKET, i);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public TerminalNode NUMBER() { return getToken(MyParser.NUMBER, 0); }
		public List<PropertyAccessContext> propertyAccess() {
			return getRuleContexts(PropertyAccessContext.class);
		}
		public PropertyAccessContext propertyAccess(int i) {
			return getRuleContext(PropertyAccessContext.class,i);
		}
		public List<TerminalNode> CURLY_OPEN_BRACKET() { return getTokens(MyParser.CURLY_OPEN_BRACKET); }
		public TerminalNode CURLY_OPEN_BRACKET(int i) {
			return getToken(MyParser.CURLY_OPEN_BRACKET, i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public List<TerminalNode> CURLY_CLOSE_BRACKET() { return getTokens(MyParser.CURLY_CLOSE_BRACKET); }
		public TerminalNode CURLY_CLOSE_BRACKET(int i) {
			return getToken(MyParser.CURLY_CLOSE_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(MyParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(MyParser.CLOSE_BRACKET, i);
		}
		public FunctionExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFunctionExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFunctionExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitFunctionExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExpContext functionExp() throws RecognitionException {
		FunctionExpContext _localctx = new FunctionExpContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_functionExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(850);
				match(NUMBER);
				}
			}

			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(853);
				match(OPEN_BRACKET);
				}
				break;
			}
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(856);
				propertyAccess();
				}
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(862);
			match(OPEN_BRACKET);
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CURLY_OPEN_BRACKET) {
				{
				{
				setState(863);
				match(CURLY_OPEN_BRACKET);
				}
				}
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1048591L) != 0)) {
				{
				{
				setState(869);
				content();
				}
				}
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CURLY_CLOSE_BRACKET) {
				{
				{
				setState(875);
				match(CURLY_CLOSE_BRACKET);
				}
				}
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLOSE_BRACKET) {
				{
				{
				setState(881);
				match(CLOSE_BRACKET);
				}
				}
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(887);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_content);
		try {
			setState(892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				values();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(891);
				propertyAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public NavigateContext navigate() {
			return getRuleContext(NavigateContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public IfElseStatContext ifElseStat() {
			return getRuleContext(IfElseStatContext.class,0);
		}
		public TryStatContext tryStat() {
			return getRuleContext(TryStatContext.class,0);
		}
		public CatchStatContext catchStat() {
			return getRuleContext(CatchStatContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public FunctionExpContext functionExp() {
			return getRuleContext(FunctionExpContext.class,0);
		}
		public DirectivesStatmentContext directivesStatment() {
			return getRuleContext(DirectivesStatmentContext.class,0);
		}
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public QuestionConditionContext questionCondition() {
			return getRuleContext(QuestionConditionContext.class,0);
		}
		public OperationExprContext operationExpr() {
			return getRuleContext(OperationExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_expression);
		try {
			setState(908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(894);
				values();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				navigate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(896);
				arrayDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(897);
				variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(898);
				ifElseStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(899);
				tryStat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(900);
				catchStat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(901);
				objectLiteral();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(902);
				functionExp();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(903);
				directivesStatment();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(904);
				propertyAccess();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(905);
				assignment(0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(906);
				questionCondition();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(907);
				operationExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectivesStatmentContext extends ParserRuleContext {
		public DirectivesStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directivesStatment; }
	 
		public DirectivesStatmentContext() { }
		public void copyFrom(DirectivesStatmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgForDirectiveContext extends DirectivesStatmentContext {
		public TerminalNode NgFor() { return getToken(MyParser.NgFor, 0); }
		public TerminalNode EQUAL1() { return getToken(MyParser.EQUAL1, 0); }
		public NgForValueContext ngForValue() {
			return getRuleContext(NgForValueContext.class,0);
		}
		public NgForDirectiveContext(DirectivesStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNgForDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNgForDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNgForDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgIfDirectiveContext extends DirectivesStatmentContext {
		public TerminalNode NgIf() { return getToken(MyParser.NgIf, 0); }
		public TerminalNode EQUAL2() { return getToken(MyParser.EQUAL2, 0); }
		public NgIfValueContext ngIfValue() {
			return getRuleContext(NgIfValueContext.class,0);
		}
		public NgIfDirectiveContext(DirectivesStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNgIfDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNgIfDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNgIfDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectivesStatmentContext directivesStatment() throws RecognitionException {
		DirectivesStatmentContext _localctx = new DirectivesStatmentContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_directivesStatment);
		try {
			setState(916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NgFor:
				_localctx = new NgForDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(910);
				match(NgFor);
				setState(911);
				match(EQUAL1);
				setState(912);
				ngForValue();
				}
				break;
			case NgIf:
				_localctx = new NgIfDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(913);
				match(NgIf);
				setState(914);
				match(EQUAL2);
				setState(915);
				ngIfValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgForValueContext extends ParserRuleContext {
		public TerminalNode DQUOT1() { return getToken(MyParser.DQUOT1, 0); }
		public TerminalNode DQUOT2() { return getToken(MyParser.DQUOT2, 0); }
		public List<NgForExpressionContext> ngForExpression() {
			return getRuleContexts(NgForExpressionContext.class);
		}
		public NgForExpressionContext ngForExpression(int i) {
			return getRuleContext(NgForExpressionContext.class,i);
		}
		public NgForValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngForValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNgForValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNgForValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNgForValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgForValueContext ngForValue() throws RecognitionException {
		NgForValueContext _localctx = new NgForValueContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_ngForValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			match(DQUOT1);
			setState(922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET1) {
				{
				{
				setState(919);
				ngForExpression();
				}
				}
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(925);
			match(DQUOT2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgForExpressionContext extends ParserRuleContext {
		public List<TerminalNode> LET1() { return getTokens(MyParser.LET1); }
		public TerminalNode LET1(int i) {
			return getToken(MyParser.LET1, i);
		}
		public List<TerminalNode> ID1() { return getTokens(MyParser.ID1); }
		public TerminalNode ID1(int i) {
			return getToken(MyParser.ID1, i);
		}
		public TerminalNode OF1() { return getToken(MyParser.OF1, 0); }
		public TerminalNode EQUAL1() { return getToken(MyParser.EQUAL1, 0); }
		public TerminalNode SEMI_COLON5() { return getToken(MyParser.SEMI_COLON5, 0); }
		public NgForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngForExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNgForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNgForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNgForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgForExpressionContext ngForExpression() throws RecognitionException {
		NgForExpressionContext _localctx = new NgForExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_ngForExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(LET1);
			setState(928);
			match(ID1);
			setState(929);
			match(OF1);
			setState(930);
			match(ID1);
			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_COLON5) {
					{
					setState(931);
					match(SEMI_COLON5);
					}
				}

				setState(934);
				match(LET1);
				setState(935);
				match(ID1);
				setState(936);
				match(EQUAL1);
				setState(937);
				match(ID1);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgIfValueContext extends ParserRuleContext {
		public TerminalNode DQUOT3() { return getToken(MyParser.DQUOT3, 0); }
		public ConditionExpressionContext conditionExpression() {
			return getRuleContext(ConditionExpressionContext.class,0);
		}
		public TerminalNode DQUOT4() { return getToken(MyParser.DQUOT4, 0); }
		public NgIfValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngIfValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNgIfValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNgIfValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNgIfValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgIfValueContext ngIfValue() throws RecognitionException {
		NgIfValueContext _localctx = new NgIfValueContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_ngIfValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(DQUOT3);
			setState(941);
			conditionExpression();
			setState(942);
			match(DQUOT4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionExpressionContext extends ParserRuleContext {
		public ConditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpression; }
	 
		public ConditionExpressionContext() { }
		public void copyFrom(ConditionExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualNullContext extends ConditionExpressionContext {
		public TerminalNode ID2() { return getToken(MyParser.ID2, 0); }
		public EqualOperationContext equalOperation() {
			return getRuleContext(EqualOperationContext.class,0);
		}
		public TerminalNode NULL1() { return getToken(MyParser.NULL1, 0); }
		public EqualNullContext(ConditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterEqualNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitEqualNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitEqualNull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpContext extends ConditionExpressionContext {
		public LogicalTermContext logicalTerm() {
			return getRuleContext(LogicalTermContext.class,0);
		}
		public EqualOperationContext equalOperation() {
			return getRuleContext(EqualOperationContext.class,0);
		}
		public TerminalNode ID2() { return getToken(MyParser.ID2, 0); }
		public List<TerminalNode> NUMBER_VAL1() { return getTokens(MyParser.NUMBER_VAL1); }
		public TerminalNode NUMBER_VAL1(int i) {
			return getToken(MyParser.NUMBER_VAL1, i);
		}
		public TerminalNode GT1() { return getToken(MyParser.GT1, 0); }
		public ComparisonExpContext(ConditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterComparisonExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitComparisonExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitComparisonExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonWithEqualExpContext extends ConditionExpressionContext {
		public List<LogicalTermContext> logicalTerm() {
			return getRuleContexts(LogicalTermContext.class);
		}
		public LogicalTermContext logicalTerm(int i) {
			return getRuleContext(LogicalTermContext.class,i);
		}
		public TerminalNode OPEN_BRACKET1() { return getToken(MyParser.OPEN_BRACKET1, 0); }
		public List<TerminalNode> ID2() { return getTokens(MyParser.ID2); }
		public TerminalNode ID2(int i) {
			return getToken(MyParser.ID2, i);
		}
		public TerminalNode ARROW1() { return getToken(MyParser.ARROW1, 0); }
		public EqualOperationContext equalOperation() {
			return getRuleContext(EqualOperationContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET1() { return getToken(MyParser.CLOSE_BRACKET1, 0); }
		public TerminalNode GT1() { return getToken(MyParser.GT1, 0); }
		public TerminalNode NUMBER_VAL1() { return getToken(MyParser.NUMBER_VAL1, 0); }
		public ComparisonWithEqualExpContext(ConditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterComparisonWithEqualExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitComparisonWithEqualExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitComparisonWithEqualExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExpressionContext conditionExpression() throws RecognitionException {
		ConditionExpressionContext _localctx = new ConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_conditionExpression);
		int _la;
		try {
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				_localctx = new EqualNullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				match(ID2);
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 1921L) != 0)) {
					{
					setState(945);
					equalOperation();
					setState(946);
					match(NULL1);
					}
				}

				}
				break;
			case 2:
				_localctx = new ComparisonExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				logicalTerm();
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 4196225L) != 0)) {
					{
					setState(953);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GT1) {
						{
						setState(951);
						match(GT1);
						setState(952);
						match(NUMBER_VAL1);
						}
					}

					setState(955);
					equalOperation();
					setState(956);
					_la = _input.LA(1);
					if ( !(_la==NUMBER_VAL1 || _la==ID2) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 3:
				_localctx = new ComparisonWithEqualExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(960);
				logicalTerm();
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET1) {
					{
					setState(961);
					match(OPEN_BRACKET1);
					setState(962);
					match(ID2);
					setState(963);
					match(ARROW1);
					setState(964);
					logicalTerm();
					setState(967);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GT1) {
						{
						setState(965);
						match(GT1);
						setState(966);
						match(NUMBER_VAL1);
						}
					}

					setState(969);
					equalOperation();
					setState(970);
					match(ID2);
					setState(971);
					match(CLOSE_BRACKET1);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualOperationContext extends ParserRuleContext {
		public TerminalNode EQUAL2() { return getToken(MyParser.EQUAL2, 0); }
		public TerminalNode EQUAL_EQUAL1() { return getToken(MyParser.EQUAL_EQUAL1, 0); }
		public TerminalNode EQUAL_EQUAL2() { return getToken(MyParser.EQUAL_EQUAL2, 0); }
		public TerminalNode NOT_EQUAL1() { return getToken(MyParser.NOT_EQUAL1, 0); }
		public TerminalNode NOT_EQUAL2() { return getToken(MyParser.NOT_EQUAL2, 0); }
		public EqualOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterEqualOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitEqualOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitEqualOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualOperationContext equalOperation() throws RecognitionException {
		EqualOperationContext _localctx = new EqualOperationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_equalOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 1921L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalTermContext extends ParserRuleContext {
		public List<TerminalNode> ID2() { return getTokens(MyParser.ID2); }
		public TerminalNode ID2(int i) {
			return getToken(MyParser.ID2, i);
		}
		public TerminalNode NOT1() { return getToken(MyParser.NOT1, 0); }
		public TerminalNode DOT1() { return getToken(MyParser.DOT1, 0); }
		public LogicalTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLogicalTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLogicalTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitLogicalTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalTermContext logicalTerm() throws RecognitionException {
		LogicalTermContext _localctx = new LogicalTermContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_logicalTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT1) {
				{
				setState(979);
				match(NOT1);
				}
			}

			setState(982);
			match(ID2);
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT1) {
				{
				setState(983);
				match(DOT1);
				setState(984);
				match(ID2);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MyParser.IF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_ifStat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(IF);
			setState(988);
			match(OPEN_BRACKET);
			setState(992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(989);
					types();
					}
					} 
				}
				setState(994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			setState(995);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStatContext extends ParserRuleContext {
		public IfElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStat; }
	 
		public IfElseStatContext() { }
		public void copyFrom(IfElseStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfQuestionMarkContext extends IfElseStatContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(MyParser.QUESTION_MARK, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public IfQuestionMarkContext(IfElseStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIfQuestionMark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIfQuestionMark(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitIfQuestionMark(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfReturnContext extends IfElseStatContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(MyParser.RETURN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public IfReturnContext(IfElseStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIfReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIfReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitIfReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseContext extends IfElseStatContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public List<ConditionStatContext> conditionStat() {
			return getRuleContexts(ConditionStatContext.class);
		}
		public ConditionStatContext conditionStat(int i) {
			return getRuleContext(ConditionStatContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MyParser.ELSE, 0); }
		public IfElseContext(IfElseStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStatContext ifElseStat() throws RecognitionException {
		IfElseStatContext _localctx = new IfElseStatContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_ifElseStat);
		int _la;
		try {
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				_localctx = new IfQuestionMarkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				match(IDENTIFIER);
				setState(998);
				match(QUESTION_MARK);
				setState(999);
				type();
				setState(1000);
				match(COLON);
				setState(1001);
				type();
				}
				break;
			case 2:
				_localctx = new IfReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				ifStat();
				setState(1004);
				match(RETURN);
				setState(1005);
				match(SEMI_COLON);
				}
				break;
			case 3:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1007);
				ifStat();
				setState(1008);
				conditionStat();
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1009);
					match(ELSE);
					setState(1010);
					conditionStat();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_typeContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(MyParser.LET, 0); }
		public TerminalNode VAR() { return getToken(MyParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(MyParser.CONST, 0); }
		public TerminalNode AccessModifiers() { return getToken(MyParser.AccessModifiers, 0); }
		public Variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterVariable_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitVariable_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitVariable_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_typeContext variable_type() throws RecognitionException {
		Variable_typeContext _localctx = new Variable_typeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_variable_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0) || _la==AccessModifiers) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnionTypeContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode BIT_OR() { return getToken(MyParser.BIT_OR, 0); }
		public UnionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterUnionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitUnionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitUnionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionTypeContext unionType() throws RecognitionException {
		UnionTypeContext _localctx = new UnionTypeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_unionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			type();
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIT_OR) {
				{
				setState(1018);
				match(BIT_OR);
				setState(1019);
				type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewObjectFromClassContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(MyParser.DOT, 0); }
		public ToStringNodeContext toStringNode() {
			return getRuleContext(ToStringNodeContext.class,0);
		}
		public NewObjectFromClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newObjectFromClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNewObjectFromClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNewObjectFromClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNewObjectFromClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewObjectFromClassContext newObjectFromClass() throws RecognitionException {
		NewObjectFromClassContext _localctx = new NewObjectFromClassContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_newObjectFromClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1022);
				match(IDENTIFIER);
				}
				}
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1028);
			parameters();
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1029);
				match(DOT);
				setState(1030);
				toStringNode();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ToStringNodeContext extends ParserRuleContext {
		public TerminalNode TOSTRING() { return getToken(MyParser.TOSTRING, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ToStringNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toStringNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterToStringNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitToStringNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitToStringNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToStringNodeContext toStringNode() throws RecognitionException {
		ToStringNodeContext _localctx = new ToStringNodeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_toStringNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(TOSTRING);
			setState(1034);
			parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationStatContext extends ParserRuleContext {
		public VariableDeclarationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStat; }
	 
		public VariableDeclarationStatContext() { }
		public void copyFrom(VariableDeclarationStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypedVariableDeclContext extends VariableDeclarationStatContext {
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public List<TerminalNode> SQUARE_OPEN_BRACKET() { return getTokens(MyParser.SQUARE_OPEN_BRACKET); }
		public TerminalNode SQUARE_OPEN_BRACKET(int i) {
			return getToken(MyParser.SQUARE_OPEN_BRACKET, i);
		}
		public List<TerminalNode> SQUARE_CLOSE_BRACKET() { return getTokens(MyParser.SQUARE_CLOSE_BRACKET); }
		public TerminalNode SQUARE_CLOSE_BRACKET(int i) {
			return getToken(MyParser.SQUARE_CLOSE_BRACKET, i);
		}
		public TypedVariableDeclContext(VariableDeclarationStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTypedVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTypedVariableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitTypedVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectFromClassContext extends VariableDeclarationStatContext {
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public NewObjectFromClassContext newObjectFromClass() {
			return getRuleContext(NewObjectFromClassContext.class,0);
		}
		public ObjectFromClassContext(VariableDeclarationStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterObjectFromClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitObjectFromClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitObjectFromClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InferredVariableDeclContext extends VariableDeclarationStatContext {
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public InferredVariableDeclContext(VariableDeclarationStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterInferredVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitInferredVariableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitInferredVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationStatContext variableDeclarationStat() throws RecognitionException {
		VariableDeclarationStatContext _localctx = new VariableDeclarationStatContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_variableDeclarationStat);
		int _la;
		try {
			int _alt;
			setState(1061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				_localctx = new TypedVariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				match(COLON);
				setState(1037);
				unionType();
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SQUARE_OPEN_BRACKET) {
					{
					{
					setState(1038);
					match(SQUARE_OPEN_BRACKET);
					setState(1039);
					match(SQUARE_CLOSE_BRACKET);
					}
					}
					setState(1044);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1045);
				match(EQUAL);
				setState(1046);
				types();
				}
				break;
			case 2:
				_localctx = new InferredVariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1048);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1051);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1049);
					types();
					}
					break;
				case 2:
					{
					setState(1050);
					conditions();
					}
					break;
				}
				setState(1056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1053);
						match(COMMA);
						}
						} 
					}
					setState(1058);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new ObjectFromClassContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1059);
				match(EQUAL);
				setState(1060);
				newObjectFromClass();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationStatContext variableDeclarationStat() {
			return getRuleContext(VariableDeclarationStatContext.class,0);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public List<PropertyAccessContext> propertyAccess() {
			return getRuleContexts(PropertyAccessContext.class);
		}
		public PropertyAccessContext propertyAccess(int i) {
			return getRuleContext(PropertyAccessContext.class,i);
		}
		public TerminalNode QUESTION_MARK() { return getToken(MyParser.QUESTION_MARK, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0) || _la==AccessModifiers) {
				{
				setState(1063);
				variable_type();
				}
			}

			setState(1067); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1066);
				propertyAccess();
				}
				}
				setState(1069); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION_MARK) {
				{
				setState(1071);
				match(QUESTION_MARK);
				}
			}

			setState(1074);
			variableDeclarationStat();
			setState(1076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1075);
				match(SEMI_COLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends ParserRuleContext {
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
	 
		public ArrowFunctionContext() { }
		public void copyFrom(ArrowFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventHandlerArrowFunctionContext extends ArrowFunctionContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public TerminalNode ARROW() { return getToken(MyParser.ARROW, 0); }
		public TerminalNode CURLY_OPEN_BRACKET() { return getToken(MyParser.CURLY_OPEN_BRACKET, 0); }
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public EventHandlerArrowFunctionContext(ArrowFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterEventHandlerArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitEventHandlerArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitEventHandlerArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarArrowFunctionContext extends ArrowFunctionContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(MyParser.ARROW, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarArrowFunctionContext(ArrowFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterVarArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitVarArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitVarArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_arrowFunction);
		int _la;
		try {
			setState(1110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case VAR:
			case CONST:
			case AccessModifiers:
				_localctx = new VarArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1078);
				variable_type();
				setState(1079);
				match(IDENTIFIER);
				setState(1080);
				match(EQUAL);
				setState(1081);
				parameters();
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1082);
					match(COLON);
					setState(1083);
					type();
					}
				}

				setState(1086);
				match(ARROW);
				setState(1087);
				body();
				setState(1088);
				match(SEMI_COLON);
				}
				break;
			case IDENTIFIER:
				_localctx = new EventHandlerArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1090);
				propertyAccess();
				setState(1091);
				match(EQUAL);
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(1092);
					parameters();
					}
				}

				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1095);
					match(COLON);
					setState(1096);
					type();
					}
				}

				setState(1099);
				match(ARROW);
				setState(1100);
				match(CURLY_OPEN_BRACKET);
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 189157857655018720L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1048591L) != 0)) {
					{
					{
					setState(1101);
					body();
					}
					}
					setState(1106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1107);
				match(CURLY_CLOSE_BRACKET);
				setState(1108);
				match(SEMI_COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 43:
			return assignment_sempred((AssignmentContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean assignment_sempred(AssignmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u008d\u0459\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0001\u0000"+
		"\u0005\u0000\u00aa\b\u0000\n\u0000\f\u0000\u00ad\t\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00b3\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00ba\b\u0002\n"+
		"\u0002\f\u0002\u00bd\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00cd"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00d2\b\u0005"+
		"\n\u0005\f\u0005\u00d5\t\u0005\u0001\u0005\u0003\u0005\u00d8\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00e0\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0004\b\u00ee\b\b\u000b\b\f\b\u00ef\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u00f5\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00fa\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u010a\b\f\u0001\f\u0001\f\u0005\f\u010e"+
		"\b\f\n\f\f\f\u0111\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0121\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0128\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u012f\b\u0011"+
		"\u0003\u0011\u0131\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0136\b\u0012\u0001\u0012\u0005\u0012\u0139\b\u0012\n\u0012\f\u0012\u013c"+
		"\t\u0012\u0001\u0012\u0003\u0012\u013f\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0146\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0161\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u017f\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0184\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u018b\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u018f\b"+
		"\u001a\u0003\u001a\u0191\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u019b"+
		"\b\u001b\n\u001b\f\u001b\u019e\t\u001b\u0003\u001b\u01a0\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01b7\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u01bc\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u01c1\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u01c7\b\u001f\n\u001f\f\u001f\u01ca\t\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0005 \u01d8\b \n \f \u01db\t \u0001 \u0003 \u01de\b \u0001!"+
		"\u0001!\u0001!\u0001!\u0003!\u01e4\b!\u0001!\u0001!\u0001!\u0003!\u01e9"+
		"\b!\u0005!\u01eb\b!\n!\f!\u01ee\t!\u0001\"\u0001\"\u0003\"\u01f2\b\"\u0001"+
		"\"\u0003\"\u01f5\b\"\u0001\"\u0001\"\u0003\"\u01f9\b\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0203\b\"\u0001"+
		"#\u0001#\u0003#\u0207\b#\u0001#\u0001#\u0001#\u0001#\u0005#\u020d\b#\n"+
		"#\f#\u0210\t#\u0001#\u0001#\u0001$\u0001$\u0003$\u0216\b$\u0001%\u0001"+
		"%\u0003%\u021a\b%\u0001%\u0001%\u0001%\u0005%\u021f\b%\n%\f%\u0222\t%"+
		"\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005"+
		"%\u022d\b%\n%\f%\u0230\t%\u0003%\u0232\b%\u0001&\u0003&\u0235\b&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0003&\u023c\b&\u0001&\u0001&\u0001&\u0005"+
		"&\u0241\b&\n&\f&\u0244\t&\u0003&\u0246\b&\u0001\'\u0001\'\u0005\'\u024a"+
		"\b\'\n\'\f\'\u024d\t\'\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u025b\b*\n*\f*\u025e\t*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u026a\b+\u0001+\u0001+\u0001+\u0001+\u0003+\u0270\b+\u0003+\u0272\b"+
		"+\u0001+\u0003+\u0275\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u027c"+
		"\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0285\b+\u0005"+
		"+\u0287\b+\n+\f+\u028a\t+\u0001,\u0001,\u0005,\u028e\b,\n,\f,\u0291\t"+
		",\u0001,\u0001,\u0004,\u0295\b,\u000b,\f,\u0296\u0003,\u0299\b,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0005-\u02a7\b-\n-\f-\u02aa\t-\u0003-\u02ac\b-\u0001-\u0001-"+
		"\u0001-\u0001.\u0001.\u0003.\u02b3\b.\u0001/\u0001/\u0005/\u02b7\b/\n"+
		"/\f/\u02ba\t/\u0001/\u0001/\u00010\u00010\u00050\u02c0\b0\n0\f0\u02c3"+
		"\t0\u00010\u00010\u00010\u00011\u00011\u00051\u02ca\b1\n1\f1\u02cd\t1"+
		"\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u0001"+
		"3\u00013\u00014\u00014\u00014\u00014\u00014\u00054\u02df\b4\n4\f4\u02e2"+
		"\t4\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u00035\u02eb\b5\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00036\u02f5\b6\u0001"+
		"7\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00039\u030e\b9\u0001:\u0001:\u0001:\u0001:\u0001:\u0005"+
		":\u0315\b:\n:\f:\u0318\t:\u0005:\u031a\b:\n:\f:\u031d\t:\u0003:\u031f"+
		"\b:\u0001:\u0001:\u0001;\u0001;\u0005;\u0325\b;\n;\f;\u0328\t;\u0001;"+
		"\u0001;\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001>\u0001>\u0001"+
		">\u0001>\u0003>\u0336\b>\u0001?\u0001?\u0004?\u033a\b?\u000b?\f?\u033b"+
		"\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0005@\u034a\b@\n@\f@\u034d\t@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001A\u0003A\u0354\bA\u0001A\u0003A\u0357\bA\u0001A\u0005A\u035a\b"+
		"A\nA\fA\u035d\tA\u0001A\u0001A\u0005A\u0361\bA\nA\fA\u0364\tA\u0001A\u0005"+
		"A\u0367\bA\nA\fA\u036a\tA\u0001A\u0005A\u036d\bA\nA\fA\u0370\tA\u0001"+
		"A\u0005A\u0373\bA\nA\fA\u0376\tA\u0001A\u0001A\u0001B\u0001B\u0001B\u0003"+
		"B\u037d\bB\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u038d\bC\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0003D\u0395\bD\u0001E\u0001E\u0005E\u0399\bE\n"+
		"E\fE\u039c\tE\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F"+
		"\u03a5\bF\u0001F\u0001F\u0001F\u0001F\u0003F\u03ab\bF\u0001G\u0001G\u0001"+
		"G\u0001G\u0001H\u0001H\u0001H\u0001H\u0003H\u03b5\bH\u0001H\u0001H\u0001"+
		"H\u0003H\u03ba\bH\u0001H\u0001H\u0001H\u0003H\u03bf\bH\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0003H\u03c8\bH\u0001H\u0001H\u0001H\u0001"+
		"H\u0003H\u03ce\bH\u0003H\u03d0\bH\u0001I\u0001I\u0001J\u0003J\u03d5\b"+
		"J\u0001J\u0001J\u0001J\u0003J\u03da\bJ\u0001K\u0001K\u0001K\u0005K\u03df"+
		"\bK\nK\fK\u03e2\tK\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0003L\u03f4"+
		"\bL\u0003L\u03f6\bL\u0001M\u0001M\u0001N\u0001N\u0001N\u0003N\u03fd\b"+
		"N\u0001O\u0005O\u0400\bO\nO\fO\u0403\tO\u0001O\u0001O\u0001O\u0003O\u0408"+
		"\bO\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0005Q\u0411\bQ\n"+
		"Q\fQ\u0414\tQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u041c\b"+
		"Q\u0001Q\u0005Q\u041f\bQ\nQ\fQ\u0422\tQ\u0001Q\u0001Q\u0003Q\u0426\bQ"+
		"\u0001R\u0003R\u0429\bR\u0001R\u0004R\u042c\bR\u000bR\fR\u042d\u0001R"+
		"\u0003R\u0431\bR\u0001R\u0001R\u0003R\u0435\bR\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0003S\u043d\bS\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0003S\u0446\bS\u0001S\u0001S\u0003S\u044a\bS\u0001S\u0001S\u0001"+
		"S\u0005S\u044f\bS\nS\fS\u0452\tS\u0001S\u0001S\u0001S\u0003S\u0457\bS"+
		"\u0001S\u0000\u0001VT\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u0000"+
		"\u000b\u0002\u0000GGWW\u0002\u0000\u0013\u0013\u001b\u001c\u0002\u0000"+
		"0022\u0002\u0000CEWW\u0001\u0000OQ\u0002\u000099;;\u0002\u0000::<<\u0002"+
		"\u0000aa\u007f\u007f\u0002\u0000bbil\u0002\u0000\u0005\u0007FF\u0002\u0000"+
		"JJNN\u04b7\u0000\u00ab\u0001\u0000\u0000\u0000\u0002\u00b2\u0001\u0000"+
		"\u0000\u0000\u0004\u00b4\u0001\u0000\u0000\u0000\u0006\u00c3\u0001\u0000"+
		"\u0000\u0000\b\u00c5\u0001\u0000\u0000\u0000\n\u00ce\u0001\u0000\u0000"+
		"\u0000\f\u00df\u0001\u0000\u0000\u0000\u000e\u00e1\u0001\u0000\u0000\u0000"+
		"\u0010\u00f9\u0001\u0000\u0000\u0000\u0012\u00fb\u0001\u0000\u0000\u0000"+
		"\u0014\u00ff\u0001\u0000\u0000\u0000\u0016\u0103\u0001\u0000\u0000\u0000"+
		"\u0018\u0105\u0001\u0000\u0000\u0000\u001a\u0114\u0001\u0000\u0000\u0000"+
		"\u001c\u0117\u0001\u0000\u0000\u0000\u001e\u011a\u0001\u0000\u0000\u0000"+
		" \u0120\u0001\u0000\u0000\u0000\"\u0130\u0001\u0000\u0000\u0000$\u0132"+
		"\u0001\u0000\u0000\u0000&\u0145\u0001\u0000\u0000\u0000(\u0147\u0001\u0000"+
		"\u0000\u0000*\u014c\u0001\u0000\u0000\u0000,\u0158\u0001\u0000\u0000\u0000"+
		".\u0160\u0001\u0000\u0000\u00000\u0162\u0001\u0000\u0000\u00002\u0169"+
		"\u0001\u0000\u0000\u00004\u0190\u0001\u0000\u0000\u00006\u019f\u0001\u0000"+
		"\u0000\u00008\u01b6\u0001\u0000\u0000\u0000:\u01bb\u0001\u0000\u0000\u0000"+
		"<\u01bd\u0001\u0000\u0000\u0000>\u01c2\u0001\u0000\u0000\u0000@\u01dd"+
		"\u0001\u0000\u0000\u0000B\u01df\u0001\u0000\u0000\u0000D\u0202\u0001\u0000"+
		"\u0000\u0000F\u0206\u0001\u0000\u0000\u0000H\u0215\u0001\u0000\u0000\u0000"+
		"J\u0231\u0001\u0000\u0000\u0000L\u0245\u0001\u0000\u0000\u0000N\u0247"+
		"\u0001\u0000\u0000\u0000P\u0250\u0001\u0000\u0000\u0000R\u0252\u0001\u0000"+
		"\u0000\u0000T\u025c\u0001\u0000\u0000\u0000V\u027b\u0001\u0000\u0000\u0000"+
		"X\u028b\u0001\u0000\u0000\u0000Z\u029c\u0001\u0000\u0000\u0000\\\u02b2"+
		"\u0001\u0000\u0000\u0000^\u02b4\u0001\u0000\u0000\u0000`\u02bd\u0001\u0000"+
		"\u0000\u0000b\u02c7\u0001\u0000\u0000\u0000d\u02d0\u0001\u0000\u0000\u0000"+
		"f\u02d5\u0001\u0000\u0000\u0000h\u02d9\u0001\u0000\u0000\u0000j\u02ea"+
		"\u0001\u0000\u0000\u0000l\u02f4\u0001\u0000\u0000\u0000n\u02f6\u0001\u0000"+
		"\u0000\u0000p\u02fb\u0001\u0000\u0000\u0000r\u030d\u0001\u0000\u0000\u0000"+
		"t\u030f\u0001\u0000\u0000\u0000v\u0322\u0001\u0000\u0000\u0000x\u032b"+
		"\u0001\u0000\u0000\u0000z\u032e\u0001\u0000\u0000\u0000|\u0331\u0001\u0000"+
		"\u0000\u0000~\u0337\u0001\u0000\u0000\u0000\u0080\u033f\u0001\u0000\u0000"+
		"\u0000\u0082\u0353\u0001\u0000\u0000\u0000\u0084\u037c\u0001\u0000\u0000"+
		"\u0000\u0086\u038c\u0001\u0000\u0000\u0000\u0088\u0394\u0001\u0000\u0000"+
		"\u0000\u008a\u0396\u0001\u0000\u0000\u0000\u008c\u039f\u0001\u0000\u0000"+
		"\u0000\u008e\u03ac\u0001\u0000\u0000\u0000\u0090\u03cf\u0001\u0000\u0000"+
		"\u0000\u0092\u03d1\u0001\u0000\u0000\u0000\u0094\u03d4\u0001\u0000\u0000"+
		"\u0000\u0096\u03db\u0001\u0000\u0000\u0000\u0098\u03f5\u0001\u0000\u0000"+
		"\u0000\u009a\u03f7\u0001\u0000\u0000\u0000\u009c\u03f9\u0001\u0000\u0000"+
		"\u0000\u009e\u0401\u0001\u0000\u0000\u0000\u00a0\u0409\u0001\u0000\u0000"+
		"\u0000\u00a2\u0425\u0001\u0000\u0000\u0000\u00a4\u0428\u0001\u0000\u0000"+
		"\u0000\u00a6\u0456\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003\u0002\u0001"+
		"\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u0001\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b3\u0003\u0004\u0002\u0000\u00af\u00b3\u0003\b\u0004\u0000"+
		"\u00b0\u00b3\u0003$\u0012\u0000\u00b1\u00b3\u00034\u001a\u0000\u00b2\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u0003"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0001\u0000\u0000\u00b5\u00b6"+
		"\u00059\u0000\u0000\u00b6\u00bb\u0007\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"I\u0000\u0000\u00b8\u00ba\u0005W\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00bf\u0005:\u0000\u0000"+
		"\u00bf\u00c0\u0005\u0003\u0000\u0000\u00c0\u00c1\u0005C\u0000\u0000\u00c1"+
		"\u00c2\u0005H\u0000\u0000\u00c2\u0005\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0007\u0001\u0000\u0000\u00c4\u0007\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0003\u0006\u0003\u0000\u00c6\u00c7\u00057\u0000\u0000\u00c7\u00c8\u0005"+
		"9\u0000\u0000\u00c8\u00c9\u0003\n\u0005\u0000\u00c9\u00ca\u0005:\u0000"+
		"\u0000\u00ca\u00cc\u00058\u0000\u0000\u00cb\u00cd\u0005I\u0000\u0000\u00cc"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"\t\u0001\u0000\u0000\u0000\u00ce\u00d3\u0003\f\u0006\u0000\u00cf\u00d0"+
		"\u0005I\u0000\u0000\u00d0\u00d2\u0003\f\u0006\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d8\u0005"+
		"I\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u000b\u0001\u0000\u0000\u0000\u00d9\u00e0\u0003\u0012"+
		"\t\u0000\u00da\u00e0\u0003\u0014\n\u0000\u00db\u00e0\u0003\u001a\r\u0000"+
		"\u00dc\u00e0\u0003\u001c\u000e\u0000\u00dd\u00e0\u0003\u001e\u000f\u0000"+
		"\u00de\u00e0\u0003\u0010\b\u0000\u00df\u00d9\u0001\u0000\u0000\u0000\u00df"+
		"\u00da\u0001\u0000\u0000\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df"+
		"\u00dc\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df"+
		"\u00de\u0001\u0000\u0000\u0000\u00e0\r\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0005\u0004\u0000\u0000\u00e2\u00e3\u0005J\u0000\u0000\u00e3\u00e4\u0005"+
		"5\u0000\u0000\u00e4\u00e5\u0005B\u0000\u0000\u00e5\u00e6\u0005C\u0000"+
		"\u0000\u00e6\u00e7\u0005B\u0000\u0000\u00e7\u00e8\u00056\u0000\u0000\u00e8"+
		"\u000f\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u0017\u0000\u0000\u00ea"+
		"\u00eb\u0005J\u0000\u0000\u00eb\u00ed\u0005B\u0000\u0000\u00ec\u00ee\u0003"+
		"\\.\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f4\u0005B\u0000"+
		"\u0000\u00f2\u00f3\u0005I\u0000\u0000\u00f3\u00f5\u0003\u000e\u0007\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f5\u00fa\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005W\u0000\u0000\u00f7"+
		"\u00f8\u0005J\u0000\u0000\u00f8\u00fa\u0005C\u0000\u0000\u00f9\u00e9\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f6\u0001\u0000\u0000\u0000\u00fa\u0011\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0005\u0014\u0000\u0000\u00fc\u00fd\u0005"+
		"J\u0000\u0000\u00fd\u00fe\u0005C\u0000\u0000\u00fe\u0013\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005\u0015\u0000\u0000\u0100\u0101\u0005J\u0000\u0000"+
		"\u0101\u0102\u0005E\u0000\u0000\u0102\u0015\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0001\u0000\u0000\u0000\u0104\u0017\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0005J\u0000\u0000\u0106\u0109\u00055\u0000\u0000\u0107\u010a\u0005"+
		"W\u0000\u0000\u0108\u010a\u0003\u0016\u000b\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010f\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0005I\u0000\u0000\u010c\u010e\u0005W\u0000\u0000"+
		"\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000"+
		"\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000"+
		"\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u00056\u0000\u0000\u0113\u0019\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0005\u0016\u0000\u0000\u0115\u0116\u0003\u0018\f\u0000\u0116\u001b"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u0019\u0000\u0000\u0118\u0119"+
		"\u0003\u0018\f\u0000\u0119\u001d\u0001\u0000\u0000\u0000\u011a\u011b\u0005"+
		"W\u0000\u0000\u011b\u011c\u0003\u0018\f\u0000\u011c\u001f\u0001\u0000"+
		"\u0000\u0000\u011d\u0121\u0005\u000b\u0000\u0000\u011e\u0121\u0005\u001a"+
		"\u0000\u0000\u011f\u0121\u0003\u009aM\u0000\u0120\u011d\u0001\u0000\u0000"+
		"\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000\u0000"+
		"\u0000\u0121!\u0001\u0000\u0000\u0000\u0122\u0123\u0005\u001d\u0000\u0000"+
		"\u0123\u0127\u0005W\u0000\u0000\u0124\u0125\u0003 \u0010\u0000\u0125\u0126"+
		"\u0005W\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0124\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0131\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0003 \u0010\u0000\u012a\u012e\u0005W\u0000"+
		"\u0000\u012b\u012c\u0005J\u0000\u0000\u012c\u012d\u0005W\u0000\u0000\u012d"+
		"\u012f\u0005N\u0000\u0000\u012e\u012b\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u0001\u0000\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u0122"+
		"\u0001\u0000\u0000\u0000\u0130\u0129\u0001\u0000\u0000\u0000\u0131#\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0005\u0018\u0000\u0000\u0133\u0135\u0003"+
		"\"\u0011\u0000\u0134\u0136\u00059\u0000\u0000\u0135\u0134\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u013a\u0001\u0000"+
		"\u0000\u0000\u0137\u0139\u0003.\u0017\u0000\u0138\u0137\u0001\u0000\u0000"+
		"\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000"+
		"\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u013f\u0005:\u0000\u0000"+
		"\u013e\u013d\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000"+
		"\u013f%\u0001\u0000\u0000\u0000\u0140\u0146\u0003j5\u0000\u0141\u0146"+
		"\u0003r9\u0000\u0142\u0146\u0003\u0086C\u0000\u0143\u0146\u0003Z-\u0000"+
		"\u0144\u0146\u0003\\.\u0000\u0145\u0140\u0001\u0000\u0000\u0000\u0145"+
		"\u0141\u0001\u0000\u0000\u0000\u0145\u0142\u0001\u0000\u0000\u0000\u0145"+
		"\u0143\u0001\u0000\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146"+
		"\'\u0001\u0000\u0000\u0000\u0147\u0148\u00057\u0000\u0000\u0148\u0149"+
		"\u00055\u0000\u0000\u0149\u014a\u00056\u0000\u0000\u014a\u014b\u00058"+
		"\u0000\u0000\u014b)\u0001\u0000\u0000\u0000\u014c\u014d\u0003\u009aM\u0000"+
		"\u014d\u014e\u0005W\u0000\u0000\u014e\u014f\u0005R\u0000\u0000\u014f\u0150"+
		"\u0005N\u0000\u0000\u0150\u0151\u0005W\u0000\u0000\u0151\u0152\u0005G"+
		"\u0000\u0000\u0152\u0153\u0005>\u0000\u0000\u0153\u0154\u0003f3\u0000"+
		"\u0154\u0155\u0005?\u0000\u0000\u0155\u0156\u0003(\u0014\u0000\u0156\u0157"+
		"\u0005H\u0000\u0000\u0157+\u0001\u0000\u0000\u0000\u0158\u0159\u0003\u0086"+
		"C\u0000\u0159-\u0001\u0000\u0000\u0000\u015a\u0161\u0003H$\u0000\u015b"+
		"\u0161\u00032\u0019\u0000\u015c\u0161\u00030\u0018\u0000\u015d\u0161\u0003"+
		",\u0016\u0000\u015e\u0161\u0003*\u0015\u0000\u015f\u0161\u0003<\u001e"+
		"\u0000\u0160\u015a\u0001\u0000\u0000\u0000\u0160\u015b\u0001\u0000\u0000"+
		"\u0000\u0160\u015c\u0001\u0000\u0000\u0000\u0160\u015d\u0001\u0000\u0000"+
		"\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u015f\u0001\u0000\u0000"+
		"\u0000\u0161/\u0001\u0000\u0000\u0000\u0162\u0163\u0005 \u0000\u0000\u0163"+
		"\u0164\u0005K\u0000\u0000\u0164\u0165\u0005!\u0000\u0000\u0165\u0166\u0005"+
		"7\u0000\u0000\u0166\u0167\u0003P(\u0000\u0167\u0168\u00058\u0000\u0000"+
		"\u01681\u0001\u0000\u0000\u0000\u0169\u016a\u0005 \u0000\u0000\u016a\u016b"+
		"\u0005K\u0000\u0000\u016b\u016c\u0005\"\u0000\u0000\u016c\u016d\u0005"+
		"7\u0000\u0000\u016d\u016e\u0003P(\u0000\u016e\u016f\u00058\u0000\u0000"+
		"\u016f\u0170\u0005H\u0000\u0000\u01703\u0001\u0000\u0000\u0000\u0171\u0172"+
		"\u0005W\u0000\u0000\u0172\u0173\u0003N\'\u0000\u0173\u0174\u0005K\u0000"+
		"\u0000\u0174\u0175\u0005\u001f\u0000\u0000\u0175\u0176\u00057\u0000\u0000"+
		"\u0176\u0177\u0003N\'\u0000\u0177\u0178\u0005=\u0000\u0000\u0178\u0179"+
		"\u00030\u0018\u0000\u0179\u017a\u00058\u0000\u0000\u017a\u017b\u0005H"+
		"\u0000\u0000\u017b\u0191\u0001\u0000\u0000\u0000\u017c\u017e\u0003B!\u0000"+
		"\u017d\u017f\u0005W\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180"+
		"\u0183\u0003N\'\u0000\u0181\u0182\u0005\u000f\u0000\u0000\u0182\u0184"+
		"\u0003f3\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0005H\u0000"+
		"\u0000\u0186\u0191\u0001\u0000\u0000\u0000\u0187\u0188\u0003B!\u0000\u0188"+
		"\u018a\u00057\u0000\u0000\u0189\u018b\u00036\u001b\u0000\u018a\u0189\u0001"+
		"\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0001"+
		"\u0000\u0000\u0000\u018c\u018e\u00058\u0000\u0000\u018d\u018f\u0005H\u0000"+
		"\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000"+
		"\u0000\u018f\u0191\u0001\u0000\u0000\u0000\u0190\u0171\u0001\u0000\u0000"+
		"\u0000\u0190\u017c\u0001\u0000\u0000\u0000\u0190\u0187\u0001\u0000\u0000"+
		"\u0000\u01915\u0001\u0000\u0000\u0000\u0192\u01a0\u0003>\u001f\u0000\u0193"+
		"\u0194\u00055\u0000\u0000\u0194\u0195\u0003@ \u0000\u0195\u0196\u0005"+
		"6\u0000\u0000\u0196\u01a0\u0001\u0000\u0000\u0000\u0197\u019c\u0003\u0086"+
		"C\u0000\u0198\u0199\u0005I\u0000\u0000\u0199\u019b\u0003\u0086C\u0000"+
		"\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000"+
		"\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000"+
		"\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000"+
		"\u019f\u0192\u0001\u0000\u0000\u0000\u019f\u0193\u0001\u0000\u0000\u0000"+
		"\u019f\u0197\u0001\u0000\u0000\u0000\u01a07\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0003B!\u0000\u01a2\u01a3\u00057\u0000\u0000\u01a3\u01a4\u0005"+
		"W\u0000\u0000\u01a4\u01a5\u0005=\u0000\u0000\u01a5\u01a6\u0003B!\u0000"+
		"\u01a6\u01a7\u0007\u0002\u0000\u0000\u01a7\u01a8\u0003B!\u0000\u01a8\u01a9"+
		"\u00058\u0000\u0000\u01a9\u01b7\u0001\u0000\u0000\u0000\u01aa\u01ab\u0003"+
		"B!\u0000\u01ab\u01ac\u00057\u0000\u0000\u01ac\u01ad\u0003N\'\u0000\u01ad"+
		"\u01ae\u0005=\u0000\u0000\u01ae\u01af\u0003B!\u0000\u01af\u01b0\u0003"+
		"N\'\u0000\u01b0\u01b1\u0005I\u0000\u0000\u01b1\u01b2\u0005D\u0000\u0000"+
		"\u01b2\u01b3\u00058\u0000\u0000\u01b3\u01b4\u0003R)\u0000\u01b4\u01b5"+
		"\u0005D\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01a1\u0001"+
		"\u0000\u0000\u0000\u01b6\u01aa\u0001\u0000\u0000\u0000\u01b79\u0001\u0000"+
		"\u0000\u0000\u01b8\u01bc\u00036\u001b\u0000\u01b9\u01bc\u00038\u001c\u0000"+
		"\u01ba\u01bc\u0003P(\u0000\u01bb\u01b8\u0001\u0000\u0000\u0000\u01bb\u01b9"+
		"\u0001\u0000\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bc;\u0001"+
		"\u0000\u0000\u0000\u01bd\u01be\u0005\u000e\u0000\u0000\u01be\u01c0\u0003"+
		":\u001d\u0000\u01bf\u01c1\u0005H\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1=\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c3\u00059\u0000\u0000\u01c3\u01c8\u0003@ \u0000\u01c4\u01c5"+
		"\u0005I\u0000\u0000\u01c5\u01c7\u0003@ \u0000\u01c6\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01cb\u0001\u0000"+
		"\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005:\u0000"+
		"\u0000\u01cc?\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005W\u0000\u0000\u01ce"+
		"\u01cf\u0005J\u0000\u0000\u01cf\u01de\u0003\u0086C\u0000\u01d0\u01d1\u0005"+
		"\u0016\u0000\u0000\u01d1\u01d2\u0005J\u0000\u0000\u01d2\u01de\u0003\u0086"+
		"C\u0000\u01d3\u01d4\u0005\u0019\u0000\u0000\u01d4\u01d5\u0005J\u0000\u0000"+
		"\u01d5\u01de\u0003\u0086C\u0000\u01d6\u01d8\u0005K\u0000\u0000\u01d7\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01dc"+
		"\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc\u01de"+
		"\u0003B!\u0000\u01dd\u01cd\u0001\u0000\u0000\u0000\u01dd\u01d0\u0001\u0000"+
		"\u0000\u0000\u01dd\u01d3\u0001\u0000\u0000\u0000\u01dd\u01d9\u0001\u0000"+
		"\u0000\u0000\u01deA\u0001\u0000\u0000\u0000\u01df\u01ec\u0005W\u0000\u0000"+
		"\u01e0\u01e1\u0005K\u0000\u0000\u01e1\u01e3\u0005W\u0000\u0000\u01e2\u01e4"+
		"\u0005R\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e8\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005"+
		"5\u0000\u0000\u01e6\u01e7\u0005W\u0000\u0000\u01e7\u01e9\u00056\u0000"+
		"\u0000\u01e8\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000"+
		"\u0000\u01e9\u01eb\u0001\u0000\u0000\u0000\u01ea\u01e0\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ee\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01edC\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005N\u0000\u0000\u01f0"+
		"\u01f2\u0005\n\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f4\u0001\u0000\u0000\u0000\u01f3\u01f5"+
		"\u0003N\'\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f8\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005"+
		"J\u0000\u0000\u01f7\u01f9\u0003\u009cN\u0000\u01f8\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u0203\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fb\u0005R\u0000\u0000\u01fb\u01fc\u0003N\'\u0000\u01fc"+
		"\u01fd\u0005J\u0000\u0000\u01fd\u01fe\u0005W\u0000\u0000\u01fe\u01ff\u0005"+
		">\u0000\u0000\u01ff\u0200\u0003f3\u0000\u0200\u0201\u0005?\u0000\u0000"+
		"\u0201\u0203\u0001\u0000\u0000\u0000\u0202\u01f1\u0001\u0000\u0000\u0000"+
		"\u0202\u01fa\u0001\u0000\u0000\u0000\u0203E\u0001\u0000\u0000\u0000\u0204"+
		"\u0207\u0005\n\u0000\u0000\u0205\u0207\u0003\u009aM\u0000\u0206\u0204"+
		"\u0001\u0000\u0000\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0005W\u0000\u0000\u0209\u020a\u0003D\"\u0000\u020a\u020e\u00059\u0000"+
		"\u0000\u020b\u020d\u0003.\u0017\u0000\u020c\u020b\u0001\u0000\u0000\u0000"+
		"\u020d\u0210\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000"+
		"\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0211\u0001\u0000\u0000\u0000"+
		"\u0210\u020e\u0001\u0000\u0000\u0000\u0211\u0212\u0005:\u0000\u0000\u0212"+
		"G\u0001\u0000\u0000\u0000\u0213\u0216\u0003F#\u0000\u0214\u0216\u0003"+
		"\u00a6S\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0215\u0214\u0001\u0000"+
		"\u0000\u0000\u0216I\u0001\u0000\u0000\u0000\u0217\u0219\u0005I\u0000\u0000"+
		"\u0218\u021a\u0005F\u0000\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u0219"+
		"\u021a\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b"+
		"\u021c\u0005W\u0000\u0000\u021c\u021d\u0005J\u0000\u0000\u021d\u021f\u0003"+
		"j5\u0000\u021e\u0217\u0001\u0000\u0000\u0000\u021f\u0222\u0001\u0000\u0000"+
		"\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000"+
		"\u0000\u0221\u0232\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000"+
		"\u0000\u0223\u0224\u0005N\u0000\u0000\u0224\u022e\u0003P(\u0000\u0225"+
		"\u0226\u0005I\u0000\u0000\u0226\u0227\u0005W\u0000\u0000\u0227\u0228\u0005"+
		"J\u0000\u0000\u0228\u0229\u0003j5\u0000\u0229\u022a\u0005N\u0000\u0000"+
		"\u022a\u022b\u0003P(\u0000\u022b\u022d\u0001\u0000\u0000\u0000\u022c\u0225"+
		"\u0001\u0000\u0000\u0000\u022d\u0230\u0001\u0000\u0000\u0000\u022e\u022c"+
		"\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0232"+
		"\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0231\u0220"+
		"\u0001\u0000\u0000\u0000\u0231\u0223\u0001\u0000\u0000\u0000\u0232K\u0001"+
		"\u0000\u0000\u0000\u0233\u0235\u0005F\u0000\u0000\u0234\u0233\u0001\u0000"+
		"\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000"+
		"\u0000\u0000\u0236\u023b\u0005W\u0000\u0000\u0237\u0238\u0005J\u0000\u0000"+
		"\u0238\u0239\u0003j5\u0000\u0239\u023a\u0003J%\u0000\u023a\u023c\u0001"+
		"\u0000\u0000\u0000\u023b\u0237\u0001\u0000\u0000\u0000\u023b\u023c\u0001"+
		"\u0000\u0000\u0000\u023c\u0246\u0001\u0000\u0000\u0000\u023d\u0242\u0003"+
		"B!\u0000\u023e\u023f\u0005I\u0000\u0000\u023f\u0241\u0003B!\u0000\u0240"+
		"\u023e\u0001\u0000\u0000\u0000\u0241\u0244\u0001\u0000\u0000\u0000\u0242"+
		"\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243"+
		"\u0246\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0245"+
		"\u0234\u0001\u0000\u0000\u0000\u0245\u023d\u0001\u0000\u0000\u0000\u0246"+
		"M\u0001\u0000\u0000\u0000\u0247\u024b\u00057\u0000\u0000\u0248\u024a\u0003"+
		"L&\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u024a\u024d\u0001\u0000\u0000"+
		"\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000"+
		"\u0000\u024c\u024e\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000\u0000"+
		"\u0000\u024e\u024f\u00058\u0000\u0000\u024fO\u0001\u0000\u0000\u0000\u0250"+
		"\u0251\u0007\u0003\u0000\u0000\u0251Q\u0001\u0000\u0000\u0000\u0252\u0253"+
		"\u0007\u0004\u0000\u0000\u0253S\u0001\u0000\u0000\u0000\u0254\u0255\u0005"+
		"L\u0000\u0000\u0255\u0256\u0005K\u0000\u0000\u0256\u0257\u00055\u0000"+
		"\u0000\u0257\u0258\u0003P(\u0000\u0258\u0259\u00056\u0000\u0000\u0259"+
		"\u025b\u0001\u0000\u0000\u0000\u025a\u0254\u0001\u0000\u0000\u0000\u025b"+
		"\u025e\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025c"+
		"\u025d\u0001\u0000\u0000\u0000\u025dU\u0001\u0000\u0000\u0000\u025e\u025c"+
		"\u0001\u0000\u0000\u0000\u025f\u0260\u0006+\uffff\uffff\u0000\u0260\u0261"+
		"\u0005W\u0000\u0000\u0261\u0262\u0005N\u0000\u0000\u0262\u0263\u0003\u0086"+
		"C\u0000\u0263\u0264\u0005H\u0000\u0000\u0264\u027c\u0001\u0000\u0000\u0000"+
		"\u0265\u0266\u0003B!\u0000\u0266\u0271\u0003T*\u0000\u0267\u0269\u0005"+
		"N\u0000\u0000\u0268\u026a\u0005.\u0000\u0000\u0269\u0268\u0001\u0000\u0000"+
		"\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000"+
		"\u0000\u026b\u026f\u0003j5\u0000\u026c\u026d\u0003R)\u0000\u026d\u026e"+
		"\u0003P(\u0000\u026e\u0270\u0001\u0000\u0000\u0000\u026f\u026c\u0001\u0000"+
		"\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0272\u0001\u0000"+
		"\u0000\u0000\u0271\u0267\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000"+
		"\u0000\u0000\u0272\u0274\u0001\u0000\u0000\u0000\u0273\u0275\u0005H\u0000"+
		"\u0000\u0274\u0273\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000"+
		"\u0000\u0275\u027c\u0001\u0000\u0000\u0000\u0276\u0277\u0003B!\u0000\u0277"+
		"\u0278\u0005N\u0000\u0000\u0278\u0279\u0003>\u001f\u0000\u0279\u027a\u0005"+
		"H\u0000\u0000\u027a\u027c\u0001\u0000\u0000\u0000\u027b\u025f\u0001\u0000"+
		"\u0000\u0000\u027b\u0265\u0001\u0000\u0000\u0000\u027b\u0276\u0001\u0000"+
		"\u0000\u0000\u027c\u0288\u0001\u0000\u0000\u0000\u027d\u027e\n\u0002\u0000"+
		"\u0000\u027e\u027f\u0005N\u0000\u0000\u027f\u0284\u0003V+\u0000\u0280"+
		"\u0281\u0005\u000f\u0000\u0000\u0281\u0282\u0003l6\u0000\u0282\u0283\u0005"+
		"H\u0000\u0000\u0283\u0285\u0001\u0000\u0000\u0000\u0284\u0280\u0001\u0000"+
		"\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285\u0287\u0001\u0000"+
		"\u0000\u0000\u0286\u027d\u0001\u0000\u0000\u0000\u0287\u028a\u0001\u0000"+
		"\u0000\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000"+
		"\u0000\u0000\u0289W\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000\u0000"+
		"\u0000\u028b\u028f\u0007\u0005\u0000\u0000\u028c\u028e\u0003&\u0013\u0000"+
		"\u028d\u028c\u0001\u0000\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000"+
		"\u028f\u028d\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000"+
		"\u0290\u0298\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000"+
		"\u0292\u0294\u0005+\u0000\u0000\u0293\u0295\u0003&\u0013\u0000\u0294\u0293"+
		"\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000\u0000\u0000\u0296\u0294"+
		"\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297\u0299"+
		"\u0001\u0000\u0000\u0000\u0298\u0292\u0001\u0000\u0000\u0000\u0298\u0299"+
		"\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b"+
		"\u0007\u0006\u0000\u0000\u029bY\u0001\u0000\u0000\u0000\u029c\u029d\u0005"+
		"7\u0000\u0000\u029d\u029e\u0005\u0002\u0000\u0000\u029e\u029f\u0005\u0082"+
		"\u0000\u0000\u029f\u02a0\u0005\u0084\u0000\u0000\u02a0\u02a1\u0005\u008a"+
		"\u0000\u0000\u02a1\u02a2\u0005\u008b\u0000\u0000\u02a2\u02ab\u0005\u008c"+
		"\u0000\u0000\u02a3\u02a8\u0005\u008b\u0000\u0000\u02a4\u02a5\u0005\u0089"+
		"\u0000\u0000\u02a5\u02a7\u0005\u008b\u0000\u0000\u02a6\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000"+
		"\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02ac\u0001\u0000"+
		"\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02ab\u02a3\u0001\u0000"+
		"\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000"+
		"\u0000\u0000\u02ad\u02ae\u0005\u0082\u0000\u0000\u02ae\u02af\u0005\u008d"+
		"\u0000\u0000\u02af[\u0001\u0000\u0000\u0000\u02b0\u02b3\u0003^/\u0000"+
		"\u02b1\u02b3\u0003`0\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b3]\u0001\u0000\u0000\u0000\u02b4\u02b8\u0003"+
		"b1\u0000\u02b5\u02b7\u0003&\u0013\u0000\u02b6\u02b5\u0001\u0000\u0000"+
		"\u0000\u02b7\u02ba\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u02bb\u0001\u0000\u0000"+
		"\u0000\u02ba\u02b8\u0001\u0000\u0000\u0000\u02bb\u02bc\u0003d2\u0000\u02bc"+
		"_\u0001\u0000\u0000\u0000\u02bd\u02c1\u0005>\u0000\u0000\u02be\u02c0\u0003"+
		"&\u0013\u0000\u02bf\u02be\u0001\u0000\u0000\u0000\u02c0\u02c3\u0001\u0000"+
		"\u0000\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c4\u0001\u0000\u0000\u0000\u02c3\u02c1\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c5\u0005@\u0000\u0000\u02c5\u02c6\u0005?\u0000\u0000"+
		"\u02c6a\u0001\u0000\u0000\u0000\u02c7\u02cb\u0005>\u0000\u0000\u02c8\u02ca"+
		"\u0003&\u0013\u0000\u02c9\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cd\u0001"+
		"\u0000\u0000\u0000\u02cb\u02c9\u0001\u0000\u0000\u0000\u02cb\u02cc\u0001"+
		"\u0000\u0000\u0000\u02cc\u02ce\u0001\u0000\u0000\u0000\u02cd\u02cb\u0001"+
		"\u0000\u0000\u0000\u02ce\u02cf\u0005?\u0000\u0000\u02cfc\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d1\u0005>\u0000\u0000\u02d1\u02d2\u0005@\u0000\u0000\u02d2"+
		"\u02d3\u0005W\u0000\u0000\u02d3\u02d4\u0005?\u0000\u0000\u02d4e\u0001"+
		"\u0000\u0000\u0000\u02d5\u02d6\u0005W\u0000\u0000\u02d6\u02d7\u00055\u0000"+
		"\u0000\u02d7\u02d8\u00056\u0000\u0000\u02d8g\u0001\u0000\u0000\u0000\u02d9"+
		"\u02da\u0005W\u0000\u0000\u02da\u02db\u0005>\u0000\u0000\u02db\u02e0\u0003"+
		"P(\u0000\u02dc\u02dd\u0005I\u0000\u0000\u02dd\u02df\u0003P(\u0000\u02de"+
		"\u02dc\u0001\u0000\u0000\u0000\u02df\u02e2\u0001\u0000\u0000\u0000\u02e0"+
		"\u02de\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1"+
		"\u02e3\u0001\u0000\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e4\u0005?\u0000\u0000\u02e4i\u0001\u0000\u0000\u0000\u02e5\u02eb\u0003"+
		"l6\u0000\u02e6\u02eb\u0003n7\u0000\u02e7\u02eb\u0003f3\u0000\u02e8\u02eb"+
		"\u0003h4\u0000\u02e9\u02eb\u0003p8\u0000\u02ea\u02e5\u0001\u0000\u0000"+
		"\u0000\u02ea\u02e6\u0001\u0000\u0000\u0000\u02ea\u02e7\u0001\u0000\u0000"+
		"\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02ea\u02e9\u0001\u0000\u0000"+
		"\u0000\u02ebk\u0001\u0000\u0000\u0000\u02ec\u02f5\u0005W\u0000\u0000\u02ed"+
		"\u02f5\u0005$\u0000\u0000\u02ee\u02f5\u0005&\u0000\u0000\u02ef\u02f5\u0005"+
		"\'\u0000\u0000\u02f0\u02f5\u0005#\u0000\u0000\u02f1\u02f5\u0005%\u0000"+
		"\u0000\u02f2\u02f5\u0005\u001d\u0000\u0000\u02f3\u02f5\u0003X,\u0000\u02f4"+
		"\u02ec\u0001\u0000\u0000\u0000\u02f4\u02ed\u0001\u0000\u0000\u0000\u02f4"+
		"\u02ee\u0001\u0000\u0000\u0000\u02f4\u02ef\u0001\u0000\u0000\u0000\u02f4"+
		"\u02f0\u0001\u0000\u0000\u0000\u02f4\u02f1\u0001\u0000\u0000\u0000\u02f4"+
		"\u02f2\u0001\u0000\u0000\u0000\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f5"+
		"m\u0001\u0000\u0000\u0000\u02f6\u02f7\u0005\t\u0000\u0000\u02f7\u02f8"+
		"\u0005>\u0000\u0000\u02f8\u02f9\u0005%\u0000\u0000\u02f9\u02fa\u0005?"+
		"\u0000\u0000\u02fao\u0001\u0000\u0000\u0000\u02fb\u02fc\u0005$\u0000\u0000"+
		"\u02fc\u02fd\u00055\u0000\u0000\u02fd\u02fe\u00056\u0000\u0000\u02feq"+
		"\u0001\u0000\u0000\u0000\u02ff\u030e\u0005H\u0000\u0000\u0300\u030e\u0005"+
		"I\u0000\u0000\u0301\u030e\u0005J\u0000\u0000\u0302\u030e\u0005K\u0000"+
		"\u0000\u0303\u030e\u0005L\u0000\u0000\u0304\u030e\u0005M\u0000\u0000\u0305"+
		"\u030e\u0005N\u0000\u0000\u0306\u030e\u0003R)\u0000\u0307\u030e\u0005"+
		"R\u0000\u0000\u0308\u030e\u00055\u0000\u0000\u0309\u030e\u00056\u0000"+
		"\u0000\u030a\u030e\u00057\u0000\u0000\u030b\u030e\u00058\u0000\u0000\u030c"+
		"\u030e\u0005.\u0000\u0000\u030d\u02ff\u0001\u0000\u0000\u0000\u030d\u0300"+
		"\u0001\u0000\u0000\u0000\u030d\u0301\u0001\u0000\u0000\u0000\u030d\u0302"+
		"\u0001\u0000\u0000\u0000\u030d\u0303\u0001\u0000\u0000\u0000\u030d\u0304"+
		"\u0001\u0000\u0000\u0000\u030d\u0305\u0001\u0000\u0000\u0000\u030d\u0306"+
		"\u0001\u0000\u0000\u0000\u030d\u0307\u0001\u0000\u0000\u0000\u030d\u0308"+
		"\u0001\u0000\u0000\u0000\u030d\u0309\u0001\u0000\u0000\u0000\u030d\u030a"+
		"\u0001\u0000\u0000\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030d\u030c"+
		"\u0001\u0000\u0000\u0000\u030es\u0001\u0000\u0000\u0000\u030f\u031e\u0005"+
		"5\u0000\u0000\u0310\u031b\u0003\u0086C\u0000\u0311\u0312\u0005I\u0000"+
		"\u0000\u0312\u0316\u0003\u0086C\u0000\u0313\u0315\u0005I\u0000\u0000\u0314"+
		"\u0313\u0001\u0000\u0000\u0000\u0315\u0318\u0001\u0000\u0000\u0000\u0316"+
		"\u0314\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317"+
		"\u031a\u0001\u0000\u0000\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0319"+
		"\u0311\u0001\u0000\u0000\u0000\u031a\u031d\u0001\u0000\u0000\u0000\u031b"+
		"\u0319\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c"+
		"\u031f\u0001\u0000\u0000\u0000\u031d\u031b\u0001\u0000\u0000\u0000\u031e"+
		"\u0310\u0001\u0000\u0000\u0000\u031e\u031f\u0001\u0000\u0000\u0000\u031f"+
		"\u0320\u0001\u0000\u0000\u0000\u0320\u0321\u00056\u0000\u0000\u0321u\u0001"+
		"\u0000\u0000\u0000\u0322\u0326\u00059\u0000\u0000\u0323\u0325\u0003\u0086"+
		"C\u0000\u0324\u0323\u0001\u0000\u0000\u0000\u0325\u0328\u0001\u0000\u0000"+
		"\u0000\u0326\u0324\u0001\u0000\u0000\u0000\u0326\u0327\u0001\u0000\u0000"+
		"\u0000\u0327\u0329\u0001\u0000\u0000\u0000\u0328\u0326\u0001\u0000\u0000"+
		"\u0000\u0329\u032a\u0005:\u0000\u0000\u032aw\u0001\u0000\u0000\u0000\u032b"+
		"\u032c\u0005\u001e\u0000\u0000\u032c\u032d\u0003v;\u0000\u032dy\u0001"+
		"\u0000\u0000\u0000\u032e\u032f\u0005\u001f\u0000\u0000\u032f\u0330\u0003"+
		"v;\u0000\u0330{\u0001\u0000\u0000\u0000\u0331\u0335\u0003P(\u0000\u0332"+
		"\u0333\u0003R)\u0000\u0333\u0334\u0003P(\u0000\u0334\u0336\u0001\u0000"+
		"\u0000\u0000\u0335\u0332\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000"+
		"\u0000\u0000\u0336}\u0001\u0000\u0000\u0000\u0337\u0339\u0003B!\u0000"+
		"\u0338\u033a\u0005L\u0000\u0000\u0339\u0338\u0001\u0000\u0000\u0000\u033a"+
		"\u033b\u0001\u0000\u0000\u0000\u033b\u0339\u0001\u0000\u0000\u0000\u033b"+
		"\u033c\u0001\u0000\u0000\u0000\u033c\u033d\u0001\u0000\u0000\u0000\u033d"+
		"\u033e\u0003P(\u0000\u033e\u007f\u0001\u0000\u0000\u0000\u033f\u0340\u0005"+
		"W\u0000\u0000\u0340\u0341\u0005K\u0000\u0000\u0341\u0342\u0005\u0011\u0000"+
		"\u0000\u0342\u0343\u0005K\u0000\u0000\u0343\u0344\u0005\u0012\u0000\u0000"+
		"\u0344\u0345\u00057\u0000\u0000\u0345\u0346\u00055\u0000\u0000\u0346\u034b"+
		"\u0003\u0084B\u0000\u0347\u0348\u0005I\u0000\u0000\u0348\u034a\u0003\u0084"+
		"B\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u034a\u034d\u0001\u0000\u0000"+
		"\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000"+
		"\u0000\u034c\u034e\u0001\u0000\u0000\u0000\u034d\u034b\u0001\u0000\u0000"+
		"\u0000\u034e\u034f\u00056\u0000\u0000\u034f\u0350\u00058\u0000\u0000\u0350"+
		"\u0351\u0005H\u0000\u0000\u0351\u0081\u0001\u0000\u0000\u0000\u0352\u0354"+
		"\u0005$\u0000\u0000\u0353\u0352\u0001\u0000\u0000\u0000\u0353\u0354\u0001"+
		"\u0000\u0000\u0000\u0354\u0356\u0001\u0000\u0000\u0000\u0355\u0357\u0005"+
		"7\u0000\u0000\u0356\u0355\u0001\u0000\u0000\u0000\u0356\u0357\u0001\u0000"+
		"\u0000\u0000\u0357\u035b\u0001\u0000\u0000\u0000\u0358\u035a\u0003B!\u0000"+
		"\u0359\u0358\u0001\u0000\u0000\u0000\u035a\u035d\u0001\u0000\u0000\u0000"+
		"\u035b\u0359\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000"+
		"\u035c\u035e\u0001\u0000\u0000\u0000\u035d\u035b\u0001\u0000\u0000\u0000"+
		"\u035e\u0362\u00057\u0000\u0000\u035f\u0361\u00059\u0000\u0000\u0360\u035f"+
		"\u0001\u0000\u0000\u0000\u0361\u0364\u0001\u0000\u0000\u0000\u0362\u0360"+
		"\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000\u0363\u0368"+
		"\u0001\u0000\u0000\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0365\u0367"+
		"\u0003\u0084B\u0000\u0366\u0365\u0001\u0000\u0000\u0000\u0367\u036a\u0001"+
		"\u0000\u0000\u0000\u0368\u0366\u0001\u0000\u0000\u0000\u0368\u0369\u0001"+
		"\u0000\u0000\u0000\u0369\u036e\u0001\u0000\u0000\u0000\u036a\u0368\u0001"+
		"\u0000\u0000\u0000\u036b\u036d\u0005:\u0000\u0000\u036c\u036b\u0001\u0000"+
		"\u0000\u0000\u036d\u0370\u0001\u0000\u0000\u0000\u036e\u036c\u0001\u0000"+
		"\u0000\u0000\u036e\u036f\u0001\u0000\u0000\u0000\u036f\u0374\u0001\u0000"+
		"\u0000\u0000\u0370\u036e\u0001\u0000\u0000\u0000\u0371\u0373\u00058\u0000"+
		"\u0000\u0372\u0371\u0001\u0000\u0000\u0000\u0373\u0376\u0001\u0000\u0000"+
		"\u0000\u0374\u0372\u0001\u0000\u0000\u0000\u0374\u0375\u0001\u0000\u0000"+
		"\u0000\u0375\u0377\u0001\u0000\u0000\u0000\u0376\u0374\u0001\u0000\u0000"+
		"\u0000\u0377\u0378\u0005H\u0000\u0000\u0378\u0083\u0001\u0000\u0000\u0000"+
		"\u0379\u037d\u0003P(\u0000\u037a\u037d\u0003\u00a4R\u0000\u037b\u037d"+
		"\u0003B!\u0000\u037c\u0379\u0001\u0000\u0000\u0000\u037c\u037a\u0001\u0000"+
		"\u0000\u0000\u037c\u037b\u0001\u0000\u0000\u0000\u037d\u0085\u0001\u0000"+
		"\u0000\u0000\u037e\u038d\u0003P(\u0000\u037f\u038d\u0003\u0080@\u0000"+
		"\u0380\u038d\u0003t:\u0000\u0381\u038d\u0003\u00a4R\u0000\u0382\u038d"+
		"\u0003\u0098L\u0000\u0383\u038d\u0003x<\u0000\u0384\u038d\u0003z=\u0000"+
		"\u0385\u038d\u0003>\u001f\u0000\u0386\u038d\u0003\u0082A\u0000\u0387\u038d"+
		"\u0003\u0088D\u0000\u0388\u038d\u0003B!\u0000\u0389\u038d\u0003V+\u0000"+
		"\u038a\u038d\u0003~?\u0000\u038b\u038d\u0003|>\u0000\u038c\u037e\u0001"+
		"\u0000\u0000\u0000\u038c\u037f\u0001\u0000\u0000\u0000\u038c\u0380\u0001"+
		"\u0000\u0000\u0000\u038c\u0381\u0001\u0000\u0000\u0000\u038c\u0382\u0001"+
		"\u0000\u0000\u0000\u038c\u0383\u0001\u0000\u0000\u0000\u038c\u0384\u0001"+
		"\u0000\u0000\u0000\u038c\u0385\u0001\u0000\u0000\u0000\u038c\u0386\u0001"+
		"\u0000\u0000\u0000\u038c\u0387\u0001\u0000\u0000\u0000\u038c\u0388\u0001"+
		"\u0000\u0000\u0000\u038c\u0389\u0001\u0000\u0000\u0000\u038c\u038a\u0001"+
		"\u0000\u0000\u0000\u038c\u038b\u0001\u0000\u0000\u0000\u038d\u0087\u0001"+
		"\u0000\u0000\u0000\u038e\u038f\u0005)\u0000\u0000\u038f\u0390\u0005Y\u0000"+
		"\u0000\u0390\u0395\u0003\u008aE\u0000\u0391\u0392\u0005*\u0000\u0000\u0392"+
		"\u0393\u0005b\u0000\u0000\u0393\u0395\u0003\u008eG\u0000\u0394\u038e\u0001"+
		"\u0000\u0000\u0000\u0394\u0391\u0001\u0000\u0000\u0000\u0395\u0089\u0001"+
		"\u0000\u0000\u0000\u0396\u039a\u0005Z\u0000\u0000\u0397\u0399\u0003\u008c"+
		"F\u0000\u0398\u0397\u0001\u0000\u0000\u0000\u0399\u039c\u0001\u0000\u0000"+
		"\u0000\u039a\u0398\u0001\u0000\u0000\u0000\u039a\u039b\u0001\u0000\u0000"+
		"\u0000\u039b\u039d\u0001\u0000\u0000\u0000\u039c\u039a\u0001\u0000\u0000"+
		"\u0000\u039d\u039e\u0005_\u0000\u0000\u039e\u008b\u0001\u0000\u0000\u0000"+
		"\u039f\u03a0\u0005[\u0000\u0000\u03a0\u03a1\u0005^\u0000\u0000\u03a1\u03a2"+
		"\u0005]\u0000\u0000\u03a2\u03aa\u0005^\u0000\u0000\u03a3\u03a5\u0005\\"+
		"\u0000\u0000\u03a4\u03a3\u0001\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000"+
		"\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6\u03a7\u0005[\u0000"+
		"\u0000\u03a7\u03a8\u0005^\u0000\u0000\u03a8\u03a9\u0005Y\u0000\u0000\u03a9"+
		"\u03ab\u0005^\u0000\u0000\u03aa\u03a4\u0001\u0000\u0000\u0000\u03aa\u03ab"+
		"\u0001\u0000\u0000\u0000\u03ab\u008d\u0001\u0000\u0000\u0000\u03ac\u03ad"+
		"\u0005d\u0000\u0000\u03ad\u03ae\u0003\u0090H\u0000\u03ae\u03af\u0005\u0080"+
		"\u0000\u0000\u03af\u008f\u0001\u0000\u0000\u0000\u03b0\u03b4\u0005\u007f"+
		"\u0000\u0000\u03b1\u03b2\u0003\u0092I\u0000\u03b2\u03b3\u0005c\u0000\u0000"+
		"\u03b3\u03b5\u0001\u0000\u0000\u0000\u03b4\u03b1\u0001\u0000\u0000\u0000"+
		"\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5\u03d0\u0001\u0000\u0000\u0000"+
		"\u03b6\u03be\u0003\u0094J\u0000\u03b7\u03b8\u0005x\u0000\u0000\u03b8\u03ba"+
		"\u0005a\u0000\u0000\u03b9\u03b7\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001"+
		"\u0000\u0000\u0000\u03ba\u03bb\u0001\u0000\u0000\u0000\u03bb\u03bc\u0003"+
		"\u0092I\u0000\u03bc\u03bd\u0007\u0007\u0000\u0000\u03bd\u03bf\u0001\u0000"+
		"\u0000\u0000\u03be\u03b9\u0001\u0000\u0000\u0000\u03be\u03bf\u0001\u0000"+
		"\u0000\u0000\u03bf\u03d0\u0001\u0000\u0000\u0000\u03c0\u03cd\u0003\u0094"+
		"J\u0000\u03c1\u03c2\u0005{\u0000\u0000\u03c2\u03c3\u0005\u007f\u0000\u0000"+
		"\u03c3\u03c4\u0005v\u0000\u0000\u03c4\u03c7\u0003\u0094J\u0000\u03c5\u03c6"+
		"\u0005x\u0000\u0000\u03c6\u03c8\u0005a\u0000\u0000\u03c7\u03c5\u0001\u0000"+
		"\u0000\u0000\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000"+
		"\u0000\u0000\u03c9\u03ca\u0003\u0092I\u0000\u03ca\u03cb\u0005\u007f\u0000"+
		"\u0000\u03cb\u03cc\u0005|\u0000\u0000\u03cc\u03ce\u0001\u0000\u0000\u0000"+
		"\u03cd\u03c1\u0001\u0000\u0000\u0000\u03cd\u03ce\u0001\u0000\u0000\u0000"+
		"\u03ce\u03d0\u0001\u0000\u0000\u0000\u03cf\u03b0\u0001\u0000\u0000\u0000"+
		"\u03cf\u03b6\u0001\u0000\u0000\u0000\u03cf\u03c0\u0001\u0000\u0000\u0000"+
		"\u03d0\u0091\u0001\u0000\u0000\u0000\u03d1\u03d2\u0007\b\u0000\u0000\u03d2"+
		"\u0093\u0001\u0000\u0000\u0000\u03d3\u03d5\u0005h\u0000\u0000\u03d4\u03d3"+
		"\u0001\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d6"+
		"\u0001\u0000\u0000\u0000\u03d6\u03d9\u0005\u007f\u0000\u0000\u03d7\u03d8"+
		"\u0005t\u0000\u0000\u03d8\u03da\u0005\u007f\u0000\u0000\u03d9\u03d7\u0001"+
		"\u0000\u0000\u0000\u03d9\u03da\u0001\u0000\u0000\u0000\u03da\u0095\u0001"+
		"\u0000\u0000\u0000\u03db\u03dc\u0005\f\u0000\u0000\u03dc\u03e0\u00057"+
		"\u0000\u0000\u03dd\u03df\u0003&\u0013\u0000\u03de\u03dd\u0001\u0000\u0000"+
		"\u0000\u03df\u03e2\u0001\u0000\u0000\u0000\u03e0\u03de\u0001\u0000\u0000"+
		"\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1\u03e3\u0001\u0000\u0000"+
		"\u0000\u03e2\u03e0\u0001\u0000\u0000\u0000\u03e3\u03e4\u00058\u0000\u0000"+
		"\u03e4\u0097\u0001\u0000\u0000\u0000\u03e5\u03e6\u0005W\u0000\u0000\u03e6"+
		"\u03e7\u0005L\u0000\u0000\u03e7\u03e8\u0003j5\u0000\u03e8\u03e9\u0005"+
		"J\u0000\u0000\u03e9\u03ea\u0003j5\u0000\u03ea\u03f6\u0001\u0000\u0000"+
		"\u0000\u03eb\u03ec\u0003\u0096K\u0000\u03ec\u03ed\u0005\u000e\u0000\u0000"+
		"\u03ed\u03ee\u0005H\u0000\u0000\u03ee\u03f6\u0001\u0000\u0000\u0000\u03ef"+
		"\u03f0\u0003\u0096K\u0000\u03f0\u03f3\u0003v;\u0000\u03f1\u03f2\u0005"+
		"\r\u0000\u0000\u03f2\u03f4\u0003v;\u0000\u03f3\u03f1\u0001\u0000\u0000"+
		"\u0000\u03f3\u03f4\u0001\u0000\u0000\u0000\u03f4\u03f6\u0001\u0000\u0000"+
		"\u0000\u03f5\u03e5\u0001\u0000\u0000\u0000\u03f5\u03eb\u0001\u0000\u0000"+
		"\u0000\u03f5\u03ef\u0001\u0000\u0000\u0000\u03f6\u0099\u0001\u0000\u0000"+
		"\u0000\u03f7\u03f8\u0007\t\u0000\u0000\u03f8\u009b\u0001\u0000\u0000\u0000"+
		"\u03f9\u03fc\u0003j5\u0000\u03fa\u03fb\u0005+\u0000\u0000\u03fb\u03fd"+
		"\u0003j5\u0000\u03fc\u03fa\u0001\u0000\u0000\u0000\u03fc\u03fd\u0001\u0000"+
		"\u0000\u0000\u03fd\u009d\u0001\u0000\u0000\u0000\u03fe\u0400\u0005W\u0000"+
		"\u0000\u03ff\u03fe\u0001\u0000\u0000\u0000\u0400\u0403\u0001\u0000\u0000"+
		"\u0000\u0401\u03ff\u0001\u0000\u0000\u0000\u0401\u0402\u0001\u0000\u0000"+
		"\u0000\u0402\u0404\u0001\u0000\u0000\u0000\u0403\u0401\u0001\u0000\u0000"+
		"\u0000\u0404\u0407\u0003N\'\u0000\u0405\u0406\u0005K\u0000\u0000\u0406"+
		"\u0408\u0003\u00a0P\u0000\u0407\u0405\u0001\u0000\u0000\u0000\u0407\u0408"+
		"\u0001\u0000\u0000\u0000\u0408\u009f\u0001\u0000\u0000\u0000\u0409\u040a"+
		"\u0005(\u0000\u0000\u040a\u040b\u0003N\'\u0000\u040b\u00a1\u0001\u0000"+
		"\u0000\u0000\u040c\u040d\u0005J\u0000\u0000\u040d\u0412\u0003\u009cN\u0000"+
		"\u040e\u040f\u00055\u0000\u0000\u040f\u0411\u00056\u0000\u0000\u0410\u040e"+
		"\u0001\u0000\u0000\u0000\u0411\u0414\u0001\u0000\u0000\u0000\u0412\u0410"+
		"\u0001\u0000\u0000\u0000\u0412\u0413\u0001\u0000\u0000\u0000\u0413\u0415"+
		"\u0001\u0000\u0000\u0000\u0414\u0412\u0001\u0000\u0000\u0000\u0415\u0416"+
		"\u0005N\u0000\u0000\u0416\u0417\u0003&\u0013\u0000\u0417\u0426\u0001\u0000"+
		"\u0000\u0000\u0418\u041b\u0007\n\u0000\u0000\u0419\u041c\u0003&\u0013"+
		"\u0000\u041a\u041c\u00038\u001c\u0000\u041b\u0419\u0001\u0000\u0000\u0000"+
		"\u041b\u041a\u0001\u0000\u0000\u0000\u041c\u0420\u0001\u0000\u0000\u0000"+
		"\u041d\u041f\u0005I\u0000\u0000\u041e\u041d\u0001\u0000\u0000\u0000\u041f"+
		"\u0422\u0001\u0000\u0000\u0000\u0420\u041e\u0001\u0000\u0000\u0000\u0420"+
		"\u0421\u0001\u0000\u0000\u0000\u0421\u0426\u0001\u0000\u0000\u0000\u0422"+
		"\u0420\u0001\u0000\u0000\u0000\u0423\u0424\u0005N\u0000\u0000\u0424\u0426"+
		"\u0003\u009eO\u0000\u0425\u040c\u0001\u0000\u0000\u0000\u0425\u0418\u0001"+
		"\u0000\u0000\u0000\u0425\u0423\u0001\u0000\u0000\u0000\u0426\u00a3\u0001"+
		"\u0000\u0000\u0000\u0427\u0429\u0003\u009aM\u0000\u0428\u0427\u0001\u0000"+
		"\u0000\u0000\u0428\u0429\u0001\u0000\u0000\u0000\u0429\u042b\u0001\u0000"+
		"\u0000\u0000\u042a\u042c\u0003B!\u0000\u042b\u042a\u0001\u0000\u0000\u0000"+
		"\u042c\u042d\u0001\u0000\u0000\u0000\u042d\u042b\u0001\u0000\u0000\u0000"+
		"\u042d\u042e\u0001\u0000\u0000\u0000\u042e\u0430\u0001\u0000\u0000\u0000"+
		"\u042f\u0431\u0005L\u0000\u0000\u0430\u042f\u0001\u0000\u0000\u0000\u0430"+
		"\u0431\u0001\u0000\u0000\u0000\u0431\u0432\u0001\u0000\u0000\u0000\u0432"+
		"\u0434\u0003\u00a2Q\u0000\u0433\u0435\u0005H\u0000\u0000\u0434\u0433\u0001"+
		"\u0000\u0000\u0000\u0434\u0435\u0001\u0000\u0000\u0000\u0435\u00a5\u0001"+
		"\u0000\u0000\u0000\u0436\u0437\u0003\u009aM\u0000\u0437\u0438\u0005W\u0000"+
		"\u0000\u0438\u0439\u0005N\u0000\u0000\u0439\u043c\u0003N\'\u0000\u043a"+
		"\u043b\u0005J\u0000\u0000\u043b\u043d\u0003j5\u0000\u043c\u043a\u0001"+
		"\u0000\u0000\u0000\u043c\u043d\u0001\u0000\u0000\u0000\u043d\u043e\u0001"+
		"\u0000\u0000\u0000\u043e\u043f\u0005=\u0000\u0000\u043f\u0440\u0003.\u0017"+
		"\u0000\u0440\u0441\u0005H\u0000\u0000\u0441\u0457\u0001\u0000\u0000\u0000"+
		"\u0442\u0443\u0003B!\u0000\u0443\u0445\u0005N\u0000\u0000\u0444\u0446"+
		"\u0003N\'\u0000\u0445\u0444\u0001\u0000\u0000\u0000\u0445\u0446\u0001"+
		"\u0000\u0000\u0000\u0446\u0449\u0001\u0000\u0000\u0000\u0447\u0448\u0005"+
		"J\u0000\u0000\u0448\u044a\u0003j5\u0000\u0449\u0447\u0001\u0000\u0000"+
		"\u0000\u0449\u044a\u0001\u0000\u0000\u0000\u044a\u044b\u0001\u0000\u0000"+
		"\u0000\u044b\u044c\u0005=\u0000\u0000\u044c\u0450\u00059\u0000\u0000\u044d"+
		"\u044f\u0003.\u0017\u0000\u044e\u044d\u0001\u0000\u0000\u0000\u044f\u0452"+
		"\u0001\u0000\u0000\u0000\u0450\u044e\u0001\u0000\u0000\u0000\u0450\u0451"+
		"\u0001\u0000\u0000\u0000\u0451\u0453\u0001\u0000\u0000\u0000\u0452\u0450"+
		"\u0001\u0000\u0000\u0000\u0453\u0454\u0005:\u0000\u0000\u0454\u0455\u0005"+
		"H\u0000\u0000\u0455\u0457\u0001\u0000\u0000\u0000\u0456\u0436\u0001\u0000"+
		"\u0000\u0000\u0456\u0442\u0001\u0000\u0000\u0000\u0457\u00a7\u0001\u0000"+
		"\u0000\u0000y\u00ab\u00b2\u00bb\u00cc\u00d3\u00d7\u00df\u00ef\u00f4\u00f9"+
		"\u0109\u010f\u0120\u0127\u012e\u0130\u0135\u013a\u013e\u0145\u0160\u017e"+
		"\u0183\u018a\u018e\u0190\u019c\u019f\u01b6\u01bb\u01c0\u01c8\u01d9\u01dd"+
		"\u01e3\u01e8\u01ec\u01f1\u01f4\u01f8\u0202\u0206\u020e\u0215\u0219\u0220"+
		"\u022e\u0231\u0234\u023b\u0242\u0245\u024b\u025c\u0269\u026f\u0271\u0274"+
		"\u027b\u0284\u0288\u028f\u0296\u0298\u02a8\u02ab\u02b2\u02b8\u02c1\u02cb"+
		"\u02e0\u02ea\u02f4\u030d\u0316\u031b\u031e\u0326\u0335\u033b\u034b\u0353"+
		"\u0356\u035b\u0362\u0368\u036e\u0374\u037c\u038c\u0394\u039a\u03a4\u03aa"+
		"\u03b4\u03b9\u03be\u03c7\u03cd\u03cf\u03d4\u03d9\u03e0\u03f3\u03f5\u03fc"+
		"\u0401\u0407\u0412\u041b\u0420\u0425\u0428\u042d\u0430\u0434\u043c\u0445"+
		"\u0449\u0450\u0456";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}