// Generated from Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ATOM=12, VAR=13, NEWLINE=14, WS=15;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_term = 2, RULE_element = 3, RULE_elements = 4, 
		RULE_list = 5, RULE_compound = 6, RULE_conjunction = 7, RULE_prolog_rule = 8, 
		RULE_program = 9, RULE_query = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "term", "element", "elements", "list", "compound", "conjunction", 
			"prolog_rule", "program", "query"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'[]'", "'['", "']'", "'|'", "'('", "')'", "'.('", "':-'", 
			"'.'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ATOM", "VAR", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			expr();
			setState(23);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				program();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				query();
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarTermContext extends TermContext {
		public TerminalNode VAR() { return getToken(ExprParser.VAR, 0); }
		public VarTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitVarTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomTermContext extends TermContext {
		public TerminalNode ATOM() { return getToken(ExprParser.ATOM, 0); }
		public AtomTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAtomTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATOM:
				_localctx = new AtomTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(ATOM);
				}
				break;
			case VAR:
				_localctx = new VarTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(VAR);
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

	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListElementContext extends ElementContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitListElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompoundElementContext extends ElementContext {
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public CompoundElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitCompoundElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermElementContext extends ElementContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTermElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new TermElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				term();
				}
				break;
			case 2:
				_localctx = new ListElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				list();
				}
				break;
			case 3:
				_localctx = new CompoundElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				compound();
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

	public static class ElementsContext extends ParserRuleContext {
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
	 
		public ElementsContext() { }
		public void copyFrom(ElementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleElementsContext extends ElementsContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public SingleElementsContext(ElementsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitSingleElements(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiElementsContext extends ElementsContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public MultiElementsContext(ElementsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMultiElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elements);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new SingleElementsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				element();
				}
				break;
			case 2:
				_localctx = new MultiElementsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				element();
				setState(40);
				match(T__0);
				setState(41);
				elements();
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

	public static class ListContext extends ParserRuleContext {
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	 
		public ListContext() { }
		public void copyFrom(ListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyListContext extends ListContext {
		public EmptyListContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitEmptyList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleElementsListContext extends ListContext {
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public SingleElementsListContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitSingleElementsList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiElementsListContext extends ListContext {
		public List<ElementsContext> elements() {
			return getRuleContexts(ElementsContext.class);
		}
		public ElementsContext elements(int i) {
			return getRuleContext(ElementsContext.class,i);
		}
		public MultiElementsListContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMultiElementsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new EmptyListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new SingleElementsListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(T__2);
				setState(47);
				elements();
				setState(48);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new MultiElementsListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(T__2);
				setState(51);
				elements();
				setState(52);
				match(T__4);
				setState(53);
				elements();
				setState(54);
				match(T__3);
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

	public static class CompoundContext extends ParserRuleContext {
		public CompoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound; }
	 
		public CompoundContext() { }
		public void copyFrom(CompoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomCompoundContext extends CompoundContext {
		public TerminalNode ATOM() { return getToken(ExprParser.ATOM, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public AtomCompoundContext(CompoundContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAtomCompound(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotCompoundContext extends CompoundContext {
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public DotCompoundContext(CompoundContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDotCompound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundContext compound() throws RecognitionException {
		CompoundContext _localctx = new CompoundContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compound);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATOM:
				_localctx = new AtomCompoundContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(ATOM);
				setState(59);
				match(T__5);
				setState(60);
				elements();
				setState(61);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new DotCompoundContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(T__7);
				setState(64);
				elements();
				setState(65);
				match(T__6);
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

	public static class ConjunctionContext extends ParserRuleContext {
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
	 
		public ConjunctionContext() { }
		public void copyFrom(ConjunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleCompoundConjunctionContext extends ConjunctionContext {
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public SingleCompoundConjunctionContext(ConjunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitSingleCompoundConjunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiCompoundConjunctionContext extends ConjunctionContext {
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public MultiCompoundConjunctionContext(ConjunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMultiCompoundConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conjunction);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new SingleCompoundConjunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				compound();
				}
				break;
			case 2:
				_localctx = new MultiCompoundConjunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				compound();
				setState(71);
				match(T__0);
				setState(72);
				conjunction();
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

	public static class Prolog_ruleContext extends ParserRuleContext {
		public Prolog_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prolog_rule; }
	 
		public Prolog_ruleContext() { }
		public void copyFrom(Prolog_ruleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompoundPrologRuleContext extends Prolog_ruleContext {
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public CompoundPrologRuleContext(Prolog_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitCompoundPrologRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConjunctionPrologRuleContext extends Prolog_ruleContext {
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public ConjunctionPrologRuleContext(Prolog_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitConjunctionPrologRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prolog_ruleContext prolog_rule() throws RecognitionException {
		Prolog_ruleContext _localctx = new Prolog_ruleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_prolog_rule);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new CompoundPrologRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				compound();
				}
				break;
			case 2:
				_localctx = new ConjunctionPrologRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				compound();
				setState(78);
				match(T__8);
				setState(79);
				conjunction();
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

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrologProgramContext extends ProgramContext {
		public List<Prolog_ruleContext> prolog_rule() {
			return getRuleContexts(Prolog_ruleContext.class);
		}
		public Prolog_ruleContext prolog_rule(int i) {
			return getRuleContext(Prolog_ruleContext.class,i);
		}
		public PrologProgramContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitPrologProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_program);
		int _la;
		try {
			_localctx = new PrologProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				prolog_rule();
				setState(84);
				match(T__9);
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 || _la==ATOM );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	 
		public QueryContext() { }
		public void copyFrom(QueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrologQueryContext extends QueryContext {
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public PrologQueryContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitPrologQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_query);
		try {
			_localctx = new PrologQueryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			conjunction();
			setState(91);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\3\3\3\5\3\36\n\3\3\4\3\4\5\4\"\n\4\3\5\3\5\3\5\5"+
		"\5\'\n\5\3\6\3\6\3\6\3\6\3\6\5\6.\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7;\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bF\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\5\tM\n\t\3\n\3\n\3\n\3\n\3\n\5\nT\n\n\3\13\3\13\3\13"+
		"\6\13Y\n\13\r\13\16\13Z\3\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24"+
		"\26\2\2\2_\2\30\3\2\2\2\4\35\3\2\2\2\6!\3\2\2\2\b&\3\2\2\2\n-\3\2\2\2"+
		"\f:\3\2\2\2\16E\3\2\2\2\20L\3\2\2\2\22S\3\2\2\2\24X\3\2\2\2\26\\\3\2\2"+
		"\2\30\31\5\4\3\2\31\32\7\20\2\2\32\3\3\2\2\2\33\36\5\24\13\2\34\36\5\26"+
		"\f\2\35\33\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\37\"\7\16\2\2 \"\7\17\2"+
		"\2!\37\3\2\2\2! \3\2\2\2\"\7\3\2\2\2#\'\5\6\4\2$\'\5\f\7\2%\'\5\16\b\2"+
		"&#\3\2\2\2&$\3\2\2\2&%\3\2\2\2\'\t\3\2\2\2(.\5\b\5\2)*\5\b\5\2*+\7\3\2"+
		"\2+,\5\n\6\2,.\3\2\2\2-(\3\2\2\2-)\3\2\2\2.\13\3\2\2\2/;\7\4\2\2\60\61"+
		"\7\5\2\2\61\62\5\n\6\2\62\63\7\6\2\2\63;\3\2\2\2\64\65\7\5\2\2\65\66\5"+
		"\n\6\2\66\67\7\7\2\2\678\5\n\6\289\7\6\2\29;\3\2\2\2:/\3\2\2\2:\60\3\2"+
		"\2\2:\64\3\2\2\2;\r\3\2\2\2<=\7\16\2\2=>\7\b\2\2>?\5\n\6\2?@\7\t\2\2@"+
		"F\3\2\2\2AB\7\n\2\2BC\5\n\6\2CD\7\t\2\2DF\3\2\2\2E<\3\2\2\2EA\3\2\2\2"+
		"F\17\3\2\2\2GM\5\16\b\2HI\5\16\b\2IJ\7\3\2\2JK\5\20\t\2KM\3\2\2\2LG\3"+
		"\2\2\2LH\3\2\2\2M\21\3\2\2\2NT\5\16\b\2OP\5\16\b\2PQ\7\13\2\2QR\5\20\t"+
		"\2RT\3\2\2\2SN\3\2\2\2SO\3\2\2\2T\23\3\2\2\2UV\5\22\n\2VW\7\f\2\2WY\3"+
		"\2\2\2XU\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\25\3\2\2\2\\]\5\20\t\2"+
		"]^\7\r\2\2^\27\3\2\2\2\13\35!&-:ELSZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}