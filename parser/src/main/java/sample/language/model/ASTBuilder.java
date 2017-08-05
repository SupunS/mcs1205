package sample.language.model;

import java.util.Stack;

import sample.language.model.expressions.AddExpression;
import sample.language.model.expressions.BinaryExpression;
import sample.language.model.expressions.BooleanLiteral;
import sample.language.model.expressions.Expression;
import sample.language.model.expressions.FloatLiteral;
import sample.language.model.expressions.IncrementExpression;
import sample.language.model.expressions.IntegerLiteral;
import sample.language.model.expressions.LessThanExpression;
import sample.language.model.expressions.VariableRefExpr;
import sample.language.model.statements.AssignmentStmt;
import sample.language.model.statements.BlockStmt;
import sample.language.model.statements.ForLoopStmt;
import sample.language.model.statements.IncrementStmt;
import sample.language.model.statements.VariableDefStmt;
import sample.language.model.symbols.GlobalScope;
import sample.language.model.symbols.SymbolName;
import sample.language.model.symbols.SymbolScope;
import sample.language.model.types.Types;
import sample.language.model.utils.NodeLocation;

public class ASTBuilder {

    private Stack<BlockStmt> blockStmtStack = new Stack<BlockStmt>();
    private Stack<Expression> expressionStack = new Stack<Expression>();
    private SymbolScope currentScope;

    public ASTBuilder() {
        currentScope = GlobalScope.getInstance();
        Types.loadBuiltInTypes((GlobalScope) currentScope);
    }

    public CompilationUnit build() {
        return new CompilationUnit(blockStmtStack.pop());
    }

    public void startBody(NodeLocation currentLocation) {
        BlockStmt body = new BlockStmt(currentLocation, currentScope);
        blockStmtStack.push(body);
        currentScope = body;
    }

    public void addVariableDefinitionStmt(NodeLocation location, String typeName, String varName,
            boolean exprAvailable) {

        Expression expr = null;
        if (exprAvailable) {
            expr = expressionStack.pop();
        }

        SymbolName varSymbolName = new SymbolName(varName);
        VariableDef varDef = new VariableDef(location, typeName, varSymbolName);
        VariableDefStmt varDefStmt = new VariableDefStmt(location, varDef, expr, currentScope);
        blockStmtStack.peek().addStatement(varDefStmt);
    }

    public void createIntegerLiteral(NodeLocation location, String text) {
        IntegerLiteral intLiteral = new IntegerLiteral(Integer.parseInt(text), location);
        expressionStack.push(intLiteral);
    }

    public void createFloatLiteral(NodeLocation location, String text) {
        FloatLiteral floatLiteral = new FloatLiteral(Float.parseFloat(text), location);
        expressionStack.push(floatLiteral);
    }

    public void createBooleanLiteral(NodeLocation location, String text) {
        BooleanLiteral booleanLiteral = new BooleanLiteral(Boolean.parseBoolean(text), location);
        expressionStack.push(booleanLiteral);
    }

    public void createVarRefExpr(NodeLocation location, String varName) {
        VariableRefExpr simpleVarRefExpr = new VariableRefExpr(location, varName);
        expressionStack.push(simpleVarRefExpr);
    }

    public void createAssignmentStmt(NodeLocation location) {
        Expression rExpr = expressionStack.pop();
        Expression lExpr = expressionStack.pop();
        AssignmentStmt assignStmt = new AssignmentStmt(location, lExpr, rExpr);
        blockStmtStack.peek().addStatement(assignStmt);
    }

    public void createBinaryExpr(NodeLocation location, String operator) {
        Expression rExpr = expressionStack.pop();
        Expression lExpr = expressionStack.pop();

        BinaryExpression expr;
        switch (operator) {
        case "+":
            expr = new AddExpression(location, lExpr, rExpr);
            break;
        case "<":
            expr = new LessThanExpression(location, lExpr, rExpr);
            break;
        default:
            throw new RuntimeException("Unsupported operator: " + operator);
        }

        expressionStack.push(expr);
    }

    public void startForLoop(NodeLocation currentLocation) {
        ForLoopStmt forLoop = new ForLoopStmt(currentLocation, currentScope);
        blockStmtStack.push(forLoop);
        currentScope = forLoop;
    }

    public void exitForLoop() {
        Expression terminateCondition = expressionStack.pop();
        ForLoopStmt forLoop = (ForLoopStmt) blockStmtStack.pop();
        forLoop.setTerminateCondition(terminateCondition);

        blockStmtStack.peek().addStatement(forLoop);
    }

    public void createIncrementExpr(NodeLocation location) {
        Expression varRef = expressionStack.pop();
        IncrementExpression incrementExpr = new IncrementExpression(location, Operator.INCREMENT, varRef);
        expressionStack.push(incrementExpr);

    }

    public void createIncrementStmt(NodeLocation location) {
        IncrementExpression incrementExpr = (IncrementExpression) expressionStack.pop();
        IncrementStmt incrementStmt = new IncrementStmt(location, incrementExpr);
        blockStmtStack.peek().addStatement(incrementStmt);
    }
}
