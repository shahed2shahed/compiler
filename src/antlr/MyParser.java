// Generated from C:/Users/ASUS/IdeaProjects/CompilerProjectFinal/src/antlr/MyParser.g4 by ANTLR 4.13.2
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
		IMPLEMENTS=10, IF=11, ELSE=12, RETURN=13, AS=14, AT=15, COMPONENT=16, 
		SELECTOR=17, STANDALONE=18, IMPORTS=19, TEMPLATE=20, EXPORT=21, EXPORTS=22, 
		INTERFACE=23, NGMODULE=24, INJECTABLE=25, CLASS=26, TRY=27, CATCH=28, 
		CONSOLE=29, ERROR=30, LOG=31, ANY=32, NUMBER=33, STRING_EX=34, VOID=35, 
		NULL=36, TOSTRING=37, NgFor=38, NgIf=39, BIT_OR=40, AND=41, OR=42, NOT=43, 
		EQUAL_EQUAL=44, EQUALTHIRD=45, NOT_EQUAL=46, NOT_EQUAL_EQUAL=47, LT_EQUAL=48, 
		GT_EQUAL=49, SQUARE_OPEN_BRACKET=50, SQUARE_CLOSE_BRACKET=51, OPEN_BRACKET=52, 
		CLOSE_BRACKET=53, CURLY_OPEN_BRACKET=54, CURLY_CLOSE_BRACKET=55, ARROW=56, 
		LT=57, GT=58, SLASH=59, DQUOT=60, QUOT=61, STRING=62, NUMBER_VAL=63, BOOLEAN=64, 
		AccessModifiers=65, BEHAVIORSUBJECT=66, SEMI_COLON=67, COMMA=68, COLON=69, 
		DOT=70, QUESTION_MARK=71, HASH_TAG=72, EQUAL=73, PLUS=74, MIN=75, MULT=76, 
		S_DOlOR=77, WS=78, NEWLINE=79, MultiLineComment=80, SingleLineComment=81, 
		IDENTIFIER=82, WS1=83, EQUAL1=84, DQUOT1=85, LET1=86, OF1=87, ID1=88, 
		DQUOT2=89, WS2=90, NUMBER_VAL1=91, EQUAL2=92, NULL1=93, DQUOT3=94, BIT_OR1=95, 
		AND1=96, OR1=97, NOT1=98, EQUAL_EQUAL1=99, EQUAL_EQUAL2=100, NOT_EQUAL1=101, 
		NOT_EQUAL2=102, LT_EQUAL1=103, GT_EQUAL1=104, PLUS1=105, MIN1=106, MULT1=107, 
		COMMA1=108, COLON1=109, DOT1=110, QUESTION_MARK1=111, ARROW1=112, LT1=113, 
		GT1=114, SQUARE_OPEN_BRACKET1=115, SQUARE_CLOSE_BRACKET1=116, OPEN_BRACKET1=117, 
		CLOSE_BRACKET1=118, CURLY_OPEN_BRACKET1=119, CURLY_CLOSE_BRACKET1=120, 
		ID2=121, DQUOT4=122, WS3=123, CLOSE_BRACKET2=124, NUMBER_VAL2=125, EQUAL3=126, 
		NOT2=127, PLUS2=128, MIN2=129, MULT2=130, DOT3=131, DQUOT5=132, ID3=133, 
		OPEN_BRACKET2=134, DQUOT6=135;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importStatment = 2, RULE_module = 3, 
		RULE_componentDeclaration = 4, RULE_componentBody = 5, RULE_selectorProperty = 6, 
		RULE_standaloneProperty = 7, RULE_propertyStat = 8, RULE_importsProperty = 9, 
		RULE_exportsProperty = 10, RULE_bootstrapProperty = 11, RULE_templateProperty = 12, 
		RULE_componentEle = 13, RULE_classType = 14, RULE_classRelation = 15, 
		RULE_classStatment = 16, RULE_types = 17, RULE_brackets = 18, RULE_stateManagement = 19, 
		RULE_body = 20, RULE_print_error = 21, RULE_print_stat = 22, RULE_functionCall = 23, 
		RULE_argumentList = 24, RULE_conditions = 25, RULE_returnType = 26, RULE_returnStat = 27, 
		RULE_objectLiteral = 28, RULE_objectProperty = 29, RULE_propertyAccess = 30, 
		RULE_functionDeclarationStat = 31, RULE_normalfunctionDecl = 32, RULE_functionDeclaration = 33, 
		RULE_parametersType = 34, RULE_parametersContent = 35, RULE_parameters = 36, 
		RULE_values = 37, RULE_operations = 38, RULE_subDotAssignment = 39, RULE_assignment = 40, 
		RULE_templateExpression = 41, RULE_eventBinding = 42, RULE_htmlDeclare = 43, 
		RULE_normalHtmlTag = 44, RULE_selfClosingTag = 45, RULE_openTag = 46, 
		RULE_closeTag = 47, RULE_simpleArray = 48, RULE_map = 49, RULE_type = 50, 
		RULE_primitiveType = 51, RULE_arrayStringType = 52, RULE_arrayNumberType = 53, 
		RULE_tupleType = 54, RULE_marks = 55, RULE_arrayDeclaration = 56, RULE_conditionStat = 57, 
		RULE_tryStat = 58, RULE_catchStat = 59, RULE_operationExpr = 60, RULE_questionCondition = 61, 
		RULE_expression = 62, RULE_directivesStatment = 63, RULE_ngForValue = 64, 
		RULE_ngForExpression = 65, RULE_ngIfValue = 66, RULE_conditionExpression = 67, 
		RULE_equalOperation = 68, RULE_logicalTerm = 69, RULE_ifStat = 70, RULE_ifElseStat = 71, 
		RULE_variable_type = 72, RULE_unionType = 73, RULE_newObjectFromClass = 74, 
		RULE_toString = 75, RULE_variableDeclarationStat = 76, RULE_variableDeclaration = 77, 
		RULE_arrowFunction = 78;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStatment", "module", "componentDeclaration", 
			"componentBody", "selectorProperty", "standaloneProperty", "propertyStat", 
			"importsProperty", "exportsProperty", "bootstrapProperty", "templateProperty", 
			"componentEle", "classType", "classRelation", "classStatment", "types", 
			"brackets", "stateManagement", "body", "print_error", "print_stat", "functionCall", 
			"argumentList", "conditions", "returnType", "returnStat", "objectLiteral", 
			"objectProperty", "propertyAccess", "functionDeclarationStat", "normalfunctionDecl", 
			"functionDeclaration", "parametersType", "parametersContent", "parameters", 
			"values", "operations", "subDotAssignment", "assignment", "templateExpression", 
			"eventBinding", "htmlDeclare", "normalHtmlTag", "selfClosingTag", "openTag", 
			"closeTag", "simpleArray", "map", "type", "primitiveType", "arrayStringType", 
			"arrayNumberType", "tupleType", "marks", "arrayDeclaration", "conditionStat", 
			"tryStat", "catchStat", "operationExpr", "questionCondition", "expression", 
			"directivesStatment", "ngForValue", "ngForExpression", "ngIfValue", "conditionExpression", 
			"equalOperation", "logicalTerm", "ifStat", "ifElseStat", "variable_type", 
			"unionType", "newObjectFromClass", "toString", "variableDeclarationStat", 
			"variableDeclaration", "arrowFunction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'click'", "'from'", null, "'var'", "'const'", null, 
			"'Array'", "'function'", "'implements'", "'if'", "'else'", "'return'", 
			"'as'", "'@'", "'@Component'", "'selector'", "'standalone'", "'imports'", 
			"'template'", "'export'", "'exports'", "'interface'", "'@NgModule'", 
			"'@Injectable'", "'class'", "'try'", "'catch'", "'console'", "'error'", 
			"'log'", "'any'", "'number'", "'string'", "'void'", null, "'toISOString'", 
			"'*ngFor'", "'*ngIf'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'/'", 
			null, "'`'", null, null, null, "'private'", "'BehaviorSubject'", "';'", 
			null, null, null, null, "'#'", null, null, null, null, "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "CLICK", "FROM", "LET", "VAR", "CONST", "OF", "ARRAY", 
			"FUNCTION", "IMPLEMENTS", "IF", "ELSE", "RETURN", "AS", "AT", "COMPONENT", 
			"SELECTOR", "STANDALONE", "IMPORTS", "TEMPLATE", "EXPORT", "EXPORTS", 
			"INTERFACE", "NGMODULE", "INJECTABLE", "CLASS", "TRY", "CATCH", "CONSOLE", 
			"ERROR", "LOG", "ANY", "NUMBER", "STRING_EX", "VOID", "NULL", "TOSTRING", 
			"NgFor", "NgIf", "BIT_OR", "AND", "OR", "NOT", "EQUAL_EQUAL", "EQUALTHIRD", 
			"NOT_EQUAL", "NOT_EQUAL_EQUAL", "LT_EQUAL", "GT_EQUAL", "SQUARE_OPEN_BRACKET", 
			"SQUARE_CLOSE_BRACKET", "OPEN_BRACKET", "CLOSE_BRACKET", "CURLY_OPEN_BRACKET", 
			"CURLY_CLOSE_BRACKET", "ARROW", "LT", "GT", "SLASH", "DQUOT", "QUOT", 
			"STRING", "NUMBER_VAL", "BOOLEAN", "AccessModifiers", "BEHAVIORSUBJECT", 
			"SEMI_COLON", "COMMA", "COLON", "DOT", "QUESTION_MARK", "HASH_TAG", "EQUAL", 
			"PLUS", "MIN", "MULT", "S_DOlOR", "WS", "NEWLINE", "MultiLineComment", 
			"SingleLineComment", "IDENTIFIER", "WS1", "EQUAL1", "DQUOT1", "LET1", 
			"OF1", "ID1", "DQUOT2", "WS2", "NUMBER_VAL1", "EQUAL2", "NULL1", "DQUOT3", 
			"BIT_OR1", "AND1", "OR1", "NOT1", "EQUAL_EQUAL1", "EQUAL_EQUAL2", "NOT_EQUAL1", 
			"NOT_EQUAL2", "LT_EQUAL1", "GT_EQUAL1", "PLUS1", "MIN1", "MULT1", "COMMA1", 
			"COLON1", "DOT1", "QUESTION_MARK1", "ARROW1", "LT1", "GT1", "SQUARE_OPEN_BRACKET1", 
			"SQUARE_CLOSE_BRACKET1", "OPEN_BRACKET1", "CLOSE_BRACKET1", "CURLY_OPEN_BRACKET1", 
			"CURLY_CLOSE_BRACKET1", "ID2", "DQUOT4", "WS3", "CLOSE_BRACKET2", "NUMBER_VAL2", 
			"EQUAL3", "NOT2", "PLUS2", "MIN2", "MULT2", "DOT3", "DQUOT5", "ID3", 
			"OPEN_BRACKET2", "DQUOT6"
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
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52494338L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(158);
				statement();
				}
				}
				setState(163);
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
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				importStatment();
				}
				break;
			case COMPONENT:
			case NGMODULE:
			case INJECTABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				componentDeclaration();
				}
				break;
			case EXPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				classStatment();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
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
			setState(170);
			match(IMPORT);
			setState(171);
			match(CURLY_OPEN_BRACKET);
			setState(172);
			_la = _input.LA(1);
			if ( !(_la==BEHAVIORSUBJECT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(173);
				match(COMMA);
				setState(174);
				match(IDENTIFIER);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(CURLY_CLOSE_BRACKET);
			setState(181);
			match(FROM);
			setState(182);
			match(STRING);
			setState(183);
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
			setState(185);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 50397184L) != 0)) ) {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			module();
			setState(188);
			match(OPEN_BRACKET);
			setState(189);
			match(CURLY_OPEN_BRACKET);
			setState(190);
			componentBody();
			setState(191);
			match(CURLY_CLOSE_BRACKET);
			setState(192);
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
			setState(194);
			componentEle();
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					match(COMMA);
					setState(196);
					componentEle();
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(202);
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
			setState(205);
			match(SELECTOR);
			setState(206);
			match(COLON);
			setState(207);
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
			setState(209);
			match(STANDALONE);
			setState(210);
			match(COLON);
			setState(211);
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
	public static class PropertyStatContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(MyParser.SQUARE_OPEN_BRACKET, 0); }
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(MyParser.SQUARE_CLOSE_BRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 16, RULE_propertyStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(COLON);
			setState(214);
			match(SQUARE_OPEN_BRACKET);
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(215);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(216);
				functionCall();
				}
				break;
			}
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(219);
				match(COMMA);
				setState(220);
				match(IDENTIFIER);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
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
		enterRule(_localctx, 18, RULE_importsProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(IMPORTS);
			setState(229);
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
		enterRule(_localctx, 20, RULE_exportsProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(EXPORTS);
			setState(232);
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
		enterRule(_localctx, 22, RULE_bootstrapProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(IDENTIFIER);
			setState(235);
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
		enterRule(_localctx, 24, RULE_templateProperty);
		int _la;
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE:
				_localctx = new TemplateHtmlDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(TEMPLATE);
				setState(238);
				match(COLON);
				setState(239);
				match(QUOT);
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(240);
					htmlDeclare();
					}
					}
					setState(243); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LT );
				setState(245);
				match(QUOT);
				}
				break;
			case IDENTIFIER:
				_localctx = new TemplateHtmlUrlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(IDENTIFIER);
				setState(248);
				match(COLON);
				setState(249);
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
		enterRule(_localctx, 26, RULE_componentEle);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				selectorProperty();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				standaloneProperty();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				importsProperty();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				exportsProperty();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				bootstrapProperty();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
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
		enterRule(_localctx, 28, RULE_classType);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPLEMENTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(IMPLEMENTS);
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(INTERFACE);
				}
				break;
			case LET:
			case VAR:
			case CONST:
			case AccessModifiers:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
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
		enterRule(_localctx, 30, RULE_classRelation);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				_localctx = new CommonRelationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(CLASS);
				setState(266);
				match(IDENTIFIER);
				setState(270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(267);
					classType();
					setState(268);
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
				setState(272);
				classType();
				setState(273);
				match(IDENTIFIER);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(274);
					match(COLON);
					setState(275);
					match(IDENTIFIER);
					setState(276);
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
		enterRule(_localctx, 32, RULE_classStatment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(EXPORT);
			setState(282);
			classRelation();
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(283);
				match(CURLY_OPEN_BRACKET);
				}
				break;
			}
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286);
					body();
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLY_CLOSE_BRACKET) {
				{
				setState(292);
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
		enterRule(_localctx, 34, RULE_types);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				marks();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				eventBinding();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(299);
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
		enterRule(_localctx, 36, RULE_brackets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(OPEN_BRACKET);
			setState(303);
			match(SQUARE_OPEN_BRACKET);
			setState(304);
			match(SQUARE_CLOSE_BRACKET);
			setState(305);
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
		enterRule(_localctx, 38, RULE_stateManagement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			variable_type();
			setState(308);
			match(IDENTIFIER);
			setState(309);
			match(S_DOlOR);
			setState(310);
			match(EQUAL);
			setState(311);
			match(IDENTIFIER);
			setState(312);
			match(BEHAVIORSUBJECT);
			setState(313);
			match(LT);
			setState(314);
			simpleArray();
			setState(315);
			match(GT);
			setState(316);
			brackets();
			setState(317);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 40, RULE_body);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				print_stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				print_error();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				stateManagement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(324);
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
		enterRule(_localctx, 42, RULE_print_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(CONSOLE);
			setState(328);
			match(DOT);
			setState(329);
			match(ERROR);
			setState(330);
			match(OPEN_BRACKET);
			setState(331);
			values();
			setState(332);
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
		enterRule(_localctx, 44, RULE_print_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(CONSOLE);
			setState(335);
			match(DOT);
			setState(336);
			match(LOG);
			setState(337);
			match(OPEN_BRACKET);
			setState(338);
			values();
			setState(339);
			match(CLOSE_BRACKET);
			setState(340);
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
		enterRule(_localctx, 46, RULE_functionCall);
		int _la;
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new CallFunctionParaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(IDENTIFIER);
				setState(343);
				parameters();
				setState(344);
				match(DOT);
				setState(345);
				match(CATCH);
				setState(346);
				match(OPEN_BRACKET);
				setState(347);
				parameters();
				setState(348);
				match(ARROW);
				setState(349);
				print_error();
				setState(350);
				match(CLOSE_BRACKET);
				setState(351);
				match(SEMI_COLON);
				}
				break;
			case 2:
				_localctx = new MethodCallWithValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				propertyAccess();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(354);
					match(IDENTIFIER);
					}
				}

				setState(357);
				parameters();
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(358);
					match(AS);
					setState(359);
					simpleArray();
					}
				}

				setState(362);
				match(SEMI_COLON);
				}
				break;
			case 3:
				_localctx = new MethodCallWithListValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				propertyAccess();
				setState(365);
				match(OPEN_BRACKET);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4592544894974687120L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 262147L) != 0)) {
					{
					setState(366);
					argumentList();
					}
				}

				setState(369);
				match(CLOSE_BRACKET);
				setState(371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(370);
					match(SEMI_COLON);
					}
					break;
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
		enterRule(_localctx, 48, RULE_argumentList);
		int _la;
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ObjectLiteralArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				objectLiteral();
				}
				break;
			case 2:
				_localctx = new WithObjectPropertyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(SQUARE_OPEN_BRACKET);
				setState(377);
				objectProperty();
				setState(378);
				match(SQUARE_CLOSE_BRACKET);
				}
				break;
			case 3:
				_localctx = new WithExpressionArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				expression();
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(381);
					match(COMMA);
					setState(382);
					expression();
					}
					}
					setState(387);
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
		enterRule(_localctx, 50, RULE_conditions);
		int _la;
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new ConditionEqualtyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				propertyAccess();
				setState(391);
				match(OPEN_BRACKET);
				setState(392);
				match(IDENTIFIER);
				setState(393);
				match(ARROW);
				setState(394);
				propertyAccess();
				setState(395);
				_la = _input.LA(1);
				if ( !(_la==EQUALTHIRD || _la==NOT_EQUAL_EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(396);
				propertyAccess();
				setState(397);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				_localctx = new ConditionValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				propertyAccess();
				setState(400);
				match(OPEN_BRACKET);
				setState(401);
				parameters();
				setState(402);
				match(ARROW);
				setState(403);
				propertyAccess();
				setState(404);
				parameters();
				setState(405);
				match(COMMA);
				setState(406);
				match(NUMBER_VAL);
				setState(407);
				match(CLOSE_BRACKET);
				setState(408);
				operations();
				setState(409);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 52, RULE_returnType);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				argumentList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				conditions();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(416);
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
		enterRule(_localctx, 54, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(RETURN);
			setState(420);
			returnType();
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(421);
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
		enterRule(_localctx, 56, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(CURLY_OPEN_BRACKET);
			setState(425);
			objectProperty();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(426);
				match(COMMA);
				setState(427);
				objectProperty();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
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
		enterRule(_localctx, 58, RULE_objectProperty);
		int _la;
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new IdentifierObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(IDENTIFIER);
				setState(436);
				match(COLON);
				setState(437);
				expression();
				}
				break;
			case 2:
				_localctx = new ImportsObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(IMPORTS);
				setState(439);
				match(COLON);
				setState(440);
				expression();
				}
				break;
			case 3:
				_localctx = new ExportsObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				match(EXPORTS);
				setState(442);
				match(COLON);
				setState(443);
				expression();
				}
				break;
			case 4:
				_localctx = new DotPropertyAccessObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(444);
					match(DOT);
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(450);
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
		enterRule(_localctx, 60, RULE_propertyAccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(IDENTIFIER);
			setState(466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(454);
					match(DOT);
					setState(455);
					match(IDENTIFIER);
					setState(457);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(456);
						match(S_DOlOR);
						}
						break;
					}
					setState(462);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(459);
						match(SQUARE_OPEN_BRACKET);
						setState(460);
						match(IDENTIFIER);
						setState(461);
						match(SQUARE_CLOSE_BRACKET);
						}
						break;
					}
					}
					} 
				}
				setState(468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 62, RULE_functionDeclarationStat);
		int _la;
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
			case CURLY_OPEN_BRACKET:
			case COLON:
			case EQUAL:
				_localctx = new SimpleDecStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(469);
					match(EQUAL);
					setState(470);
					match(FUNCTION);
					}
				}

				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(473);
					parameters();
					}
				}

				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(476);
					match(COLON);
					setState(477);
					unionType();
					}
				}

				}
				break;
			case S_DOlOR:
				_localctx = new SimpleArrayDecStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(S_DOlOR);
				setState(481);
				parameters();
				setState(482);
				match(COLON);
				setState(483);
				match(IDENTIFIER);
				setState(484);
				match(LT);
				setState(485);
				simpleArray();
				setState(486);
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
		enterRule(_localctx, 64, RULE_normalfunctionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				setState(490);
				match(FUNCTION);
				}
				break;
			case LET:
			case VAR:
			case CONST:
			case AccessModifiers:
				{
				setState(491);
				variable_type();
				}
				break;
			case IDENTIFIER:
				break;
			default:
				break;
			}
			setState(494);
			match(IDENTIFIER);
			setState(495);
			functionDeclarationStat();
			setState(496);
			match(CURLY_OPEN_BRACKET);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4592544894437807504L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 262147L) != 0)) {
				{
				{
				setState(497);
				body();
				}
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(503);
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
		enterRule(_localctx, 66, RULE_functionDeclaration);
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				normalfunctionDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
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
		enterRule(_localctx, 68, RULE_parametersType);
		int _la;
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_BRACKET:
			case AccessModifiers:
			case COMMA:
			case IDENTIFIER:
				_localctx = new ParaWithTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(509);
					match(COMMA);
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AccessModifiers) {
						{
						setState(510);
						match(AccessModifiers);
						}
					}

					setState(513);
					match(IDENTIFIER);
					setState(514);
					match(COLON);
					setState(515);
					type();
					}
					}
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EQUAL:
				_localctx = new ParaValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				match(EQUAL);
				setState(522);
				values();
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(523);
					match(COMMA);
					setState(524);
					match(IDENTIFIER);
					setState(525);
					match(COLON);
					setState(526);
					type();
					setState(527);
					match(EQUAL);
					setState(528);
					values();
					}
					}
					setState(534);
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
		enterRule(_localctx, 70, RULE_parametersContent);
		int _la;
		try {
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new ParaHasAccessModifiersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AccessModifiers) {
					{
					setState(537);
					match(AccessModifiers);
					}
				}

				setState(540);
				match(IDENTIFIER);
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(541);
					match(COLON);
					setState(542);
					type();
					setState(543);
					parametersType();
					}
				}

				}
				break;
			case 2:
				_localctx = new ParaHasPropertyAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				propertyAccess();
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(548);
					match(COMMA);
					setState(549);
					propertyAccess();
					}
					}
					setState(554);
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
		enterRule(_localctx, 72, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(OPEN_BRACKET);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AccessModifiers || _la==IDENTIFIER) {
				{
				{
				setState(558);
				parametersContent();
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(564);
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
		enterRule(_localctx, 74, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 1048583L) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 7L) != 0)) ) {
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
		enterRule(_localctx, 78, RULE_subDotAssignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(570);
					match(QUESTION_MARK);
					setState(571);
					match(DOT);
					setState(572);
					match(SQUARE_OPEN_BRACKET);
					setState(573);
					values();
					setState(574);
					match(SQUARE_CLOSE_BRACKET);
					}
					} 
				}
				setState(580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_assignment, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(582);
				match(IDENTIFIER);
				setState(583);
				match(EQUAL);
				setState(584);
				expression();
				setState(585);
				match(SEMI_COLON);
				}
				break;
			case 2:
				{
				_localctx = new DotAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(587);
				propertyAccess();
				setState(588);
				subDotAssignment();
				setState(599);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(589);
					match(EQUAL);
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(590);
						match(NOT);
						}
					}

					setState(593);
					type();
					setState(597);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						setState(594);
						operations();
						setState(595);
						values();
						}
						break;
					}
					}
					break;
				}
				setState(602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(601);
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
				setState(604);
				propertyAccess();
				setState(605);
				match(EQUAL);
				setState(606);
				objectLiteral();
				setState(607);
				match(SEMI_COLON);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AssignmentStatementContext(new AssignmentContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_assignment);
					setState(611);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(612);
					match(EQUAL);
					setState(613);
					assignment(0);
					setState(618);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						setState(614);
						match(AS);
						setState(615);
						primitiveType();
						setState(616);
						match(SEMI_COLON);
						}
						break;
					}
					}
					} 
				}
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		public List<TerminalNode> CURLY_OPEN_BRACKET() { return getTokens(MyParser.CURLY_OPEN_BRACKET); }
		public TerminalNode CURLY_OPEN_BRACKET(int i) {
			return getToken(MyParser.CURLY_OPEN_BRACKET, i);
		}
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public TerminalNode BIT_OR() { return getToken(MyParser.BIT_OR, 0); }
		public List<TerminalNode> CURLY_CLOSE_BRACKET() { return getTokens(MyParser.CURLY_CLOSE_BRACKET); }
		public TerminalNode CURLY_CLOSE_BRACKET(int i) {
			return getToken(MyParser.CURLY_CLOSE_BRACKET, i);
		}
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
		enterRule(_localctx, 82, RULE_templateExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(626); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(625);
					match(CURLY_OPEN_BRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(628); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(630);
					types();
					}
					} 
				}
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIT_OR) {
				{
				setState(636);
				match(BIT_OR);
				setState(638); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(637);
						types();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(640); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(645); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(644);
					match(CURLY_CLOSE_BRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(647); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 84, RULE_eventBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(OPEN_BRACKET);
			setState(650);
			match(CLICK);
			setState(651);
			match(CLOSE_BRACKET2);
			setState(652);
			match(EQUAL3);
			setState(653);
			match(DQUOT5);
			setState(654);
			match(ID3);
			setState(655);
			match(OPEN_BRACKET2);
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID3) {
				{
				setState(656);
				match(ID3);
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT3) {
					{
					{
					setState(657);
					match(DOT3);
					setState(658);
					match(ID3);
					}
					}
					setState(663);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(666);
			match(CLOSE_BRACKET2);
			setState(667);
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
		enterRule(_localctx, 86, RULE_htmlDeclare);
		try {
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				normalHtmlTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
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
		enterRule(_localctx, 88, RULE_normalHtmlTag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			openTag();
			setState(677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(674);
					types();
					}
					} 
				}
				setState(679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(680);
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
		enterRule(_localctx, 90, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(LT);
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4108399005728241296L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 278523L) != 0)) {
				{
				{
				setState(683);
				types();
				}
				}
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(689);
			match(SLASH);
			setState(690);
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
		enterRule(_localctx, 92, RULE_openTag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(LT);
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
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
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(699);
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
		enterRule(_localctx, 94, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(LT);
			setState(702);
			match(SLASH);
			setState(703);
			match(IDENTIFIER);
			setState(704);
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
		enterRule(_localctx, 96, RULE_simpleArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(IDENTIFIER);
			setState(707);
			match(SQUARE_OPEN_BRACKET);
			setState(708);
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
		enterRule(_localctx, 98, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(IDENTIFIER);
			setState(711);
			match(LT);
			setState(712);
			values();
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(713);
				match(COMMA);
				setState(714);
				values();
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(720);
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
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
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
		enterRule(_localctx, 100, RULE_type);
		try {
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				arrayStringType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(724);
				simpleArray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(725);
				map();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(726);
				arrayNumberType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(727);
				tupleType();
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
		enterRule(_localctx, 102, RULE_primitiveType);
		try {
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				_localctx = new NumberPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				match(NUMBER);
				}
				break;
			case VOID:
				_localctx = new VoidPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(732);
				match(VOID);
				}
				break;
			case NULL:
				_localctx = new NullPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(733);
				match(NULL);
				}
				break;
			case ANY:
				_localctx = new AnyPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(734);
				match(ANY);
				}
				break;
			case STRING_EX:
				_localctx = new StringEXPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(735);
				match(STRING_EX);
				}
				break;
			case CLASS:
				_localctx = new ClassPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(736);
				match(CLASS);
				}
				break;
			case CURLY_OPEN_BRACKET:
				_localctx = new TemplateExPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(737);
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
		enterRule(_localctx, 104, RULE_arrayStringType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(ARRAY);
			setState(741);
			match(LT);
			setState(742);
			match(STRING_EX);
			setState(743);
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
		enterRule(_localctx, 106, RULE_arrayNumberType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(NUMBER);
			setState(746);
			match(SQUARE_OPEN_BRACKET);
			setState(747);
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
	public static class TupleTypeContext extends ParserRuleContext {
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(MyParser.SQUARE_OPEN_BRACKET, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(MyParser.SQUARE_CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTupleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitTupleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_tupleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(SQUARE_OPEN_BRACKET);
			setState(750);
			type();
			setState(753); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(751);
				match(COMMA);
				setState(752);
				type();
				}
				}
				setState(755); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(757);
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
		enterRule(_localctx, 110, RULE_marks);
		try {
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI_COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				match(SEMI_COLON);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				match(COMMA);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(761);
				match(COLON);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(762);
				match(DOT);
				}
				break;
			case QUESTION_MARK:
				enterOuterAlt(_localctx, 5);
				{
				setState(763);
				match(QUESTION_MARK);
				}
				break;
			case HASH_TAG:
				enterOuterAlt(_localctx, 6);
				{
				setState(764);
				match(HASH_TAG);
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(765);
				match(EQUAL);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 8);
				{
				setState(766);
				match(LT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 9);
				{
				setState(767);
				match(GT);
				}
				break;
			case PLUS:
			case MIN:
			case MULT:
				enterOuterAlt(_localctx, 10);
				{
				setState(768);
				operations();
				}
				break;
			case S_DOlOR:
				enterOuterAlt(_localctx, 11);
				{
				setState(769);
				match(S_DOlOR);
				}
				break;
			case SQUARE_OPEN_BRACKET:
				enterOuterAlt(_localctx, 12);
				{
				setState(770);
				match(SQUARE_OPEN_BRACKET);
				}
				break;
			case SQUARE_CLOSE_BRACKET:
				enterOuterAlt(_localctx, 13);
				{
				setState(771);
				match(SQUARE_CLOSE_BRACKET);
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 14);
				{
				setState(772);
				match(OPEN_BRACKET);
				}
				break;
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 15);
				{
				setState(773);
				match(CLOSE_BRACKET);
				}
				break;
			case CURLY_OPEN_BRACKET:
				enterOuterAlt(_localctx, 16);
				{
				setState(774);
				match(CURLY_OPEN_BRACKET);
				}
				break;
			case CURLY_CLOSE_BRACKET:
				enterOuterAlt(_localctx, 17);
				{
				setState(775);
				match(CURLY_CLOSE_BRACKET);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 18);
				{
				setState(776);
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
		enterRule(_localctx, 112, RULE_arrayDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(SQUARE_OPEN_BRACKET);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4592544894974687120L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 262147L) != 0)) {
				{
				setState(780);
				expression();
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(781);
					match(COMMA);
					setState(782);
					expression();
					setState(786);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(783);
							match(COMMA);
							}
							} 
						}
						setState(788);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
					}
					}
					}
					setState(793);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(796);
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
		enterRule(_localctx, 114, RULE_conditionStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(CURLY_OPEN_BRACKET);
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4592544894974687120L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 262147L) != 0)) {
				{
				{
				setState(799);
				expression();
				}
				}
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(805);
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
		enterRule(_localctx, 116, RULE_tryStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(TRY);
			setState(808);
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
		enterRule(_localctx, 118, RULE_catchStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(CATCH);
			setState(811);
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
		enterRule(_localctx, 120, RULE_operationExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			values();
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(814);
				operations();
				setState(815);
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
		enterRule(_localctx, 122, RULE_questionCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			propertyAccess();
			setState(821); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(820);
				match(QUESTION_MARK);
				}
				}
				setState(823); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==QUESTION_MARK );
			setState(825);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
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
		public DirectivesStatmentContext directivesStatment() {
			return getRuleContext(DirectivesStatmentContext.class,0);
		}
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 124, RULE_expression);
		try {
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				values();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				arrayDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(829);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(830);
				ifElseStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(831);
				tryStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(832);
				catchStat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(833);
				objectLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(834);
				directivesStatment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(835);
				propertyAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(836);
				functionCall();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(837);
				assignment(0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(838);
				questionCondition();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(839);
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
		enterRule(_localctx, 126, RULE_directivesStatment);
		try {
			setState(848);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NgFor:
				_localctx = new NgForDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				match(NgFor);
				setState(843);
				match(EQUAL1);
				setState(844);
				ngForValue();
				}
				break;
			case NgIf:
				_localctx = new NgIfDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				match(NgIf);
				setState(846);
				match(EQUAL2);
				setState(847);
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
		enterRule(_localctx, 128, RULE_ngForValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(DQUOT1);
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET1) {
				{
				{
				setState(851);
				ngForExpression();
				}
				}
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(857);
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
		public TerminalNode LET1() { return getToken(MyParser.LET1, 0); }
		public List<TerminalNode> ID1() { return getTokens(MyParser.ID1); }
		public TerminalNode ID1(int i) {
			return getToken(MyParser.ID1, i);
		}
		public TerminalNode OF1() { return getToken(MyParser.OF1, 0); }
		public TerminalNode EQUAL1() { return getToken(MyParser.EQUAL1, 0); }
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
		enterRule(_localctx, 130, RULE_ngForExpression);
		try {
			setState(867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				match(LET1);
				setState(860);
				match(ID1);
				setState(861);
				match(OF1);
				setState(862);
				match(ID1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				match(LET1);
				setState(864);
				match(ID1);
				setState(865);
				match(EQUAL1);
				setState(866);
				match(ID1);
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
		enterRule(_localctx, 132, RULE_ngIfValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(DQUOT3);
			setState(870);
			conditionExpression();
			setState(871);
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
		enterRule(_localctx, 134, RULE_conditionExpression);
		int _la;
		try {
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				_localctx = new EqualNullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				match(ID2);
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 1921L) != 0)) {
					{
					setState(874);
					equalOperation();
					setState(875);
					match(NULL1);
					}
				}

				}
				break;
			case 2:
				_localctx = new ComparisonExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				logicalTerm();
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 4196225L) != 0)) {
					{
					setState(882);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GT1) {
						{
						setState(880);
						match(GT1);
						setState(881);
						match(NUMBER_VAL1);
						}
					}

					setState(884);
					equalOperation();
					setState(885);
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
				setState(889);
				logicalTerm();
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET1) {
					{
					setState(890);
					match(OPEN_BRACKET1);
					setState(891);
					match(ID2);
					setState(892);
					match(ARROW1);
					setState(893);
					logicalTerm();
					setState(896);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GT1) {
						{
						setState(894);
						match(GT1);
						setState(895);
						match(NUMBER_VAL1);
						}
					}

					setState(898);
					equalOperation();
					setState(899);
					match(ID2);
					setState(900);
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
		enterRule(_localctx, 136, RULE_equalOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			_la = _input.LA(1);
			if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 1921L) != 0)) ) {
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
		enterRule(_localctx, 138, RULE_logicalTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT1) {
				{
				setState(908);
				match(NOT1);
				}
			}

			setState(911);
			match(ID2);
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT1) {
				{
				setState(912);
				match(DOT1);
				setState(913);
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
		enterRule(_localctx, 140, RULE_ifStat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(IF);
			setState(917);
			match(OPEN_BRACKET);
			setState(921);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(918);
					types();
					}
					} 
				}
				setState(923);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(924);
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
		enterRule(_localctx, 142, RULE_ifElseStat);
		int _la;
		try {
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				_localctx = new IfQuestionMarkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				match(IDENTIFIER);
				setState(927);
				match(QUESTION_MARK);
				setState(928);
				type();
				setState(929);
				match(COLON);
				setState(930);
				type();
				}
				break;
			case 2:
				_localctx = new IfReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				ifStat();
				setState(933);
				match(RETURN);
				setState(934);
				match(SEMI_COLON);
				}
				break;
			case 3:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(936);
				ifStat();
				setState(937);
				conditionStat();
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(938);
					match(ELSE);
					setState(939);
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
		enterRule(_localctx, 144, RULE_variable_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			_la = _input.LA(1);
			if ( !(((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 2305843009213693959L) != 0)) ) {
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
		enterRule(_localctx, 146, RULE_unionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			type();
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIT_OR) {
				{
				setState(947);
				match(BIT_OR);
				setState(948);
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
		public ToStringContext toString() {
			return getRuleContext(ToStringContext.class,0);
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
		enterRule(_localctx, 148, RULE_newObjectFromClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(951);
				match(IDENTIFIER);
				}
				}
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(957);
			parameters();
			setState(960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(958);
				match(DOT);
				setState(959);
				toString();
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
	public static class ToStringContext extends ParserRuleContext {
		public TerminalNode TOSTRING() { return getToken(MyParser.TOSTRING, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ToStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterToString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitToString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitToString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToStringContext toString() throws RecognitionException {
		ToStringContext _localctx = new ToStringContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_toString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(TOSTRING);
			setState(963);
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
		enterRule(_localctx, 152, RULE_variableDeclarationStat);
		int _la;
		try {
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				_localctx = new TypedVariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(965);
				match(COLON);
				setState(966);
				unionType();
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SQUARE_OPEN_BRACKET) {
					{
					{
					setState(967);
					match(SQUARE_OPEN_BRACKET);
					setState(968);
					match(SQUARE_CLOSE_BRACKET);
					}
					}
					setState(973);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(974);
				match(EQUAL);
				setState(975);
				types();
				}
				break;
			case 2:
				_localctx = new InferredVariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(977);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(980);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(978);
					types();
					}
					break;
				case 2:
					{
					setState(979);
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
				setState(982);
				match(EQUAL);
				setState(983);
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
		enterRule(_localctx, 154, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 2305843009213693959L) != 0)) {
				{
				setState(986);
				variable_type();
				}
			}

			setState(990); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(989);
				propertyAccess();
				}
				}
				setState(992); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION_MARK) {
				{
				setState(994);
				match(QUESTION_MARK);
				}
			}

			setState(997);
			variableDeclarationStat();
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(998);
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
		enterRule(_localctx, 156, RULE_arrowFunction);
		int _la;
		try {
			setState(1033);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case VAR:
			case CONST:
			case AccessModifiers:
				_localctx = new VarArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				variable_type();
				setState(1002);
				match(IDENTIFIER);
				setState(1003);
				match(EQUAL);
				setState(1004);
				parameters();
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1005);
					match(COLON);
					setState(1006);
					type();
					}
				}

				setState(1009);
				match(ARROW);
				setState(1010);
				body();
				setState(1011);
				match(SEMI_COLON);
				}
				break;
			case IDENTIFIER:
				_localctx = new EventHandlerArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
				propertyAccess();
				setState(1014);
				match(EQUAL);
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(1015);
					parameters();
					}
				}

				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1018);
					match(COLON);
					setState(1019);
					type();
					}
				}

				setState(1022);
				match(ARROW);
				setState(1023);
				match(CURLY_OPEN_BRACKET);
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4592544894437807504L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 262147L) != 0)) {
					{
					{
					setState(1024);
					body();
					}
					}
					setState(1029);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1030);
				match(CURLY_CLOSE_BRACKET);
				setState(1031);
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
		case 40:
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
		"\u0004\u0001\u0087\u040c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0001\u0000"+
		"\u0005\u0000\u00a0\b\u0000\n\u0000\f\u0000\u00a3\t\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00a9\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00b0\b\u0002\n"+
		"\u0002\f\u0002\u00b3\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00c6\b\u0005\n\u0005\f\u0005\u00c9\t\u0005"+
		"\u0001\u0005\u0003\u0005\u00cc\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00da\b\b\u0001\b\u0001\b\u0005\b\u00de\b\b"+
		"\n\b\f\b\u00e1\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0004\f\u00f2\b\f\u000b\f\f\f\u00f3\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00fb\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0103\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0108"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u010f\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0116\b\u000f\u0003\u000f\u0118\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u011d\b\u0010\u0001\u0010\u0005\u0010"+
		"\u0120\b\u0010\n\u0010\f\u0010\u0123\t\u0010\u0001\u0010\u0003\u0010\u0126"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u012d\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0146\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0164\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0169\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0170\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0174"+
		"\b\u0017\u0003\u0017\u0176\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u0180\b\u0018\n\u0018\f\u0018\u0183\t\u0018\u0003\u0018\u0185\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u019c\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01a2\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u01a7\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u01ad\b\u001c\n\u001c\f\u001c\u01b0"+
		"\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u01be\b\u001d\n\u001d\f\u001d\u01c1\t\u001d\u0001\u001d"+
		"\u0003\u001d\u01c4\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u01ca\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u01cf\b\u001e\u0005\u001e\u01d1\b\u001e\n\u001e\f\u001e\u01d4\t\u001e"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u01d8\b\u001f\u0001\u001f\u0003\u001f"+
		"\u01db\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01df\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u01e9\b\u001f\u0001 \u0001 \u0003 \u01ed"+
		"\b \u0001 \u0001 \u0001 \u0001 \u0005 \u01f3\b \n \f \u01f6\t \u0001 "+
		"\u0001 \u0001!\u0001!\u0003!\u01fc\b!\u0001\"\u0001\"\u0003\"\u0200\b"+
		"\"\u0001\"\u0001\"\u0001\"\u0005\"\u0205\b\"\n\"\f\"\u0208\t\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u0213\b\"\n\"\f\"\u0216\t\"\u0003\"\u0218\b\"\u0001#\u0003#\u021b\b"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0222\b#\u0001#\u0001#\u0001"+
		"#\u0005#\u0227\b#\n#\f#\u022a\t#\u0003#\u022c\b#\u0001$\u0001$\u0005$"+
		"\u0230\b$\n$\f$\u0233\t$\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0241\b\'\n\'\f\'\u0244"+
		"\t\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0003(\u0250\b(\u0001(\u0001(\u0001(\u0001(\u0003(\u0256\b(\u0003(\u0258"+
		"\b(\u0001(\u0003(\u025b\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0262"+
		"\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u026b\b(\u0005"+
		"(\u026d\b(\n(\f(\u0270\t(\u0001)\u0004)\u0273\b)\u000b)\f)\u0274\u0001"+
		")\u0005)\u0278\b)\n)\f)\u027b\t)\u0001)\u0001)\u0004)\u027f\b)\u000b)"+
		"\f)\u0280\u0003)\u0283\b)\u0001)\u0004)\u0286\b)\u000b)\f)\u0287\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005"+
		"*\u0294\b*\n*\f*\u0297\t*\u0003*\u0299\b*\u0001*\u0001*\u0001*\u0001+"+
		"\u0001+\u0003+\u02a0\b+\u0001,\u0001,\u0005,\u02a4\b,\n,\f,\u02a7\t,\u0001"+
		",\u0001,\u0001-\u0001-\u0005-\u02ad\b-\n-\f-\u02b0\t-\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0005.\u02b7\b.\n.\f.\u02ba\t.\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00011\u00011\u0001"+
		"1\u00011\u00011\u00051\u02cc\b1\n1\f1\u02cf\t1\u00011\u00011\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00032\u02d9\b2\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u02e3\b3\u00014\u00014\u00014\u0001"+
		"4\u00014\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u0004"+
		"6\u02f2\b6\u000b6\f6\u02f3\u00016\u00016\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00037\u030a\b7\u00018\u00018\u00018\u00018\u0001"+
		"8\u00058\u0311\b8\n8\f8\u0314\t8\u00058\u0316\b8\n8\f8\u0319\t8\u0003"+
		"8\u031b\b8\u00018\u00018\u00019\u00019\u00059\u0321\b9\n9\f9\u0324\t9"+
		"\u00019\u00019\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0001<\u0003<\u0332\b<\u0001=\u0001=\u0004=\u0336\b=\u000b=\f"+
		"=\u0337\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u0349\b>\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0003?\u0351\b?\u0001@\u0001@\u0005@\u0355"+
		"\b@\n@\f@\u0358\t@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0003A\u0364\bA\u0001B\u0001B\u0001B\u0001B\u0001C\u0001"+
		"C\u0001C\u0001C\u0003C\u036e\bC\u0001C\u0001C\u0001C\u0003C\u0373\bC\u0001"+
		"C\u0001C\u0001C\u0003C\u0378\bC\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0003C\u0381\bC\u0001C\u0001C\u0001C\u0001C\u0003C\u0387\bC\u0003"+
		"C\u0389\bC\u0001D\u0001D\u0001E\u0003E\u038e\bE\u0001E\u0001E\u0001E\u0003"+
		"E\u0393\bE\u0001F\u0001F\u0001F\u0005F\u0398\bF\nF\fF\u039b\tF\u0001F"+
		"\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u03ad\bG\u0003G\u03af\bG\u0001"+
		"H\u0001H\u0001I\u0001I\u0001I\u0003I\u03b6\bI\u0001J\u0005J\u03b9\bJ\n"+
		"J\fJ\u03bc\tJ\u0001J\u0001J\u0001J\u0003J\u03c1\bJ\u0001K\u0001K\u0001"+
		"K\u0001L\u0001L\u0001L\u0001L\u0005L\u03ca\bL\nL\fL\u03cd\tL\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0003L\u03d5\bL\u0001L\u0001L\u0003L\u03d9"+
		"\bL\u0001M\u0003M\u03dc\bM\u0001M\u0004M\u03df\bM\u000bM\fM\u03e0\u0001"+
		"M\u0003M\u03e4\bM\u0001M\u0001M\u0003M\u03e8\bM\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0003N\u03f0\bN\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0003N\u03f9\bN\u0001N\u0001N\u0003N\u03fd\bN\u0001N\u0001N\u0001"+
		"N\u0005N\u0402\bN\nN\fN\u0405\tN\u0001N\u0001N\u0001N\u0003N\u040a\bN"+
		"\u0001N\u0000\u0001PO\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u0000\t\u0002\u0000BBRR\u0002\u0000"+
		"\u0010\u0010\u0018\u0019\u0002\u0000--//\u0002\u0000>@RR\u0001\u0000J"+
		"L\u0002\u0000[[yy\u0002\u0000\\\\cf\u0002\u0000\u0004\u0006AA\u0002\u0000"+
		"EEII\u0469\u0000\u00a1\u0001\u0000\u0000\u0000\u0002\u00a8\u0001\u0000"+
		"\u0000\u0000\u0004\u00aa\u0001\u0000\u0000\u0000\u0006\u00b9\u0001\u0000"+
		"\u0000\u0000\b\u00bb\u0001\u0000\u0000\u0000\n\u00c2\u0001\u0000\u0000"+
		"\u0000\f\u00cd\u0001\u0000\u0000\u0000\u000e\u00d1\u0001\u0000\u0000\u0000"+
		"\u0010\u00d5\u0001\u0000\u0000\u0000\u0012\u00e4\u0001\u0000\u0000\u0000"+
		"\u0014\u00e7\u0001\u0000\u0000\u0000\u0016\u00ea\u0001\u0000\u0000\u0000"+
		"\u0018\u00fa\u0001\u0000\u0000\u0000\u001a\u0102\u0001\u0000\u0000\u0000"+
		"\u001c\u0107\u0001\u0000\u0000\u0000\u001e\u0117\u0001\u0000\u0000\u0000"+
		" \u0119\u0001\u0000\u0000\u0000\"\u012c\u0001\u0000\u0000\u0000$\u012e"+
		"\u0001\u0000\u0000\u0000&\u0133\u0001\u0000\u0000\u0000(\u0145\u0001\u0000"+
		"\u0000\u0000*\u0147\u0001\u0000\u0000\u0000,\u014e\u0001\u0000\u0000\u0000"+
		".\u0175\u0001\u0000\u0000\u00000\u0184\u0001\u0000\u0000\u00002\u019b"+
		"\u0001\u0000\u0000\u00004\u01a1\u0001\u0000\u0000\u00006\u01a3\u0001\u0000"+
		"\u0000\u00008\u01a8\u0001\u0000\u0000\u0000:\u01c3\u0001\u0000\u0000\u0000"+
		"<\u01c5\u0001\u0000\u0000\u0000>\u01e8\u0001\u0000\u0000\u0000@\u01ec"+
		"\u0001\u0000\u0000\u0000B\u01fb\u0001\u0000\u0000\u0000D\u0217\u0001\u0000"+
		"\u0000\u0000F\u022b\u0001\u0000\u0000\u0000H\u022d\u0001\u0000\u0000\u0000"+
		"J\u0236\u0001\u0000\u0000\u0000L\u0238\u0001\u0000\u0000\u0000N\u0242"+
		"\u0001\u0000\u0000\u0000P\u0261\u0001\u0000\u0000\u0000R\u0272\u0001\u0000"+
		"\u0000\u0000T\u0289\u0001\u0000\u0000\u0000V\u029f\u0001\u0000\u0000\u0000"+
		"X\u02a1\u0001\u0000\u0000\u0000Z\u02aa\u0001\u0000\u0000\u0000\\\u02b4"+
		"\u0001\u0000\u0000\u0000^\u02bd\u0001\u0000\u0000\u0000`\u02c2\u0001\u0000"+
		"\u0000\u0000b\u02c6\u0001\u0000\u0000\u0000d\u02d8\u0001\u0000\u0000\u0000"+
		"f\u02e2\u0001\u0000\u0000\u0000h\u02e4\u0001\u0000\u0000\u0000j\u02e9"+
		"\u0001\u0000\u0000\u0000l\u02ed\u0001\u0000\u0000\u0000n\u0309\u0001\u0000"+
		"\u0000\u0000p\u030b\u0001\u0000\u0000\u0000r\u031e\u0001\u0000\u0000\u0000"+
		"t\u0327\u0001\u0000\u0000\u0000v\u032a\u0001\u0000\u0000\u0000x\u032d"+
		"\u0001\u0000\u0000\u0000z\u0333\u0001\u0000\u0000\u0000|\u0348\u0001\u0000"+
		"\u0000\u0000~\u0350\u0001\u0000\u0000\u0000\u0080\u0352\u0001\u0000\u0000"+
		"\u0000\u0082\u0363\u0001\u0000\u0000\u0000\u0084\u0365\u0001\u0000\u0000"+
		"\u0000\u0086\u0388\u0001\u0000\u0000\u0000\u0088\u038a\u0001\u0000\u0000"+
		"\u0000\u008a\u038d\u0001\u0000\u0000\u0000\u008c\u0394\u0001\u0000\u0000"+
		"\u0000\u008e\u03ae\u0001\u0000\u0000\u0000\u0090\u03b0\u0001\u0000\u0000"+
		"\u0000\u0092\u03b2\u0001\u0000\u0000\u0000\u0094\u03ba\u0001\u0000\u0000"+
		"\u0000\u0096\u03c2\u0001\u0000\u0000\u0000\u0098\u03d8\u0001\u0000\u0000"+
		"\u0000\u009a\u03db\u0001\u0000\u0000\u0000\u009c\u0409\u0001\u0000\u0000"+
		"\u0000\u009e\u00a0\u0003\u0002\u0001\u0000\u009f\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u0001\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a9\u0003\u0004\u0002"+
		"\u0000\u00a5\u00a9\u0003\b\u0004\u0000\u00a6\u00a9\u0003 \u0010\u0000"+
		"\u00a7\u00a9\u0003.\u0017\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a9\u0003\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0005\u0001\u0000\u0000\u00ab\u00ac\u00056\u0000\u0000\u00ac\u00b1"+
		"\u0007\u0000\u0000\u0000\u00ad\u00ae\u0005D\u0000\u0000\u00ae\u00b0\u0005"+
		"R\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u00057\u0000\u0000\u00b5\u00b6\u0005\u0003\u0000"+
		"\u0000\u00b6\u00b7\u0005>\u0000\u0000\u00b7\u00b8\u0005C\u0000\u0000\u00b8"+
		"\u0005\u0001\u0000\u0000\u0000\u00b9\u00ba\u0007\u0001\u0000\u0000\u00ba"+
		"\u0007\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003\u0006\u0003\u0000\u00bc"+
		"\u00bd\u00054\u0000\u0000\u00bd\u00be\u00056\u0000\u0000\u00be\u00bf\u0003"+
		"\n\u0005\u0000\u00bf\u00c0\u00057\u0000\u0000\u00c0\u00c1\u00055\u0000"+
		"\u0000\u00c1\t\u0001\u0000\u0000\u0000\u00c2\u00c7\u0003\u001a\r\u0000"+
		"\u00c3\u00c4\u0005D\u0000\u0000\u00c4\u00c6\u0003\u001a\r\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cc\u0005D\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cc\u000b\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0005\u0011\u0000\u0000\u00ce\u00cf\u0005E\u0000\u0000\u00cf\u00d0\u0005"+
		">\u0000\u0000\u00d0\r\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u0012"+
		"\u0000\u0000\u00d2\u00d3\u0005E\u0000\u0000\u00d3\u00d4\u0005@\u0000\u0000"+
		"\u00d4\u000f\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005E\u0000\u0000\u00d6"+
		"\u00d9\u00052\u0000\u0000\u00d7\u00da\u0005R\u0000\u0000\u00d8\u00da\u0003"+
		".\u0017\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000"+
		"\u0000\u0000\u00da\u00df\u0001\u0000\u0000\u0000\u00db\u00dc\u0005D\u0000"+
		"\u0000\u00dc\u00de\u0005R\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000"+
		"\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3\u00053\u0000\u0000\u00e3"+
		"\u0011\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0013\u0000\u0000\u00e5"+
		"\u00e6\u0003\u0010\b\u0000\u00e6\u0013\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0005\u0016\u0000\u0000\u00e8\u00e9\u0003\u0010\b\u0000\u00e9\u0015\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0005R\u0000\u0000\u00eb\u00ec\u0003\u0010"+
		"\b\u0000\u00ec\u0017\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0014\u0000"+
		"\u0000\u00ee\u00ef\u0005E\u0000\u0000\u00ef\u00f1\u0005=\u0000\u0000\u00f0"+
		"\u00f2\u0003V+\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"=\u0000\u0000\u00f6\u00fb\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005R\u0000"+
		"\u0000\u00f8\u00f9\u0005E\u0000\u0000\u00f9\u00fb\u0005>\u0000\u0000\u00fa"+
		"\u00ed\u0001\u0000\u0000\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000\u00fb"+
		"\u0019\u0001\u0000\u0000\u0000\u00fc\u0103\u0003\f\u0006\u0000\u00fd\u0103"+
		"\u0003\u000e\u0007\u0000\u00fe\u0103\u0003\u0012\t\u0000\u00ff\u0103\u0003"+
		"\u0014\n\u0000\u0100\u0103\u0003\u0016\u000b\u0000\u0101\u0103\u0003\u0018"+
		"\f\u0000\u0102\u00fc\u0001\u0000\u0000\u0000\u0102\u00fd\u0001\u0000\u0000"+
		"\u0000\u0102\u00fe\u0001\u0000\u0000\u0000\u0102\u00ff\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u001b\u0001\u0000\u0000\u0000\u0104\u0108\u0005\n\u0000\u0000"+
		"\u0105\u0108\u0005\u0017\u0000\u0000\u0106\u0108\u0003\u0090H\u0000\u0107"+
		"\u0104\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107"+
		"\u0106\u0001\u0000\u0000\u0000\u0108\u001d\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0005\u001a\u0000\u0000\u010a\u010e\u0005R\u0000\u0000\u010b\u010c"+
		"\u0003\u001c\u000e\u0000\u010c\u010d\u0005R\u0000\u0000\u010d\u010f\u0001"+
		"\u0000\u0000\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u0118\u0001\u0000\u0000\u0000\u0110\u0111\u0003"+
		"\u001c\u000e\u0000\u0111\u0115\u0005R\u0000\u0000\u0112\u0113\u0005E\u0000"+
		"\u0000\u0113\u0114\u0005R\u0000\u0000\u0114\u0116\u0005I\u0000\u0000\u0115"+
		"\u0112\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116"+
		"\u0118\u0001\u0000\u0000\u0000\u0117\u0109\u0001\u0000\u0000\u0000\u0117"+
		"\u0110\u0001\u0000\u0000\u0000\u0118\u001f\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0005\u0015\u0000\u0000\u011a\u011c\u0003\u001e\u000f\u0000\u011b"+
		"\u011d\u00056\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0001\u0000\u0000\u0000\u011d\u0121\u0001\u0000\u0000\u0000\u011e\u0120"+
		"\u0003(\u0014\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0123\u0001"+
		"\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001"+
		"\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001"+
		"\u0000\u0000\u0000\u0124\u0126\u00057\u0000\u0000\u0125\u0124\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126!\u0001\u0000\u0000"+
		"\u0000\u0127\u012d\u0003d2\u0000\u0128\u012d\u0003n7\u0000\u0129\u012d"+
		"\u0003|>\u0000\u012a\u012d\u0003T*\u0000\u012b\u012d\u0003V+\u0000\u012c"+
		"\u0127\u0001\u0000\u0000\u0000\u012c\u0128\u0001\u0000\u0000\u0000\u012c"+
		"\u0129\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c"+
		"\u012b\u0001\u0000\u0000\u0000\u012d#\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u00054\u0000\u0000\u012f\u0130\u00052\u0000\u0000\u0130\u0131\u00053"+
		"\u0000\u0000\u0131\u0132\u00055\u0000\u0000\u0132%\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0003\u0090H\u0000\u0134\u0135\u0005R\u0000\u0000\u0135\u0136"+
		"\u0005M\u0000\u0000\u0136\u0137\u0005I\u0000\u0000\u0137\u0138\u0005R"+
		"\u0000\u0000\u0138\u0139\u0005B\u0000\u0000\u0139\u013a\u00059\u0000\u0000"+
		"\u013a\u013b\u0003`0\u0000\u013b\u013c\u0005:\u0000\u0000\u013c\u013d"+
		"\u0003$\u0012\u0000\u013d\u013e\u0005C\u0000\u0000\u013e\'\u0001\u0000"+
		"\u0000\u0000\u013f\u0146\u0003B!\u0000\u0140\u0146\u0003,\u0016\u0000"+
		"\u0141\u0146\u0003*\u0015\u0000\u0142\u0146\u0003|>\u0000\u0143\u0146"+
		"\u0003&\u0013\u0000\u0144\u0146\u00036\u001b\u0000\u0145\u013f\u0001\u0000"+
		"\u0000\u0000\u0145\u0140\u0001\u0000\u0000\u0000\u0145\u0141\u0001\u0000"+
		"\u0000\u0000\u0145\u0142\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000"+
		"\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146)\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0005\u001d\u0000\u0000\u0148\u0149\u0005F\u0000\u0000"+
		"\u0149\u014a\u0005\u001e\u0000\u0000\u014a\u014b\u00054\u0000\u0000\u014b"+
		"\u014c\u0003J%\u0000\u014c\u014d\u00055\u0000\u0000\u014d+\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0005\u001d\u0000\u0000\u014f\u0150\u0005F\u0000"+
		"\u0000\u0150\u0151\u0005\u001f\u0000\u0000\u0151\u0152\u00054\u0000\u0000"+
		"\u0152\u0153\u0003J%\u0000\u0153\u0154\u00055\u0000\u0000\u0154\u0155"+
		"\u0005C\u0000\u0000\u0155-\u0001\u0000\u0000\u0000\u0156\u0157\u0005R"+
		"\u0000\u0000\u0157\u0158\u0003H$\u0000\u0158\u0159\u0005F\u0000\u0000"+
		"\u0159\u015a\u0005\u001c\u0000\u0000\u015a\u015b\u00054\u0000\u0000\u015b"+
		"\u015c\u0003H$\u0000\u015c\u015d\u00058\u0000\u0000\u015d\u015e\u0003"+
		"*\u0015\u0000\u015e\u015f\u00055\u0000\u0000\u015f\u0160\u0005C\u0000"+
		"\u0000\u0160\u0176\u0001\u0000\u0000\u0000\u0161\u0163\u0003<\u001e\u0000"+
		"\u0162\u0164\u0005R\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"\u0168\u0003H$\u0000\u0166\u0167\u0005\u000e\u0000\u0000\u0167\u0169\u0003"+
		"`0\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0005C\u0000\u0000"+
		"\u016b\u0176\u0001\u0000\u0000\u0000\u016c\u016d\u0003<\u001e\u0000\u016d"+
		"\u016f\u00054\u0000\u0000\u016e\u0170\u00030\u0018\u0000\u016f\u016e\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u0001"+
		"\u0000\u0000\u0000\u0171\u0173\u00055\u0000\u0000\u0172\u0174\u0005C\u0000"+
		"\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174\u0176\u0001\u0000\u0000\u0000\u0175\u0156\u0001\u0000\u0000"+
		"\u0000\u0175\u0161\u0001\u0000\u0000\u0000\u0175\u016c\u0001\u0000\u0000"+
		"\u0000\u0176/\u0001\u0000\u0000\u0000\u0177\u0185\u00038\u001c\u0000\u0178"+
		"\u0179\u00052\u0000\u0000\u0179\u017a\u0003:\u001d\u0000\u017a\u017b\u0005"+
		"3\u0000\u0000\u017b\u0185\u0001\u0000\u0000\u0000\u017c\u0181\u0003|>"+
		"\u0000\u017d\u017e\u0005D\u0000\u0000\u017e\u0180\u0003|>\u0000\u017f"+
		"\u017d\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181"+
		"\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182"+
		"\u0185\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184"+
		"\u0177\u0001\u0000\u0000\u0000\u0184\u0178\u0001\u0000\u0000\u0000\u0184"+
		"\u017c\u0001\u0000\u0000\u0000\u01851\u0001\u0000\u0000\u0000\u0186\u0187"+
		"\u0003<\u001e\u0000\u0187\u0188\u00054\u0000\u0000\u0188\u0189\u0005R"+
		"\u0000\u0000\u0189\u018a\u00058\u0000\u0000\u018a\u018b\u0003<\u001e\u0000"+
		"\u018b\u018c\u0007\u0002\u0000\u0000\u018c\u018d\u0003<\u001e\u0000\u018d"+
		"\u018e\u00055\u0000\u0000\u018e\u019c\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0003<\u001e\u0000\u0190\u0191\u00054\u0000\u0000\u0191\u0192\u0003H"+
		"$\u0000\u0192\u0193\u00058\u0000\u0000\u0193\u0194\u0003<\u001e\u0000"+
		"\u0194\u0195\u0003H$\u0000\u0195\u0196\u0005D\u0000\u0000\u0196\u0197"+
		"\u0005?\u0000\u0000\u0197\u0198\u00055\u0000\u0000\u0198\u0199\u0003L"+
		"&\u0000\u0199\u019a\u0005?\u0000\u0000\u019a\u019c\u0001\u0000\u0000\u0000"+
		"\u019b\u0186\u0001\u0000\u0000\u0000\u019b\u018f\u0001\u0000\u0000\u0000"+
		"\u019c3\u0001\u0000\u0000\u0000\u019d\u01a2\u00030\u0018\u0000\u019e\u01a2"+
		"\u0003.\u0017\u0000\u019f\u01a2\u00032\u0019\u0000\u01a0\u01a2\u0003J"+
		"%\u0000\u01a1\u019d\u0001\u0000\u0000\u0000\u01a1\u019e\u0001\u0000\u0000"+
		"\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a25\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005\r\u0000\u0000"+
		"\u01a4\u01a6\u00034\u001a\u0000\u01a5\u01a7\u0005C\u0000\u0000\u01a6\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a77\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a9\u00056\u0000\u0000\u01a9\u01ae\u0003:\u001d"+
		"\u0000\u01aa\u01ab\u0005D\u0000\u0000\u01ab\u01ad\u0003:\u001d\u0000\u01ac"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000\u0000\u01ae"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b2\u00057\u0000\u0000\u01b29\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005"+
		"R\u0000\u0000\u01b4\u01b5\u0005E\u0000\u0000\u01b5\u01c4\u0003|>\u0000"+
		"\u01b6\u01b7\u0005\u0013\u0000\u0000\u01b7\u01b8\u0005E\u0000\u0000\u01b8"+
		"\u01c4\u0003|>\u0000\u01b9\u01ba\u0005\u0016\u0000\u0000\u01ba\u01bb\u0005"+
		"E\u0000\u0000\u01bb\u01c4\u0003|>\u0000\u01bc\u01be\u0005F\u0000\u0000"+
		"\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000"+
		"\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c2\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c4\u0003<\u001e\u0000\u01c3\u01b3\u0001\u0000\u0000\u0000\u01c3"+
		"\u01b6\u0001\u0000\u0000\u0000\u01c3\u01b9\u0001\u0000\u0000\u0000\u01c3"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c4;\u0001\u0000\u0000\u0000\u01c5\u01d2"+
		"\u0005R\u0000\u0000\u01c6\u01c7\u0005F\u0000\u0000\u01c7\u01c9\u0005R"+
		"\u0000\u0000\u01c8\u01ca\u0005M\u0000\u0000\u01c9\u01c8\u0001\u0000\u0000"+
		"\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01ce\u0001\u0000\u0000"+
		"\u0000\u01cb\u01cc\u00052\u0000\u0000\u01cc\u01cd\u0005R\u0000\u0000\u01cd"+
		"\u01cf\u00053\u0000\u0000\u01ce\u01cb\u0001\u0000\u0000\u0000\u01ce\u01cf"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d1\u0001\u0000\u0000\u0000\u01d0\u01c6"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d4\u0001\u0000\u0000\u0000\u01d2\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3=\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005"+
		"I\u0000\u0000\u01d6\u01d8\u0005\t\u0000\u0000\u01d7\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01da\u0001\u0000"+
		"\u0000\u0000\u01d9\u01db\u0003H$\u0000\u01da\u01d9\u0001\u0000\u0000\u0000"+
		"\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0005E\u0000\u0000\u01dd\u01df\u0003\u0092I\u0000\u01de\u01dc"+
		"\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e9"+
		"\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005M\u0000\u0000\u01e1\u01e2\u0003"+
		"H$\u0000\u01e2\u01e3\u0005E\u0000\u0000\u01e3\u01e4\u0005R\u0000\u0000"+
		"\u01e4\u01e5\u00059\u0000\u0000\u01e5\u01e6\u0003`0\u0000\u01e6\u01e7"+
		"\u0005:\u0000\u0000\u01e7\u01e9\u0001\u0000\u0000\u0000\u01e8\u01d7\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e0\u0001\u0000\u0000\u0000\u01e9?\u0001\u0000"+
		"\u0000\u0000\u01ea\u01ed\u0005\t\u0000\u0000\u01eb\u01ed\u0003\u0090H"+
		"\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ef\u0005R\u0000\u0000\u01ef\u01f0\u0003>\u001f\u0000\u01f0"+
		"\u01f4\u00056\u0000\u0000\u01f1\u01f3\u0003(\u0014\u0000\u01f2\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f6\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005"+
		"7\u0000\u0000\u01f8A\u0001\u0000\u0000\u0000\u01f9\u01fc\u0003@ \u0000"+
		"\u01fa\u01fc\u0003\u009cN\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fa\u0001\u0000\u0000\u0000\u01fcC\u0001\u0000\u0000\u0000\u01fd\u01ff"+
		"\u0005D\u0000\u0000\u01fe\u0200\u0005A\u0000\u0000\u01ff\u01fe\u0001\u0000"+
		"\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\u0005R\u0000\u0000\u0202\u0203\u0005E\u0000\u0000"+
		"\u0203\u0205\u0003d2\u0000\u0204\u01fd\u0001\u0000\u0000\u0000\u0205\u0208"+
		"\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0001\u0000\u0000\u0000\u0207\u0218\u0001\u0000\u0000\u0000\u0208\u0206"+
		"\u0001\u0000\u0000\u0000\u0209\u020a\u0005I\u0000\u0000\u020a\u0214\u0003"+
		"J%\u0000\u020b\u020c\u0005D\u0000\u0000\u020c\u020d\u0005R\u0000\u0000"+
		"\u020d\u020e\u0005E\u0000\u0000\u020e\u020f\u0003d2\u0000\u020f\u0210"+
		"\u0005I\u0000\u0000\u0210\u0211\u0003J%\u0000\u0211\u0213\u0001\u0000"+
		"\u0000\u0000\u0212\u020b\u0001\u0000\u0000\u0000\u0213\u0216\u0001\u0000"+
		"\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000"+
		"\u0000\u0000\u0215\u0218\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000"+
		"\u0000\u0000\u0217\u0206\u0001\u0000\u0000\u0000\u0217\u0209\u0001\u0000"+
		"\u0000\u0000\u0218E\u0001\u0000\u0000\u0000\u0219\u021b\u0005A\u0000\u0000"+
		"\u021a\u0219\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000"+
		"\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u0221\u0005R\u0000\u0000\u021d"+
		"\u021e\u0005E\u0000\u0000\u021e\u021f\u0003d2\u0000\u021f\u0220\u0003"+
		"D\"\u0000\u0220\u0222\u0001\u0000\u0000\u0000\u0221\u021d\u0001\u0000"+
		"\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u022c\u0001\u0000"+
		"\u0000\u0000\u0223\u0228\u0003<\u001e\u0000\u0224\u0225\u0005D\u0000\u0000"+
		"\u0225\u0227\u0003<\u001e\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0227"+
		"\u022a\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0001\u0000\u0000\u0000\u0229\u022c\u0001\u0000\u0000\u0000\u022a"+
		"\u0228\u0001\u0000\u0000\u0000\u022b\u021a\u0001\u0000\u0000\u0000\u022b"+
		"\u0223\u0001\u0000\u0000\u0000\u022cG\u0001\u0000\u0000\u0000\u022d\u0231"+
		"\u00054\u0000\u0000\u022e\u0230\u0003F#\u0000\u022f\u022e\u0001\u0000"+
		"\u0000\u0000\u0230\u0233\u0001\u0000\u0000\u0000\u0231\u022f\u0001\u0000"+
		"\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0234\u0001\u0000"+
		"\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0234\u0235\u00055\u0000"+
		"\u0000\u0235I\u0001\u0000\u0000\u0000\u0236\u0237\u0007\u0003\u0000\u0000"+
		"\u0237K\u0001\u0000\u0000\u0000\u0238\u0239\u0007\u0004\u0000\u0000\u0239"+
		"M\u0001\u0000\u0000\u0000\u023a\u023b\u0005G\u0000\u0000\u023b\u023c\u0005"+
		"F\u0000\u0000\u023c\u023d\u00052\u0000\u0000\u023d\u023e\u0003J%\u0000"+
		"\u023e\u023f\u00053\u0000\u0000\u023f\u0241\u0001\u0000\u0000\u0000\u0240"+
		"\u023a\u0001\u0000\u0000\u0000\u0241\u0244\u0001\u0000\u0000\u0000\u0242"+
		"\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243"+
		"O\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0245\u0246"+
		"\u0006(\uffff\uffff\u0000\u0246\u0247\u0005R\u0000\u0000\u0247\u0248\u0005"+
		"I\u0000\u0000\u0248\u0249\u0003|>\u0000\u0249\u024a\u0005C\u0000\u0000"+
		"\u024a\u0262\u0001\u0000\u0000\u0000\u024b\u024c\u0003<\u001e\u0000\u024c"+
		"\u0257\u0003N\'\u0000\u024d\u024f\u0005I\u0000\u0000\u024e\u0250\u0005"+
		"+\u0000\u0000\u024f\u024e\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000"+
		"\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0255\u0003d2\u0000"+
		"\u0252\u0253\u0003L&\u0000\u0253\u0254\u0003J%\u0000\u0254\u0256\u0001"+
		"\u0000\u0000\u0000\u0255\u0252\u0001\u0000\u0000\u0000\u0255\u0256\u0001"+
		"\u0000\u0000\u0000\u0256\u0258\u0001\u0000\u0000\u0000\u0257\u024d\u0001"+
		"\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u025a\u0001"+
		"\u0000\u0000\u0000\u0259\u025b\u0005C\u0000\u0000\u025a\u0259\u0001\u0000"+
		"\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u0262\u0001\u0000"+
		"\u0000\u0000\u025c\u025d\u0003<\u001e\u0000\u025d\u025e\u0005I\u0000\u0000"+
		"\u025e\u025f\u00038\u001c\u0000\u025f\u0260\u0005C\u0000\u0000\u0260\u0262"+
		"\u0001\u0000\u0000\u0000\u0261\u0245\u0001\u0000\u0000\u0000\u0261\u024b"+
		"\u0001\u0000\u0000\u0000\u0261\u025c\u0001\u0000\u0000\u0000\u0262\u026e"+
		"\u0001\u0000\u0000\u0000\u0263\u0264\n\u0002\u0000\u0000\u0264\u0265\u0005"+
		"I\u0000\u0000\u0265\u026a\u0003P(\u0000\u0266\u0267\u0005\u000e\u0000"+
		"\u0000\u0267\u0268\u0003f3\u0000\u0268\u0269\u0005C\u0000\u0000\u0269"+
		"\u026b\u0001\u0000\u0000\u0000\u026a\u0266\u0001\u0000\u0000\u0000\u026a"+
		"\u026b\u0001\u0000\u0000\u0000\u026b\u026d\u0001\u0000\u0000\u0000\u026c"+
		"\u0263\u0001\u0000\u0000\u0000\u026d\u0270\u0001\u0000\u0000\u0000\u026e"+
		"\u026c\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f"+
		"Q\u0001\u0000\u0000\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0271\u0273"+
		"\u00056\u0000\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0273\u0274\u0001"+
		"\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0275\u0001"+
		"\u0000\u0000\u0000\u0275\u0279\u0001\u0000\u0000\u0000\u0276\u0278\u0003"+
		"\"\u0011\u0000\u0277\u0276\u0001\u0000\u0000\u0000\u0278\u027b\u0001\u0000"+
		"\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000"+
		"\u0000\u0000\u027a\u0282\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000"+
		"\u0000\u0000\u027c\u027e\u0005(\u0000\u0000\u027d\u027f\u0003\"\u0011"+
		"\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000"+
		"\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000"+
		"\u0000\u0281\u0283\u0001\u0000\u0000\u0000\u0282\u027c\u0001\u0000\u0000"+
		"\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u0285\u0001\u0000\u0000"+
		"\u0000\u0284\u0286\u00057\u0000\u0000\u0285\u0284\u0001\u0000\u0000\u0000"+
		"\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000"+
		"\u0287\u0288\u0001\u0000\u0000\u0000\u0288S\u0001\u0000\u0000\u0000\u0289"+
		"\u028a\u00054\u0000\u0000\u028a\u028b\u0005\u0002\u0000\u0000\u028b\u028c"+
		"\u0005|\u0000\u0000\u028c\u028d\u0005~\u0000\u0000\u028d\u028e\u0005\u0084"+
		"\u0000\u0000\u028e\u028f\u0005\u0085\u0000\u0000\u028f\u0298\u0005\u0086"+
		"\u0000\u0000\u0290\u0295\u0005\u0085\u0000\u0000\u0291\u0292\u0005\u0083"+
		"\u0000\u0000\u0292\u0294\u0005\u0085\u0000\u0000\u0293\u0291\u0001\u0000"+
		"\u0000\u0000\u0294\u0297\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000"+
		"\u0000\u0000\u0295\u0296\u0001\u0000\u0000\u0000\u0296\u0299\u0001\u0000"+
		"\u0000\u0000\u0297\u0295\u0001\u0000\u0000\u0000\u0298\u0290\u0001\u0000"+
		"\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000"+
		"\u0000\u0000\u029a\u029b\u0005|\u0000\u0000\u029b\u029c\u0005\u0087\u0000"+
		"\u0000\u029cU\u0001\u0000\u0000\u0000\u029d\u02a0\u0003X,\u0000\u029e"+
		"\u02a0\u0003Z-\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u029f\u029e\u0001"+
		"\u0000\u0000\u0000\u02a0W\u0001\u0000\u0000\u0000\u02a1\u02a5\u0003\\"+
		".\u0000\u02a2\u02a4\u0003\"\u0011\u0000\u02a3\u02a2\u0001\u0000\u0000"+
		"\u0000\u02a4\u02a7\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a8\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a8\u02a9\u0003^/\u0000\u02a9"+
		"Y\u0001\u0000\u0000\u0000\u02aa\u02ae\u00059\u0000\u0000\u02ab\u02ad\u0003"+
		"\"\u0011\u0000\u02ac\u02ab\u0001\u0000\u0000\u0000\u02ad\u02b0\u0001\u0000"+
		"\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02ae\u02af\u0001\u0000"+
		"\u0000\u0000\u02af\u02b1\u0001\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000"+
		"\u0000\u0000\u02b1\u02b2\u0005;\u0000\u0000\u02b2\u02b3\u0005:\u0000\u0000"+
		"\u02b3[\u0001\u0000\u0000\u0000\u02b4\u02b8\u00059\u0000\u0000\u02b5\u02b7"+
		"\u0003\"\u0011\u0000\u02b6\u02b5\u0001\u0000\u0000\u0000\u02b7\u02ba\u0001"+
		"\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001"+
		"\u0000\u0000\u0000\u02b9\u02bb\u0001\u0000\u0000\u0000\u02ba\u02b8\u0001"+
		"\u0000\u0000\u0000\u02bb\u02bc\u0005:\u0000\u0000\u02bc]\u0001\u0000\u0000"+
		"\u0000\u02bd\u02be\u00059\u0000\u0000\u02be\u02bf\u0005;\u0000\u0000\u02bf"+
		"\u02c0\u0005R\u0000\u0000\u02c0\u02c1\u0005:\u0000\u0000\u02c1_\u0001"+
		"\u0000\u0000\u0000\u02c2\u02c3\u0005R\u0000\u0000\u02c3\u02c4\u00052\u0000"+
		"\u0000\u02c4\u02c5\u00053\u0000\u0000\u02c5a\u0001\u0000\u0000\u0000\u02c6"+
		"\u02c7\u0005R\u0000\u0000\u02c7\u02c8\u00059\u0000\u0000\u02c8\u02cd\u0003"+
		"J%\u0000\u02c9\u02ca\u0005D\u0000\u0000\u02ca\u02cc\u0003J%\u0000\u02cb"+
		"\u02c9\u0001\u0000\u0000\u0000\u02cc\u02cf\u0001\u0000\u0000\u0000\u02cd"+
		"\u02cb\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce"+
		"\u02d0\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000\u02d0"+
		"\u02d1\u0005:\u0000\u0000\u02d1c\u0001\u0000\u0000\u0000\u02d2\u02d9\u0003"+
		"f3\u0000\u02d3\u02d9\u0003h4\u0000\u02d4\u02d9\u0003`0\u0000\u02d5\u02d9"+
		"\u0003b1\u0000\u02d6\u02d9\u0003j5\u0000\u02d7\u02d9\u0003l6\u0000\u02d8"+
		"\u02d2\u0001\u0000\u0000\u0000\u02d8\u02d3\u0001\u0000\u0000\u0000\u02d8"+
		"\u02d4\u0001\u0000\u0000\u0000\u02d8\u02d5\u0001\u0000\u0000\u0000\u02d8"+
		"\u02d6\u0001\u0000\u0000\u0000\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d9"+
		"e\u0001\u0000\u0000\u0000\u02da\u02e3\u0005R\u0000\u0000\u02db\u02e3\u0005"+
		"!\u0000\u0000\u02dc\u02e3\u0005#\u0000\u0000\u02dd\u02e3\u0005$\u0000"+
		"\u0000\u02de\u02e3\u0005 \u0000\u0000\u02df\u02e3\u0005\"\u0000\u0000"+
		"\u02e0\u02e3\u0005\u001a\u0000\u0000\u02e1\u02e3\u0003R)\u0000\u02e2\u02da"+
		"\u0001\u0000\u0000\u0000\u02e2\u02db\u0001\u0000\u0000\u0000\u02e2\u02dc"+
		"\u0001\u0000\u0000\u0000\u02e2\u02dd\u0001\u0000\u0000\u0000\u02e2\u02de"+
		"\u0001\u0000\u0000\u0000\u02e2\u02df\u0001\u0000\u0000\u0000\u02e2\u02e0"+
		"\u0001\u0000\u0000\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e3g\u0001"+
		"\u0000\u0000\u0000\u02e4\u02e5\u0005\b\u0000\u0000\u02e5\u02e6\u00059"+
		"\u0000\u0000\u02e6\u02e7\u0005\"\u0000\u0000\u02e7\u02e8\u0005:\u0000"+
		"\u0000\u02e8i\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005!\u0000\u0000\u02ea"+
		"\u02eb\u00052\u0000\u0000\u02eb\u02ec\u00053\u0000\u0000\u02eck\u0001"+
		"\u0000\u0000\u0000\u02ed\u02ee\u00052\u0000\u0000\u02ee\u02f1\u0003d2"+
		"\u0000\u02ef\u02f0\u0005D\u0000\u0000\u02f0\u02f2\u0003d2\u0000\u02f1"+
		"\u02ef\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3"+
		"\u02f1\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4"+
		"\u02f5\u0001\u0000\u0000\u0000\u02f5\u02f6\u00053\u0000\u0000\u02f6m\u0001"+
		"\u0000\u0000\u0000\u02f7\u030a\u0005C\u0000\u0000\u02f8\u030a\u0005D\u0000"+
		"\u0000\u02f9\u030a\u0005E\u0000\u0000\u02fa\u030a\u0005F\u0000\u0000\u02fb"+
		"\u030a\u0005G\u0000\u0000\u02fc\u030a\u0005H\u0000\u0000\u02fd\u030a\u0005"+
		"I\u0000\u0000\u02fe\u030a\u00059\u0000\u0000\u02ff\u030a\u0005:\u0000"+
		"\u0000\u0300\u030a\u0003L&\u0000\u0301\u030a\u0005M\u0000\u0000\u0302"+
		"\u030a\u00052\u0000\u0000\u0303\u030a\u00053\u0000\u0000\u0304\u030a\u0005"+
		"4\u0000\u0000\u0305\u030a\u00055\u0000\u0000\u0306\u030a\u00056\u0000"+
		"\u0000\u0307\u030a\u00057\u0000\u0000\u0308\u030a\u0005+\u0000\u0000\u0309"+
		"\u02f7\u0001\u0000\u0000\u0000\u0309\u02f8\u0001\u0000\u0000\u0000\u0309"+
		"\u02f9\u0001\u0000\u0000\u0000\u0309\u02fa\u0001\u0000\u0000\u0000\u0309"+
		"\u02fb\u0001\u0000\u0000\u0000\u0309\u02fc\u0001\u0000\u0000\u0000\u0309"+
		"\u02fd\u0001\u0000\u0000\u0000\u0309\u02fe\u0001\u0000\u0000\u0000\u0309"+
		"\u02ff\u0001\u0000\u0000\u0000\u0309\u0300\u0001\u0000\u0000\u0000\u0309"+
		"\u0301\u0001\u0000\u0000\u0000\u0309\u0302\u0001\u0000\u0000\u0000\u0309"+
		"\u0303\u0001\u0000\u0000\u0000\u0309\u0304\u0001\u0000\u0000\u0000\u0309"+
		"\u0305\u0001\u0000\u0000\u0000\u0309\u0306\u0001\u0000\u0000\u0000\u0309"+
		"\u0307\u0001\u0000\u0000\u0000\u0309\u0308\u0001\u0000\u0000\u0000\u030a"+
		"o\u0001\u0000\u0000\u0000\u030b\u031a\u00052\u0000\u0000\u030c\u0317\u0003"+
		"|>\u0000\u030d\u030e\u0005D\u0000\u0000\u030e\u0312\u0003|>\u0000\u030f"+
		"\u0311\u0005D\u0000\u0000\u0310\u030f\u0001\u0000\u0000\u0000\u0311\u0314"+
		"\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000\u0000\u0312\u0313"+
		"\u0001\u0000\u0000\u0000\u0313\u0316\u0001\u0000\u0000\u0000\u0314\u0312"+
		"\u0001\u0000\u0000\u0000\u0315\u030d\u0001\u0000\u0000\u0000\u0316\u0319"+
		"\u0001\u0000\u0000\u0000\u0317\u0315\u0001\u0000\u0000\u0000\u0317\u0318"+
		"\u0001\u0000\u0000\u0000\u0318\u031b\u0001\u0000\u0000\u0000\u0319\u0317"+
		"\u0001\u0000\u0000\u0000\u031a\u030c\u0001\u0000\u0000\u0000\u031a\u031b"+
		"\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u031d"+
		"\u00053\u0000\u0000\u031dq\u0001\u0000\u0000\u0000\u031e\u0322\u00056"+
		"\u0000\u0000\u031f\u0321\u0003|>\u0000\u0320\u031f\u0001\u0000\u0000\u0000"+
		"\u0321\u0324\u0001\u0000\u0000\u0000\u0322\u0320\u0001\u0000\u0000\u0000"+
		"\u0322\u0323\u0001\u0000\u0000\u0000\u0323\u0325\u0001\u0000\u0000\u0000"+
		"\u0324\u0322\u0001\u0000\u0000\u0000\u0325\u0326\u00057\u0000\u0000\u0326"+
		"s\u0001\u0000\u0000\u0000\u0327\u0328\u0005\u001b\u0000\u0000\u0328\u0329"+
		"\u0003r9\u0000\u0329u\u0001\u0000\u0000\u0000\u032a\u032b\u0005\u001c"+
		"\u0000\u0000\u032b\u032c\u0003r9\u0000\u032cw\u0001\u0000\u0000\u0000"+
		"\u032d\u0331\u0003J%\u0000\u032e\u032f\u0003L&\u0000\u032f\u0330\u0003"+
		"J%\u0000\u0330\u0332\u0001\u0000\u0000\u0000\u0331\u032e\u0001\u0000\u0000"+
		"\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332y\u0001\u0000\u0000\u0000"+
		"\u0333\u0335\u0003<\u001e\u0000\u0334\u0336\u0005G\u0000\u0000\u0335\u0334"+
		"\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0335"+
		"\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u0339"+
		"\u0001\u0000\u0000\u0000\u0339\u033a\u0003J%\u0000\u033a{\u0001\u0000"+
		"\u0000\u0000\u033b\u0349\u0003J%\u0000\u033c\u0349\u0003p8\u0000\u033d"+
		"\u0349\u0003\u009aM\u0000\u033e\u0349\u0003\u008eG\u0000\u033f\u0349\u0003"+
		"t:\u0000\u0340\u0349\u0003v;\u0000\u0341\u0349\u00038\u001c\u0000\u0342"+
		"\u0349\u0003~?\u0000\u0343\u0349\u0003<\u001e\u0000\u0344\u0349\u0003"+
		".\u0017\u0000\u0345\u0349\u0003P(\u0000\u0346\u0349\u0003z=\u0000\u0347"+
		"\u0349\u0003x<\u0000\u0348\u033b\u0001\u0000\u0000\u0000\u0348\u033c\u0001"+
		"\u0000\u0000\u0000\u0348\u033d\u0001\u0000\u0000\u0000\u0348\u033e\u0001"+
		"\u0000\u0000\u0000\u0348\u033f\u0001\u0000\u0000\u0000\u0348\u0340\u0001"+
		"\u0000\u0000\u0000\u0348\u0341\u0001\u0000\u0000\u0000\u0348\u0342\u0001"+
		"\u0000\u0000\u0000\u0348\u0343\u0001\u0000\u0000\u0000\u0348\u0344\u0001"+
		"\u0000\u0000\u0000\u0348\u0345\u0001\u0000\u0000\u0000\u0348\u0346\u0001"+
		"\u0000\u0000\u0000\u0348\u0347\u0001\u0000\u0000\u0000\u0349}\u0001\u0000"+
		"\u0000\u0000\u034a\u034b\u0005&\u0000\u0000\u034b\u034c\u0005T\u0000\u0000"+
		"\u034c\u0351\u0003\u0080@\u0000\u034d\u034e\u0005\'\u0000\u0000\u034e"+
		"\u034f\u0005\\\u0000\u0000\u034f\u0351\u0003\u0084B\u0000\u0350\u034a"+
		"\u0001\u0000\u0000\u0000\u0350\u034d\u0001\u0000\u0000\u0000\u0351\u007f"+
		"\u0001\u0000\u0000\u0000\u0352\u0356\u0005U\u0000\u0000\u0353\u0355\u0003"+
		"\u0082A\u0000\u0354\u0353\u0001\u0000\u0000\u0000\u0355\u0358\u0001\u0000"+
		"\u0000\u0000\u0356\u0354\u0001\u0000\u0000\u0000\u0356\u0357\u0001\u0000"+
		"\u0000\u0000\u0357\u0359\u0001\u0000\u0000\u0000\u0358\u0356\u0001\u0000"+
		"\u0000\u0000\u0359\u035a\u0005Y\u0000\u0000\u035a\u0081\u0001\u0000\u0000"+
		"\u0000\u035b\u035c\u0005V\u0000\u0000\u035c\u035d\u0005X\u0000\u0000\u035d"+
		"\u035e\u0005W\u0000\u0000\u035e\u0364\u0005X\u0000\u0000\u035f\u0360\u0005"+
		"V\u0000\u0000\u0360\u0361\u0005X\u0000\u0000\u0361\u0362\u0005T\u0000"+
		"\u0000\u0362\u0364\u0005X\u0000\u0000\u0363\u035b\u0001\u0000\u0000\u0000"+
		"\u0363\u035f\u0001\u0000\u0000\u0000\u0364\u0083\u0001\u0000\u0000\u0000"+
		"\u0365\u0366\u0005^\u0000\u0000\u0366\u0367\u0003\u0086C\u0000\u0367\u0368"+
		"\u0005z\u0000\u0000\u0368\u0085\u0001\u0000\u0000\u0000\u0369\u036d\u0005"+
		"y\u0000\u0000\u036a\u036b\u0003\u0088D\u0000\u036b\u036c\u0005]\u0000"+
		"\u0000\u036c\u036e\u0001\u0000\u0000\u0000\u036d\u036a\u0001\u0000\u0000"+
		"\u0000\u036d\u036e\u0001\u0000\u0000\u0000\u036e\u0389\u0001\u0000\u0000"+
		"\u0000\u036f\u0377\u0003\u008aE\u0000\u0370\u0371\u0005r\u0000\u0000\u0371"+
		"\u0373\u0005[\u0000\u0000\u0372\u0370\u0001\u0000\u0000\u0000\u0372\u0373"+
		"\u0001\u0000\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000\u0374\u0375"+
		"\u0003\u0088D\u0000\u0375\u0376\u0007\u0005\u0000\u0000\u0376\u0378\u0001"+
		"\u0000\u0000\u0000\u0377\u0372\u0001\u0000\u0000\u0000\u0377\u0378\u0001"+
		"\u0000\u0000\u0000\u0378\u0389\u0001\u0000\u0000\u0000\u0379\u0386\u0003"+
		"\u008aE\u0000\u037a\u037b\u0005u\u0000\u0000\u037b\u037c\u0005y\u0000"+
		"\u0000\u037c\u037d\u0005p\u0000\u0000\u037d\u0380\u0003\u008aE\u0000\u037e"+
		"\u037f\u0005r\u0000\u0000\u037f\u0381\u0005[\u0000\u0000\u0380\u037e\u0001"+
		"\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000\u0381\u0382\u0001"+
		"\u0000\u0000\u0000\u0382\u0383\u0003\u0088D\u0000\u0383\u0384\u0005y\u0000"+
		"\u0000\u0384\u0385\u0005v\u0000\u0000\u0385\u0387\u0001\u0000\u0000\u0000"+
		"\u0386\u037a\u0001\u0000\u0000\u0000\u0386\u0387\u0001\u0000\u0000\u0000"+
		"\u0387\u0389\u0001\u0000\u0000\u0000\u0388\u0369\u0001\u0000\u0000\u0000"+
		"\u0388\u036f\u0001\u0000\u0000\u0000\u0388\u0379\u0001\u0000\u0000\u0000"+
		"\u0389\u0087\u0001\u0000\u0000\u0000\u038a\u038b\u0007\u0006\u0000\u0000"+
		"\u038b\u0089\u0001\u0000\u0000\u0000\u038c\u038e\u0005b\u0000\u0000\u038d"+
		"\u038c\u0001\u0000\u0000\u0000\u038d\u038e\u0001\u0000\u0000\u0000\u038e"+
		"\u038f\u0001\u0000\u0000\u0000\u038f\u0392\u0005y\u0000\u0000\u0390\u0391"+
		"\u0005n\u0000\u0000\u0391\u0393\u0005y\u0000\u0000\u0392\u0390\u0001\u0000"+
		"\u0000\u0000\u0392\u0393\u0001\u0000\u0000\u0000\u0393\u008b\u0001\u0000"+
		"\u0000\u0000\u0394\u0395\u0005\u000b\u0000\u0000\u0395\u0399\u00054\u0000"+
		"\u0000\u0396\u0398\u0003\"\u0011\u0000\u0397\u0396\u0001\u0000\u0000\u0000"+
		"\u0398\u039b\u0001\u0000\u0000\u0000\u0399\u0397\u0001\u0000\u0000\u0000"+
		"\u0399\u039a\u0001\u0000\u0000\u0000\u039a\u039c\u0001\u0000\u0000\u0000"+
		"\u039b\u0399\u0001\u0000\u0000\u0000\u039c\u039d\u00055\u0000\u0000\u039d"+
		"\u008d\u0001\u0000\u0000\u0000\u039e\u039f\u0005R\u0000\u0000\u039f\u03a0"+
		"\u0005G\u0000\u0000\u03a0\u03a1\u0003d2\u0000\u03a1\u03a2\u0005E\u0000"+
		"\u0000\u03a2\u03a3\u0003d2\u0000\u03a3\u03af\u0001\u0000\u0000\u0000\u03a4"+
		"\u03a5\u0003\u008cF\u0000\u03a5\u03a6\u0005\r\u0000\u0000\u03a6\u03a7"+
		"\u0005C\u0000\u0000\u03a7\u03af\u0001\u0000\u0000\u0000\u03a8\u03a9\u0003"+
		"\u008cF\u0000\u03a9\u03ac\u0003r9\u0000\u03aa\u03ab\u0005\f\u0000\u0000"+
		"\u03ab\u03ad\u0003r9\u0000\u03ac\u03aa\u0001\u0000\u0000\u0000\u03ac\u03ad"+
		"\u0001\u0000\u0000\u0000\u03ad\u03af\u0001\u0000\u0000\u0000\u03ae\u039e"+
		"\u0001\u0000\u0000\u0000\u03ae\u03a4\u0001\u0000\u0000\u0000\u03ae\u03a8"+
		"\u0001\u0000\u0000\u0000\u03af\u008f\u0001\u0000\u0000\u0000\u03b0\u03b1"+
		"\u0007\u0007\u0000\u0000\u03b1\u0091\u0001\u0000\u0000\u0000\u03b2\u03b5"+
		"\u0003d2\u0000\u03b3\u03b4\u0005(\u0000\u0000\u03b4\u03b6\u0003d2\u0000"+
		"\u03b5\u03b3\u0001\u0000\u0000\u0000\u03b5\u03b6\u0001\u0000\u0000\u0000"+
		"\u03b6\u0093\u0001\u0000\u0000\u0000\u03b7\u03b9\u0005R\u0000\u0000\u03b8"+
		"\u03b7\u0001\u0000\u0000\u0000\u03b9\u03bc\u0001\u0000\u0000\u0000\u03ba"+
		"\u03b8\u0001\u0000\u0000\u0000\u03ba\u03bb\u0001\u0000\u0000\u0000\u03bb"+
		"\u03bd\u0001\u0000\u0000\u0000\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bd"+
		"\u03c0\u0003H$\u0000\u03be\u03bf\u0005F\u0000\u0000\u03bf\u03c1\u0003"+
		"\u0096K\u0000\u03c0\u03be\u0001\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000"+
		"\u0000\u0000\u03c1\u0095\u0001\u0000\u0000\u0000\u03c2\u03c3\u0005%\u0000"+
		"\u0000\u03c3\u03c4\u0003H$\u0000\u03c4\u0097\u0001\u0000\u0000\u0000\u03c5"+
		"\u03c6\u0005E\u0000\u0000\u03c6\u03cb\u0003\u0092I\u0000\u03c7\u03c8\u0005"+
		"2\u0000\u0000\u03c8\u03ca\u00053\u0000\u0000\u03c9\u03c7\u0001\u0000\u0000"+
		"\u0000\u03ca\u03cd\u0001\u0000\u0000\u0000\u03cb\u03c9\u0001\u0000\u0000"+
		"\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000\u03cc\u03ce\u0001\u0000\u0000"+
		"\u0000\u03cd\u03cb\u0001\u0000\u0000\u0000\u03ce\u03cf\u0005I\u0000\u0000"+
		"\u03cf\u03d0\u0003\"\u0011\u0000\u03d0\u03d9\u0001\u0000\u0000\u0000\u03d1"+
		"\u03d4\u0007\b\u0000\u0000\u03d2\u03d5\u0003\"\u0011\u0000\u03d3\u03d5"+
		"\u00032\u0019\u0000\u03d4\u03d2\u0001\u0000\u0000\u0000\u03d4\u03d3\u0001"+
		"\u0000\u0000\u0000\u03d5\u03d9\u0001\u0000\u0000\u0000\u03d6\u03d7\u0005"+
		"I\u0000\u0000\u03d7\u03d9\u0003\u0094J\u0000\u03d8\u03c5\u0001\u0000\u0000"+
		"\u0000\u03d8\u03d1\u0001\u0000\u0000\u0000\u03d8\u03d6\u0001\u0000\u0000"+
		"\u0000\u03d9\u0099\u0001\u0000\u0000\u0000\u03da\u03dc\u0003\u0090H\u0000"+
		"\u03db\u03da\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000"+
		"\u03dc\u03de\u0001\u0000\u0000\u0000\u03dd\u03df\u0003<\u001e\u0000\u03de"+
		"\u03dd\u0001\u0000\u0000\u0000\u03df\u03e0\u0001\u0000\u0000\u0000\u03e0"+
		"\u03de\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1"+
		"\u03e3\u0001\u0000\u0000\u0000\u03e2\u03e4\u0005G\u0000\u0000\u03e3\u03e2"+
		"\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001\u0000\u0000\u0000\u03e4\u03e5"+
		"\u0001\u0000\u0000\u0000\u03e5\u03e7\u0003\u0098L\u0000\u03e6\u03e8\u0005"+
		"C\u0000\u0000\u03e7\u03e6\u0001\u0000\u0000\u0000\u03e7\u03e8\u0001\u0000"+
		"\u0000\u0000\u03e8\u009b\u0001\u0000\u0000\u0000\u03e9\u03ea\u0003\u0090"+
		"H\u0000\u03ea\u03eb\u0005R\u0000\u0000\u03eb\u03ec\u0005I\u0000\u0000"+
		"\u03ec\u03ef\u0003H$\u0000\u03ed\u03ee\u0005E\u0000\u0000\u03ee\u03f0"+
		"\u0003d2\u0000\u03ef\u03ed\u0001\u0000\u0000\u0000\u03ef\u03f0\u0001\u0000"+
		"\u0000\u0000\u03f0\u03f1\u0001\u0000\u0000\u0000\u03f1\u03f2\u00058\u0000"+
		"\u0000\u03f2\u03f3\u0003(\u0014\u0000\u03f3\u03f4\u0005C\u0000\u0000\u03f4"+
		"\u040a\u0001\u0000\u0000\u0000\u03f5\u03f6\u0003<\u001e\u0000\u03f6\u03f8"+
		"\u0005I\u0000\u0000\u03f7\u03f9\u0003H$\u0000\u03f8\u03f7\u0001\u0000"+
		"\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fc\u0001\u0000"+
		"\u0000\u0000\u03fa\u03fb\u0005E\u0000\u0000\u03fb\u03fd\u0003d2\u0000"+
		"\u03fc\u03fa\u0001\u0000\u0000\u0000\u03fc\u03fd\u0001\u0000\u0000\u0000"+
		"\u03fd\u03fe\u0001\u0000\u0000\u0000\u03fe\u03ff\u00058\u0000\u0000\u03ff"+
		"\u0403\u00056\u0000\u0000\u0400\u0402\u0003(\u0014\u0000\u0401\u0400\u0001"+
		"\u0000\u0000\u0000\u0402\u0405\u0001\u0000\u0000\u0000\u0403\u0401\u0001"+
		"\u0000\u0000\u0000\u0403\u0404\u0001\u0000\u0000\u0000\u0404\u0406\u0001"+
		"\u0000\u0000\u0000\u0405\u0403\u0001\u0000\u0000\u0000\u0406\u0407\u0005"+
		"7\u0000\u0000\u0407\u0408\u0005C\u0000\u0000\u0408\u040a\u0001\u0000\u0000"+
		"\u0000\u0409\u03e9\u0001\u0000\u0000\u0000\u0409\u03f5\u0001\u0000\u0000"+
		"\u0000\u040a\u009d\u0001\u0000\u0000\u0000o\u00a1\u00a8\u00b1\u00c7\u00cb"+
		"\u00d9\u00df\u00f3\u00fa\u0102\u0107\u010e\u0115\u0117\u011c\u0121\u0125"+
		"\u012c\u0145\u0163\u0168\u016f\u0173\u0175\u0181\u0184\u019b\u01a1\u01a6"+
		"\u01ae\u01bf\u01c3\u01c9\u01ce\u01d2\u01d7\u01da\u01de\u01e8\u01ec\u01f4"+
		"\u01fb\u01ff\u0206\u0214\u0217\u021a\u0221\u0228\u022b\u0231\u0242\u024f"+
		"\u0255\u0257\u025a\u0261\u026a\u026e\u0274\u0279\u0280\u0282\u0287\u0295"+
		"\u0298\u029f\u02a5\u02ae\u02b8\u02cd\u02d8\u02e2\u02f3\u0309\u0312\u0317"+
		"\u031a\u0322\u0331\u0337\u0348\u0350\u0356\u0363\u036d\u0372\u0377\u0380"+
		"\u0386\u0388\u038d\u0392\u0399\u03ac\u03ae\u03b5\u03ba\u03c0\u03cb\u03d4"+
		"\u03d8\u03db\u03e0\u03e3\u03e7\u03ef\u03f8\u03fc\u0403\u0409";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}