package main.codegen;

import main.data.WebtestInputTable;

import java.nio.file.Paths;

// TODO: JS code generation
public class WebtestJsCodeGenerator extends WebtestCodeGenerator {
    public WebtestJsCodeGenerator(WebtestInputTable inputTable) {
        super(Paths.get("src", "main", "codegen", "stringtemplate", "JsGen.stg").toString(), "js", inputTable);
    }
}
