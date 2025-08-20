// Generated from C:/Users/ASUS/IdeaProjects/CompilerProjectFinal/src/antlr/antlr/MyParser.g4 by ANTLR 4.13.2
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
		IMPORT=1, CURLY_OPEN_BRACKET=2, IDENTIFIER=3, COMMA=4, CURLY_CLOSE_BRACKET=5, 
		FROM=6, STRING=7, SEMI_COLON=8, COMPONENT=9, OPEN_BRACKET=10, CLOSE_BRACKET=11, 
		SELECTOR=12, COLON=13, STANDALONE=14, BOOLEAN=15, IMPORTS=16, SQUARE_OPEN_BRACKET=17, 
		SQUARE_CLOSE_BRACKET=18, TEMPLATE=19, QUOT=20, EXPORT=21, CLASS=22, CONSOLE=23, 
		DOT=24, ERROR=25, NUMBER_VAL=26, LOG=27, CATCH=28, ARROW=29, FUNCTION=30, 
		EQUAL=31, AccessModifiers=32, QUESTION_MARK=33, NOT=34, PLUS=35, MIN=36, 
		CLICK=37, CLOSE_BRACKET2=38, EQUAL3=39, DQUOT5=40, ID3=41, OPEN_BRACKET2=42, 
		DQUOT6=43, LT=44, SLASH=45, GT=46, NUMBER=47, VOID=48, NULL=49, ANY=50, 
		STRING_EX=51, ARRAY=52, HASH_TAG=53, MULT=54, S_DOlOR=55, NgFor=56, EQUAL1=57, 
		NgIf=58, EQUAL2=59, DQUOT1=60, DQUOT2=61, LET1=62, ID1=63, OF1=64, DQUOT3=65, 
		DQUOT4=66, ID2=67, NULL1=68, GT1=69, NUMBER_VAL1=70, OPEN_BRACKET1=71, 
		ARROW1=72, CLOSE_BRACKET1=73, EQUAL_EQUAL1=74, EQUAL_EQUAL2=75, NOT_EQUAL1=76, 
		NOT_EQUAL2=77, NOT1=78, DOT1=79, IF=80, RETURN=81, LET=82, VAR=83, CONST=84, 
		BIT_OR=85, NEW=86;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importStatment = 2, RULE_componentDeclaration = 3, 
		RULE_componentBody = 4, RULE_selectorProperty = 5, RULE_standaloneProperty = 6, 
		RULE_importsProperty = 7, RULE_templateProperty = 8, RULE_componentEle = 9, 
		RULE_classStatment = 10, RULE_types = 11, RULE_body = 12, RULE_print_error = 13, 
		RULE_print_stat = 14, RULE_functionCall = 15, RULE_functionDeclaration = 16, 
		RULE_parameters = 17, RULE_assignment = 18, RULE_templateExpression = 19, 
		RULE_eventBinding = 20, RULE_htmlDeclare = 21, RULE_normalHtmlTag = 22, 
		RULE_selfClosingTag = 23, RULE_openTag = 24, RULE_closeTag = 25, RULE_type = 26, 
		RULE_primitiveType = 27, RULE_arrayStringType = 28, RULE_arrayNumberType = 29, 
		RULE_tupleType = 30, RULE_marks = 31, RULE_arrayDeclaration = 32, RULE_expression = 33, 
		RULE_directivesStatment = 34, RULE_ngForValue = 35, RULE_ngForExpression = 36, 
		RULE_ngIfValue = 37, RULE_conditionExpression = 38, RULE_equalOperation = 39, 
		RULE_logicalTerm = 40, RULE_ifElseStat = 41, RULE_variable_type = 42, 
		RULE_unionType = 43, RULE_newObjectFromClass = 44, RULE_variableDeclaration = 45, 
		RULE_arrowFunction = 46, RULE_arrowBody = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStatment", "componentDeclaration", "componentBody", 
			"selectorProperty", "standaloneProperty", "importsProperty", "templateProperty", 
			"componentEle", "classStatment", "types", "body", "print_error", "print_stat", 
			"functionCall", "functionDeclaration", "parameters", "assignment", "templateExpression", 
			"eventBinding", "htmlDeclare", "normalHtmlTag", "selfClosingTag", "openTag", 
			"closeTag", "type", "primitiveType", "arrayStringType", "arrayNumberType", 
			"tupleType", "marks", "arrayDeclaration", "expression", "directivesStatment", 
			"ngForValue", "ngForExpression", "ngIfValue", "conditionExpression", 
			"equalOperation", "logicalTerm", "ifElseStat", "variable_type", "unionType", 
			"newObjectFromClass", "variableDeclaration", "arrowFunction", "arrowBody"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "CURLY_OPEN_BRACKET", "IDENTIFIER", "COMMA", "CURLY_CLOSE_BRACKET", 
			"FROM", "STRING", "SEMI_COLON", "COMPONENT", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"SELECTOR", "COLON", "STANDALONE", "BOOLEAN", "IMPORTS", "SQUARE_OPEN_BRACKET", 
			"SQUARE_CLOSE_BRACKET", "TEMPLATE", "QUOT", "EXPORT", "CLASS", "CONSOLE", 
			"DOT", "ERROR", "NUMBER_VAL", "LOG", "CATCH", "ARROW", "FUNCTION", "EQUAL", 
			"AccessModifiers", "QUESTION_MARK", "NOT", "PLUS", "MIN", "CLICK", "CLOSE_BRACKET2", 
			"EQUAL3", "DQUOT5", "ID3", "OPEN_BRACKET2", "DQUOT6", "LT", "SLASH", 
			"GT", "NUMBER", "VOID", "NULL", "ANY", "STRING_EX", "ARRAY", "HASH_TAG", 
			"MULT", "S_DOlOR", "NgFor", "EQUAL1", "NgIf", "EQUAL2", "DQUOT1", "DQUOT2", 
			"LET1", "ID1", "OF1", "DQUOT3", "DQUOT4", "ID2", "NULL1", "GT1", "NUMBER_VAL1", 
			"OPEN_BRACKET1", "ARROW1", "CLOSE_BRACKET1", "EQUAL_EQUAL1", "EQUAL_EQUAL2", 
			"NOT_EQUAL1", "NOT_EQUAL2", "NOT1", "DOT1", "IF", "RETURN", "LET", "VAR", 
			"CONST", "BIT_OR", "NEW"
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2097674L) != 0)) {
				{
				{
				setState(96);
				statement();
				}
				}
				setState(101);
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
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				importStatment();
				}
				break;
			case COMPONENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				componentDeclaration();
				}
				break;
			case EXPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				classStatment();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
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
			setState(108);
			match(IMPORT);
			setState(109);
			match(CURLY_OPEN_BRACKET);
			setState(110);
			match(IDENTIFIER);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(111);
				match(COMMA);
				setState(112);
				match(IDENTIFIER);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(CURLY_CLOSE_BRACKET);
			setState(119);
			match(FROM);
			setState(120);
			match(STRING);
			setState(121);
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
		enterRule(_localctx, 6, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(COMPONENT);
			setState(124);
			match(OPEN_BRACKET);
			setState(125);
			match(CURLY_OPEN_BRACKET);
			setState(126);
			componentBody();
			setState(127);
			match(CURLY_CLOSE_BRACKET);
			setState(128);
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
			setState(130);
			componentEle();
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					match(COMMA);
					setState(132);
					componentEle();
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(138);
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
			setState(141);
			match(SELECTOR);
			setState(142);
			match(COLON);
			setState(143);
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
			setState(145);
			match(STANDALONE);
			setState(146);
			match(COLON);
			setState(147);
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
			setState(149);
			match(IMPORTS);
			setState(150);
			match(COLON);
			setState(151);
			match(SQUARE_OPEN_BRACKET);
			setState(152);
			match(IDENTIFIER);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				match(COMMA);
				setState(154);
				match(IDENTIFIER);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
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
			setState(162);
			match(TEMPLATE);
			setState(163);
			match(COLON);
			setState(164);
			match(QUOT);
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				htmlDeclare();
				}
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LT );
			setState(170);
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
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				selectorProperty();
				}
				break;
			case STANDALONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				standaloneProperty();
				}
				break;
			case IMPORTS:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				importsProperty();
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
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
			setState(178);
			match(EXPORT);
			setState(179);
			match(CLASS);
			setState(180);
			match(IDENTIFIER);
			setState(181);
			match(CURLY_OPEN_BRACKET);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 360287975634010252L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 29L) != 0)) {
				{
				{
				setState(182);
				body();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
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
		enterRule(_localctx, 22, RULE_types);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				marks();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				eventBinding();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 24, RULE_body);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				print_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				print_error();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(203);
				expression();
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
		enterRule(_localctx, 26, RULE_print_error);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(CONSOLE);
			setState(207);
			match(DOT);
			setState(208);
			match(ERROR);
			setState(209);
			match(OPEN_BRACKET);
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67109000L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(211);
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
		enterRule(_localctx, 28, RULE_print_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(CONSOLE);
			setState(214);
			match(DOT);
			setState(215);
			match(LOG);
			setState(216);
			match(OPEN_BRACKET);
			setState(217);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67109000L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(218);
			match(CLOSE_BRACKET);
			setState(219);
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
		enterRule(_localctx, 30, RULE_functionCall);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new CallWithParaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(IDENTIFIER);
				setState(222);
				match(OPEN_BRACKET);
				setState(223);
				match(IDENTIFIER);
				setState(224);
				match(CLOSE_BRACKET);
				setState(225);
				match(DOT);
				setState(226);
				match(CATCH);
				setState(227);
				match(OPEN_BRACKET);
				setState(228);
				parameters();
				setState(229);
				match(ARROW);
				setState(230);
				print_error();
				setState(231);
				match(CLOSE_BRACKET);
				setState(232);
				match(SEMI_COLON);
				}
				break;
			case 2:
				_localctx = new CallWithoutParaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(IDENTIFIER);
				setState(235);
				match(OPEN_BRACKET);
				setState(236);
				match(IDENTIFIER);
				setState(237);
				match(CLOSE_BRACKET);
				setState(238);
				match(DOT);
				setState(239);
				match(CATCH);
				setState(240);
				match(OPEN_BRACKET);
				setState(241);
				match(IDENTIFIER);
				setState(242);
				match(ARROW);
				setState(243);
				print_error();
				setState(244);
				match(CLOSE_BRACKET);
				setState(245);
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
		enterRule(_localctx, 32, RULE_functionDeclaration);
		int _la;
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new NamedFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION) {
					{
					setState(249);
					match(FUNCTION);
					}
				}

				setState(252);
				match(IDENTIFIER);
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(253);
					parameters();
					}
					break;
				case 2:
					{
					{
					setState(254);
					match(OPEN_BRACKET);
					setState(255);
					match(CLOSE_BRACKET);
					}
					}
					break;
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(258);
					match(COLON);
					setState(259);
					type();
					}
				}

				setState(262);
				match(CURLY_OPEN_BRACKET);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 360287975634010252L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 29L) != 0)) {
					{
					{
					setState(263);
					body();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
				match(CURLY_CLOSE_BRACKET);
				}
				break;
			case 2:
				_localctx = new ArrowFunctionAsFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				arrowFunction();
				}
				break;
			case 3:
				_localctx = new AssignedFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				variable_type();
				setState(272);
				match(IDENTIFIER);
				setState(273);
				match(EQUAL);
				setState(274);
				match(FUNCTION);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(275);
					parameters();
					}
				}

				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(278);
					match(COLON);
					setState(279);
					type();
					}
				}

				setState(282);
				match(CURLY_OPEN_BRACKET);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 360287975634010252L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 29L) != 0)) {
					{
					{
					setState(283);
					body();
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(289);
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
		public TerminalNode AccessModifiers() { return getToken(MyParser.AccessModifiers, 0); }
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
		public List<TerminalNode> AccessModifiers() { return getTokens(MyParser.AccessModifiers); }
		public TerminalNode AccessModifiers(int i) {
			return getToken(MyParser.AccessModifiers, i);
		}
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
		enterRule(_localctx, 34, RULE_parameters);
		int _la;
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new ParaWithTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(OPEN_BRACKET);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AccessModifiers) {
					{
					setState(294);
					match(AccessModifiers);
					}
				}

				setState(297);
				match(IDENTIFIER);
				setState(298);
				match(COLON);
				setState(299);
				type();
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(300);
					match(COMMA);
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AccessModifiers) {
						{
						setState(301);
						match(AccessModifiers);
						}
					}

					setState(304);
					match(IDENTIFIER);
					setState(305);
					match(COLON);
					setState(306);
					type();
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				_localctx = new ParaWithoutTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(OPEN_BRACKET);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AccessModifiers) {
					{
					setState(315);
					match(AccessModifiers);
					}
				}

				setState(318);
				match(IDENTIFIER);
				setState(319);
				match(COLON);
				setState(320);
				type();
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(321);
					match(EQUAL);
					setState(322);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67141760L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(325);
					match(COMMA);
					setState(326);
					match(IDENTIFIER);
					setState(327);
					match(COLON);
					setState(328);
					type();
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQUAL) {
						{
						setState(329);
						match(EQUAL);
						setState(330);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67141760L) != 0)) ) {
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
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(338);
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
		public List<TerminalNode> DOT() { return getTokens(MyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MyParser.DOT, i);
		}
		public List<TerminalNode> QUESTION_MARK() { return getTokens(MyParser.QUESTION_MARK); }
		public TerminalNode QUESTION_MARK(int i) {
			return getToken(MyParser.QUESTION_MARK, i);
		}
		public List<TerminalNode> SQUARE_OPEN_BRACKET() { return getTokens(MyParser.SQUARE_OPEN_BRACKET); }
		public TerminalNode SQUARE_OPEN_BRACKET(int i) {
			return getToken(MyParser.SQUARE_OPEN_BRACKET, i);
		}
		public List<TerminalNode> NUMBER_VAL() { return getTokens(MyParser.NUMBER_VAL); }
		public TerminalNode NUMBER_VAL(int i) {
			return getToken(MyParser.NUMBER_VAL, i);
		}
		public List<TerminalNode> SQUARE_CLOSE_BRACKET() { return getTokens(MyParser.SQUARE_CLOSE_BRACKET); }
		public TerminalNode SQUARE_CLOSE_BRACKET(int i) {
			return getToken(MyParser.SQUARE_CLOSE_BRACKET, i);
		}
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public TerminalNode NOT() { return getToken(MyParser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(MyParser.PLUS, 0); }
		public TerminalNode MIN() { return getToken(MyParser.MIN, 0); }
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
		enterRule(_localctx, 36, RULE_assignment);
		int _la;
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new SimpleAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(IDENTIFIER);
				setState(343);
				match(EQUAL);
				setState(344);
				expression();
				setState(345);
				match(SEMI_COLON);
				}
				break;
			case 2:
				_localctx = new DotAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(IDENTIFIER);
				setState(350); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(348);
					match(DOT);
					setState(349);
					match(IDENTIFIER);
					}
					}
					setState(352); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT );
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==QUESTION_MARK) {
					{
					{
					setState(354);
					match(QUESTION_MARK);
					setState(355);
					match(DOT);
					setState(356);
					match(SQUARE_OPEN_BRACKET);
					setState(357);
					match(NUMBER_VAL);
					setState(358);
					match(SQUARE_CLOSE_BRACKET);
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(364);
					match(EQUAL);
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(365);
						match(NOT);
						}
					}

					setState(368);
					type();
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PLUS || _la==MIN) {
						{
						setState(369);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MIN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(370);
						_la = _input.LA(1);
						if ( !(_la==IDENTIFIER || _la==NUMBER_VAL) ) {
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

				setState(376);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(375);
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
		enterRule(_localctx, 38, RULE_templateExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(380);
					match(CURLY_OPEN_BRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(383); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(385);
					types();
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(392); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(391);
					match(CURLY_CLOSE_BRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(394); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 40, RULE_eventBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(OPEN_BRACKET);
			setState(397);
			match(CLICK);
			setState(398);
			match(CLOSE_BRACKET2);
			setState(399);
			match(EQUAL3);
			setState(400);
			match(DQUOT5);
			setState(401);
			match(ID3);
			setState(402);
			match(OPEN_BRACKET2);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID3) {
				{
				setState(403);
				match(ID3);
				}
			}

			setState(406);
			match(CLOSE_BRACKET2);
			setState(407);
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
		enterRule(_localctx, 42, RULE_htmlDeclare);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				normalHtmlTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
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
		enterRule(_localctx, 44, RULE_normalHtmlTag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			openTag();
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(414);
					types();
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(420);
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
		enterRule(_localctx, 46, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(LT);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432292918754454972L) != 0) || _la==IF) {
				{
				{
				setState(423);
				types();
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(429);
			match(SLASH);
			setState(430);
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
		enterRule(_localctx, 48, RULE_openTag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(LT);
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(433);
					types();
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(439);
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
		enterRule(_localctx, 50, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(LT);
			setState(442);
			match(SLASH);
			setState(443);
			match(IDENTIFIER);
			setState(444);
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
		enterRule(_localctx, 52, RULE_type);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				arrayStringType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				arrayNumberType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
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
		enterRule(_localctx, 54, RULE_primitiveType);
		try {
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				_localctx = new NumberPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(NUMBER);
				}
				break;
			case VOID:
				_localctx = new VoidPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
				match(VOID);
				}
				break;
			case NULL:
				_localctx = new NullPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(455);
				match(NULL);
				}
				break;
			case ANY:
				_localctx = new AnyPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(456);
				match(ANY);
				}
				break;
			case STRING_EX:
				_localctx = new StringEXPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(457);
				match(STRING_EX);
				}
				break;
			case CLASS:
				_localctx = new ClassPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(458);
				match(CLASS);
				}
				break;
			case CURLY_OPEN_BRACKET:
				_localctx = new TemplateExPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(459);
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
		enterRule(_localctx, 56, RULE_arrayStringType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(ARRAY);
			setState(463);
			match(LT);
			setState(464);
			match(STRING_EX);
			setState(465);
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
		enterRule(_localctx, 58, RULE_arrayNumberType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(NUMBER);
			setState(468);
			match(SQUARE_OPEN_BRACKET);
			setState(469);
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
		enterRule(_localctx, 60, RULE_tupleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(SQUARE_OPEN_BRACKET);
			setState(472);
			type();
			setState(475); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(473);
				match(COMMA);
				setState(474);
				type();
				}
				}
				setState(477); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(479);
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
		public TerminalNode MULT() { return getToken(MyParser.MULT, 0); }
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
		enterRule(_localctx, 62, RULE_marks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 63138486727093556L) != 0)) ) {
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
		enterRule(_localctx, 64, RULE_arrayDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(SQUARE_OPEN_BRACKET);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 360287970256912524L) != 0) || _la==IF) {
				{
				setState(484);
				expression();
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(485);
					match(COMMA);
					setState(486);
					expression();
					setState(490);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(487);
							match(COMMA);
							}
							} 
						}
						setState(492);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
					}
					}
					}
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(500);
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
		enterRule(_localctx, 66, RULE_expression);
		int _la;
		try {
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				match(STRING);
				}
				break;
			case NUMBER_VAL:
				_localctx = new NumberExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				match(NUMBER_VAL);
				}
				break;
			case SQUARE_OPEN_BRACKET:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				arrayDeclaration();
				}
				break;
			case IDENTIFIER:
			case IF:
				_localctx = new IfElseExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				ifElseStat();
				}
				break;
			case CURLY_OPEN_BRACKET:
				_localctx = new ObjectExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(506);
				match(CURLY_OPEN_BRACKET);
				setState(507);
				match(IDENTIFIER);
				setState(508);
				match(COLON);
				setState(509);
				expression();
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(510);
					match(COMMA);
					setState(511);
					match(IDENTIFIER);
					setState(512);
					match(COLON);
					setState(513);
					expression();
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(519);
				match(CURLY_CLOSE_BRACKET);
				}
				break;
			case BOOLEAN:
				_localctx = new BooleanExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(521);
				match(BOOLEAN);
				}
				break;
			case NgFor:
			case NgIf:
				_localctx = new DirectiveExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(522);
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
		enterRule(_localctx, 68, RULE_directivesStatment);
		try {
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NgFor:
				_localctx = new NgForDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				match(NgFor);
				setState(526);
				match(EQUAL1);
				setState(527);
				ngForValue();
				}
				break;
			case NgIf:
				_localctx = new NgIfDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(NgIf);
				setState(529);
				match(EQUAL2);
				setState(530);
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
		enterRule(_localctx, 70, RULE_ngForValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(DQUOT1);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET1) {
				{
				{
				setState(534);
				ngForExpression();
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(540);
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
		enterRule(_localctx, 72, RULE_ngForExpression);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				match(LET1);
				setState(543);
				match(ID1);
				setState(544);
				match(OF1);
				setState(545);
				match(ID1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				match(LET1);
				setState(547);
				match(ID1);
				setState(548);
				match(EQUAL1);
				setState(549);
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
		enterRule(_localctx, 74, RULE_ngIfValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(DQUOT3);
			setState(553);
			conditionExpression();
			setState(554);
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
		enterRule(_localctx, 76, RULE_conditionExpression);
		int _la;
		try {
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				_localctx = new EqualNullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				match(ID2);
				setState(557);
				equalOperation();
				setState(558);
				match(NULL1);
				}
				break;
			case 2:
				_localctx = new ComparisonExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				logicalTerm();
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 492545L) != 0)) {
					{
					setState(563);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GT1) {
						{
						setState(561);
						match(GT1);
						setState(562);
						match(NUMBER_VAL1);
						}
					}

					setState(565);
					equalOperation();
					setState(566);
					match(ID2);
					}
				}

				}
				break;
			case 3:
				_localctx = new ComparisonWithEqualExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				logicalTerm();
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET1) {
					{
					setState(571);
					match(OPEN_BRACKET1);
					setState(572);
					match(ID2);
					setState(573);
					match(ARROW1);
					setState(574);
					logicalTerm();
					setState(577);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GT1) {
						{
						setState(575);
						match(GT1);
						setState(576);
						match(NUMBER_VAL1);
						}
					}

					setState(579);
					equalOperation();
					setState(580);
					match(ID2);
					setState(581);
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
		enterRule(_localctx, 78, RULE_equalOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 491521L) != 0)) ) {
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
		enterRule(_localctx, 80, RULE_logicalTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT1) {
				{
				setState(589);
				match(NOT1);
				}
			}

			setState(592);
			match(ID2);
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT1) {
				{
				setState(593);
				match(DOT1);
				setState(594);
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
		public TerminalNode IF() { return getToken(MyParser.IF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
		public TerminalNode RETURN() { return getToken(MyParser.RETURN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
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
		enterRule(_localctx, 82, RULE_ifElseStat);
		try {
			int _alt;
			setState(614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(IDENTIFIER);
				setState(598);
				match(QUESTION_MARK);
				setState(599);
				type();
				setState(600);
				match(COLON);
				setState(601);
				type();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				match(IF);
				setState(604);
				match(OPEN_BRACKET);
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(605);
						types();
						}
						} 
					}
					setState(610);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(611);
				match(CLOSE_BRACKET);
				setState(612);
				match(RETURN);
				setState(613);
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
		enterRule(_localctx, 84, RULE_variable_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_la = _input.LA(1);
			if ( !(((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 7881299347898369L) != 0)) ) {
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
		enterRule(_localctx, 86, RULE_unionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			type();
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIT_OR) {
				{
				setState(619);
				match(BIT_OR);
				setState(620);
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
		public TerminalNode NEW() { return getToken(MyParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyParser.CLOSE_BRACKET, 0); }
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
		enterRule(_localctx, 88, RULE_newObjectFromClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(NEW);
			setState(624);
			match(IDENTIFIER);
			setState(625);
			match(OPEN_BRACKET);
			setState(626);
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
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
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
	public static class ObjectFromClassContext extends VariableDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(MyParser.EQUAL, 0); }
		public NewObjectFromClassContext newObjectFromClass() {
			return getRuleContext(NewObjectFromClassContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyParser.SEMI_COLON, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public ObjectFromClassContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
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
		enterRule(_localctx, 90, RULE_variableDeclaration);
		int _la;
		try {
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				_localctx = new TypedVariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 7881299347898369L) != 0)) {
					{
					setState(628);
					variable_type();
					}
				}

				setState(631);
				match(IDENTIFIER);
				setState(632);
				match(COLON);
				setState(633);
				unionType();
				setState(634);
				match(EQUAL);
				setState(637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(635);
					types();
					}
					break;
				case 2:
					{
					setState(636);
					assignment();
					}
					break;
				}
				setState(639);
				match(SEMI_COLON);
				}
				break;
			case 2:
				_localctx = new InferredVariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 7881299347898369L) != 0)) {
					{
					setState(641);
					variable_type();
					}
				}

				setState(644);
				match(IDENTIFIER);
				setState(645);
				match(EQUAL);
				setState(646);
				expression();
				setState(647);
				match(SEMI_COLON);
				}
				break;
			case 3:
				_localctx = new ObjectFromClassContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 7881299347898369L) != 0)) {
					{
					setState(649);
					variable_type();
					}
				}

				setState(652);
				match(IDENTIFIER);
				setState(653);
				match(EQUAL);
				setState(654);
				newObjectFromClass();
				setState(655);
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
		enterRule(_localctx, 92, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			variable_type();
			setState(660);
			match(IDENTIFIER);
			setState(661);
			match(EQUAL);
			setState(662);
			parameters();
			setState(663);
			match(COLON);
			setState(664);
			type();
			setState(665);
			match(ARROW);
			setState(666);
			arrowBody();
			setState(667);
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
		enterRule(_localctx, 94, RULE_arrowBody);
		int _la;
		try {
			setState(675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				match(IDENTIFIER);
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MIN) {
					{
					setState(670);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MIN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(671);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
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
		"\u0004\u0001V\u02a6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000\u0005\u0000b\b\u0000"+
		"\n\u0000\f\u0000e\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001k\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002r\b\u0002\n\u0002\f\u0002u\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u0086\b\u0004\n\u0004\f\u0004\u0089"+
		"\t\u0004\u0001\u0004\u0003\u0004\u008c\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u009c\b\u0007\n\u0007\f\u0007\u009f\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00a7\b\b\u000b\b\f\b\u00a8"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b1\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b8\b\n\n\n\f\n\u00bb\t\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00c4\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00cd\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00f8\b\u000f\u0001\u0010\u0003\u0010\u00fb\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0101\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0105\b\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0109\b\u0010\n\u0010\f\u0010\u010c\t\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0115"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0119\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u011d\b\u0010\n\u0010\f\u0010\u0120\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0124\b\u0010\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0128\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u012f\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u0134\b\u0011\n\u0011\f\u0011\u0137\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u013d\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0144\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u014c\b\u0011\u0005\u0011\u014e\b\u0011\n\u0011\f\u0011\u0151\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0155\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0004\u0012\u015f\b\u0012\u000b\u0012\f\u0012\u0160\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0168\b\u0012\n"+
		"\u0012\f\u0012\u016b\t\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u016f"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0174\b\u0012"+
		"\u0003\u0012\u0176\b\u0012\u0001\u0012\u0003\u0012\u0179\b\u0012\u0003"+
		"\u0012\u017b\b\u0012\u0001\u0013\u0004\u0013\u017e\b\u0013\u000b\u0013"+
		"\f\u0013\u017f\u0001\u0013\u0005\u0013\u0183\b\u0013\n\u0013\f\u0013\u0186"+
		"\t\u0013\u0001\u0013\u0004\u0013\u0189\b\u0013\u000b\u0013\f\u0013\u018a"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0195\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u019c\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u01a0\b\u0016\n\u0016\f\u0016\u01a3\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0005\u0017\u01a9\b\u0017\n"+
		"\u0017\f\u0017\u01ac\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u01b3\b\u0018\n\u0018\f\u0018\u01b6\t\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u01c3\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01cd\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0004\u001e\u01dc\b\u001e\u000b\u001e\f\u001e\u01dd\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u01e9\b \n \f \u01ec\t \u0005 \u01ee\b \n \f \u01f1\t \u0003 \u01f3"+
		"\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0005!\u0203\b!\n!\f!\u0206\t!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u020c\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u0214\b\"\u0001#\u0001#\u0005#\u0218\b#\n#\f#\u021b"+
		"\t#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u0227\b$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u0234\b&\u0001&\u0001&\u0001&\u0003&\u0239"+
		"\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0242\b&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u0248\b&\u0003&\u024a\b&\u0001\'\u0001\'"+
		"\u0001(\u0003(\u024f\b(\u0001(\u0001(\u0001(\u0003(\u0254\b(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u025f\b)\n)"+
		"\f)\u0262\t)\u0001)\u0001)\u0001)\u0003)\u0267\b)\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0003+\u026e\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		"-\u0003-\u0276\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u027e"+
		"\b-\u0001-\u0001-\u0001-\u0003-\u0283\b-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u028b\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0292"+
		"\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0003/\u02a1\b/\u0001/\u0003/\u02a4\b/\u0001/\u0000"+
		"\u00000\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^\u0000\u0007\u0003"+
		"\u0000\u0003\u0003\u0007\u0007\u001a\u001a\u0003\u0000\u0007\u0007\u000f"+
		"\u000f\u001a\u001a\u0001\u0000#$\u0002\u0000\u0003\u0003\u001a\u001a\f"+
		"\u0000\u0002\u0002\u0004\u0005\b\b\n\u000b\r\r\u0011\u0012\u0018\u0018"+
		"\u001f\u001f!$,,..57\u0002\u0000;;JM\u0002\u0000  RT\u02d9\u0000c\u0001"+
		"\u0000\u0000\u0000\u0002j\u0001\u0000\u0000\u0000\u0004l\u0001\u0000\u0000"+
		"\u0000\u0006{\u0001\u0000\u0000\u0000\b\u0082\u0001\u0000\u0000\u0000"+
		"\n\u008d\u0001\u0000\u0000\u0000\f\u0091\u0001\u0000\u0000\u0000\u000e"+
		"\u0095\u0001\u0000\u0000\u0000\u0010\u00a2\u0001\u0000\u0000\u0000\u0012"+
		"\u00b0\u0001\u0000\u0000\u0000\u0014\u00b2\u0001\u0000\u0000\u0000\u0016"+
		"\u00c3\u0001\u0000\u0000\u0000\u0018\u00cc\u0001\u0000\u0000\u0000\u001a"+
		"\u00ce\u0001\u0000\u0000\u0000\u001c\u00d5\u0001\u0000\u0000\u0000\u001e"+
		"\u00f7\u0001\u0000\u0000\u0000 \u0123\u0001\u0000\u0000\u0000\"\u0154"+
		"\u0001\u0000\u0000\u0000$\u017a\u0001\u0000\u0000\u0000&\u017d\u0001\u0000"+
		"\u0000\u0000(\u018c\u0001\u0000\u0000\u0000*\u019b\u0001\u0000\u0000\u0000"+
		",\u019d\u0001\u0000\u0000\u0000.\u01a6\u0001\u0000\u0000\u00000\u01b0"+
		"\u0001\u0000\u0000\u00002\u01b9\u0001\u0000\u0000\u00004\u01c2\u0001\u0000"+
		"\u0000\u00006\u01cc\u0001\u0000\u0000\u00008\u01ce\u0001\u0000\u0000\u0000"+
		":\u01d3\u0001\u0000\u0000\u0000<\u01d7\u0001\u0000\u0000\u0000>\u01e1"+
		"\u0001\u0000\u0000\u0000@\u01e3\u0001\u0000\u0000\u0000B\u020b\u0001\u0000"+
		"\u0000\u0000D\u0213\u0001\u0000\u0000\u0000F\u0215\u0001\u0000\u0000\u0000"+
		"H\u0226\u0001\u0000\u0000\u0000J\u0228\u0001\u0000\u0000\u0000L\u0249"+
		"\u0001\u0000\u0000\u0000N\u024b\u0001\u0000\u0000\u0000P\u024e\u0001\u0000"+
		"\u0000\u0000R\u0266\u0001\u0000\u0000\u0000T\u0268\u0001\u0000\u0000\u0000"+
		"V\u026a\u0001\u0000\u0000\u0000X\u026f\u0001\u0000\u0000\u0000Z\u0291"+
		"\u0001\u0000\u0000\u0000\\\u0293\u0001\u0000\u0000\u0000^\u02a3\u0001"+
		"\u0000\u0000\u0000`b\u0003\u0002\u0001\u0000a`\u0001\u0000\u0000\u0000"+
		"be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000d\u0001\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fk\u0003"+
		"\u0004\u0002\u0000gk\u0003\u0006\u0003\u0000hk\u0003\u0014\n\u0000ik\u0003"+
		"\u001e\u000f\u0000jf\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000k\u0003\u0001\u0000"+
		"\u0000\u0000lm\u0005\u0001\u0000\u0000mn\u0005\u0002\u0000\u0000ns\u0005"+
		"\u0003\u0000\u0000op\u0005\u0004\u0000\u0000pr\u0005\u0003\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000vw\u0005\u0005\u0000\u0000wx\u0005\u0006\u0000\u0000xy\u0005"+
		"\u0007\u0000\u0000yz\u0005\b\u0000\u0000z\u0005\u0001\u0000\u0000\u0000"+
		"{|\u0005\t\u0000\u0000|}\u0005\n\u0000\u0000}~\u0005\u0002\u0000\u0000"+
		"~\u007f\u0003\b\u0004\u0000\u007f\u0080\u0005\u0005\u0000\u0000\u0080"+
		"\u0081\u0005\u000b\u0000\u0000\u0081\u0007\u0001\u0000\u0000\u0000\u0082"+
		"\u0087\u0003\u0012\t\u0000\u0083\u0084\u0005\u0004\u0000\u0000\u0084\u0086"+
		"\u0003\u0012\t\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0089\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u008a\u008c\u0005\u0004\u0000\u0000\u008b\u008a\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\t\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0005\f\u0000\u0000\u008e\u008f\u0005\r\u0000"+
		"\u0000\u008f\u0090\u0005\u0007\u0000\u0000\u0090\u000b\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u000e\u0000\u0000\u0092\u0093\u0005\r\u0000\u0000"+
		"\u0093\u0094\u0005\u000f\u0000\u0000\u0094\r\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005\u0010\u0000\u0000\u0096\u0097\u0005\r\u0000\u0000\u0097\u0098"+
		"\u0005\u0011\u0000\u0000\u0098\u009d\u0005\u0003\u0000\u0000\u0099\u009a"+
		"\u0005\u0004\u0000\u0000\u009a\u009c\u0005\u0003\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0"+
		"\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0005\u0012\u0000\u0000\u00a1\u000f\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0005\u0013\u0000\u0000\u00a3\u00a4\u0005\r\u0000\u0000\u00a4\u00a6\u0005"+
		"\u0014\u0000\u0000\u00a5\u00a7\u0003*\u0015\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005\u0014\u0000\u0000\u00ab\u0011\u0001\u0000"+
		"\u0000\u0000\u00ac\u00b1\u0003\n\u0005\u0000\u00ad\u00b1\u0003\f\u0006"+
		"\u0000\u00ae\u00b1\u0003\u000e\u0007\u0000\u00af\u00b1\u0003\u0010\b\u0000"+
		"\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1\u0013\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0015\u0000\u0000"+
		"\u00b3\u00b4\u0005\u0016\u0000\u0000\u00b4\u00b5\u0005\u0003\u0000\u0000"+
		"\u00b5\u00b9\u0005\u0002\u0000\u0000\u00b6\u00b8\u0003\u0018\f\u0000\u00b7"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0005\u0005\u0000\u0000\u00bd\u0015\u0001\u0000\u0000\u0000\u00be"+
		"\u00c4\u00034\u001a\u0000\u00bf\u00c4\u0003>\u001f\u0000\u00c0\u00c4\u0003"+
		"B!\u0000\u00c1\u00c4\u0003(\u0014\u0000\u00c2\u00c4\u0003*\u0015\u0000"+
		"\u00c3\u00be\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u0017\u0001\u0000\u0000\u0000"+
		"\u00c5\u00cd\u0003Z-\u0000\u00c6\u00cd\u0003 \u0010\u0000\u00c7\u00cd"+
		"\u0003$\u0012\u0000\u00c8\u00cd\u0003\u001e\u000f\u0000\u00c9\u00cd\u0003"+
		"\u001c\u000e\u0000\u00ca\u00cd\u0003\u001a\r\u0000\u00cb\u00cd\u0003B"+
		"!\u0000\u00cc\u00c5\u0001\u0000\u0000\u0000\u00cc\u00c6\u0001\u0000\u0000"+
		"\u0000\u00cc\u00c7\u0001\u0000\u0000\u0000\u00cc\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u0019\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0005\u0017\u0000\u0000\u00cf\u00d0\u0005\u0018\u0000"+
		"\u0000\u00d0\u00d1\u0005\u0019\u0000\u0000\u00d1\u00d2\u0005\n\u0000\u0000"+
		"\u00d2\u00d3\u0007\u0000\u0000\u0000\u00d3\u00d4\u0005\u000b\u0000\u0000"+
		"\u00d4\u001b\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0017\u0000\u0000"+
		"\u00d6\u00d7\u0005\u0018\u0000\u0000\u00d7\u00d8\u0005\u001b\u0000\u0000"+
		"\u00d8\u00d9\u0005\n\u0000\u0000\u00d9\u00da\u0007\u0000\u0000\u0000\u00da"+
		"\u00db\u0005\u000b\u0000\u0000\u00db\u00dc\u0005\b\u0000\u0000\u00dc\u001d"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0003\u0000\u0000\u00de\u00df"+
		"\u0005\n\u0000\u0000\u00df\u00e0\u0005\u0003\u0000\u0000\u00e0\u00e1\u0005"+
		"\u000b\u0000\u0000\u00e1\u00e2\u0005\u0018\u0000\u0000\u00e2\u00e3\u0005"+
		"\u001c\u0000\u0000\u00e3\u00e4\u0005\n\u0000\u0000\u00e4\u00e5\u0003\""+
		"\u0011\u0000\u00e5\u00e6\u0005\u001d\u0000\u0000\u00e6\u00e7\u0003\u001a"+
		"\r\u0000\u00e7\u00e8\u0005\u000b\u0000\u0000\u00e8\u00e9\u0005\b\u0000"+
		"\u0000\u00e9\u00f8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u0003\u0000"+
		"\u0000\u00eb\u00ec\u0005\n\u0000\u0000\u00ec\u00ed\u0005\u0003\u0000\u0000"+
		"\u00ed\u00ee\u0005\u000b\u0000\u0000\u00ee\u00ef\u0005\u0018\u0000\u0000"+
		"\u00ef\u00f0\u0005\u001c\u0000\u0000\u00f0\u00f1\u0005\n\u0000\u0000\u00f1"+
		"\u00f2\u0005\u0003\u0000\u0000\u00f2\u00f3\u0005\u001d\u0000\u0000\u00f3"+
		"\u00f4\u0003\u001a\r\u0000\u00f4\u00f5\u0005\u000b\u0000\u0000\u00f5\u00f6"+
		"\u0005\b\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00dd\u0001"+
		"\u0000\u0000\u0000\u00f7\u00ea\u0001\u0000\u0000\u0000\u00f8\u001f\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fb\u0005\u001e\u0000\u0000\u00fa\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u0100\u0005\u0003\u0000\u0000\u00fd\u0101\u0003"+
		"\"\u0011\u0000\u00fe\u00ff\u0005\n\u0000\u0000\u00ff\u0101\u0005\u000b"+
		"\u0000\u0000\u0100\u00fd\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0005\r\u0000\u0000\u0103\u0105\u00034\u001a"+
		"\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u010a\u0005\u0002\u0000"+
		"\u0000\u0107\u0109\u0003\u0018\f\u0000\u0108\u0107\u0001\u0000\u0000\u0000"+
		"\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000"+
		"\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u0124\u0005\u0005\u0000\u0000"+
		"\u010e\u0124\u0003\\.\u0000\u010f\u0110\u0003T*\u0000\u0110\u0111\u0005"+
		"\u0003\u0000\u0000\u0111\u0112\u0005\u001f\u0000\u0000\u0112\u0114\u0005"+
		"\u001e\u0000\u0000\u0113\u0115\u0003\"\u0011\u0000\u0114\u0113\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0005\r\u0000\u0000\u0117\u0119\u00034\u001a"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011e\u0005\u0002\u0000"+
		"\u0000\u011b\u011d\u0003\u0018\f\u0000\u011c\u011b\u0001\u0000\u0000\u0000"+
		"\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000"+
		"\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u0005\u0000\u0000"+
		"\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u00fa\u0001\u0000\u0000\u0000"+
		"\u0123\u010e\u0001\u0000\u0000\u0000\u0123\u010f\u0001\u0000\u0000\u0000"+
		"\u0124!\u0001\u0000\u0000\u0000\u0125\u0127\u0005\n\u0000\u0000\u0126"+
		"\u0128\u0005 \u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0005\u0003\u0000\u0000\u012a\u012b\u0005\r\u0000\u0000\u012b\u0135\u0003"+
		"4\u001a\u0000\u012c\u012e\u0005\u0004\u0000\u0000\u012d\u012f\u0005 \u0000"+
		"\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0005\u0003\u0000"+
		"\u0000\u0131\u0132\u0005\r\u0000\u0000\u0132\u0134\u00034\u001a\u0000"+
		"\u0133\u012c\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000"+
		"\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000"+
		"\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000"+
		"\u0138\u0139\u0005\u000b\u0000\u0000\u0139\u0155\u0001\u0000\u0000\u0000"+
		"\u013a\u013c\u0005\n\u0000\u0000\u013b\u013d\u0005 \u0000\u0000\u013c"+
		"\u013b\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0005\u0003\u0000\u0000\u013f"+
		"\u0140\u0005\r\u0000\u0000\u0140\u0143\u00034\u001a\u0000\u0141\u0142"+
		"\u0005\u001f\u0000\u0000\u0142\u0144\u0007\u0001\u0000\u0000\u0143\u0141"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u014f"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0004\u0000\u0000\u0146\u0147"+
		"\u0005\u0003\u0000\u0000\u0147\u0148\u0005\r\u0000\u0000\u0148\u014b\u0003"+
		"4\u001a\u0000\u0149\u014a\u0005\u001f\u0000\u0000\u014a\u014c\u0007\u0001"+
		"\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000"+
		"\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u0145\u0001\u0000"+
		"\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0152\u0001\u0000"+
		"\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0153\u0005\u000b"+
		"\u0000\u0000\u0153\u0155\u0001\u0000\u0000\u0000\u0154\u0125\u0001\u0000"+
		"\u0000\u0000\u0154\u013a\u0001\u0000\u0000\u0000\u0155#\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0005\u0003\u0000\u0000\u0157\u0158\u0005\u001f\u0000"+
		"\u0000\u0158\u0159\u0003B!\u0000\u0159\u015a\u0005\b\u0000\u0000\u015a"+
		"\u017b\u0001\u0000\u0000\u0000\u015b\u015e\u0005\u0003\u0000\u0000\u015c"+
		"\u015d\u0005\u0018\u0000\u0000\u015d\u015f\u0005\u0003\u0000\u0000\u015e"+
		"\u015c\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160"+
		"\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161"+
		"\u0169\u0001\u0000\u0000\u0000\u0162\u0163\u0005!\u0000\u0000\u0163\u0164"+
		"\u0005\u0018\u0000\u0000\u0164\u0165\u0005\u0011\u0000\u0000\u0165\u0166"+
		"\u0005\u001a\u0000\u0000\u0166\u0168\u0005\u0012\u0000\u0000\u0167\u0162"+
		"\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167"+
		"\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u0175"+
		"\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u016e"+
		"\u0005\u001f\u0000\u0000\u016d\u016f\u0005\"\u0000\u0000\u016e\u016d\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0001"+
		"\u0000\u0000\u0000\u0170\u0173\u00034\u001a\u0000\u0171\u0172\u0007\u0002"+
		"\u0000\u0000\u0172\u0174\u0007\u0003\u0000\u0000\u0173\u0171\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0176\u0001\u0000"+
		"\u0000\u0000\u0175\u016c\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000"+
		"\u0000\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0179\u0005\b\u0000"+
		"\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000"+
		"\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a\u0156\u0001\u0000\u0000"+
		"\u0000\u017a\u015b\u0001\u0000\u0000\u0000\u017b%\u0001\u0000\u0000\u0000"+
		"\u017c\u017e\u0005\u0002\u0000\u0000\u017d\u017c\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0184\u0001\u0000\u0000\u0000"+
		"\u0181\u0183\u0003\u0016\u000b\u0000\u0182\u0181\u0001\u0000\u0000\u0000"+
		"\u0183\u0186\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0188\u0001\u0000\u0000\u0000"+
		"\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u0189\u0005\u0005\u0000\u0000"+
		"\u0188\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000"+
		"\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000"+
		"\u018b\'\u0001\u0000\u0000\u0000\u018c\u018d\u0005\n\u0000\u0000\u018d"+
		"\u018e\u0005%\u0000\u0000\u018e\u018f\u0005&\u0000\u0000\u018f\u0190\u0005"+
		"\'\u0000\u0000\u0190\u0191\u0005(\u0000\u0000\u0191\u0192\u0005)\u0000"+
		"\u0000\u0192\u0194\u0005*\u0000\u0000\u0193\u0195\u0005)\u0000\u0000\u0194"+
		"\u0193\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195"+
		"\u0196\u0001\u0000\u0000\u0000\u0196\u0197\u0005&\u0000\u0000\u0197\u0198"+
		"\u0005+\u0000\u0000\u0198)\u0001\u0000\u0000\u0000\u0199\u019c\u0003,"+
		"\u0016\u0000\u019a\u019c\u0003.\u0017\u0000\u019b\u0199\u0001\u0000\u0000"+
		"\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019c+\u0001\u0000\u0000\u0000"+
		"\u019d\u01a1\u00030\u0018\u0000\u019e\u01a0\u0003\u0016\u000b\u0000\u019f"+
		"\u019e\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1"+
		"\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a5\u00032\u0019\u0000\u01a5-\u0001\u0000\u0000\u0000\u01a6\u01aa\u0005"+
		",\u0000\u0000\u01a7\u01a9\u0003\u0016\u000b\u0000\u01a8\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005-\u0000"+
		"\u0000\u01ae\u01af\u0005.\u0000\u0000\u01af/\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b4\u0005,\u0000\u0000\u01b1\u01b3\u0003\u0016\u000b\u0000\u01b2\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0005.\u0000\u0000\u01b81\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005,"+
		"\u0000\u0000\u01ba\u01bb\u0005-\u0000\u0000\u01bb\u01bc\u0005\u0003\u0000"+
		"\u0000\u01bc\u01bd\u0005.\u0000\u0000\u01bd3\u0001\u0000\u0000\u0000\u01be"+
		"\u01c3\u00036\u001b\u0000\u01bf\u01c3\u00038\u001c\u0000\u01c0\u01c3\u0003"+
		":\u001d\u0000\u01c1\u01c3\u0003<\u001e\u0000\u01c2\u01be\u0001\u0000\u0000"+
		"\u0000\u01c2\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c35\u0001\u0000\u0000\u0000"+
		"\u01c4\u01cd\u0005\u0003\u0000\u0000\u01c5\u01cd\u0005/\u0000\u0000\u01c6"+
		"\u01cd\u00050\u0000\u0000\u01c7\u01cd\u00051\u0000\u0000\u01c8\u01cd\u0005"+
		"2\u0000\u0000\u01c9\u01cd\u00053\u0000\u0000\u01ca\u01cd\u0005\u0016\u0000"+
		"\u0000\u01cb\u01cd\u0003&\u0013\u0000\u01cc\u01c4\u0001\u0000\u0000\u0000"+
		"\u01cc\u01c5\u0001\u0000\u0000\u0000\u01cc\u01c6\u0001\u0000\u0000\u0000"+
		"\u01cc\u01c7\u0001\u0000\u0000\u0000\u01cc\u01c8\u0001\u0000\u0000\u0000"+
		"\u01cc\u01c9\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cd7\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u00054\u0000\u0000\u01cf\u01d0\u0005,\u0000\u0000\u01d0\u01d1\u0005"+
		"3\u0000\u0000\u01d1\u01d2\u0005.\u0000\u0000\u01d29\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d4\u0005/\u0000\u0000\u01d4\u01d5\u0005\u0011\u0000\u0000"+
		"\u01d5\u01d6\u0005\u0012\u0000\u0000\u01d6;\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0005\u0011\u0000\u0000\u01d8\u01db\u00034\u001a\u0000\u01d9\u01da"+
		"\u0005\u0004\u0000\u0000\u01da\u01dc\u00034\u001a\u0000\u01db\u01d9\u0001"+
		"\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01db\u0001"+
		"\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01df\u0001"+
		"\u0000\u0000\u0000\u01df\u01e0\u0005\u0012\u0000\u0000\u01e0=\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\u0007\u0004\u0000\u0000\u01e2?\u0001\u0000\u0000"+
		"\u0000\u01e3\u01f2\u0005\u0011\u0000\u0000\u01e4\u01ef\u0003B!\u0000\u01e5"+
		"\u01e6\u0005\u0004\u0000\u0000\u01e6\u01ea\u0003B!\u0000\u01e7\u01e9\u0005"+
		"\u0004\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ee\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001"+
		"\u0000\u0000\u0000\u01ed\u01e5\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001"+
		"\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f3\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001"+
		"\u0000\u0000\u0000\u01f2\u01e4\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005"+
		"\u0012\u0000\u0000\u01f5A\u0001\u0000\u0000\u0000\u01f6\u020c\u0005\u0007"+
		"\u0000\u0000\u01f7\u020c\u0005\u001a\u0000\u0000\u01f8\u020c\u0003@ \u0000"+
		"\u01f9\u020c\u0003R)\u0000\u01fa\u01fb\u0005\u0002\u0000\u0000\u01fb\u01fc"+
		"\u0005\u0003\u0000\u0000\u01fc\u01fd\u0005\r\u0000\u0000\u01fd\u0204\u0003"+
		"B!\u0000\u01fe\u01ff\u0005\u0004\u0000\u0000\u01ff\u0200\u0005\u0003\u0000"+
		"\u0000\u0200\u0201\u0005\r\u0000\u0000\u0201\u0203\u0003B!\u0000\u0202"+
		"\u01fe\u0001\u0000\u0000\u0000\u0203\u0206\u0001\u0000\u0000\u0000\u0204"+
		"\u0202\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205"+
		"\u0207\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0207"+
		"\u0208\u0005\u0005\u0000\u0000\u0208\u020c\u0001\u0000\u0000\u0000\u0209"+
		"\u020c\u0005\u000f\u0000\u0000\u020a\u020c\u0003D\"\u0000\u020b\u01f6"+
		"\u0001\u0000\u0000\u0000\u020b\u01f7\u0001\u0000\u0000\u0000\u020b\u01f8"+
		"\u0001\u0000\u0000\u0000\u020b\u01f9\u0001\u0000\u0000\u0000\u020b\u01fa"+
		"\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020a"+
		"\u0001\u0000\u0000\u0000\u020cC\u0001\u0000\u0000\u0000\u020d\u020e\u0005"+
		"8\u0000\u0000\u020e\u020f\u00059\u0000\u0000\u020f\u0214\u0003F#\u0000"+
		"\u0210\u0211\u0005:\u0000\u0000\u0211\u0212\u0005;\u0000\u0000\u0212\u0214"+
		"\u0003J%\u0000\u0213\u020d\u0001\u0000\u0000\u0000\u0213\u0210\u0001\u0000"+
		"\u0000\u0000\u0214E\u0001\u0000\u0000\u0000\u0215\u0219\u0005<\u0000\u0000"+
		"\u0216\u0218\u0003H$\u0000\u0217\u0216\u0001\u0000\u0000\u0000\u0218\u021b"+
		"\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219\u021a"+
		"\u0001\u0000\u0000\u0000\u021a\u021c\u0001\u0000\u0000\u0000\u021b\u0219"+
		"\u0001\u0000\u0000\u0000\u021c\u021d\u0005=\u0000\u0000\u021dG\u0001\u0000"+
		"\u0000\u0000\u021e\u021f\u0005>\u0000\u0000\u021f\u0220\u0005?\u0000\u0000"+
		"\u0220\u0221\u0005@\u0000\u0000\u0221\u0227\u0005?\u0000\u0000\u0222\u0223"+
		"\u0005>\u0000\u0000\u0223\u0224\u0005?\u0000\u0000\u0224\u0225\u00059"+
		"\u0000\u0000\u0225\u0227\u0005?\u0000\u0000\u0226\u021e\u0001\u0000\u0000"+
		"\u0000\u0226\u0222\u0001\u0000\u0000\u0000\u0227I\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0005A\u0000\u0000\u0229\u022a\u0003L&\u0000\u022a\u022b"+
		"\u0005B\u0000\u0000\u022bK\u0001\u0000\u0000\u0000\u022c\u022d\u0005C"+
		"\u0000\u0000\u022d\u022e\u0003N\'\u0000\u022e\u022f\u0005D\u0000\u0000"+
		"\u022f\u024a\u0001\u0000\u0000\u0000\u0230\u0238\u0003P(\u0000\u0231\u0232"+
		"\u0005E\u0000\u0000\u0232\u0234\u0005F\u0000\u0000\u0233\u0231\u0001\u0000"+
		"\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000"+
		"\u0000\u0000\u0235\u0236\u0003N\'\u0000\u0236\u0237\u0005C\u0000\u0000"+
		"\u0237\u0239\u0001\u0000\u0000\u0000\u0238\u0233\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u024a\u0001\u0000\u0000\u0000"+
		"\u023a\u0247\u0003P(\u0000\u023b\u023c\u0005G\u0000\u0000\u023c\u023d"+
		"\u0005C\u0000\u0000\u023d\u023e\u0005H\u0000\u0000\u023e\u0241\u0003P"+
		"(\u0000\u023f\u0240\u0005E\u0000\u0000\u0240\u0242\u0005F\u0000\u0000"+
		"\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000"+
		"\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0244\u0003N\'\u0000\u0244"+
		"\u0245\u0005C\u0000\u0000\u0245\u0246\u0005I\u0000\u0000\u0246\u0248\u0001"+
		"\u0000\u0000\u0000\u0247\u023b\u0001\u0000\u0000\u0000\u0247\u0248\u0001"+
		"\u0000\u0000\u0000\u0248\u024a\u0001\u0000\u0000\u0000\u0249\u022c\u0001"+
		"\u0000\u0000\u0000\u0249\u0230\u0001\u0000\u0000\u0000\u0249\u023a\u0001"+
		"\u0000\u0000\u0000\u024aM\u0001\u0000\u0000\u0000\u024b\u024c\u0007\u0005"+
		"\u0000\u0000\u024cO\u0001\u0000\u0000\u0000\u024d\u024f\u0005N\u0000\u0000"+
		"\u024e\u024d\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000"+
		"\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0253\u0005C\u0000\u0000\u0251"+
		"\u0252\u0005O\u0000\u0000\u0252\u0254\u0005C\u0000\u0000\u0253\u0251\u0001"+
		"\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254Q\u0001\u0000"+
		"\u0000\u0000\u0255\u0256\u0005\u0003\u0000\u0000\u0256\u0257\u0005!\u0000"+
		"\u0000\u0257\u0258\u00034\u001a\u0000\u0258\u0259\u0005\r\u0000\u0000"+
		"\u0259\u025a\u00034\u001a\u0000\u025a\u0267\u0001\u0000\u0000\u0000\u025b"+
		"\u025c\u0005P\u0000\u0000\u025c\u0260\u0005\n\u0000\u0000\u025d\u025f"+
		"\u0003\u0016\u000b\u0000\u025e\u025d\u0001\u0000\u0000\u0000\u025f\u0262"+
		"\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260\u0261"+
		"\u0001\u0000\u0000\u0000\u0261\u0263\u0001\u0000\u0000\u0000\u0262\u0260"+
		"\u0001\u0000\u0000\u0000\u0263\u0264\u0005\u000b\u0000\u0000\u0264\u0265"+
		"\u0005Q\u0000\u0000\u0265\u0267\u0005\b\u0000\u0000\u0266\u0255\u0001"+
		"\u0000\u0000\u0000\u0266\u025b\u0001\u0000\u0000\u0000\u0267S\u0001\u0000"+
		"\u0000\u0000\u0268\u0269\u0007\u0006\u0000\u0000\u0269U\u0001\u0000\u0000"+
		"\u0000\u026a\u026d\u00034\u001a\u0000\u026b\u026c\u0005U\u0000\u0000\u026c"+
		"\u026e\u00034\u001a\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026d\u026e"+
		"\u0001\u0000\u0000\u0000\u026eW\u0001\u0000\u0000\u0000\u026f\u0270\u0005"+
		"V\u0000\u0000\u0270\u0271\u0005\u0003\u0000\u0000\u0271\u0272\u0005\n"+
		"\u0000\u0000\u0272\u0273\u0005\u000b\u0000\u0000\u0273Y\u0001\u0000\u0000"+
		"\u0000\u0274\u0276\u0003T*\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0275"+
		"\u0276\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277"+
		"\u0278\u0005\u0003\u0000\u0000\u0278\u0279\u0005\r\u0000\u0000\u0279\u027a"+
		"\u0003V+\u0000\u027a\u027d\u0005\u001f\u0000\u0000\u027b\u027e\u0003\u0016"+
		"\u000b\u0000\u027c\u027e\u0003$\u0012\u0000\u027d\u027b\u0001\u0000\u0000"+
		"\u0000\u027d\u027c\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000"+
		"\u0000\u027f\u0280\u0005\b\u0000\u0000\u0280\u0292\u0001\u0000\u0000\u0000"+
		"\u0281\u0283\u0003T*\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0282\u0283"+
		"\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0285"+
		"\u0005\u0003\u0000\u0000\u0285\u0286\u0005\u001f\u0000\u0000\u0286\u0287"+
		"\u0003B!\u0000\u0287\u0288\u0005\b\u0000\u0000\u0288\u0292\u0001\u0000"+
		"\u0000\u0000\u0289\u028b\u0003T*\u0000\u028a\u0289\u0001\u0000\u0000\u0000"+
		"\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000"+
		"\u028c\u028d\u0005\u0003\u0000\u0000\u028d\u028e\u0005\u001f\u0000\u0000"+
		"\u028e\u028f\u0003X,\u0000\u028f\u0290\u0005\b\u0000\u0000\u0290\u0292"+
		"\u0001\u0000\u0000\u0000\u0291\u0275\u0001\u0000\u0000\u0000\u0291\u0282"+
		"\u0001\u0000\u0000\u0000\u0291\u028a\u0001\u0000\u0000\u0000\u0292[\u0001"+
		"\u0000\u0000\u0000\u0293\u0294\u0003T*\u0000\u0294\u0295\u0005\u0003\u0000"+
		"\u0000\u0295\u0296\u0005\u001f\u0000\u0000\u0296\u0297\u0003\"\u0011\u0000"+
		"\u0297\u0298\u0005\r\u0000\u0000\u0298\u0299\u00034\u001a\u0000\u0299"+
		"\u029a\u0005\u001d\u0000\u0000\u029a\u029b\u0003^/\u0000\u029b\u029c\u0005"+
		"\b\u0000\u0000\u029c]\u0001\u0000\u0000\u0000\u029d\u02a0\u0005\u0003"+
		"\u0000\u0000\u029e\u029f\u0007\u0002\u0000\u0000\u029f\u02a1\u0005\u0003"+
		"\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000"+
		"\u0000\u0000\u02a1\u02a4\u0001\u0000\u0000\u0000\u02a2\u02a4\u0005\u0007"+
		"\u0000\u0000\u02a3\u029d\u0001\u0000\u0000\u0000\u02a3\u02a2\u0001\u0000"+
		"\u0000\u0000\u02a4_\u0001\u0000\u0000\u0000Gcjs\u0087\u008b\u009d\u00a8"+
		"\u00b0\u00b9\u00c3\u00cc\u00f7\u00fa\u0100\u0104\u010a\u0114\u0118\u011e"+
		"\u0123\u0127\u012e\u0135\u013c\u0143\u014b\u014f\u0154\u0160\u0169\u016e"+
		"\u0173\u0175\u0178\u017a\u017f\u0184\u018a\u0194\u019b\u01a1\u01aa\u01b4"+
		"\u01c2\u01cc\u01dd\u01ea\u01ef\u01f2\u0204\u020b\u0213\u0219\u0226\u0233"+
		"\u0238\u0241\u0247\u0249\u024e\u0253\u0260\u0266\u026d\u0275\u027d\u0282"+
		"\u028a\u0291\u02a0\u02a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}