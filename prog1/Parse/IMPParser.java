// Generated from IMP.g4 by ANTLR 4.13.2

    package Parse;
    import Tree.*;
    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class IMPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, IDENT=37, INT=38, WS=39;
	public static final int
		RULE_program = 0, RULE_statementlist = 1, RULE_statement = 2, RULE_assertion = 3, 
		RULE_boolexp = 4, RULE_boolterm = 5, RULE_boolterm2 = 6, RULE_boolfactor = 7, 
		RULE_compexp = 8, RULE_arithexp = 9, RULE_arithterm = 10, RULE_arithfactor = 11, 
		RULE_arithexplist = 12, RULE_id = 13, RULE_integer = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statementlist", "statement", "assertion", "boolexp", "boolterm", 
			"boolterm2", "boolfactor", "compexp", "arithexp", "arithterm", "arithfactor", 
			"arithexplist", "id", "integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'skip'", "':='", "'begin'", "'end'", "'if'", "'then'", 
			"'else'", "'while'", "'do'", "'assert'", "'{'", "'}'", "'=>'", "'<=>'", 
			"'or'", "'and'", "'true'", "'false'", "'forall'", "'.'", "'exists'", 
			"'not'", "'('", "')'", "'<'", "'<='", "'='", "'!='", "'>='", "'>'", "'+'", 
			"'-'", "'*'", "'/'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "IDENT", "INT", "WS"
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
	public String getGrammarFileName() { return "IMP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IMPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public AssertionContext pre;
		public StatementlistContext statementlist;
		public AssertionContext post;
		public StatementlistContext statementlist() {
			return getRuleContext(StatementlistContext.class,0);
		}
		public List<AssertionContext> assertion() {
			return getRuleContexts(AssertionContext.class);
		}
		public AssertionContext assertion(int i) {
			return getRuleContext(AssertionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((ProgramContext)_localctx).pre = assertion();
			setState(31);
			((ProgramContext)_localctx).statementlist = statementlist();
			setState(32);
			((ProgramContext)_localctx).post = assertion();

					    Exp wlp = ((ProgramContext)_localctx).statementlist.tree.wlp(((ProgramContext)_localctx).post.tree);
					    Exp vc = new OpExp(((ProgramContext)_localctx).pre.tree, OpExp.Op.IMP, wlp);
					    vc.print();
					    System.out.println();
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementlistContext extends ParserRuleContext {
		public Stmt tree;
		public StatementContext statement;
		public StatementContext s1;
		public StatementlistContext s2;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementlistContext statementlist() {
			return getRuleContext(StatementlistContext.class,0);
		}
		public StatementlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterStatementlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitStatementlist(this);
		}
	}

	public final StatementlistContext statementlist() throws RecognitionException {
		StatementlistContext _localctx = new StatementlistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementlist);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				((StatementlistContext)_localctx).statement = statement();
				 ((StatementlistContext)_localctx).tree =  ((StatementlistContext)_localctx).statement.tree; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				((StatementlistContext)_localctx).s1 = statement();
				setState(39);
				match(T__0);
				setState(40);
				((StatementlistContext)_localctx).s2 = statementlist();
				 ((StatementlistContext)_localctx).tree =  new Seq(((StatementlistContext)_localctx).s1.tree, ((StatementlistContext)_localctx).s2.tree); 
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
	public static class StatementContext extends ParserRuleContext {
		public Stmt tree;
		public IdContext id;
		public ArithexpContext arithexp;
		public StatementlistContext statementlist;
		public BooltermContext boolterm;
		public StatementContext s1;
		public StatementContext s2;
		public AssertionContext assertion;
		public StatementContext statement;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ArithexpContext arithexp() {
			return getRuleContext(ArithexpContext.class,0);
		}
		public StatementlistContext statementlist() {
			return getRuleContext(StatementlistContext.class,0);
		}
		public BooltermContext boolterm() {
			return getRuleContext(BooltermContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__1);
				 ((StatementContext)_localctx).tree =  new Skip(); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				((StatementContext)_localctx).id = id();
				setState(48);
				match(T__2);
				setState(49);
				((StatementContext)_localctx).arithexp = arithexp(0);
				 ((StatementContext)_localctx).tree =  new Assign(((StatementContext)_localctx).id.name, ((StatementContext)_localctx).arithexp.tree); 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(T__3);
				setState(53);
				((StatementContext)_localctx).statementlist = statementlist();
				setState(54);
				match(T__4);
				 ((StatementContext)_localctx).tree =  ((StatementContext)_localctx).statementlist.tree; 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				match(T__5);
				setState(58);
				((StatementContext)_localctx).boolterm = boolterm(0);
				setState(59);
				match(T__6);
				setState(60);
				((StatementContext)_localctx).s1 = statement();
				setState(61);
				match(T__7);
				setState(62);
				((StatementContext)_localctx).s2 = statement();
				 ((StatementContext)_localctx).tree =  new IfThenElse(((StatementContext)_localctx).boolterm.tree, ((StatementContext)_localctx).s1.tree, ((StatementContext)_localctx).s2.tree); 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				((StatementContext)_localctx).assertion = assertion();
				setState(66);
				match(T__8);
				setState(67);
				((StatementContext)_localctx).boolterm = boolterm(0);
				setState(68);
				match(T__9);
				setState(69);
				((StatementContext)_localctx).statement = statement();
				 ((StatementContext)_localctx).tree =  new While(((StatementContext)_localctx).assertion.tree, ((StatementContext)_localctx).boolterm.tree, ((StatementContext)_localctx).statement.tree); 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				match(T__10);
				setState(73);
				((StatementContext)_localctx).assertion = assertion();
				 ((StatementContext)_localctx).tree =  new AssertStmt(((StatementContext)_localctx).assertion.tree); 
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
	public static class AssertionContext extends ParserRuleContext {
		public Exp tree;
		public BoolexpContext t;
		public BoolexpContext boolexp() {
			return getRuleContext(BoolexpContext.class,0);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitAssertion(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__11);
			setState(79);
			((AssertionContext)_localctx).t = boolexp();
			setState(80);
			match(T__12);
			 ((AssertionContext)_localctx).tree =  ((AssertionContext)_localctx).t.tree; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolexpContext extends ParserRuleContext {
		public Exp tree;
		public BooltermContext t;
		public BooltermContext t1;
		public BooltermContext t2;
		public List<BooltermContext> boolterm() {
			return getRuleContexts(BooltermContext.class);
		}
		public BooltermContext boolterm(int i) {
			return getRuleContext(BooltermContext.class,i);
		}
		public BoolexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterBoolexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitBoolexp(this);
		}
	}

	public final BoolexpContext boolexp() throws RecognitionException {
		BoolexpContext _localctx = new BoolexpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_boolexp);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				((BoolexpContext)_localctx).t = boolterm(0);
				 ((BoolexpContext)_localctx).tree =  ((BoolexpContext)_localctx).t.tree; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				((BoolexpContext)_localctx).t1 = boolterm(0);
				setState(87);
				match(T__13);
				setState(88);
				((BoolexpContext)_localctx).t2 = boolterm(0);
				 ((BoolexpContext)_localctx).tree =  new OpExp(((BoolexpContext)_localctx).t1.tree, OpExp.Op.IMP, ((BoolexpContext)_localctx).t2.tree); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				((BoolexpContext)_localctx).t1 = boolterm(0);
				setState(92);
				match(T__14);
				setState(93);
				((BoolexpContext)_localctx).t2 = boolterm(0);
				 ((BoolexpContext)_localctx).tree =  new OpExp(((BoolexpContext)_localctx).t1.tree, OpExp.Op.EQV, ((BoolexpContext)_localctx).t2.tree); 
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
	public static class BooltermContext extends ParserRuleContext {
		public Exp tree;
		public BooltermContext t1;
		public Boolterm2Context t;
		public Boolterm2Context t2;
		public Boolterm2Context boolterm2() {
			return getRuleContext(Boolterm2Context.class,0);
		}
		public BooltermContext boolterm() {
			return getRuleContext(BooltermContext.class,0);
		}
		public BooltermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterBoolterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitBoolterm(this);
		}
	}

	public final BooltermContext boolterm() throws RecognitionException {
		return boolterm(0);
	}

	private BooltermContext boolterm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooltermContext _localctx = new BooltermContext(_ctx, _parentState);
		BooltermContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_boolterm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(99);
			((BooltermContext)_localctx).t = boolterm2(0);
			 ((BooltermContext)_localctx).tree =  ((BooltermContext)_localctx).t.tree; 
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BooltermContext(_parentctx, _parentState);
					_localctx.t1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_boolterm);
					setState(102);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(103);
					match(T__15);
					setState(104);
					((BooltermContext)_localctx).t2 = boolterm2(0);
					 ((BooltermContext)_localctx).tree =  new OpExp(((BooltermContext)_localctx).t1.tree, OpExp.Op.OR, ((BooltermContext)_localctx).t2.tree); 
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	public static class Boolterm2Context extends ParserRuleContext {
		public Exp tree;
		public Boolterm2Context t1;
		public BoolfactorContext t;
		public BoolfactorContext t2;
		public BoolfactorContext boolfactor() {
			return getRuleContext(BoolfactorContext.class,0);
		}
		public Boolterm2Context boolterm2() {
			return getRuleContext(Boolterm2Context.class,0);
		}
		public Boolterm2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolterm2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterBoolterm2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitBoolterm2(this);
		}
	}

	public final Boolterm2Context boolterm2() throws RecognitionException {
		return boolterm2(0);
	}

	private Boolterm2Context boolterm2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Boolterm2Context _localctx = new Boolterm2Context(_ctx, _parentState);
		Boolterm2Context _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_boolterm2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(113);
			((Boolterm2Context)_localctx).t = boolfactor();
			 ((Boolterm2Context)_localctx).tree =  ((Boolterm2Context)_localctx).t.tree; 
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Boolterm2Context(_parentctx, _parentState);
					_localctx.t1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_boolterm2);
					setState(116);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(117);
					match(T__16);
					setState(118);
					((Boolterm2Context)_localctx).t2 = boolfactor();
					 ((Boolterm2Context)_localctx).tree =  new OpExp(((Boolterm2Context)_localctx).t1.tree, OpExp.Op.AND, ((Boolterm2Context)_localctx).t2.tree); 
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class BoolfactorContext extends ParserRuleContext {
		public Exp tree;
		public CompexpContext compexp;
		public IdContext id;
		public BoolexpContext boolexp;
		public BoolfactorContext boolfactor;
		public BoolexpContext t;
		public CompexpContext compexp() {
			return getRuleContext(CompexpContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public BoolexpContext boolexp() {
			return getRuleContext(BoolexpContext.class,0);
		}
		public BoolfactorContext boolfactor() {
			return getRuleContext(BoolfactorContext.class,0);
		}
		public BoolfactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolfactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterBoolfactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitBoolfactor(this);
		}
	}

	public final BoolfactorContext boolfactor() throws RecognitionException {
		BoolfactorContext _localctx = new BoolfactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolfactor);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__17);
				 ((BoolfactorContext)_localctx).tree =  new BoolLit(true); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__18);
				 ((BoolfactorContext)_localctx).tree =  new BoolLit(false); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				((BoolfactorContext)_localctx).compexp = compexp();
				 ((BoolfactorContext)_localctx).tree =  ((BoolfactorContext)_localctx).compexp.tree; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(T__19);
				setState(134);
				((BoolfactorContext)_localctx).id = id();
				setState(135);
				match(T__20);
				setState(136);
				((BoolfactorContext)_localctx).boolexp = boolexp();
				 ((BoolfactorContext)_localctx).tree =  new ForAll(((BoolfactorContext)_localctx).id.name.getName(), ((BoolfactorContext)_localctx).boolexp.tree); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(T__21);
				setState(140);
				((BoolfactorContext)_localctx).id = id();
				setState(141);
				match(T__20);
				setState(142);
				((BoolfactorContext)_localctx).boolexp = boolexp();
				 ((BoolfactorContext)_localctx).tree =  new Exists(((BoolfactorContext)_localctx).id.name.getName(), ((BoolfactorContext)_localctx).boolexp.tree); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				match(T__22);
				setState(146);
				((BoolfactorContext)_localctx).boolfactor = boolfactor();
				 ((BoolfactorContext)_localctx).tree =  new OpExp(OpExp.Op.NOT, ((BoolfactorContext)_localctx).boolfactor.tree); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				match(T__23);
				setState(150);
				((BoolfactorContext)_localctx).t = boolexp();
				setState(151);
				match(T__24);
				 ((BoolfactorContext)_localctx).tree =  ((BoolfactorContext)_localctx).t.tree; 
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
	public static class CompexpContext extends ParserRuleContext {
		public Exp tree;
		public ArithexpContext t1;
		public ArithexpContext t2;
		public List<ArithexpContext> arithexp() {
			return getRuleContexts(ArithexpContext.class);
		}
		public ArithexpContext arithexp(int i) {
			return getRuleContext(ArithexpContext.class,i);
		}
		public CompexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterCompexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitCompexp(this);
		}
	}

	public final CompexpContext compexp() throws RecognitionException {
		CompexpContext _localctx = new CompexpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compexp);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				((CompexpContext)_localctx).t1 = arithexp(0);
				setState(157);
				match(T__25);
				setState(158);
				((CompexpContext)_localctx).t2 = arithexp(0);
				 ((CompexpContext)_localctx).tree =  new OpExp(((CompexpContext)_localctx).t1.tree, OpExp.Op.LT, ((CompexpContext)_localctx).t2.tree); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				((CompexpContext)_localctx).t1 = arithexp(0);
				setState(162);
				match(T__26);
				setState(163);
				((CompexpContext)_localctx).t2 = arithexp(0);
				 ((CompexpContext)_localctx).tree =  new OpExp(((CompexpContext)_localctx).t1.tree, OpExp.Op.LE, ((CompexpContext)_localctx).t2.tree); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				((CompexpContext)_localctx).t1 = arithexp(0);
				setState(167);
				match(T__27);
				setState(168);
				((CompexpContext)_localctx).t2 = arithexp(0);
				 ((CompexpContext)_localctx).tree =  new OpExp(((CompexpContext)_localctx).t1.tree, OpExp.Op.EQ, ((CompexpContext)_localctx).t2.tree); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				((CompexpContext)_localctx).t1 = arithexp(0);
				setState(172);
				match(T__28);
				setState(173);
				((CompexpContext)_localctx).t2 = arithexp(0);
				 ((CompexpContext)_localctx).tree =  new OpExp(((CompexpContext)_localctx).t1.tree, OpExp.Op.NE, ((CompexpContext)_localctx).t2.tree); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				((CompexpContext)_localctx).t1 = arithexp(0);
				setState(177);
				match(T__29);
				setState(178);
				((CompexpContext)_localctx).t2 = arithexp(0);
				 ((CompexpContext)_localctx).tree =  new OpExp(((CompexpContext)_localctx).t1.tree, OpExp.Op.GE, ((CompexpContext)_localctx).t2.tree); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				((CompexpContext)_localctx).t1 = arithexp(0);
				setState(182);
				match(T__30);
				setState(183);
				((CompexpContext)_localctx).t2 = arithexp(0);
				 ((CompexpContext)_localctx).tree =  new OpExp(((CompexpContext)_localctx).t1.tree, OpExp.Op.GT, ((CompexpContext)_localctx).t2.tree); 
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
	public static class ArithexpContext extends ParserRuleContext {
		public Exp tree;
		public ArithexpContext t1;
		public ArithtermContext t;
		public ArithtermContext t2;
		public ArithtermContext arithterm() {
			return getRuleContext(ArithtermContext.class,0);
		}
		public ArithexpContext arithexp() {
			return getRuleContext(ArithexpContext.class,0);
		}
		public ArithexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterArithexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitArithexp(this);
		}
	}

	public final ArithexpContext arithexp() throws RecognitionException {
		return arithexp(0);
	}

	private ArithexpContext arithexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithexpContext _localctx = new ArithexpContext(_ctx, _parentState);
		ArithexpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_arithexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(189);
			((ArithexpContext)_localctx).t = arithterm(0);
			 ((ArithexpContext)_localctx).tree =  ((ArithexpContext)_localctx).t.tree; 
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ArithexpContext(_parentctx, _parentState);
						_localctx.t1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithexp);
						setState(192);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(193);
						match(T__31);
						setState(194);
						((ArithexpContext)_localctx).t2 = arithterm(0);
						 ((ArithexpContext)_localctx).tree =  new OpExp(((ArithexpContext)_localctx).t1.tree, OpExp.Op.PLUS, ((ArithexpContext)_localctx).t2.tree); 
						}
						break;
					case 2:
						{
						_localctx = new ArithexpContext(_parentctx, _parentState);
						_localctx.t1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithexp);
						setState(197);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(198);
						match(T__32);
						setState(199);
						((ArithexpContext)_localctx).t2 = arithterm(0);
						 ((ArithexpContext)_localctx).tree =  new OpExp(((ArithexpContext)_localctx).t1.tree, OpExp.Op.MINUS, ((ArithexpContext)_localctx).t2.tree); 
						}
						break;
					}
					} 
				}
				setState(206);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArithtermContext extends ParserRuleContext {
		public Exp tree;
		public ArithtermContext t1;
		public ArithfactorContext t;
		public ArithfactorContext t2;
		public ArithfactorContext arithfactor() {
			return getRuleContext(ArithfactorContext.class,0);
		}
		public ArithtermContext arithterm() {
			return getRuleContext(ArithtermContext.class,0);
		}
		public ArithtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterArithterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitArithterm(this);
		}
	}

	public final ArithtermContext arithterm() throws RecognitionException {
		return arithterm(0);
	}

	private ArithtermContext arithterm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithtermContext _localctx = new ArithtermContext(_ctx, _parentState);
		ArithtermContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_arithterm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(208);
			((ArithtermContext)_localctx).t = arithfactor();
			 ((ArithtermContext)_localctx).tree =  ((ArithtermContext)_localctx).t.tree; 
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ArithtermContext(_parentctx, _parentState);
						_localctx.t1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithterm);
						setState(211);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(212);
						match(T__33);
						setState(213);
						((ArithtermContext)_localctx).t2 = arithfactor();
						 ((ArithtermContext)_localctx).tree =  new OpExp(((ArithtermContext)_localctx).t1.tree, OpExp.Op.TIMES, ((ArithtermContext)_localctx).t2.tree); 
						}
						break;
					case 2:
						{
						_localctx = new ArithtermContext(_parentctx, _parentState);
						_localctx.t1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithterm);
						setState(216);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(217);
						match(T__34);
						setState(218);
						((ArithtermContext)_localctx).t2 = arithfactor();
						 ((ArithtermContext)_localctx).tree =  new OpExp(((ArithtermContext)_localctx).t1.tree, OpExp.Op.DIV, ((ArithtermContext)_localctx).t2.tree); 
						}
						break;
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	public static class ArithfactorContext extends ParserRuleContext {
		public Exp tree;
		public IdContext id;
		public IntegerContext integer;
		public ArithfactorContext af;
		public ArithexpContext ae;
		public ArithexplistContext arithexplist;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public ArithfactorContext arithfactor() {
			return getRuleContext(ArithfactorContext.class,0);
		}
		public ArithexpContext arithexp() {
			return getRuleContext(ArithexpContext.class,0);
		}
		public ArithexplistContext arithexplist() {
			return getRuleContext(ArithexplistContext.class,0);
		}
		public ArithfactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithfactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterArithfactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitArithfactor(this);
		}
	}

	public final ArithfactorContext arithfactor() throws RecognitionException {
		ArithfactorContext _localctx = new ArithfactorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arithfactor);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				((ArithfactorContext)_localctx).id = id();
				 ((ArithfactorContext)_localctx).tree =  ((ArithfactorContext)_localctx).id.name; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				((ArithfactorContext)_localctx).integer = integer();
				 ((ArithfactorContext)_localctx).tree =  ((ArithfactorContext)_localctx).integer.value; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(T__32);
				setState(233);
				((ArithfactorContext)_localctx).af = arithfactor();
				 ((ArithfactorContext)_localctx).tree =  new OpExp(OpExp.Op.UMINUS, ((ArithfactorContext)_localctx).af.tree); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(T__23);
				setState(237);
				((ArithfactorContext)_localctx).ae = arithexp(0);
				setState(238);
				match(T__24);
				 ((ArithfactorContext)_localctx).tree =  ((ArithfactorContext)_localctx).ae.tree; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				((ArithfactorContext)_localctx).id = id();
				setState(242);
				match(T__23);
				setState(243);
				((ArithfactorContext)_localctx).arithexplist = arithexplist();
				setState(244);
				match(T__24);
				 ((ArithfactorContext)_localctx).tree =  new FuncApp(((ArithfactorContext)_localctx).id.name.getName(), ((ArithfactorContext)_localctx).arithexplist.trees); 
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
	public static class ArithexplistContext extends ParserRuleContext {
		public java.util.List<Exp> trees;
		public ArithexpContext t;
		public ArithexplistContext rest;
		public ArithexpContext arithexp() {
			return getRuleContext(ArithexpContext.class,0);
		}
		public ArithexplistContext arithexplist() {
			return getRuleContext(ArithexplistContext.class,0);
		}
		public ArithexplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithexplist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterArithexplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitArithexplist(this);
		}
	}

	public final ArithexplistContext arithexplist() throws RecognitionException {
		ArithexplistContext _localctx = new ArithexplistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arithexplist);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				((ArithexplistContext)_localctx).t = arithexp(0);
				 ((ArithexplistContext)_localctx).trees =  new java.util.ArrayList<Exp>(); _localctx.trees.add(((ArithexplistContext)_localctx).t.tree); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				((ArithexplistContext)_localctx).t = arithexp(0);
				setState(253);
				match(T__35);
				setState(254);
				((ArithexplistContext)_localctx).rest = arithexplist();
				 ((ArithexplistContext)_localctx).trees =  ((ArithexplistContext)_localctx).rest.trees; _localctx.trees.add(0, ((ArithexplistContext)_localctx).t.tree); 
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
	public static class IdContext extends ParserRuleContext {
		public Ident name;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(IMPParser.IDENT, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			((IdContext)_localctx).IDENT = match(IDENT);
			 ((IdContext)_localctx).name =  new Ident((((IdContext)_localctx).IDENT!=null?((IdContext)_localctx).IDENT.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ParserRuleContext {
		public IntLit value;
		public Token INT;
		public TerminalNode INT() { return getToken(IMPParser.INT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			((IntegerContext)_localctx).INT = match(INT);
			 ((IntegerContext)_localctx).value =  new IntLit(Integer.parseInt((((IntegerContext)_localctx).INT!=null?((IntegerContext)_localctx).INT.getText():null))); 
			}
		}
		catch (RecognitionException re) {
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
		case 5:
			return boolterm_sempred((BooltermContext)_localctx, predIndex);
		case 6:
			return boolterm2_sempred((Boolterm2Context)_localctx, predIndex);
		case 9:
			return arithexp_sempred((ArithexpContext)_localctx, predIndex);
		case 10:
			return arithterm_sempred((ArithtermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolterm_sempred(BooltermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolterm2_sempred(Boolterm2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arithexp_sempred(ArithexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arithterm_sempred(ArithtermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u010a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		",\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002M\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004a\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005l\b\u0005\n\u0005\f\u0005"+
		"o\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006z\b\u0006"+
		"\n\u0006\f\u0006}\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u009b\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00bb\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00cb\b\t\n\t\f\t\u00ce\t\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00de\b\n\n\n\f\n\u00e1"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00f8\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0102"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0000\u0004\n\f\u0012\u0014\u000f\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0000\u0118\u0000"+
		"\u001e\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004L\u0001"+
		"\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\b`\u0001\u0000\u0000"+
		"\u0000\nb\u0001\u0000\u0000\u0000\fp\u0001\u0000\u0000\u0000\u000e\u009a"+
		"\u0001\u0000\u0000\u0000\u0010\u00ba\u0001\u0000\u0000\u0000\u0012\u00bc"+
		"\u0001\u0000\u0000\u0000\u0014\u00cf\u0001\u0000\u0000\u0000\u0016\u00f7"+
		"\u0001\u0000\u0000\u0000\u0018\u0101\u0001\u0000\u0000\u0000\u001a\u0103"+
		"\u0001\u0000\u0000\u0000\u001c\u0106\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0003\u0006\u0003\u0000\u001f \u0003\u0002\u0001\u0000 !\u0003\u0006"+
		"\u0003\u0000!\"\u0006\u0000\uffff\uffff\u0000\"\u0001\u0001\u0000\u0000"+
		"\u0000#$\u0003\u0004\u0002\u0000$%\u0006\u0001\uffff\uffff\u0000%,\u0001"+
		"\u0000\u0000\u0000&\'\u0003\u0004\u0002\u0000\'(\u0005\u0001\u0000\u0000"+
		"()\u0003\u0002\u0001\u0000)*\u0006\u0001\uffff\uffff\u0000*,\u0001\u0000"+
		"\u0000\u0000+#\u0001\u0000\u0000\u0000+&\u0001\u0000\u0000\u0000,\u0003"+
		"\u0001\u0000\u0000\u0000-.\u0005\u0002\u0000\u0000.M\u0006\u0002\uffff"+
		"\uffff\u0000/0\u0003\u001a\r\u000001\u0005\u0003\u0000\u000012\u0003\u0012"+
		"\t\u000023\u0006\u0002\uffff\uffff\u00003M\u0001\u0000\u0000\u000045\u0005"+
		"\u0004\u0000\u000056\u0003\u0002\u0001\u000067\u0005\u0005\u0000\u0000"+
		"78\u0006\u0002\uffff\uffff\u00008M\u0001\u0000\u0000\u00009:\u0005\u0006"+
		"\u0000\u0000:;\u0003\n\u0005\u0000;<\u0005\u0007\u0000\u0000<=\u0003\u0004"+
		"\u0002\u0000=>\u0005\b\u0000\u0000>?\u0003\u0004\u0002\u0000?@\u0006\u0002"+
		"\uffff\uffff\u0000@M\u0001\u0000\u0000\u0000AB\u0003\u0006\u0003\u0000"+
		"BC\u0005\t\u0000\u0000CD\u0003\n\u0005\u0000DE\u0005\n\u0000\u0000EF\u0003"+
		"\u0004\u0002\u0000FG\u0006\u0002\uffff\uffff\u0000GM\u0001\u0000\u0000"+
		"\u0000HI\u0005\u000b\u0000\u0000IJ\u0003\u0006\u0003\u0000JK\u0006\u0002"+
		"\uffff\uffff\u0000KM\u0001\u0000\u0000\u0000L-\u0001\u0000\u0000\u0000"+
		"L/\u0001\u0000\u0000\u0000L4\u0001\u0000\u0000\u0000L9\u0001\u0000\u0000"+
		"\u0000LA\u0001\u0000\u0000\u0000LH\u0001\u0000\u0000\u0000M\u0005\u0001"+
		"\u0000\u0000\u0000NO\u0005\f\u0000\u0000OP\u0003\b\u0004\u0000PQ\u0005"+
		"\r\u0000\u0000QR\u0006\u0003\uffff\uffff\u0000R\u0007\u0001\u0000\u0000"+
		"\u0000ST\u0003\n\u0005\u0000TU\u0006\u0004\uffff\uffff\u0000Ua\u0001\u0000"+
		"\u0000\u0000VW\u0003\n\u0005\u0000WX\u0005\u000e\u0000\u0000XY\u0003\n"+
		"\u0005\u0000YZ\u0006\u0004\uffff\uffff\u0000Za\u0001\u0000\u0000\u0000"+
		"[\\\u0003\n\u0005\u0000\\]\u0005\u000f\u0000\u0000]^\u0003\n\u0005\u0000"+
		"^_\u0006\u0004\uffff\uffff\u0000_a\u0001\u0000\u0000\u0000`S\u0001\u0000"+
		"\u0000\u0000`V\u0001\u0000\u0000\u0000`[\u0001\u0000\u0000\u0000a\t\u0001"+
		"\u0000\u0000\u0000bc\u0006\u0005\uffff\uffff\u0000cd\u0003\f\u0006\u0000"+
		"de\u0006\u0005\uffff\uffff\u0000em\u0001\u0000\u0000\u0000fg\n\u0001\u0000"+
		"\u0000gh\u0005\u0010\u0000\u0000hi\u0003\f\u0006\u0000ij\u0006\u0005\uffff"+
		"\uffff\u0000jl\u0001\u0000\u0000\u0000kf\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"n\u000b\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0006\u0006"+
		"\uffff\uffff\u0000qr\u0003\u000e\u0007\u0000rs\u0006\u0006\uffff\uffff"+
		"\u0000s{\u0001\u0000\u0000\u0000tu\n\u0001\u0000\u0000uv\u0005\u0011\u0000"+
		"\u0000vw\u0003\u000e\u0007\u0000wx\u0006\u0006\uffff\uffff\u0000xz\u0001"+
		"\u0000\u0000\u0000yt\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\r\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005\u0012\u0000\u0000\u007f"+
		"\u009b\u0006\u0007\uffff\uffff\u0000\u0080\u0081\u0005\u0013\u0000\u0000"+
		"\u0081\u009b\u0006\u0007\uffff\uffff\u0000\u0082\u0083\u0003\u0010\b\u0000"+
		"\u0083\u0084\u0006\u0007\uffff\uffff\u0000\u0084\u009b\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005\u0014\u0000\u0000\u0086\u0087\u0003\u001a\r\u0000"+
		"\u0087\u0088\u0005\u0015\u0000\u0000\u0088\u0089\u0003\b\u0004\u0000\u0089"+
		"\u008a\u0006\u0007\uffff\uffff\u0000\u008a\u009b\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0005\u0016\u0000\u0000\u008c\u008d\u0003\u001a\r\u0000\u008d"+
		"\u008e\u0005\u0015\u0000\u0000\u008e\u008f\u0003\b\u0004\u0000\u008f\u0090"+
		"\u0006\u0007\uffff\uffff\u0000\u0090\u009b\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0005\u0017\u0000\u0000\u0092\u0093\u0003\u000e\u0007\u0000\u0093"+
		"\u0094\u0006\u0007\uffff\uffff\u0000\u0094\u009b\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\u0018\u0000\u0000\u0096\u0097\u0003\b\u0004\u0000\u0097"+
		"\u0098\u0005\u0019\u0000\u0000\u0098\u0099\u0006\u0007\uffff\uffff\u0000"+
		"\u0099\u009b\u0001\u0000\u0000\u0000\u009a~\u0001\u0000\u0000\u0000\u009a"+
		"\u0080\u0001\u0000\u0000\u0000\u009a\u0082\u0001\u0000\u0000\u0000\u009a"+
		"\u0085\u0001\u0000\u0000\u0000\u009a\u008b\u0001\u0000\u0000\u0000\u009a"+
		"\u0091\u0001\u0000\u0000\u0000\u009a\u0095\u0001\u0000\u0000\u0000\u009b"+
		"\u000f\u0001\u0000\u0000\u0000\u009c\u009d\u0003\u0012\t\u0000\u009d\u009e"+
		"\u0005\u001a\u0000\u0000\u009e\u009f\u0003\u0012\t\u0000\u009f\u00a0\u0006"+
		"\b\uffff\uffff\u0000\u00a0\u00bb\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003"+
		"\u0012\t\u0000\u00a2\u00a3\u0005\u001b\u0000\u0000\u00a3\u00a4\u0003\u0012"+
		"\t\u0000\u00a4\u00a5\u0006\b\uffff\uffff\u0000\u00a5\u00bb\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0003\u0012\t\u0000\u00a7\u00a8\u0005\u001c\u0000"+
		"\u0000\u00a8\u00a9\u0003\u0012\t\u0000\u00a9\u00aa\u0006\b\uffff\uffff"+
		"\u0000\u00aa\u00bb\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003\u0012\t\u0000"+
		"\u00ac\u00ad\u0005\u001d\u0000\u0000\u00ad\u00ae\u0003\u0012\t\u0000\u00ae"+
		"\u00af\u0006\b\uffff\uffff\u0000\u00af\u00bb\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0003\u0012\t\u0000\u00b1\u00b2\u0005\u001e\u0000\u0000\u00b2\u00b3"+
		"\u0003\u0012\t\u0000\u00b3\u00b4\u0006\b\uffff\uffff\u0000\u00b4\u00bb"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003\u0012\t\u0000\u00b6\u00b7\u0005"+
		"\u001f\u0000\u0000\u00b7\u00b8\u0003\u0012\t\u0000\u00b8\u00b9\u0006\b"+
		"\uffff\uffff\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u009c\u0001"+
		"\u0000\u0000\u0000\u00ba\u00a1\u0001\u0000\u0000\u0000\u00ba\u00a6\u0001"+
		"\u0000\u0000\u0000\u00ba\u00ab\u0001\u0000\u0000\u0000\u00ba\u00b0\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b5\u0001\u0000\u0000\u0000\u00bb\u0011\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0006\t\uffff\uffff\u0000\u00bd\u00be\u0003"+
		"\u0014\n\u0000\u00be\u00bf\u0006\t\uffff\uffff\u0000\u00bf\u00cc\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\n\u0002\u0000\u0000\u00c1\u00c2\u0005 "+
		"\u0000\u0000\u00c2\u00c3\u0003\u0014\n\u0000\u00c3\u00c4\u0006\t\uffff"+
		"\uffff\u0000\u00c4\u00cb\u0001\u0000\u0000\u0000\u00c5\u00c6\n\u0001\u0000"+
		"\u0000\u00c6\u00c7\u0005!\u0000\u0000\u00c7\u00c8\u0003\u0014\n\u0000"+
		"\u00c8\u00c9\u0006\t\uffff\uffff\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c0\u0001\u0000\u0000\u0000\u00ca\u00c5\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u0013\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0006\n\uffff\uffff\u0000"+
		"\u00d0\u00d1\u0003\u0016\u000b\u0000\u00d1\u00d2\u0006\n\uffff\uffff\u0000"+
		"\u00d2\u00df\u0001\u0000\u0000\u0000\u00d3\u00d4\n\u0002\u0000\u0000\u00d4"+
		"\u00d5\u0005\"\u0000\u0000\u00d5\u00d6\u0003\u0016\u000b\u0000\u00d6\u00d7"+
		"\u0006\n\uffff\uffff\u0000\u00d7\u00de\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\n\u0001\u0000\u0000\u00d9\u00da\u0005#\u0000\u0000\u00da\u00db\u0003"+
		"\u0016\u000b\u0000\u00db\u00dc\u0006\n\uffff\uffff\u0000\u00dc\u00de\u0001"+
		"\u0000\u0000\u0000\u00dd\u00d3\u0001\u0000\u0000\u0000\u00dd\u00d8\u0001"+
		"\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u0015\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003"+
		"\u001a\r\u0000\u00e3\u00e4\u0006\u000b\uffff\uffff\u0000\u00e4\u00f8\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0003\u001c\u000e\u0000\u00e6\u00e7\u0006"+
		"\u000b\uffff\uffff\u0000\u00e7\u00f8\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0005!\u0000\u0000\u00e9\u00ea\u0003\u0016\u000b\u0000\u00ea\u00eb\u0006"+
		"\u000b\uffff\uffff\u0000\u00eb\u00f8\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0005\u0018\u0000\u0000\u00ed\u00ee\u0003\u0012\t\u0000\u00ee\u00ef\u0005"+
		"\u0019\u0000\u0000\u00ef\u00f0\u0006\u000b\uffff\uffff\u0000\u00f0\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003\u001a\r\u0000\u00f2\u00f3\u0005"+
		"\u0018\u0000\u0000\u00f3\u00f4\u0003\u0018\f\u0000\u00f4\u00f5\u0005\u0019"+
		"\u0000\u0000\u00f5\u00f6\u0006\u000b\uffff\uffff\u0000\u00f6\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f7\u00e2\u0001\u0000\u0000\u0000\u00f7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00e8\u0001\u0000\u0000\u0000\u00f7\u00ec\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f1\u0001\u0000\u0000\u0000\u00f8\u0017\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0003\u0012\t\u0000\u00fa\u00fb\u0006\f"+
		"\uffff\uffff\u0000\u00fb\u0102\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003"+
		"\u0012\t\u0000\u00fd\u00fe\u0005$\u0000\u0000\u00fe\u00ff\u0003\u0018"+
		"\f\u0000\u00ff\u0100\u0006\f\uffff\uffff\u0000\u0100\u0102\u0001\u0000"+
		"\u0000\u0000\u0101\u00f9\u0001\u0000\u0000\u0000\u0101\u00fc\u0001\u0000"+
		"\u0000\u0000\u0102\u0019\u0001\u0000\u0000\u0000\u0103\u0104\u0005%\u0000"+
		"\u0000\u0104\u0105\u0006\r\uffff\uffff\u0000\u0105\u001b\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0005&\u0000\u0000\u0107\u0108\u0006\u000e\uffff\uffff"+
		"\u0000\u0108\u001d\u0001\u0000\u0000\u0000\r+L`m{\u009a\u00ba\u00ca\u00cc"+
		"\u00dd\u00df\u00f7\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}