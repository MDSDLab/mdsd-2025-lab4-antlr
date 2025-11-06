package main.codegen;

import main.data.WebtestInputTable;

import java.nio.file.Paths;

// TODO: HTML code generation
public class WebtestHtmlCodeGenerator extends WebtestCodeGenerator {
    public WebtestHtmlCodeGenerator(WebtestInputTable inputTable) {
        super(Paths.get("src", "main", "codegen", "stringtemplate", "HtmlGen.stg").toString(), "html", inputTable);
    }
}
