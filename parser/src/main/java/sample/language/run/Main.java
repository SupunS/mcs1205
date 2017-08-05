package sample.language.run;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import sample.language.model.ASTBuilder;
import sample.language.model.CompilationUnit;
import sample.language.model.SemanticAnalyzer;
import sample.language.parser.ParserErrorStrategy;
import sample.language.parser.ParserListnerImpl;
import sample.language.parser.SampleLexer;
import sample.language.parser.SampleParser;

public class Main {

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.err.println("Not enough arguments: Pass the file name as the first argument");
            return;
        } else if (args.length > 1) {
            System.err.println("Too many arguments: " + args.length);
            return;
        }

        System.out.println("Parsing started..");
        try {
            String sourceFileName = args[0];
            Path sourceFilePath = Paths.get(sourceFileName);
            FileInputStream inputStream = new FileInputStream(new File(sourceFileName));
            ANTLRInputStream antlrInputStream = new ANTLRInputStream(inputStream);

            // Setting the name of the source file being parsed, to the ANTLR
            // input stream. This is required by the parser-error strategy.
            antlrInputStream.name = sourceFilePath.toString();

            SampleLexer lexer = new SampleLexer(antlrInputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            SampleParser parser = new SampleParser(tokenStream);
            parser.setErrorHandler(new ParserErrorStrategy());

            // Build and the AST and get the compilation unit of the program
            ASTBuilder astBuilder = new ASTBuilder();
            ParserListnerImpl parserListener = new ParserListnerImpl(astBuilder);
            parser.addParseListener(parserListener);
            parser.compilationUnit();
            CompilationUnit compilationUnit = astBuilder.build();

            // Do semantic analyzing on the compilation unit
            SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();
            compilationUnit.accept(semanticAnalyzer);

            System.out.println("Parsing successful. No errors found.");
        } catch (Exception e) {
            System.err.println("Parsing failed: " + e.getMessage());
        }
    }
}
