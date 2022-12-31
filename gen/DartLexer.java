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
public class DartLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LP=1, RP=2, COLON=3, OA=4, CA=5, SCAFFOLD=6, ROW=7, CENTER=8, COLUMN=9, 
		CHILDREN=10, BODY=11, CHILD=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LP", "RP", "COLON", "OA", "CA", "SCAFFOLD", "ROW", "CENTER", "COLUMN", 
			"CHILDREN", "BODY", "CHILD", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "'['", "']'", "'Scaffold'", "'Row'", "'Center'", 
			"'Column'", "'children'", "'body'", "'child'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LP", "RP", "COLON", "OA", "CA", "SCAFFOLD", "ROW", "CENTER", "COLUMN", 
			"CHILDREN", "BODY", "CHILD", "WS"
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


	public DartLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DartLexer.g4"; }

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
		"\u0004\u0000\r[\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004"+
		"\fV\b\f\u000b\f\f\fW\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000\u0001\u0003\u0000\t\n\r\r "+
		" [\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003\u001d"+
		"\u0001\u0000\u0000\u0000\u0005\u001f\u0001\u0000\u0000\u0000\u0007!\u0001"+
		"\u0000\u0000\u0000\t#\u0001\u0000\u0000\u0000\u000b%\u0001\u0000\u0000"+
		"\u0000\r.\u0001\u0000\u0000\u0000\u000f2\u0001\u0000\u0000\u0000\u0011"+
		"9\u0001\u0000\u0000\u0000\u0013@\u0001\u0000\u0000\u0000\u0015I\u0001"+
		"\u0000\u0000\u0000\u0017N\u0001\u0000\u0000\u0000\u0019U\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0005(\u0000\u0000\u001c\u0002\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005)\u0000\u0000\u001e\u0004\u0001\u0000\u0000\u0000\u001f"+
		" \u0005:\u0000\u0000 \u0006\u0001\u0000\u0000\u0000!\"\u0005[\u0000\u0000"+
		"\"\b\u0001\u0000\u0000\u0000#$\u0005]\u0000\u0000$\n\u0001\u0000\u0000"+
		"\u0000%&\u0005S\u0000\u0000&\'\u0005c\u0000\u0000\'(\u0005a\u0000\u0000"+
		"()\u0005f\u0000\u0000)*\u0005f\u0000\u0000*+\u0005o\u0000\u0000+,\u0005"+
		"l\u0000\u0000,-\u0005d\u0000\u0000-\f\u0001\u0000\u0000\u0000./\u0005"+
		"R\u0000\u0000/0\u0005o\u0000\u000001\u0005w\u0000\u00001\u000e\u0001\u0000"+
		"\u0000\u000023\u0005C\u0000\u000034\u0005e\u0000\u000045\u0005n\u0000"+
		"\u000056\u0005t\u0000\u000067\u0005e\u0000\u000078\u0005r\u0000\u0000"+
		"8\u0010\u0001\u0000\u0000\u00009:\u0005C\u0000\u0000:;\u0005o\u0000\u0000"+
		";<\u0005l\u0000\u0000<=\u0005u\u0000\u0000=>\u0005m\u0000\u0000>?\u0005"+
		"n\u0000\u0000?\u0012\u0001\u0000\u0000\u0000@A\u0005c\u0000\u0000AB\u0005"+
		"h\u0000\u0000BC\u0005i\u0000\u0000CD\u0005l\u0000\u0000DE\u0005d\u0000"+
		"\u0000EF\u0005r\u0000\u0000FG\u0005e\u0000\u0000GH\u0005n\u0000\u0000"+
		"H\u0014\u0001\u0000\u0000\u0000IJ\u0005b\u0000\u0000JK\u0005o\u0000\u0000"+
		"KL\u0005d\u0000\u0000LM\u0005y\u0000\u0000M\u0016\u0001\u0000\u0000\u0000"+
		"NO\u0005c\u0000\u0000OP\u0005h\u0000\u0000PQ\u0005i\u0000\u0000QR\u0005"+
		"l\u0000\u0000RS\u0005d\u0000\u0000S\u0018\u0001\u0000\u0000\u0000TV\u0007"+
		"\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000YZ\u0006\f\u0000\u0000Z\u001a\u0001\u0000\u0000\u0000\u0002\u0000"+
		"W\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}