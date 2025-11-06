// Generated from E:/Egyetem/Modellalapú Szoftverfejlesztés Labor/webtest-input-validation/kiindulo/mdsd-2023-lab4-antlr/src/language\WebtestInputValidation.g4 by ANTLR 4.10.1
package language.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WebtestInputValidationParser}.
 */
public interface WebtestInputValidationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WebtestInputValidationParser#webtestInput}.
	 * @param ctx the parse tree
	 */
	void enterWebtestInput(WebtestInputValidationParser.WebtestInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebtestInputValidationParser#webtestInput}.
	 * @param ctx the parse tree
	 */
	void exitWebtestInput(WebtestInputValidationParser.WebtestInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebtestInputValidationParser#formDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFormDefinition(WebtestInputValidationParser.FormDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebtestInputValidationParser#formDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFormDefinition(WebtestInputValidationParser.FormDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebtestInputValidationParser#formID}.
	 * @param ctx the parse tree
	 */
	void enterFormID(WebtestInputValidationParser.FormIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebtestInputValidationParser#formID}.
	 * @param ctx the parse tree
	 */
	void exitFormID(WebtestInputValidationParser.FormIDContext ctx);
}