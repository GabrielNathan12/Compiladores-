// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000\u0010\u009c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007R\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\bZ\b\b\u0001\t\u0001\t\u0001\t\u0004\t"+
		"_\b\t\u000b\t\f\t`\u0003\tc\b\t\u0001\n\u0004\nf\b\n\u000b\n\f\ng\u0001"+
		"\n\u0001\n\u0003\nl\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008d\b\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0000\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0000!\u0000#\u0010\u0001\u0000\u0005"+
		"\u0003\u0000*+--//\u0002\u0000<<>>\u0002\u0000AZaz\u0001\u000009\u0003"+
		"\u0000\t\n\r\r  \u00a9\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0001%\u0001\u0000\u0000\u0000\u00037\u0001\u0000\u0000\u0000\u0005"+
		"9\u0001\u0000\u0000\u0000\u0007;\u0001\u0000\u0000\u0000\t=\u0001\u0000"+
		"\u0000\u0000\u000bC\u0001\u0000\u0000\u0000\rJ\u0001\u0000\u0000\u0000"+
		"\u000fQ\u0001\u0000\u0000\u0000\u0011Y\u0001\u0000\u0000\u0000\u0013["+
		"\u0001\u0000\u0000\u0000\u0015e\u0001\u0000\u0000\u0000\u0017\u008c\u0001"+
		"\u0000\u0000\u0000\u0019\u008e\u0001\u0000\u0000\u0000\u001b\u0090\u0001"+
		"\u0000\u0000\u0000\u001d\u0092\u0001\u0000\u0000\u0000\u001f\u0094\u0001"+
		"\u0000\u0000\u0000!\u0096\u0001\u0000\u0000\u0000#\u0098\u0001\u0000\u0000"+
		"\u0000%&\u0005m\u0000\u0000&\'\u0005a\u0000\u0000\'(\u0005i\u0000\u0000"+
		"()\u0005n\u0000\u0000)\u0002\u0001\u0000\u0000\u0000*+\u0005i\u0000\u0000"+
		"+,\u0005n\u0000\u0000,8\u0005t\u0000\u0000-.\u0005r\u0000\u0000./\u0005"+
		"e\u0000\u0000/0\u0005a\u0000\u000008\u0005l\u0000\u000012\u0005s\u0000"+
		"\u000023\u0005t\u0000\u000034\u0005r\u0000\u000045\u0005i\u0000\u0000"+
		"56\u0005n\u0000\u000068\u0005g\u0000\u00007*\u0001\u0000\u0000\u00007"+
		"-\u0001\u0000\u0000\u000071\u0001\u0000\u0000\u00008\u0004\u0001\u0000"+
		"\u0000\u00009:\u0005(\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005"+
		")\u0000\u0000<\b\u0001\u0000\u0000\u0000=>\u0005i\u0000\u0000>?\u0005"+
		"n\u0000\u0000?@\u0005p\u0000\u0000@A\u0005u\u0000\u0000AB\u0005t\u0000"+
		"\u0000B\n\u0001\u0000\u0000\u0000CD\u0005o\u0000\u0000DE\u0005u\u0000"+
		"\u0000EF\u0005t\u0000\u0000FG\u0005p\u0000\u0000GH\u0005u\u0000\u0000"+
		"HI\u0005t\u0000\u0000I\f\u0001\u0000\u0000\u0000JK\u0007\u0000\u0000\u0000"+
		"K\u000e\u0001\u0000\u0000\u0000LM\u0005a\u0000\u0000MN\u0005n\u0000\u0000"+
		"NR\u0005d\u0000\u0000OP\u0005o\u0000\u0000PR\u0005r\u0000\u0000QL\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000R\u0010\u0001\u0000\u0000"+
		"\u0000SZ\u0007\u0001\u0000\u0000TU\u0005>\u0000\u0000UZ\u0005=\u0000\u0000"+
		"VW\u0005<\u0000\u0000WZ\u0005=\u0000\u0000XZ\u0005=\u0000\u0000YS\u0001"+
		"\u0000\u0000\u0000YT\u0001\u0000\u0000\u0000YV\u0001\u0000\u0000\u0000"+
		"YX\u0001\u0000\u0000\u0000Z\u0012\u0001\u0000\u0000\u0000[b\u0003\u001f"+
		"\u000f\u0000\\_\u0003!\u0010\u0000]_\u0003\u001f\u000f\u0000^\\\u0001"+
		"\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000"+
		"\u0000b^\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u0014\u0001"+
		"\u0000\u0000\u0000df\u0003!\u0010\u0000ed\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hk\u0001\u0000\u0000\u0000ij\u0005.\u0000\u0000jl\u0003!\u0010\u0000k"+
		"i\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u0016\u0001\u0000"+
		"\u0000\u0000mn\u0005p\u0000\u0000no\u0005a\u0000\u0000op\u0005r\u0000"+
		"\u0000p\u008d\u0005a\u0000\u0000qr\u0005f\u0000\u0000rs\u0005u\u0000\u0000"+
		"st\u0005n\u0000\u0000tu\u0005c\u0000\u0000uv\u0005a\u0000\u0000v\u008d"+
		"\u0005o\u0000\u0000wx\u0005s\u0000\u0000x\u008d\u0005e\u0000\u0000yz\u0005"+
		"s\u0000\u0000z{\u0005e\u0000\u0000{|\u0005n\u0000\u0000|}\u0005a\u0000"+
		"\u0000}~\u0005o\u0000\u0000~\u007f\u0005s\u0000\u0000\u007f\u008d\u0005"+
		"e\u0000\u0000\u0080\u0081\u0005s\u0000\u0000\u0081\u0082\u0005e\u0000"+
		"\u0000\u0082\u0083\u0005n\u0000\u0000\u0083\u0084\u0005a\u0000\u0000\u0084"+
		"\u008d\u0005o\u0000\u0000\u0085\u0086\u0005r\u0000\u0000\u0086\u0087\u0005"+
		"e\u0000\u0000\u0087\u0088\u0005t\u0000\u0000\u0088\u0089\u0005o\u0000"+
		"\u0000\u0089\u008a\u0005r\u0000\u0000\u008a\u008b\u0005n\u0000\u0000\u008b"+
		"\u008d\u0005a\u0000\u0000\u008cm\u0001\u0000\u0000\u0000\u008cq\u0001"+
		"\u0000\u0000\u0000\u008cw\u0001\u0000\u0000\u0000\u008cy\u0001\u0000\u0000"+
		"\u0000\u008c\u0080\u0001\u0000\u0000\u0000\u008c\u0085\u0001\u0000\u0000"+
		"\u0000\u008d\u0018\u0001\u0000\u0000\u0000\u008e\u008f\u0005{\u0000\u0000"+
		"\u008f\u001a\u0001\u0000\u0000\u0000\u0090\u0091\u0005}\u0000\u0000\u0091"+
		"\u001c\u0001\u0000\u0000\u0000\u0092\u0093\u0005;\u0000\u0000\u0093\u001e"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0007\u0002\u0000\u0000\u0095 \u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0007\u0003\u0000\u0000\u0097\"\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0007\u0004\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0006\u0011\u0000\u0000\u009b$\u0001\u0000\u0000"+
		"\u0000\n\u00007QY^`bgk\u008c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}