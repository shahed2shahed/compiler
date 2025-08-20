// Generated from C:/Users/ASUS/IdeaProjects/CompilerProjectFinal/src/antlr/MyParser.g4 by ANTLR 4.13.2
package antlr;
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
		IMPORT=1, FROM=2, LET=3, VAR=4, CONST=5, OF=6, ARRAY=7, FUNCTION=8, COMPONENT=9, 
		SELECTOR=10, STANDALONE=11, IMPORTS=12, TEMPLATE=13, EXPORT=14, CLASS=15, 
		CATCH=16, CONSOLE=17, ERROR=18, LOG=19, ANY=20, NUMBER=21, STRING_EX=22, 
		VOID=23, NULL=24, NgFor=25, NgIf=26, BIT_OR=27, AND=28, OR=29, NOT=30, 
		EQUAL_EQUAL=31, NOT_EQUAL=32, LT_EQUAL=33, GT_EQUAL=34, SQUARE_OPEN_BRACKET=35, 
		SQUARE_CLOSE_BRACKET=36, OPEN_BRACKET=37, CLOSE_BRACKET=38, CURLY_OPEN_BRACKET=39, 
		CURLY_CLOSE_BRACKET=40, ARROW=41, LT=42, GT=43, SLASH=44, DQUOT=45, QUOT=46, 
		STRING=47, NUMBER_VAL=48, BOOLEAN=49, SEMI_COLON=50, COMMA=51, COLON=52, 
		DOT=53, QUESTION_MARK=54, HASH_TAG=55, EQUAL=56, PLUS=57, MIN=58, MULT=59, 
		S_DOlOR=60, WS=61, NEWLINE=62, MultiLineComment=63, SingleLineComment=64, 
		IDENTIFIER=65, WS1=66, EQUAL1=67, DQUOT1=68, LET1=69, OF1=70, ID1=71, 
		DQUOT2=72, WS2=73, NUMBER_VAL1=74, EQUAL2=75, NULL1=76, DQUOT3=77, BIT_OR1=78, 
		AND1=79, OR1=80, NOT1=81, EQUAL_EQUAL1=82, EQUAL_EQUAL2=83, NOT_EQUAL1=84, 
		NOT_EQUAL2=85, LT_EQUAL1=86, GT_EQUAL1=87, PLUS1=88, MIN1=89, MULT1=90, 
		COMMA1=91, COLON1=92, DOT1=93, QUESTION_MARK1=94, ARROW1=95, LT1=96, GT1=97, 
		SQUARE_OPEN_BRACKET1=98, SQUARE_CLOSE_BRACKET1=99, OPEN_BRACKET1=100, 
		CLOSE_BRACKET1=101, CURLY_OPEN_BRACKET1=102, CURLY_CLOSE_BRACKET1=103, 
		ID2=104, DQUOT4=105;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importStatment = 2, RULE_componentDeclaration = 3, 
		RULE_componentBody = 4, RULE_selectorProperty = 5, RULE_standaloneProperty = 6, 
		RULE_importsProperty = 7, RULE_templateProperty = 8, RULE_componentEle = 9, 
		RULE_classStatment = 10, RULE_body = 11, RULE_print_error = 12, RULE_print_stat = 13, 
		RULE_functionCall = 14, RULE_functionDeclaration = 15, RULE_parameters = 16, 
		RULE_assignment = 17, RULE_templateExpression = 18, RULE_types = 19, RULE_htmlDeclare = 20, 
		RULE_normalHtmlTag = 21, RULE_selfClosingTag = 22, RULE_openTag = 23, 
		RULE_closeTag = 24, RULE_type = 25, RULE_primitiveType = 26, RULE_arrayStringType = 27, 
		RULE_arrayNumberType = 28, RULE_tupleType = 29, RULE_marks = 30, RULE_arrayDeclaration = 31, 
		RULE_expression = 32, RULE_directivesStatment = 33, RULE_ngForValue = 34, 
		RULE_ngForExpression = 35, RULE_ngIfValue = 36, RULE_conditionExpression = 37, 
		RULE_equalOperation = 38, RULE_logicalTerm = 39, RULE_ifElseStat = 40, 
		RULE_variable_type = 41, RULE_unionType = 42, RULE_variableDeclaration = 43, 
		RULE_arrowFunction = 44, RULE_arrowBody = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStatment", "componentDeclaration", "componentBody", 
			"selectorProperty", "standaloneProperty", "importsProperty", "templateProperty", 
			"componentEle", "classStatment", "body", "print_error", "print_stat", 
			"functionCall", "functionDeclaration", "parameters", "assignment", "templateExpression", 
			"types", "htmlDeclare", "normalHtmlTag", "selfClosingTag", "openTag", 
			"closeTag", "type", "primitiveType", "arrayStringType", "arrayNumberType", 
			"tupleType", "marks", "arrayDeclaration", "expression", "directivesStatment", 
			"ngForValue", "ngForExpression", "ngIfValue", "conditionExpression", 
			"equalOperation", "logicalTerm", "ifElseStat", "variable_type", "unionType", 
			"variableDeclaration", "arrowFunction", "arrowBody"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'from'", null, "'var'", "'const'", null, "'Array'", 
			"'function'", "'@Component'", "'selector'", "'standalone'", "'imports'", 
			"'template'", "'export'", "'class'", "'catch'", "'console'", "'error'", 
			"'log'", "'any'", "'number'", "'string'", "'void'", null, "'*ngFor'", 
			"'*ngIf'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'/'", null, "'`'", null, null, 
			null, "';'", null, null, null, null, "'#'", null, null, null, null, "'$'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'==='", 
			null, "'!=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "FROM", "LET", "VAR", "CONST", "OF", "ARRAY", "FUNCTION", 
			"COMPONENT", "SELECTOR", "STANDALONE", "IMPORTS", "TEMPLATE", "EXPORT", 
			"CLASS", "CATCH", "CONSOLE", "ERROR", "LOG", "ANY", "NUMBER", "STRING_EX", 
			"VOID", "NULL", "NgFor", "NgIf", "BIT_OR", "AND", "OR", "NOT", "EQUAL_EQUAL", 
			"NOT_EQUAL", "LT_EQUAL", "GT_EQUAL", "SQUARE_OPEN_BRACKET", "SQUARE_CLOSE_BRACKET", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "CURLY_OPEN_BRACKET", "CURLY_CLOSE_BRACKET", 
			"ARROW", "LT", "GT", "SLASH", "DQUOT", "QUOT", "STRING", "NUMBER_VAL", 
			"BOOLEAN", "SEMI_COLON", "COMMA", "COLON", "DOT", "QUESTION_MARK", "HASH_TAG", 
			"EQUAL", "PLUS", "MIN", "MULT", "S_DOlOR", "WS", "NEWLINE", "MultiLineComment", 
			"SingleLineComment", "IDENTIFIER", "WS1", "EQUAL1", "DQUOT1", "LET1", 
			"OF1", "ID1", "DQUOT2", "WS2", "NUMBER_VAL1", "EQUAL2", "NULL1", "DQUOT3", 
			"BIT_OR1", "AND1", "OR1", "NOT1", "EQUAL_EQUAL1", "EQUAL_EQUAL2", "NOT_EQUAL1", 
			"NOT_EQUAL2", "LT_EQUAL1", "GT_EQUAL1", "PLUS1", "MIN1", "MULT1", "COMMA1", 
			"COLON1", "DOT1", "QUESTION_MARK1", "ARROW1", "LT1", "GT1", "SQUARE_OPEN_BRACKET1", 
			"SQUARE_CLOSE_BRACKET1", "OPEN_BRACKET1", "CLOSE_BRACKET1", "CURLY_OPEN_BRACKET1", 
			"CURLY_CLOSE_BRACKET1", "ID2", "DQUOT4"
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16898L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(92);
				statement();
				}
				}
				setState(97);
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				importStatment();
				}
				break;
			case COMPONENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				componentDeclaration();
				}
				break;
			case EXPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				classStatment();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
		public TerminalNode FROM() { return getToken(MyParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(MyParser.STRING, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
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
			setState(104);
			match(IMPORT);
			setState(105);
			match(CURLY_OPEN_BRACKET);
			setState(106);
			match(IDENTIFIER);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(107);
				match(COMMA);
				setState(108);
				match(IDENTIFIER);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(CURLY_CLOSE_BRACKET);
			setState(115);
			match(FROM);
			setState(116);
			match(STRING);
			setState(117);
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
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(MyParser.COMPONENT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode CURLY_OPEN_BRACKET() { return getToken(MyParser.CURLY_OPEN_BRACKET, 0); }
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public List<ComponentBodyContext> componentBody() {
			return getRuleContexts(ComponentBodyContext.class);
		}
		public ComponentBodyContext componentBody(int i) {
			return getRuleContext(ComponentBodyContext.class,i);
		}
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
		enterRule(_localctx, 6, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(COMPONENT);
			setState(120);
			match(OPEN_BRACKET);
			setState(121);
			match(CURLY_OPEN_BRACKET);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) {
				{
				{
				setState(122);
				componentBody();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(CURLY_CLOSE_BRACKET);
			setState(129);
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
		enterRule(_localctx, 8, RULE_componentBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			componentEle();
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					match(COMMA);
					setState(133);
					componentEle();
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(139);
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
		enterRule(_localctx, 10, RULE_selectorProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(SELECTOR);
			setState(143);
			match(COLON);
			setState(144);
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
		enterRule(_localctx, 12, RULE_standaloneProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(STANDALONE);
			setState(147);
			match(COLON);
			setState(148);
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
	public static class ImportsPropertyContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(MyParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(MyParser.SQUARE_OPEN_BRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(MyParser.SQUARE_CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
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
		enterRule(_localctx, 14, RULE_importsProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IMPORTS);
			setState(151);
			match(COLON);
			setState(152);
			match(SQUARE_OPEN_BRACKET);
			setState(153);
			match(IDENTIFIER);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(154);
				match(COMMA);
				setState(155);
				match(IDENTIFIER);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
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
		public TemplatePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTemplateProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTemplateProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitTemplateProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatePropertyContext templateProperty() throws RecognitionException {
		TemplatePropertyContext _localctx = new TemplatePropertyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_templateProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(TEMPLATE);
			setState(164);
			match(COLON);
			setState(165);
			match(QUOT);
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				htmlDeclare();
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LT );
			setState(171);
			match(QUOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 18, RULE_componentEle);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				selectorProperty();
				}
				break;
			case STANDALONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				standaloneProperty();
				}
				break;
			case IMPORTS:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				importsProperty();
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				templateProperty();
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
		public TerminalNode CLASS() { return getToken(MyParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode CURLY_OPEN_BRACKET() { return getToken(MyParser.CURLY_OPEN_BRACKET, 0); }
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
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
		enterRule(_localctx, 20, RULE_classStatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(EXPORT);
			setState(180);
			match(CLASS);
			setState(181);
			match(IDENTIFIER);
			setState(182);
			match(CURLY_OPEN_BRACKET);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 4611686018427404327L) != 0)) {
				{
				{
				setState(183);
				body();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
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
	public static class BodyContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public Print_statContext print_stat() {
			return getRuleContext(Print_statContext.class,0);
		}
		public Print_errorContext print_error() {
			return getRuleContext(Print_errorContext.class,0);
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
		enterRule(_localctx, 22, RULE_body);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				print_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				print_error();
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
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(MyParser.STRING, 0); }
		public TerminalNode NUMBER_VAL() { return getToken(MyParser.NUMBER_VAL, 0); }
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
		enterRule(_localctx, 24, RULE_print_error);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(CONSOLE);
			setState(200);
			match(DOT);
			setState(201);
			match(ERROR);
			setState(202);
			match(OPEN_BRACKET);
			setState(203);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 262147L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(204);
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
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(MyParser.STRING, 0); }
		public TerminalNode NUMBER_VAL() { return getToken(MyParser.NUMBER_VAL, 0); }
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
		enterRule(_localctx, 26, RULE_print_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(CONSOLE);
			setState(207);
			match(DOT);
			setState(208);
			match(LOG);
			setState(209);
			match(OPEN_BRACKET);
			setState(210);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 262147L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(211);
			match(CLOSE_BRACKET);
			setState(212);
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
	public static class CallWithoutParaContext extends FunctionCallContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(MyParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(MyParser.OPEN_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(MyParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(MyParser.CLOSE_BRACKET, i);
		}
		public TerminalNode DOT() { return getToken(MyParser.DOT, 0); }
		public TerminalNode CATCH() { return getToken(MyParser.CATCH, 0); }
		public TerminalNode ARROW() { return getToken(MyParser.ARROW, 0); }
		public Print_errorContext print_error() {
			return getRuleContext(Print_errorContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public CallWithoutParaContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCallWithoutPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCallWithoutPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitCallWithoutPara(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallWithParaContext extends FunctionCallContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(MyParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(MyParser.OPEN_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(MyParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(MyParser.CLOSE_BRACKET, i);
		}
		public TerminalNode DOT() { return getToken(MyParser.DOT, 0); }
		public TerminalNode CATCH() { return getToken(MyParser.CATCH, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(MyParser.ARROW, 0); }
		public Print_errorContext print_error() {
			return getRuleContext(Print_errorContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public CallWithParaContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCallWithPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCallWithPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitCallWithPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCall);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new CallWithParaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(IDENTIFIER);
				setState(215);
				match(OPEN_BRACKET);
				setState(216);
				match(IDENTIFIER);
				setState(217);
				match(CLOSE_BRACKET);
				setState(218);
				match(DOT);
				setState(219);
				match(CATCH);
				setState(220);
				match(OPEN_BRACKET);
				setState(221);
				parameters();
				setState(222);
				match(ARROW);
				setState(223);
				print_error();
				setState(224);
				match(CLOSE_BRACKET);
				setState(225);
				match(SEMI_COLON);
				}
				break;
			case 2:
				_localctx = new CallWithoutParaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(IDENTIFIER);
				setState(228);
				match(OPEN_BRACKET);
				setState(229);
				match(IDENTIFIER);
				setState(230);
				match(CLOSE_BRACKET);
				setState(231);
				match(DOT);
				setState(232);
				match(CATCH);
				setState(233);
				match(OPEN_BRACKET);
				setState(234);
				match(IDENTIFIER);
				setState(235);
				match(ARROW);
				setState(236);
				print_error();
				setState(237);
				match(CLOSE_BRACKET);
				setState(238);
				match(SEMI_COLON);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	 
		public FunctionDeclarationContext() { }
		public void copyFrom(FunctionDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedFunctionDeclContext extends FunctionDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode CURLY_OPEN_BRACKET() { return getToken(MyParser.CURLY_OPEN_BRACKET, 0); }
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
		public TerminalNode FUNCTION() { return getToken(MyParser.FUNCTION, 0); }
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
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public NamedFunctionDeclContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNamedFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNamedFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNamedFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignedFunctionDeclContext extends FunctionDeclarationContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public TerminalNode FUNCTION() { return getToken(MyParser.FUNCTION, 0); }
		public TerminalNode CURLY_OPEN_BRACKET() { return getToken(MyParser.CURLY_OPEN_BRACKET, 0); }
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
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
		public AssignedFunctionDeclContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAssignedFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAssignedFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAssignedFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionAsFunctionDeclContext extends FunctionDeclarationContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public ArrowFunctionAsFunctionDeclContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterArrowFunctionAsFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitArrowFunctionAsFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitArrowFunctionAsFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDeclaration);
		int _la;
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new NamedFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION) {
					{
					setState(242);
					match(FUNCTION);
					}
				}

				setState(245);
				match(IDENTIFIER);
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(246);
					parameters();
					}
					break;
				case 2:
					{
					{
					setState(247);
					match(OPEN_BRACKET);
					setState(248);
					match(CLOSE_BRACKET);
					}
					}
					break;
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(251);
					match(COLON);
					setState(252);
					type();
					}
				}

				setState(255);
				match(CURLY_OPEN_BRACKET);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 4611686018427404327L) != 0)) {
					{
					{
					setState(256);
					body();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(CURLY_CLOSE_BRACKET);
				}
				break;
			case 2:
				_localctx = new ArrowFunctionAsFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				arrowFunction();
				}
				break;
			case 3:
				_localctx = new AssignedFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				variable_type();
				setState(265);
				match(IDENTIFIER);
				setState(266);
				match(EQUAL);
				setState(267);
				match(FUNCTION);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(268);
					parameters();
					}
				}

				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(271);
					match(COLON);
					setState(272);
					type();
					}
				}

				setState(275);
				match(CURLY_OPEN_BRACKET);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 4611686018427404327L) != 0)) {
					{
					{
					setState(276);
					body();
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(282);
				match(CURLY_CLOSE_BRACKET);
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
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParaWithoutTypeContext extends ParametersContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
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
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(MyParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(MyParser.EQUAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public List<TerminalNode> STRING() { return getTokens(MyParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyParser.STRING, i);
		}
		public List<TerminalNode> NUMBER_VAL() { return getTokens(MyParser.NUMBER_VAL); }
		public TerminalNode NUMBER_VAL(int i) {
			return getToken(MyParser.NUMBER_VAL, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(MyParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(MyParser.BOOLEAN, i);
		}
		public ParaWithoutTypeContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterParaWithoutType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitParaWithoutType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitParaWithoutType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParaWithTypeContext extends ParametersContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
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
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public ParaWithTypeContext(ParametersContext ctx) { copyFrom(ctx); }
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

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameters);
		int _la;
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new ParaWithTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(OPEN_BRACKET);
				setState(287);
				match(IDENTIFIER);
				setState(288);
				match(COLON);
				setState(289);
				type();
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(290);
					match(COMMA);
					setState(291);
					match(IDENTIFIER);
					setState(292);
					match(COLON);
					setState(293);
					type();
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(299);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				_localctx = new ParaWithoutTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(OPEN_BRACKET);
				setState(302);
				match(IDENTIFIER);
				setState(303);
				match(COLON);
				setState(304);
				type();
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(305);
					match(EQUAL);
					setState(306);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(309);
					match(COMMA);
					setState(310);
					match(IDENTIFIER);
					setState(311);
					match(COLON);
					setState(312);
					type();
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQUAL) {
						{
						setState(313);
						match(EQUAL);
						setState(314);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) ) {
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
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(322);
				match(CLOSE_BRACKET);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(MyParser.DOT, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment);
		int _la;
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new SimpleAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(IDENTIFIER);
				setState(327);
				match(EQUAL);
				setState(328);
				expression();
				setState(329);
				match(SEMI_COLON);
				}
				break;
			case 2:
				_localctx = new DotAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(IDENTIFIER);
				setState(332);
				match(DOT);
				setState(333);
				match(IDENTIFIER);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(334);
					match(EQUAL);
					setState(335);
					type();
					}
				}

				setState(338);
				match(SEMI_COLON);
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
	public static class TemplateExpressionContext extends ParserRuleContext {
		public TerminalNode CURLY_OPEN_BRACKET() { return getToken(MyParser.CURLY_OPEN_BRACKET, 0); }
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
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
		enterRule(_localctx, 36, RULE_templateExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(CURLY_OPEN_BRACKET);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(342);
					types();
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(348);
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
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				marks();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(353);
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
		enterRule(_localctx, 40, RULE_htmlDeclare);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				normalHtmlTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
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
		enterRule(_localctx, 42, RULE_normalHtmlTag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			openTag();
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(361);
					types();
					}
					} 
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(367);
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
		enterRule(_localctx, 44, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(LT);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 301740195513884929L) != 0)) {
				{
				{
				setState(370);
				types();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			match(SLASH);
			setState(377);
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
		enterRule(_localctx, 46, RULE_openTag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(LT);
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(380);
					types();
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(386);
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
		enterRule(_localctx, 48, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(LT);
			setState(389);
			match(SLASH);
			setState(390);
			match(IDENTIFIER);
			setState(391);
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
		enterRule(_localctx, 50, RULE_type);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				arrayStringType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				arrayNumberType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
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
		enterRule(_localctx, 52, RULE_primitiveType);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				_localctx = new NumberPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(NUMBER);
				}
				break;
			case VOID:
				_localctx = new VoidPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				match(VOID);
				}
				break;
			case NULL:
				_localctx = new NullPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				match(NULL);
				}
				break;
			case ANY:
				_localctx = new AnyPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(403);
				match(ANY);
				}
				break;
			case STRING_EX:
				_localctx = new StringEXPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(404);
				match(STRING_EX);
				}
				break;
			case CLASS:
				_localctx = new ClassPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(405);
				match(CLASS);
				}
				break;
			case CURLY_OPEN_BRACKET:
				_localctx = new TemplateExPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(406);
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
		enterRule(_localctx, 54, RULE_arrayStringType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(ARRAY);
			setState(410);
			match(LT);
			setState(411);
			match(STRING_EX);
			setState(412);
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
		enterRule(_localctx, 56, RULE_arrayNumberType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(NUMBER);
			setState(415);
			match(SQUARE_OPEN_BRACKET);
			setState(416);
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
		enterRule(_localctx, 58, RULE_tupleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(SQUARE_OPEN_BRACKET);
			setState(419);
			type();
			setState(422); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(420);
				match(COMMA);
				setState(421);
				type();
				}
				}
				setState(424); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(426);
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
		public TerminalNode PLUS() { return getToken(MyParser.PLUS, 0); }
		public TerminalNode MIN() { return getToken(MyParser.MIN, 0); }
		public TerminalNode S_DOlOR() { return getToken(MyParser.S_DOlOR, 0); }
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(MyParser.SQUARE_OPEN_BRACKET, 0); }
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(MyParser.SQUARE_CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public TerminalNode CURLY_OPEN_BRACKET() { return getToken(MyParser.CURLY_OPEN_BRACKET, 0); }
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
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
		enterRule(_localctx, 60, RULE_marks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1728271715806478336L) != 0)) ) {
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
		enterRule(_localctx, 62, RULE_arrayDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(SQUARE_OPEN_BRACKET);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 1099541005315L) != 0)) {
				{
				setState(431);
				expression();
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(432);
					match(COMMA);
					setState(433);
					expression();
					setState(437);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(434);
							match(COMMA);
							}
							} 
						}
						setState(439);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
					}
					}
					}
					setState(444);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(447);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(MyParser.STRING, 0); }
		public StringExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveExprContext extends ExpressionContext {
		public DirectivesStatmentContext directivesStatment() {
			return getRuleContext(DirectivesStatmentContext.class,0);
		}
		public DirectiveExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterDirectiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitDirectiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitDirectiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprContext extends ExpressionContext {
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public ArrayExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExprContext extends ExpressionContext {
		public TerminalNode CURLY_OPEN_BRACKET() { return getToken(MyParser.CURLY_OPEN_BRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(MyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MyParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CURLY_CLOSE_BRACKET() { return getToken(MyParser.CURLY_CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public ObjectExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterObjectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitObjectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitObjectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExprContext extends ExpressionContext {
		public TerminalNode NUMBER_VAL() { return getToken(MyParser.NUMBER_VAL, 0); }
		public NumberExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExprContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(MyParser.BOOLEAN, 0); }
		public BooleanExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitBooleanExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseExprContext extends ExpressionContext {
		public IfElseStatContext ifElseStat() {
			return getRuleContext(IfElseStatContext.class,0);
		}
		public IfElseExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIfElseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIfElseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitIfElseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expression);
		int _la;
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(STRING);
				}
				break;
			case NUMBER_VAL:
				_localctx = new NumberExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(NUMBER_VAL);
				}
				break;
			case SQUARE_OPEN_BRACKET:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				arrayDeclaration();
				}
				break;
			case IDENTIFIER:
				_localctx = new IfElseExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(452);
				ifElseStat();
				}
				break;
			case CURLY_OPEN_BRACKET:
				_localctx = new ObjectExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(453);
				match(CURLY_OPEN_BRACKET);
				setState(454);
				match(IDENTIFIER);
				setState(455);
				match(COLON);
				setState(456);
				expression();
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(457);
					match(COMMA);
					setState(458);
					match(IDENTIFIER);
					setState(459);
					match(COLON);
					setState(460);
					expression();
					}
					}
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(466);
				match(CURLY_CLOSE_BRACKET);
				}
				break;
			case BOOLEAN:
				_localctx = new BooleanExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(468);
				match(BOOLEAN);
				}
				break;
			case NgFor:
			case NgIf:
				_localctx = new DirectiveExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(469);
				directivesStatment();
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
		enterRule(_localctx, 66, RULE_directivesStatment);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NgFor:
				_localctx = new NgForDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(NgFor);
				setState(473);
				match(EQUAL1);
				setState(474);
				ngForValue();
				}
				break;
			case NgIf:
				_localctx = new NgIfDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				match(NgIf);
				setState(476);
				match(EQUAL2);
				setState(477);
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
		enterRule(_localctx, 68, RULE_ngForValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(DQUOT1);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET1) {
				{
				{
				setState(481);
				ngForExpression();
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(487);
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
		enterRule(_localctx, 70, RULE_ngForExpression);
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				match(LET1);
				setState(490);
				match(ID1);
				setState(491);
				match(OF1);
				setState(492);
				match(ID1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				match(LET1);
				setState(494);
				match(ID1);
				setState(495);
				match(EQUAL1);
				setState(496);
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
		enterRule(_localctx, 72, RULE_ngIfValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(DQUOT3);
			setState(500);
			conditionExpression();
			setState(501);
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
		public TerminalNode GT1() { return getToken(MyParser.GT1, 0); }
		public TerminalNode NUMBER_VAL1() { return getToken(MyParser.NUMBER_VAL1, 0); }
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
		enterRule(_localctx, 74, RULE_conditionExpression);
		int _la;
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new EqualNullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(ID2);
				setState(504);
				equalOperation();
				setState(505);
				match(NULL1);
				}
				break;
			case 2:
				_localctx = new ComparisonExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				logicalTerm();
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 4196225L) != 0)) {
					{
					setState(510);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GT1) {
						{
						setState(508);
						match(GT1);
						setState(509);
						match(NUMBER_VAL1);
						}
					}

					setState(512);
					equalOperation();
					setState(513);
					match(ID2);
					}
				}

				}
				break;
			case 3:
				_localctx = new ComparisonWithEqualExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				logicalTerm();
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET1) {
					{
					setState(518);
					match(OPEN_BRACKET1);
					setState(519);
					match(ID2);
					setState(520);
					match(ARROW1);
					setState(521);
					logicalTerm();
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GT1) {
						{
						setState(522);
						match(GT1);
						setState(523);
						match(NUMBER_VAL1);
						}
					}

					setState(526);
					equalOperation();
					setState(527);
					match(ID2);
					setState(528);
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
		enterRule(_localctx, 76, RULE_equalOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 1921L) != 0)) ) {
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
		enterRule(_localctx, 78, RULE_logicalTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT1) {
				{
				setState(536);
				match(NOT1);
				}
			}

			setState(539);
			match(ID2);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT1) {
				{
				setState(540);
				match(DOT1);
				setState(541);
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
	public static class IfElseStatContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(MyParser.QUESTION_MARK, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public IfElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIfElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIfElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitIfElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStatContext ifElseStat() throws RecognitionException {
		IfElseStatContext _localctx = new IfElseStatContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ifElseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(IDENTIFIER);
			setState(545);
			match(QUESTION_MARK);
			setState(546);
			type();
			setState(547);
			match(COLON);
			setState(548);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 82, RULE_variable_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
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
		enterRule(_localctx, 84, RULE_unionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			type();
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIT_OR) {
				{
				setState(553);
				match(BIT_OR);
				setState(554);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypedVariableDeclContext extends VariableDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TypedVariableDeclContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
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
	public static class InferredVariableDeclContext extends VariableDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public InferredVariableDeclContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
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

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_variableDeclaration);
		int _la;
		try {
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new TypedVariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
					{
					setState(557);
					variable_type();
					}
				}

				setState(560);
				match(IDENTIFIER);
				setState(561);
				match(COLON);
				setState(562);
				unionType();
				setState(563);
				match(EQUAL);
				setState(564);
				types();
				setState(565);
				match(SEMI_COLON);
				}
				break;
			case 2:
				_localctx = new InferredVariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
					{
					setState(567);
					variable_type();
					}
				}

				setState(570);
				match(IDENTIFIER);
				setState(571);
				match(EQUAL);
				setState(572);
				expression();
				setState(573);
				match(SEMI_COLON);
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
	public static class ArrowFunctionContext extends ParserRuleContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(MyParser.ARROW, 0); }
		public ArrowBodyContext arrowBody() {
			return getRuleContext(ArrowBodyContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			variable_type();
			setState(578);
			match(IDENTIFIER);
			setState(579);
			match(EQUAL);
			setState(580);
			parameters();
			setState(581);
			match(COLON);
			setState(582);
			type();
			setState(583);
			match(ARROW);
			setState(584);
			arrowBody();
			setState(585);
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
	public static class ArrowBodyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public TerminalNode PLUS() { return getToken(MyParser.PLUS, 0); }
		public TerminalNode MIN() { return getToken(MyParser.MIN, 0); }
		public TerminalNode STRING() { return getToken(MyParser.STRING, 0); }
		public ArrowBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterArrowBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitArrowBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitArrowBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowBodyContext arrowBody() throws RecognitionException {
		ArrowBodyContext _localctx = new ArrowBodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_arrowBody);
		int _la;
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				match(IDENTIFIER);
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MIN) {
					{
					setState(588);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MIN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(589);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
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

	public static final String _serializedATN =
		"\u0004\u0001i\u0254\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0001\u0000\u0005\u0000^\b\u0000\n\u0000\f\u0000a\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001g\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002n\b"+
		"\u0002\n\u0002\f\u0002q\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003|\b\u0003\n\u0003\f\u0003\u007f\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0087\b\u0004"+
		"\n\u0004\f\u0004\u008a\t\u0004\u0001\u0004\u0003\u0004\u008d\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u009d\b\u0007\n\u0007\f\u0007\u00a0\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00a8"+
		"\b\b\u000b\b\f\b\u00a9\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0003\t\u00b2\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b9"+
		"\b\n\n\n\f\n\u00bc\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c6\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00f1\b\u000e\u0001\u000f\u0003\u000f\u00f4\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00fa\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00fe\b\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0102\b\u000f\n\u000f\f\u000f\u0105\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u010e"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0112\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u0116\b\u000f\n\u000f\f\u000f\u0119\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u011d\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0127\b\u0010\n\u0010\f\u0010\u012a\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0134\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u013c\b\u0010\u0005\u0010\u013e\b"+
		"\u0010\n\u0010\f\u0010\u0141\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0145\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0151\b\u0011\u0001\u0011\u0003\u0011\u0154\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0158\b\u0012\n\u0012\f\u0012\u015b\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0163\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0167\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u016b\b\u0015\n\u0015\f\u0015\u016e\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u0174\b\u0016"+
		"\n\u0016\f\u0016\u0177\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u017e\b\u0017\n\u0017\f\u0017\u0181\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u018e\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0198\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0004\u001d\u01a7\b\u001d\u000b\u001d\f\u001d\u01a8\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u01b4\b\u001f\n\u001f\f\u001f\u01b7\t\u001f"+
		"\u0005\u001f\u01b9\b\u001f\n\u001f\f\u001f\u01bc\t\u001f\u0003\u001f\u01be"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u01ce\b \n \f \u01d1"+
		"\t \u0001 \u0001 \u0001 \u0001 \u0003 \u01d7\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u01df\b!\u0001\"\u0001\"\u0005\"\u01e3\b\"\n\""+
		"\f\"\u01e6\t\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u01f2\b#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01ff\b%\u0001%\u0001%\u0001"+
		"%\u0003%\u0204\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u020d\b%\u0001%\u0001%\u0001%\u0001%\u0003%\u0213\b%\u0003%\u0215\b"+
		"%\u0001&\u0001&\u0001\'\u0003\'\u021a\b\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u021f\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0003*\u022c\b*\u0001+\u0003+\u022f\b+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0239\b+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0003+\u0240\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0003-\u024f\b-\u0001"+
		"-\u0003-\u0252\b-\u0001-\u0000\u0000.\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\u0000\u0006\u0002\u0000/0AA\u0001\u0000/1\u0004\u0000#(*+2"+
		":<<\u0002\u0000KKRU\u0001\u0000\u0003\u0005\u0001\u00009:\u0278\u0000"+
		"_\u0001\u0000\u0000\u0000\u0002f\u0001\u0000\u0000\u0000\u0004h\u0001"+
		"\u0000\u0000\u0000\u0006w\u0001\u0000\u0000\u0000\b\u0083\u0001\u0000"+
		"\u0000\u0000\n\u008e\u0001\u0000\u0000\u0000\f\u0092\u0001\u0000\u0000"+
		"\u0000\u000e\u0096\u0001\u0000\u0000\u0000\u0010\u00a3\u0001\u0000\u0000"+
		"\u0000\u0012\u00b1\u0001\u0000\u0000\u0000\u0014\u00b3\u0001\u0000\u0000"+
		"\u0000\u0016\u00c5\u0001\u0000\u0000\u0000\u0018\u00c7\u0001\u0000\u0000"+
		"\u0000\u001a\u00ce\u0001\u0000\u0000\u0000\u001c\u00f0\u0001\u0000\u0000"+
		"\u0000\u001e\u011c\u0001\u0000\u0000\u0000 \u0144\u0001\u0000\u0000\u0000"+
		"\"\u0153\u0001\u0000\u0000\u0000$\u0155\u0001\u0000\u0000\u0000&\u0162"+
		"\u0001\u0000\u0000\u0000(\u0166\u0001\u0000\u0000\u0000*\u0168\u0001\u0000"+
		"\u0000\u0000,\u0171\u0001\u0000\u0000\u0000.\u017b\u0001\u0000\u0000\u0000"+
		"0\u0184\u0001\u0000\u0000\u00002\u018d\u0001\u0000\u0000\u00004\u0197"+
		"\u0001\u0000\u0000\u00006\u0199\u0001\u0000\u0000\u00008\u019e\u0001\u0000"+
		"\u0000\u0000:\u01a2\u0001\u0000\u0000\u0000<\u01ac\u0001\u0000\u0000\u0000"+
		">\u01ae\u0001\u0000\u0000\u0000@\u01d6\u0001\u0000\u0000\u0000B\u01de"+
		"\u0001\u0000\u0000\u0000D\u01e0\u0001\u0000\u0000\u0000F\u01f1\u0001\u0000"+
		"\u0000\u0000H\u01f3\u0001\u0000\u0000\u0000J\u0214\u0001\u0000\u0000\u0000"+
		"L\u0216\u0001\u0000\u0000\u0000N\u0219\u0001\u0000\u0000\u0000P\u0220"+
		"\u0001\u0000\u0000\u0000R\u0226\u0001\u0000\u0000\u0000T\u0228\u0001\u0000"+
		"\u0000\u0000V\u023f\u0001\u0000\u0000\u0000X\u0241\u0001\u0000\u0000\u0000"+
		"Z\u0251\u0001\u0000\u0000\u0000\\^\u0003\u0002\u0001\u0000]\\\u0001\u0000"+
		"\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`\u0001\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000bg\u0003\u0004\u0002\u0000cg\u0003\u0006\u0003\u0000dg\u0003\u0014"+
		"\n\u0000eg\u0003\u001c\u000e\u0000fb\u0001\u0000\u0000\u0000fc\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000g\u0003"+
		"\u0001\u0000\u0000\u0000hi\u0005\u0001\u0000\u0000ij\u0005\'\u0000\u0000"+
		"jo\u0005A\u0000\u0000kl\u00053\u0000\u0000ln\u0005A\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000rs\u0005(\u0000\u0000st\u0005\u0002\u0000\u0000tu\u0005/\u0000\u0000"+
		"uv\u00052\u0000\u0000v\u0005\u0001\u0000\u0000\u0000wx\u0005\t\u0000\u0000"+
		"xy\u0005%\u0000\u0000y}\u0005\'\u0000\u0000z|\u0003\b\u0004\u0000{z\u0001"+
		"\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u0080\u0081\u0005(\u0000\u0000\u0081\u0082\u0005"+
		"&\u0000\u0000\u0082\u0007\u0001\u0000\u0000\u0000\u0083\u0088\u0003\u0012"+
		"\t\u0000\u0084\u0085\u00053\u0000\u0000\u0085\u0087\u0003\u0012\t\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000"+
		"\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\u00053\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\t\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005\n\u0000\u0000\u008f\u0090\u00054\u0000\u0000\u0090\u0091\u0005"+
		"/\u0000\u0000\u0091\u000b\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u000b"+
		"\u0000\u0000\u0093\u0094\u00054\u0000\u0000\u0094\u0095\u00051\u0000\u0000"+
		"\u0095\r\u0001\u0000\u0000\u0000\u0096\u0097\u0005\f\u0000\u0000\u0097"+
		"\u0098\u00054\u0000\u0000\u0098\u0099\u0005#\u0000\u0000\u0099\u009e\u0005"+
		"A\u0000\u0000\u009a\u009b\u00053\u0000\u0000\u009b\u009d\u0005A\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0005$\u0000\u0000\u00a2\u000f\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0005\r\u0000\u0000\u00a4\u00a5\u00054\u0000\u0000\u00a5"+
		"\u00a7\u0005.\u0000\u0000\u00a6\u00a8\u0003(\u0014\u0000\u00a7\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005.\u0000\u0000\u00ac\u0011\u0001\u0000"+
		"\u0000\u0000\u00ad\u00b2\u0003\n\u0005\u0000\u00ae\u00b2\u0003\f\u0006"+
		"\u0000\u00af\u00b2\u0003\u000e\u0007\u0000\u00b0\u00b2\u0003\u0010\b\u0000"+
		"\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b2\u0013\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u000e\u0000\u0000"+
		"\u00b4\u00b5\u0005\u000f\u0000\u0000\u00b5\u00b6\u0005A\u0000\u0000\u00b6"+
		"\u00ba\u0005\'\u0000\u0000\u00b7\u00b9\u0003\u0016\u000b\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0005(\u0000\u0000\u00be\u0015\u0001\u0000\u0000\u0000\u00bf\u00c6\u0003"+
		"V+\u0000\u00c0\u00c6\u0003\u001e\u000f\u0000\u00c1\u00c6\u0003\"\u0011"+
		"\u0000\u00c2\u00c6\u0003\u001c\u000e\u0000\u00c3\u00c6\u0003\u001a\r\u0000"+
		"\u00c4\u00c6\u0003\u0018\f\u0000\u00c5\u00bf\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u0017\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0005\u0011\u0000\u0000\u00c8\u00c9\u00055\u0000\u0000\u00c9\u00ca"+
		"\u0005\u0012\u0000\u0000\u00ca\u00cb\u0005%\u0000\u0000\u00cb\u00cc\u0007"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005&\u0000\u0000\u00cd\u0019\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0005\u0011\u0000\u0000\u00cf\u00d0\u00055\u0000"+
		"\u0000\u00d0\u00d1\u0005\u0013\u0000\u0000\u00d1\u00d2\u0005%\u0000\u0000"+
		"\u00d2\u00d3\u0007\u0000\u0000\u0000\u00d3\u00d4\u0005&\u0000\u0000\u00d4"+
		"\u00d5\u00052\u0000\u0000\u00d5\u001b\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0005A\u0000\u0000\u00d7\u00d8\u0005%\u0000\u0000\u00d8\u00d9\u0005A"+
		"\u0000\u0000\u00d9\u00da\u0005&\u0000\u0000\u00da\u00db\u00055\u0000\u0000"+
		"\u00db\u00dc\u0005\u0010\u0000\u0000\u00dc\u00dd\u0005%\u0000\u0000\u00dd"+
		"\u00de\u0003 \u0010\u0000\u00de\u00df\u0005)\u0000\u0000\u00df\u00e0\u0003"+
		"\u0018\f\u0000\u00e0\u00e1\u0005&\u0000\u0000\u00e1\u00e2\u00052\u0000"+
		"\u0000\u00e2\u00f1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005A\u0000\u0000"+
		"\u00e4\u00e5\u0005%\u0000\u0000\u00e5\u00e6\u0005A\u0000\u0000\u00e6\u00e7"+
		"\u0005&\u0000\u0000\u00e7\u00e8\u00055\u0000\u0000\u00e8\u00e9\u0005\u0010"+
		"\u0000\u0000\u00e9\u00ea\u0005%\u0000\u0000\u00ea\u00eb\u0005A\u0000\u0000"+
		"\u00eb\u00ec\u0005)\u0000\u0000\u00ec\u00ed\u0003\u0018\f\u0000\u00ed"+
		"\u00ee\u0005&\u0000\u0000\u00ee\u00ef\u00052\u0000\u0000\u00ef\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f0\u00d6\u0001\u0000\u0000\u0000\u00f0\u00e3\u0001"+
		"\u0000\u0000\u0000\u00f1\u001d\u0001\u0000\u0000\u0000\u00f2\u00f4\u0005"+
		"\b\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f9\u0005A\u0000"+
		"\u0000\u00f6\u00fa\u0003 \u0010\u0000\u00f7\u00f8\u0005%\u0000\u0000\u00f8"+
		"\u00fa\u0005&\u0000\u0000\u00f9\u00f6\u0001\u0000\u0000\u0000\u00f9\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u00054\u0000\u0000\u00fc\u00fe\u0003"+
		"2\u0019\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0103\u0005\'\u0000"+
		"\u0000\u0100\u0102\u0003\u0016\u000b\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0106\u0001\u0000\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u011d\u0005(\u0000\u0000"+
		"\u0107\u011d\u0003X,\u0000\u0108\u0109\u0003R)\u0000\u0109\u010a\u0005"+
		"A\u0000\u0000\u010a\u010b\u00058\u0000\u0000\u010b\u010d\u0005\b\u0000"+
		"\u0000\u010c\u010e\u0003 \u0010\u0000\u010d\u010c\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u00054\u0000\u0000\u0110\u0112\u00032\u0019\u0000\u0111\u010f"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113\u0117\u0005\'\u0000\u0000\u0114\u0116\u0003"+
		"\u0016\u000b\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0119\u0001"+
		"\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u0117\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0005(\u0000\u0000\u011b\u011d\u0001\u0000"+
		"\u0000\u0000\u011c\u00f3\u0001\u0000\u0000\u0000\u011c\u0107\u0001\u0000"+
		"\u0000\u0000\u011c\u0108\u0001\u0000\u0000\u0000\u011d\u001f\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0005%\u0000\u0000\u011f\u0120\u0005A\u0000\u0000"+
		"\u0120\u0121\u00054\u0000\u0000\u0121\u0128\u00032\u0019\u0000\u0122\u0123"+
		"\u00053\u0000\u0000\u0123\u0124\u0005A\u0000\u0000\u0124\u0125\u00054"+
		"\u0000\u0000\u0125\u0127\u00032\u0019\u0000\u0126\u0122\u0001\u0000\u0000"+
		"\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012b\u0001\u0000\u0000"+
		"\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u012c\u0005&\u0000\u0000"+
		"\u012c\u0145\u0001\u0000\u0000\u0000\u012d\u012e\u0005%\u0000\u0000\u012e"+
		"\u012f\u0005A\u0000\u0000\u012f\u0130\u00054\u0000\u0000\u0130\u0133\u0003"+
		"2\u0019\u0000\u0131\u0132\u00058\u0000\u0000\u0132\u0134\u0007\u0001\u0000"+
		"\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000"+
		"\u0000\u0134\u013f\u0001\u0000\u0000\u0000\u0135\u0136\u00053\u0000\u0000"+
		"\u0136\u0137\u0005A\u0000\u0000\u0137\u0138\u00054\u0000\u0000\u0138\u013b"+
		"\u00032\u0019\u0000\u0139\u013a\u00058\u0000\u0000\u013a\u013c\u0007\u0001"+
		"\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000"+
		"\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u0135\u0001\u0000"+
		"\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0142\u0001\u0000"+
		"\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0143\u0005&\u0000"+
		"\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u011e\u0001\u0000\u0000"+
		"\u0000\u0144\u012d\u0001\u0000\u0000\u0000\u0145!\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0005A\u0000\u0000\u0147\u0148\u00058\u0000\u0000\u0148\u0149"+
		"\u0003@ \u0000\u0149\u014a\u00052\u0000\u0000\u014a\u0154\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0005A\u0000\u0000\u014c\u014d\u00055\u0000\u0000"+
		"\u014d\u0150\u0005A\u0000\u0000\u014e\u014f\u00058\u0000\u0000\u014f\u0151"+
		"\u00032\u0019\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0154\u0005"+
		"2\u0000\u0000\u0153\u0146\u0001\u0000\u0000\u0000\u0153\u014b\u0001\u0000"+
		"\u0000\u0000\u0154#\u0001\u0000\u0000\u0000\u0155\u0159\u0005\'\u0000"+
		"\u0000\u0156\u0158\u0003&\u0013\u0000\u0157\u0156\u0001\u0000\u0000\u0000"+
		"\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000"+
		"\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0005(\u0000\u0000\u015d"+
		"%\u0001\u0000\u0000\u0000\u015e\u0163\u00032\u0019\u0000\u015f\u0163\u0003"+
		"<\u001e\u0000\u0160\u0163\u0003@ \u0000\u0161\u0163\u0003(\u0014\u0000"+
		"\u0162\u015e\u0001\u0000\u0000\u0000\u0162\u015f\u0001\u0000\u0000\u0000"+
		"\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000"+
		"\u0163\'\u0001\u0000\u0000\u0000\u0164\u0167\u0003*\u0015\u0000\u0165"+
		"\u0167\u0003,\u0016\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0165"+
		"\u0001\u0000\u0000\u0000\u0167)\u0001\u0000\u0000\u0000\u0168\u016c\u0003"+
		".\u0017\u0000\u0169\u016b\u0003&\u0013\u0000\u016a\u0169\u0001\u0000\u0000"+
		"\u0000\u016b\u016e\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000"+
		"\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016f\u0001\u0000\u0000"+
		"\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f\u0170\u00030\u0018\u0000"+
		"\u0170+\u0001\u0000\u0000\u0000\u0171\u0175\u0005*\u0000\u0000\u0172\u0174"+
		"\u0003&\u0013\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0177\u0001"+
		"\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001"+
		"\u0000\u0000\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0175\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0005,\u0000\u0000\u0179\u017a\u0005+\u0000"+
		"\u0000\u017a-\u0001\u0000\u0000\u0000\u017b\u017f\u0005*\u0000\u0000\u017c"+
		"\u017e\u0003&\u0013\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e\u0181"+
		"\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180"+
		"\u0001\u0000\u0000\u0000\u0180\u0182\u0001\u0000\u0000\u0000\u0181\u017f"+
		"\u0001\u0000\u0000\u0000\u0182\u0183\u0005+\u0000\u0000\u0183/\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0005*\u0000\u0000\u0185\u0186\u0005,\u0000\u0000"+
		"\u0186\u0187\u0005A\u0000\u0000\u0187\u0188\u0005+\u0000\u0000\u01881"+
		"\u0001\u0000\u0000\u0000\u0189\u018e\u00034\u001a\u0000\u018a\u018e\u0003"+
		"6\u001b\u0000\u018b\u018e\u00038\u001c\u0000\u018c\u018e\u0003:\u001d"+
		"\u0000\u018d\u0189\u0001\u0000\u0000\u0000\u018d\u018a\u0001\u0000\u0000"+
		"\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018c\u0001\u0000\u0000"+
		"\u0000\u018e3\u0001\u0000\u0000\u0000\u018f\u0198\u0005A\u0000\u0000\u0190"+
		"\u0198\u0005\u0015\u0000\u0000\u0191\u0198\u0005\u0017\u0000\u0000\u0192"+
		"\u0198\u0005\u0018\u0000\u0000\u0193\u0198\u0005\u0014\u0000\u0000\u0194"+
		"\u0198\u0005\u0016\u0000\u0000\u0195\u0198\u0005\u000f\u0000\u0000\u0196"+
		"\u0198\u0003$\u0012\u0000\u0197\u018f\u0001\u0000\u0000\u0000\u0197\u0190"+
		"\u0001\u0000\u0000\u0000\u0197\u0191\u0001\u0000\u0000\u0000\u0197\u0192"+
		"\u0001\u0000\u0000\u0000\u0197\u0193\u0001\u0000\u0000\u0000\u0197\u0194"+
		"\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0196"+
		"\u0001\u0000\u0000\u0000\u01985\u0001\u0000\u0000\u0000\u0199\u019a\u0005"+
		"\u0007\u0000\u0000\u019a\u019b\u0005*\u0000\u0000\u019b\u019c\u0005\u0016"+
		"\u0000\u0000\u019c\u019d\u0005+\u0000\u0000\u019d7\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0005\u0015\u0000\u0000\u019f\u01a0\u0005#\u0000\u0000\u01a0"+
		"\u01a1\u0005$\u0000\u0000\u01a19\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005"+
		"#\u0000\u0000\u01a3\u01a6\u00032\u0019\u0000\u01a4\u01a5\u00053\u0000"+
		"\u0000\u01a5\u01a7\u00032\u0019\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0005$\u0000\u0000\u01ab;\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0007\u0002\u0000\u0000\u01ad=\u0001\u0000\u0000\u0000\u01ae\u01bd\u0005"+
		"#\u0000\u0000\u01af\u01ba\u0003@ \u0000\u01b0\u01b1\u00053\u0000\u0000"+
		"\u01b1\u01b5\u0003@ \u0000\u01b2\u01b4\u00053\u0000\u0000\u01b3\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000\u01b5\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01be"+
		"\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01af"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005$\u0000\u0000\u01c0?\u0001\u0000"+
		"\u0000\u0000\u01c1\u01d7\u0005/\u0000\u0000\u01c2\u01d7\u00050\u0000\u0000"+
		"\u01c3\u01d7\u0003>\u001f\u0000\u01c4\u01d7\u0003P(\u0000\u01c5\u01c6"+
		"\u0005\'\u0000\u0000\u01c6\u01c7\u0005A\u0000\u0000\u01c7\u01c8\u0005"+
		"4\u0000\u0000\u01c8\u01cf\u0003@ \u0000\u01c9\u01ca\u00053\u0000\u0000"+
		"\u01ca\u01cb\u0005A\u0000\u0000\u01cb\u01cc\u00054\u0000\u0000\u01cc\u01ce"+
		"\u0003@ \u0000\u01cd\u01c9\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000"+
		"\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d3\u0005(\u0000\u0000\u01d3\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d7\u00051\u0000\u0000\u01d5\u01d7\u0003B!\u0000\u01d6"+
		"\u01c1\u0001\u0000\u0000\u0000\u01d6\u01c2\u0001\u0000\u0000\u0000\u01d6"+
		"\u01c3\u0001\u0000\u0000\u0000\u01d6\u01c4\u0001\u0000\u0000\u0000\u01d6"+
		"\u01c5\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d7A\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0005\u0019\u0000\u0000\u01d9\u01da\u0005C\u0000\u0000\u01da\u01df\u0003"+
		"D\"\u0000\u01db\u01dc\u0005\u001a\u0000\u0000\u01dc\u01dd\u0005K\u0000"+
		"\u0000\u01dd\u01df\u0003H$\u0000\u01de\u01d8\u0001\u0000\u0000\u0000\u01de"+
		"\u01db\u0001\u0000\u0000\u0000\u01dfC\u0001\u0000\u0000\u0000\u01e0\u01e4"+
		"\u0005D\u0000\u0000\u01e1\u01e3\u0003F#\u0000\u01e2\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e7\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005H\u0000"+
		"\u0000\u01e8E\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005E\u0000\u0000\u01ea"+
		"\u01eb\u0005G\u0000\u0000\u01eb\u01ec\u0005F\u0000\u0000\u01ec\u01f2\u0005"+
		"G\u0000\u0000\u01ed\u01ee\u0005E\u0000\u0000\u01ee\u01ef\u0005G\u0000"+
		"\u0000\u01ef\u01f0\u0005C\u0000\u0000\u01f0\u01f2\u0005G\u0000\u0000\u01f1"+
		"\u01e9\u0001\u0000\u0000\u0000\u01f1\u01ed\u0001\u0000\u0000\u0000\u01f2"+
		"G\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005M\u0000\u0000\u01f4\u01f5\u0003"+
		"J%\u0000\u01f5\u01f6\u0005i\u0000\u0000\u01f6I\u0001\u0000\u0000\u0000"+
		"\u01f7\u01f8\u0005h\u0000\u0000\u01f8\u01f9\u0003L&\u0000\u01f9\u01fa"+
		"\u0005L\u0000\u0000\u01fa\u0215\u0001\u0000\u0000\u0000\u01fb\u0203\u0003"+
		"N\'\u0000\u01fc\u01fd\u0005a\u0000\u0000\u01fd\u01ff\u0005J\u0000\u0000"+
		"\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0201\u0003L&\u0000\u0201\u0202"+
		"\u0005h\u0000\u0000\u0202\u0204\u0001\u0000\u0000\u0000\u0203\u01fe\u0001"+
		"\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0215\u0001"+
		"\u0000\u0000\u0000\u0205\u0212\u0003N\'\u0000\u0206\u0207\u0005d\u0000"+
		"\u0000\u0207\u0208\u0005h\u0000\u0000\u0208\u0209\u0005_\u0000\u0000\u0209"+
		"\u020c\u0003N\'\u0000\u020a\u020b\u0005a\u0000\u0000\u020b\u020d\u0005"+
		"J\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0003L&\u0000"+
		"\u020f\u0210\u0005h\u0000\u0000\u0210\u0211\u0005e\u0000\u0000\u0211\u0213"+
		"\u0001\u0000\u0000\u0000\u0212\u0206\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u0001\u0000\u0000\u0000\u0213\u0215\u0001\u0000\u0000\u0000\u0214\u01f7"+
		"\u0001\u0000\u0000\u0000\u0214\u01fb\u0001\u0000\u0000\u0000\u0214\u0205"+
		"\u0001\u0000\u0000\u0000\u0215K\u0001\u0000\u0000\u0000\u0216\u0217\u0007"+
		"\u0003\u0000\u0000\u0217M\u0001\u0000\u0000\u0000\u0218\u021a\u0005Q\u0000"+
		"\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021e\u0005h\u0000\u0000"+
		"\u021c\u021d\u0005]\u0000\u0000\u021d\u021f\u0005h\u0000\u0000\u021e\u021c"+
		"\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021fO\u0001"+
		"\u0000\u0000\u0000\u0220\u0221\u0005A\u0000\u0000\u0221\u0222\u00056\u0000"+
		"\u0000\u0222\u0223\u00032\u0019\u0000\u0223\u0224\u00054\u0000\u0000\u0224"+
		"\u0225\u00032\u0019\u0000\u0225Q\u0001\u0000\u0000\u0000\u0226\u0227\u0007"+
		"\u0004\u0000\u0000\u0227S\u0001\u0000\u0000\u0000\u0228\u022b\u00032\u0019"+
		"\u0000\u0229\u022a\u0005\u001b\u0000\u0000\u022a\u022c\u00032\u0019\u0000"+
		"\u022b\u0229\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000"+
		"\u022cU\u0001\u0000\u0000\u0000\u022d\u022f\u0003R)\u0000\u022e\u022d"+
		"\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0230"+
		"\u0001\u0000\u0000\u0000\u0230\u0231\u0005A\u0000\u0000\u0231\u0232\u0005"+
		"4\u0000\u0000\u0232\u0233\u0003T*\u0000\u0233\u0234\u00058\u0000\u0000"+
		"\u0234\u0235\u0003&\u0013\u0000\u0235\u0236\u00052\u0000\u0000\u0236\u0240"+
		"\u0001\u0000\u0000\u0000\u0237\u0239\u0003R)\u0000\u0238\u0237\u0001\u0000"+
		"\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000"+
		"\u0000\u0000\u023a\u023b\u0005A\u0000\u0000\u023b\u023c\u00058\u0000\u0000"+
		"\u023c\u023d\u0003@ \u0000\u023d\u023e\u00052\u0000\u0000\u023e\u0240"+
		"\u0001\u0000\u0000\u0000\u023f\u022e\u0001\u0000\u0000\u0000\u023f\u0238"+
		"\u0001\u0000\u0000\u0000\u0240W\u0001\u0000\u0000\u0000\u0241\u0242\u0003"+
		"R)\u0000\u0242\u0243\u0005A\u0000\u0000\u0243\u0244\u00058\u0000\u0000"+
		"\u0244\u0245\u0003 \u0010\u0000\u0245\u0246\u00054\u0000\u0000\u0246\u0247"+
		"\u00032\u0019\u0000\u0247\u0248\u0005)\u0000\u0000\u0248\u0249\u0003Z"+
		"-\u0000\u0249\u024a\u00052\u0000\u0000\u024aY\u0001\u0000\u0000\u0000"+
		"\u024b\u024e\u0005A\u0000\u0000\u024c\u024d\u0007\u0005\u0000\u0000\u024d"+
		"\u024f\u0005A\u0000\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024e\u024f"+
		"\u0001\u0000\u0000\u0000\u024f\u0252\u0001\u0000\u0000\u0000\u0250\u0252"+
		"\u0005/\u0000\u0000\u0251\u024b\u0001\u0000\u0000\u0000\u0251\u0250\u0001"+
		"\u0000\u0000\u0000\u0252[\u0001\u0000\u0000\u00009_fo}\u0088\u008c\u009e"+
		"\u00a9\u00b1\u00ba\u00c5\u00f0\u00f3\u00f9\u00fd\u0103\u010d\u0111\u0117"+
		"\u011c\u0128\u0133\u013b\u013f\u0144\u0150\u0153\u0159\u0162\u0166\u016c"+
		"\u0175\u017f\u018d\u0197\u01a8\u01b5\u01ba\u01bd\u01cf\u01d6\u01de\u01e4"+
		"\u01f1\u01fe\u0203\u020c\u0212\u0214\u0219\u021e\u022b\u022e\u0238\u023f"+
		"\u024e\u0251";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}