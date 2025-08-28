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
		RULE_content = 65, RULE_expression = 66, RULE_directivesStatment = 67, 
		RULE_ngForValue = 68, RULE_ngForExpression = 69, RULE_ngIfValue = 70, 
		RULE_conditionExpression = 71, RULE_equalOperation = 72, RULE_logicalTerm = 73, 
		RULE_ifStat = 74, RULE_ifElseStat = 75, RULE_variable_type = 76, RULE_unionType = 77, 
		RULE_newObjectFromClass = 78, RULE_toStringNode = 79, RULE_variableDeclarationStat = 80, 
		RULE_variableDeclaration = 81, RULE_arrowFunction = 82;
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
			"navigate", "functionExp", "content", "expression", "directivesStatment", 
			"ngForValue", "ngForExpression", "ngIfValue", "conditionExpression", 
			"equalOperation", "logicalTerm", "ifStat", "ifElseStat", "variable_type", 
			"unionType", "newObjectFromClass", "toStringNode", "variableDeclarationStat", 
			"variableDeclaration", "arrowFunction"
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
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 209977346L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(166);
				statement();
				}
				}
				setState(171);
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
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				importStatment();
				}
				break;
			case COMPONENT:
			case NGMODULE:
			case INJECTABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				componentDeclaration();
				}
				break;
			case EXPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				classStatment();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
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
			setState(178);
			match(IMPORT);
			setState(179);
			match(CURLY_OPEN_BRACKET);
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==BEHAVIORSUBJECT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(181);
				match(COMMA);
				setState(182);
				match(IDENTIFIER);
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(CURLY_CLOSE_BRACKET);
			setState(189);
			match(FROM);
			setState(190);
			match(STRING);
			setState(191);
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
			setState(193);
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
			setState(195);
			module();
			setState(196);
			match(OPEN_BRACKET);
			setState(197);
			match(CURLY_OPEN_BRACKET);
			setState(198);
			componentBody();
			setState(199);
			match(CURLY_CLOSE_BRACKET);
			setState(200);
			match(CLOSE_BRACKET);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(201);
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
			setState(204);
			componentEle();
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					match(COMMA);
					setState(206);
					componentEle();
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(212);
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
			setState(215);
			match(SELECTOR);
			setState(216);
			match(COLON);
			setState(217);
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
			setState(219);
			match(STANDALONE);
			setState(220);
			match(COLON);
			setState(221);
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
			setState(225);
			match(COLON);
			setState(226);
			match(SQUARE_OPEN_BRACKET);
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(227);
				match(IDENTIFIER);
				}
				break;
			case SQUARE_CLOSE_BRACKET:
			case COMMA:
				{
				setState(228);
				propertyFun();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(231);
				match(COMMA);
				setState(232);
				match(IDENTIFIER);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
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
			setState(240);
			match(IMPORTS);
			setState(241);
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
			setState(243);
			match(EXPORTS);
			setState(244);
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
			setState(246);
			match(IDENTIFIER);
			setState(247);
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
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE:
				_localctx = new TemplateHtmlDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(TEMPLATE);
				setState(250);
				match(COLON);
				setState(251);
				match(QUOT);
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(252);
					htmlDeclare();
					}
					}
					setState(255); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LT );
				setState(257);
				match(QUOT);
				}
				break;
			case IDENTIFIER:
				_localctx = new TemplateHtmlUrlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(IDENTIFIER);
				setState(260);
				match(COLON);
				setState(261);
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
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				selectorProperty();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				standaloneProperty();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				importsProperty();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				exportsProperty();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				bootstrapProperty();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
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
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPLEMENTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(IMPLEMENTS);
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(INTERFACE);
				}
				break;
			case LET:
			case VAR:
			case CONST:
			case AccessModifiers:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
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
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				_localctx = new CommonRelationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(CLASS);
				setState(278);
				match(IDENTIFIER);
				setState(282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(279);
					classType();
					setState(280);
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
				setState(284);
				classType();
				setState(285);
				match(IDENTIFIER);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(286);
					match(COLON);
					setState(287);
					match(IDENTIFIER);
					setState(288);
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
			setState(293);
			match(EXPORT);
			setState(294);
			classRelation();
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(295);
				match(CURLY_OPEN_BRACKET);
				}
				break;
			}
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(298);
					body();
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_CLOSE_BRACKET) {
				{
				setState(304);
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
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				marks();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				eventBinding();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
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
			setState(314);
			match(OPEN_BRACKET);
			setState(315);
			match(SQUARE_OPEN_BRACKET);
			setState(316);
			match(SQUARE_CLOSE_BRACKET);
			setState(317);
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
			setState(319);
			variable_type();
			setState(320);
			match(IDENTIFIER);
			setState(321);
			match(S_DOlOR);
			setState(322);
			match(EQUAL);
			setState(323);
			match(IDENTIFIER);
			setState(324);
			match(BEHAVIORSUBJECT);
			setState(325);
			match(LT);
			setState(326);
			simpleArray();
			setState(327);
			match(GT);
			setState(328);
			brackets();
			setState(329);
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
			setState(331);
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
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				print_stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				print_error();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				expressionInBody();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				stateManagement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
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
			setState(341);
			match(CONSOLE);
			setState(342);
			match(DOT);
			setState(343);
			match(ERROR);
			setState(344);
			match(OPEN_BRACKET);
			setState(345);
			values();
			setState(346);
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
			setState(348);
			match(CONSOLE);
			setState(349);
			match(DOT);
			setState(350);
			match(LOG);
			setState(351);
			match(OPEN_BRACKET);
			setState(352);
			values();
			setState(353);
			match(CLOSE_BRACKET);
			setState(354);
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
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new CallFunctionParaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(IDENTIFIER);
				setState(357);
				parameters();
				setState(358);
				match(DOT);
				setState(359);
				match(CATCH);
				setState(360);
				match(OPEN_BRACKET);
				setState(361);
				parameters();
				setState(362);
				match(ARROW);
				setState(363);
				print_error();
				setState(364);
				match(CLOSE_BRACKET);
				setState(365);
				match(SEMI_COLON);
				}
				break;
			case 2:
				_localctx = new MethodCallWithValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				propertyAccess();
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(368);
					match(IDENTIFIER);
					}
				}

				setState(371);
				parameters();
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(372);
					match(AS);
					setState(373);
					simpleArray();
					}
				}

				setState(376);
				match(SEMI_COLON);
				}
				break;
			case 3:
				_localctx = new MethodCallWithListValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				propertyAccess();
				setState(379);
				match(OPEN_BRACKET);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 94578926680017008L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1048591L) != 0)) {
					{
					setState(380);
					argumentList();
					}
				}

				setState(383);
				match(CLOSE_BRACKET);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_COLON) {
					{
					setState(384);
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
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new ObjectLiteralArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				objectLiteral();
				}
				break;
			case 2:
				_localctx = new WithObjectPropertyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(SQUARE_OPEN_BRACKET);
				setState(391);
				objectProperty();
				setState(392);
				match(SQUARE_CLOSE_BRACKET);
				}
				break;
			case 3:
				_localctx = new WithExpressionArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				expression();
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(395);
					match(COMMA);
					setState(396);
					expression();
					}
					}
					setState(401);
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
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new ConditionEqualtyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				propertyAccess();
				setState(405);
				match(OPEN_BRACKET);
				setState(406);
				match(IDENTIFIER);
				setState(407);
				match(ARROW);
				setState(408);
				propertyAccess();
				setState(409);
				_la = _input.LA(1);
				if ( !(_la==EQUALTHIRD || _la==NOT_EQUAL_EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(410);
				propertyAccess();
				setState(411);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				_localctx = new ConditionValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				propertyAccess();
				setState(414);
				match(OPEN_BRACKET);
				setState(415);
				parameters();
				setState(416);
				match(ARROW);
				setState(417);
				propertyAccess();
				setState(418);
				parameters();
				setState(419);
				match(COMMA);
				setState(420);
				match(NUMBER_VAL);
				setState(421);
				match(CLOSE_BRACKET);
				setState(422);
				operations();
				setState(423);
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
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				argumentList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				conditions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
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
			setState(432);
			match(RETURN);
			setState(433);
			returnType();
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(434);
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
			setState(437);
			match(CURLY_OPEN_BRACKET);
			setState(438);
			objectProperty();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(439);
				match(COMMA);
				setState(440);
				objectProperty();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
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
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new IdentifierObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(IDENTIFIER);
				setState(449);
				match(COLON);
				setState(450);
				expression();
				}
				break;
			case 2:
				_localctx = new ImportsObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(IMPORTS);
				setState(452);
				match(COLON);
				setState(453);
				expression();
				}
				break;
			case 3:
				_localctx = new ExportsObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
				match(EXPORTS);
				setState(455);
				match(COLON);
				setState(456);
				expression();
				}
				break;
			case 4:
				_localctx = new DotPropertyAccessObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(457);
					match(DOT);
					}
					}
					setState(462);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(463);
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
			setState(466);
			match(IDENTIFIER);
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(467);
					match(DOT);
					setState(468);
					match(IDENTIFIER);
					setState(470);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(469);
						match(S_DOlOR);
						}
						break;
					}
					setState(475);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(472);
						match(SQUARE_OPEN_BRACKET);
						setState(473);
						match(IDENTIFIER);
						setState(474);
						match(SQUARE_CLOSE_BRACKET);
						}
						break;
					}
					}
					} 
				}
				setState(481);
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
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
			case CURLY_OPEN_BRACKET:
			case COLON:
			case EQUAL:
				_localctx = new SimpleDecStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(482);
					match(EQUAL);
					setState(483);
					match(FUNCTION);
					}
				}

				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(486);
					parameters();
					}
				}

				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(489);
					match(COLON);
					setState(490);
					unionType();
					}
				}

				}
				break;
			case S_DOlOR:
				_localctx = new SimpleArrayDecStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				match(S_DOlOR);
				setState(494);
				parameters();
				setState(495);
				match(COLON);
				setState(496);
				match(IDENTIFIER);
				setState(497);
				match(LT);
				setState(498);
				simpleArray();
				setState(499);
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
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				setState(503);
				match(FUNCTION);
				}
				break;
			case LET:
			case VAR:
			case CONST:
			case AccessModifiers:
				{
				setState(504);
				variable_type();
				}
				break;
			case IDENTIFIER:
				break;
			default:
				break;
			}
			setState(507);
			match(IDENTIFIER);
			setState(508);
			functionDeclarationStat();
			setState(509);
			match(CURLY_OPEN_BRACKET);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 94578928827509360L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1048591L) != 0)) {
				{
				{
				setState(510);
				body();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
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
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				normalfunctionDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
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
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_BRACKET:
			case AccessModifiers:
			case COMMA:
			case IDENTIFIER:
				_localctx = new ParaWithTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(522);
					match(COMMA);
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AccessModifiers) {
						{
						setState(523);
						match(AccessModifiers);
						}
					}

					setState(526);
					match(IDENTIFIER);
					setState(527);
					match(COLON);
					setState(528);
					type();
					}
					}
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EQUAL:
				_localctx = new ParaValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				match(EQUAL);
				setState(535);
				values();
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(536);
					match(COMMA);
					setState(537);
					match(IDENTIFIER);
					setState(538);
					match(COLON);
					setState(539);
					type();
					setState(540);
					match(EQUAL);
					setState(541);
					values();
					}
					}
					setState(547);
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
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new ParaHasAccessModifiersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AccessModifiers) {
					{
					setState(550);
					match(AccessModifiers);
					}
				}

				setState(553);
				match(IDENTIFIER);
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(554);
					match(COLON);
					setState(555);
					type();
					setState(556);
					parametersType();
					}
				}

				}
				break;
			case 2:
				_localctx = new ParaHasPropertyAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				propertyAccess();
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(561);
					match(COMMA);
					setState(562);
					propertyAccess();
					}
					}
					setState(567);
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
			setState(570);
			match(OPEN_BRACKET);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AccessModifiers || _la==IDENTIFIER) {
				{
				{
				setState(571);
				parametersContent();
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(577);
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
			setState(579);
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
			setState(581);
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
			setState(591);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(583);
					match(QUESTION_MARK);
					setState(584);
					match(DOT);
					setState(585);
					match(SQUARE_OPEN_BRACKET);
					setState(586);
					values();
					setState(587);
					match(SQUARE_CLOSE_BRACKET);
					}
					} 
				}
				setState(593);
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
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(595);
				match(IDENTIFIER);
				setState(596);
				match(EQUAL);
				setState(597);
				expression();
				setState(598);
				match(SEMI_COLON);
				}
				break;
			case 2:
				{
				_localctx = new DotAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(600);
				propertyAccess();
				setState(601);
				subDotAssignment();
				setState(612);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(602);
					match(EQUAL);
					setState(604);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(603);
						match(NOT);
						}
					}

					setState(606);
					type();
					setState(610);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						setState(607);
						operations();
						setState(608);
						values();
						}
						break;
					}
					}
					break;
				}
				setState(615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(614);
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
				setState(617);
				propertyAccess();
				setState(618);
				match(EQUAL);
				setState(619);
				objectLiteral();
				setState(620);
				match(SEMI_COLON);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(635);
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
					setState(624);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(625);
					match(EQUAL);
					setState(626);
					assignment(0);
					setState(631);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(627);
						match(AS);
						setState(628);
						primitiveType();
						setState(629);
						match(SEMI_COLON);
						}
						break;
					}
					}
					} 
				}
				setState(637);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_la = _input.LA(1);
			if ( !(_la==CURLY_OPEN_BRACKET || _la==DOUBLE_CURLY_OPEN_BRACKET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2733723991175858544L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1114095L) != 0)) {
				{
				{
				setState(639);
				types();
				}
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIT_OR) {
				{
				setState(645);
				match(BIT_OR);
				setState(647); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(646);
					types();
					}
					}
					setState(649); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2733723991175858544L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1114095L) != 0) );
				}
			}

			setState(653);
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
			setState(655);
			match(OPEN_BRACKET);
			setState(656);
			match(CLICK);
			setState(657);
			match(CLOSE_BRACKET2);
			setState(658);
			match(EQUAL3);
			setState(659);
			match(DQUOT5);
			setState(660);
			match(ID3);
			setState(661);
			match(OPEN_BRACKET2);
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID3) {
				{
				setState(662);
				match(ID3);
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT3) {
					{
					{
					setState(663);
					match(DOT3);
					setState(664);
					match(ID3);
					}
					}
					setState(669);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(672);
			match(CLOSE_BRACKET2);
			setState(673);
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
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				normalHtmlTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
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
			setState(679);
			openTag();
			setState(683);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(680);
					types();
					}
					} 
				}
				setState(685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(686);
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
			setState(688);
			match(LT);
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2733723991175858544L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1114095L) != 0)) {
				{
				{
				setState(689);
				types();
				}
				}
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(695);
			match(SLASH);
			setState(696);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(LT);
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2733723991175858544L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1114095L) != 0)) {
				{
				{
				setState(699);
				types();
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(705);
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
			setState(707);
			match(LT);
			setState(708);
			match(SLASH);
			setState(709);
			match(IDENTIFIER);
			setState(710);
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
			setState(712);
			match(IDENTIFIER);
			setState(713);
			match(SQUARE_OPEN_BRACKET);
			setState(714);
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
			setState(716);
			match(IDENTIFIER);
			setState(717);
			match(LT);
			setState(718);
			values();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(719);
				match(COMMA);
				setState(720);
				values();
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(726);
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
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				arrayStringType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(730);
				simpleArray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(731);
				map();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(732);
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
			setState(743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				_localctx = new NumberPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				match(NUMBER);
				}
				break;
			case VOID:
				_localctx = new VoidPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(737);
				match(VOID);
				}
				break;
			case NULL:
				_localctx = new NullPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(738);
				match(NULL);
				}
				break;
			case ANY:
				_localctx = new AnyPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(739);
				match(ANY);
				}
				break;
			case STRING_EX:
				_localctx = new StringEXPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(740);
				match(STRING_EX);
				}
				break;
			case CLASS:
				_localctx = new ClassPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(741);
				match(CLASS);
				}
				break;
			case CURLY_OPEN_BRACKET:
			case DOUBLE_CURLY_OPEN_BRACKET:
				_localctx = new TemplateExPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(742);
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
			setState(745);
			match(ARRAY);
			setState(746);
			match(LT);
			setState(747);
			match(STRING_EX);
			setState(748);
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
			setState(750);
			match(NUMBER);
			setState(751);
			match(SQUARE_OPEN_BRACKET);
			setState(752);
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
		enterRule(_localctx, 112, RULE_marks);
		try {
			setState(768);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI_COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				match(SEMI_COLON);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				match(COMMA);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(756);
				match(COLON);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(757);
				match(DOT);
				}
				break;
			case QUESTION_MARK:
				enterOuterAlt(_localctx, 5);
				{
				setState(758);
				match(QUESTION_MARK);
				}
				break;
			case HASH_TAG:
				enterOuterAlt(_localctx, 6);
				{
				setState(759);
				match(HASH_TAG);
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(760);
				match(EQUAL);
				}
				break;
			case PLUS:
			case MIN:
			case MULT:
				enterOuterAlt(_localctx, 8);
				{
				setState(761);
				operations();
				}
				break;
			case S_DOlOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(762);
				match(S_DOlOR);
				}
				break;
			case SQUARE_OPEN_BRACKET:
				enterOuterAlt(_localctx, 10);
				{
				setState(763);
				match(SQUARE_OPEN_BRACKET);
				}
				break;
			case SQUARE_CLOSE_BRACKET:
				enterOuterAlt(_localctx, 11);
				{
				setState(764);
				match(SQUARE_CLOSE_BRACKET);
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 12);
				{
				setState(765);
				match(OPEN_BRACKET);
				}
				break;
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 13);
				{
				setState(766);
				match(CLOSE_BRACKET);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 14);
				{
				setState(767);
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
			setState(770);
			match(SQUARE_OPEN_BRACKET);
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 94578926680017008L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1048591L) != 0)) {
				{
				setState(771);
				expression();
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(772);
					match(COMMA);
					setState(773);
					expression();
					setState(777);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(774);
							match(COMMA);
							}
							} 
						}
						setState(779);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
					}
					}
					}
					setState(784);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(787);
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
			setState(789);
			match(CURLY_OPEN_BRACKET);
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 94578926680017008L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1048591L) != 0)) {
				{
				{
				setState(790);
				expression();
				}
				}
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(796);
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
			setState(798);
			match(TRY);
			setState(799);
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
			setState(801);
			match(CATCH);
			setState(802);
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
			setState(804);
			values();
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(805);
				operations();
				setState(806);
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
			setState(810);
			propertyAccess();
			setState(812); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(811);
				match(QUESTION_MARK);
				}
				}
				setState(814); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==QUESTION_MARK );
			setState(816);
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
			setState(818);
			match(IDENTIFIER);
			setState(819);
			match(DOT);
			setState(820);
			match(ROUTER);
			setState(821);
			match(DOT);
			setState(822);
			match(NAVIGATE);
			setState(823);
			match(OPEN_BRACKET);
			setState(824);
			match(SQUARE_OPEN_BRACKET);
			setState(825);
			values();
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(826);
				match(COMMA);
				setState(827);
				values();
				}
				}
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(833);
			match(SQUARE_CLOSE_BRACKET);
			setState(834);
			match(CLOSE_BRACKET);
			setState(835);
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
		enterRule(_localctx, 128, RULE_functionExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(837);
				match(NUMBER);
				}
			}

			setState(841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(840);
				match(OPEN_BRACKET);
				}
				break;
			}
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(843);
				propertyAccess();
				}
				}
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(849);
			match(OPEN_BRACKET);
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CURLY_OPEN_BRACKET) {
				{
				{
				setState(850);
				match(CURLY_OPEN_BRACKET);
				}
				}
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1048591L) != 0)) {
				{
				{
				setState(856);
				content();
				}
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CURLY_CLOSE_BRACKET) {
				{
				{
				setState(862);
				match(CURLY_CLOSE_BRACKET);
				}
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLOSE_BRACKET) {
				{
				{
				setState(868);
				match(CLOSE_BRACKET);
				}
				}
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(874);
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
		enterRule(_localctx, 130, RULE_content);
		try {
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				values();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				variableDeclaration();
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
		enterRule(_localctx, 132, RULE_expression);
		try {
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				values();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				navigate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(882);
				arrayDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(883);
				variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(884);
				ifElseStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(885);
				tryStat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(886);
				catchStat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(887);
				objectLiteral();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(888);
				functionExp();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(889);
				directivesStatment();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(890);
				propertyAccess();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(891);
				assignment(0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(892);
				questionCondition();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(893);
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
		enterRule(_localctx, 134, RULE_directivesStatment);
		try {
			setState(902);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NgFor:
				_localctx = new NgForDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(896);
				match(NgFor);
				setState(897);
				match(EQUAL1);
				setState(898);
				ngForValue();
				}
				break;
			case NgIf:
				_localctx = new NgIfDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				match(NgIf);
				setState(900);
				match(EQUAL2);
				setState(901);
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
		enterRule(_localctx, 136, RULE_ngForValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(DQUOT1);
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET1) {
				{
				{
				setState(905);
				ngForExpression();
				}
				}
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(911);
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
		enterRule(_localctx, 138, RULE_ngForExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(LET1);
			setState(914);
			match(ID1);
			setState(915);
			match(OF1);
			setState(916);
			match(ID1);
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_COLON5) {
					{
					setState(917);
					match(SEMI_COLON5);
					}
				}

				setState(920);
				match(LET1);
				setState(921);
				match(ID1);
				setState(922);
				match(EQUAL1);
				setState(923);
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
		enterRule(_localctx, 140, RULE_ngIfValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(DQUOT3);
			setState(927);
			conditionExpression();
			setState(928);
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
		enterRule(_localctx, 142, RULE_conditionExpression);
		int _la;
		try {
			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				_localctx = new EqualNullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(930);
				match(ID2);
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 1921L) != 0)) {
					{
					setState(931);
					equalOperation();
					setState(932);
					match(NULL1);
					}
				}

				}
				break;
			case 2:
				_localctx = new ComparisonExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				logicalTerm();
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 4196225L) != 0)) {
					{
					setState(939);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GT1) {
						{
						setState(937);
						match(GT1);
						setState(938);
						match(NUMBER_VAL1);
						}
					}

					setState(941);
					equalOperation();
					setState(942);
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
				setState(946);
				logicalTerm();
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET1) {
					{
					setState(947);
					match(OPEN_BRACKET1);
					setState(948);
					match(ID2);
					setState(949);
					match(ARROW1);
					setState(950);
					logicalTerm();
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
					match(ID2);
					setState(957);
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
		enterRule(_localctx, 144, RULE_equalOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
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
		enterRule(_localctx, 146, RULE_logicalTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT1) {
				{
				setState(965);
				match(NOT1);
				}
			}

			setState(968);
			match(ID2);
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT1) {
				{
				setState(969);
				match(DOT1);
				setState(970);
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
		enterRule(_localctx, 148, RULE_ifStat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(IF);
			setState(974);
			match(OPEN_BRACKET);
			setState(978);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(975);
					types();
					}
					} 
				}
				setState(980);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			setState(981);
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
		enterRule(_localctx, 150, RULE_ifElseStat);
		int _la;
		try {
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				_localctx = new IfQuestionMarkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(983);
				match(IDENTIFIER);
				setState(984);
				match(QUESTION_MARK);
				setState(985);
				type();
				setState(986);
				match(COLON);
				setState(987);
				type();
				}
				break;
			case 2:
				_localctx = new IfReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(989);
				ifStat();
				setState(990);
				match(RETURN);
				setState(991);
				match(SEMI_COLON);
				}
				break;
			case 3:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(993);
				ifStat();
				setState(994);
				conditionStat();
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(995);
					match(ELSE);
					setState(996);
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
		enterRule(_localctx, 152, RULE_variable_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
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
		enterRule(_localctx, 154, RULE_unionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			type();
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIT_OR) {
				{
				setState(1004);
				match(BIT_OR);
				setState(1005);
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
		enterRule(_localctx, 156, RULE_newObjectFromClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1008);
				match(IDENTIFIER);
				}
				}
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1014);
			parameters();
			setState(1017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1015);
				match(DOT);
				setState(1016);
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
		enterRule(_localctx, 158, RULE_toStringNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(TOSTRING);
			setState(1020);
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
		enterRule(_localctx, 160, RULE_variableDeclarationStat);
		int _la;
		try {
			int _alt;
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				_localctx = new TypedVariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1022);
				match(COLON);
				setState(1023);
				unionType();
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SQUARE_OPEN_BRACKET) {
					{
					{
					setState(1024);
					match(SQUARE_OPEN_BRACKET);
					setState(1025);
					match(SQUARE_CLOSE_BRACKET);
					}
					}
					setState(1030);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1031);
				match(EQUAL);
				setState(1032);
				types();
				}
				break;
			case 2:
				_localctx = new InferredVariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1034);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1037);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1035);
					types();
					}
					break;
				case 2:
					{
					setState(1036);
					conditions();
					}
					break;
				}
				setState(1042);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1039);
						match(COMMA);
						}
						} 
					}
					setState(1044);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new ObjectFromClassContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1045);
				match(EQUAL);
				setState(1046);
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
		enterRule(_localctx, 162, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0) || _la==AccessModifiers) {
				{
				setState(1049);
				variable_type();
				}
			}

			setState(1053); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1052);
				propertyAccess();
				}
				}
				setState(1055); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION_MARK) {
				{
				setState(1057);
				match(QUESTION_MARK);
				}
			}

			setState(1060);
			variableDeclarationStat();
			setState(1062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1061);
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
		enterRule(_localctx, 164, RULE_arrowFunction);
		int _la;
		try {
			setState(1096);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case VAR:
			case CONST:
			case AccessModifiers:
				_localctx = new VarArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				variable_type();
				setState(1065);
				match(IDENTIFIER);
				setState(1066);
				match(EQUAL);
				setState(1067);
				parameters();
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1068);
					match(COLON);
					setState(1069);
					type();
					}
				}

				setState(1072);
				match(ARROW);
				setState(1073);
				body();
				setState(1074);
				match(SEMI_COLON);
				}
				break;
			case IDENTIFIER:
				_localctx = new EventHandlerArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1076);
				propertyAccess();
				setState(1077);
				match(EQUAL);
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(1078);
					parameters();
					}
				}

				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1081);
					match(COLON);
					setState(1082);
					type();
					}
				}

				setState(1085);
				match(ARROW);
				setState(1086);
				match(CURLY_OPEN_BRACKET);
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 94578928827509360L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1048591L) != 0)) {
					{
					{
					setState(1087);
					body();
					}
					}
					setState(1092);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1093);
				match(CURLY_CLOSE_BRACKET);
				setState(1094);
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
		"\u0004\u0001\u008c\u044b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0001\u0000\u0005\u0000\u00a8"+
		"\b\u0000\n\u0000\f\u0000\u00ab\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u00b1\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u00b8\b\u0002\n\u0002\f\u0002\u00bb"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00cb\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00d0\b\u0005\n\u0005\f\u0005\u00d3\t\u0005"+
		"\u0001\u0005\u0003\u0005\u00d6\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00e6\b\t\u0001\t\u0001\t\u0005"+
		"\t\u00ea\b\t\n\t\f\t\u00ed\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0004\r\u00fe\b\r\u000b\r\f\r\u00ff\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u0107\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u010f\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0114\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u011b\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0122"+
		"\b\u0010\u0003\u0010\u0124\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0129\b\u0011\u0001\u0011\u0005\u0011\u012c\b\u0011\n\u0011"+
		"\f\u0011\u012f\t\u0011\u0001\u0011\u0003\u0011\u0132\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0139\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0154\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0172\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0177\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u017e\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0182\b\u0019\u0003\u0019\u0184\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u018e\b\u001a\n\u001a\f\u001a\u0191\t\u001a\u0003\u001a\u0193\b"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01aa\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01af\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u01b4\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u01ba\b\u001e\n\u001e\f\u001e\u01bd\t\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u01cb\b\u001f\n\u001f\f\u001f\u01ce\t\u001f\u0001\u001f\u0003"+
		"\u001f\u01d1\b\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u01d7\b \u0001"+
		" \u0001 \u0001 \u0003 \u01dc\b \u0005 \u01de\b \n \f \u01e1\t \u0001!"+
		"\u0001!\u0003!\u01e5\b!\u0001!\u0003!\u01e8\b!\u0001!\u0001!\u0003!\u01ec"+
		"\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01f6"+
		"\b!\u0001\"\u0001\"\u0003\"\u01fa\b\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0005\"\u0200\b\"\n\"\f\"\u0203\t\"\u0001\"\u0001\"\u0001#\u0001#\u0003"+
		"#\u0209\b#\u0001$\u0001$\u0003$\u020d\b$\u0001$\u0001$\u0001$\u0005$\u0212"+
		"\b$\n$\f$\u0215\t$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0005$\u0220\b$\n$\f$\u0223\t$\u0003$\u0225\b$\u0001%\u0003%"+
		"\u0228\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u022f\b%\u0001%\u0001"+
		"%\u0001%\u0005%\u0234\b%\n%\f%\u0237\t%\u0003%\u0239\b%\u0001&\u0001&"+
		"\u0005&\u023d\b&\n&\f&\u0240\t&\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u024e\b)\n)\f)\u0251"+
		"\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u025d\b*\u0001*\u0001*\u0001*\u0001*\u0003*\u0263\b*\u0003*\u0265"+
		"\b*\u0001*\u0003*\u0268\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u026f"+
		"\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0278\b*\u0005"+
		"*\u027a\b*\n*\f*\u027d\t*\u0001+\u0001+\u0005+\u0281\b+\n+\f+\u0284\t"+
		"+\u0001+\u0001+\u0004+\u0288\b+\u000b+\f+\u0289\u0003+\u028c\b+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0005,\u029a\b,\n,\f,\u029d\t,\u0003,\u029f\b,\u0001,\u0001,"+
		"\u0001,\u0001-\u0001-\u0003-\u02a6\b-\u0001.\u0001.\u0005.\u02aa\b.\n"+
		".\f.\u02ad\t.\u0001.\u0001.\u0001/\u0001/\u0005/\u02b3\b/\n/\f/\u02b6"+
		"\t/\u0001/\u0001/\u0001/\u00010\u00010\u00050\u02bd\b0\n0\f0\u02c0\t0"+
		"\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u0001"+
		"2\u00012\u00013\u00013\u00013\u00013\u00013\u00053\u02d2\b3\n3\f3\u02d5"+
		"\t3\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u00034\u02de\b4\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u02e8\b5\u0001"+
		"6\u00016\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00038\u0301\b8\u00019\u00019\u00019\u00019\u00019\u0005"+
		"9\u0308\b9\n9\f9\u030b\t9\u00059\u030d\b9\n9\f9\u0310\t9\u00039\u0312"+
		"\b9\u00019\u00019\u0001:\u0001:\u0005:\u0318\b:\n:\f:\u031b\t:\u0001:"+
		"\u0001:\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001=\u0001=\u0001"+
		"=\u0001=\u0003=\u0329\b=\u0001>\u0001>\u0004>\u032d\b>\u000b>\f>\u032e"+
		"\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0005?\u033d\b?\n?\f?\u0340\t?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001@\u0003@\u0347\b@\u0001@\u0003@\u034a\b@\u0001@\u0005@\u034d\b"+
		"@\n@\f@\u0350\t@\u0001@\u0001@\u0005@\u0354\b@\n@\f@\u0357\t@\u0001@\u0005"+
		"@\u035a\b@\n@\f@\u035d\t@\u0001@\u0005@\u0360\b@\n@\f@\u0363\t@\u0001"+
		"@\u0005@\u0366\b@\n@\f@\u0369\t@\u0001@\u0001@\u0001A\u0001A\u0003A\u036f"+
		"\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0003B\u037f\bB\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0003C\u0387\bC\u0001D\u0001D\u0005D\u038b\bD\nD\fD\u038e"+
		"\tD\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u0397\bE\u0001"+
		"E\u0001E\u0001E\u0001E\u0003E\u039d\bE\u0001F\u0001F\u0001F\u0001F\u0001"+
		"G\u0001G\u0001G\u0001G\u0003G\u03a7\bG\u0001G\u0001G\u0001G\u0003G\u03ac"+
		"\bG\u0001G\u0001G\u0001G\u0003G\u03b1\bG\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0003G\u03ba\bG\u0001G\u0001G\u0001G\u0001G\u0003G\u03c0"+
		"\bG\u0003G\u03c2\bG\u0001H\u0001H\u0001I\u0003I\u03c7\bI\u0001I\u0001"+
		"I\u0001I\u0003I\u03cc\bI\u0001J\u0001J\u0001J\u0005J\u03d1\bJ\nJ\fJ\u03d4"+
		"\tJ\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u03e6\bK\u0003K\u03e8"+
		"\bK\u0001L\u0001L\u0001M\u0001M\u0001M\u0003M\u03ef\bM\u0001N\u0005N\u03f2"+
		"\bN\nN\fN\u03f5\tN\u0001N\u0001N\u0001N\u0003N\u03fa\bN\u0001O\u0001O"+
		"\u0001O\u0001P\u0001P\u0001P\u0001P\u0005P\u0403\bP\nP\fP\u0406\tP\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u040e\bP\u0001P\u0005P\u0411"+
		"\bP\nP\fP\u0414\tP\u0001P\u0001P\u0003P\u0418\bP\u0001Q\u0003Q\u041b\b"+
		"Q\u0001Q\u0004Q\u041e\bQ\u000bQ\fQ\u041f\u0001Q\u0003Q\u0423\bQ\u0001"+
		"Q\u0001Q\u0003Q\u0427\bQ\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0003"+
		"R\u042f\bR\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0003R\u0438"+
		"\bR\u0001R\u0001R\u0003R\u043c\bR\u0001R\u0001R\u0001R\u0005R\u0441\b"+
		"R\nR\fR\u0444\tR\u0001R\u0001R\u0001R\u0003R\u0449\bR\u0001R\u0000\u0001"+
		"TS\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u0000\u000b\u0002\u0000FFVV\u0002\u0000"+
		"\u0012\u0012\u001a\u001b\u0002\u0000//11\u0002\u0000BDVV\u0001\u0000N"+
		"P\u0002\u000088::\u0002\u000099;;\u0002\u0000``~~\u0002\u0000aahk\u0002"+
		"\u0000\u0004\u0006EE\u0002\u0000IIMM\u04a8\u0000\u00a9\u0001\u0000\u0000"+
		"\u0000\u0002\u00b0\u0001\u0000\u0000\u0000\u0004\u00b2\u0001\u0000\u0000"+
		"\u0000\u0006\u00c1\u0001\u0000\u0000\u0000\b\u00c3\u0001\u0000\u0000\u0000"+
		"\n\u00cc\u0001\u0000\u0000\u0000\f\u00d7\u0001\u0000\u0000\u0000\u000e"+
		"\u00db\u0001\u0000\u0000\u0000\u0010\u00df\u0001\u0000\u0000\u0000\u0012"+
		"\u00e1\u0001\u0000\u0000\u0000\u0014\u00f0\u0001\u0000\u0000\u0000\u0016"+
		"\u00f3\u0001\u0000\u0000\u0000\u0018\u00f6\u0001\u0000\u0000\u0000\u001a"+
		"\u0106\u0001\u0000\u0000\u0000\u001c\u010e\u0001\u0000\u0000\u0000\u001e"+
		"\u0113\u0001\u0000\u0000\u0000 \u0123\u0001\u0000\u0000\u0000\"\u0125"+
		"\u0001\u0000\u0000\u0000$\u0138\u0001\u0000\u0000\u0000&\u013a\u0001\u0000"+
		"\u0000\u0000(\u013f\u0001\u0000\u0000\u0000*\u014b\u0001\u0000\u0000\u0000"+
		",\u0153\u0001\u0000\u0000\u0000.\u0155\u0001\u0000\u0000\u00000\u015c"+
		"\u0001\u0000\u0000\u00002\u0183\u0001\u0000\u0000\u00004\u0192\u0001\u0000"+
		"\u0000\u00006\u01a9\u0001\u0000\u0000\u00008\u01ae\u0001\u0000\u0000\u0000"+
		":\u01b0\u0001\u0000\u0000\u0000<\u01b5\u0001\u0000\u0000\u0000>\u01d0"+
		"\u0001\u0000\u0000\u0000@\u01d2\u0001\u0000\u0000\u0000B\u01f5\u0001\u0000"+
		"\u0000\u0000D\u01f9\u0001\u0000\u0000\u0000F\u0208\u0001\u0000\u0000\u0000"+
		"H\u0224\u0001\u0000\u0000\u0000J\u0238\u0001\u0000\u0000\u0000L\u023a"+
		"\u0001\u0000\u0000\u0000N\u0243\u0001\u0000\u0000\u0000P\u0245\u0001\u0000"+
		"\u0000\u0000R\u024f\u0001\u0000\u0000\u0000T\u026e\u0001\u0000\u0000\u0000"+
		"V\u027e\u0001\u0000\u0000\u0000X\u028f\u0001\u0000\u0000\u0000Z\u02a5"+
		"\u0001\u0000\u0000\u0000\\\u02a7\u0001\u0000\u0000\u0000^\u02b0\u0001"+
		"\u0000\u0000\u0000`\u02ba\u0001\u0000\u0000\u0000b\u02c3\u0001\u0000\u0000"+
		"\u0000d\u02c8\u0001\u0000\u0000\u0000f\u02cc\u0001\u0000\u0000\u0000h"+
		"\u02dd\u0001\u0000\u0000\u0000j\u02e7\u0001\u0000\u0000\u0000l\u02e9\u0001"+
		"\u0000\u0000\u0000n\u02ee\u0001\u0000\u0000\u0000p\u0300\u0001\u0000\u0000"+
		"\u0000r\u0302\u0001\u0000\u0000\u0000t\u0315\u0001\u0000\u0000\u0000v"+
		"\u031e\u0001\u0000\u0000\u0000x\u0321\u0001\u0000\u0000\u0000z\u0324\u0001"+
		"\u0000\u0000\u0000|\u032a\u0001\u0000\u0000\u0000~\u0332\u0001\u0000\u0000"+
		"\u0000\u0080\u0346\u0001\u0000\u0000\u0000\u0082\u036e\u0001\u0000\u0000"+
		"\u0000\u0084\u037e\u0001\u0000\u0000\u0000\u0086\u0386\u0001\u0000\u0000"+
		"\u0000\u0088\u0388\u0001\u0000\u0000\u0000\u008a\u0391\u0001\u0000\u0000"+
		"\u0000\u008c\u039e\u0001\u0000\u0000\u0000\u008e\u03c1\u0001\u0000\u0000"+
		"\u0000\u0090\u03c3\u0001\u0000\u0000\u0000\u0092\u03c6\u0001\u0000\u0000"+
		"\u0000\u0094\u03cd\u0001\u0000\u0000\u0000\u0096\u03e7\u0001\u0000\u0000"+
		"\u0000\u0098\u03e9\u0001\u0000\u0000\u0000\u009a\u03eb\u0001\u0000\u0000"+
		"\u0000\u009c\u03f3\u0001\u0000\u0000\u0000\u009e\u03fb\u0001\u0000\u0000"+
		"\u0000\u00a0\u0417\u0001\u0000\u0000\u0000\u00a2\u041a\u0001\u0000\u0000"+
		"\u0000\u00a4\u0448\u0001\u0000\u0000\u0000\u00a6\u00a8\u0003\u0002\u0001"+
		"\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u0001\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ac\u00b1\u0003\u0004\u0002\u0000\u00ad\u00b1\u0003\b\u0004\u0000"+
		"\u00ae\u00b1\u0003\"\u0011\u0000\u00af\u00b1\u00032\u0019\u0000\u00b0"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u0003\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0001\u0000\u0000\u00b3"+
		"\u00b4\u00058\u0000\u0000\u00b4\u00b9\u0007\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005H\u0000\u0000\u00b6\u00b8\u0005V\u0000\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u00059\u0000"+
		"\u0000\u00bd\u00be\u0005\u0003\u0000\u0000\u00be\u00bf\u0005B\u0000\u0000"+
		"\u00bf\u00c0\u0005G\u0000\u0000\u00c0\u0005\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0007\u0001\u0000\u0000\u00c2\u0007\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0003\u0006\u0003\u0000\u00c4\u00c5\u00056\u0000\u0000\u00c5\u00c6"+
		"\u00058\u0000\u0000\u00c6\u00c7\u0003\n\u0005\u0000\u00c7\u00c8\u0005"+
		"9\u0000\u0000\u00c8\u00ca\u00057\u0000\u0000\u00c9\u00cb\u0005H\u0000"+
		"\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cb\t\u0001\u0000\u0000\u0000\u00cc\u00d1\u0003\u001c\u000e\u0000"+
		"\u00cd\u00ce\u0005H\u0000\u0000\u00ce\u00d0\u0003\u001c\u000e\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d6\u0005H\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u000b\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0005\u0013\u0000\u0000\u00d8\u00d9\u0005I\u0000\u0000\u00d9\u00da\u0005"+
		"B\u0000\u0000\u00da\r\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0014"+
		"\u0000\u0000\u00dc\u00dd\u0005I\u0000\u0000\u00dd\u00de\u0005D\u0000\u0000"+
		"\u00de\u000f\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\u0011\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005I\u0000\u0000\u00e2"+
		"\u00e5\u00054\u0000\u0000\u00e3\u00e6\u0005V\u0000\u0000\u00e4\u00e6\u0003"+
		"\u0010\b\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e6\u00eb\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005H\u0000"+
		"\u0000\u00e8\u00ea\u0005V\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef\u00055\u0000\u0000\u00ef"+
		"\u0013\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0015\u0000\u0000\u00f1"+
		"\u00f2\u0003\u0012\t\u0000\u00f2\u0015\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0005\u0018\u0000\u0000\u00f4\u00f5\u0003\u0012\t\u0000\u00f5\u0017\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0005V\u0000\u0000\u00f7\u00f8\u0003\u0012"+
		"\t\u0000\u00f8\u0019\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0016\u0000"+
		"\u0000\u00fa\u00fb\u0005I\u0000\u0000\u00fb\u00fd\u0005A\u0000\u0000\u00fc"+
		"\u00fe\u0003Z-\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0005"+
		"A\u0000\u0000\u0102\u0107\u0001\u0000\u0000\u0000\u0103\u0104\u0005V\u0000"+
		"\u0000\u0104\u0105\u0005I\u0000\u0000\u0105\u0107\u0005B\u0000\u0000\u0106"+
		"\u00f9\u0001\u0000\u0000\u0000\u0106\u0103\u0001\u0000\u0000\u0000\u0107"+
		"\u001b\u0001\u0000\u0000\u0000\u0108\u010f\u0003\f\u0006\u0000\u0109\u010f"+
		"\u0003\u000e\u0007\u0000\u010a\u010f\u0003\u0014\n\u0000\u010b\u010f\u0003"+
		"\u0016\u000b\u0000\u010c\u010f\u0003\u0018\f\u0000\u010d\u010f\u0003\u001a"+
		"\r\u0000\u010e\u0108\u0001\u0000\u0000\u0000\u010e\u0109\u0001\u0000\u0000"+
		"\u0000\u010e\u010a\u0001\u0000\u0000\u0000\u010e\u010b\u0001\u0000\u0000"+
		"\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u001d\u0001\u0000\u0000\u0000\u0110\u0114\u0005\n\u0000\u0000"+
		"\u0111\u0114\u0005\u0019\u0000\u0000\u0112\u0114\u0003\u0098L\u0000\u0113"+
		"\u0110\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113"+
		"\u0112\u0001\u0000\u0000\u0000\u0114\u001f\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0005\u001c\u0000\u0000\u0116\u011a\u0005V\u0000\u0000\u0117\u0118"+
		"\u0003\u001e\u000f\u0000\u0118\u0119\u0005V\u0000\u0000\u0119\u011b\u0001"+
		"\u0000\u0000\u0000\u011a\u0117\u0001\u0000\u0000\u0000\u011a\u011b\u0001"+
		"\u0000\u0000\u0000\u011b\u0124\u0001\u0000\u0000\u0000\u011c\u011d\u0003"+
		"\u001e\u000f\u0000\u011d\u0121\u0005V\u0000\u0000\u011e\u011f\u0005I\u0000"+
		"\u0000\u011f\u0120\u0005V\u0000\u0000\u0120\u0122\u0005M\u0000\u0000\u0121"+
		"\u011e\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122"+
		"\u0124\u0001\u0000\u0000\u0000\u0123\u0115\u0001\u0000\u0000\u0000\u0123"+
		"\u011c\u0001\u0000\u0000\u0000\u0124!\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0005\u0017\u0000\u0000\u0126\u0128\u0003 \u0010\u0000\u0127\u0129\u0005"+
		"8\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000"+
		"\u0000\u0000\u0129\u012d\u0001\u0000\u0000\u0000\u012a\u012c\u0003,\u0016"+
		"\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000"+
		"\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000"+
		"\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000"+
		"\u0000\u0130\u0132\u00059\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000"+
		"\u0131\u0132\u0001\u0000\u0000\u0000\u0132#\u0001\u0000\u0000\u0000\u0133"+
		"\u0139\u0003h4\u0000\u0134\u0139\u0003p8\u0000\u0135\u0139\u0003\u0084"+
		"B\u0000\u0136\u0139\u0003X,\u0000\u0137\u0139\u0003Z-\u0000\u0138\u0133"+
		"\u0001\u0000\u0000\u0000\u0138\u0134\u0001\u0000\u0000\u0000\u0138\u0135"+
		"\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0137"+
		"\u0001\u0000\u0000\u0000\u0139%\u0001\u0000\u0000\u0000\u013a\u013b\u0005"+
		"6\u0000\u0000\u013b\u013c\u00054\u0000\u0000\u013c\u013d\u00055\u0000"+
		"\u0000\u013d\u013e\u00057\u0000\u0000\u013e\'\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0003\u0098L\u0000\u0140\u0141\u0005V\u0000\u0000\u0141\u0142"+
		"\u0005Q\u0000\u0000\u0142\u0143\u0005M\u0000\u0000\u0143\u0144\u0005V"+
		"\u0000\u0000\u0144\u0145\u0005F\u0000\u0000\u0145\u0146\u0005=\u0000\u0000"+
		"\u0146\u0147\u0003d2\u0000\u0147\u0148\u0005>\u0000\u0000\u0148\u0149"+
		"\u0003&\u0013\u0000\u0149\u014a\u0005G\u0000\u0000\u014a)\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0003\u0084B\u0000\u014c+\u0001\u0000\u0000\u0000"+
		"\u014d\u0154\u0003F#\u0000\u014e\u0154\u00030\u0018\u0000\u014f\u0154"+
		"\u0003.\u0017\u0000\u0150\u0154\u0003*\u0015\u0000\u0151\u0154\u0003("+
		"\u0014\u0000\u0152\u0154\u0003:\u001d\u0000\u0153\u014d\u0001\u0000\u0000"+
		"\u0000\u0153\u014e\u0001\u0000\u0000\u0000\u0153\u014f\u0001\u0000\u0000"+
		"\u0000\u0153\u0150\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000"+
		"\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154-\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0005\u001f\u0000\u0000\u0156\u0157\u0005J\u0000\u0000\u0157"+
		"\u0158\u0005 \u0000\u0000\u0158\u0159\u00056\u0000\u0000\u0159\u015a\u0003"+
		"N\'\u0000\u015a\u015b\u00057\u0000\u0000\u015b/\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u0005\u001f\u0000\u0000\u015d\u015e\u0005J\u0000\u0000\u015e"+
		"\u015f\u0005!\u0000\u0000\u015f\u0160\u00056\u0000\u0000\u0160\u0161\u0003"+
		"N\'\u0000\u0161\u0162\u00057\u0000\u0000\u0162\u0163\u0005G\u0000\u0000"+
		"\u01631\u0001\u0000\u0000\u0000\u0164\u0165\u0005V\u0000\u0000\u0165\u0166"+
		"\u0003L&\u0000\u0166\u0167\u0005J\u0000\u0000\u0167\u0168\u0005\u001e"+
		"\u0000\u0000\u0168\u0169\u00056\u0000\u0000\u0169\u016a\u0003L&\u0000"+
		"\u016a\u016b\u0005<\u0000\u0000\u016b\u016c\u0003.\u0017\u0000\u016c\u016d"+
		"\u00057\u0000\u0000\u016d\u016e\u0005G\u0000\u0000\u016e\u0184\u0001\u0000"+
		"\u0000\u0000\u016f\u0171\u0003@ \u0000\u0170\u0172\u0005V\u0000\u0000"+
		"\u0171\u0170\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0176\u0003L&\u0000\u0174\u0175"+
		"\u0005\u000e\u0000\u0000\u0175\u0177\u0003d2\u0000\u0176\u0174\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0005G\u0000\u0000\u0179\u0184\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0003@ \u0000\u017b\u017d\u00056\u0000\u0000\u017c"+
		"\u017e\u00034\u001a\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0181"+
		"\u00057\u0000\u0000\u0180\u0182\u0005G\u0000\u0000\u0181\u0180\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0001\u0000"+
		"\u0000\u0000\u0183\u0164\u0001\u0000\u0000\u0000\u0183\u016f\u0001\u0000"+
		"\u0000\u0000\u0183\u017a\u0001\u0000\u0000\u0000\u01843\u0001\u0000\u0000"+
		"\u0000\u0185\u0193\u0003<\u001e\u0000\u0186\u0187\u00054\u0000\u0000\u0187"+
		"\u0188\u0003>\u001f\u0000\u0188\u0189\u00055\u0000\u0000\u0189\u0193\u0001"+
		"\u0000\u0000\u0000\u018a\u018f\u0003\u0084B\u0000\u018b\u018c\u0005H\u0000"+
		"\u0000\u018c\u018e\u0003\u0084B\u0000\u018d\u018b\u0001\u0000\u0000\u0000"+
		"\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000\u0000"+
		"\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0185\u0001\u0000\u0000\u0000"+
		"\u0192\u0186\u0001\u0000\u0000\u0000\u0192\u018a\u0001\u0000\u0000\u0000"+
		"\u01935\u0001\u0000\u0000\u0000\u0194\u0195\u0003@ \u0000\u0195\u0196"+
		"\u00056\u0000\u0000\u0196\u0197\u0005V\u0000\u0000\u0197\u0198\u0005<"+
		"\u0000\u0000\u0198\u0199\u0003@ \u0000\u0199\u019a\u0007\u0002\u0000\u0000"+
		"\u019a\u019b\u0003@ \u0000\u019b\u019c\u00057\u0000\u0000\u019c\u01aa"+
		"\u0001\u0000\u0000\u0000\u019d\u019e\u0003@ \u0000\u019e\u019f\u00056"+
		"\u0000\u0000\u019f\u01a0\u0003L&\u0000\u01a0\u01a1\u0005<\u0000\u0000"+
		"\u01a1\u01a2\u0003@ \u0000\u01a2\u01a3\u0003L&\u0000\u01a3\u01a4\u0005"+
		"H\u0000\u0000\u01a4\u01a5\u0005C\u0000\u0000\u01a5\u01a6\u00057\u0000"+
		"\u0000\u01a6\u01a7\u0003P(\u0000\u01a7\u01a8\u0005C\u0000\u0000\u01a8"+
		"\u01aa\u0001\u0000\u0000\u0000\u01a9\u0194\u0001\u0000\u0000\u0000\u01a9"+
		"\u019d\u0001\u0000\u0000\u0000\u01aa7\u0001\u0000\u0000\u0000\u01ab\u01af"+
		"\u00034\u001a\u0000\u01ac\u01af\u00036\u001b\u0000\u01ad\u01af\u0003N"+
		"\'\u0000\u01ae\u01ab\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01af9\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b1\u0005\r\u0000\u0000\u01b1\u01b3\u00038\u001c\u0000\u01b2"+
		"\u01b4\u0005G\u0000\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b3\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b4;\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005"+
		"8\u0000\u0000\u01b6\u01bb\u0003>\u001f\u0000\u01b7\u01b8\u0005H\u0000"+
		"\u0000\u01b8\u01ba\u0003>\u001f\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01be\u0001\u0000\u0000\u0000"+
		"\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01bf\u00059\u0000\u0000\u01bf"+
		"=\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005V\u0000\u0000\u01c1\u01c2\u0005"+
		"I\u0000\u0000\u01c2\u01d1\u0003\u0084B\u0000\u01c3\u01c4\u0005\u0015\u0000"+
		"\u0000\u01c4\u01c5\u0005I\u0000\u0000\u01c5\u01d1\u0003\u0084B\u0000\u01c6"+
		"\u01c7\u0005\u0018\u0000\u0000\u01c7\u01c8\u0005I\u0000\u0000\u01c8\u01d1"+
		"\u0003\u0084B\u0000\u01c9\u01cb\u0005J\u0000\u0000\u01ca\u01c9\u0001\u0000"+
		"\u0000\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01cf\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d1\u0003@ \u0000"+
		"\u01d0\u01c0\u0001\u0000\u0000\u0000\u01d0\u01c3\u0001\u0000\u0000\u0000"+
		"\u01d0\u01c6\u0001\u0000\u0000\u0000\u01d0\u01cc\u0001\u0000\u0000\u0000"+
		"\u01d1?\u0001\u0000\u0000\u0000\u01d2\u01df\u0005V\u0000\u0000\u01d3\u01d4"+
		"\u0005J\u0000\u0000\u01d4\u01d6\u0005V\u0000\u0000\u01d5\u01d7\u0005Q"+
		"\u0000\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000"+
		"\u0000\u0000\u01d7\u01db\u0001\u0000\u0000\u0000\u01d8\u01d9\u00054\u0000"+
		"\u0000\u01d9\u01da\u0005V\u0000\u0000\u01da\u01dc\u00055\u0000\u0000\u01db"+
		"\u01d8\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc"+
		"\u01de\u0001\u0000\u0000\u0000\u01dd\u01d3\u0001\u0000\u0000\u0000\u01de"+
		"\u01e1\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01df"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e0A\u0001\u0000\u0000\u0000\u01e1\u01df"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005M\u0000\u0000\u01e3\u01e5\u0005"+
		"\t\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e7\u0001\u0000\u0000\u0000\u01e6\u01e8\u0003L&\u0000"+
		"\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000"+
		"\u01e8\u01eb\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005I\u0000\u0000\u01ea"+
		"\u01ec\u0003\u009aM\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ec\u01f6\u0001\u0000\u0000\u0000\u01ed\u01ee"+
		"\u0005Q\u0000\u0000\u01ee\u01ef\u0003L&\u0000\u01ef\u01f0\u0005I\u0000"+
		"\u0000\u01f0\u01f1\u0005V\u0000\u0000\u01f1\u01f2\u0005=\u0000\u0000\u01f2"+
		"\u01f3\u0003d2\u0000\u01f3\u01f4\u0005>\u0000\u0000\u01f4\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f5\u01e4\u0001\u0000\u0000\u0000\u01f5\u01ed\u0001"+
		"\u0000\u0000\u0000\u01f6C\u0001\u0000\u0000\u0000\u01f7\u01fa\u0005\t"+
		"\u0000\u0000\u01f8\u01fa\u0003\u0098L\u0000\u01f9\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f9\u01f8\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005V\u0000\u0000"+
		"\u01fc\u01fd\u0003B!\u0000\u01fd\u0201\u00058\u0000\u0000\u01fe\u0200"+
		"\u0003,\u0016\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u0200\u0203\u0001"+
		"\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001"+
		"\u0000\u0000\u0000\u0202\u0204\u0001\u0000\u0000\u0000\u0203\u0201\u0001"+
		"\u0000\u0000\u0000\u0204\u0205\u00059\u0000\u0000\u0205E\u0001\u0000\u0000"+
		"\u0000\u0206\u0209\u0003D\"\u0000\u0207\u0209\u0003\u00a4R\u0000\u0208"+
		"\u0206\u0001\u0000\u0000\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0209"+
		"G\u0001\u0000\u0000\u0000\u020a\u020c\u0005H\u0000\u0000\u020b\u020d\u0005"+
		"E\u0000\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0005V\u0000"+
		"\u0000\u020f\u0210\u0005I\u0000\u0000\u0210\u0212\u0003h4\u0000\u0211"+
		"\u020a\u0001\u0000\u0000\u0000\u0212\u0215\u0001\u0000\u0000\u0000\u0213"+
		"\u0211\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214"+
		"\u0225\u0001\u0000\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0216"+
		"\u0217\u0005M\u0000\u0000\u0217\u0221\u0003N\'\u0000\u0218\u0219\u0005"+
		"H\u0000\u0000\u0219\u021a\u0005V\u0000\u0000\u021a\u021b\u0005I\u0000"+
		"\u0000\u021b\u021c\u0003h4\u0000\u021c\u021d\u0005M\u0000\u0000\u021d"+
		"\u021e\u0003N\'\u0000\u021e\u0220\u0001\u0000\u0000\u0000\u021f\u0218"+
		"\u0001\u0000\u0000\u0000\u0220\u0223\u0001\u0000\u0000\u0000\u0221\u021f"+
		"\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0225"+
		"\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0224\u0213"+
		"\u0001\u0000\u0000\u0000\u0224\u0216\u0001\u0000\u0000\u0000\u0225I\u0001"+
		"\u0000\u0000\u0000\u0226\u0228\u0005E\u0000\u0000\u0227\u0226\u0001\u0000"+
		"\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000"+
		"\u0000\u0000\u0229\u022e\u0005V\u0000\u0000\u022a\u022b\u0005I\u0000\u0000"+
		"\u022b\u022c\u0003h4\u0000\u022c\u022d\u0003H$\u0000\u022d\u022f\u0001"+
		"\u0000\u0000\u0000\u022e\u022a\u0001\u0000\u0000\u0000\u022e\u022f\u0001"+
		"\u0000\u0000\u0000\u022f\u0239\u0001\u0000\u0000\u0000\u0230\u0235\u0003"+
		"@ \u0000\u0231\u0232\u0005H\u0000\u0000\u0232\u0234\u0003@ \u0000\u0233"+
		"\u0231\u0001\u0000\u0000\u0000\u0234\u0237\u0001\u0000\u0000\u0000\u0235"+
		"\u0233\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236"+
		"\u0239\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0238"+
		"\u0227\u0001\u0000\u0000\u0000\u0238\u0230\u0001\u0000\u0000\u0000\u0239"+
		"K\u0001\u0000\u0000\u0000\u023a\u023e\u00056\u0000\u0000\u023b\u023d\u0003"+
		"J%\u0000\u023c\u023b\u0001\u0000\u0000\u0000\u023d\u0240\u0001\u0000\u0000"+
		"\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000"+
		"\u0000\u023f\u0241\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000"+
		"\u0000\u0241\u0242\u00057\u0000\u0000\u0242M\u0001\u0000\u0000\u0000\u0243"+
		"\u0244\u0007\u0003\u0000\u0000\u0244O\u0001\u0000\u0000\u0000\u0245\u0246"+
		"\u0007\u0004\u0000\u0000\u0246Q\u0001\u0000\u0000\u0000\u0247\u0248\u0005"+
		"K\u0000\u0000\u0248\u0249\u0005J\u0000\u0000\u0249\u024a\u00054\u0000"+
		"\u0000\u024a\u024b\u0003N\'\u0000\u024b\u024c\u00055\u0000\u0000\u024c"+
		"\u024e\u0001\u0000\u0000\u0000\u024d\u0247\u0001\u0000\u0000\u0000\u024e"+
		"\u0251\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u024f"+
		"\u0250\u0001\u0000\u0000\u0000\u0250S\u0001\u0000\u0000\u0000\u0251\u024f"+
		"\u0001\u0000\u0000\u0000\u0252\u0253\u0006*\uffff\uffff\u0000\u0253\u0254"+
		"\u0005V\u0000\u0000\u0254\u0255\u0005M\u0000\u0000\u0255\u0256\u0003\u0084"+
		"B\u0000\u0256\u0257\u0005G\u0000\u0000\u0257\u026f\u0001\u0000\u0000\u0000"+
		"\u0258\u0259\u0003@ \u0000\u0259\u0264\u0003R)\u0000\u025a\u025c\u0005"+
		"M\u0000\u0000\u025b\u025d\u0005-\u0000\u0000\u025c\u025b\u0001\u0000\u0000"+
		"\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000"+
		"\u0000\u025e\u0262\u0003h4\u0000\u025f\u0260\u0003P(\u0000\u0260\u0261"+
		"\u0003N\'\u0000\u0261\u0263\u0001\u0000\u0000\u0000\u0262\u025f\u0001"+
		"\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0265\u0001"+
		"\u0000\u0000\u0000\u0264\u025a\u0001\u0000\u0000\u0000\u0264\u0265\u0001"+
		"\u0000\u0000\u0000\u0265\u0267\u0001\u0000\u0000\u0000\u0266\u0268\u0005"+
		"G\u0000\u0000\u0267\u0266\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000"+
		"\u0000\u0000\u0268\u026f\u0001\u0000\u0000\u0000\u0269\u026a\u0003@ \u0000"+
		"\u026a\u026b\u0005M\u0000\u0000\u026b\u026c\u0003<\u001e\u0000\u026c\u026d"+
		"\u0005G\u0000\u0000\u026d\u026f\u0001\u0000\u0000\u0000\u026e\u0252\u0001"+
		"\u0000\u0000\u0000\u026e\u0258\u0001\u0000\u0000\u0000\u026e\u0269\u0001"+
		"\u0000\u0000\u0000\u026f\u027b\u0001\u0000\u0000\u0000\u0270\u0271\n\u0002"+
		"\u0000\u0000\u0271\u0272\u0005M\u0000\u0000\u0272\u0277\u0003T*\u0000"+
		"\u0273\u0274\u0005\u000e\u0000\u0000\u0274\u0275\u0003j5\u0000\u0275\u0276"+
		"\u0005G\u0000\u0000\u0276\u0278\u0001\u0000\u0000\u0000\u0277\u0273\u0001"+
		"\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u027a\u0001"+
		"\u0000\u0000\u0000\u0279\u0270\u0001\u0000\u0000\u0000\u027a\u027d\u0001"+
		"\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027c\u0001"+
		"\u0000\u0000\u0000\u027cU\u0001\u0000\u0000\u0000\u027d\u027b\u0001\u0000"+
		"\u0000\u0000\u027e\u0282\u0007\u0005\u0000\u0000\u027f\u0281\u0003$\u0012"+
		"\u0000\u0280\u027f\u0001\u0000\u0000\u0000\u0281\u0284\u0001\u0000\u0000"+
		"\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000"+
		"\u0000\u0283\u028b\u0001\u0000\u0000\u0000\u0284\u0282\u0001\u0000\u0000"+
		"\u0000\u0285\u0287\u0005*\u0000\u0000\u0286\u0288\u0003$\u0012\u0000\u0287"+
		"\u0286\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289"+
		"\u0287\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a"+
		"\u028c\u0001\u0000\u0000\u0000\u028b\u0285\u0001\u0000\u0000\u0000\u028b"+
		"\u028c\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d"+
		"\u028e\u0007\u0006\u0000\u0000\u028eW\u0001\u0000\u0000\u0000\u028f\u0290"+
		"\u00056\u0000\u0000\u0290\u0291\u0005\u0002\u0000\u0000\u0291\u0292\u0005"+
		"\u0081\u0000\u0000\u0292\u0293\u0005\u0083\u0000\u0000\u0293\u0294\u0005"+
		"\u0089\u0000\u0000\u0294\u0295\u0005\u008a\u0000\u0000\u0295\u029e\u0005"+
		"\u008b\u0000\u0000\u0296\u029b\u0005\u008a\u0000\u0000\u0297\u0298\u0005"+
		"\u0088\u0000\u0000\u0298\u029a\u0005\u008a\u0000\u0000\u0299\u0297\u0001"+
		"\u0000\u0000\u0000\u029a\u029d\u0001\u0000\u0000\u0000\u029b\u0299\u0001"+
		"\u0000\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u029f\u0001"+
		"\u0000\u0000\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029e\u0296\u0001"+
		"\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u02a0\u0001"+
		"\u0000\u0000\u0000\u02a0\u02a1\u0005\u0081\u0000\u0000\u02a1\u02a2\u0005"+
		"\u008c\u0000\u0000\u02a2Y\u0001\u0000\u0000\u0000\u02a3\u02a6\u0003\\"+
		".\u0000\u02a4\u02a6\u0003^/\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000"+
		"\u02a5\u02a4\u0001\u0000\u0000\u0000\u02a6[\u0001\u0000\u0000\u0000\u02a7"+
		"\u02ab\u0003`0\u0000\u02a8\u02aa\u0003$\u0012\u0000\u02a9\u02a8\u0001"+
		"\u0000\u0000\u0000\u02aa\u02ad\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001"+
		"\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ae\u0001"+
		"\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ae\u02af\u0003"+
		"b1\u0000\u02af]\u0001\u0000\u0000\u0000\u02b0\u02b4\u0005=\u0000\u0000"+
		"\u02b1\u02b3\u0003$\u0012\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b3"+
		"\u02b6\u0001\u0000\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b7\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b7\u02b8\u0005?\u0000\u0000\u02b8\u02b9"+
		"\u0005>\u0000\u0000\u02b9_\u0001\u0000\u0000\u0000\u02ba\u02be\u0005="+
		"\u0000\u0000\u02bb\u02bd\u0003$\u0012\u0000\u02bc\u02bb\u0001\u0000\u0000"+
		"\u0000\u02bd\u02c0\u0001\u0000\u0000\u0000\u02be\u02bc\u0001\u0000\u0000"+
		"\u0000\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf\u02c1\u0001\u0000\u0000"+
		"\u0000\u02c0\u02be\u0001\u0000\u0000\u0000\u02c1\u02c2\u0005>\u0000\u0000"+
		"\u02c2a\u0001\u0000\u0000\u0000\u02c3\u02c4\u0005=\u0000\u0000\u02c4\u02c5"+
		"\u0005?\u0000\u0000\u02c5\u02c6\u0005V\u0000\u0000\u02c6\u02c7\u0005>"+
		"\u0000\u0000\u02c7c\u0001\u0000\u0000\u0000\u02c8\u02c9\u0005V\u0000\u0000"+
		"\u02c9\u02ca\u00054\u0000\u0000\u02ca\u02cb\u00055\u0000\u0000\u02cbe"+
		"\u0001\u0000\u0000\u0000\u02cc\u02cd\u0005V\u0000\u0000\u02cd\u02ce\u0005"+
		"=\u0000\u0000\u02ce\u02d3\u0003N\'\u0000\u02cf\u02d0\u0005H\u0000\u0000"+
		"\u02d0\u02d2\u0003N\'\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d2"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d3"+
		"\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d6\u0001\u0000\u0000\u0000\u02d5"+
		"\u02d3\u0001\u0000\u0000\u0000\u02d6\u02d7\u0005>\u0000\u0000\u02d7g\u0001"+
		"\u0000\u0000\u0000\u02d8\u02de\u0003j5\u0000\u02d9\u02de\u0003l6\u0000"+
		"\u02da\u02de\u0003d2\u0000\u02db\u02de\u0003f3\u0000\u02dc\u02de\u0003"+
		"n7\u0000\u02dd\u02d8\u0001\u0000\u0000\u0000\u02dd\u02d9\u0001\u0000\u0000"+
		"\u0000\u02dd\u02da\u0001\u0000\u0000\u0000\u02dd\u02db\u0001\u0000\u0000"+
		"\u0000\u02dd\u02dc\u0001\u0000\u0000\u0000\u02dei\u0001\u0000\u0000\u0000"+
		"\u02df\u02e8\u0005V\u0000\u0000\u02e0\u02e8\u0005#\u0000\u0000\u02e1\u02e8"+
		"\u0005%\u0000\u0000\u02e2\u02e8\u0005&\u0000\u0000\u02e3\u02e8\u0005\""+
		"\u0000\u0000\u02e4\u02e8\u0005$\u0000\u0000\u02e5\u02e8\u0005\u001c\u0000"+
		"\u0000\u02e6\u02e8\u0003V+\u0000\u02e7\u02df\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e7\u02e1\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e2\u0001\u0000\u0000\u0000\u02e7\u02e3\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e4\u0001\u0000\u0000\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e6\u0001\u0000\u0000\u0000\u02e8k\u0001\u0000\u0000\u0000\u02e9\u02ea"+
		"\u0005\b\u0000\u0000\u02ea\u02eb\u0005=\u0000\u0000\u02eb\u02ec\u0005"+
		"$\u0000\u0000\u02ec\u02ed\u0005>\u0000\u0000\u02edm\u0001\u0000\u0000"+
		"\u0000\u02ee\u02ef\u0005#\u0000\u0000\u02ef\u02f0\u00054\u0000\u0000\u02f0"+
		"\u02f1\u00055\u0000\u0000\u02f1o\u0001\u0000\u0000\u0000\u02f2\u0301\u0005"+
		"G\u0000\u0000\u02f3\u0301\u0005H\u0000\u0000\u02f4\u0301\u0005I\u0000"+
		"\u0000\u02f5\u0301\u0005J\u0000\u0000\u02f6\u0301\u0005K\u0000\u0000\u02f7"+
		"\u0301\u0005L\u0000\u0000\u02f8\u0301\u0005M\u0000\u0000\u02f9\u0301\u0003"+
		"P(\u0000\u02fa\u0301\u0005Q\u0000\u0000\u02fb\u0301\u00054\u0000\u0000"+
		"\u02fc\u0301\u00055\u0000\u0000\u02fd\u0301\u00056\u0000\u0000\u02fe\u0301"+
		"\u00057\u0000\u0000\u02ff\u0301\u0005-\u0000\u0000\u0300\u02f2\u0001\u0000"+
		"\u0000\u0000\u0300\u02f3\u0001\u0000\u0000\u0000\u0300\u02f4\u0001\u0000"+
		"\u0000\u0000\u0300\u02f5\u0001\u0000\u0000\u0000\u0300\u02f6\u0001\u0000"+
		"\u0000\u0000\u0300\u02f7\u0001\u0000\u0000\u0000\u0300\u02f8\u0001\u0000"+
		"\u0000\u0000\u0300\u02f9\u0001\u0000\u0000\u0000\u0300\u02fa\u0001\u0000"+
		"\u0000\u0000\u0300\u02fb\u0001\u0000\u0000\u0000\u0300\u02fc\u0001\u0000"+
		"\u0000\u0000\u0300\u02fd\u0001\u0000\u0000\u0000\u0300\u02fe\u0001\u0000"+
		"\u0000\u0000\u0300\u02ff\u0001\u0000\u0000\u0000\u0301q\u0001\u0000\u0000"+
		"\u0000\u0302\u0311\u00054\u0000\u0000\u0303\u030e\u0003\u0084B\u0000\u0304"+
		"\u0305\u0005H\u0000\u0000\u0305\u0309\u0003\u0084B\u0000\u0306\u0308\u0005"+
		"H\u0000\u0000\u0307\u0306\u0001\u0000\u0000\u0000\u0308\u030b\u0001\u0000"+
		"\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000\u0309\u030a\u0001\u0000"+
		"\u0000\u0000\u030a\u030d\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000"+
		"\u0000\u0000\u030c\u0304\u0001\u0000\u0000\u0000\u030d\u0310\u0001\u0000"+
		"\u0000\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030e\u030f\u0001\u0000"+
		"\u0000\u0000\u030f\u0312\u0001\u0000\u0000\u0000\u0310\u030e\u0001\u0000"+
		"\u0000\u0000\u0311\u0303\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000"+
		"\u0000\u0000\u0312\u0313\u0001\u0000\u0000\u0000\u0313\u0314\u00055\u0000"+
		"\u0000\u0314s\u0001\u0000\u0000\u0000\u0315\u0319\u00058\u0000\u0000\u0316"+
		"\u0318\u0003\u0084B\u0000\u0317\u0316\u0001\u0000\u0000\u0000\u0318\u031b"+
		"\u0001\u0000\u0000\u0000\u0319\u0317\u0001\u0000\u0000\u0000\u0319\u031a"+
		"\u0001\u0000\u0000\u0000\u031a\u031c\u0001\u0000\u0000\u0000\u031b\u0319"+
		"\u0001\u0000\u0000\u0000\u031c\u031d\u00059\u0000\u0000\u031du\u0001\u0000"+
		"\u0000\u0000\u031e\u031f\u0005\u001d\u0000\u0000\u031f\u0320\u0003t:\u0000"+
		"\u0320w\u0001\u0000\u0000\u0000\u0321\u0322\u0005\u001e\u0000\u0000\u0322"+
		"\u0323\u0003t:\u0000\u0323y\u0001\u0000\u0000\u0000\u0324\u0328\u0003"+
		"N\'\u0000\u0325\u0326\u0003P(\u0000\u0326\u0327\u0003N\'\u0000\u0327\u0329"+
		"\u0001\u0000\u0000\u0000\u0328\u0325\u0001\u0000\u0000\u0000\u0328\u0329"+
		"\u0001\u0000\u0000\u0000\u0329{\u0001\u0000\u0000\u0000\u032a\u032c\u0003"+
		"@ \u0000\u032b\u032d\u0005K\u0000\u0000\u032c\u032b\u0001\u0000\u0000"+
		"\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u032c\u0001\u0000\u0000"+
		"\u0000\u032e\u032f\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000\u0000"+
		"\u0000\u0330\u0331\u0003N\'\u0000\u0331}\u0001\u0000\u0000\u0000\u0332"+
		"\u0333\u0005V\u0000\u0000\u0333\u0334\u0005J\u0000\u0000\u0334\u0335\u0005"+
		"\u0010\u0000\u0000\u0335\u0336\u0005J\u0000\u0000\u0336\u0337\u0005\u0011"+
		"\u0000\u0000\u0337\u0338\u00056\u0000\u0000\u0338\u0339\u00054\u0000\u0000"+
		"\u0339\u033e\u0003N\'\u0000\u033a\u033b\u0005H\u0000\u0000\u033b\u033d"+
		"\u0003N\'\u0000\u033c\u033a\u0001\u0000\u0000\u0000\u033d\u0340\u0001"+
		"\u0000\u0000\u0000\u033e\u033c\u0001\u0000\u0000\u0000\u033e\u033f\u0001"+
		"\u0000\u0000\u0000\u033f\u0341\u0001\u0000\u0000\u0000\u0340\u033e\u0001"+
		"\u0000\u0000\u0000\u0341\u0342\u00055\u0000\u0000\u0342\u0343\u00057\u0000"+
		"\u0000\u0343\u0344\u0005G\u0000\u0000\u0344\u007f\u0001\u0000\u0000\u0000"+
		"\u0345\u0347\u0005#\u0000\u0000\u0346\u0345\u0001\u0000\u0000\u0000\u0346"+
		"\u0347\u0001\u0000\u0000\u0000\u0347\u0349\u0001\u0000\u0000\u0000\u0348"+
		"\u034a\u00056\u0000\u0000\u0349\u0348\u0001\u0000\u0000\u0000\u0349\u034a"+
		"\u0001\u0000\u0000\u0000\u034a\u034e\u0001\u0000\u0000\u0000\u034b\u034d"+
		"\u0003@ \u0000\u034c\u034b\u0001\u0000\u0000\u0000\u034d\u0350\u0001\u0000"+
		"\u0000\u0000\u034e\u034c\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000"+
		"\u0000\u0000\u034f\u0351\u0001\u0000\u0000\u0000\u0350\u034e\u0001\u0000"+
		"\u0000\u0000\u0351\u0355\u00056\u0000\u0000\u0352\u0354\u00058\u0000\u0000"+
		"\u0353\u0352\u0001\u0000\u0000\u0000\u0354\u0357\u0001\u0000\u0000\u0000"+
		"\u0355\u0353\u0001\u0000\u0000\u0000\u0355\u0356\u0001\u0000\u0000\u0000"+
		"\u0356\u035b\u0001\u0000\u0000\u0000\u0357\u0355\u0001\u0000\u0000\u0000"+
		"\u0358\u035a\u0003\u0082A\u0000\u0359\u0358\u0001\u0000\u0000\u0000\u035a"+
		"\u035d\u0001\u0000\u0000\u0000\u035b\u0359\u0001\u0000\u0000\u0000\u035b"+
		"\u035c\u0001\u0000\u0000\u0000\u035c\u0361\u0001\u0000\u0000\u0000\u035d"+
		"\u035b\u0001\u0000\u0000\u0000\u035e\u0360\u00059\u0000\u0000\u035f\u035e"+
		"\u0001\u0000\u0000\u0000\u0360\u0363\u0001\u0000\u0000\u0000\u0361\u035f"+
		"\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0367"+
		"\u0001\u0000\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0364\u0366"+
		"\u00057\u0000\u0000\u0365\u0364\u0001\u0000\u0000\u0000\u0366\u0369\u0001"+
		"\u0000\u0000\u0000\u0367\u0365\u0001\u0000\u0000\u0000\u0367\u0368\u0001"+
		"\u0000\u0000\u0000\u0368\u036a\u0001\u0000\u0000\u0000\u0369\u0367\u0001"+
		"\u0000\u0000\u0000\u036a\u036b\u0005G\u0000\u0000\u036b\u0081\u0001\u0000"+
		"\u0000\u0000\u036c\u036f\u0003N\'\u0000\u036d\u036f\u0003\u00a2Q\u0000"+
		"\u036e\u036c\u0001\u0000\u0000\u0000\u036e\u036d\u0001\u0000\u0000\u0000"+
		"\u036f\u0083\u0001\u0000\u0000\u0000\u0370\u037f\u0003N\'\u0000\u0371"+
		"\u037f\u0003~?\u0000\u0372\u037f\u0003r9\u0000\u0373\u037f\u0003\u00a2"+
		"Q\u0000\u0374\u037f\u0003\u0096K\u0000\u0375\u037f\u0003v;\u0000\u0376"+
		"\u037f\u0003x<\u0000\u0377\u037f\u0003<\u001e\u0000\u0378\u037f\u0003"+
		"\u0080@\u0000\u0379\u037f\u0003\u0086C\u0000\u037a\u037f\u0003@ \u0000"+
		"\u037b\u037f\u0003T*\u0000\u037c\u037f\u0003|>\u0000\u037d\u037f\u0003"+
		"z=\u0000\u037e\u0370\u0001\u0000\u0000\u0000\u037e\u0371\u0001\u0000\u0000"+
		"\u0000\u037e\u0372\u0001\u0000\u0000\u0000\u037e\u0373\u0001\u0000\u0000"+
		"\u0000\u037e\u0374\u0001\u0000\u0000\u0000\u037e\u0375\u0001\u0000\u0000"+
		"\u0000\u037e\u0376\u0001\u0000\u0000\u0000\u037e\u0377\u0001\u0000\u0000"+
		"\u0000\u037e\u0378\u0001\u0000\u0000\u0000\u037e\u0379\u0001\u0000\u0000"+
		"\u0000\u037e\u037a\u0001\u0000\u0000\u0000\u037e\u037b\u0001\u0000\u0000"+
		"\u0000\u037e\u037c\u0001\u0000\u0000\u0000\u037e\u037d\u0001\u0000\u0000"+
		"\u0000\u037f\u0085\u0001\u0000\u0000\u0000\u0380\u0381\u0005(\u0000\u0000"+
		"\u0381\u0382\u0005X\u0000\u0000\u0382\u0387\u0003\u0088D\u0000\u0383\u0384"+
		"\u0005)\u0000\u0000\u0384\u0385\u0005a\u0000\u0000\u0385\u0387\u0003\u008c"+
		"F\u0000\u0386\u0380\u0001\u0000\u0000\u0000\u0386\u0383\u0001\u0000\u0000"+
		"\u0000\u0387\u0087\u0001\u0000\u0000\u0000\u0388\u038c\u0005Y\u0000\u0000"+
		"\u0389\u038b\u0003\u008aE\u0000\u038a\u0389\u0001\u0000\u0000\u0000\u038b"+
		"\u038e\u0001\u0000\u0000\u0000\u038c\u038a\u0001\u0000\u0000\u0000\u038c"+
		"\u038d\u0001\u0000\u0000\u0000\u038d\u038f\u0001\u0000\u0000\u0000\u038e"+
		"\u038c\u0001\u0000\u0000\u0000\u038f\u0390\u0005^\u0000\u0000\u0390\u0089"+
		"\u0001\u0000\u0000\u0000\u0391\u0392\u0005Z\u0000\u0000\u0392\u0393\u0005"+
		"]\u0000\u0000\u0393\u0394\u0005\\\u0000\u0000\u0394\u039c\u0005]\u0000"+
		"\u0000\u0395\u0397\u0005[\u0000\u0000\u0396\u0395\u0001\u0000\u0000\u0000"+
		"\u0396\u0397\u0001\u0000\u0000\u0000\u0397\u0398\u0001\u0000\u0000\u0000"+
		"\u0398\u0399\u0005Z\u0000\u0000\u0399\u039a\u0005]\u0000\u0000\u039a\u039b"+
		"\u0005X\u0000\u0000\u039b\u039d\u0005]\u0000\u0000\u039c\u0396\u0001\u0000"+
		"\u0000\u0000\u039c\u039d\u0001\u0000\u0000\u0000\u039d\u008b\u0001\u0000"+
		"\u0000\u0000\u039e\u039f\u0005c\u0000\u0000\u039f\u03a0\u0003\u008eG\u0000"+
		"\u03a0\u03a1\u0005\u007f\u0000\u0000\u03a1\u008d\u0001\u0000\u0000\u0000"+
		"\u03a2\u03a6\u0005~\u0000\u0000\u03a3\u03a4\u0003\u0090H\u0000\u03a4\u03a5"+
		"\u0005b\u0000\u0000\u03a5\u03a7\u0001\u0000\u0000\u0000\u03a6\u03a3\u0001"+
		"\u0000\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7\u03c2\u0001"+
		"\u0000\u0000\u0000\u03a8\u03b0\u0003\u0092I\u0000\u03a9\u03aa\u0005w\u0000"+
		"\u0000\u03aa\u03ac\u0005`\u0000\u0000\u03ab\u03a9\u0001\u0000\u0000\u0000"+
		"\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000"+
		"\u03ad\u03ae\u0003\u0090H\u0000\u03ae\u03af\u0007\u0007\u0000\u0000\u03af"+
		"\u03b1\u0001\u0000\u0000\u0000\u03b0\u03ab\u0001\u0000\u0000\u0000\u03b0"+
		"\u03b1\u0001\u0000\u0000\u0000\u03b1\u03c2\u0001\u0000\u0000\u0000\u03b2"+
		"\u03bf\u0003\u0092I\u0000\u03b3\u03b4\u0005z\u0000\u0000\u03b4\u03b5\u0005"+
		"~\u0000\u0000\u03b5\u03b6\u0005u\u0000\u0000\u03b6\u03b9\u0003\u0092I"+
		"\u0000\u03b7\u03b8\u0005w\u0000\u0000\u03b8\u03ba\u0005`\u0000\u0000\u03b9"+
		"\u03b7\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000\u0000\u0000\u03ba"+
		"\u03bb\u0001\u0000\u0000\u0000\u03bb\u03bc\u0003\u0090H\u0000\u03bc\u03bd"+
		"\u0005~\u0000\u0000\u03bd\u03be\u0005{\u0000\u0000\u03be\u03c0\u0001\u0000"+
		"\u0000\u0000\u03bf\u03b3\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000"+
		"\u0000\u0000\u03c0\u03c2\u0001\u0000\u0000\u0000\u03c1\u03a2\u0001\u0000"+
		"\u0000\u0000\u03c1\u03a8\u0001\u0000\u0000\u0000\u03c1\u03b2\u0001\u0000"+
		"\u0000\u0000\u03c2\u008f\u0001\u0000\u0000\u0000\u03c3\u03c4\u0007\b\u0000"+
		"\u0000\u03c4\u0091\u0001\u0000\u0000\u0000\u03c5\u03c7\u0005g\u0000\u0000"+
		"\u03c6\u03c5\u0001\u0000\u0000\u0000\u03c6\u03c7\u0001\u0000\u0000\u0000"+
		"\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8\u03cb\u0005~\u0000\u0000\u03c9"+
		"\u03ca\u0005s\u0000\u0000\u03ca\u03cc\u0005~\u0000\u0000\u03cb\u03c9\u0001"+
		"\u0000\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000\u03cc\u0093\u0001"+
		"\u0000\u0000\u0000\u03cd\u03ce\u0005\u000b\u0000\u0000\u03ce\u03d2\u0005"+
		"6\u0000\u0000\u03cf\u03d1\u0003$\u0012\u0000\u03d0\u03cf\u0001\u0000\u0000"+
		"\u0000\u03d1\u03d4\u0001\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000"+
		"\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d5\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d2\u0001\u0000\u0000\u0000\u03d5\u03d6\u00057\u0000\u0000"+
		"\u03d6\u0095\u0001\u0000\u0000\u0000\u03d7\u03d8\u0005V\u0000\u0000\u03d8"+
		"\u03d9\u0005K\u0000\u0000\u03d9\u03da\u0003h4\u0000\u03da\u03db\u0005"+
		"I\u0000\u0000\u03db\u03dc\u0003h4\u0000\u03dc\u03e8\u0001\u0000\u0000"+
		"\u0000\u03dd\u03de\u0003\u0094J\u0000\u03de\u03df\u0005\r\u0000\u0000"+
		"\u03df\u03e0\u0005G\u0000\u0000\u03e0\u03e8\u0001\u0000\u0000\u0000\u03e1"+
		"\u03e2\u0003\u0094J\u0000\u03e2\u03e5\u0003t:\u0000\u03e3\u03e4\u0005"+
		"\f\u0000\u0000\u03e4\u03e6\u0003t:\u0000\u03e5\u03e3\u0001\u0000\u0000"+
		"\u0000\u03e5\u03e6\u0001\u0000\u0000\u0000\u03e6\u03e8\u0001\u0000\u0000"+
		"\u0000\u03e7\u03d7\u0001\u0000\u0000\u0000\u03e7\u03dd\u0001\u0000\u0000"+
		"\u0000\u03e7\u03e1\u0001\u0000\u0000\u0000\u03e8\u0097\u0001\u0000\u0000"+
		"\u0000\u03e9\u03ea\u0007\t\u0000\u0000\u03ea\u0099\u0001\u0000\u0000\u0000"+
		"\u03eb\u03ee\u0003h4\u0000\u03ec\u03ed\u0005*\u0000\u0000\u03ed\u03ef"+
		"\u0003h4\u0000\u03ee\u03ec\u0001\u0000\u0000\u0000\u03ee\u03ef\u0001\u0000"+
		"\u0000\u0000\u03ef\u009b\u0001\u0000\u0000\u0000\u03f0\u03f2\u0005V\u0000"+
		"\u0000\u03f1\u03f0\u0001\u0000\u0000\u0000\u03f2\u03f5\u0001\u0000\u0000"+
		"\u0000\u03f3\u03f1\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000"+
		"\u0000\u03f4\u03f6\u0001\u0000\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000"+
		"\u0000\u03f6\u03f9\u0003L&\u0000\u03f7\u03f8\u0005J\u0000\u0000\u03f8"+
		"\u03fa\u0003\u009eO\u0000\u03f9\u03f7\u0001\u0000\u0000\u0000\u03f9\u03fa"+
		"\u0001\u0000\u0000\u0000\u03fa\u009d\u0001\u0000\u0000\u0000\u03fb\u03fc"+
		"\u0005\'\u0000\u0000\u03fc\u03fd\u0003L&\u0000\u03fd\u009f\u0001\u0000"+
		"\u0000\u0000\u03fe\u03ff\u0005I\u0000\u0000\u03ff\u0404\u0003\u009aM\u0000"+
		"\u0400\u0401\u00054\u0000\u0000\u0401\u0403\u00055\u0000\u0000\u0402\u0400"+
		"\u0001\u0000\u0000\u0000\u0403\u0406\u0001\u0000\u0000\u0000\u0404\u0402"+
		"\u0001\u0000\u0000\u0000\u0404\u0405\u0001\u0000\u0000\u0000\u0405\u0407"+
		"\u0001\u0000\u0000\u0000\u0406\u0404\u0001\u0000\u0000\u0000\u0407\u0408"+
		"\u0005M\u0000\u0000\u0408\u0409\u0003$\u0012\u0000\u0409\u0418\u0001\u0000"+
		"\u0000\u0000\u040a\u040d\u0007\n\u0000\u0000\u040b\u040e\u0003$\u0012"+
		"\u0000\u040c\u040e\u00036\u001b\u0000\u040d\u040b\u0001\u0000\u0000\u0000"+
		"\u040d\u040c\u0001\u0000\u0000\u0000\u040e\u0412\u0001\u0000\u0000\u0000"+
		"\u040f\u0411\u0005H\u0000\u0000\u0410\u040f\u0001\u0000\u0000\u0000\u0411"+
		"\u0414\u0001\u0000\u0000\u0000\u0412\u0410\u0001\u0000\u0000\u0000\u0412"+
		"\u0413\u0001\u0000\u0000\u0000\u0413\u0418\u0001\u0000\u0000\u0000\u0414"+
		"\u0412\u0001\u0000\u0000\u0000\u0415\u0416\u0005M\u0000\u0000\u0416\u0418"+
		"\u0003\u009cN\u0000\u0417\u03fe\u0001\u0000\u0000\u0000\u0417\u040a\u0001"+
		"\u0000\u0000\u0000\u0417\u0415\u0001\u0000\u0000\u0000\u0418\u00a1\u0001"+
		"\u0000\u0000\u0000\u0419\u041b\u0003\u0098L\u0000\u041a\u0419\u0001\u0000"+
		"\u0000\u0000\u041a\u041b\u0001\u0000\u0000\u0000\u041b\u041d\u0001\u0000"+
		"\u0000\u0000\u041c\u041e\u0003@ \u0000\u041d\u041c\u0001\u0000\u0000\u0000"+
		"\u041e\u041f\u0001\u0000\u0000\u0000\u041f\u041d\u0001\u0000\u0000\u0000"+
		"\u041f\u0420\u0001\u0000\u0000\u0000\u0420\u0422\u0001\u0000\u0000\u0000"+
		"\u0421\u0423\u0005K\u0000\u0000\u0422\u0421\u0001\u0000\u0000\u0000\u0422"+
		"\u0423\u0001\u0000\u0000\u0000\u0423\u0424\u0001\u0000\u0000\u0000\u0424"+
		"\u0426\u0003\u00a0P\u0000\u0425\u0427\u0005G\u0000\u0000\u0426\u0425\u0001"+
		"\u0000\u0000\u0000\u0426\u0427\u0001\u0000\u0000\u0000\u0427\u00a3\u0001"+
		"\u0000\u0000\u0000\u0428\u0429\u0003\u0098L\u0000\u0429\u042a\u0005V\u0000"+
		"\u0000\u042a\u042b\u0005M\u0000\u0000\u042b\u042e\u0003L&\u0000\u042c"+
		"\u042d\u0005I\u0000\u0000\u042d\u042f\u0003h4\u0000\u042e\u042c\u0001"+
		"\u0000\u0000\u0000\u042e\u042f\u0001\u0000\u0000\u0000\u042f\u0430\u0001"+
		"\u0000\u0000\u0000\u0430\u0431\u0005<\u0000\u0000\u0431\u0432\u0003,\u0016"+
		"\u0000\u0432\u0433\u0005G\u0000\u0000\u0433\u0449\u0001\u0000\u0000\u0000"+
		"\u0434\u0435\u0003@ \u0000\u0435\u0437\u0005M\u0000\u0000\u0436\u0438"+
		"\u0003L&\u0000\u0437\u0436\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000"+
		"\u0000\u0000\u0438\u043b\u0001\u0000\u0000\u0000\u0439\u043a\u0005I\u0000"+
		"\u0000\u043a\u043c\u0003h4\u0000\u043b\u0439\u0001\u0000\u0000\u0000\u043b"+
		"\u043c\u0001\u0000\u0000\u0000\u043c\u043d\u0001\u0000\u0000\u0000\u043d"+
		"\u043e\u0005<\u0000\u0000\u043e\u0442\u00058\u0000\u0000\u043f\u0441\u0003"+
		",\u0016\u0000\u0440\u043f\u0001\u0000\u0000\u0000\u0441\u0444\u0001\u0000"+
		"\u0000\u0000\u0442\u0440\u0001\u0000\u0000\u0000\u0442\u0443\u0001\u0000"+
		"\u0000\u0000\u0443\u0445\u0001\u0000\u0000\u0000\u0444\u0442\u0001\u0000"+
		"\u0000\u0000\u0445\u0446\u00059\u0000\u0000\u0446\u0447\u0005G\u0000\u0000"+
		"\u0447\u0449\u0001\u0000\u0000\u0000\u0448\u0428\u0001\u0000\u0000\u0000"+
		"\u0448\u0434\u0001\u0000\u0000\u0000\u0449\u00a5\u0001\u0000\u0000\u0000"+
		"x\u00a9\u00b0\u00b9\u00ca\u00d1\u00d5\u00e5\u00eb\u00ff\u0106\u010e\u0113"+
		"\u011a\u0121\u0123\u0128\u012d\u0131\u0138\u0153\u0171\u0176\u017d\u0181"+
		"\u0183\u018f\u0192\u01a9\u01ae\u01b3\u01bb\u01cc\u01d0\u01d6\u01db\u01df"+
		"\u01e4\u01e7\u01eb\u01f5\u01f9\u0201\u0208\u020c\u0213\u0221\u0224\u0227"+
		"\u022e\u0235\u0238\u023e\u024f\u025c\u0262\u0264\u0267\u026e\u0277\u027b"+
		"\u0282\u0289\u028b\u029b\u029e\u02a5\u02ab\u02b4\u02be\u02d3\u02dd\u02e7"+
		"\u0300\u0309\u030e\u0311\u0319\u0328\u032e\u033e\u0346\u0349\u034e\u0355"+
		"\u035b\u0361\u0367\u036e\u037e\u0386\u038c\u0396\u039c\u03a6\u03ab\u03b0"+
		"\u03b9\u03bf\u03c1\u03c6\u03cb\u03d2\u03e5\u03e7\u03ee\u03f3\u03f9\u0404"+
		"\u040d\u0412\u0417\u041a\u041f\u0422\u0426\u042e\u0437\u043b\u0442\u0448";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}