package main;

import language.generated.WebtestInputValidationLexer;
import language.generated.WebtestInputValidationParser;
import main.codegen.WebtestHtmlCodeGenerator;
import main.codegen.WebtestJsCodeGenerator;
import main.validation.WebtestInputValidationErrorHandler;
import main.validation.WebtestInputSemanticAnalyzer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class WebtestInputRunner {
    private static final WebtestInputValidationErrorHandler errorHandler = new WebtestInputValidationErrorHandler();
    private static final Path inputPath = Paths.get("src","input", "PersonForm.wtiv");
    private static final Path outputHtmlPath = Paths.get("src","output", "PersonForm.html");
    private static final Path outputJSPath = Paths.get("src","output", "validation.js");

    public static WebtestInputValidationParser.WebtestInputContext parseWebtestInput(String source) {
        var lexer = new WebtestInputValidationLexer(CharStreams.fromString(source));
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorHandler);
        var parser = new WebtestInputValidationParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(errorHandler);

        return parser.webtestInput();
    }

    public static void main(String[] args) throws IOException {
        var input = Files.readString(inputPath);
        var tree = parseWebtestInput(input);

        var inputTableBuilder = new WebtestInputTableBuilder(errorHandler);
        inputTableBuilder.visit(tree);
        var inputTable = inputTableBuilder.getInputTable();

        var semanticAnalyzer = new WebtestInputSemanticAnalyzer(errorHandler, inputTable);
        semanticAnalyzer.visit(tree);

        if (errorHandler.isValid()) {
            System.out.println("***** Input is valid *****");

            var htmlGenerator = new WebtestHtmlCodeGenerator(inputTable);
            htmlGenerator.visit(tree);
            Files.write(outputHtmlPath, htmlGenerator.generatedCode.getBytes());

            var jsGenerator = new WebtestJsCodeGenerator(inputTable);
            jsGenerator.visit(tree);
            Files.write(outputJSPath, jsGenerator.generatedCode.getBytes());
        }
        else {
            System.out.println("***** Input has errors *****");

            for (var error : errorHandler.getErrors()) {
                System.out.println(error);
            }
        }

    }
}
