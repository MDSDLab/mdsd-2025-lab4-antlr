// Generated from E:/Egyetem/Modellalapú Szoftverfejlesztés Labor/webtest-input-validation/kiindulo/mdsd-2023-lab4-antlr/src/language\WebtestInputValidation.g4 by ANTLR 4.10.1
package language.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WebtestInputValidationLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FORM=1, END=2, ID=3, COMMENT=4, LINE_COMMENT=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FORM", "END", "ID", "COMMENT", "LINE_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'form'", "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FORM", "END", "ID", "COMMENT", "LINE_COMMENT", "WS"
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


	public WebtestInputValidationLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WebtestInputValidation.g4"; }

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
		"\u0004\u0000\u0006:\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u0019\b\u0002\n\u0002\f\u0002\u001c"+
		"\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\""+
		"\b\u0003\n\u0003\f\u0003%\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u00040\b\u0004\n\u0004\f\u00043\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001#\u0000\u0006\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\u0001\u0000"+
		"\u0004\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000\n\n\r\r\u0003"+
		"\u0000\t\n\r\r  <\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0001\r\u0001\u0000\u0000\u0000\u0003\u0012\u0001\u0000\u0000"+
		"\u0000\u0005\u0016\u0001\u0000\u0000\u0000\u0007\u001d\u0001\u0000\u0000"+
		"\u0000\t+\u0001\u0000\u0000\u0000\u000b6\u0001\u0000\u0000\u0000\r\u000e"+
		"\u0005f\u0000\u0000\u000e\u000f\u0005o\u0000\u0000\u000f\u0010\u0005r"+
		"\u0000\u0000\u0010\u0011\u0005m\u0000\u0000\u0011\u0002\u0001\u0000\u0000"+
		"\u0000\u0012\u0013\u0005e\u0000\u0000\u0013\u0014\u0005n\u0000\u0000\u0014"+
		"\u0015\u0005d\u0000\u0000\u0015\u0004\u0001\u0000\u0000\u0000\u0016\u001a"+
		"\u0007\u0000\u0000\u0000\u0017\u0019\u0007\u0001\u0000\u0000\u0018\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000\u0000\u001a\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0006"+
		"\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0005/\u0000\u0000\u001e\u001f\u0005*\u0000\u0000\u001f#\u0001\u0000"+
		"\u0000\u0000 \"\t\u0000\u0000\u0000! \u0001\u0000\u0000\u0000\"%\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000"+
		"$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&\'\u0005*\u0000\u0000"+
		"\'(\u0005/\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0006\u0003\u0000\u0000"+
		"*\b\u0001\u0000\u0000\u0000+,\u0005/\u0000\u0000,-\u0005/\u0000\u0000"+
		"-1\u0001\u0000\u0000\u0000.0\b\u0002\u0000\u0000/.\u0001\u0000\u0000\u0000"+
		"03\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u000024\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000045\u0006\u0004"+
		"\u0000\u00005\n\u0001\u0000\u0000\u000067\u0007\u0003\u0000\u000078\u0001"+
		"\u0000\u0000\u000089\u0006\u0005\u0000\u00009\f\u0001\u0000\u0000\u0000"+
		"\u0004\u0000\u001a#1\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}