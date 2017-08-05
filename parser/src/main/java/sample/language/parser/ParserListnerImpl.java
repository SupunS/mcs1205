package sample.language.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import sample.language.model.ASTBuilder;
import sample.language.model.utils.NodeLocation;
import sample.language.parser.SampleParser.AssignmentStatementContext;
import sample.language.parser.SampleParser.BinaryAddExpressionContext;
import sample.language.parser.SampleParser.BinaryCompareExpressionContext;
import sample.language.parser.SampleParser.BodyContext;
import sample.language.parser.SampleParser.CompilationUnitContext;
import sample.language.parser.SampleParser.ForLoopStatementContext;
import sample.language.parser.SampleParser.IncrementExprContext;
import sample.language.parser.SampleParser.SimpleLiteralContext;
import sample.language.parser.SampleParser.VariableDefinitionStatementContext;
import sample.language.parser.SampleParser.VariableReferenceContext;

public class ParserListnerImpl extends SampleParserBaseListener {

    private ASTBuilder modelBuilder;

    public ParserListnerImpl(ASTBuilder modelBuilder) {
        this.modelBuilder = modelBuilder;
    }

    @Override
    public void enterCompilationUnit(CompilationUnitContext ctx) {
        // do nothing
    }

    @Override
    public void exitCompilationUnit(CompilationUnitContext ctx) {
        // do nothing
    }

    @Override
    public void enterBody(BodyContext ctx) {
        modelBuilder.startBody(getCurrentLocation(ctx));
    }

    @Override
    public void exitBody(BodyContext ctx) {
        // do nothing
    }

    @Override
    public void exitVariableDefinitionStatement(VariableDefinitionStatementContext ctx) {
        if (ctx.exception != null) {
            return;
        }

        String varName = ctx.Identifier().getText();
        String typeName = ctx.typeName().getText();
        boolean exprAvailable = ctx.expression() != null;
        modelBuilder.addVariableDefinitionStmt(getCurrentLocation(ctx), typeName, varName, exprAvailable);
    }

    @Override
    public void exitAssignmentStatement(AssignmentStatementContext ctx) {
        if (ctx.exception != null) {
            return;
        }
        modelBuilder.createAssignmentStmt(getCurrentLocation(ctx));
    }

    @Override
    public void exitIncrementStatement(SampleParser.IncrementStatementContext ctx) {
        if (ctx.exception != null) {
            return;
        }
        modelBuilder.createIncrementStmt(getCurrentLocation(ctx));
    }

    @Override
    public void enterForLoopStatement(SampleParser.ForLoopStatementContext ctx) {
        if (ctx.exception != null) {
            return;
        }
        NodeLocation currentLocation = getCurrentLocation(ctx);
        modelBuilder.startForLoop(currentLocation);
    }

    @Override
    public void exitForLoopStatement(ForLoopStatementContext ctx) {
        if (ctx.exception != null) {
            return;
        }
        modelBuilder.exitForLoop();
    }

    @Override
    public void exitIncrementExpr(IncrementExprContext ctx) {
        if (ctx.exception != null) {
            return;
        }
        modelBuilder.createIncrementExpr(getCurrentLocation(ctx));

    }

    @Override
    public void exitVariableReference(VariableReferenceContext ctx) {
        if (ctx.exception != null) {
            return;
        }
        NodeLocation currentLocation = getCurrentLocation(ctx);
        modelBuilder.createVarRefExpr(currentLocation, ctx.Identifier().getText());

    }

    @Override
    public void exitBinaryCompareExpression(BinaryCompareExpressionContext ctx) {
        String operatorStr = ctx.getChild(1).getText();
        modelBuilder.createBinaryExpr(getCurrentLocation(ctx), operatorStr);
    }

    @Override
    public void exitBinaryAddExpression(BinaryAddExpressionContext ctx) {
        String operatorStr = ctx.getChild(1).getText();
        modelBuilder.createBinaryExpr(getCurrentLocation(ctx), operatorStr);
    }

    @Override
    public void exitSimpleLiteral(SimpleLiteralContext ctx) {
        TerminalNode integerLiteral = ctx.IntegerLiteral();
        if (integerLiteral != null) {
            modelBuilder.createIntegerLiteral(getCurrentLocation(ctx), integerLiteral.getText());
            return;
        }

        TerminalNode floatLiteral = ctx.FloatingPointLiteral();
        if (floatLiteral != null) {
            modelBuilder.createFloatLiteral(getCurrentLocation(ctx), floatLiteral.getText());
            return;
        }

        TerminalNode booleanLiteral = ctx.BooleanLiteral();
        if (booleanLiteral != null) {
            modelBuilder.createBooleanLiteral(getCurrentLocation(ctx), booleanLiteral.getText());
        }
    }

    protected NodeLocation getCurrentLocation(ParserRuleContext ctx) {
        String fileName = ctx.getStart().getInputStream().getSourceName();
        int lineNo = ctx.getStart().getLine();
        return new NodeLocation(fileName, lineNo);
    }
}
