// Generated from d:\Universidad\Procesadores del Lenguaje\ANTLR\practica2_2\CopiaLexer_Parser_Ejecucion_Listener/gramFibLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramFibLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"B_WHILE", "FUNCION", "INCLUD", "DEVOLVER", "BEGIN", "END", "CADENA", 
		"ESC", "TYPE", "OPERACION", "INT", "FLOTANTE", "VARIABLE", "PI", "PD", 
		"ASIG", "PUNTOS", "COMA", "END_LINEDECL", "COMENTARIO_BLOQUE", "COMENTARIO_BLOQUE2", 
		"COMENTARIO_LINEA", "COMENTARIO_LINEA2", "COMENTARIO_LINEA3", "WS", "NEWLINE"
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


	public gramFibLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramFibLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u011c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b"+
		"e\n\b\f\b\16\bh\13\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\177\n\n\3\13\3\13\3\f\5\f\u0084"+
		"\n\f\3\f\6\f\u0087\n\f\r\f\16\f\u0088\3\r\5\r\u008c\n\r\3\r\6\r\u008f"+
		"\n\r\r\r\16\r\u0090\3\r\3\r\7\r\u0095\n\r\f\r\16\r\u0098\13\r\3\r\5\r"+
		"\u009b\n\r\3\r\5\r\u009e\n\r\3\r\3\r\6\r\u00a2\n\r\r\r\16\r\u00a3\5\r"+
		"\u00a6\n\r\3\16\6\16\u00a9\n\16\r\16\16\16\u00aa\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\7\25\u00c0\n\25\f\25\16\25\u00c3\13\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00d4\n\26\f\26"+
		"\16\26\u00d7\13\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\7\27\u00e6\n\27\f\27\16\27\u00e9\13\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00f5\n\30\f\30\16\30\u00f8\13"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u0105"+
		"\n\31\f\31\16\31\u0108\13\31\3\31\3\31\3\31\3\31\3\31\3\32\6\32\u0110"+
		"\n\32\r\32\16\32\u0111\3\32\3\32\3\33\6\33\u0117\n\33\r\33\16\33\u0118"+
		"\3\33\3\33\bf\u00c1\u00d5\u00e7\u00f6\u0106\2\34\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\2\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24"+
		")\25+\26-\27/\30\61\31\63\32\65\33\3\2\b\b\2$$^^ddppttvv\4\2-->>\4\2-"+
		"-//\3\2\62;\4\2C\\c|\4\2\f\f\17\17\2\u012f\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\3\67\3\2\2\2\5=\3\2\2\2\7F\3\2\2\2\tN\3\2\2\2\13W\3\2\2\2\r]\3\2\2\2"+
		"\17a\3\2\2\2\21k\3\2\2\2\23~\3\2\2\2\25\u0080\3\2\2\2\27\u0083\3\2\2\2"+
		"\31\u00a5\3\2\2\2\33\u00a8\3\2\2\2\35\u00ac\3\2\2\2\37\u00ae\3\2\2\2!"+
		"\u00b0\3\2\2\2#\u00b3\3\2\2\2%\u00b5\3\2\2\2\'\u00b7\3\2\2\2)\u00b9\3"+
		"\2\2\2+\u00cd\3\2\2\2-\u00e1\3\2\2\2/\u00f0\3\2\2\2\61\u0100\3\2\2\2\63"+
		"\u010f\3\2\2\2\65\u0116\3\2\2\2\678\7y\2\289\7j\2\29:\7k\2\2:;\7n\2\2"+
		";<\7g\2\2<\4\3\2\2\2=>\7h\2\2>?\7w\2\2?@\7p\2\2@A\7e\2\2AB\7v\2\2BC\7"+
		"k\2\2CD\7q\2\2DE\7p\2\2E\6\3\2\2\2FG\7k\2\2GH\7p\2\2HI\7e\2\2IJ\7n\2\2"+
		"JK\7w\2\2KL\7f\2\2LM\7g\2\2M\b\3\2\2\2NO\7f\2\2OP\7g\2\2PQ\7x\2\2QR\7"+
		"q\2\2RS\7n\2\2ST\7x\2\2TU\7g\2\2UV\7t\2\2V\n\3\2\2\2WX\7d\2\2XY\7g\2\2"+
		"YZ\7i\2\2Z[\7k\2\2[\\\7p\2\2\\\f\3\2\2\2]^\7g\2\2^_\7p\2\2_`\7f\2\2`\16"+
		"\3\2\2\2af\7$\2\2be\5\21\t\2ce\13\2\2\2db\3\2\2\2dc\3\2\2\2eh\3\2\2\2"+
		"fg\3\2\2\2fd\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7$\2\2j\20\3\2\2\2kl\7^\2\2"+
		"lm\t\2\2\2m\22\3\2\2\2no\7p\2\2op\7w\2\2pq\7o\2\2qr\7g\2\2rs\7t\2\2s\177"+
		"\7q\2\2tu\7e\2\2uv\7c\2\2vw\7f\2\2wx\7g\2\2xy\7p\2\2y\177\7c\2\2z{\7x"+
		"\2\2{|\7q\2\2|}\7k\2\2}\177\7f\2\2~n\3\2\2\2~t\3\2\2\2~z\3\2\2\2\177\24"+
		"\3\2\2\2\u0080\u0081\t\3\2\2\u0081\26\3\2\2\2\u0082\u0084\t\4\2\2\u0083"+
		"\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0087\t\5"+
		"\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\30\3\2\2\2\u008a\u008c\7/\2\2\u008b\u008a\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008f\5\27\f\2\u008e\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0096\7\60\2\2\u0093\u0095\5\27\f\2\u0094\u0093\3"+
		"\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u00a6\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\7/\2\2\u009a\u0099\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009e\7\62\2\2\u009d"+
		"\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\7\60"+
		"\2\2\u00a0\u00a2\5\27\f\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u008b\3\2"+
		"\2\2\u00a5\u009a\3\2\2\2\u00a6\32\3\2\2\2\u00a7\u00a9\t\6\2\2\u00a8\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\34\3\2\2\2\u00ac\u00ad\7*\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7+\2\2\u00af"+
		" \3\2\2\2\u00b0\u00b1\7<\2\2\u00b1\u00b2\7?\2\2\u00b2\"\3\2\2\2\u00b3"+
		"\u00b4\7<\2\2\u00b4$\3\2\2\2\u00b5\u00b6\7.\2\2\u00b6&\3\2\2\2\u00b7\u00b8"+
		"\7=\2\2\u00b8(\3\2\2\2\u00b9\u00ba\7\61\2\2\u00ba\u00bb\7,\2\2\u00bb\u00bc"+
		"\7,\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c1\5\65\33\2\u00be\u00c0\13\2\2\2"+
		"\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\5\65\33\2"+
		"\u00c5\u00c6\7,\2\2\u00c6\u00c7\7,\2\2\u00c7\u00c8\7\61\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\5\65\33\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b\25\2"+
		"\2\u00cc*\3\2\2\2\u00cd\u00ce\7\61\2\2\u00ce\u00cf\7,\2\2\u00cf\u00d0"+
		"\7,\2\2\u00d0\u00d1\7,\2\2\u00d1\u00d5\3\2\2\2\u00d2\u00d4\13\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7,\2\2\u00d9"+
		"\u00da\7,\2\2\u00da\u00db\7,\2\2\u00db\u00dc\7\61\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00de\5\65\33\2\u00de\u00df\3\2\2\2\u00df\u00e0\b\26\2\2\u00e0"+
		",\3\2\2\2\u00e1\u00e2\7\61\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e7\3\2\2"+
		"\2\u00e4\u00e6\13\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00eb\t\7\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\5\65\33\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\b\27\2\2\u00ef.\3\2\2\2\u00f0\u00f1\7\61\2"+
		"\2\u00f1\u00f2\7,\2\2\u00f2\u00f6\3\2\2\2\u00f3\u00f5\13\2\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7,\2\2\u00fa\u00fb\7\61"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\5\65\33\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\b\30\2\2\u00ff\60\3\2\2\2\u0100\u0101\7\61\2\2\u0101\u0102\7,\2"+
		"\2\u0102\u0106\3\2\2\2\u0103\u0105\13\2\2\2\u0104\u0103\3\2\2\2\u0105"+
		"\u0108\3\2\2\2\u0106\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\3\2"+
		"\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7,\2\2\u010a\u010b\7\61\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\b\31\2\2\u010d\62\3\2\2\2\u010e\u0110\7\"\2"+
		"\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\b\32\2\2\u0114\64\3\2\2\2\u0115"+
		"\u0117\t\7\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\b\33\2\2\u011b"+
		"\66\3\2\2\2\27\2df~\u0083\u0088\u008b\u0090\u0096\u009a\u009d\u00a3\u00a5"+
		"\u00aa\u00c1\u00d5\u00e7\u00f6\u0106\u0111\u0118\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}