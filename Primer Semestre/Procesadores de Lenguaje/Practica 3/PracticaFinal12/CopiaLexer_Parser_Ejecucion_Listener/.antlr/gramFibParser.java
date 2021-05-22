// Generated from d:\Universidad\Procesadores del Lenguaje\ANTLR\practica2_2\CopiaLexer_Parser_Ejecucion_Listener\gramFibParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramFibParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		B_WHILE=1, FUNCION=2, INCLUD=3, DEVOLVER=4, BEGIN=5, END=6, CADENA=7, 
		TYPE=8, OPERACION=9, INT=10, FLOTANTE=11, VARIABLE=12, PI=13, PD=14, ASIG=15, 
		PUNTOS=16, COMA=17, END_LINEDECL=18, COMENTARIO_BLOQUE=19, COMENTARIO_BLOQUE2=20, 
		COMENTARIO_LINEA=21, COMENTARIO_LINEA2=22, COMENTARIO_LINEA3=23, WS=24, 
		NEWLINE=25;
	public static final int
		RULE_prog = 0, RULE_includ = 1, RULE_functions = 2, RULE_beg_end = 3, 
		RULE_b_while = 4, RULE_declaracion = 5, RULE_return_fun = 6, RULE_llamar_funcion = 7, 
		RULE_expr = 8, RULE_p_reservadas = 9, RULE_p_reservadaWhile = 10, RULE_p_reservadafuncion = 11, 
		RULE_begin = 12, RULE_end = 13, RULE_cadenachar = 14, RULE_integer = 15, 
		RULE_type = 16, RULE_n_libreria = 17, RULE_variable = 18, RULE_n_funcion = 19, 
		RULE_operaciones = 20, RULE_asignacion = 21, RULE_coma = 22, RULE_d_puntos = 23, 
		RULE_end_line = 24, RULE_parentesis = 25, RULE_ws = 26, RULE_newline = 27, 
		RULE_puntos = 28, RULE_coments = 29;
	public static final String[] ruleNames = {
		"prog", "includ", "functions", "beg_end", "b_while", "declaracion", "return_fun", 
		"llamar_funcion", "expr", "p_reservadas", "p_reservadaWhile", "p_reservadafuncion", 
		"begin", "end", "cadenachar", "integer", "type", "n_libreria", "variable", 
		"n_funcion", "operaciones", "asignacion", "coma", "d_puntos", "end_line", 
		"parentesis", "ws", "newline", "puntos", "coments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'while'", "'function'", "'include'", "'devolver'", "'begin'", "'end'", 
		null, null, null, null, null, null, "'('", "')'", "':='", "':'", "','", 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "B_WHILE", "FUNCION", "INCLUD", "DEVOLVER", "BEGIN", "END", "CADENA", 
		"TYPE", "OPERACION", "INT", "FLOTANTE", "VARIABLE", "PI", "PD", "ASIG", 
		"PUNTOS", "COMA", "END_LINEDECL", "COMENTARIO_BLOQUE", "COMENTARIO_BLOQUE2", 
		"COMENTARIO_LINEA", "COMENTARIO_LINEA2", "COMENTARIO_LINEA3", "WS", "NEWLINE"
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
	public String getGrammarFileName() { return "gramFibParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramFibParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(gramFibParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gramFibParser.NEWLINE, i);
		}
		public List<IncludContext> includ() {
			return getRuleContexts(IncludContext.class);
		}
		public IncludContext includ(int i) {
			return getRuleContext(IncludContext.class,i);
		}
		public List<FunctionsContext> functions() {
			return getRuleContexts(FunctionsContext.class);
		}
		public FunctionsContext functions(int i) {
			return getRuleContext(FunctionsContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCION) | (1L << INCLUD) | (1L << DEVOLVER) | (1L << VARIABLE) | (1L << NEWLINE))) != 0)) {
				{
				setState(65);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCION:
				case INCLUD:
				case DEVOLVER:
				case VARIABLE:
					{
					setState(62);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INCLUD:
					case DEVOLVER:
						{
						setState(60);
						includ();
						}
						break;
					case FUNCION:
					case VARIABLE:
						{
						setState(61);
						functions();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case NEWLINE:
					{
					setState(64);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(69);
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

	public static class IncludContext extends ParserRuleContext {
		public P_reservadasContext p_reservadas() {
			return getRuleContext(P_reservadasContext.class,0);
		}
		public End_lineContext end_line() {
			return getRuleContext(End_lineContext.class,0);
		}
		public List<N_libreriaContext> n_libreria() {
			return getRuleContexts(N_libreriaContext.class);
		}
		public N_libreriaContext n_libreria(int i) {
			return getRuleContext(N_libreriaContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public IncludContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includ; }
	}

	public final IncludContext includ() throws RecognitionException {
		IncludContext _localctx = new IncludContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_includ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			p_reservadas();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==VARIABLE) {
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARIABLE:
					{
					setState(71);
					n_libreria();
					}
					break;
				case INT:
					{
					setState(72);
					integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			end_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionsContext extends ParserRuleContext {
		public List<ParentesisContext> parentesis() {
			return getRuleContexts(ParentesisContext.class);
		}
		public ParentesisContext parentesis(int i) {
			return getRuleContext(ParentesisContext.class,i);
		}
		public D_puntosContext d_puntos() {
			return getRuleContext(D_puntosContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<N_funcionContext> n_funcion() {
			return getRuleContexts(N_funcionContext.class);
		}
		public N_funcionContext n_funcion(int i) {
			return getRuleContext(N_funcionContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public Beg_endContext beg_end() {
			return getRuleContext(Beg_endContext.class,0);
		}
		public P_reservadafuncionContext p_reservadafuncion() {
			return getRuleContext(P_reservadafuncionContext.class,0);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCION:
				{
				{
				setState(80);
				p_reservadafuncion();
				}
				}
				break;
			case VARIABLE:
				{
				setState(81);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==VARIABLE) {
				{
				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARIABLE:
					{
					setState(84);
					n_funcion();
					}
					break;
				case INT:
					{
					setState(85);
					integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			parentesis();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(92);
				type();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT || _la==VARIABLE) {
					{
					setState(95);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VARIABLE:
						{
						setState(93);
						variable();
						}
						break;
					case INT:
						{
						setState(94);
						integer();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(100);
					coma();
					}
				}

				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			parentesis();
			setState(109);
			d_puntos();
			setState(110);
			type();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BEGIN) {
				{
				setState(111);
				beg_end();
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

	public static class Beg_endContext extends ParserRuleContext {
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<B_whileContext> b_while() {
			return getRuleContexts(B_whileContext.class);
		}
		public B_whileContext b_while(int i) {
			return getRuleContext(B_whileContext.class,i);
		}
		public List<Return_funContext> return_fun() {
			return getRuleContexts(Return_funContext.class);
		}
		public Return_funContext return_fun(int i) {
			return getRuleContext(Return_funContext.class,i);
		}
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<CadenacharContext> cadenachar() {
			return getRuleContexts(CadenacharContext.class);
		}
		public CadenacharContext cadenachar(int i) {
			return getRuleContext(CadenacharContext.class,i);
		}
		public List<Beg_endContext> beg_end() {
			return getRuleContexts(Beg_endContext.class);
		}
		public Beg_endContext beg_end(int i) {
			return getRuleContext(Beg_endContext.class,i);
		}
		public Beg_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beg_end; }
	}

	public final Beg_endContext beg_end() throws RecognitionException {
		Beg_endContext _localctx = new Beg_endContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_beg_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			begin();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << B_WHILE) | (1L << INCLUD) | (1L << DEVOLVER) | (1L << BEGIN) | (1L << CADENA) | (1L << TYPE) | (1L << INT) | (1L << VARIABLE) | (1L << PI) | (1L << PD) | (1L << ASIG))) != 0)) {
				{
				setState(121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(115);
					expr(0);
					}
					break;
				case 2:
					{
					setState(116);
					b_while();
					}
					break;
				case 3:
					{
					setState(117);
					return_fun();
					}
					break;
				case 4:
					{
					setState(118);
					declaracion();
					}
					break;
				case 5:
					{
					setState(119);
					cadenachar();
					}
					break;
				case 6:
					{
					setState(120);
					beg_end();
					}
					break;
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class B_whileContext extends ParserRuleContext {
		public P_reservadaWhileContext p_reservadaWhile() {
			return getRuleContext(P_reservadaWhileContext.class,0);
		}
		public List<ParentesisContext> parentesis() {
			return getRuleContexts(ParentesisContext.class);
		}
		public ParentesisContext parentesis(int i) {
			return getRuleContext(ParentesisContext.class,i);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public Beg_endContext beg_end() {
			return getRuleContext(Beg_endContext.class,0);
		}
		public B_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_while; }
	}

	public final B_whileContext b_while() throws RecognitionException {
		B_whileContext _localctx = new B_whileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_b_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			p_reservadaWhile();
			setState(129);
			parentesis();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==VARIABLE) {
				{
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARIABLE:
					{
					setState(130);
					variable();
					}
					break;
				case INT:
					{
					setState(131);
					integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			operaciones();
			setState(138);
			variable();
			setState(139);
			parentesis();
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(140);
				beg_end();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<End_lineContext> end_line() {
			return getRuleContexts(End_lineContext.class);
		}
		public End_lineContext end_line(int i) {
			return getRuleContext(End_lineContext.class,i);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(143);
				type();
				}
			}

			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==VARIABLE) {
				{
				setState(148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARIABLE:
					{
					setState(146);
					variable();
					}
					break;
				case INT:
					{
					setState(147);
					integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			asignacion();
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					expr(0);
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==END_LINEDECL) {
				{
				{
				setState(160);
				end_line();
				}
				}
				setState(165);
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

	public static class Return_funContext extends ParserRuleContext {
		public P_reservadasContext p_reservadas() {
			return getRuleContext(P_reservadasContext.class,0);
		}
		public List<ParentesisContext> parentesis() {
			return getRuleContexts(ParentesisContext.class);
		}
		public ParentesisContext parentesis(int i) {
			return getRuleContext(ParentesisContext.class,i);
		}
		public End_lineContext end_line() {
			return getRuleContext(End_lineContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Return_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_fun; }
	}

	public final Return_funContext return_fun() throws RecognitionException {
		Return_funContext _localctx = new Return_funContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_return_fun);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			p_reservadas();
			setState(167);
			parentesis();
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(168);
					expr(0);
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(174);
			parentesis();
			setState(175);
			end_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamar_funcionContext extends ParserRuleContext {
		public List<ParentesisContext> parentesis() {
			return getRuleContexts(ParentesisContext.class);
		}
		public ParentesisContext parentesis(int i) {
			return getRuleContext(ParentesisContext.class,i);
		}
		public List<N_funcionContext> n_funcion() {
			return getRuleContexts(N_funcionContext.class);
		}
		public N_funcionContext n_funcion(int i) {
			return getRuleContext(N_funcionContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public End_lineContext end_line() {
			return getRuleContext(End_lineContext.class,0);
		}
		public Llamar_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamar_funcion; }
	}

	public final Llamar_funcionContext llamar_funcion() throws RecognitionException {
		Llamar_funcionContext _localctx = new Llamar_funcionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_llamar_funcion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==VARIABLE) {
				{
				setState(179);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARIABLE:
					{
					setState(177);
					n_funcion();
					}
					break;
				case INT:
					{
					setState(178);
					integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			parentesis();
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(187);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CADENA:
					case INT:
					case VARIABLE:
					case PI:
					case PD:
						{
						setState(185);
						expr(0);
						}
						break;
					case COMA:
						{
						setState(186);
						coma();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(192);
			parentesis();
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(193);
				end_line();
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

	public static class ExprContext extends ParserRuleContext {
		public CadenacharContext cadenachar() {
			return getRuleContext(CadenacharContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Llamar_funcionContext llamar_funcion() {
			return getRuleContext(Llamar_funcionContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(197);
				cadenachar();
				}
				break;
			case 2:
				{
				setState(198);
				integer();
				}
				break;
			case 3:
				{
				setState(199);
				variable();
				}
				break;
			case 4:
				{
				setState(200);
				llamar_funcion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(203);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(204);
					operaciones();
					setState(205);
					expr(2);
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class P_reservadasContext extends ParserRuleContext {
		public TerminalNode INCLUD() { return getToken(gramFibParser.INCLUD, 0); }
		public TerminalNode DEVOLVER() { return getToken(gramFibParser.DEVOLVER, 0); }
		public P_reservadasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_reservadas; }
	}

	public final P_reservadasContext p_reservadas() throws RecognitionException {
		P_reservadasContext _localctx = new P_reservadasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_p_reservadas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !(_la==INCLUD || _la==DEVOLVER) ) {
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

	public static class P_reservadaWhileContext extends ParserRuleContext {
		public TerminalNode B_WHILE() { return getToken(gramFibParser.B_WHILE, 0); }
		public P_reservadaWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_reservadaWhile; }
	}

	public final P_reservadaWhileContext p_reservadaWhile() throws RecognitionException {
		P_reservadaWhileContext _localctx = new P_reservadaWhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_p_reservadaWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(B_WHILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class P_reservadafuncionContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(gramFibParser.FUNCION, 0); }
		public P_reservadafuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_reservadafuncion; }
	}

	public final P_reservadafuncionContext p_reservadafuncion() throws RecognitionException {
		P_reservadafuncionContext _localctx = new P_reservadafuncionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_p_reservadafuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(FUNCION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeginContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(gramFibParser.BEGIN, 0); }
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(BEGIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(gramFibParser.END, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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

	public static class CadenacharContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(gramFibParser.CADENA, 0); }
		public CadenacharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadenachar; }
	}

	public final CadenacharContext cadenachar() throws RecognitionException {
		CadenacharContext _localctx = new CadenacharContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cadenachar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(CADENA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gramFibParser.INT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(gramFibParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class N_libreriaContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(gramFibParser.VARIABLE, 0); }
		public N_libreriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n_libreria; }
	}

	public final N_libreriaContext n_libreria() throws RecognitionException {
		N_libreriaContext _localctx = new N_libreriaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_n_libreria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(gramFibParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class N_funcionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(gramFibParser.VARIABLE, 0); }
		public N_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n_funcion; }
	}

	public final N_funcionContext n_funcion() throws RecognitionException {
		N_funcionContext _localctx = new N_funcionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_n_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionesContext extends ParserRuleContext {
		public TerminalNode OPERACION() { return getToken(gramFibParser.OPERACION, 0); }
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		OperacionesContext _localctx = new OperacionesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operaciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(OPERACION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ASIG() { return getToken(gramFibParser.ASIG, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(ASIG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(gramFibParser.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class D_puntosContext extends ParserRuleContext {
		public TerminalNode PUNTOS() { return getToken(gramFibParser.PUNTOS, 0); }
		public D_puntosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d_puntos; }
	}

	public final D_puntosContext d_puntos() throws RecognitionException {
		D_puntosContext _localctx = new D_puntosContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_d_puntos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(PUNTOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_lineContext extends ParserRuleContext {
		public TerminalNode END_LINEDECL() { return getToken(gramFibParser.END_LINEDECL, 0); }
		public End_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_line; }
	}

	public final End_lineContext end_line() throws RecognitionException {
		End_lineContext _localctx = new End_lineContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_end_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(END_LINEDECL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParentesisContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(gramFibParser.PI, 0); }
		public TerminalNode PD() { return getToken(gramFibParser.PD, 0); }
		public ParentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentesis; }
	}

	public final ParentesisContext parentesis() throws RecognitionException {
		ParentesisContext _localctx = new ParentesisContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parentesis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !(_la==PI || _la==PD) ) {
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

	public static class WsContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(gramFibParser.WS, 0); }
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ws);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(WS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(gramFibParser.NEWLINE, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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

	public static class PuntosContext extends ParserRuleContext {
		public TerminalNode PUNTOS() { return getToken(gramFibParser.PUNTOS, 0); }
		public PuntosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puntos; }
	}

	public final PuntosContext puntos() throws RecognitionException {
		PuntosContext _localctx = new PuntosContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_puntos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(PUNTOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComentsContext extends ParserRuleContext {
		public TerminalNode COMENTARIO_BLOQUE() { return getToken(gramFibParser.COMENTARIO_BLOQUE, 0); }
		public TerminalNode COMENTARIO_BLOQUE2() { return getToken(gramFibParser.COMENTARIO_BLOQUE2, 0); }
		public TerminalNode COMENTARIO_LINEA() { return getToken(gramFibParser.COMENTARIO_LINEA, 0); }
		public ComentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coments; }
	}

	public final ComentsContext coments() throws RecognitionException {
		ComentsContext _localctx = new ComentsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_coments);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COMENTARIO_BLOQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(COMENTARIO_BLOQUE);
				}
				break;
			case COMENTARIO_BLOQUE2:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(COMENTARIO_BLOQUE2);
				}
				break;
			case COMENTARIO_LINEA:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(COMENTARIO_LINEA);
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
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0105\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\5"+
		"\2A\n\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13"+
		"\3\3\3\3\3\3\4\3\4\5\4U\n\4\3\4\3\4\7\4Y\n\4\f\4\16\4\\\13\4\3\4\3\4\3"+
		"\4\3\4\7\4b\n\4\f\4\16\4e\13\4\3\4\5\4h\n\4\7\4j\n\4\f\4\16\4m\13\4\3"+
		"\4\3\4\3\4\3\4\5\4s\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5|\n\5\f\5\16\5"+
		"\177\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u0087\n\6\f\6\16\6\u008a\13\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0090\n\6\3\7\5\7\u0093\n\7\3\7\3\7\7\7\u0097\n\7\f"+
		"\7\16\7\u009a\13\7\3\7\3\7\7\7\u009e\n\7\f\7\16\7\u00a1\13\7\3\7\7\7\u00a4"+
		"\n\7\f\7\16\7\u00a7\13\7\3\b\3\b\3\b\7\b\u00ac\n\b\f\b\16\b\u00af\13\b"+
		"\3\b\3\b\3\b\3\t\3\t\7\t\u00b6\n\t\f\t\16\t\u00b9\13\t\3\t\3\t\3\t\7\t"+
		"\u00be\n\t\f\t\16\t\u00c1\13\t\3\t\3\t\5\t\u00c5\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00cc\n\n\3\n\3\n\3\n\3\n\7\n\u00d2\n\n\f\n\16\n\u00d5\13\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\5\37\u0103\n\37\3\37\2\3\22 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<\2\4\3\2\5\6\3\2\17\20\2\u010e\2E\3\2\2\2\4H\3"+
		"\2\2\2\6T\3\2\2\2\bt\3\2\2\2\n\u0082\3\2\2\2\f\u0092\3\2\2\2\16\u00a8"+
		"\3\2\2\2\20\u00b7\3\2\2\2\22\u00cb\3\2\2\2\24\u00d6\3\2\2\2\26\u00d8\3"+
		"\2\2\2\30\u00da\3\2\2\2\32\u00dc\3\2\2\2\34\u00de\3\2\2\2\36\u00e0\3\2"+
		"\2\2 \u00e2\3\2\2\2\"\u00e4\3\2\2\2$\u00e6\3\2\2\2&\u00e8\3\2\2\2(\u00ea"+
		"\3\2\2\2*\u00ec\3\2\2\2,\u00ee\3\2\2\2.\u00f0\3\2\2\2\60\u00f2\3\2\2\2"+
		"\62\u00f4\3\2\2\2\64\u00f6\3\2\2\2\66\u00f8\3\2\2\28\u00fa\3\2\2\2:\u00fc"+
		"\3\2\2\2<\u0102\3\2\2\2>A\5\4\3\2?A\5\6\4\2@>\3\2\2\2@?\3\2\2\2AD\3\2"+
		"\2\2BD\7\33\2\2C@\3\2\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3"+
		"\2\2\2GE\3\2\2\2HM\5\24\13\2IL\5$\23\2JL\5 \21\2KI\3\2\2\2KJ\3\2\2\2L"+
		"O\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\5\62\32\2Q\5\3\2\2"+
		"\2RU\5\30\r\2SU\5&\24\2TR\3\2\2\2TS\3\2\2\2UZ\3\2\2\2VY\5(\25\2WY\5 \21"+
		"\2XV\3\2\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2"+
		"\2\2]k\5\64\33\2^c\5\"\22\2_b\5&\24\2`b\5 \21\2a_\3\2\2\2a`\3\2\2\2be"+
		"\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2fh\5.\30\2gf\3\2\2\2g"+
		"h\3\2\2\2hj\3\2\2\2i^\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2"+
		"mk\3\2\2\2no\5\64\33\2op\5\60\31\2pr\5\"\22\2qs\5\b\5\2rq\3\2\2\2rs\3"+
		"\2\2\2s\7\3\2\2\2t}\5\32\16\2u|\5\22\n\2v|\5\n\6\2w|\5\16\b\2x|\5\f\7"+
		"\2y|\5\36\20\2z|\5\b\5\2{u\3\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2\2{y\3\2"+
		"\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3"+
		"\2\2\2\u0080\u0081\5\34\17\2\u0081\t\3\2\2\2\u0082\u0083\5\26\f\2\u0083"+
		"\u0088\5\64\33\2\u0084\u0087\5&\24\2\u0085\u0087\5 \21\2\u0086\u0084\3"+
		"\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\5*"+
		"\26\2\u008c\u008d\5&\24\2\u008d\u008f\5\64\33\2\u008e\u0090\5\b\5\2\u008f"+
		"\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\13\3\2\2\2\u0091\u0093\5\"\22"+
		"\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0098\3\2\2\2\u0094\u0097"+
		"\5&\24\2\u0095\u0097\5 \21\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009b\u009f\5,\27\2\u009c\u009e\5\22\n\2\u009d"+
		"\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a5\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\5\62\32\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\r\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\5\24\13\2\u00a9\u00ad"+
		"\5\64\33\2\u00aa\u00ac\5\22\n\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2"+
		"\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00b0\u00b1\5\64\33\2\u00b1\u00b2\5\62\32\2\u00b2\17\3\2\2\2"+
		"\u00b3\u00b6\5(\25\2\u00b4\u00b6\5 \21\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4"+
		"\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bf\5\64\33\2\u00bb\u00be\5"+
		"\22\n\2\u00bc\u00be\5.\30\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\5\64\33\2\u00c3\u00c5\5\62\32\2\u00c4"+
		"\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\21\3\2\2\2\u00c6\u00c7\b\n\1"+
		"\2\u00c7\u00cc\5\36\20\2\u00c8\u00cc\5 \21\2\u00c9\u00cc\5&\24\2\u00ca"+
		"\u00cc\5\20\t\2\u00cb\u00c6\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3"+
		"\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00d3\3\2\2\2\u00cd\u00ce\f\3\2\2\u00ce"+
		"\u00cf\5*\26\2\u00cf\u00d0\5\22\n\4\u00d0\u00d2\3\2\2\2\u00d1\u00cd\3"+
		"\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\23\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\t\2\2\2\u00d7\25\3\2\2\2\u00d8"+
		"\u00d9\7\3\2\2\u00d9\27\3\2\2\2\u00da\u00db\7\4\2\2\u00db\31\3\2\2\2\u00dc"+
		"\u00dd\7\7\2\2\u00dd\33\3\2\2\2\u00de\u00df\7\b\2\2\u00df\35\3\2\2\2\u00e0"+
		"\u00e1\7\t\2\2\u00e1\37\3\2\2\2\u00e2\u00e3\7\f\2\2\u00e3!\3\2\2\2\u00e4"+
		"\u00e5\7\n\2\2\u00e5#\3\2\2\2\u00e6\u00e7\7\16\2\2\u00e7%\3\2\2\2\u00e8"+
		"\u00e9\7\16\2\2\u00e9\'\3\2\2\2\u00ea\u00eb\7\16\2\2\u00eb)\3\2\2\2\u00ec"+
		"\u00ed\7\13\2\2\u00ed+\3\2\2\2\u00ee\u00ef\7\21\2\2\u00ef-\3\2\2\2\u00f0"+
		"\u00f1\7\23\2\2\u00f1/\3\2\2\2\u00f2\u00f3\7\22\2\2\u00f3\61\3\2\2\2\u00f4"+
		"\u00f5\7\24\2\2\u00f5\63\3\2\2\2\u00f6\u00f7\t\3\2\2\u00f7\65\3\2\2\2"+
		"\u00f8\u00f9\7\32\2\2\u00f9\67\3\2\2\2\u00fa\u00fb\7\33\2\2\u00fb9\3\2"+
		"\2\2\u00fc\u00fd\7\22\2\2\u00fd;\3\2\2\2\u00fe\u0103\3\2\2\2\u00ff\u0103"+
		"\7\25\2\2\u0100\u0103\7\26\2\2\u0101\u0103\7\27\2\2\u0102\u00fe\3\2\2"+
		"\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103="+
		"\3\2\2\2\"@CEKMTXZacgkr{}\u0086\u0088\u008f\u0092\u0096\u0098\u009f\u00a5"+
		"\u00ad\u00b5\u00b7\u00bd\u00bf\u00c4\u00cb\u00d3\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}