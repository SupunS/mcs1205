// Generated from SampleParser.g4 by ANTLR 4.5.3
package sample.language.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SampleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, FOR=2, TYPE_INT=3, TYPE_FLOAT=4, TYPE_BOOLEAN=5, ASSIGN=6, ADD=7, 
		INCREMENT=8, LT=9, SEMI_COLON=10, LEFT_BRACE=11, RIGHT_BRACE=12, LEFT_PARENTHESIS=13, 
		RIGHT_PARENTHESIS=14, IntegerLiteral=15, FloatingPointLiteral=16, BooleanLiteral=17, 
		Identifier=18, WS=19, NEW_LINE=20;
	public static final int
		RULE_compilationUnit = 0, RULE_body = 1, RULE_statement = 2, RULE_variableDefinitionStatement = 3, 
		RULE_assignmentStatement = 4, RULE_incrementStatement = 5, RULE_forLoopStatement = 6, 
		RULE_incrementExpr = 7, RULE_variableReference = 8, RULE_expression = 9, 
		RULE_simpleLiteral = 10, RULE_typeName = 11;
	public static final String[] ruleNames = {
		"compilationUnit", "body", "statement", "variableDefinitionStatement", 
		"assignmentStatement", "incrementStatement", "forLoopStatement", "incrementExpr", 
		"variableReference", "expression", "simpleLiteral", "typeName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Start'", "'for'", "'int'", "'float'", "'boolean'", "'='", "'+'", 
		"'++'", "'<'", "';'", "'{'", "'}'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "START", "FOR", "TYPE_INT", "TYPE_FLOAT", "TYPE_BOOLEAN", "ASSIGN", 
		"ADD", "INCREMENT", "LT", "SEMI_COLON", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_PARENTHESIS", 
		"RIGHT_PARENTHESIS", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"Identifier", "WS", "NEW_LINE"
	};
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
	public String getGrammarFileName() { return "SampleParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SampleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(SampleParser.START, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(START);
			setState(25);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(SampleParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(SampleParser.RIGHT_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(LEFT_BRACE);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << TYPE_INT) | (1L << TYPE_FLOAT) | (1L << TYPE_BOOLEAN) | (1L << Identifier))) != 0)) {
				{
				{
				setState(28);
				statement();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VariableDefinitionStatementContext variableDefinitionStatement() {
			return getRuleContext(VariableDefinitionStatementContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(SampleParser.SEMI_COLON, 0); }
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public IncrementStatementContext incrementStatement() {
			return getRuleContext(IncrementStatementContext.class,0);
		}
		public ForLoopStatementContext forLoopStatement() {
			return getRuleContext(ForLoopStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				variableDefinitionStatement();
				setState(37);
				match(SEMI_COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				assignmentStatement();
				setState(40);
				match(SEMI_COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				incrementStatement();
				setState(43);
				match(SEMI_COLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				forLoopStatement();
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

	public static class VariableDefinitionStatementContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SampleParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(SampleParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDefinitionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinitionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).enterVariableDefinitionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).exitVariableDefinitionStatement(this);
		}
	}

	public final VariableDefinitionStatementContext variableDefinitionStatement() throws RecognitionException {
		VariableDefinitionStatementContext _localctx = new VariableDefinitionStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDefinitionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			typeName();
			setState(49);
			match(Identifier);
			setState(52);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(50);
				match(ASSIGN);
				setState(51);
				expression(0);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SampleParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			variableReference();
			setState(55);
			match(ASSIGN);
			setState(56);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementStatementContext extends ParserRuleContext {
		public IncrementExprContext incrementExpr() {
			return getRuleContext(IncrementExprContext.class,0);
		}
		public IncrementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).enterIncrementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).exitIncrementStatement(this);
		}
	}

	public final IncrementStatementContext incrementStatement() throws RecognitionException {
		IncrementStatementContext _localctx = new IncrementStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_incrementStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			incrementExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SampleParser.FOR, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(SampleParser.LEFT_PARENTHESIS, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(SampleParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(SampleParser.SEMI_COLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(SampleParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(SampleParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(SampleParser.RIGHT_BRACE, 0); }
		public VariableDefinitionStatementContext variableDefinitionStatement() {
			return getRuleContext(VariableDefinitionStatementContext.class,0);
		}
		public List<AssignmentStatementContext> assignmentStatement() {
			return getRuleContexts(AssignmentStatementContext.class);
		}
		public AssignmentStatementContext assignmentStatement(int i) {
			return getRuleContext(AssignmentStatementContext.class,i);
		}
		public IncrementStatementContext incrementStatement() {
			return getRuleContext(IncrementStatementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).enterForLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).exitForLoopStatement(this);
		}
	}

	public final ForLoopStatementContext forLoopStatement() throws RecognitionException {
		ForLoopStatementContext _localctx = new ForLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forLoopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(FOR);
			setState(61);
			match(LEFT_PARENTHESIS);
			setState(64);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_FLOAT:
			case TYPE_BOOLEAN:
				{
				setState(62);
				variableDefinitionStatement();
				}
				break;
			case Identifier:
				{
				setState(63);
				assignmentStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(66);
			match(SEMI_COLON);
			setState(67);
			expression(0);
			setState(68);
			match(SEMI_COLON);
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(69);
				assignmentStatement();
				}
				break;
			case 2:
				{
				setState(70);
				incrementStatement();
				}
				break;
			}
			setState(73);
			match(RIGHT_PARENTHESIS);
			setState(74);
			match(LEFT_BRACE);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << TYPE_INT) | (1L << TYPE_FLOAT) | (1L << TYPE_BOOLEAN) | (1L << Identifier))) != 0)) {
				{
				{
				setState(75);
				statement();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementExprContext extends ParserRuleContext {
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(SampleParser.INCREMENT, 0); }
		public IncrementExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).enterIncrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).exitIncrementExpr(this);
		}
	}

	public final IncrementExprContext incrementExpr() throws RecognitionException {
		IncrementExprContext _localctx = new IncrementExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_incrementExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			variableReference();
			setState(84);
			match(INCREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableReferenceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SampleParser.Identifier, 0); }
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).exitVariableReference(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
	public static class VariableRefExpressionContext extends ExpressionContext {
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public VariableRefExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).enterVariableRefExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).exitVariableRefExpression(this);
		}
	}
	public static class SimpleLiteralExpressionContext extends ExpressionContext {
		public SimpleLiteralContext simpleLiteral() {
			return getRuleContext(SimpleLiteralContext.class,0);
		}
		public SimpleLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).enterSimpleLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).exitSimpleLiteralExpression(this);
		}
	}
	public static class BinaryCompareExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(SampleParser.LT, 0); }
		public BinaryCompareExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).enterBinaryCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).exitBinaryCompareExpression(this);
		}
	}
	public static class IncrementExpressionContext extends ExpressionContext {
		public IncrementExprContext incrementExpr() {
			return getRuleContext(IncrementExprContext.class,0);
		}
		public IncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).enterIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).exitIncrementExpression(this);
		}
	}
	public static class BinaryAddExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(SampleParser.ADD, 0); }
		public BinaryAddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).enterBinaryAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).exitBinaryAddExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(89);
				simpleLiteral();
				}
				break;
			case 2:
				{
				_localctx = new VariableRefExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				variableReference();
				}
				break;
			case 3:
				{
				_localctx = new IncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				incrementExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryAddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(95);
						match(ADD);
						setState(96);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new BinaryCompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(97);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(98);
						match(LT);
						setState(99);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class SimpleLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(SampleParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(SampleParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(SampleParser.BooleanLiteral, 0); }
		public SimpleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).enterSimpleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).exitSimpleLiteral(this);
		}
	}

	public final SimpleLiteralContext simpleLiteral() throws RecognitionException {
		SimpleLiteralContext _localctx = new SimpleLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpleLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode TYPE_INT() { return getToken(SampleParser.TYPE_INT, 0); }
		public TerminalNode TYPE_FLOAT() { return getToken(SampleParser.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_BOOLEAN() { return getToken(SampleParser.TYPE_BOOLEAN, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleParserListener ) ((SampleParserListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_FLOAT) | (1L << TYPE_BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26p\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5\3\5\3\5\5\5\67"+
		"\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\bC\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bJ\n\b\3\b\3\b\3\b\7\bO\n\b\f\b\16\bR\13\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\5\13_\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13g\n\13\f\13\16\13j\13\13\3\f\3\f\3\r\3\r\3\r\2\3\24\16\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\2\4\3\2\21\23\3\2\5\7o\2\32\3\2\2\2\4\35\3\2\2\2"+
		"\6\60\3\2\2\2\b\62\3\2\2\2\n8\3\2\2\2\f<\3\2\2\2\16>\3\2\2\2\20U\3\2\2"+
		"\2\22X\3\2\2\2\24^\3\2\2\2\26k\3\2\2\2\30m\3\2\2\2\32\33\7\3\2\2\33\34"+
		"\5\4\3\2\34\3\3\2\2\2\35!\7\r\2\2\36 \5\6\4\2\37\36\3\2\2\2 #\3\2\2\2"+
		"!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\16\2\2%\5\3\2\2\2&\'"+
		"\5\b\5\2\'(\7\f\2\2(\61\3\2\2\2)*\5\n\6\2*+\7\f\2\2+\61\3\2\2\2,-\5\f"+
		"\7\2-.\7\f\2\2.\61\3\2\2\2/\61\5\16\b\2\60&\3\2\2\2\60)\3\2\2\2\60,\3"+
		"\2\2\2\60/\3\2\2\2\61\7\3\2\2\2\62\63\5\30\r\2\63\66\7\24\2\2\64\65\7"+
		"\b\2\2\65\67\5\24\13\2\66\64\3\2\2\2\66\67\3\2\2\2\67\t\3\2\2\289\5\22"+
		"\n\29:\7\b\2\2:;\5\24\13\2;\13\3\2\2\2<=\5\20\t\2=\r\3\2\2\2>?\7\4\2\2"+
		"?B\7\17\2\2@C\5\b\5\2AC\5\n\6\2B@\3\2\2\2BA\3\2\2\2CD\3\2\2\2DE\7\f\2"+
		"\2EF\5\24\13\2FI\7\f\2\2GJ\5\n\6\2HJ\5\f\7\2IG\3\2\2\2IH\3\2\2\2JK\3\2"+
		"\2\2KL\7\20\2\2LP\7\r\2\2MO\5\6\4\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3"+
		"\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\16\2\2T\17\3\2\2\2UV\5\22\n\2VW\7\n\2\2"+
		"W\21\3\2\2\2XY\7\24\2\2Y\23\3\2\2\2Z[\b\13\1\2[_\5\26\f\2\\_\5\22\n\2"+
		"]_\5\20\t\2^Z\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_h\3\2\2\2`a\f\4\2\2ab\7\t\2"+
		"\2bg\5\24\13\5cd\f\3\2\2de\7\13\2\2eg\5\24\13\4f`\3\2\2\2fc\3\2\2\2gj"+
		"\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\25\3\2\2\2jh\3\2\2\2kl\t\2\2\2l\27\3\2\2"+
		"\2mn\t\3\2\2n\31\3\2\2\2\13!\60\66BIP^fh";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}