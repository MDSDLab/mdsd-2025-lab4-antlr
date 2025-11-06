package main.validation;

import language.generated.WebtestInputValidationBaseVisitor;
import main.data.WebtestInputTable;

// TODO: semantic analysis
public class WebtestInputSemanticAnalyzer extends WebtestInputValidationBaseVisitor {
    private final WebtestInputValidationErrorHandler errorHandler;
    private final WebtestInputTable inputTable;

    public WebtestInputSemanticAnalyzer(WebtestInputValidationErrorHandler errorHandler, WebtestInputTable inputTable) {
        this.errorHandler = errorHandler;
        this.inputTable = inputTable;
    }
}