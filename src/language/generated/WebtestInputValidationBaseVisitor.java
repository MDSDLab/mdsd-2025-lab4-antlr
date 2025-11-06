// Generated from E:/Egyetem/Modellalapú Szoftverfejlesztés Labor/webtest-input-validation/kiindulo/mdsd-2023-lab4-antlr/src/language\WebtestInputValidation.g4 by ANTLR 4.10.1
package language.generated;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link WebtestInputValidationVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class WebtestInputValidationBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements WebtestInputValidationVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWebtestInput(WebtestInputValidationParser.WebtestInputContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFormDefinition(WebtestInputValidationParser.FormDefinitionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFormID(WebtestInputValidationParser.FormIDContext ctx) { return visitChildren(ctx); }
}