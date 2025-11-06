package main.codegen;

import language.generated.WebtestInputValidationBaseVisitor;
import main.data.WebtestInputTable;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

// The common properties of StringTemplate-based code generation are found here
// If you are not working with StringTemplate, feel free to modify this class and the subclasses as well
public abstract class WebtestCodeGenerator extends WebtestInputValidationBaseVisitor {

    protected final STGroupFile groupFile;
    protected final ST template;
    protected final WebtestInputTable inputTable;

    public String generatedCode = "";

    public WebtestCodeGenerator(String stGroupPath, String template, WebtestInputTable inputTable) {
        this.groupFile = new STGroupFile(stGroupPath);
        this.template = groupFile.getInstanceOf(template);
        this.inputTable = inputTable;
    }

    @Override
    public Object visit(ParseTree tree) {
        var result = super.visit(tree);

        generatedCode = template.render();

        return result;
    }
}
