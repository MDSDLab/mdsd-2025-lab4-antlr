package main;

import language.generated.WebtestInputValidationBaseVisitor;
import main.data.WebtestInputTable;
import main.validation.WebtestInputValidationErrorHandler;

// TODO: build the structure of inputs
public class WebtestInputTableBuilder extends WebtestInputValidationBaseVisitor {
    private final WebtestInputValidationErrorHandler errorHandler;
    private final WebtestInputTable inputTable = new WebtestInputTable();

    public WebtestInputTableBuilder(WebtestInputValidationErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }
    public WebtestInputTable getInputTable() {
        return inputTable;
    }
}
