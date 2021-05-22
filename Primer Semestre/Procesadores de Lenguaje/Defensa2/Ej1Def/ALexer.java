// Generated from .\ALexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIO_LINEA=1, COMENTARIO_BLOQUE=2, PUNTO_COMA=3, DOS_PUNTOS=4, COMA=5, 
		ASIGNAR=6, FUNCTION=7, MAIN=8, WHILE=9, IF=10, FOR=11, PI=12, PD=13, SUMA=14, 
		RESTA=15, INCREMENTO=16, DECREMENTO=17, MULTIPLICACION=18, DIVISION=19, 
		MAYOR_QUE=20, MENOR_QUE=21, IGUAL=22, AND=23, OR=24, BEGIN=25, END=26, 
		INCLUDE=27, VOID=28, PR_CADENA=29, PR_NUMERO=30, PUNTO=31, NUMERO=32, 
		COMILLAS=33, STRING=34, PALABRA=35, SOBRAS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "PUNTO_COMA", "DOS_PUNTOS", 
			"COMA", "ASIGNAR", "FUNCTION", "MAIN", "WHILE", "IF", "FOR", "PI", "PD", 
			"SUMA", "RESTA", "INCREMENTO", "DECREMENTO", "MULTIPLICACION", "DIVISION", 
			"MAYOR_QUE", "MENOR_QUE", "IGUAL", "AND", "OR", "BEGIN", "END", "INCLUDE", 
			"VOID", "PR_CADENA", "PR_NUMERO", "INT", "PUNTO", "NUMERO", "COMILLAS", 
			"STRING", "LETRA", "PALABRA", "SOBRAS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "';'", "':'", "','", "':='", "'function'", "'main'", 
			"'while'", "'if'", "'for'", "'('", "')'", "'+'", "'-'", "'++'", "'--'", 
			"'*'", "'/'", "'>'", "'<'", "'='", "'&&'", "'||'", "'begin'", "'end'", 
			"'include'", "'void'", "'cadena'", "'numero'", "'.'", null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "PUNTO_COMA", "DOS_PUNTOS", 
			"COMA", "ASIGNAR", "FUNCTION", "MAIN", "WHILE", "IF", "FOR", "PI", "PD", 
			"SUMA", "RESTA", "INCREMENTO", "DECREMENTO", "MULTIPLICACION", "DIVISION", 
			"MAYOR_QUE", "MENOR_QUE", "IGUAL", "AND", "OR", "BEGIN", "END", "INCLUDE", 
			"VOID", "PR_CADENA", "PR_NUMERO", "PUNTO", "NUMERO", "COMILLAS", "STRING", 
			"PALABRA", "SOBRAS"
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


	public ALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ALexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u011d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\7\2T\n\2\f"+
		"\2\16\2W\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3a\n\3\f\3\16\3d\13\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\7\3{\n\3\f\3\16\3~\13\3\3\3\3\3\3\3\3\3\5\3\u0084\n"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\6\"\u00f4\n\"\r\"\16\"\u00f5\3\"\5\"\u00f9\n\"\3\"\7"+
		"\"\u00fc\n\"\f\"\16\"\u00ff\13\"\3#\3#\3$\3$\7$\u0105\n$\f$\16$\u0108"+
		"\13$\3$\3$\3%\3%\3&\3&\3&\3&\7&\u0112\n&\f&\16&\u0115\13&\3\'\6\'\u0118"+
		"\n\'\r\'\16\'\u0119\3\'\3\'\7Ubn|\u0106\2(\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?\2A!C\"E#G$I\2K%M&\3\2\5"+
		"\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0128\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5"+
		"\u0083\3\2\2\2\7\u0087\3\2\2\2\t\u0089\3\2\2\2\13\u008b\3\2\2\2\r\u008d"+
		"\3\2\2\2\17\u0090\3\2\2\2\21\u0099\3\2\2\2\23\u009e\3\2\2\2\25\u00a4\3"+
		"\2\2\2\27\u00a7\3\2\2\2\31\u00ab\3\2\2\2\33\u00ad\3\2\2\2\35\u00af\3\2"+
		"\2\2\37\u00b1\3\2\2\2!\u00b3\3\2\2\2#\u00b6\3\2\2\2%\u00b9\3\2\2\2\'\u00bb"+
		"\3\2\2\2)\u00bd\3\2\2\2+\u00bf\3\2\2\2-\u00c1\3\2\2\2/\u00c3\3\2\2\2\61"+
		"\u00c6\3\2\2\2\63\u00c9\3\2\2\2\65\u00cf\3\2\2\2\67\u00d3\3\2\2\29\u00db"+
		"\3\2\2\2;\u00e0\3\2\2\2=\u00e7\3\2\2\2?\u00ee\3\2\2\2A\u00f0\3\2\2\2C"+
		"\u00f3\3\2\2\2E\u0100\3\2\2\2G\u0102\3\2\2\2I\u010b\3\2\2\2K\u010d\3\2"+
		"\2\2M\u0117\3\2\2\2OP\7\61\2\2PQ\7\61\2\2QU\3\2\2\2RT\13\2\2\2SR\3\2\2"+
		"\2TW\3\2\2\2UV\3\2\2\2US\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\f\2\2YZ\3\2\2"+
		"\2Z[\b\2\2\2[\4\3\2\2\2\\]\7\61\2\2]^\7,\2\2^b\3\2\2\2_a\13\2\2\2`_\3"+
		"\2\2\2ad\3\2\2\2bc\3\2\2\2b`\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7,\2\2f\u0084"+
		"\7\61\2\2gh\7\61\2\2hi\7,\2\2ij\7,\2\2jn\3\2\2\2km\13\2\2\2lk\3\2\2\2"+
		"mp\3\2\2\2no\3\2\2\2nl\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7,\2\2rs\7,\2\2s"+
		"\u0084\7\61\2\2tu\7\61\2\2uv\7,\2\2vw\7,\2\2wx\7,\2\2x|\3\2\2\2y{\13\2"+
		"\2\2zy\3\2\2\2{~\3\2\2\2|}\3\2\2\2|z\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177"+
		"\u0080\7,\2\2\u0080\u0081\7,\2\2\u0081\u0082\7,\2\2\u0082\u0084\7\61\2"+
		"\2\u0083\\\3\2\2\2\u0083g\3\2\2\2\u0083t\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\b\3\2\2\u0086\6\3\2\2\2\u0087\u0088\7=\2\2\u0088\b\3\2\2\2\u0089"+
		"\u008a\7<\2\2\u008a\n\3\2\2\2\u008b\u008c\7.\2\2\u008c\f\3\2\2\2\u008d"+
		"\u008e\7<\2\2\u008e\u008f\7?\2\2\u008f\16\3\2\2\2\u0090\u0091\7h\2\2\u0091"+
		"\u0092\7w\2\2\u0092\u0093\7p\2\2\u0093\u0094\7e\2\2\u0094\u0095\7v\2\2"+
		"\u0095\u0096\7k\2\2\u0096\u0097\7q\2\2\u0097\u0098\7p\2\2\u0098\20\3\2"+
		"\2\2\u0099\u009a\7o\2\2\u009a\u009b\7c\2\2\u009b\u009c\7k\2\2\u009c\u009d"+
		"\7p\2\2\u009d\22\3\2\2\2\u009e\u009f\7y\2\2\u009f\u00a0\7j\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7g\2\2\u00a3\24\3\2\2\2\u00a4\u00a5"+
		"\7k\2\2\u00a5\u00a6\7h\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9"+
		"\7q\2\2\u00a9\u00aa\7t\2\2\u00aa\30\3\2\2\2\u00ab\u00ac\7*\2\2\u00ac\32"+
		"\3\2\2\2\u00ad\u00ae\7+\2\2\u00ae\34\3\2\2\2\u00af\u00b0\7-\2\2\u00b0"+
		"\36\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2 \3\2\2\2\u00b3\u00b4\7-\2\2\u00b4"+
		"\u00b5\7-\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7/\2\2\u00b7\u00b8\7/\2\2\u00b8"+
		"$\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc"+
		"(\3\2\2\2\u00bd\u00be\7@\2\2\u00be*\3\2\2\2\u00bf\u00c0\7>\2\2\u00c0,"+
		"\3\2\2\2\u00c1\u00c2\7?\2\2\u00c2.\3\2\2\2\u00c3\u00c4\7(\2\2\u00c4\u00c5"+
		"\7(\2\2\u00c5\60\3\2\2\2\u00c6\u00c7\7~\2\2\u00c7\u00c8\7~\2\2\u00c8\62"+
		"\3\2\2\2\u00c9\u00ca\7d\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7i\2\2\u00cc"+
		"\u00cd\7k\2\2\u00cd\u00ce\7p\2\2\u00ce\64\3\2\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"\u00d1\7p\2\2\u00d1\u00d2\7f\2\2\u00d2\66\3\2\2\2\u00d3\u00d4\7k\2\2\u00d4"+
		"\u00d5\7p\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7w\2\2"+
		"\u00d8\u00d9\7f\2\2\u00d9\u00da\7g\2\2\u00da8\3\2\2\2\u00db\u00dc\7x\2"+
		"\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7f\2\2\u00df:\3\2"+
		"\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7f\2\2\u00e3\u00e4"+
		"\7g\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7c\2\2\u00e6<\3\2\2\2\u00e7\u00e8"+
		"\7p\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7o\2\2\u00ea\u00eb\7g\2\2\u00eb"+
		"\u00ec\7t\2\2\u00ec\u00ed\7q\2\2\u00ed>\3\2\2\2\u00ee\u00ef\t\2\2\2\u00ef"+
		"@\3\2\2\2\u00f0\u00f1\7\60\2\2\u00f1B\3\2\2\2\u00f2\u00f4\5? \2\u00f3"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f9\5A!\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00fd\3\2\2\2\u00fa\u00fc\5? \2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00feD\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u0100\u0101\7$\2\2\u0101F\3\2\2\2\u0102\u0106\5E"+
		"#\2\u0103\u0105\13\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0109\u010a\5E#\2\u010aH\3\2\2\2\u010b\u010c\t\3\2\2\u010cJ\3\2\2"+
		"\2\u010d\u0113\5I%\2\u010e\u0112\5I%\2\u010f\u0112\5? \2\u0110\u0112\7"+
		"a\2\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114L\3\2\2\2"+
		"\u0115\u0113\3\2\2\2\u0116\u0118\t\4\2\2\u0117\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\b\'\2\2\u011cN\3\2\2\2\17\2Ubn|\u0083\u00f5\u00f8\u00fd\u0106\u0111"+
		"\u0113\u0119\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}