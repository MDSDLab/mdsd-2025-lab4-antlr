// Generated from E:/Egyetem/Modellalapú Szoftverfejlesztés Labor/webtest-input-validation/kiindulo/mdsd-2023-lab4-antlr/src/language\WebtestInputValidation.g4 by ANTLR 4.10.1
package language.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WebtestInputValidationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WebtestInputValidationVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WebtestInputValidationParser#webtestInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWebtestInput(WebtestInputValidationParser.WebtestInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebtestInputValidationParser#formDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormDefinition(WebtestInputValidationParser.FormDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebtestInputValidationParser#formID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormID(WebtestInputValidationParser.FormIDContext ctx);
}