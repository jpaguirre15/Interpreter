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
		FLOAT=1, BOOL=2, ADD=3, SUB=4, MUL=5, DIV=6, LPAREN=7, RPAREN=8, TRUE=9, 
		FALSE=10, SPC=11, COMMENT=12, DOT=13, INT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FLOAT", "BOOL", "ADD", "SUB", "MUL", "DIV", "LPAREN", "RPAREN", "TRUE", 
			"FALSE", "SPC", "COMMENT", "DOT", "INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'yay'", 
			"'nay'", null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FLOAT", "BOOL", "ADD", "SUB", "MUL", "DIV", "LPAREN", "RPAREN", 
			"TRUE", "FALSE", "SPC", "COMMENT", "DOT", "INT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20T\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2(\n\2\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\6\17Q\n\17\r\17\16\17R\2\2\20\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2"+
		"\4\5\2\f\f\17\17\"\"\4\2\f\f\17\17\2X\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\3\'\3\2\2\2\5,\3\2\2\2\7.\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r"+
		"\64\3\2\2\2\17\66\3\2\2\2\218\3\2\2\2\23:\3\2\2\2\25>\3\2\2\2\27B\3\2"+
		"\2\2\31F\3\2\2\2\33M\3\2\2\2\35P\3\2\2\2\37(\3\2\2\2 !\5\35\17\2!\"\5"+
		"\33\16\2\"#\5\35\17\2#(\3\2\2\2$%\5\33\16\2%&\5\35\17\2&(\3\2\2\2\'\37"+
		"\3\2\2\2\' \3\2\2\2\'$\3\2\2\2(\4\3\2\2\2)-\3\2\2\2*-\5\23\n\2+-\5\25"+
		"\13\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\6\3\2\2\2./\7-\2\2/\b\3\2\2\2\60"+
		"\61\7/\2\2\61\n\3\2\2\2\62\63\7,\2\2\63\f\3\2\2\2\64\65\7\61\2\2\65\16"+
		"\3\2\2\2\66\67\7*\2\2\67\20\3\2\2\289\7+\2\29\22\3\2\2\2:;\7{\2\2;<\7"+
		"c\2\2<=\7{\2\2=\24\3\2\2\2>?\7p\2\2?@\7c\2\2@A\7{\2\2A\26\3\2\2\2BC\t"+
		"\2\2\2CD\3\2\2\2DE\b\f\2\2E\30\3\2\2\2FG\7\61\2\2GH\7\61\2\2HI\3\2\2\2"+
		"IJ\n\3\2\2JK\3\2\2\2KL\b\r\2\2L\32\3\2\2\2MN\7\60\2\2N\34\3\2\2\2OQ\4"+
		"\62;\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\36\3\2\2\2\6\2\',R\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}