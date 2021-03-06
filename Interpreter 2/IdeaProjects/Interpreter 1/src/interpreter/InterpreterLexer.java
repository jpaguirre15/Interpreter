// Generated from C:/Users/jpagu/IdeaProjects/Interpreter 1/src\Interpreter.g4 by ANTLR 4.7.2
package interpreter;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InterpreterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ADD=5, SUB=6, MUL=7, DIV=8, MOD=9, ASSIGN=10, 
		ADD_ASSIGN=11, SUB_ASSIGN=12, MUL_ASSIGN=13, DIV_ASSIGN=14, MOD_ASSIGN=15, 
		LPAREN=16, RPAREN=17, EQUIV=18, NOTEQUIV=19, GREAT=20, LESS=21, GREATEQUA=22, 
		LESSEQUA=23, INT=24, FLOAT=25, STRING=26, TRUE=27, FALSE=28, ID=29, SPACE=30, 
		LINEFEED=31, COMMENT=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "ADD", "SUB", "MUL", "DIV", "MOD", "ASSIGN", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"LPAREN", "RPAREN", "EQUIV", "NOTEQUIV", "GREAT", "LESS", "GREATEQUA", 
			"LESSEQUA", "INT", "FLOAT", "STRING", "TRUE", "FALSE", "ID", "SPACE", 
			"LINEFEED", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IF'", "'end condition'", "'if'", "'make'", null, null, null, 
			null, null, "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "ADD", "SUB", "MUL", "DIV", "MOD", "ASSIGN", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"LPAREN", "RPAREN", "EQUIV", "NOTEQUIV", "GREAT", "LESS", "GREATEQUA", 
			"LESSEQUA", "INT", "FLOAT", "STRING", "TRUE", "FALSE", "ID", "SPACE", 
			"LINEFEED", "COMMENT"
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


	public InterpreterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Interpreter.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u014c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6b\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\br\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\n\5\n\u0081\n\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u009c\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00a6\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00b8\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00c7"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00e0\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u00f6\n\30\3\31\6\31\u00f9\n\31\r\31\16"+
		"\31\u00fa\3\32\7\32\u00fe\n\32\f\32\16\32\u0101\13\32\3\32\3\32\6\32\u0105"+
		"\n\32\r\32\16\32\u0106\3\33\3\33\3\33\3\33\7\33\u010d\n\33\f\33\16\33"+
		"\u0110\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u011f\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u012e\n\35\3\36\3\36\7\36\u0132\n\36\f\36\16"+
		"\36\u0135\13\36\3\37\6\37\u0138\n\37\r\37\16\37\u0139\3\37\3\37\3 \5 "+
		"\u013f\n \3 \3 \3!\3!\3!\3!\6!\u0147\n!\r!\16!\u0148\3!\3!\2\2\"\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"\3\2\7\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17\"\"\4\2\f\f\17"+
		"\17\2\u0161\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5F\3\2\2\2"+
		"\7T\3\2\2\2\tW\3\2\2\2\13a\3\2\2\2\ri\3\2\2\2\17q\3\2\2\2\21z\3\2\2\2"+
		"\23\u0080\3\2\2\2\25\u0082\3\2\2\2\27\u0084\3\2\2\2\31\u0087\3\2\2\2\33"+
		"\u008a\3\2\2\2\35\u008d\3\2\2\2\37\u0090\3\2\2\2!\u0093\3\2\2\2#\u0095"+
		"\3\2\2\2%\u009b\3\2\2\2\'\u00a5\3\2\2\2)\u00b7\3\2\2\2+\u00c6\3\2\2\2"+
		"-\u00df\3\2\2\2/\u00f5\3\2\2\2\61\u00f8\3\2\2\2\63\u00ff\3\2\2\2\65\u0108"+
		"\3\2\2\2\67\u011e\3\2\2\29\u012d\3\2\2\2;\u012f\3\2\2\2=\u0137\3\2\2\2"+
		"?\u013e\3\2\2\2A\u0142\3\2\2\2CD\7K\2\2DE\7H\2\2E\4\3\2\2\2FG\7g\2\2G"+
		"H\7p\2\2HI\7f\2\2IJ\7\"\2\2JK\7e\2\2KL\7q\2\2LM\7p\2\2MN\7f\2\2NO\7k\2"+
		"\2OP\7v\2\2PQ\7k\2\2QR\7q\2\2RS\7p\2\2S\6\3\2\2\2TU\7k\2\2UV\7h\2\2V\b"+
		"\3\2\2\2WX\7o\2\2XY\7c\2\2YZ\7m\2\2Z[\7g\2\2[\n\3\2\2\2\\b\7-\2\2]^\7"+
		"R\2\2^_\7N\2\2_`\7W\2\2`b\7U\2\2a\\\3\2\2\2a]\3\2\2\2b\f\3\2\2\2cj\7/"+
		"\2\2de\7O\2\2ef\7K\2\2fg\7P\2\2gh\7W\2\2hj\7U\2\2ic\3\2\2\2id\3\2\2\2"+
		"j\16\3\2\2\2kr\7,\2\2lm\7V\2\2mn\7K\2\2no\7O\2\2op\7G\2\2pr\7U\2\2qk\3"+
		"\2\2\2ql\3\2\2\2r\20\3\2\2\2s{\7\61\2\2tu\7F\2\2uv\7K\2\2vw\7X\2\2wx\7"+
		"K\2\2xy\7F\2\2y{\7G\2\2zs\3\2\2\2zt\3\2\2\2{\22\3\2\2\2|\u0081\7\'\2\2"+
		"}~\7O\2\2~\177\7Q\2\2\177\u0081\7F\2\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0081"+
		"\24\3\2\2\2\u0082\u0083\7?\2\2\u0083\26\3\2\2\2\u0084\u0085\7-\2\2\u0085"+
		"\u0086\7?\2\2\u0086\30\3\2\2\2\u0087\u0088\7/\2\2\u0088\u0089\7?\2\2\u0089"+
		"\32\3\2\2\2\u008a\u008b\7,\2\2\u008b\u008c\7?\2\2\u008c\34\3\2\2\2\u008d"+
		"\u008e\7\61\2\2\u008e\u008f\7?\2\2\u008f\36\3\2\2\2\u0090\u0091\7\'\2"+
		"\2\u0091\u0092\7?\2\2\u0092 \3\2\2\2\u0093\u0094\7*\2\2\u0094\"\3\2\2"+
		"\2\u0095\u0096\7+\2\2\u0096$\3\2\2\2\u0097\u0098\7?\2\2\u0098\u009c\7"+
		"?\2\2\u0099\u009a\7K\2\2\u009a\u009c\7U\2\2\u009b\u0097\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c&\3\2\2\2\u009d\u009e\7#\2\2\u009e\u00a6\7?\2\2\u009f"+
		"\u00a0\7K\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a2\7\"\2\2\u00a2\u00a3\7P\2"+
		"\2\u00a3\u00a4\7Q\2\2\u00a4\u00a6\7V\2\2\u00a5\u009d\3\2\2\2\u00a5\u009f"+
		"\3\2\2\2\u00a6(\3\2\2\2\u00a7\u00b8\7@\2\2\u00a8\u00a9\7K\2\2\u00a9\u00aa"+
		"\7U\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7I\2\2\u00ac\u00ad\7T\2\2\u00ad"+
		"\u00ae\7G\2\2\u00ae\u00af\7C\2\2\u00af\u00b0\7V\2\2\u00b0\u00b1\7G\2\2"+
		"\u00b1\u00b2\7T\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\7V\2\2\u00b4\u00b5"+
		"\7J\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b8\7P\2\2\u00b7\u00a7\3\2\2\2\u00b7"+
		"\u00a8\3\2\2\2\u00b8*\3\2\2\2\u00b9\u00c7\7>\2\2\u00ba\u00bb\7K\2\2\u00bb"+
		"\u00bc\7U\2\2\u00bc\u00bd\7\"\2\2\u00bd\u00be\7N\2\2\u00be\u00bf\7G\2"+
		"\2\u00bf\u00c0\7U\2\2\u00c0\u00c1\7U\2\2\u00c1\u00c2\7\"\2\2\u00c2\u00c3"+
		"\7V\2\2\u00c3\u00c4\7J\2\2\u00c4\u00c5\7C\2\2\u00c5\u00c7\7P\2\2\u00c6"+
		"\u00b9\3\2\2\2\u00c6\u00ba\3\2\2\2\u00c7,\3\2\2\2\u00c8\u00c9\7@\2\2\u00c9"+
		"\u00e0\7?\2\2\u00ca\u00cb\7K\2\2\u00cb\u00cc\7U\2\2\u00cc\u00cd\7\"\2"+
		"\2\u00cd\u00ce\7I\2\2\u00ce\u00cf\7T\2\2\u00cf\u00d0\7G\2\2\u00d0\u00d1"+
		"\7C\2\2\u00d1\u00d2\7V\2\2\u00d2\u00d3\7G\2\2\u00d3\u00d4\7T\2\2\u00d4"+
		"\u00d5\7\"\2\2\u00d5\u00d6\7V\2\2\u00d6\u00d7\7J\2\2\u00d7\u00d8\7C\2"+
		"\2\u00d8\u00d9\7P\2\2\u00d9\u00da\7\"\2\2\u00da\u00db\7Q\2\2\u00db\u00dc"+
		"\7T\2\2\u00dc\u00dd\7\"\2\2\u00dd\u00de\7K\2\2\u00de\u00e0\7U\2\2\u00df"+
		"\u00c8\3\2\2\2\u00df\u00ca\3\2\2\2\u00e0.\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2"+
		"\u00f6\7?\2\2\u00e3\u00e4\7K\2\2\u00e4\u00e5\7U\2\2\u00e5\u00e6\7\"\2"+
		"\2\u00e6\u00e7\7N\2\2\u00e7\u00e8\7G\2\2\u00e8\u00e9\7U\2\2\u00e9\u00ea"+
		"\7U\2\2\u00ea\u00eb\7\"\2\2\u00eb\u00ec\7V\2\2\u00ec\u00ed\7J\2\2\u00ed"+
		"\u00ee\7C\2\2\u00ee\u00ef\7P\2\2\u00ef\u00f0\7\"\2\2\u00f0\u00f1\7Q\2"+
		"\2\u00f1\u00f2\7T\2\2\u00f2\u00f3\7\"\2\2\u00f3\u00f4\7K\2\2\u00f4\u00f6"+
		"\7U\2\2\u00f5\u00e1\3\2\2\2\u00f5\u00e3\3\2\2\2\u00f6\60\3\2\2\2\u00f7"+
		"\u00f9\4\62;\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\62\3\2\2\2\u00fc\u00fe\4\62;\2\u00fd\u00fc"+
		"\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\7\60\2\2\u0103\u0105\4"+
		"\62;\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\64\3\2\2\2\u0108\u010e\7$\2\2\u0109\u010a\7)\2\2"+
		"\u010a\u010d\7$\2\2\u010b\u010d\n\2\2\2\u010c\u0109\3\2\2\2\u010c\u010b"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7$\2\2\u0112\66\3\2\2\2"+
		"\u0113\u0114\7v\2\2\u0114\u0115\7t\2\2\u0115\u0116\7w\2\2\u0116\u011f"+
		"\7g\2\2\u0117\u0118\7K\2\2\u0118\u0119\7U\2\2\u0119\u011a\7\"\2\2\u011a"+
		"\u011b\7V\2\2\u011b\u011c\7T\2\2\u011c\u011d\7W\2\2\u011d\u011f\7G\2\2"+
		"\u011e\u0113\3\2\2\2\u011e\u0117\3\2\2\2\u011f8\3\2\2\2\u0120\u0121\7"+
		"h\2\2\u0121\u0122\7c\2\2\u0122\u0123\7n\2\2\u0123\u0124\7u\2\2\u0124\u012e"+
		"\7g\2\2\u0125\u0126\7K\2\2\u0126\u0127\7U\2\2\u0127\u0128\7\"\2\2\u0128"+
		"\u0129\7H\2\2\u0129\u012a\7C\2\2\u012a\u012b\7N\2\2\u012b\u012c\7U\2\2"+
		"\u012c\u012e\7G\2\2\u012d\u0120\3\2\2\2\u012d\u0125\3\2\2\2\u012e:\3\2"+
		"\2\2\u012f\u0133\t\3\2\2\u0130\u0132\t\4\2\2\u0131\u0130\3\2\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134<\3\2\2\2"+
		"\u0135\u0133\3\2\2\2\u0136\u0138\t\5\2\2\u0137\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\b\37\2\2\u013c>\3\2\2\2\u013d\u013f\7\17\2\2\u013e\u013d\3\2\2"+
		"\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\f\2\2\u0141@"+
		"\3\2\2\2\u0142\u0143\7\61\2\2\u0143\u0144\7\61\2\2\u0144\u0146\3\2\2\2"+
		"\u0145\u0147\n\6\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b!\2\2\u014b"+
		"B\3\2\2\2\31\2aiqz\u0080\u009b\u00a5\u00b7\u00c6\u00df\u00f5\u00fa\u00ff"+
		"\u0106\u010c\u010e\u011e\u012d\u0133\u0139\u013e\u0148\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}