// Generated from SampleLexer.g4 by ANTLR 4.5.3
package sample.language.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SampleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, FOR=2, TYPE_INT=3, TYPE_FLOAT=4, TYPE_BOOLEAN=5, ASSIGN=6, ADD=7, 
		INCREMENT=8, LT=9, SEMI_COLON=10, LEFT_BRACE=11, RIGHT_BRACE=12, LEFT_PARENTHESIS=13, 
		RIGHT_PARENTHESIS=14, IntegerLiteral=15, FloatingPointLiteral=16, BooleanLiteral=17, 
		Identifier=18, WS=19, NEW_LINE=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"START", "FOR", "TYPE_INT", "TYPE_FLOAT", "TYPE_BOOLEAN", "ASSIGN", "ADD", 
		"INCREMENT", "LT", "SEMI_COLON", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_PARENTHESIS", 
		"RIGHT_PARENTHESIS", "IntegerLiteral", "DecimalNumeral", "Digit", "FloatingPointLiteral", 
		"BooleanLiteral", "Identifier", "Letter", "LetterOrDigit", "WS", "NEW_LINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Start'", "'for'", "'int'", "'float'", "'boolean'", "'='", "'+'", 
		"'++'", "'<'", "';'", "'{'", "'}'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "START", "FOR", "TYPE_INT", "TYPE_FLOAT", "TYPE_BOOLEAN", "ASSIGN", 
		"ADD", "INCREMENT", "LT", "SEMI_COLON", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_PARENTHESIS", 
		"RIGHT_PARENTHESIS", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"Identifier", "WS", "NEW_LINE"
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


	public SampleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SampleLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\6\21f\n\21\r\21\16\21g\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24y\n\24\3\25\3\25\7\25}\n\25\f\25"+
		"\16\25\u0080\13\25\3\26\3\26\3\26\3\26\5\26\u0086\n\26\3\27\3\27\3\27"+
		"\3\27\5\27\u008c\n\27\3\30\6\30\u008f\n\30\r\30\16\30\u0090\3\30\3\30"+
		"\3\31\6\31\u0096\n\31\r\31\16\31\u0097\3\31\3\31\2\2\32\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\2%\22"+
		"\'\23)\24+\2-\2/\25\61\26\3\2\n\3\2\62;\5\2C\\aac|\4\2\2\u0081\ud802\udc01"+
		"\3\2\ud802\udc01\3\2\udc02\ue001\6\2\62;C\\aac|\4\2\13\13\"\"\4\2\f\f"+
		"\16\17\u009f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\59\3"+
		"\2\2\2\7=\3\2\2\2\tA\3\2\2\2\13G\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21S\3"+
		"\2\2\2\23V\3\2\2\2\25X\3\2\2\2\27Z\3\2\2\2\31\\\3\2\2\2\33^\3\2\2\2\35"+
		"`\3\2\2\2\37b\3\2\2\2!e\3\2\2\2#i\3\2\2\2%k\3\2\2\2\'x\3\2\2\2)z\3\2\2"+
		"\2+\u0085\3\2\2\2-\u008b\3\2\2\2/\u008e\3\2\2\2\61\u0095\3\2\2\2\63\64"+
		"\7U\2\2\64\65\7v\2\2\65\66\7c\2\2\66\67\7t\2\2\678\7v\2\28\4\3\2\2\29"+
		":\7h\2\2:;\7q\2\2;<\7t\2\2<\6\3\2\2\2=>\7k\2\2>?\7p\2\2?@\7v\2\2@\b\3"+
		"\2\2\2AB\7h\2\2BC\7n\2\2CD\7q\2\2DE\7c\2\2EF\7v\2\2F\n\3\2\2\2GH\7d\2"+
		"\2HI\7q\2\2IJ\7q\2\2JK\7n\2\2KL\7g\2\2LM\7c\2\2MN\7p\2\2N\f\3\2\2\2OP"+
		"\7?\2\2P\16\3\2\2\2QR\7-\2\2R\20\3\2\2\2ST\7-\2\2TU\7-\2\2U\22\3\2\2\2"+
		"VW\7>\2\2W\24\3\2\2\2XY\7=\2\2Y\26\3\2\2\2Z[\7}\2\2[\30\3\2\2\2\\]\7\177"+
		"\2\2]\32\3\2\2\2^_\7*\2\2_\34\3\2\2\2`a\7+\2\2a\36\3\2\2\2bc\5!\21\2c"+
		" \3\2\2\2df\5#\22\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\"\3\2\2\2"+
		"ij\t\2\2\2j$\3\2\2\2kl\5!\21\2lm\7\60\2\2mn\5!\21\2n&\3\2\2\2op\7v\2\2"+
		"pq\7t\2\2qr\7w\2\2ry\7g\2\2st\7h\2\2tu\7c\2\2uv\7n\2\2vw\7u\2\2wy\7g\2"+
		"\2xo\3\2\2\2xs\3\2\2\2y(\3\2\2\2z~\5+\26\2{}\5-\27\2|{\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177*\3\2\2\2\u0080~\3\2\2\2\u0081\u0086"+
		"\t\3\2\2\u0082\u0086\n\4\2\2\u0083\u0084\t\5\2\2\u0084\u0086\t\6\2\2\u0085"+
		"\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0086,\3\2\2\2"+
		"\u0087\u008c\t\7\2\2\u0088\u008c\n\4\2\2\u0089\u008a\t\5\2\2\u008a\u008c"+
		"\t\6\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		".\3\2\2\2\u008d\u008f\t\b\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2"+
		"\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093"+
		"\b\30\2\2\u0093\60\3\2\2\2\u0094\u0096\t\t\2\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009a\b\31\2\2\u009a\62\3\2\2\2\n\2gx~\u0085\u008b\u0090\u0097"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}