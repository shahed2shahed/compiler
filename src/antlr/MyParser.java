// Generated from C:/Users/ASUS/Desktop/compiler/src/antlr/MyParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, CLICK=2, FROM=3, LET=4, VAR=5, CONST=6, OF=7, ARRAY=8, FUNCTION=9, 
		IMPLEMENTS=10, IF=11, ELSE=12, RETURN=13, AS=14, AT=15, ROUTER=16, NAVIGATE=17, 
		COMPONENT=18, SELECTOR=19, STANDALONE=20, IMPORTS=21, TEMPLATE=22, EXPORT=23, 
		EXPORTS=24, INTERFACE=25, NGMODULE=26, INJECTABLE=27, CLASS=28, TRY=29, 
		CATCH=30, CONSOLE=31, ERROR=32, LOG=33, ANY=34, NUMBER=35, STRING_EX=36, 
		VOID=37, NULL=38, TOSTRING=39, NgFor=40, NgIf=41, BIT_OR=42, AND=43, OR=44, 
		NOT=45, EQUAL_EQUAL=46, EQUALTHIRD=47, NOT_EQUAL=48, NOT_EQUAL_EQUAL=49, 
		LT_EQUAL=50, GT_EQUAL=51, SQUARE_OPEN_BRACKET=52, SQUARE_CLOSE_BRACKET=53, 
		OPEN_BRACKET=54, CLOSE_BRACKET=55, CURLY_OPEN_BRACKET=56, CURLY_CLOSE_BRACKET=57, 
		DOUBLE_CURLY_OPEN_BRACKET=58, DOUBLE_CURLY_CLOSE_BRACKET=59, ARROW=60, 
		LT=61, GT=62, SLASH=63, DQUOT=64, QUOT=65, STRING=66, NUMBER_VAL=67, BOOLEAN=68, 
		AccessModifiers=69, BEHAVIORSUBJECT=70, SEMI_COLON=71, COMMA=72, COLON=73, 
		DOT=74, QUESTION_MARK=75, HASH_TAG=76, EQUAL=77, PLUS=78, MIN=79, MULT=80, 
		S_DOlOR=81, WS=82, NEWLINE=83, MultiLineComment=84, SingleLineComment=85, 
		IDENTIFIER=86, WS1=87, EQUAL1=88, DQUOT1=89, LET1=90, SEMI_COLON5=91, 
		OF1=92, ID1=93, DQUOT2=94, WS2=95, NUMBER_VAL1=96, EQUAL2=97, NULL1=98, 
		DQUOT3=99, BIT_OR1=100, AND1=101, OR1=102, NOT1=103, EQUAL_EQUAL1=104, 
		EQUAL_EQUAL2=105, NOT_EQUAL1=106, NOT_EQUAL2=107, LT_EQUAL1=108, GT_EQUAL1=109, 
		PLUS1=110, MIN1=111, MULT1=112, COMMA1=113, COLON1=114, DOT1=115, QUESTION_MARK1=116, 
		ARROW1=117, LT1=118, GT1=119, SQUARE_OPEN_BRACKET1=120, SQUARE_CLOSE_BRACKET1=121, 
		OPEN_BRACKET1=122, CLOSE_BRACKET1=123, CURLY_OPEN_BRACKET1=124, CURLY_CLOSE_BRACKET1=125, 
		ID2=126, DQUOT4=127, WS3=128, CLOSE_BRACKET2=129, NUMBER_VAL2=130, EQUAL3=131, 
		NOT2=132, PLUS2=133, MIN2=134, MULT2=135, DOT3=136, DQUOT5=137, ID3=138, 
		OPEN_BRACKET2=139, DQUOT6=140;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importStatment = 2, RULE_module = 3, 
		RULE_componentDeclaration = 4, RULE_componentBody = 5, RULE_selectorProperty = 6, 
		RULE_standaloneProperty = 7, RULE_propertyFun = 8, RULE_propertyStat = 9, 
		RULE_importsProperty = 10, RULE_exportsProperty = 11, RULE_bootstrapProperty = 12, 
		RULE_templateProperty = 13, RULE_componentEle = 14, RULE_classType = 15, 
		RULE_classRelation = 16, RULE_classStatment = 17, RULE_types = 18, RULE_brackets = 19, 
		RULE_stateManagement = 20, RULE_expressionInBody = 21, RULE_body = 22, 
		RULE_print_error = 23, RULE_print_stat = 24, RULE_functionCall = 25, RULE_argumentList = 26, 
		RULE_conditions = 27, RULE_returnType = 28, RULE_returnStat = 29, RULE_objectLiteral = 30, 
		RULE_objectProperty = 31, RULE_propertyAccess = 32, RULE_functionDeclarationStat = 33, 
		RULE_normalfunctionDecl = 34, RULE_functionDeclaration = 35, RULE_parametersType = 36, 
		RULE_parametersContent = 37, RULE_parameters = 38, RULE_values = 39, RULE_operations = 40, 
		RULE_subDotAssignment = 41, RULE_assignment = 42, RULE_templateExpression = 43, 
		RULE_eventBinding = 44, RULE_htmlDeclare = 45, RULE_normalHtmlTag = 46, 
		RULE_selfClosingTag = 47, RULE_openTag = 48, RULE_closeTag = 49, RULE_simpleArray = 50, 
		RULE_map = 51, RULE_type = 52, RULE_primitiveType = 53, RULE_arrayStringType = 54, 
		RULE_arrayNumberType = 55, RULE_marks = 56, RULE_arrayDeclaration = 57, 
		RULE_conditionStat = 58, RULE_tryStat = 59, RULE_catchStat = 60, RULE_operationExpr = 61, 
		RULE_questionCondition = 62, RULE_navigate = 63, RULE_functionExp = 64, 
		RULE_expression = 65, RULE_directivesStatment = 66, RULE_ngForValue = 67, 
		RULE_ngForExpression = 68, RULE_ngIfValue = 69, RULE_conditionExpression = 70, 
		RULE_equalOperation = 71, RULE_logicalTerm = 72, RULE_ifStat = 73, RULE_ifElseStat = 74, 
		RULE_variable_type = 75, RULE_unionType = 76, RULE_newObjectFromClass = 77, 
		RULE_toStringNode = 78, RULE_variableDeclarationStat = 79, RULE_variableDeclaration = 80, 
		RULE_arrowFunction = 81;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStatment", "module", "componentDeclaration", 
			"componentBody", "selectorProperty", "standaloneProperty", "propertyFun", 
			"propertyStat", "importsProperty", "exportsProperty", "bootstrapProperty", 
			"templateProperty", "componentEle", "classType", "classRelation", "classStatment", 
			"types", "brackets", "stateManagement", "expressionInBody", "body", "print_error", 
			"print_stat", "functionCall", "argumentList", "conditions", "returnType", 
			"returnStat", "objectLiteral", "objectProperty", "propertyAccess", "functionDeclarationStat", 
			"normalfunctionDecl", "functionDeclaration", "parametersType", "parametersContent", 
			"parameters", "values", "operations", "subDotAssignment", "assignment", 
			"templateExpression", "eventBinding", "htmlDeclare", "normalHtmlTag", 
			"selfClosingTag", "openTag", "closeTag", "simpleArray", "map", "type", 
			"primitiveType", "arrayStringType", "arrayNumberType", "marks", "arrayDeclaration", 
			"conditionStat", "tryStat", "catchStat", "operationExpr", "questionCondition", 
			"navigate", "functionExp", "expression", "directivesStatment", "ngForValue", 
			"ngForExpression", "ngIfValue", "conditionExpression", "equalOperation", 
			"logicalTerm", "ifStat", "ifElseStat", "variable_type", "unionType", 
			"newObjectFromClass", "toStringNode", "variableDeclarationStat", "variableDeclaration", 
			"arrowFunction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'click'", "'from'", null, "'var'", "'const'", null, 
			"'Array'", "'function'", "'implements'", "'if'", "'else'", "'return'", 
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
			null, "IMPORT", "CLICK", "FROM", "LET", "VAR", "CONST", "OF", "ARRAY", 
			"FUNCTION", "IMPLEMENTS", "IF", "ELSE", "RETURN", "AS", "AT", "ROUTER", 
			"NAVIGATE", "COMPONENT", "SELECTOR", "STANDALONE", "IMPORTS", "TEMPLATE", 
			"EXPORT", "EXPORTS", "INTERFACE", "NGMODULE", "INJECTABLE", "CLASS", 
			"TRY", "CATCH", "CONSOLE", "ERROR", "LOG", "ANY", "NUMBER", "STRING_EX", 
			"VOID", "NULL", "TOSTRING", "NgFor", "NgIf", "BIT_OR", "AND", "OR", "NOT", 
			"EQUAL_EQUAL", "EQUALTHIRD", "NOT_EQUAL", "NOT_EQUAL_EQUAL", "LT_EQUAL", 
			"GT_EQUAL", "SQUARE_OPEN_BRACKET", "SQUARE_CLOSE_BRACKET", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "CURLY_OPEN_BRACKET", "CURLY_CLOSE_BRACKET", "DOUBLE_CURLY_OPEN_BRACKET", 
			"DOUBLE_CURLY_CLOSE_BRACKET", "ARROW", "LT", "GT", "SLASH", "DQUOT", 
			"QUOT", "STRING", "NUMBER_VAL", "BOOLEAN", "AccessModifiers", "BEHAVIORSUBJECT", 
			"SEMI_COLON", "COMMA", "COLON", "DOT", "QUESTION_MARK", "HASH_TAG", "EQUAL", 
			"PLUS", "MIN", "MULT", "S_DOlOR", "WS", "NEWLINE", "MultiLineComment", 
			"SingleLineComment", "IDENTIFIER", "WS1", "EQUAL1", "DQUOT1", "LET1", 
			"SEMI_COLON5", "OF1", "ID1", "DQUOT2", "WS2", "NUMBER_VAL1", "EQUAL2", 
			"NULL1", "DQUOT3", "BIT_OR1", "AND1", "OR1", "NOT1", "EQUAL_EQUAL1", 
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
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 209977346L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(164);
				statement();
				}
				}
				setState(169);
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
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				importStatment();
				}
				break;
			case COMPONENT:
			case NGMODULE:
			case INJECTABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				componentDeclaration();
				}
				break;
			case EXPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				classStatment();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
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
			setState(176);
			match(IMPORT);
			setState(177);
			match(CURLY_OPEN_BRACKET);
			setState(178);
			_la = _input.LA(1);
			if ( !(_la==BEHAVIORSUBJECT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(179);
				match(COMMA);
				setState(180);
				match(IDENTIFIER);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(CURLY_CLOSE_BRACKET);
			setState(187);
			match(FROM);
			setState(188);
			match(STRING);
			setState(189);
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
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 201588736L) != 0)) ) {
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
			setState(193);
			module();
			setState(194);
			match(OPEN_BRACKET);
			setState(195);
			match(CURLY_OPEN_BRACKET);
			setState(196);
			componentBody();
			setState(197);
			match(CURLY_CLOSE_BRACKET);
			setState(198);
			match(CLOSE_BRACKET);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(199);
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
			setState(202);
			componentEle();
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					match(COMMA);
					setState(204);
					componentEle();
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(210);
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
		enterRule(_localctx, 12, RULE_selectorProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(SELECTOR);
			setState(214);
			match(COLON);
			setState(215);
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
		enterRule(_localctx, 14, RULE_standaloneProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(STANDALONE);
			setState(218);
			match(COLON);
			setState(219);
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
		enterRule(_localctx, 16, RULE_propertyFun);
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
		enterRule(_localctx, 18, RULE_propertyStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(COLON);
			setState(224);
			match(SQUARE_OPEN_BRACKET);
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(225);
				match(IDENTIFIER);
				}
				break;
			case SQUARE_CLOSE_BRACKET:
			case COMMA:
				{
				setState(226);
				propertyFun();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(229);
				match(COMMA);
				setState(230);
				match(IDENTIFIER);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
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
		enterRule(_localctx, 20, RULE_importsProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(IMPORTS);
			setState(239);
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
		enterRule(_localctx, 22, RULE_exportsProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(EXPORTS);
			setState(242);
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
		enterRule(_localctx, 24, RULE_bootstrapProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(IDENTIFIER);
			setState(245);
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
		enterRule(_localctx, 26, RULE_templateProperty);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE:
				_localctx = new TemplateHtmlDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(TEMPLATE);
				setState(248);
				match(COLON);
				setState(249);
				match(QUOT);
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(250);
					htmlDeclare();
					}
					}
					setState(253); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LT );
				setState(255);
				match(QUOT);
				}
				break;
			case IDENTIFIER:
				_localctx = new TemplateHtmlUrlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(IDENTIFIER);
				setState(258);
				match(COLON);
				setState(259);
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
		enterRule(_localctx, 28, RULE_componentEle);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				selectorProperty();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				standaloneProperty();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				importsProperty();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				exportsProperty();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				bootstrapProperty();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
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
		enterRule(_localctx, 30, RULE_classType);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPLEMENTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(IMPLEMENTS);
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(INTERFACE);
				}
				break;
			case LET:
			case VAR:
			case CONST:
			case AccessModifiers:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
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
		enterRule(_localctx, 32, RULE_classRelation);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				_localctx = new CommonRelationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(CLASS);
				setState(276);
				match(IDENTIFIER);
				setState(280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(277);
					classType();
					setState(278);
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
				setState(282);
				classType();
				setState(283);
				match(IDENTIFIER);
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(284);
					match(COLON);
					setState(285);
					match(IDENTIFIER);
					setState(286);
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
		enterRule(_localctx, 34, RULE_classStatment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(EXPORT);
			setState(292);
			classRelation();
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(293);
				match(CURLY_OPEN_BRACKET);
				}
				break;
			}
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					body();
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_CLOSE_BRACKET) {
				{
				setState(302);
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
		enterRule(_localctx, 36, RULE_types);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				marks();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				eventBinding();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
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
		enterRule(_localctx, 38, RULE_brackets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(OPEN_BRACKET);
			setState(313);
			match(SQUARE_OPEN_BRACKET);
			setState(314);
			match(SQUARE_CLOSE_BRACKET);
			setState(315);
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
		enterRule(_localctx, 40, RULE_stateManagement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			variable_type();
			setState(318);
			match(IDENTIFIER);
			setState(319);
			match(S_DOlOR);
			setState(320);
			match(EQUAL);
			setState(321);
			match(IDENTIFIER);
			setState(322);
			match(BEHAVIORSUBJECT);
			setState(323);
			match(LT);
			setState(324);
			simpleArray();
			setState(325);
			match(GT);
			setState(326);
			brackets();
			setState(327);
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
		enterRule(_localctx, 42, RULE_expressionInBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
		enterRule(_localctx, 44, RULE_body);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				print_stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				print_error();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				expressionInBody();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				stateManagement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(336);
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
		enterRule(_localctx, 46, RULE_print_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(CONSOLE);
			setState(340);
			match(DOT);
			setState(341);
			match(ERROR);
			setState(342);
			match(OPEN_BRACKET);
			setState(343);
			values();
			setState(344);
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
		enterRule(_localctx, 48, RULE_print_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(CONSOLE);
			setState(347);
			match(DOT);
			setState(348);
			match(LOG);
			setState(349);
			match(OPEN_BRACKET);
			setState(350);
			values();
			setState(351);
			match(CLOSE_BRACKET);
			setState(352);
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
		enterRule(_localctx, 50, RULE_functionCall);
		int _la;
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new CallFunctionParaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(IDENTIFIER);
				setState(355);
				parameters();
				setState(356);
				match(DOT);
				setState(357);
				match(CATCH);
				setState(358);
				match(OPEN_BRACKET);
				setState(359);
				parameters();
				setState(360);
				match(ARROW);
				setState(361);
				print_error();
				setState(362);
				match(CLOSE_BRACKET);
				setState(363);
				match(SEMI_COLON);
				}
				break;
			case 2:
				_localctx = new MethodCallWithValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				propertyAccess();
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(366);
					match(IDENTIFIER);
					}
				}

				setState(369);
				parameters();
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(370);
					match(AS);
					setState(371);
					simpleArray();
					}
				}

				setState(374);
				match(SEMI_COLON);
				}
				break;
			case 3:
				_localctx = new MethodCallWithListValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				propertyAccess();
				setState(377);
				match(OPEN_BRACKET);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 94578892320278640L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1048591L) != 0)) {
					{
					setState(378);
					argumentList();
					}
				}

				setState(381);
				match(CLOSE_BRACKET);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_COLON) {
					{
					setState(382);
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
		enterRule(_localctx, 52, RULE_argumentList);
		int _la;
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new ObjectLiteralArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				objectLiteral();
				}
				break;
			case 2:
				_localctx = new WithObjectPropertyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(SQUARE_OPEN_BRACKET);
				setState(389);
				objectProperty();
				setState(390);
				match(SQUARE_CLOSE_BRACKET);
				}
				break;
			case 3:
				_localctx = new WithExpressionArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				expression();
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(393);
					match(COMMA);
					setState(394);
					expression();
					}
					}
					setState(399);
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
		enterRule(_localctx, 54, RULE_conditions);
		int _la;
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new ConditionEqualtyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				propertyAccess();
				setState(403);
				match(OPEN_BRACKET);
				setState(404);
				match(IDENTIFIER);
				setState(405);
				match(ARROW);
				setState(406);
				propertyAccess();
				setState(407);
				_la = _input.LA(1);
				if ( !(_la==EQUALTHIRD || _la==NOT_EQUAL_EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(408);
				propertyAccess();
				setState(409);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				_localctx = new ConditionValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				propertyAccess();
				setState(412);
				match(OPEN_BRACKET);
				setState(413);
				parameters();
				setState(414);
				match(ARROW);
				setState(415);
				propertyAccess();
				setState(416);
				parameters();
				setState(417);
				match(COMMA);
				setState(418);
				match(NUMBER_VAL);
				setState(419);
				match(CLOSE_BRACKET);
				setState(420);
				operations();
				setState(421);
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
		enterRule(_localctx, 56, RULE_returnType);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				argumentList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				conditions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
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
		enterRule(_localctx, 58, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(RETURN);
			setState(431);
			returnType();
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(432);
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
		enterRule(_localctx, 60, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(CURLY_OPEN_BRACKET);
			setState(436);
			objectProperty();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(437);
				match(COMMA);
				setState(438);
				objectProperty();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
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
		enterRule(_localctx, 62, RULE_objectProperty);
		int _la;
		try {
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new IdentifierObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(IDENTIFIER);
				setState(447);
				match(COLON);
				setState(448);
				expression();
				}
				break;
			case 2:
				_localctx = new ImportsObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(IMPORTS);
				setState(450);
				match(COLON);
				setState(451);
				expression();
				}
				break;
			case 3:
				_localctx = new ExportsObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				match(EXPORTS);
				setState(453);
				match(COLON);
				setState(454);
				expression();
				}
				break;
			case 4:
				_localctx = new DotPropertyAccessObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(455);
					match(DOT);
					}
					}
					setState(460);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(461);
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
		enterRule(_localctx, 64, RULE_propertyAccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(IDENTIFIER);
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(465);
					match(DOT);
					setState(466);
					match(IDENTIFIER);
					setState(468);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(467);
						match(S_DOlOR);
						}
						break;
					}
					setState(473);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(470);
						match(SQUARE_OPEN_BRACKET);
						setState(471);
						match(IDENTIFIER);
						setState(472);
						match(SQUARE_CLOSE_BRACKET);
						}
						break;
					}
					}
					} 
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 66, RULE_functionDeclarationStat);
		int _la;
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
			case CURLY_OPEN_BRACKET:
			case COLON:
			case EQUAL:
				_localctx = new SimpleDecStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(480);
					match(EQUAL);
					setState(481);
					match(FUNCTION);
					}
				}

				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(484);
					parameters();
					}
				}

				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(487);
					match(COLON);
					setState(488);
					unionType();
					}
				}

				}
				break;
			case S_DOlOR:
				_localctx = new SimpleArrayDecStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(S_DOlOR);
				setState(492);
				parameters();
				setState(493);
				match(COLON);
				setState(494);
				match(IDENTIFIER);
				setState(495);
				match(LT);
				setState(496);
				simpleArray();
				setState(497);
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
		enterRule(_localctx, 68, RULE_normalfunctionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				setState(501);
				match(FUNCTION);
				}
				break;
			case LET:
			case VAR:
			case CONST:
			case AccessModifiers:
				{
				setState(502);
				variable_type();
				}
				break;
			case IDENTIFIER:
				break;
			default:
				break;
			}
			setState(505);
			match(IDENTIFIER);
			setState(506);
			functionDeclarationStat();
			setState(507);
			match(CURLY_OPEN_BRACKET);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 94578894467770992L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1048591L) != 0)) {
				{
				{
				setState(508);
				body();
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(514);
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
		enterRule(_localctx, 70, RULE_functionDeclaration);
		try {
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				normalfunctionDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
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
		enterRule(_localctx, 72, RULE_parametersType);
		int _la;
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_BRACKET:
			case AccessModifiers:
			case COMMA:
			case IDENTIFIER:
				_localctx = new ParaWithTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(520);
					match(COMMA);
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AccessModifiers) {
						{
						setState(521);
						match(AccessModifiers);
						}
					}

					setState(524);
					match(IDENTIFIER);
					setState(525);
					match(COLON);
					setState(526);
					type();
					}
					}
					setState(531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EQUAL:
				_localctx = new ParaValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				match(EQUAL);
				setState(533);
				values();
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(534);
					match(COMMA);
					setState(535);
					match(IDENTIFIER);
					setState(536);
					match(COLON);
					setState(537);
					type();
					setState(538);
					match(EQUAL);
					setState(539);
					values();
					}
					}
					setState(545);
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
		enterRule(_localctx, 74, RULE_parametersContent);
		int _la;
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new ParaHasAccessModifiersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AccessModifiers) {
					{
					setState(548);
					match(AccessModifiers);
					}
				}

				setState(551);
				match(IDENTIFIER);
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(552);
					match(COLON);
					setState(553);
					type();
					setState(554);
					parametersType();
					}
				}

				}
				break;
			case 2:
				_localctx = new ParaHasPropertyAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				propertyAccess();
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(559);
					match(COMMA);
					setState(560);
					propertyAccess();
					}
					}
					setState(565);
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
		enterRule(_localctx, 76, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(OPEN_BRACKET);
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AccessModifiers || _la==IDENTIFIER) {
				{
				{
				setState(569);
				parametersContent();
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
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
		enterRule(_localctx, 78, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1048583L) != 0)) ) {
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
		enterRule(_localctx, 80, RULE_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) ) {
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
		enterRule(_localctx, 82, RULE_subDotAssignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(581);
					match(QUESTION_MARK);
					setState(582);
					match(DOT);
					setState(583);
					match(SQUARE_OPEN_BRACKET);
					setState(584);
					values();
					setState(585);
					match(SQUARE_CLOSE_BRACKET);
					}
					} 
				}
				setState(591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_assignment, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(593);
				match(IDENTIFIER);
				setState(594);
				match(EQUAL);
				setState(595);
				expression();
				setState(596);
				match(SEMI_COLON);
				}
				break;
			case 2:
				{
				_localctx = new DotAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(598);
				propertyAccess();
				setState(599);
				subDotAssignment();
				setState(610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(600);
					match(EQUAL);
					setState(602);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(601);
						match(NOT);
						}
					}

					setState(604);
					type();
					setState(608);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						setState(605);
						operations();
						setState(606);
						values();
						}
						break;
					}
					}
					break;
				}
				setState(613);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(612);
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
				setState(615);
				propertyAccess();
				setState(616);
				match(EQUAL);
				setState(617);
				objectLiteral();
				setState(618);
				match(SEMI_COLON);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AssignmentStatementContext(new AssignmentContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_assignment);
					setState(622);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(623);
					match(EQUAL);
					setState(624);
					assignment(0);
					setState(629);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(625);
						match(AS);
						setState(626);
						primitiveType();
						setState(627);
						match(SEMI_COLON);
						}
						break;
					}
					}
					} 
				}
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		enterRule(_localctx, 86, RULE_templateExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			_la = _input.LA(1);
			if ( !(_la==CURLY_OPEN_BRACKET || _la==DOUBLE_CURLY_OPEN_BRACKET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(637);
					types();
					}
					} 
				}
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIT_OR) {
				{
				setState(643);
				match(BIT_OR);
				setState(645); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(644);
						types();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(647); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(651);
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
		enterRule(_localctx, 88, RULE_eventBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(OPEN_BRACKET);
			setState(654);
			match(CLICK);
			setState(655);
			match(CLOSE_BRACKET2);
			setState(656);
			match(EQUAL3);
			setState(657);
			match(DQUOT5);
			setState(658);
			match(ID3);
			setState(659);
			match(OPEN_BRACKET2);
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID3) {
				{
				setState(660);
				match(ID3);
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT3) {
					{
					{
					setState(661);
					match(DOT3);
					setState(662);
					match(ID3);
					}
					}
					setState(667);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(670);
			match(CLOSE_BRACKET2);
			setState(671);
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
		enterRule(_localctx, 90, RULE_htmlDeclare);
		try {
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				normalHtmlTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
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
		enterRule(_localctx, 92, RULE_normalHtmlTag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			openTag();
			setState(681);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(678);
					types();
					}
					} 
				}
				setState(683);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(684);
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
		enterRule(_localctx, 94, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(LT);
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7489525197679102320L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1114095L) != 0)) {
				{
				{
				setState(687);
				types();
				}
				}
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(693);
			match(SLASH);
			setState(694);
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
		enterRule(_localctx, 96, RULE_openTag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(LT);
			setState(700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(697);
					types();
					}
					} 
				}
				setState(702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(703);
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
		enterRule(_localctx, 98, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(LT);
			setState(706);
			match(SLASH);
			setState(707);
			match(IDENTIFIER);
			setState(708);
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
		enterRule(_localctx, 100, RULE_simpleArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(IDENTIFIER);
			setState(711);
			match(SQUARE_OPEN_BRACKET);
			setState(712);
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
		enterRule(_localctx, 102, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(IDENTIFIER);
			setState(715);
			match(LT);
			setState(716);
			values();
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(717);
				match(COMMA);
				setState(718);
				values();
				}
				}
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(724);
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
		enterRule(_localctx, 104, RULE_type);
		try {
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
				arrayStringType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(728);
				simpleArray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(729);
				map();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(730);
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
		enterRule(_localctx, 106, RULE_primitiveType);
		try {
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				_localctx = new NumberPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				match(NUMBER);
				}
				break;
			case VOID:
				_localctx = new VoidPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(735);
				match(VOID);
				}
				break;
			case NULL:
				_localctx = new NullPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(736);
				match(NULL);
				}
				break;
			case ANY:
				_localctx = new AnyPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(737);
				match(ANY);
				}
				break;
			case STRING_EX:
				_localctx = new StringEXPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(738);
				match(STRING_EX);
				}
				break;
			case CLASS:
				_localctx = new ClassPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(739);
				match(CLASS);
				}
				break;
			case CURLY_OPEN_BRACKET:
			case DOUBLE_CURLY_OPEN_BRACKET:
				_localctx = new TemplateExPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(740);
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
		enterRule(_localctx, 108, RULE_arrayStringType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(ARRAY);
			setState(744);
			match(LT);
			setState(745);
			match(STRING_EX);
			setState(746);
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
		enterRule(_localctx, 110, RULE_arrayNumberType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(NUMBER);
			setState(749);
			match(SQUARE_OPEN_BRACKET);
			setState(750);
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
		public TerminalNode LT() { return getToken(MyParser.LT, 0); }
		public TerminalNode GT() { return getToken(MyParser.GT, 0); }
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public TerminalNode S_DOlOR() { return getToken(MyParser.S_DOlOR, 0); }
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(MyParser.SQUARE_OPEN_BRACKET, 0); }
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(MyParser.SQUARE_CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public TerminalNode CURLY_OPEN_BRACKET() { return getToken(MyParser.CURLY_OPEN_BRACKET, 0); }
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
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
		enterRule(_localctx, 112, RULE_marks);
		try {
			setState(770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI_COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				match(SEMI_COLON);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				match(COMMA);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(754);
				match(COLON);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(755);
				match(DOT);
				}
				break;
			case QUESTION_MARK:
				enterOuterAlt(_localctx, 5);
				{
				setState(756);
				match(QUESTION_MARK);
				}
				break;
			case HASH_TAG:
				enterOuterAlt(_localctx, 6);
				{
				setState(757);
				match(HASH_TAG);
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(758);
				match(EQUAL);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 8);
				{
				setState(759);
				match(LT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 9);
				{
				setState(760);
				match(GT);
				}
				break;
			case PLUS:
			case MIN:
			case MULT:
				enterOuterAlt(_localctx, 10);
				{
				setState(761);
				operations();
				}
				break;
			case S_DOlOR:
				enterOuterAlt(_localctx, 11);
				{
				setState(762);
				match(S_DOlOR);
				}
				break;
			case SQUARE_OPEN_BRACKET:
				enterOuterAlt(_localctx, 12);
				{
				setState(763);
				match(SQUARE_OPEN_BRACKET);
				}
				break;
			case SQUARE_CLOSE_BRACKET:
				enterOuterAlt(_localctx, 13);
				{
				setState(764);
				match(SQUARE_CLOSE_BRACKET);
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 14);
				{
				setState(765);
				match(OPEN_BRACKET);
				}
				break;
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 15);
				{
				setState(766);
				match(CLOSE_BRACKET);
				}
				break;
			case CURLY_OPEN_BRACKET:
				enterOuterAlt(_localctx, 16);
				{
				setState(767);
				match(CURLY_OPEN_BRACKET);
				}
				break;
			case CURLY_CLOSE_BRACKET:
				enterOuterAlt(_localctx, 17);
				{
				setState(768);
				match(CURLY_CLOSE_BRACKET);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 18);
				{
				setState(769);
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
		enterRule(_localctx, 114, RULE_arrayDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(SQUARE_OPEN_BRACKET);
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 94578892320278640L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1048591L) != 0)) {
				{
				setState(773);
				expression();
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(774);
					match(COMMA);
					setState(775);
					expression();
					setState(779);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(776);
							match(COMMA);
							}
							} 
						}
						setState(781);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
					}
					}
					}
					setState(786);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(789);
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
		enterRule(_localctx, 116, RULE_conditionStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(CURLY_OPEN_BRACKET);
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 94578892320278640L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1048591L) != 0)) {
				{
				{
				setState(792);
				expression();
				}
				}
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(798);
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
		enterRule(_localctx, 118, RULE_tryStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(TRY);
			setState(801);
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
		enterRule(_localctx, 120, RULE_catchStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(CATCH);
			setState(804);
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
		enterRule(_localctx, 122, RULE_operationExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			values();
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(807);
				operations();
				setState(808);
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
		enterRule(_localctx, 124, RULE_questionCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			propertyAccess();
			setState(814); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(813);
				match(QUESTION_MARK);
				}
				}
				setState(816); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==QUESTION_MARK );
			setState(818);
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
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
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
		enterRule(_localctx, 126, RULE_navigate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(IDENTIFIER);
			setState(821);
			match(DOT);
			setState(822);
			match(ROUTER);
			setState(823);
			match(DOT);
			setState(824);
			match(NAVIGATE);
			setState(825);
			match(OPEN_BRACKET);
			setState(826);
			match(SQUARE_OPEN_BRACKET);
			setState(827);
			values();
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(828);
				match(COMMA);
				setState(829);
				values();
				}
				}
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(835);
			match(SQUARE_CLOSE_BRACKET);
			setState(836);
			match(CLOSE_BRACKET);
			setState(837);
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
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public List<PropertyAccessContext> propertyAccess() {
			return getRuleContexts(PropertyAccessContext.class);
		}
		public PropertyAccessContext propertyAccess(int i) {
			return getRuleContext(PropertyAccessContext.class,i);
		}
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
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
		enterRule(_localctx, 128, RULE_functionExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(839);
				propertyAccess();
				}
				}
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(845);
			match(OPEN_BRACKET);
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1048583L) != 0)) {
				{
				{
				setState(846);
				values();
				}
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(852);
			match(CLOSE_BRACKET);
			setState(853);
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
		enterRule(_localctx, 130, RULE_expression);
		try {
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				values();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				navigate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(857);
				arrayDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(858);
				variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(859);
				ifElseStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(860);
				tryStat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(861);
				catchStat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(862);
				objectLiteral();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(863);
				functionExp();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(864);
				directivesStatment();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(865);
				propertyAccess();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(866);
				assignment(0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(867);
				questionCondition();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(868);
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
		enterRule(_localctx, 132, RULE_directivesStatment);
		try {
			setState(877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NgFor:
				_localctx = new NgForDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				match(NgFor);
				setState(872);
				match(EQUAL1);
				setState(873);
				ngForValue();
				}
				break;
			case NgIf:
				_localctx = new NgIfDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				match(NgIf);
				setState(875);
				match(EQUAL2);
				setState(876);
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
		enterRule(_localctx, 134, RULE_ngForValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(DQUOT1);
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET1) {
				{
				{
				setState(880);
				ngForExpression();
				}
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(886);
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
		enterRule(_localctx, 136, RULE_ngForExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(LET1);
			setState(889);
			match(ID1);
			setState(890);
			match(OF1);
			setState(891);
			match(ID1);
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_COLON5) {
					{
					setState(892);
					match(SEMI_COLON5);
					}
				}

				setState(895);
				match(LET1);
				setState(896);
				match(ID1);
				setState(897);
				match(EQUAL1);
				setState(898);
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
		enterRule(_localctx, 138, RULE_ngIfValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(DQUOT3);
			setState(902);
			conditionExpression();
			setState(903);
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
		enterRule(_localctx, 140, RULE_conditionExpression);
		int _la;
		try {
			setState(936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				_localctx = new EqualNullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(905);
				match(ID2);
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 1921L) != 0)) {
					{
					setState(906);
					equalOperation();
					setState(907);
					match(NULL1);
					}
				}

				}
				break;
			case 2:
				_localctx = new ComparisonExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(911);
				logicalTerm();
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 4196225L) != 0)) {
					{
					setState(914);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GT1) {
						{
						setState(912);
						match(GT1);
						setState(913);
						match(NUMBER_VAL1);
						}
					}

					setState(916);
					equalOperation();
					setState(917);
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
				setState(921);
				logicalTerm();
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET1) {
					{
					setState(922);
					match(OPEN_BRACKET1);
					setState(923);
					match(ID2);
					setState(924);
					match(ARROW1);
					setState(925);
					logicalTerm();
					setState(928);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GT1) {
						{
						setState(926);
						match(GT1);
						setState(927);
						match(NUMBER_VAL1);
						}
					}

					setState(930);
					equalOperation();
					setState(931);
					match(ID2);
					setState(932);
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
		enterRule(_localctx, 142, RULE_equalOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 1921L) != 0)) ) {
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
		enterRule(_localctx, 144, RULE_logicalTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT1) {
				{
				setState(940);
				match(NOT1);
				}
			}

			setState(943);
			match(ID2);
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT1) {
				{
				setState(944);
				match(DOT1);
				setState(945);
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
		enterRule(_localctx, 146, RULE_ifStat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(IF);
			setState(949);
			match(OPEN_BRACKET);
			setState(953);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(950);
					types();
					}
					} 
				}
				setState(955);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			setState(956);
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
		enterRule(_localctx, 148, RULE_ifElseStat);
		int _la;
		try {
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				_localctx = new IfQuestionMarkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(958);
				match(IDENTIFIER);
				setState(959);
				match(QUESTION_MARK);
				setState(960);
				type();
				setState(961);
				match(COLON);
				setState(962);
				type();
				}
				break;
			case 2:
				_localctx = new IfReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				ifStat();
				setState(965);
				match(RETURN);
				setState(966);
				match(SEMI_COLON);
				}
				break;
			case 3:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(968);
				ifStat();
				setState(969);
				conditionStat();
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(970);
					match(ELSE);
					setState(971);
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
		enterRule(_localctx, 150, RULE_variable_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0) || _la==AccessModifiers) ) {
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
		enterRule(_localctx, 152, RULE_unionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			type();
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIT_OR) {
				{
				setState(979);
				match(BIT_OR);
				setState(980);
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
		enterRule(_localctx, 154, RULE_newObjectFromClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(983);
				match(IDENTIFIER);
				}
				}
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(989);
			parameters();
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(990);
				match(DOT);
				setState(991);
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
		enterRule(_localctx, 156, RULE_toStringNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(TOSTRING);
			setState(995);
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
		enterRule(_localctx, 158, RULE_variableDeclarationStat);
		int _la;
		try {
			setState(1016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				_localctx = new TypedVariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				match(COLON);
				setState(998);
				unionType();
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SQUARE_OPEN_BRACKET) {
					{
					{
					setState(999);
					match(SQUARE_OPEN_BRACKET);
					setState(1000);
					match(SQUARE_CLOSE_BRACKET);
					}
					}
					setState(1005);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1006);
				match(EQUAL);
				setState(1007);
				types();
				}
				break;
			case 2:
				_localctx = new InferredVariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1009);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1012);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1010);
					types();
					}
					break;
				case 2:
					{
					setState(1011);
					conditions();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ObjectFromClassContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1014);
				match(EQUAL);
				setState(1015);
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
		enterRule(_localctx, 160, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0) || _la==AccessModifiers) {
				{
				setState(1018);
				variable_type();
				}
			}

			setState(1022); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1021);
				propertyAccess();
				}
				}
				setState(1024); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION_MARK) {
				{
				setState(1026);
				match(QUESTION_MARK);
				}
			}

			setState(1029);
			variableDeclarationStat();
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1030);
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
		enterRule(_localctx, 162, RULE_arrowFunction);
		int _la;
		try {
			setState(1065);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case VAR:
			case CONST:
			case AccessModifiers:
				_localctx = new VarArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				variable_type();
				setState(1034);
				match(IDENTIFIER);
				setState(1035);
				match(EQUAL);
				setState(1036);
				parameters();
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1037);
					match(COLON);
					setState(1038);
					type();
					}
				}

				setState(1041);
				match(ARROW);
				setState(1042);
				body();
				setState(1043);
				match(SEMI_COLON);
				}
				break;
			case IDENTIFIER:
				_localctx = new EventHandlerArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1045);
				propertyAccess();
				setState(1046);
				match(EQUAL);
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(1047);
					parameters();
					}
				}

				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1050);
					match(COLON);
					setState(1051);
					type();
					}
				}

				setState(1054);
				match(ARROW);
				setState(1055);
				match(CURLY_OPEN_BRACKET);
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 94578894467770992L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1048591L) != 0)) {
					{
					{
					setState(1056);
					body();
					}
					}
					setState(1061);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1062);
				match(CURLY_CLOSE_BRACKET);
				setState(1063);
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
		case 42:
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
		"\u0004\u0001\u008c\u042c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"O\u0002P\u0007P\u0002Q\u0007Q\u0001\u0000\u0005\u0000\u00a6\b\u0000\n"+
		"\u0000\f\u0000\u00a9\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u00af\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u00b6\b\u0002\n\u0002\f\u0002\u00b9\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00c9\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u00ce\b\u0005\n\u0005\f\u0005\u00d1\t\u0005\u0001"+
		"\u0005\u0003\u0005\u00d4\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00e4\b\t\u0001\t\u0001\t\u0005"+
		"\t\u00e8\b\t\n\t\f\t\u00eb\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0004\r\u00fc\b\r\u000b\r\f\r\u00fd\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u0105\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u010d\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0112\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0119\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0120"+
		"\b\u0010\u0003\u0010\u0122\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0127\b\u0011\u0001\u0011\u0005\u0011\u012a\b\u0011\n\u0011"+
		"\f\u0011\u012d\t\u0011\u0001\u0011\u0003\u0011\u0130\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0137\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0152\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0170\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0175\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u017c\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0180\b\u0019\u0003\u0019\u0182\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u018c\b\u001a\n\u001a\f\u001a\u018f\t\u001a\u0003\u001a\u0191\b"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01a8\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01ad\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u01b2\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u01b8\b\u001e\n\u001e\f\u001e\u01bb\t\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u01c9\b\u001f\n\u001f\f\u001f\u01cc\t\u001f\u0001\u001f\u0003"+
		"\u001f\u01cf\b\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u01d5\b \u0001"+
		" \u0001 \u0001 \u0003 \u01da\b \u0005 \u01dc\b \n \f \u01df\t \u0001!"+
		"\u0001!\u0003!\u01e3\b!\u0001!\u0003!\u01e6\b!\u0001!\u0001!\u0003!\u01ea"+
		"\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01f4"+
		"\b!\u0001\"\u0001\"\u0003\"\u01f8\b\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0005\"\u01fe\b\"\n\"\f\"\u0201\t\"\u0001\"\u0001\"\u0001#\u0001#\u0003"+
		"#\u0207\b#\u0001$\u0001$\u0003$\u020b\b$\u0001$\u0001$\u0001$\u0005$\u0210"+
		"\b$\n$\f$\u0213\t$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0005$\u021e\b$\n$\f$\u0221\t$\u0003$\u0223\b$\u0001%\u0003%"+
		"\u0226\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u022d\b%\u0001%\u0001"+
		"%\u0001%\u0005%\u0232\b%\n%\f%\u0235\t%\u0003%\u0237\b%\u0001&\u0001&"+
		"\u0005&\u023b\b&\n&\f&\u023e\t&\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u024c\b)\n)\f)\u024f"+
		"\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u025b\b*\u0001*\u0001*\u0001*\u0001*\u0003*\u0261\b*\u0003*\u0263"+
		"\b*\u0001*\u0003*\u0266\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u026d"+
		"\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0276\b*\u0005"+
		"*\u0278\b*\n*\f*\u027b\t*\u0001+\u0001+\u0005+\u027f\b+\n+\f+\u0282\t"+
		"+\u0001+\u0001+\u0004+\u0286\b+\u000b+\f+\u0287\u0003+\u028a\b+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0005,\u0298\b,\n,\f,\u029b\t,\u0003,\u029d\b,\u0001,\u0001,"+
		"\u0001,\u0001-\u0001-\u0003-\u02a4\b-\u0001.\u0001.\u0005.\u02a8\b.\n"+
		".\f.\u02ab\t.\u0001.\u0001.\u0001/\u0001/\u0005/\u02b1\b/\n/\f/\u02b4"+
		"\t/\u0001/\u0001/\u0001/\u00010\u00010\u00050\u02bb\b0\n0\f0\u02be\t0"+
		"\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u0001"+
		"2\u00012\u00013\u00013\u00013\u00013\u00013\u00053\u02d0\b3\n3\f3\u02d3"+
		"\t3\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u00034\u02dc\b4\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u02e6\b5\u0001"+
		"6\u00016\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u0303\b8\u00019\u0001"+
		"9\u00019\u00019\u00019\u00059\u030a\b9\n9\f9\u030d\t9\u00059\u030f\b9"+
		"\n9\f9\u0312\t9\u00039\u0314\b9\u00019\u00019\u0001:\u0001:\u0005:\u031a"+
		"\b:\n:\f:\u031d\t:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001<\u0001<\u0001"+
		"<\u0001=\u0001=\u0001=\u0001=\u0003=\u032b\b=\u0001>\u0001>\u0004>\u032f"+
		"\b>\u000b>\f>\u0330\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0005?\u033f\b?\n?\f?\u0342\t?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001@\u0005@\u0349\b@\n@\f@\u034c\t@\u0001@\u0001@\u0005"+
		"@\u0350\b@\n@\f@\u0353\t@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0003A\u0366\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u036e"+
		"\bB\u0001C\u0001C\u0005C\u0372\bC\nC\fC\u0375\tC\u0001C\u0001C\u0001D"+
		"\u0001D\u0001D\u0001D\u0001D\u0003D\u037e\bD\u0001D\u0001D\u0001D\u0001"+
		"D\u0003D\u0384\bD\u0001E\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001"+
		"F\u0003F\u038e\bF\u0001F\u0001F\u0001F\u0003F\u0393\bF\u0001F\u0001F\u0001"+
		"F\u0003F\u0398\bF\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0003"+
		"F\u03a1\bF\u0001F\u0001F\u0001F\u0001F\u0003F\u03a7\bF\u0003F\u03a9\b"+
		"F\u0001G\u0001G\u0001H\u0003H\u03ae\bH\u0001H\u0001H\u0001H\u0003H\u03b3"+
		"\bH\u0001I\u0001I\u0001I\u0005I\u03b8\bI\nI\fI\u03bb\tI\u0001I\u0001I"+
		"\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0001J\u0003J\u03cd\bJ\u0003J\u03cf\bJ\u0001K\u0001"+
		"K\u0001L\u0001L\u0001L\u0003L\u03d6\bL\u0001M\u0005M\u03d9\bM\nM\fM\u03dc"+
		"\tM\u0001M\u0001M\u0001M\u0003M\u03e1\bM\u0001N\u0001N\u0001N\u0001O\u0001"+
		"O\u0001O\u0001O\u0005O\u03ea\bO\nO\fO\u03ed\tO\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0003O\u03f5\bO\u0001O\u0001O\u0003O\u03f9\bO\u0001P\u0003"+
		"P\u03fc\bP\u0001P\u0004P\u03ff\bP\u000bP\fP\u0400\u0001P\u0003P\u0404"+
		"\bP\u0001P\u0001P\u0003P\u0408\bP\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0003Q\u0410\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003"+
		"Q\u0419\bQ\u0001Q\u0001Q\u0003Q\u041d\bQ\u0001Q\u0001Q\u0001Q\u0005Q\u0422"+
		"\bQ\nQ\fQ\u0425\tQ\u0001Q\u0001Q\u0001Q\u0003Q\u042a\bQ\u0001Q\u0000\u0001"+
		"TR\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u0000\u000b\u0002\u0000FFVV\u0002\u0000\u0012"+
		"\u0012\u001a\u001b\u0002\u0000//11\u0002\u0000BDVV\u0001\u0000NP\u0002"+
		"\u000088::\u0002\u000099;;\u0002\u0000``~~\u0002\u0000aahk\u0002\u0000"+
		"\u0004\u0006EE\u0002\u0000IIMM\u0487\u0000\u00a7\u0001\u0000\u0000\u0000"+
		"\u0002\u00ae\u0001\u0000\u0000\u0000\u0004\u00b0\u0001\u0000\u0000\u0000"+
		"\u0006\u00bf\u0001\u0000\u0000\u0000\b\u00c1\u0001\u0000\u0000\u0000\n"+
		"\u00ca\u0001\u0000\u0000\u0000\f\u00d5\u0001\u0000\u0000\u0000\u000e\u00d9"+
		"\u0001\u0000\u0000\u0000\u0010\u00dd\u0001\u0000\u0000\u0000\u0012\u00df"+
		"\u0001\u0000\u0000\u0000\u0014\u00ee\u0001\u0000\u0000\u0000\u0016\u00f1"+
		"\u0001\u0000\u0000\u0000\u0018\u00f4\u0001\u0000\u0000\u0000\u001a\u0104"+
		"\u0001\u0000\u0000\u0000\u001c\u010c\u0001\u0000\u0000\u0000\u001e\u0111"+
		"\u0001\u0000\u0000\u0000 \u0121\u0001\u0000\u0000\u0000\"\u0123\u0001"+
		"\u0000\u0000\u0000$\u0136\u0001\u0000\u0000\u0000&\u0138\u0001\u0000\u0000"+
		"\u0000(\u013d\u0001\u0000\u0000\u0000*\u0149\u0001\u0000\u0000\u0000,"+
		"\u0151\u0001\u0000\u0000\u0000.\u0153\u0001\u0000\u0000\u00000\u015a\u0001"+
		"\u0000\u0000\u00002\u0181\u0001\u0000\u0000\u00004\u0190\u0001\u0000\u0000"+
		"\u00006\u01a7\u0001\u0000\u0000\u00008\u01ac\u0001\u0000\u0000\u0000:"+
		"\u01ae\u0001\u0000\u0000\u0000<\u01b3\u0001\u0000\u0000\u0000>\u01ce\u0001"+
		"\u0000\u0000\u0000@\u01d0\u0001\u0000\u0000\u0000B\u01f3\u0001\u0000\u0000"+
		"\u0000D\u01f7\u0001\u0000\u0000\u0000F\u0206\u0001\u0000\u0000\u0000H"+
		"\u0222\u0001\u0000\u0000\u0000J\u0236\u0001\u0000\u0000\u0000L\u0238\u0001"+
		"\u0000\u0000\u0000N\u0241\u0001\u0000\u0000\u0000P\u0243\u0001\u0000\u0000"+
		"\u0000R\u024d\u0001\u0000\u0000\u0000T\u026c\u0001\u0000\u0000\u0000V"+
		"\u027c\u0001\u0000\u0000\u0000X\u028d\u0001\u0000\u0000\u0000Z\u02a3\u0001"+
		"\u0000\u0000\u0000\\\u02a5\u0001\u0000\u0000\u0000^\u02ae\u0001\u0000"+
		"\u0000\u0000`\u02b8\u0001\u0000\u0000\u0000b\u02c1\u0001\u0000\u0000\u0000"+
		"d\u02c6\u0001\u0000\u0000\u0000f\u02ca\u0001\u0000\u0000\u0000h\u02db"+
		"\u0001\u0000\u0000\u0000j\u02e5\u0001\u0000\u0000\u0000l\u02e7\u0001\u0000"+
		"\u0000\u0000n\u02ec\u0001\u0000\u0000\u0000p\u0302\u0001\u0000\u0000\u0000"+
		"r\u0304\u0001\u0000\u0000\u0000t\u0317\u0001\u0000\u0000\u0000v\u0320"+
		"\u0001\u0000\u0000\u0000x\u0323\u0001\u0000\u0000\u0000z\u0326\u0001\u0000"+
		"\u0000\u0000|\u032c\u0001\u0000\u0000\u0000~\u0334\u0001\u0000\u0000\u0000"+
		"\u0080\u034a\u0001\u0000\u0000\u0000\u0082\u0365\u0001\u0000\u0000\u0000"+
		"\u0084\u036d\u0001\u0000\u0000\u0000\u0086\u036f\u0001\u0000\u0000\u0000"+
		"\u0088\u0378\u0001\u0000\u0000\u0000\u008a\u0385\u0001\u0000\u0000\u0000"+
		"\u008c\u03a8\u0001\u0000\u0000\u0000\u008e\u03aa\u0001\u0000\u0000\u0000"+
		"\u0090\u03ad\u0001\u0000\u0000\u0000\u0092\u03b4\u0001\u0000\u0000\u0000"+
		"\u0094\u03ce\u0001\u0000\u0000\u0000\u0096\u03d0\u0001\u0000\u0000\u0000"+
		"\u0098\u03d2\u0001\u0000\u0000\u0000\u009a\u03da\u0001\u0000\u0000\u0000"+
		"\u009c\u03e2\u0001\u0000\u0000\u0000\u009e\u03f8\u0001\u0000\u0000\u0000"+
		"\u00a0\u03fb\u0001\u0000\u0000\u0000\u00a2\u0429\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a6\u0003\u0002\u0001\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u0001\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00af\u0003\u0004\u0002\u0000"+
		"\u00ab\u00af\u0003\b\u0004\u0000\u00ac\u00af\u0003\"\u0011\u0000\u00ad"+
		"\u00af\u00032\u0019\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000\u00ae\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u0003\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005\u0001\u0000\u0000\u00b1\u00b2\u00058\u0000\u0000\u00b2\u00b7\u0007"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005H\u0000\u0000\u00b4\u00b6\u0005V\u0000"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u00059\u0000\u0000\u00bb\u00bc\u0005\u0003\u0000\u0000"+
		"\u00bc\u00bd\u0005B\u0000\u0000\u00bd\u00be\u0005G\u0000\u0000\u00be\u0005"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0007\u0001\u0000\u0000\u00c0\u0007"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0003\u0006\u0003\u0000\u00c2\u00c3"+
		"\u00056\u0000\u0000\u00c3\u00c4\u00058\u0000\u0000\u00c4\u00c5\u0003\n"+
		"\u0005\u0000\u00c5\u00c6\u00059\u0000\u0000\u00c6\u00c8\u00057\u0000\u0000"+
		"\u00c7\u00c9\u0005H\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\t\u0001\u0000\u0000\u0000\u00ca\u00cf"+
		"\u0003\u001c\u000e\u0000\u00cb\u00cc\u0005H\u0000\u0000\u00cc\u00ce\u0003"+
		"\u001c\u000e\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d4\u0005H\u0000\u0000\u00d3\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u000b\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0005\u0013\u0000\u0000\u00d6\u00d7\u0005I\u0000"+
		"\u0000\u00d7\u00d8\u0005B\u0000\u0000\u00d8\r\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0005\u0014\u0000\u0000\u00da\u00db\u0005I\u0000\u0000\u00db"+
		"\u00dc\u0005D\u0000\u0000\u00dc\u000f\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u0011\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0005I\u0000\u0000\u00e0\u00e3\u00054\u0000\u0000\u00e1\u00e4\u0005V"+
		"\u0000\u0000\u00e2\u00e4\u0003\u0010\b\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0005H\u0000\u0000\u00e6\u00e8\u0005V\u0000\u0000\u00e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u00055\u0000\u0000\u00ed\u0013\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0005\u0015\u0000\u0000\u00ef\u00f0\u0003\u0012\t\u0000\u00f0\u0015\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005\u0018\u0000\u0000\u00f2\u00f3\u0003"+
		"\u0012\t\u0000\u00f3\u0017\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005V"+
		"\u0000\u0000\u00f5\u00f6\u0003\u0012\t\u0000\u00f6\u0019\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0005\u0016\u0000\u0000\u00f8\u00f9\u0005I\u0000\u0000"+
		"\u00f9\u00fb\u0005A\u0000\u0000\u00fa\u00fc\u0003Z-\u0000\u00fb\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0005A\u0000\u0000\u0100\u0105\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0005V\u0000\u0000\u0102\u0103\u0005I\u0000"+
		"\u0000\u0103\u0105\u0005B\u0000\u0000\u0104\u00f7\u0001\u0000\u0000\u0000"+
		"\u0104\u0101\u0001\u0000\u0000\u0000\u0105\u001b\u0001\u0000\u0000\u0000"+
		"\u0106\u010d\u0003\f\u0006\u0000\u0107\u010d\u0003\u000e\u0007\u0000\u0108"+
		"\u010d\u0003\u0014\n\u0000\u0109\u010d\u0003\u0016\u000b\u0000\u010a\u010d"+
		"\u0003\u0018\f\u0000\u010b\u010d\u0003\u001a\r\u0000\u010c\u0106\u0001"+
		"\u0000\u0000\u0000\u010c\u0107\u0001\u0000\u0000\u0000\u010c\u0108\u0001"+
		"\u0000\u0000\u0000\u010c\u0109\u0001\u0000\u0000\u0000\u010c\u010a\u0001"+
		"\u0000\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u001d\u0001"+
		"\u0000\u0000\u0000\u010e\u0112\u0005\n\u0000\u0000\u010f\u0112\u0005\u0019"+
		"\u0000\u0000\u0110\u0112\u0003\u0096K\u0000\u0111\u010e\u0001\u0000\u0000"+
		"\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000"+
		"\u0000\u0112\u001f\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u001c\u0000"+
		"\u0000\u0114\u0118\u0005V\u0000\u0000\u0115\u0116\u0003\u001e\u000f\u0000"+
		"\u0116\u0117\u0005V\u0000\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118"+
		"\u0115\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119"+
		"\u0122\u0001\u0000\u0000\u0000\u011a\u011b\u0003\u001e\u000f\u0000\u011b"+
		"\u011f\u0005V\u0000\u0000\u011c\u011d\u0005I\u0000\u0000\u011d\u011e\u0005"+
		"V\u0000\u0000\u011e\u0120\u0005M\u0000\u0000\u011f\u011c\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0122\u0001\u0000\u0000"+
		"\u0000\u0121\u0113\u0001\u0000\u0000\u0000\u0121\u011a\u0001\u0000\u0000"+
		"\u0000\u0122!\u0001\u0000\u0000\u0000\u0123\u0124\u0005\u0017\u0000\u0000"+
		"\u0124\u0126\u0003 \u0010\u0000\u0125\u0127\u00058\u0000\u0000\u0126\u0125"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u012b"+
		"\u0001\u0000\u0000\u0000\u0128\u012a\u0003,\u0016\u0000\u0129\u0128\u0001"+
		"\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012f\u0001"+
		"\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u0130\u0005"+
		"9\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000"+
		"\u0000\u0000\u0130#\u0001\u0000\u0000\u0000\u0131\u0137\u0003h4\u0000"+
		"\u0132\u0137\u0003p8\u0000\u0133\u0137\u0003\u0082A\u0000\u0134\u0137"+
		"\u0003X,\u0000\u0135\u0137\u0003Z-\u0000\u0136\u0131\u0001\u0000\u0000"+
		"\u0000\u0136\u0132\u0001\u0000\u0000\u0000\u0136\u0133\u0001\u0000\u0000"+
		"\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000"+
		"\u0000\u0137%\u0001\u0000\u0000\u0000\u0138\u0139\u00056\u0000\u0000\u0139"+
		"\u013a\u00054\u0000\u0000\u013a\u013b\u00055\u0000\u0000\u013b\u013c\u0005"+
		"7\u0000\u0000\u013c\'\u0001\u0000\u0000\u0000\u013d\u013e\u0003\u0096"+
		"K\u0000\u013e\u013f\u0005V\u0000\u0000\u013f\u0140\u0005Q\u0000\u0000"+
		"\u0140\u0141\u0005M\u0000\u0000\u0141\u0142\u0005V\u0000\u0000\u0142\u0143"+
		"\u0005F\u0000\u0000\u0143\u0144\u0005=\u0000\u0000\u0144\u0145\u0003d"+
		"2\u0000\u0145\u0146\u0005>\u0000\u0000\u0146\u0147\u0003&\u0013\u0000"+
		"\u0147\u0148\u0005G\u0000\u0000\u0148)\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0003\u0082A\u0000\u014a+\u0001\u0000\u0000\u0000\u014b\u0152\u0003F"+
		"#\u0000\u014c\u0152\u00030\u0018\u0000\u014d\u0152\u0003.\u0017\u0000"+
		"\u014e\u0152\u0003*\u0015\u0000\u014f\u0152\u0003(\u0014\u0000\u0150\u0152"+
		"\u0003:\u001d\u0000\u0151\u014b\u0001\u0000\u0000\u0000\u0151\u014c\u0001"+
		"\u0000\u0000\u0000\u0151\u014d\u0001\u0000\u0000\u0000\u0151\u014e\u0001"+
		"\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0150\u0001"+
		"\u0000\u0000\u0000\u0152-\u0001\u0000\u0000\u0000\u0153\u0154\u0005\u001f"+
		"\u0000\u0000\u0154\u0155\u0005J\u0000\u0000\u0155\u0156\u0005 \u0000\u0000"+
		"\u0156\u0157\u00056\u0000\u0000\u0157\u0158\u0003N\'\u0000\u0158\u0159"+
		"\u00057\u0000\u0000\u0159/\u0001\u0000\u0000\u0000\u015a\u015b\u0005\u001f"+
		"\u0000\u0000\u015b\u015c\u0005J\u0000\u0000\u015c\u015d\u0005!\u0000\u0000"+
		"\u015d\u015e\u00056\u0000\u0000\u015e\u015f\u0003N\'\u0000\u015f\u0160"+
		"\u00057\u0000\u0000\u0160\u0161\u0005G\u0000\u0000\u01611\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0005V\u0000\u0000\u0163\u0164\u0003L&\u0000"+
		"\u0164\u0165\u0005J\u0000\u0000\u0165\u0166\u0005\u001e\u0000\u0000\u0166"+
		"\u0167\u00056\u0000\u0000\u0167\u0168\u0003L&\u0000\u0168\u0169\u0005"+
		"<\u0000\u0000\u0169\u016a\u0003.\u0017\u0000\u016a\u016b\u00057\u0000"+
		"\u0000\u016b\u016c\u0005G\u0000\u0000\u016c\u0182\u0001\u0000\u0000\u0000"+
		"\u016d\u016f\u0003@ \u0000\u016e\u0170\u0005V\u0000\u0000\u016f\u016e"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u0001\u0000\u0000\u0000\u0171\u0174\u0003L&\u0000\u0172\u0173\u0005\u000e"+
		"\u0000\u0000\u0173\u0175\u0003d2\u0000\u0174\u0172\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0005G\u0000\u0000\u0177\u0182\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0003@ \u0000\u0179\u017b\u00056\u0000\u0000\u017a\u017c\u0003"+
		"4\u001a\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000"+
		"\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017f\u00057\u0000"+
		"\u0000\u017e\u0180\u0005G\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0182\u0001\u0000\u0000\u0000"+
		"\u0181\u0162\u0001\u0000\u0000\u0000\u0181\u016d\u0001\u0000\u0000\u0000"+
		"\u0181\u0178\u0001\u0000\u0000\u0000\u01823\u0001\u0000\u0000\u0000\u0183"+
		"\u0191\u0003<\u001e\u0000\u0184\u0185\u00054\u0000\u0000\u0185\u0186\u0003"+
		">\u001f\u0000\u0186\u0187\u00055\u0000\u0000\u0187\u0191\u0001\u0000\u0000"+
		"\u0000\u0188\u018d\u0003\u0082A\u0000\u0189\u018a\u0005H\u0000\u0000\u018a"+
		"\u018c\u0003\u0082A\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u018f"+
		"\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d"+
		"\u0001\u0000\u0000\u0000\u0190\u0183\u0001\u0000\u0000\u0000\u0190\u0184"+
		"\u0001\u0000\u0000\u0000\u0190\u0188\u0001\u0000\u0000\u0000\u01915\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u0003@ \u0000\u0193\u0194\u00056\u0000"+
		"\u0000\u0194\u0195\u0005V\u0000\u0000\u0195\u0196\u0005<\u0000\u0000\u0196"+
		"\u0197\u0003@ \u0000\u0197\u0198\u0007\u0002\u0000\u0000\u0198\u0199\u0003"+
		"@ \u0000\u0199\u019a\u00057\u0000\u0000\u019a\u01a8\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0003@ \u0000\u019c\u019d\u00056\u0000\u0000\u019d"+
		"\u019e\u0003L&\u0000\u019e\u019f\u0005<\u0000\u0000\u019f\u01a0\u0003"+
		"@ \u0000\u01a0\u01a1\u0003L&\u0000\u01a1\u01a2\u0005H\u0000\u0000\u01a2"+
		"\u01a3\u0005C\u0000\u0000\u01a3\u01a4\u00057\u0000\u0000\u01a4\u01a5\u0003"+
		"P(\u0000\u01a5\u01a6\u0005C\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a7\u0192\u0001\u0000\u0000\u0000\u01a7\u019b\u0001\u0000\u0000"+
		"\u0000\u01a87\u0001\u0000\u0000\u0000\u01a9\u01ad\u00034\u001a\u0000\u01aa"+
		"\u01ad\u00036\u001b\u0000\u01ab\u01ad\u0003N\'\u0000\u01ac\u01a9\u0001"+
		"\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ad9\u0001\u0000\u0000\u0000\u01ae\u01af\u0005\r"+
		"\u0000\u0000\u01af\u01b1\u00038\u001c\u0000\u01b0\u01b2\u0005G\u0000\u0000"+
		"\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b2;\u0001\u0000\u0000\u0000\u01b3\u01b4\u00058\u0000\u0000\u01b4\u01b9"+
		"\u0003>\u001f\u0000\u01b5\u01b6\u0005H\u0000\u0000\u01b6\u01b8\u0003>"+
		"\u001f\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000"+
		"\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000"+
		"\u0000\u0000\u01bc\u01bd\u00059\u0000\u0000\u01bd=\u0001\u0000\u0000\u0000"+
		"\u01be\u01bf\u0005V\u0000\u0000\u01bf\u01c0\u0005I\u0000\u0000\u01c0\u01cf"+
		"\u0003\u0082A\u0000\u01c1\u01c2\u0005\u0015\u0000\u0000\u01c2\u01c3\u0005"+
		"I\u0000\u0000\u01c3\u01cf\u0003\u0082A\u0000\u01c4\u01c5\u0005\u0018\u0000"+
		"\u0000\u01c5\u01c6\u0005I\u0000\u0000\u01c6\u01cf\u0003\u0082A\u0000\u01c7"+
		"\u01c9\u0005J\u0000\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9\u01cc"+
		"\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cb\u01cd\u0001\u0000\u0000\u0000\u01cc\u01ca"+
		"\u0001\u0000\u0000\u0000\u01cd\u01cf\u0003@ \u0000\u01ce\u01be\u0001\u0000"+
		"\u0000\u0000\u01ce\u01c1\u0001\u0000\u0000\u0000\u01ce\u01c4\u0001\u0000"+
		"\u0000\u0000\u01ce\u01ca\u0001\u0000\u0000\u0000\u01cf?\u0001\u0000\u0000"+
		"\u0000\u01d0\u01dd\u0005V\u0000\u0000\u01d1\u01d2\u0005J\u0000\u0000\u01d2"+
		"\u01d4\u0005V\u0000\u0000\u01d3\u01d5\u0005Q\u0000\u0000\u01d4\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d7\u00054\u0000\u0000\u01d7\u01d8\u0005V\u0000"+
		"\u0000\u01d8\u01da\u00055\u0000\u0000\u01d9\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0001\u0000\u0000\u0000"+
		"\u01db\u01d1\u0001\u0000\u0000\u0000\u01dc\u01df\u0001\u0000\u0000\u0000"+
		"\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000"+
		"\u01deA\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0005M\u0000\u0000\u01e1\u01e3\u0005\t\u0000\u0000\u01e2\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e6\u0003L&\u0000\u01e5\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e8\u0005I\u0000\u0000\u01e8\u01ea\u0003\u0098L\u0000"+
		"\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000"+
		"\u01ea\u01f4\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005Q\u0000\u0000\u01ec"+
		"\u01ed\u0003L&\u0000\u01ed\u01ee\u0005I\u0000\u0000\u01ee\u01ef\u0005"+
		"V\u0000\u0000\u01ef\u01f0\u0005=\u0000\u0000\u01f0\u01f1\u0003d2\u0000"+
		"\u01f1\u01f2\u0005>\u0000\u0000\u01f2\u01f4\u0001\u0000\u0000\u0000\u01f3"+
		"\u01e2\u0001\u0000\u0000\u0000\u01f3\u01eb\u0001\u0000\u0000\u0000\u01f4"+
		"C\u0001\u0000\u0000\u0000\u01f5\u01f8\u0005\t\u0000\u0000\u01f6\u01f8"+
		"\u0003\u0096K\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0005V\u0000\u0000\u01fa\u01fb\u0003B!"+
		"\u0000\u01fb\u01ff\u00058\u0000\u0000\u01fc\u01fe\u0003,\u0016\u0000\u01fd"+
		"\u01fc\u0001\u0000\u0000\u0000\u01fe\u0201\u0001\u0000\u0000\u0000\u01ff"+
		"\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200"+
		"\u0202\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u00059\u0000\u0000\u0203E\u0001\u0000\u0000\u0000\u0204\u0207\u0003"+
		"D\"\u0000\u0205\u0207\u0003\u00a2Q\u0000\u0206\u0204\u0001\u0000\u0000"+
		"\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0207G\u0001\u0000\u0000\u0000"+
		"\u0208\u020a\u0005H\u0000\u0000\u0209\u020b\u0005E\u0000\u0000\u020a\u0209"+
		"\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020c"+
		"\u0001\u0000\u0000\u0000\u020c\u020d\u0005V\u0000\u0000\u020d\u020e\u0005"+
		"I\u0000\u0000\u020e\u0210\u0003h4\u0000\u020f\u0208\u0001\u0000\u0000"+
		"\u0000\u0210\u0213\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000"+
		"\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0223\u0001\u0000\u0000"+
		"\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0214\u0215\u0005M\u0000\u0000"+
		"\u0215\u021f\u0003N\'\u0000\u0216\u0217\u0005H\u0000\u0000\u0217\u0218"+
		"\u0005V\u0000\u0000\u0218\u0219\u0005I\u0000\u0000\u0219\u021a\u0003h"+
		"4\u0000\u021a\u021b\u0005M\u0000\u0000\u021b\u021c\u0003N\'\u0000\u021c"+
		"\u021e\u0001\u0000\u0000\u0000\u021d\u0216\u0001\u0000\u0000\u0000\u021e"+
		"\u0221\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f"+
		"\u0220\u0001\u0000\u0000\u0000\u0220\u0223\u0001\u0000\u0000\u0000\u0221"+
		"\u021f\u0001\u0000\u0000\u0000\u0222\u0211\u0001\u0000\u0000\u0000\u0222"+
		"\u0214\u0001\u0000\u0000\u0000\u0223I\u0001\u0000\u0000\u0000\u0224\u0226"+
		"\u0005E\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001"+
		"\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u022c\u0005"+
		"V\u0000\u0000\u0228\u0229\u0005I\u0000\u0000\u0229\u022a\u0003h4\u0000"+
		"\u022a\u022b\u0003H$\u0000\u022b\u022d\u0001\u0000\u0000\u0000\u022c\u0228"+
		"\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u0237"+
		"\u0001\u0000\u0000\u0000\u022e\u0233\u0003@ \u0000\u022f\u0230\u0005H"+
		"\u0000\u0000\u0230\u0232\u0003@ \u0000\u0231\u022f\u0001\u0000\u0000\u0000"+
		"\u0232\u0235\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000"+
		"\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0237\u0001\u0000\u0000\u0000"+
		"\u0235\u0233\u0001\u0000\u0000\u0000\u0236\u0225\u0001\u0000\u0000\u0000"+
		"\u0236\u022e\u0001\u0000\u0000\u0000\u0237K\u0001\u0000\u0000\u0000\u0238"+
		"\u023c\u00056\u0000\u0000\u0239\u023b\u0003J%\u0000\u023a\u0239\u0001"+
		"\u0000\u0000\u0000\u023b\u023e\u0001\u0000\u0000\u0000\u023c\u023a\u0001"+
		"\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023f\u0001"+
		"\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023f\u0240\u0005"+
		"7\u0000\u0000\u0240M\u0001\u0000\u0000\u0000\u0241\u0242\u0007\u0003\u0000"+
		"\u0000\u0242O\u0001\u0000\u0000\u0000\u0243\u0244\u0007\u0004\u0000\u0000"+
		"\u0244Q\u0001\u0000\u0000\u0000\u0245\u0246\u0005K\u0000\u0000\u0246\u0247"+
		"\u0005J\u0000\u0000\u0247\u0248\u00054\u0000\u0000\u0248\u0249\u0003N"+
		"\'\u0000\u0249\u024a\u00055\u0000\u0000\u024a\u024c\u0001\u0000\u0000"+
		"\u0000\u024b\u0245\u0001\u0000\u0000\u0000\u024c\u024f\u0001\u0000\u0000"+
		"\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000"+
		"\u0000\u024eS\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000"+
		"\u0250\u0251\u0006*\uffff\uffff\u0000\u0251\u0252\u0005V\u0000\u0000\u0252"+
		"\u0253\u0005M\u0000\u0000\u0253\u0254\u0003\u0082A\u0000\u0254\u0255\u0005"+
		"G\u0000\u0000\u0255\u026d\u0001\u0000\u0000\u0000\u0256\u0257\u0003@ "+
		"\u0000\u0257\u0262\u0003R)\u0000\u0258\u025a\u0005M\u0000\u0000\u0259"+
		"\u025b\u0005-\u0000\u0000\u025a\u0259\u0001\u0000\u0000\u0000\u025a\u025b"+
		"\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u0260"+
		"\u0003h4\u0000\u025d\u025e\u0003P(\u0000\u025e\u025f\u0003N\'\u0000\u025f"+
		"\u0261\u0001\u0000\u0000\u0000\u0260\u025d\u0001\u0000\u0000\u0000\u0260"+
		"\u0261\u0001\u0000\u0000\u0000\u0261\u0263\u0001\u0000\u0000\u0000\u0262"+
		"\u0258\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263"+
		"\u0265\u0001\u0000\u0000\u0000\u0264\u0266\u0005G\u0000\u0000\u0265\u0264"+
		"\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u026d"+
		"\u0001\u0000\u0000\u0000\u0267\u0268\u0003@ \u0000\u0268\u0269\u0005M"+
		"\u0000\u0000\u0269\u026a\u0003<\u001e\u0000\u026a\u026b\u0005G\u0000\u0000"+
		"\u026b\u026d\u0001\u0000\u0000\u0000\u026c\u0250\u0001\u0000\u0000\u0000"+
		"\u026c\u0256\u0001\u0000\u0000\u0000\u026c\u0267\u0001\u0000\u0000\u0000"+
		"\u026d\u0279\u0001\u0000\u0000\u0000\u026e\u026f\n\u0002\u0000\u0000\u026f"+
		"\u0270\u0005M\u0000\u0000\u0270\u0275\u0003T*\u0000\u0271\u0272\u0005"+
		"\u000e\u0000\u0000\u0272\u0273\u0003j5\u0000\u0273\u0274\u0005G\u0000"+
		"\u0000\u0274\u0276\u0001\u0000\u0000\u0000\u0275\u0271\u0001\u0000\u0000"+
		"\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0278\u0001\u0000\u0000"+
		"\u0000\u0277\u026e\u0001\u0000\u0000\u0000\u0278\u027b\u0001\u0000\u0000"+
		"\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000"+
		"\u0000\u027aU\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000"+
		"\u027c\u0280\u0007\u0005\u0000\u0000\u027d\u027f\u0003$\u0012\u0000\u027e"+
		"\u027d\u0001\u0000\u0000\u0000\u027f\u0282\u0001\u0000\u0000\u0000\u0280"+
		"\u027e\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281"+
		"\u0289\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0283"+
		"\u0285\u0005*\u0000\u0000\u0284\u0286\u0003$\u0012\u0000\u0285\u0284\u0001"+
		"\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0285\u0001"+
		"\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u028a\u0001"+
		"\u0000\u0000\u0000\u0289\u0283\u0001\u0000\u0000\u0000\u0289\u028a\u0001"+
		"\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028c\u0007"+
		"\u0006\u0000\u0000\u028cW\u0001\u0000\u0000\u0000\u028d\u028e\u00056\u0000"+
		"\u0000\u028e\u028f\u0005\u0002\u0000\u0000\u028f\u0290\u0005\u0081\u0000"+
		"\u0000\u0290\u0291\u0005\u0083\u0000\u0000\u0291\u0292\u0005\u0089\u0000"+
		"\u0000\u0292\u0293\u0005\u008a\u0000\u0000\u0293\u029c\u0005\u008b\u0000"+
		"\u0000\u0294\u0299\u0005\u008a\u0000\u0000\u0295\u0296\u0005\u0088\u0000"+
		"\u0000\u0296\u0298\u0005\u008a\u0000\u0000\u0297\u0295\u0001\u0000\u0000"+
		"\u0000\u0298\u029b\u0001\u0000\u0000\u0000\u0299\u0297\u0001\u0000\u0000"+
		"\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029d\u0001\u0000\u0000"+
		"\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029c\u0294\u0001\u0000\u0000"+
		"\u0000\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000"+
		"\u0000\u029e\u029f\u0005\u0081\u0000\u0000\u029f\u02a0\u0005\u008c\u0000"+
		"\u0000\u02a0Y\u0001\u0000\u0000\u0000\u02a1\u02a4\u0003\\.\u0000\u02a2"+
		"\u02a4\u0003^/\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a4[\u0001\u0000\u0000\u0000\u02a5\u02a9\u0003`0"+
		"\u0000\u02a6\u02a8\u0003$\u0012\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a8\u02ab\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000"+
		"\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ac\u0001\u0000\u0000\u0000"+
		"\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ac\u02ad\u0003b1\u0000\u02ad]"+
		"\u0001\u0000\u0000\u0000\u02ae\u02b2\u0005=\u0000\u0000\u02af\u02b1\u0003"+
		"$\u0012\u0000\u02b0\u02af\u0001\u0000\u0000\u0000\u02b1\u02b4\u0001\u0000"+
		"\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000"+
		"\u0000\u0000\u02b3\u02b5\u0001\u0000\u0000\u0000\u02b4\u02b2\u0001\u0000"+
		"\u0000\u0000\u02b5\u02b6\u0005?\u0000\u0000\u02b6\u02b7\u0005>\u0000\u0000"+
		"\u02b7_\u0001\u0000\u0000\u0000\u02b8\u02bc\u0005=\u0000\u0000\u02b9\u02bb"+
		"\u0003$\u0012\u0000\u02ba\u02b9\u0001\u0000\u0000\u0000\u02bb\u02be\u0001"+
		"\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001"+
		"\u0000\u0000\u0000\u02bd\u02bf\u0001\u0000\u0000\u0000\u02be\u02bc\u0001"+
		"\u0000\u0000\u0000\u02bf\u02c0\u0005>\u0000\u0000\u02c0a\u0001\u0000\u0000"+
		"\u0000\u02c1\u02c2\u0005=\u0000\u0000\u02c2\u02c3\u0005?\u0000\u0000\u02c3"+
		"\u02c4\u0005V\u0000\u0000\u02c4\u02c5\u0005>\u0000\u0000\u02c5c\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c7\u0005V\u0000\u0000\u02c7\u02c8\u00054\u0000"+
		"\u0000\u02c8\u02c9\u00055\u0000\u0000\u02c9e\u0001\u0000\u0000\u0000\u02ca"+
		"\u02cb\u0005V\u0000\u0000\u02cb\u02cc\u0005=\u0000\u0000\u02cc\u02d1\u0003"+
		"N\'\u0000\u02cd\u02ce\u0005H\u0000\u0000\u02ce\u02d0\u0003N\'\u0000\u02cf"+
		"\u02cd\u0001\u0000\u0000\u0000\u02d0\u02d3\u0001\u0000\u0000\u0000\u02d1"+
		"\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2"+
		"\u02d4\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d4"+
		"\u02d5\u0005>\u0000\u0000\u02d5g\u0001\u0000\u0000\u0000\u02d6\u02dc\u0003"+
		"j5\u0000\u02d7\u02dc\u0003l6\u0000\u02d8\u02dc\u0003d2\u0000\u02d9\u02dc"+
		"\u0003f3\u0000\u02da\u02dc\u0003n7\u0000\u02db\u02d6\u0001\u0000\u0000"+
		"\u0000\u02db\u02d7\u0001\u0000\u0000\u0000\u02db\u02d8\u0001\u0000\u0000"+
		"\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02db\u02da\u0001\u0000\u0000"+
		"\u0000\u02dci\u0001\u0000\u0000\u0000\u02dd\u02e6\u0005V\u0000\u0000\u02de"+
		"\u02e6\u0005#\u0000\u0000\u02df\u02e6\u0005%\u0000\u0000\u02e0\u02e6\u0005"+
		"&\u0000\u0000\u02e1\u02e6\u0005\"\u0000\u0000\u02e2\u02e6\u0005$\u0000"+
		"\u0000\u02e3\u02e6\u0005\u001c\u0000\u0000\u02e4\u02e6\u0003V+\u0000\u02e5"+
		"\u02dd\u0001\u0000\u0000\u0000\u02e5\u02de\u0001\u0000\u0000\u0000\u02e5"+
		"\u02df\u0001\u0000\u0000\u0000\u02e5\u02e0\u0001\u0000\u0000\u0000\u02e5"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e5\u02e2\u0001\u0000\u0000\u0000\u02e5"+
		"\u02e3\u0001\u0000\u0000\u0000\u02e5\u02e4\u0001\u0000\u0000\u0000\u02e6"+
		"k\u0001\u0000\u0000\u0000\u02e7\u02e8\u0005\b\u0000\u0000\u02e8\u02e9"+
		"\u0005=\u0000\u0000\u02e9\u02ea\u0005$\u0000\u0000\u02ea\u02eb\u0005>"+
		"\u0000\u0000\u02ebm\u0001\u0000\u0000\u0000\u02ec\u02ed\u0005#\u0000\u0000"+
		"\u02ed\u02ee\u00054\u0000\u0000\u02ee\u02ef\u00055\u0000\u0000\u02efo"+
		"\u0001\u0000\u0000\u0000\u02f0\u0303\u0005G\u0000\u0000\u02f1\u0303\u0005"+
		"H\u0000\u0000\u02f2\u0303\u0005I\u0000\u0000\u02f3\u0303\u0005J\u0000"+
		"\u0000\u02f4\u0303\u0005K\u0000\u0000\u02f5\u0303\u0005L\u0000\u0000\u02f6"+
		"\u0303\u0005M\u0000\u0000\u02f7\u0303\u0005=\u0000\u0000\u02f8\u0303\u0005"+
		">\u0000\u0000\u02f9\u0303\u0003P(\u0000\u02fa\u0303\u0005Q\u0000\u0000"+
		"\u02fb\u0303\u00054\u0000\u0000\u02fc\u0303\u00055\u0000\u0000\u02fd\u0303"+
		"\u00056\u0000\u0000\u02fe\u0303\u00057\u0000\u0000\u02ff\u0303\u00058"+
		"\u0000\u0000\u0300\u0303\u00059\u0000\u0000\u0301\u0303\u0005-\u0000\u0000"+
		"\u0302\u02f0\u0001\u0000\u0000\u0000\u0302\u02f1\u0001\u0000\u0000\u0000"+
		"\u0302\u02f2\u0001\u0000\u0000\u0000\u0302\u02f3\u0001\u0000\u0000\u0000"+
		"\u0302\u02f4\u0001\u0000\u0000\u0000\u0302\u02f5\u0001\u0000\u0000\u0000"+
		"\u0302\u02f6\u0001\u0000\u0000\u0000\u0302\u02f7\u0001\u0000\u0000\u0000"+
		"\u0302\u02f8\u0001\u0000\u0000\u0000\u0302\u02f9\u0001\u0000\u0000\u0000"+
		"\u0302\u02fa\u0001\u0000\u0000\u0000\u0302\u02fb\u0001\u0000\u0000\u0000"+
		"\u0302\u02fc\u0001\u0000\u0000\u0000\u0302\u02fd\u0001\u0000\u0000\u0000"+
		"\u0302\u02fe\u0001\u0000\u0000\u0000\u0302\u02ff\u0001\u0000\u0000\u0000"+
		"\u0302\u0300\u0001\u0000\u0000\u0000\u0302\u0301\u0001\u0000\u0000\u0000"+
		"\u0303q\u0001\u0000\u0000\u0000\u0304\u0313\u00054\u0000\u0000\u0305\u0310"+
		"\u0003\u0082A\u0000\u0306\u0307\u0005H\u0000\u0000\u0307\u030b\u0003\u0082"+
		"A\u0000\u0308\u030a\u0005H\u0000\u0000\u0309\u0308\u0001\u0000\u0000\u0000"+
		"\u030a\u030d\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000"+
		"\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030f\u0001\u0000\u0000\u0000"+
		"\u030d\u030b\u0001\u0000\u0000\u0000\u030e\u0306\u0001\u0000\u0000\u0000"+
		"\u030f\u0312\u0001\u0000\u0000\u0000\u0310\u030e\u0001\u0000\u0000\u0000"+
		"\u0310\u0311\u0001\u0000\u0000\u0000\u0311\u0314\u0001\u0000\u0000\u0000"+
		"\u0312\u0310\u0001\u0000\u0000\u0000\u0313\u0305\u0001\u0000\u0000\u0000"+
		"\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000"+
		"\u0315\u0316\u00055\u0000\u0000\u0316s\u0001\u0000\u0000\u0000\u0317\u031b"+
		"\u00058\u0000\u0000\u0318\u031a\u0003\u0082A\u0000\u0319\u0318\u0001\u0000"+
		"\u0000\u0000\u031a\u031d\u0001\u0000\u0000\u0000\u031b\u0319\u0001\u0000"+
		"\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u031e\u0001\u0000"+
		"\u0000\u0000\u031d\u031b\u0001\u0000\u0000\u0000\u031e\u031f\u00059\u0000"+
		"\u0000\u031fu\u0001\u0000\u0000\u0000\u0320\u0321\u0005\u001d\u0000\u0000"+
		"\u0321\u0322\u0003t:\u0000\u0322w\u0001\u0000\u0000\u0000\u0323\u0324"+
		"\u0005\u001e\u0000\u0000\u0324\u0325\u0003t:\u0000\u0325y\u0001\u0000"+
		"\u0000\u0000\u0326\u032a\u0003N\'\u0000\u0327\u0328\u0003P(\u0000\u0328"+
		"\u0329\u0003N\'\u0000\u0329\u032b\u0001\u0000\u0000\u0000\u032a\u0327"+
		"\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b{\u0001"+
		"\u0000\u0000\u0000\u032c\u032e\u0003@ \u0000\u032d\u032f\u0005K\u0000"+
		"\u0000\u032e\u032d\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000\u0000"+
		"\u0000\u0330\u032e\u0001\u0000\u0000\u0000\u0330\u0331\u0001\u0000\u0000"+
		"\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332\u0333\u0003N\'\u0000"+
		"\u0333}\u0001\u0000\u0000\u0000\u0334\u0335\u0005V\u0000\u0000\u0335\u0336"+
		"\u0005J\u0000\u0000\u0336\u0337\u0005\u0010\u0000\u0000\u0337\u0338\u0005"+
		"J\u0000\u0000\u0338\u0339\u0005\u0011\u0000\u0000\u0339\u033a\u00056\u0000"+
		"\u0000\u033a\u033b\u00054\u0000\u0000\u033b\u0340\u0003N\'\u0000\u033c"+
		"\u033d\u0005H\u0000\u0000\u033d\u033f\u0003N\'\u0000\u033e\u033c\u0001"+
		"\u0000\u0000\u0000\u033f\u0342\u0001\u0000\u0000\u0000\u0340\u033e\u0001"+
		"\u0000\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341\u0343\u0001"+
		"\u0000\u0000\u0000\u0342\u0340\u0001\u0000\u0000\u0000\u0343\u0344\u0005"+
		"5\u0000\u0000\u0344\u0345\u00057\u0000\u0000\u0345\u0346\u0005G\u0000"+
		"\u0000\u0346\u007f\u0001\u0000\u0000\u0000\u0347\u0349\u0003@ \u0000\u0348"+
		"\u0347\u0001\u0000\u0000\u0000\u0349\u034c\u0001\u0000\u0000\u0000\u034a"+
		"\u0348\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b"+
		"\u034d\u0001\u0000\u0000\u0000\u034c\u034a\u0001\u0000\u0000\u0000\u034d"+
		"\u0351\u00056\u0000\u0000\u034e\u0350\u0003N\'\u0000\u034f\u034e\u0001"+
		"\u0000\u0000\u0000\u0350\u0353\u0001\u0000\u0000\u0000\u0351\u034f\u0001"+
		"\u0000\u0000\u0000\u0351\u0352\u0001\u0000\u0000\u0000\u0352\u0354\u0001"+
		"\u0000\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0354\u0355\u0005"+
		"7\u0000\u0000\u0355\u0356\u0005G\u0000\u0000\u0356\u0081\u0001\u0000\u0000"+
		"\u0000\u0357\u0366\u0003N\'\u0000\u0358\u0366\u0003~?\u0000\u0359\u0366"+
		"\u0003r9\u0000\u035a\u0366\u0003\u00a0P\u0000\u035b\u0366\u0003\u0094"+
		"J\u0000\u035c\u0366\u0003v;\u0000\u035d\u0366\u0003x<\u0000\u035e\u0366"+
		"\u0003<\u001e\u0000\u035f\u0366\u0003\u0080@\u0000\u0360\u0366\u0003\u0084"+
		"B\u0000\u0361\u0366\u0003@ \u0000\u0362\u0366\u0003T*\u0000\u0363\u0366"+
		"\u0003|>\u0000\u0364\u0366\u0003z=\u0000\u0365\u0357\u0001\u0000\u0000"+
		"\u0000\u0365\u0358\u0001\u0000\u0000\u0000\u0365\u0359\u0001\u0000\u0000"+
		"\u0000\u0365\u035a\u0001\u0000\u0000\u0000\u0365\u035b\u0001\u0000\u0000"+
		"\u0000\u0365\u035c\u0001\u0000\u0000\u0000\u0365\u035d\u0001\u0000\u0000"+
		"\u0000\u0365\u035e\u0001\u0000\u0000\u0000\u0365\u035f\u0001\u0000\u0000"+
		"\u0000\u0365\u0360\u0001\u0000\u0000\u0000\u0365\u0361\u0001\u0000\u0000"+
		"\u0000\u0365\u0362\u0001\u0000\u0000\u0000\u0365\u0363\u0001\u0000\u0000"+
		"\u0000\u0365\u0364\u0001\u0000\u0000\u0000\u0366\u0083\u0001\u0000\u0000"+
		"\u0000\u0367\u0368\u0005(\u0000\u0000\u0368\u0369\u0005X\u0000\u0000\u0369"+
		"\u036e\u0003\u0086C\u0000\u036a\u036b\u0005)\u0000\u0000\u036b\u036c\u0005"+
		"a\u0000\u0000\u036c\u036e\u0003\u008aE\u0000\u036d\u0367\u0001\u0000\u0000"+
		"\u0000\u036d\u036a\u0001\u0000\u0000\u0000\u036e\u0085\u0001\u0000\u0000"+
		"\u0000\u036f\u0373\u0005Y\u0000\u0000\u0370\u0372\u0003\u0088D\u0000\u0371"+
		"\u0370\u0001\u0000\u0000\u0000\u0372\u0375\u0001\u0000\u0000\u0000\u0373"+
		"\u0371\u0001\u0000\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000\u0374"+
		"\u0376\u0001\u0000\u0000\u0000\u0375\u0373\u0001\u0000\u0000\u0000\u0376"+
		"\u0377\u0005^\u0000\u0000\u0377\u0087\u0001\u0000\u0000\u0000\u0378\u0379"+
		"\u0005Z\u0000\u0000\u0379\u037a\u0005]\u0000\u0000\u037a\u037b\u0005\\"+
		"\u0000\u0000\u037b\u0383\u0005]\u0000\u0000\u037c\u037e\u0005[\u0000\u0000"+
		"\u037d\u037c\u0001\u0000\u0000\u0000\u037d\u037e\u0001\u0000\u0000\u0000"+
		"\u037e\u037f\u0001\u0000\u0000\u0000\u037f\u0380\u0005Z\u0000\u0000\u0380"+
		"\u0381\u0005]\u0000\u0000\u0381\u0382\u0005X\u0000\u0000\u0382\u0384\u0005"+
		"]\u0000\u0000\u0383\u037d\u0001\u0000\u0000\u0000\u0383\u0384\u0001\u0000"+
		"\u0000\u0000\u0384\u0089\u0001\u0000\u0000\u0000\u0385\u0386\u0005c\u0000"+
		"\u0000\u0386\u0387\u0003\u008cF\u0000\u0387\u0388\u0005\u007f\u0000\u0000"+
		"\u0388\u008b\u0001\u0000\u0000\u0000\u0389\u038d\u0005~\u0000\u0000\u038a"+
		"\u038b\u0003\u008eG\u0000\u038b\u038c\u0005b\u0000\u0000\u038c\u038e\u0001"+
		"\u0000\u0000\u0000\u038d\u038a\u0001\u0000\u0000\u0000\u038d\u038e\u0001"+
		"\u0000\u0000\u0000\u038e\u03a9\u0001\u0000\u0000\u0000\u038f\u0397\u0003"+
		"\u0090H\u0000\u0390\u0391\u0005w\u0000\u0000\u0391\u0393\u0005`\u0000"+
		"\u0000\u0392\u0390\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000"+
		"\u0000\u0393\u0394\u0001\u0000\u0000\u0000\u0394\u0395\u0003\u008eG\u0000"+
		"\u0395\u0396\u0007\u0007\u0000\u0000\u0396\u0398\u0001\u0000\u0000\u0000"+
		"\u0397\u0392\u0001\u0000\u0000\u0000\u0397\u0398\u0001\u0000\u0000\u0000"+
		"\u0398\u03a9\u0001\u0000\u0000\u0000\u0399\u03a6\u0003\u0090H\u0000\u039a"+
		"\u039b\u0005z\u0000\u0000\u039b\u039c\u0005~\u0000\u0000\u039c\u039d\u0005"+
		"u\u0000\u0000\u039d\u03a0\u0003\u0090H\u0000\u039e\u039f\u0005w\u0000"+
		"\u0000\u039f\u03a1\u0005`\u0000\u0000\u03a0\u039e\u0001\u0000\u0000\u0000"+
		"\u03a0\u03a1\u0001\u0000\u0000\u0000\u03a1\u03a2\u0001\u0000\u0000\u0000"+
		"\u03a2\u03a3\u0003\u008eG\u0000\u03a3\u03a4\u0005~\u0000\u0000\u03a4\u03a5"+
		"\u0005{\u0000\u0000\u03a5\u03a7\u0001\u0000\u0000\u0000\u03a6\u039a\u0001"+
		"\u0000\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7\u03a9\u0001"+
		"\u0000\u0000\u0000\u03a8\u0389\u0001\u0000\u0000\u0000\u03a8\u038f\u0001"+
		"\u0000\u0000\u0000\u03a8\u0399\u0001\u0000\u0000\u0000\u03a9\u008d\u0001"+
		"\u0000\u0000\u0000\u03aa\u03ab\u0007\b\u0000\u0000\u03ab\u008f\u0001\u0000"+
		"\u0000\u0000\u03ac\u03ae\u0005g\u0000\u0000\u03ad\u03ac\u0001\u0000\u0000"+
		"\u0000\u03ad\u03ae\u0001\u0000\u0000\u0000\u03ae\u03af\u0001\u0000\u0000"+
		"\u0000\u03af\u03b2\u0005~\u0000\u0000\u03b0\u03b1\u0005s\u0000\u0000\u03b1"+
		"\u03b3\u0005~\u0000\u0000\u03b2\u03b0\u0001\u0000\u0000\u0000\u03b2\u03b3"+
		"\u0001\u0000\u0000\u0000\u03b3\u0091\u0001\u0000\u0000\u0000\u03b4\u03b5"+
		"\u0005\u000b\u0000\u0000\u03b5\u03b9\u00056\u0000\u0000\u03b6\u03b8\u0003"+
		"$\u0012\u0000\u03b7\u03b6\u0001\u0000\u0000\u0000\u03b8\u03bb\u0001\u0000"+
		"\u0000\u0000\u03b9\u03b7\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000"+
		"\u0000\u0000\u03ba\u03bc\u0001\u0000\u0000\u0000\u03bb\u03b9\u0001\u0000"+
		"\u0000\u0000\u03bc\u03bd\u00057\u0000\u0000\u03bd\u0093\u0001\u0000\u0000"+
		"\u0000\u03be\u03bf\u0005V\u0000\u0000\u03bf\u03c0\u0005K\u0000\u0000\u03c0"+
		"\u03c1\u0003h4\u0000\u03c1\u03c2\u0005I\u0000\u0000\u03c2\u03c3\u0003"+
		"h4\u0000\u03c3\u03cf\u0001\u0000\u0000\u0000\u03c4\u03c5\u0003\u0092I"+
		"\u0000\u03c5\u03c6\u0005\r\u0000\u0000\u03c6\u03c7\u0005G\u0000\u0000"+
		"\u03c7\u03cf\u0001\u0000\u0000\u0000\u03c8\u03c9\u0003\u0092I\u0000\u03c9"+
		"\u03cc\u0003t:\u0000\u03ca\u03cb\u0005\f\u0000\u0000\u03cb\u03cd\u0003"+
		"t:\u0000\u03cc\u03ca\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000"+
		"\u0000\u03cd\u03cf\u0001\u0000\u0000\u0000\u03ce\u03be\u0001\u0000\u0000"+
		"\u0000\u03ce\u03c4\u0001\u0000\u0000\u0000\u03ce\u03c8\u0001\u0000\u0000"+
		"\u0000\u03cf\u0095\u0001\u0000\u0000\u0000\u03d0\u03d1\u0007\t\u0000\u0000"+
		"\u03d1\u0097\u0001\u0000\u0000\u0000\u03d2\u03d5\u0003h4\u0000\u03d3\u03d4"+
		"\u0005*\u0000\u0000\u03d4\u03d6\u0003h4\u0000\u03d5\u03d3\u0001\u0000"+
		"\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000\u03d6\u0099\u0001\u0000"+
		"\u0000\u0000\u03d7\u03d9\u0005V\u0000\u0000\u03d8\u03d7\u0001\u0000\u0000"+
		"\u0000\u03d9\u03dc\u0001\u0000\u0000\u0000\u03da\u03d8\u0001\u0000\u0000"+
		"\u0000\u03da\u03db\u0001\u0000\u0000\u0000\u03db\u03dd\u0001\u0000\u0000"+
		"\u0000\u03dc\u03da\u0001\u0000\u0000\u0000\u03dd\u03e0\u0003L&\u0000\u03de"+
		"\u03df\u0005J\u0000\u0000\u03df\u03e1\u0003\u009cN\u0000\u03e0\u03de\u0001"+
		"\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1\u009b\u0001"+
		"\u0000\u0000\u0000\u03e2\u03e3\u0005\'\u0000\u0000\u03e3\u03e4\u0003L"+
		"&\u0000\u03e4\u009d\u0001\u0000\u0000\u0000\u03e5\u03e6\u0005I\u0000\u0000"+
		"\u03e6\u03eb\u0003\u0098L\u0000\u03e7\u03e8\u00054\u0000\u0000\u03e8\u03ea"+
		"\u00055\u0000\u0000\u03e9\u03e7\u0001\u0000\u0000\u0000\u03ea\u03ed\u0001"+
		"\u0000\u0000\u0000\u03eb\u03e9\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001"+
		"\u0000\u0000\u0000\u03ec\u03ee\u0001\u0000\u0000\u0000\u03ed\u03eb\u0001"+
		"\u0000\u0000\u0000\u03ee\u03ef\u0005M\u0000\u0000\u03ef\u03f0\u0003$\u0012"+
		"\u0000\u03f0\u03f9\u0001\u0000\u0000\u0000\u03f1\u03f4\u0007\n\u0000\u0000"+
		"\u03f2\u03f5\u0003$\u0012\u0000\u03f3\u03f5\u00036\u001b\u0000\u03f4\u03f2"+
		"\u0001\u0000\u0000\u0000\u03f4\u03f3\u0001\u0000\u0000\u0000\u03f5\u03f9"+
		"\u0001\u0000\u0000\u0000\u03f6\u03f7\u0005M\u0000\u0000\u03f7\u03f9\u0003"+
		"\u009aM\u0000\u03f8\u03e5\u0001\u0000\u0000\u0000\u03f8\u03f1\u0001\u0000"+
		"\u0000\u0000\u03f8\u03f6\u0001\u0000\u0000\u0000\u03f9\u009f\u0001\u0000"+
		"\u0000\u0000\u03fa\u03fc\u0003\u0096K\u0000\u03fb\u03fa\u0001\u0000\u0000"+
		"\u0000\u03fb\u03fc\u0001\u0000\u0000\u0000\u03fc\u03fe\u0001\u0000\u0000"+
		"\u0000\u03fd\u03ff\u0003@ \u0000\u03fe\u03fd\u0001\u0000\u0000\u0000\u03ff"+
		"\u0400\u0001\u0000\u0000\u0000\u0400\u03fe\u0001\u0000\u0000\u0000\u0400"+
		"\u0401\u0001\u0000\u0000\u0000\u0401\u0403\u0001\u0000\u0000\u0000\u0402"+
		"\u0404\u0005K\u0000\u0000\u0403\u0402\u0001\u0000\u0000\u0000\u0403\u0404"+
		"\u0001\u0000\u0000\u0000\u0404\u0405\u0001\u0000\u0000\u0000\u0405\u0407"+
		"\u0003\u009eO\u0000\u0406\u0408\u0005G\u0000\u0000\u0407\u0406\u0001\u0000"+
		"\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408\u00a1\u0001\u0000"+
		"\u0000\u0000\u0409\u040a\u0003\u0096K\u0000\u040a\u040b\u0005V\u0000\u0000"+
		"\u040b\u040c\u0005M\u0000\u0000\u040c\u040f\u0003L&\u0000\u040d\u040e"+
		"\u0005I\u0000\u0000\u040e\u0410\u0003h4\u0000\u040f\u040d\u0001\u0000"+
		"\u0000\u0000\u040f\u0410\u0001\u0000\u0000\u0000\u0410\u0411\u0001\u0000"+
		"\u0000\u0000\u0411\u0412\u0005<\u0000\u0000\u0412\u0413\u0003,\u0016\u0000"+
		"\u0413\u0414\u0005G\u0000\u0000\u0414\u042a\u0001\u0000\u0000\u0000\u0415"+
		"\u0416\u0003@ \u0000\u0416\u0418\u0005M\u0000\u0000\u0417\u0419\u0003"+
		"L&\u0000\u0418\u0417\u0001\u0000\u0000\u0000\u0418\u0419\u0001\u0000\u0000"+
		"\u0000\u0419\u041c\u0001\u0000\u0000\u0000\u041a\u041b\u0005I\u0000\u0000"+
		"\u041b\u041d\u0003h4\u0000\u041c\u041a\u0001\u0000\u0000\u0000\u041c\u041d"+
		"\u0001\u0000\u0000\u0000\u041d\u041e\u0001\u0000\u0000\u0000\u041e\u041f"+
		"\u0005<\u0000\u0000\u041f\u0423\u00058\u0000\u0000\u0420\u0422\u0003,"+
		"\u0016\u0000\u0421\u0420\u0001\u0000\u0000\u0000\u0422\u0425\u0001\u0000"+
		"\u0000\u0000\u0423\u0421\u0001\u0000\u0000\u0000\u0423\u0424\u0001\u0000"+
		"\u0000\u0000\u0424\u0426\u0001\u0000\u0000\u0000\u0425\u0423\u0001\u0000"+
		"\u0000\u0000\u0426\u0427\u00059\u0000\u0000\u0427\u0428\u0005G\u0000\u0000"+
		"\u0428\u042a\u0001\u0000\u0000\u0000\u0429\u0409\u0001\u0000\u0000\u0000"+
		"\u0429\u0415\u0001\u0000\u0000\u0000\u042a\u00a3\u0001\u0000\u0000\u0000"+
		"q\u00a7\u00ae\u00b7\u00c8\u00cf\u00d3\u00e3\u00e9\u00fd\u0104\u010c\u0111"+
		"\u0118\u011f\u0121\u0126\u012b\u012f\u0136\u0151\u016f\u0174\u017b\u017f"+
		"\u0181\u018d\u0190\u01a7\u01ac\u01b1\u01b9\u01ca\u01ce\u01d4\u01d9\u01dd"+
		"\u01e2\u01e5\u01e9\u01f3\u01f7\u01ff\u0206\u020a\u0211\u021f\u0222\u0225"+
		"\u022c\u0233\u0236\u023c\u024d\u025a\u0260\u0262\u0265\u026c\u0275\u0279"+
		"\u0280\u0287\u0289\u0299\u029c\u02a3\u02a9\u02b2\u02bc\u02d1\u02db\u02e5"+
		"\u0302\u030b\u0310\u0313\u031b\u032a\u0330\u0340\u034a\u0351\u0365\u036d"+
		"\u0373\u037d\u0383\u038d\u0392\u0397\u03a0\u03a6\u03a8\u03ad\u03b2\u03b9"+
		"\u03cc\u03ce\u03d5\u03da\u03e0\u03eb\u03f4\u03f8\u03fb\u0400\u0403\u0407"+
		"\u040f\u0418\u041c\u0423\u0429";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}