// Generated from C:/Users/jpagu/IdeaProjects/Interpreter 1/src\Interpreter.g4 by ANTLR 4.7.2
package interpreter;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InterpreterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ADD=5, SUB=6, MUL=7, DIV=8, MOD=9, ASSIGN=10, 
		ADD_ASSIGN=11, SUB_ASSIGN=12, MUL_ASSIGN=13, DIV_ASSIGN=14, MOD_ASSIGN=15, 
		LPAREN=16, RPAREN=17, EQUIV=18, NOTEQUIV=19, GREAT=20, LESS=21, GREATEQUA=22, 
		LESSEQUA=23, INT=24, FLOAT=25, STRING=26, TRUE=27, FALSE=28, ID=29, SPACE=30, 
		LINEFEED=31, COMMENT=32;
	public static final int
		RULE_start = 0, RULE_expressionList = 1, RULE_expression = 2, RULE_ifStatement = 3, 
		RULE_conditionSatement = 4, RULE_assignment = 5, RULE_intAssign = 6, RULE_floatAssign = 7, 
		RULE_stringAssign = 8, RULE_intRes = 9, RULE_floatRes = 10, RULE_stringRes = 11, 
		RULE_intValue = 12, RULE_floatValue = 13, RULE_strLiteral = 14, RULE_boolVal = 15, 
		RULE_id = 16, RULE_varName = 17, RULE_rvalue = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expressionList", "expression", "ifStatement", "conditionSatement", 
			"assignment", "intAssign", "floatAssign", "stringAssign", "intRes", "floatRes", 
			"stringRes", "intValue", "floatValue", "strLiteral", "boolVal", "id", 
			"varName", "rvalue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IF'", "'end condition'", "'if'", "'make'", null, null, null, 
			null, null, "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "ADD", "SUB", "MUL", "DIV", "MOD", "ASSIGN", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"LPAREN", "RPAREN", "EQUIV", "NOTEQUIV", "GREAT", "LESS", "GREATEQUA", 
			"LESSEQUA", "INT", "FLOAT", "STRING", "TRUE", "FALSE", "ID", "SPACE", 
			"LINEFEED", "COMMENT"
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
	public String getGrammarFileName() { return "Interpreter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InterpreterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			expressionList(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(InterpreterParser.EOF, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		return expressionList(0);
	}

	private ExpressionListContext expressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, _parentState);
		ExpressionListContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__3:
			case LPAREN:
			case INT:
			case FLOAT:
			case STRING:
			case TRUE:
			case FALSE:
			case ID:
				{
				setState(41);
				expression();
				}
				break;
			case EOF:
				{
				setState(42);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionList);
					setState(45);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(46);
					expression();
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case LPAREN:
			case INT:
			case FLOAT:
			case STRING:
			case TRUE:
			case FALSE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				rvalue();
				}
				break;
			case T__0:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				ifStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public TerminalNode GREAT() { return getToken(InterpreterParser.GREAT, 0); }
		public ConditionSatementContext conditionSatement() {
			return getRuleContext(ConditionSatementContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(InterpreterParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(InterpreterParser.RPAREN, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(T__0);
				setState(57);
				rvalue();
				setState(58);
				match(GREAT);
				setState(59);
				rvalue();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - -1)) & ~0x3f) == 0 && ((1L << (_la - -1)) & ((1L << (EOF - -1)) | (1L << (T__0 - -1)) | (1L << (T__2 - -1)) | (1L << (T__3 - -1)) | (1L << (LPAREN - -1)) | (1L << (INT - -1)) | (1L << (FLOAT - -1)) | (1L << (STRING - -1)) | (1L << (TRUE - -1)) | (1L << (FALSE - -1)) | (1L << (ID - -1)))) != 0)) {
					{
					setState(60);
					conditionSatement();
					}
				}

				setState(63);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(T__2);
				setState(66);
				match(LPAREN);
				setState(67);
				rvalue();
				setState(68);
				match(GREAT);
				setState(69);
				rvalue();
				setState(70);
				match(RPAREN);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - -1)) & ~0x3f) == 0 && ((1L << (_la - -1)) & ((1L << (EOF - -1)) | (1L << (T__0 - -1)) | (1L << (T__2 - -1)) | (1L << (T__3 - -1)) | (1L << (LPAREN - -1)) | (1L << (INT - -1)) | (1L << (FLOAT - -1)) | (1L << (STRING - -1)) | (1L << (TRUE - -1)) | (1L << (FALSE - -1)) | (1L << (ID - -1)))) != 0)) {
					{
					setState(71);
					conditionSatement();
					}
				}

				setState(74);
				match(T__1);
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

	public static class ConditionSatementContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ConditionSatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionSatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterConditionSatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitConditionSatement(this);
		}
	}

	public final ConditionSatementContext conditionSatement() throws RecognitionException {
		ConditionSatementContext _localctx = new ConditionSatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditionSatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			expressionList(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public VarNameContext varID;
		public Token op;
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__3);
				setState(81);
				((AssignmentContext)_localctx).varID = varName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(T__3);
				setState(83);
				((AssignmentContext)_localctx).varID = varName();
				setState(84);
				((AssignmentContext)_localctx).op = match(ASSIGN);
				setState(85);
				rvalue();
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

	public static class IntAssignContext extends ParserRuleContext {
		public VarNameContext varID;
		public Token op;
		public IntResContext intRes() {
			return getRuleContext(IntResContext.class,0);
		}
		public TerminalNode EOF() { return getToken(InterpreterParser.EOF, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(InterpreterParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(InterpreterParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(InterpreterParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(InterpreterParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(InterpreterParser.MOD_ASSIGN, 0); }
		public IntAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterIntAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitIntAssign(this);
		}
	}

	public final IntAssignContext intAssign() throws RecognitionException {
		IntAssignContext _localctx = new IntAssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_intAssign);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__3);
				setState(90);
				((IntAssignContext)_localctx).varID = varName();
				setState(91);
				((IntAssignContext)_localctx).op = match(ASSIGN);
				setState(92);
				intRes(0);
				setState(93);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__3);
				setState(96);
				((IntAssignContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN))) != 0)) ) {
					((IntAssignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(97);
				intRes(0);
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

	public static class FloatAssignContext extends ParserRuleContext {
		public VarNameContext varID;
		public Token op;
		public FloatResContext floatRes() {
			return getRuleContext(FloatResContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(InterpreterParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(InterpreterParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(InterpreterParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(InterpreterParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(InterpreterParser.MOD_ASSIGN, 0); }
		public FloatAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterFloatAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitFloatAssign(this);
		}
	}

	public final FloatAssignContext floatAssign() throws RecognitionException {
		FloatAssignContext _localctx = new FloatAssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_floatAssign);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(T__3);
				setState(101);
				((FloatAssignContext)_localctx).varID = varName();
				setState(102);
				((FloatAssignContext)_localctx).op = match(ASSIGN);
				setState(103);
				floatRes(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(T__3);
				setState(106);
				((FloatAssignContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN))) != 0)) ) {
					((FloatAssignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(107);
				floatRes(0);
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

	public static class StringAssignContext extends ParserRuleContext {
		public VarNameContext varID;
		public Token op;
		public StringResContext stringRes() {
			return getRuleContext(StringResContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public StringAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterStringAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitStringAssign(this);
		}
	}

	public final StringAssignContext stringAssign() throws RecognitionException {
		StringAssignContext _localctx = new StringAssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__3);
			setState(111);
			((StringAssignContext)_localctx).varID = varName();
			setState(112);
			((StringAssignContext)_localctx).op = match(ASSIGN);
			setState(113);
			stringRes(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntResContext extends ParserRuleContext {
		public Token op;
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public List<IntResContext> intRes() {
			return getRuleContexts(IntResContext.class);
		}
		public IntResContext intRes(int i) {
			return getRuleContext(IntResContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public TerminalNode LPAREN() { return getToken(InterpreterParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(InterpreterParser.RPAREN, 0); }
		public IntValueContext intValue() {
			return getRuleContext(IntValueContext.class,0);
		}
		public TerminalNode MUL() { return getToken(InterpreterParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(InterpreterParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(InterpreterParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(InterpreterParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(InterpreterParser.SUB, 0); }
		public IntResContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intRes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterIntRes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitIntRes(this);
		}
	}

	public final IntResContext intRes() throws RecognitionException {
		return intRes(0);
	}

	private IntResContext intRes(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntResContext _localctx = new IntResContext(_ctx, _parentState);
		IntResContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_intRes, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(116);
				varName();
				setState(117);
				((IntResContext)_localctx).op = match(ASSIGN);
				setState(118);
				intRes(3);
				}
				break;
			case LPAREN:
				{
				setState(120);
				match(LPAREN);
				setState(121);
				intRes(0);
				setState(122);
				match(RPAREN);
				}
				break;
			case INT:
				{
				setState(124);
				intValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(133);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new IntResContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intRes);
						setState(127);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(128);
						((IntResContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((IntResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(129);
						intRes(6);
						}
						break;
					case 2:
						{
						_localctx = new IntResContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intRes);
						setState(130);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(131);
						((IntResContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((IntResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(132);
						intRes(5);
						}
						break;
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class FloatResContext extends ParserRuleContext {
		public Token op;
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public List<FloatResContext> floatRes() {
			return getRuleContexts(FloatResContext.class);
		}
		public FloatResContext floatRes(int i) {
			return getRuleContext(FloatResContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public TerminalNode LPAREN() { return getToken(InterpreterParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(InterpreterParser.RPAREN, 0); }
		public FloatValueContext floatValue() {
			return getRuleContext(FloatValueContext.class,0);
		}
		public TerminalNode MUL() { return getToken(InterpreterParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(InterpreterParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(InterpreterParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(InterpreterParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(InterpreterParser.SUB, 0); }
		public FloatResContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatRes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterFloatRes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitFloatRes(this);
		}
	}

	public final FloatResContext floatRes() throws RecognitionException {
		return floatRes(0);
	}

	private FloatResContext floatRes(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FloatResContext _localctx = new FloatResContext(_ctx, _parentState);
		FloatResContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_floatRes, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(139);
				varName();
				setState(140);
				((FloatResContext)_localctx).op = match(ASSIGN);
				setState(141);
				floatRes(3);
				}
				break;
			case LPAREN:
				{
				setState(143);
				match(LPAREN);
				setState(144);
				floatRes(0);
				setState(145);
				match(RPAREN);
				}
				break;
			case FLOAT:
				{
				setState(147);
				floatValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(156);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new FloatResContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_floatRes);
						setState(150);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(151);
						((FloatResContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((FloatResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(152);
						floatRes(6);
						}
						break;
					case 2:
						{
						_localctx = new FloatResContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_floatRes);
						setState(153);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(154);
						((FloatResContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((FloatResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(155);
						floatRes(5);
						}
						break;
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class StringResContext extends ParserRuleContext {
		public Token op;
		public IntResContext intRes() {
			return getRuleContext(IntResContext.class,0);
		}
		public StringResContext stringRes() {
			return getRuleContext(StringResContext.class,0);
		}
		public TerminalNode MUL() { return getToken(InterpreterParser.MUL, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public StrLiteralContext strLiteral() {
			return getRuleContext(StrLiteralContext.class,0);
		}
		public StringResContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringRes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterStringRes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitStringRes(this);
		}
	}

	public final StringResContext stringRes() throws RecognitionException {
		return stringRes(0);
	}

	private StringResContext stringRes(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StringResContext _localctx = new StringResContext(_ctx, _parentState);
		StringResContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_stringRes, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(162);
				intRes(0);
				setState(163);
				((StringResContext)_localctx).op = match(MUL);
				setState(164);
				stringRes(3);
				}
				break;
			case 2:
				{
				setState(166);
				varName();
				setState(167);
				((StringResContext)_localctx).op = match(ASSIGN);
				setState(168);
				stringRes(2);
				}
				break;
			case 3:
				{
				setState(170);
				strLiteral();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StringResContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stringRes);
					setState(173);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(174);
					((StringResContext)_localctx).op = match(MUL);
					setState(175);
					intRes(0);
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class IntValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(InterpreterParser.INT, 0); }
		public IntValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterIntValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitIntValue(this);
		}
	}

	public final IntValueContext intValue() throws RecognitionException {
		IntValueContext _localctx = new IntValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_intValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatValueContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(InterpreterParser.FLOAT, 0); }
		public FloatValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterFloatValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitFloatValue(this);
		}
	}

	public final FloatValueContext floatValue() throws RecognitionException {
		FloatValueContext _localctx = new FloatValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_floatValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrLiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(InterpreterParser.STRING, 0); }
		public StrLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterStrLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitStrLiteral(this);
		}
	}

	public final StrLiteralContext strLiteral() throws RecognitionException {
		StrLiteralContext _localctx = new StrLiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_strLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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

	public static class BoolValContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(InterpreterParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(InterpreterParser.FALSE, 0); }
		public BoolValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterBoolVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitBoolVal(this);
		}
	}

	public final BoolValContext boolVal() throws RecognitionException {
		BoolValContext _localctx = new BoolValContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitVarName(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RvalueContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IntAssignContext intAssign() {
			return getRuleContext(IntAssignContext.class,0);
		}
		public IntResContext intRes() {
			return getRuleContext(IntResContext.class,0);
		}
		public IntValueContext intValue() {
			return getRuleContext(IntValueContext.class,0);
		}
		public FloatAssignContext floatAssign() {
			return getRuleContext(FloatAssignContext.class,0);
		}
		public FloatResContext floatRes() {
			return getRuleContext(FloatResContext.class,0);
		}
		public FloatValueContext floatValue() {
			return getRuleContext(FloatValueContext.class,0);
		}
		public StringAssignContext stringAssign() {
			return getRuleContext(StringAssignContext.class,0);
		}
		public StringResContext stringRes() {
			return getRuleContext(StringResContext.class,0);
		}
		public StrLiteralContext strLiteral() {
			return getRuleContext(StrLiteralContext.class,0);
		}
		public BoolValContext boolVal() {
			return getRuleContext(BoolValContext.class,0);
		}
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterRvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitRvalue(this);
		}
	}

	public final RvalueContext rvalue() throws RecognitionException {
		RvalueContext _localctx = new RvalueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rvalue);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				varName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				intAssign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				intRes(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				intValue();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				floatAssign();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				floatRes(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(200);
				floatValue();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(201);
				stringAssign();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(202);
				stringRes(0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(203);
				strLiteral();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(204);
				boolVal();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 9:
			return intRes_sempred((IntResContext)_localctx, predIndex);
		case 10:
			return floatRes_sempred((FloatResContext)_localctx, predIndex);
		case 11:
			return stringRes_sempred((StringResContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionList_sempred(ExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean intRes_sempred(IntResContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean floatRes_sempred(FloatResContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean stringRes_sempred(StringResContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\7\3\62\n\3\f"+
		"\3\16\3\65\13\3\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"e\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\to\n\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0080\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u0088\n\13\f\13\16\13\u008b\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0097\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u009f\n\f\f\f\16\f\u00a2\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00ae\n\r\3\r\3\r\3\r\7\r\u00b3\n\r\f\r\16\r\u00b6\13\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d0\n\24\3\24\2\6\4"+
		"\24\26\30\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\6\3\2\r\21"+
		"\3\2\t\13\3\2\7\b\3\2\35\36\2\u00dd\2(\3\2\2\2\4-\3\2\2\2\68\3\2\2\2\b"+
		"N\3\2\2\2\nP\3\2\2\2\fY\3\2\2\2\16d\3\2\2\2\20n\3\2\2\2\22p\3\2\2\2\24"+
		"\177\3\2\2\2\26\u0096\3\2\2\2\30\u00ad\3\2\2\2\32\u00b7\3\2\2\2\34\u00b9"+
		"\3\2\2\2\36\u00bb\3\2\2\2 \u00bd\3\2\2\2\"\u00bf\3\2\2\2$\u00c1\3\2\2"+
		"\2&\u00cf\3\2\2\2()\5\4\3\2)\3\3\2\2\2*+\b\3\1\2+.\5\6\4\2,.\7\2\2\3-"+
		"*\3\2\2\2-,\3\2\2\2.\63\3\2\2\2/\60\f\4\2\2\60\62\5\6\4\2\61/\3\2\2\2"+
		"\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\5\3\2\2\2\65\63\3\2\2\2"+
		"\669\5&\24\2\679\5\b\5\28\66\3\2\2\28\67\3\2\2\29\7\3\2\2\2:;\7\3\2\2"+
		";<\5&\24\2<=\7\26\2\2=?\5&\24\2>@\5\n\6\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2"+
		"\2AB\7\4\2\2BO\3\2\2\2CD\7\5\2\2DE\7\22\2\2EF\5&\24\2FG\7\26\2\2GH\5&"+
		"\24\2HJ\7\23\2\2IK\5\n\6\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\4\2\2MO\3"+
		"\2\2\2N:\3\2\2\2NC\3\2\2\2O\t\3\2\2\2PQ\5\4\3\2Q\13\3\2\2\2RS\7\6\2\2"+
		"SZ\5$\23\2TU\7\6\2\2UV\5$\23\2VW\7\f\2\2WX\5&\24\2XZ\3\2\2\2YR\3\2\2\2"+
		"YT\3\2\2\2Z\r\3\2\2\2[\\\7\6\2\2\\]\5$\23\2]^\7\f\2\2^_\5\24\13\2_`\7"+
		"\2\2\3`e\3\2\2\2ab\7\6\2\2bc\t\2\2\2ce\5\24\13\2d[\3\2\2\2da\3\2\2\2e"+
		"\17\3\2\2\2fg\7\6\2\2gh\5$\23\2hi\7\f\2\2ij\5\26\f\2jo\3\2\2\2kl\7\6\2"+
		"\2lm\t\2\2\2mo\5\26\f\2nf\3\2\2\2nk\3\2\2\2o\21\3\2\2\2pq\7\6\2\2qr\5"+
		"$\23\2rs\7\f\2\2st\5\30\r\2t\23\3\2\2\2uv\b\13\1\2vw\5$\23\2wx\7\f\2\2"+
		"xy\5\24\13\5y\u0080\3\2\2\2z{\7\22\2\2{|\5\24\13\2|}\7\23\2\2}\u0080\3"+
		"\2\2\2~\u0080\5\32\16\2\177u\3\2\2\2\177z\3\2\2\2\177~\3\2\2\2\u0080\u0089"+
		"\3\2\2\2\u0081\u0082\f\7\2\2\u0082\u0083\t\3\2\2\u0083\u0088\5\24\13\b"+
		"\u0084\u0085\f\6\2\2\u0085\u0086\t\4\2\2\u0086\u0088\5\24\13\7\u0087\u0081"+
		"\3\2\2\2\u0087\u0084\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\25\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\b\f\1"+
		"\2\u008d\u008e\5$\23\2\u008e\u008f\7\f\2\2\u008f\u0090\5\26\f\5\u0090"+
		"\u0097\3\2\2\2\u0091\u0092\7\22\2\2\u0092\u0093\5\26\f\2\u0093\u0094\7"+
		"\23\2\2\u0094\u0097\3\2\2\2\u0095\u0097\5\34\17\2\u0096\u008c\3\2\2\2"+
		"\u0096\u0091\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u00a0\3\2\2\2\u0098\u0099"+
		"\f\7\2\2\u0099\u009a\t\3\2\2\u009a\u009f\5\26\f\b\u009b\u009c\f\6\2\2"+
		"\u009c\u009d\t\4\2\2\u009d\u009f\5\26\f\7\u009e\u0098\3\2\2\2\u009e\u009b"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\27\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\b\r\1\2\u00a4\u00a5\5\24\13"+
		"\2\u00a5\u00a6\7\t\2\2\u00a6\u00a7\5\30\r\5\u00a7\u00ae\3\2\2\2\u00a8"+
		"\u00a9\5$\23\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\5\30\r\4\u00ab\u00ae\3"+
		"\2\2\2\u00ac\u00ae\5\36\20\2\u00ad\u00a3\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00b4\3\2\2\2\u00af\u00b0\f\6\2\2\u00b0\u00b1\7\t"+
		"\2\2\u00b1\u00b3\5\24\13\2\u00b2\u00af\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\31\3\2\2\2\u00b6\u00b4\3\2\2"+
		"\2\u00b7\u00b8\7\32\2\2\u00b8\33\3\2\2\2\u00b9\u00ba\7\33\2\2\u00ba\35"+
		"\3\2\2\2\u00bb\u00bc\7\34\2\2\u00bc\37\3\2\2\2\u00bd\u00be\t\5\2\2\u00be"+
		"!\3\2\2\2\u00bf\u00c0\7\37\2\2\u00c0#\3\2\2\2\u00c1\u00c2\5\"\22\2\u00c2"+
		"%\3\2\2\2\u00c3\u00d0\5$\23\2\u00c4\u00d0\5\f\7\2\u00c5\u00d0\5\16\b\2"+
		"\u00c6\u00d0\5\24\13\2\u00c7\u00d0\5\32\16\2\u00c8\u00d0\5\20\t\2\u00c9"+
		"\u00d0\5\26\f\2\u00ca\u00d0\5\34\17\2\u00cb\u00d0\5\22\n\2\u00cc\u00d0"+
		"\5\30\r\2\u00cd\u00d0\5\36\20\2\u00ce\u00d0\5 \21\2\u00cf\u00c3\3\2\2"+
		"\2\u00cf\u00c4\3\2\2\2\u00cf\u00c5\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00c7"+
		"\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf"+
		"\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\'\3\2\2\2\24-\638?JNYdn\177\u0087\u0089\u0096\u009e\u00a0\u00ad"+
		"\u00b4\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}