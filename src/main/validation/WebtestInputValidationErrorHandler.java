package main.validation;

import main.data.WebtestInputValidationError;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

// It is recommended to collect errors found during input table building and semantic analysis here
public class WebtestInputValidationErrorHandler extends BaseErrorListener {
    private final ArrayList<WebtestInputValidationError> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);

        errors.add(new WebtestInputValidationError(line, charPositionInLine, msg));
    }

    public List<WebtestInputValidationError> getErrors() {
        return errors;
    }

    public void addError(WebtestInputValidationError error) {
        errors.add(error);
    }

    public boolean isValid() {
        return errors.isEmpty();
    }
}
