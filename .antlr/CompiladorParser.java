// Generated from c:/Users/rodri/OneDrive/Documentos/Compiladores/Gramaticap/Compilador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CompiladorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		BEGIN=18, END=19, INT=20, FLOAT=21, STRING=22, INPUT=23, OUTPUT=24, IF=25, 
		THEN=26, ELSE=27, ENDIF=28, WHILE=29, DO=30, ENDWHILE=31, FOR=32, TO=33, 
		ENDFOR=34, AND=35, OR=36, NOT=37, ID=38, NUM=39, WS=40;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_comandos = 2, RULE_declaracao = 3, 
		RULE_comando = 4, RULE_atribuicao = 5, RULE_entrada = 6, RULE_saida = 7, 
		RULE_condicional = 8, RULE_repeticao = 9, RULE_expressao_aritmetica = 10, 
		RULE_expressao_multiplicativa = 11, RULE_expressao_unaria = 12, RULE_expressao_logica = 13, 
		RULE_operador_relacional = 14, RULE_operador_logico = 15, RULE_func = 16, 
		RULE_parametros = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "comandos", "declaracao", "comando", "atribuicao", 
			"entrada", "saida", "condicional", "repeticao", "expressao_aritmetica", 
			"expressao_multiplicativa", "expressao_unaria", "expressao_logica", "operador_relacional", 
			"operador_logico", "func", "parametros"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", "'='", "'('", "')'", "'+'", "'-'", "'*'", "'/'", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'{'", "'}'", "'begin'", 
			"'end'", "'int'", "'float'", "'string'", "'input'", "'output'", "'if'", 
			"'then'", "'else'", "'endif'", "'while'", "'do'", "'endwhile'", "'for'", 
			"'to'", "'endfor'", "'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "BEGIN", "END", "INT", "FLOAT", "STRING", 
			"INPUT", "OUTPUT", "IF", "THEN", "ELSE", "ENDIF", "WHILE", "DO", "ENDWHILE", 
			"FOR", "TO", "ENDFOR", "AND", "OR", "NOT", "ID", "NUM", "WS"
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
	public String getGrammarFileName() { return "Compilador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CompiladorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CompiladorParser.BEGIN, 0); }
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode END() { return getToken(CompiladorParser.END, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(BEGIN);
			setState(37);
			declaracoes();
			setState(38);
			comandos();
			setState(39);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				declaracao();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				comando();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 279768465408L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CompiladorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CompiladorParser.ID, i);
		}
		public TerminalNode INT() { return getToken(CompiladorParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CompiladorParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(CompiladorParser.STRING, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(52);
			match(ID);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(53);
				match(T__0);
				setState(54);
				match(ID);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public SaidaContext saida() {
			return getRuleContext(SaidaContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				atribuicao();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				entrada();
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				saida();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				condicional();
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				repeticao();
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompiladorParser.ID, 0); }
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ID);
			setState(70);
			match(T__2);
			setState(71);
			expressao_aritmetica(0);
			setState(72);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EntradaContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(CompiladorParser.INPUT, 0); }
		public TerminalNode ID() { return getToken(CompiladorParser.ID, 0); }
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(INPUT);
			setState(75);
			match(T__3);
			setState(76);
			match(ID);
			setState(77);
			match(T__4);
			setState(78);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SaidaContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(CompiladorParser.OUTPUT, 0); }
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public SaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida; }
	}

	public final SaidaContext saida() throws RecognitionException {
		SaidaContext _localctx = new SaidaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_saida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(OUTPUT);
			setState(81);
			match(T__3);
			setState(82);
			expressao_aritmetica(0);
			setState(83);
			match(T__4);
			setState(84);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CompiladorParser.IF, 0); }
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public TerminalNode THEN() { return getToken(CompiladorParser.THEN, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(CompiladorParser.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(CompiladorParser.ELSE, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(IF);
			setState(87);
			expressao_logica(0);
			setState(88);
			match(THEN);
			setState(89);
			comandos();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(90);
				match(ELSE);
				setState(91);
				comandos();
				}
			}

			setState(94);
			match(ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CompiladorParser.WHILE, 0); }
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public TerminalNode DO() { return getToken(CompiladorParser.DO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(CompiladorParser.ENDWHILE, 0); }
		public TerminalNode FOR() { return getToken(CompiladorParser.FOR, 0); }
		public TerminalNode ID() { return getToken(CompiladorParser.ID, 0); }
		public List<Expressao_aritmeticaContext> expressao_aritmetica() {
			return getRuleContexts(Expressao_aritmeticaContext.class);
		}
		public Expressao_aritmeticaContext expressao_aritmetica(int i) {
			return getRuleContext(Expressao_aritmeticaContext.class,i);
		}
		public TerminalNode TO() { return getToken(CompiladorParser.TO, 0); }
		public TerminalNode ENDFOR() { return getToken(CompiladorParser.ENDFOR, 0); }
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_repeticao);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(WHILE);
				setState(97);
				expressao_logica(0);
				setState(98);
				match(DO);
				setState(99);
				comandos();
				setState(100);
				match(ENDWHILE);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(FOR);
				setState(103);
				match(ID);
				setState(104);
				match(T__2);
				setState(105);
				expressao_aritmetica(0);
				setState(106);
				match(TO);
				setState(107);
				expressao_aritmetica(0);
				setState(108);
				match(DO);
				setState(109);
				comandos();
				setState(110);
				match(ENDFOR);
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
	public static class Expressao_aritmeticaContext extends ParserRuleContext {
		public Expressao_multiplicativaContext expressao_multiplicativa() {
			return getRuleContext(Expressao_multiplicativaContext.class,0);
		}
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public Expressao_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aritmetica; }
	}

	public final Expressao_aritmeticaContext expressao_aritmetica() throws RecognitionException {
		return expressao_aritmetica(0);
	}

	private Expressao_aritmeticaContext expressao_aritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expressao_aritmeticaContext _localctx = new Expressao_aritmeticaContext(_ctx, _parentState);
		Expressao_aritmeticaContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expressao_aritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115);
			expressao_multiplicativa(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Expressao_aritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao_aritmetica);
						setState(117);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(118);
						match(T__5);
						setState(119);
						expressao_multiplicativa(0);
						}
						break;
					case 2:
						{
						_localctx = new Expressao_aritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao_aritmetica);
						setState(120);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(121);
						match(T__6);
						setState(122);
						expressao_multiplicativa(0);
						}
						break;
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class Expressao_multiplicativaContext extends ParserRuleContext {
		public Expressao_unariaContext expressao_unaria() {
			return getRuleContext(Expressao_unariaContext.class,0);
		}
		public Expressao_multiplicativaContext expressao_multiplicativa() {
			return getRuleContext(Expressao_multiplicativaContext.class,0);
		}
		public Expressao_multiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_multiplicativa; }
	}

	public final Expressao_multiplicativaContext expressao_multiplicativa() throws RecognitionException {
		return expressao_multiplicativa(0);
	}

	private Expressao_multiplicativaContext expressao_multiplicativa(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expressao_multiplicativaContext _localctx = new Expressao_multiplicativaContext(_ctx, _parentState);
		Expressao_multiplicativaContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expressao_multiplicativa, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(129);
			expressao_unaria();
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new Expressao_multiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao_multiplicativa);
						setState(131);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(132);
						match(T__7);
						setState(133);
						expressao_unaria();
						}
						break;
					case 2:
						{
						_localctx = new Expressao_multiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao_multiplicativa);
						setState(134);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(135);
						match(T__8);
						setState(136);
						expressao_unaria();
						}
						break;
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class Expressao_unariaContext extends ParserRuleContext {
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public TerminalNode NUM() { return getToken(CompiladorParser.NUM, 0); }
		public TerminalNode ID() { return getToken(CompiladorParser.ID, 0); }
		public Expressao_unariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_unaria; }
	}

	public final Expressao_unariaContext expressao_unaria() throws RecognitionException {
		Expressao_unariaContext _localctx = new Expressao_unariaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressao_unaria);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__3);
				setState(143);
				expressao_aritmetica(0);
				setState(144);
				match(T__4);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(ID);
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
	public static class Expressao_logicaContext extends ParserRuleContext {
		public List<Expressao_aritmeticaContext> expressao_aritmetica() {
			return getRuleContexts(Expressao_aritmeticaContext.class);
		}
		public Expressao_aritmeticaContext expressao_aritmetica(int i) {
			return getRuleContext(Expressao_aritmeticaContext.class,i);
		}
		public Operador_relacionalContext operador_relacional() {
			return getRuleContext(Operador_relacionalContext.class,0);
		}
		public List<Expressao_logicaContext> expressao_logica() {
			return getRuleContexts(Expressao_logicaContext.class);
		}
		public Expressao_logicaContext expressao_logica(int i) {
			return getRuleContext(Expressao_logicaContext.class,i);
		}
		public Operador_logicoContext operador_logico() {
			return getRuleContext(Operador_logicoContext.class,0);
		}
		public Expressao_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_logica; }
	}

	public final Expressao_logicaContext expressao_logica() throws RecognitionException {
		return expressao_logica(0);
	}

	private Expressao_logicaContext expressao_logica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expressao_logicaContext _localctx = new Expressao_logicaContext(_ctx, _parentState);
		Expressao_logicaContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expressao_logica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(151);
				expressao_aritmetica(0);
				setState(152);
				operador_relacional();
				setState(153);
				expressao_aritmetica(0);
				}
				break;
			case 2:
				{
				setState(155);
				match(T__3);
				setState(156);
				expressao_logica(0);
				setState(157);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expressao_logicaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressao_logica);
					setState(161);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(162);
					operador_logico();
					setState(163);
					expressao_logica(2);
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class Operador_relacionalContext extends ParserRuleContext {
		public Operador_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_relacional; }
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64512L) != 0)) ) {
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
	public static class Operador_logicoContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(CompiladorParser.AND, 0); }
		public TerminalNode OR() { return getToken(CompiladorParser.OR, 0); }
		public TerminalNode NOT() { return getToken(CompiladorParser.NOT, 0); }
		public Operador_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_logico; }
	}

	public final Operador_logicoContext operador_logico() throws RecognitionException {
		Operador_logicoContext _localctx = new Operador_logicoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operador_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
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
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompiladorParser.ID, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(ID);
			setState(175);
			match(T__3);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(176);
				parametros();
				}
			}

			setState(179);
			match(T__4);
			setState(180);
			match(T__15);
			setState(181);
			comandos();
			setState(182);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CompiladorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CompiladorParser.ID, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ID);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(185);
				match(T__0);
				setState(186);
				match(ID);
				}
				}
				setState(191);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expressao_aritmetica_sempred((Expressao_aritmeticaContext)_localctx, predIndex);
		case 11:
			return expressao_multiplicativa_sempred((Expressao_multiplicativaContext)_localctx, predIndex);
		case 13:
			return expressao_logica_sempred((Expressao_logicaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_aritmetica_sempred(Expressao_aritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressao_multiplicativa_sempred(Expressao_multiplicativaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressao_logica_sempred(Expressao_logicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u00c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001+\b\u0001"+
		"\u000b\u0001\f\u0001,\u0001\u0002\u0004\u00020\b\u0002\u000b\u0002\f\u0002"+
		"1\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00038\b\u0003"+
		"\n\u0003\f\u0003;\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004D\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b]\b\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tq\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n|\b"+
		"\n\n\n\f\n\u007f\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u008a"+
		"\b\u000b\n\u000b\f\u000b\u008d\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u0095\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a0\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00a6\b\r\n\r\f\r\u00a9\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00b2\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00bc\b\u0011\n\u0011"+
		"\f\u0011\u00bf\t\u0011\u0001\u0011\u0000\u0003\u0014\u0016\u001a\u0012"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"\u0000\u0003\u0001\u0000\u0014\u0016\u0001\u0000\n\u000f"+
		"\u0001\u0000#%\u00c1\u0000$\u0001\u0000\u0000\u0000\u0002*\u0001\u0000"+
		"\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000"+
		"\bC\u0001\u0000\u0000\u0000\nE\u0001\u0000\u0000\u0000\fJ\u0001\u0000"+
		"\u0000\u0000\u000eP\u0001\u0000\u0000\u0000\u0010V\u0001\u0000\u0000\u0000"+
		"\u0012p\u0001\u0000\u0000\u0000\u0014r\u0001\u0000\u0000\u0000\u0016\u0080"+
		"\u0001\u0000\u0000\u0000\u0018\u0094\u0001\u0000\u0000\u0000\u001a\u009f"+
		"\u0001\u0000\u0000\u0000\u001c\u00aa\u0001\u0000\u0000\u0000\u001e\u00ac"+
		"\u0001\u0000\u0000\u0000 \u00ae\u0001\u0000\u0000\u0000\"\u00b8\u0001"+
		"\u0000\u0000\u0000$%\u0005\u0012\u0000\u0000%&\u0003\u0002\u0001\u0000"+
		"&\'\u0003\u0004\u0002\u0000\'(\u0005\u0013\u0000\u0000(\u0001\u0001\u0000"+
		"\u0000\u0000)+\u0003\u0006\u0003\u0000*)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-\u0003\u0001\u0000\u0000\u0000.0\u0003\b\u0004\u0000/.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u00002\u0005\u0001\u0000\u0000\u000034\u0007\u0000\u0000\u0000"+
		"49\u0005&\u0000\u000056\u0005\u0001\u0000\u000068\u0005&\u0000\u00007"+
		"5\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000<=\u0005\u0002\u0000\u0000=\u0007\u0001\u0000\u0000\u0000"+
		">D\u0003\n\u0005\u0000?D\u0003\f\u0006\u0000@D\u0003\u000e\u0007\u0000"+
		"AD\u0003\u0010\b\u0000BD\u0003\u0012\t\u0000C>\u0001\u0000\u0000\u0000"+
		"C?\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000CB\u0001\u0000\u0000\u0000D\t\u0001\u0000\u0000\u0000EF\u0005&\u0000"+
		"\u0000FG\u0005\u0003\u0000\u0000GH\u0003\u0014\n\u0000HI\u0005\u0002\u0000"+
		"\u0000I\u000b\u0001\u0000\u0000\u0000JK\u0005\u0017\u0000\u0000KL\u0005"+
		"\u0004\u0000\u0000LM\u0005&\u0000\u0000MN\u0005\u0005\u0000\u0000NO\u0005"+
		"\u0002\u0000\u0000O\r\u0001\u0000\u0000\u0000PQ\u0005\u0018\u0000\u0000"+
		"QR\u0005\u0004\u0000\u0000RS\u0003\u0014\n\u0000ST\u0005\u0005\u0000\u0000"+
		"TU\u0005\u0002\u0000\u0000U\u000f\u0001\u0000\u0000\u0000VW\u0005\u0019"+
		"\u0000\u0000WX\u0003\u001a\r\u0000XY\u0005\u001a\u0000\u0000Y\\\u0003"+
		"\u0004\u0002\u0000Z[\u0005\u001b\u0000\u0000[]\u0003\u0004\u0002\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^_\u0005\u001c\u0000\u0000_\u0011\u0001\u0000\u0000\u0000`a\u0005"+
		"\u001d\u0000\u0000ab\u0003\u001a\r\u0000bc\u0005\u001e\u0000\u0000cd\u0003"+
		"\u0004\u0002\u0000de\u0005\u001f\u0000\u0000eq\u0001\u0000\u0000\u0000"+
		"fg\u0005 \u0000\u0000gh\u0005&\u0000\u0000hi\u0005\u0003\u0000\u0000i"+
		"j\u0003\u0014\n\u0000jk\u0005!\u0000\u0000kl\u0003\u0014\n\u0000lm\u0005"+
		"\u001e\u0000\u0000mn\u0003\u0004\u0002\u0000no\u0005\"\u0000\u0000oq\u0001"+
		"\u0000\u0000\u0000p`\u0001\u0000\u0000\u0000pf\u0001\u0000\u0000\u0000"+
		"q\u0013\u0001\u0000\u0000\u0000rs\u0006\n\uffff\uffff\u0000st\u0003\u0016"+
		"\u000b\u0000t}\u0001\u0000\u0000\u0000uv\n\u0002\u0000\u0000vw\u0005\u0006"+
		"\u0000\u0000w|\u0003\u0016\u000b\u0000xy\n\u0001\u0000\u0000yz\u0005\u0007"+
		"\u0000\u0000z|\u0003\u0016\u000b\u0000{u\u0001\u0000\u0000\u0000{x\u0001"+
		"\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u0015\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u0080\u0081\u0006\u000b\uffff\uffff\u0000\u0081"+
		"\u0082\u0003\u0018\f\u0000\u0082\u008b\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\n\u0002\u0000\u0000\u0084\u0085\u0005\b\u0000\u0000\u0085\u008a\u0003"+
		"\u0018\f\u0000\u0086\u0087\n\u0001\u0000\u0000\u0087\u0088\u0005\t\u0000"+
		"\u0000\u0088\u008a\u0003\u0018\f\u0000\u0089\u0083\u0001\u0000\u0000\u0000"+
		"\u0089\u0086\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008c\u0017\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005\u0004\u0000\u0000\u008f\u0090\u0003\u0014\n\u0000\u0090"+
		"\u0091\u0005\u0005\u0000\u0000\u0091\u0095\u0001\u0000\u0000\u0000\u0092"+
		"\u0095\u0005\'\u0000\u0000\u0093\u0095\u0005&\u0000\u0000\u0094\u008e"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0019\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0006\r\uffff\uffff\u0000\u0097\u0098\u0003\u0014\n\u0000\u0098\u0099"+
		"\u0003\u001c\u000e\u0000\u0099\u009a\u0003\u0014\n\u0000\u009a\u00a0\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005\u0004\u0000\u0000\u009c\u009d\u0003"+
		"\u001a\r\u0000\u009d\u009e\u0005\u0005\u0000\u0000\u009e\u00a0\u0001\u0000"+
		"\u0000\u0000\u009f\u0096\u0001\u0000\u0000\u0000\u009f\u009b\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a7\u0001\u0000\u0000\u0000\u00a1\u00a2\n\u0001\u0000"+
		"\u0000\u00a2\u00a3\u0003\u001e\u000f\u0000\u00a3\u00a4\u0003\u001a\r\u0002"+
		"\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u001b\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0007\u0001\u0000\u0000"+
		"\u00ab\u001d\u0001\u0000\u0000\u0000\u00ac\u00ad\u0007\u0002\u0000\u0000"+
		"\u00ad\u001f\u0001\u0000\u0000\u0000\u00ae\u00af\u0005&\u0000\u0000\u00af"+
		"\u00b1\u0005\u0004\u0000\u0000\u00b0\u00b2\u0003\"\u0011\u0000\u00b1\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0005\u0000\u0000\u00b4\u00b5"+
		"\u0005\u0010\u0000\u0000\u00b5\u00b6\u0003\u0004\u0002\u0000\u00b6\u00b7"+
		"\u0005\u0011\u0000\u0000\u00b7!\u0001\u0000\u0000\u0000\u00b8\u00bd\u0005"+
		"&\u0000\u0000\u00b9\u00ba\u0005\u0001\u0000\u0000\u00ba\u00bc\u0005&\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be#\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u000f,19C\\p{}\u0089\u008b\u0094\u009f\u00a7\u00b1\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}