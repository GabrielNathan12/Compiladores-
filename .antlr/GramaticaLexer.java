// Generated from /home/gabriel/Compiladores-/Gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, TIPO=2, AP=3, FP=4, ENTR=5, SAI=6, OP_ARI=7, OP_LOG=8, OP=9, VAR=10, 
		NUM=11, PC=12, AC=13, FC=14, DEL=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAIN", "TIPO", "AP", "FP", "ENTR", "SAI", "OP_ARI", "OP_LOG", "OP", 
			"VAR", "NUM", "PC", "AC", "FC", "DEL", "LETRA", "DIGITO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", null, "'('", "')'", "'input'", "'output'", null, null, 
			null, null, null, null, "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "TIPO", "AP", "FP", "ENTR", "SAI", "OP_ARI", "OP_LOG", 
			"OP", "VAR", "NUM", "PC", "AC", "FC", "DEL", "WS"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u009e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tT\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\\\n\n\3\13\3\13\3\13\6\13a\n\13\r\13\16\13b\5\13"+
		"e\n\13\3\f\6\fh\n\f\r\f\16\fi\3\f\3\f\5\fn\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008f\n\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\2%\22\3\2"+
		"\7\5\2,-//\61\61\4\2>>@@\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00ab\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2%\3\2\2\2\3\'\3\2"+
		"\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rE\3\2\2\2\17L\3\2\2"+
		"\2\21S\3\2\2\2\23[\3\2\2\2\25]\3\2\2\2\27g\3\2\2\2\31\u008e\3\2\2\2\33"+
		"\u0090\3\2\2\2\35\u0092\3\2\2\2\37\u0094\3\2\2\2!\u0096\3\2\2\2#\u0098"+
		"\3\2\2\2%\u009a\3\2\2\2\'(\7o\2\2()\7c\2\2)*\7k\2\2*+\7p\2\2+\4\3\2\2"+
		"\2,-\7k\2\2-.\7p\2\2.:\7v\2\2/\60\7t\2\2\60\61\7g\2\2\61\62\7c\2\2\62"+
		":\7n\2\2\63\64\7u\2\2\64\65\7v\2\2\65\66\7t\2\2\66\67\7k\2\2\678\7p\2"+
		"\28:\7i\2\29,\3\2\2\29/\3\2\2\29\63\3\2\2\2:\6\3\2\2\2;<\7*\2\2<\b\3\2"+
		"\2\2=>\7+\2\2>\n\3\2\2\2?@\7k\2\2@A\7p\2\2AB\7r\2\2BC\7w\2\2CD\7v\2\2"+
		"D\f\3\2\2\2EF\7q\2\2FG\7w\2\2GH\7v\2\2HI\7r\2\2IJ\7w\2\2JK\7v\2\2K\16"+
		"\3\2\2\2LM\t\2\2\2M\20\3\2\2\2NO\7c\2\2OP\7p\2\2PT\7f\2\2QR\7q\2\2RT\7"+
		"t\2\2SN\3\2\2\2SQ\3\2\2\2T\22\3\2\2\2U\\\t\3\2\2VW\7@\2\2W\\\7?\2\2XY"+
		"\7>\2\2Y\\\7?\2\2Z\\\7?\2\2[U\3\2\2\2[V\3\2\2\2[X\3\2\2\2[Z\3\2\2\2\\"+
		"\24\3\2\2\2]d\5!\21\2^a\5#\22\2_a\5!\21\2`^\3\2\2\2`_\3\2\2\2ab\3\2\2"+
		"\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2d`\3\2\2\2de\3\2\2\2e\26\3\2\2\2fh\5#"+
		"\22\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2kl\7\60\2\2ln\5"+
		"#\22\2mk\3\2\2\2mn\3\2\2\2n\30\3\2\2\2op\7r\2\2pq\7c\2\2qr\7t\2\2r\u008f"+
		"\7c\2\2st\7h\2\2tu\7w\2\2uv\7p\2\2vw\7e\2\2wx\7c\2\2x\u008f\7q\2\2yz\7"+
		"u\2\2z\u008f\7g\2\2{|\7u\2\2|}\7g\2\2}~\7p\2\2~\177\7c\2\2\177\u0080\7"+
		"q\2\2\u0080\u0081\7u\2\2\u0081\u008f\7g\2\2\u0082\u0083\7u\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7p\2\2\u0085\u0086\7c\2\2\u0086\u008f\7q\2\2\u0087"+
		"\u0088\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a\7v\2\2\u008a\u008b\7q\2\2"+
		"\u008b\u008c\7t\2\2\u008c\u008d\7p\2\2\u008d\u008f\7c\2\2\u008eo\3\2\2"+
		"\2\u008es\3\2\2\2\u008ey\3\2\2\2\u008e{\3\2\2\2\u008e\u0082\3\2\2\2\u008e"+
		"\u0087\3\2\2\2\u008f\32\3\2\2\2\u0090\u0091\7}\2\2\u0091\34\3\2\2\2\u0092"+
		"\u0093\7\177\2\2\u0093\36\3\2\2\2\u0094\u0095\7=\2\2\u0095 \3\2\2\2\u0096"+
		"\u0097\t\4\2\2\u0097\"\3\2\2\2\u0098\u0099\t\5\2\2\u0099$\3\2\2\2\u009a"+
		"\u009b\t\6\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\23\2\2\u009d&\3\2\2\2"+
		"\f\29S[`bdim\u008e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}