// Generated from E:/Egyetem/Modellalapú Szoftverfejlesztés Labor/webtest-input-validation/kiindulo/mdsd-2023-lab4-antlr/src/language\WebtestInputValidation.g4 by ANTLR 4.10.1
package language.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WebtestInputValidationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FORM=1, END=2, ID=3, COMMENT=4, LINE_COMMENT=5, WS=6;
	public static final int
		RULE_webtestInput = 0, RULE_formDefinition = 1, RULE_formID = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"webtestInput", "formDefinition", "formID"
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

	@Override
	public String getGrammarFileName() { return "WebtestInputValidation.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WebtestInputValidationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class WebtestInputContext extends ParserRuleContext {
		public FormDefinitionContext formDefinition() {
			return getRuleContext(FormDefinitionContext.class,0);
		}
		public WebtestInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_webtestInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebtestInputValidationListener ) ((WebtestInputValidationListener)listener).enterWebtestInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebtestInputValidationListener ) ((WebtestInputValidationListener)listener).exitWebtestInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebtestInputValidationVisitor ) return ((WebtestInputValidationVisitor<? extends T>)visitor).visitWebtestInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WebtestInputContext webtestInput() throws RecognitionException {
		WebtestInputContext _localctx = new WebtestInputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_webtestInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			formDefinition();
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

	public static class FormDefinitionContext extends ParserRuleContext {
		public TerminalNode FORM() { return getToken(WebtestInputValidationParser.FORM, 0); }
		public FormIDContext formID() {
			return getRuleContext(FormIDContext.class,0);
		}
		public TerminalNode END() { return getToken(WebtestInputValidationParser.END, 0); }
		public FormDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebtestInputValidationListener ) ((WebtestInputValidationListener)listener).enterFormDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebtestInputValidationListener ) ((WebtestInputValidationListener)listener).exitFormDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebtestInputValidationVisitor ) return ((WebtestInputValidationVisitor<? extends T>)visitor).visitFormDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormDefinitionContext formDefinition() throws RecognitionException {
		FormDefinitionContext _localctx = new FormDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_formDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(FORM);
			setState(9);
			formID();
			setState(10);
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

	public static class FormIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WebtestInputValidationParser.ID, 0); }
		public FormIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebtestInputValidationListener ) ((WebtestInputValidationListener)listener).enterFormID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebtestInputValidationListener ) ((WebtestInputValidationListener)listener).exitFormID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebtestInputValidationVisitor ) return ((WebtestInputValidationVisitor<? extends T>)visitor).visitFormID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormIDContext formID() throws RecognitionException {
		FormIDContext _localctx = new FormIDContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(ID);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0006\u000f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0000\u0000"+
		"\u0003\u0000\u0002\u0004\u0000\u0000\u000b\u0000\u0006\u0001\u0000\u0000"+
		"\u0000\u0002\b\u0001\u0000\u0000\u0000\u0004\f\u0001\u0000\u0000\u0000"+
		"\u0006\u0007\u0003\u0002\u0001\u0000\u0007\u0001\u0001\u0000\u0000\u0000"+
		"\b\t\u0005\u0001\u0000\u0000\t\n\u0003\u0004\u0002\u0000\n\u000b\u0005"+
		"\u0002\u0000\u0000\u000b\u0003\u0001\u0000\u0000\u0000\f\r\u0005\u0003"+
		"\u0000\u0000\r\u0005\u0001\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}