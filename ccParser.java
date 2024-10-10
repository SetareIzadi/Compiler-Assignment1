// Generated from cc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ccParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, IDENT=16, NUMBER=17, 
		WHITESPACE=18, COMMENT=19, BLOCKCOMMENT=20;
	public static final int
		RULE_start = 0, RULE_circuit = 1, RULE_hardware = 2, RULE_latches = 3, 
		RULE_inputs = 4, RULE_outputs = 5, RULE_updates = 6, RULE_definition = 7, 
		RULE_siminputs = 8, RULE_signal = 9, RULE_function = 10, RULE_out = 11, 
		RULE_exp = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "circuit", "hardware", "latches", "inputs", "outputs", "updates", 
			"definition", "siminputs", "signal", "function", "out", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'hardware'", "':'", "'latches'", "'inputs'", "'outputs'", "'updates'", 
			"'='", "'definition'", "'siminputs'", "'('", "','", "')'", "'/'", "'+'", 
			"'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "IDENT", "NUMBER", "WHITESPACE", "COMMENT", "BLOCKCOMMENT"
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
	public String getGrammarFileName() { return "cc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ccParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ccParser.EOF, 0); }
		public List<CircuitContext> circuit() {
			return getRuleContexts(CircuitContext.class);
		}
		public CircuitContext circuit(int i) {
			return getRuleContext(CircuitContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(26);
				circuit();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CircuitContext extends ParserRuleContext {
		public HardwareContext hardware() {
			return getRuleContext(HardwareContext.class,0);
		}
		public OutputsContext outputs() {
			return getRuleContext(OutputsContext.class,0);
		}
		public InputsContext inputs() {
			return getRuleContext(InputsContext.class,0);
		}
		public UpdatesContext updates() {
			return getRuleContext(UpdatesContext.class,0);
		}
		public SiminputsContext siminputs() {
			return getRuleContext(SiminputsContext.class,0);
		}
		public LatchesContext latches() {
			return getRuleContext(LatchesContext.class,0);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public CircuitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circuit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterCircuit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitCircuit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitCircuit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CircuitContext circuit() throws RecognitionException {
		CircuitContext _localctx = new CircuitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_circuit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			hardware();
			setState(35);
			outputs();
			setState(36);
			inputs();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(37);
				latches();
				}
			}

			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(40);
				definition();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			updates();
			setState(47);
			siminputs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HardwareContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(ccParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(ccParser.IDENT, i);
		}
		public HardwareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hardware; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterHardware(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitHardware(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitHardware(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HardwareContext hardware() throws RecognitionException {
		HardwareContext _localctx = new HardwareContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_hardware);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__0);
			setState(50);
			match(T__1);
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				match(IDENT);
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LatchesContext extends ParserRuleContext {
		public List<SignalContext> signal() {
			return getRuleContexts(SignalContext.class);
		}
		public SignalContext signal(int i) {
			return getRuleContext(SignalContext.class,i);
		}
		public LatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterLatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitLatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitLatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchesContext latches() throws RecognitionException {
		LatchesContext _localctx = new LatchesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_latches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__2);
			setState(57);
			match(T__1);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(58);
				signal();
				}
				}
				setState(63);
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
	public static class InputsContext extends ParserRuleContext {
		public List<SignalContext> signal() {
			return getRuleContexts(SignalContext.class);
		}
		public SignalContext signal(int i) {
			return getRuleContext(SignalContext.class,i);
		}
		public InputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitInputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputsContext inputs() throws RecognitionException {
		InputsContext _localctx = new InputsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__3);
			setState(65);
			match(T__1);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				signal();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputsContext extends ParserRuleContext {
		public List<SignalContext> signal() {
			return getRuleContexts(SignalContext.class);
		}
		public SignalContext signal(int i) {
			return getRuleContext(SignalContext.class,i);
		}
		public OutputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterOutputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitOutputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitOutputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputsContext outputs() throws RecognitionException {
		OutputsContext _localctx = new OutputsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_outputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__4);
			setState(72);
			match(T__1);
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				signal();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpdatesContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(ccParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(ccParser.IDENT, i);
		}
		public List<OutContext> out() {
			return getRuleContexts(OutContext.class);
		}
		public OutContext out(int i) {
			return getRuleContext(OutContext.class,i);
		}
		public UpdatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterUpdates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitUpdates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitUpdates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdatesContext updates() throws RecognitionException {
		UpdatesContext _localctx = new UpdatesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_updates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__5);
			setState(79);
			match(T__1);
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				match(IDENT);
				setState(81);
				match(T__6);
				setState(82);
				out();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__7);
			setState(88);
			match(T__1);
			setState(89);
			function();
			setState(90);
			match(T__6);
			setState(91);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SiminputsContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(ccParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(ccParser.IDENT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ccParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ccParser.NUMBER, i);
		}
		public SiminputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siminputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterSiminputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitSiminputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitSiminputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiminputsContext siminputs() throws RecognitionException {
		SiminputsContext _localctx = new SiminputsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_siminputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__8);
			setState(94);
			match(T__1);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95);
				match(IDENT);
				setState(96);
				match(T__6);
				setState(97);
				match(NUMBER);
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignalContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(ccParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(ccParser.IDENT, i);
		}
		public SignalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterSignal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitSignal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitSignal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignalContext signal() throws RecognitionException {
		SignalContext _localctx = new SignalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_signal);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(102);
					match(IDENT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(105); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(ccParser.IDENT, 0); }
		public List<SignalContext> signal() {
			return getRuleContexts(SignalContext.class);
		}
		public SignalContext signal(int i) {
			return getRuleContext(SignalContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(IDENT);
				setState(108);
				match(T__9);
				setState(109);
				signal();
				setState(110);
				match(T__10);
				setState(111);
				signal();
				setState(112);
				match(T__10);
				setState(113);
				signal();
				setState(114);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(IDENT);
				setState(117);
				match(T__9);
				setState(118);
				signal();
				setState(119);
				match(T__10);
				setState(120);
				signal();
				setState(121);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(IDENT);
				setState(124);
				match(T__9);
				setState(125);
				signal();
				setState(126);
				match(T__11);
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
	public static class OutContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_out);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				exp(0);
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
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NOTContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(ccParser.IDENT, 0); }
		public NOTContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterNOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitNOT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitNOT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ORContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ORContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitOR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ExpContext {
		public List<TerminalNode> IDENT() { return getTokens(ccParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(ccParser.IDENT, i);
		}
		public ConstantContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ANDContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ANDContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitAND(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesesContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParenthesesContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new NOTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(135);
					match(IDENT);
					}
				}

				setState(138);
				match(T__12);
				setState(139);
				exp(5);
				}
				break;
			case 2:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(T__9);
				setState(141);
				exp(0);
				setState(142);
				match(T__11);
				}
				break;
			case 3:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(144);
						match(IDENT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(147); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ORContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(151);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(152);
						match(T__13);
						setState(153);
						exp(5);
						}
						break;
					case 2:
						{
						_localctx = new ANDContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(154);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(155);
						match(T__14);
						setState(156);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(161);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014\u00a3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000"+
		"\u001f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\'\b\u0001\u0001\u0001\u0005\u0001*\b\u0001\n"+
		"\u0001\f\u0001-\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u00025\b\u0002\u000b\u0002\f\u00026\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003<\b\u0003\n\u0003\f\u0003?\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004D\b\u0004\u000b"+
		"\u0004\f\u0004E\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005K\b\u0005"+
		"\u000b\u0005\f\u0005L\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0004\u0006T\b\u0006\u000b\u0006\f\u0006U\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0004\bc\b\b\u000b\b\f\bd\u0001\t\u0004\th\b"+
		"\t\u000b\t\f\ti\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0081\b\n\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0085\b\u000b\u0001\f\u0001\f\u0003\f\u0089\b"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0092"+
		"\b\f\u000b\f\f\f\u0093\u0003\f\u0096\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u009e\b\f\n\f\f\f\u00a1\t\f\u0001\f\u0000\u0001"+
		"\u0018\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u0000\u0000\u00a8\u0000\u001d\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000"+
		"\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000"+
		"\b@\u0001\u0000\u0000\u0000\nG\u0001\u0000\u0000\u0000\fN\u0001\u0000"+
		"\u0000\u0000\u000eW\u0001\u0000\u0000\u0000\u0010]\u0001\u0000\u0000\u0000"+
		"\u0012g\u0001\u0000\u0000\u0000\u0014\u0080\u0001\u0000\u0000\u0000\u0016"+
		"\u0084\u0001\u0000\u0000\u0000\u0018\u0095\u0001\u0000\u0000\u0000\u001a"+
		"\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c"+
		"\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000 !\u0005\u0000\u0000\u0001!\u0001\u0001\u0000"+
		"\u0000\u0000\"#\u0003\u0004\u0002\u0000#$\u0003\n\u0005\u0000$&\u0003"+
		"\b\u0004\u0000%\'\u0003\u0006\u0003\u0000&%\u0001\u0000\u0000\u0000&\'"+
		"\u0001\u0000\u0000\u0000\'+\u0001\u0000\u0000\u0000(*\u0003\u000e\u0007"+
		"\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000./\u0003\f\u0006\u0000/0\u0003\u0010\b\u00000\u0003"+
		"\u0001\u0000\u0000\u000012\u0005\u0001\u0000\u000024\u0005\u0002\u0000"+
		"\u000035\u0005\u0010\u0000\u000043\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0005"+
		"\u0001\u0000\u0000\u000089\u0005\u0003\u0000\u00009=\u0005\u0002\u0000"+
		"\u0000:<\u0003\u0012\t\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0007\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u0004\u0000\u0000"+
		"AC\u0005\u0002\u0000\u0000BD\u0003\u0012\t\u0000CB\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000F\t\u0001\u0000\u0000\u0000GH\u0005\u0005\u0000\u0000HJ\u0005\u0002"+
		"\u0000\u0000IK\u0003\u0012\t\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u000b"+
		"\u0001\u0000\u0000\u0000NO\u0005\u0006\u0000\u0000OS\u0005\u0002\u0000"+
		"\u0000PQ\u0005\u0010\u0000\u0000QR\u0005\u0007\u0000\u0000RT\u0003\u0016"+
		"\u000b\u0000SP\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\r\u0001\u0000\u0000\u0000"+
		"WX\u0005\b\u0000\u0000XY\u0005\u0002\u0000\u0000YZ\u0003\u0014\n\u0000"+
		"Z[\u0005\u0007\u0000\u0000[\\\u0003\u0018\f\u0000\\\u000f\u0001\u0000"+
		"\u0000\u0000]^\u0005\t\u0000\u0000^b\u0005\u0002\u0000\u0000_`\u0005\u0010"+
		"\u0000\u0000`a\u0005\u0007\u0000\u0000ac\u0005\u0011\u0000\u0000b_\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000e\u0011\u0001\u0000\u0000\u0000fh\u0005\u0010"+
		"\u0000\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0013\u0001\u0000\u0000"+
		"\u0000kl\u0005\u0010\u0000\u0000lm\u0005\n\u0000\u0000mn\u0003\u0012\t"+
		"\u0000no\u0005\u000b\u0000\u0000op\u0003\u0012\t\u0000pq\u0005\u000b\u0000"+
		"\u0000qr\u0003\u0012\t\u0000rs\u0005\f\u0000\u0000s\u0081\u0001\u0000"+
		"\u0000\u0000tu\u0005\u0010\u0000\u0000uv\u0005\n\u0000\u0000vw\u0003\u0012"+
		"\t\u0000wx\u0005\u000b\u0000\u0000xy\u0003\u0012\t\u0000yz\u0005\f\u0000"+
		"\u0000z\u0081\u0001\u0000\u0000\u0000{|\u0005\u0010\u0000\u0000|}\u0005"+
		"\n\u0000\u0000}~\u0003\u0012\t\u0000~\u007f\u0005\f\u0000\u0000\u007f"+
		"\u0081\u0001\u0000\u0000\u0000\u0080k\u0001\u0000\u0000\u0000\u0080t\u0001"+
		"\u0000\u0000\u0000\u0080{\u0001\u0000\u0000\u0000\u0081\u0015\u0001\u0000"+
		"\u0000\u0000\u0082\u0085\u0003\u0014\n\u0000\u0083\u0085\u0003\u0018\f"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0017\u0001\u0000\u0000\u0000\u0086\u0088\u0006\f\uffff\uffff"+
		"\u0000\u0087\u0089\u0005\u0010\u0000\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005\r\u0000\u0000\u008b\u0096\u0003\u0018\f\u0005"+
		"\u008c\u008d\u0005\n\u0000\u0000\u008d\u008e\u0003\u0018\f\u0000\u008e"+
		"\u008f\u0005\f\u0000\u0000\u008f\u0096\u0001\u0000\u0000\u0000\u0090\u0092"+
		"\u0005\u0010\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0086"+
		"\u0001\u0000\u0000\u0000\u0095\u008c\u0001\u0000\u0000\u0000\u0095\u0091"+
		"\u0001\u0000\u0000\u0000\u0096\u009f\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\n\u0004\u0000\u0000\u0098\u0099\u0005\u000e\u0000\u0000\u0099\u009e\u0003"+
		"\u0018\f\u0005\u009a\u009b\n\u0003\u0000\u0000\u009b\u009c\u0005\u000f"+
		"\u0000\u0000\u009c\u009e\u0003\u0018\f\u0004\u009d\u0097\u0001\u0000\u0000"+
		"\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u0019\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u0011\u001d&+6=ELUdi\u0080\u0084\u0088\u0093\u0095\u009d\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}