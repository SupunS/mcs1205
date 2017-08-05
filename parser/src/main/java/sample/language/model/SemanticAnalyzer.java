package sample.language.model;

import java.text.MessageFormat;

import sample.language.model.exceptions.ErrorMessages;
import sample.language.model.exceptions.SemanticException;
import sample.language.model.expressions.AddExpression;
import sample.language.model.expressions.BooleanLiteral;
import sample.language.model.expressions.Expression;
import sample.language.model.expressions.FloatLiteral;
import sample.language.model.expressions.IncrementExpression;
import sample.language.model.expressions.IntegerLiteral;
import sample.language.model.expressions.LessThanExpression;
import sample.language.model.expressions.UnaryExpression;
import sample.language.model.expressions.VariableRefExpr;
import sample.language.model.node.NodeVisitor;
import sample.language.model.statements.AssignmentStmt;
import sample.language.model.statements.BlockStmt;
import sample.language.model.statements.ForLoopStmt;
import sample.language.model.statements.IncrementStmt;
import sample.language.model.statements.Statement;
import sample.language.model.statements.VariableDefStmt;
import sample.language.model.symbols.GlobalScope;
import sample.language.model.symbols.Symbol;
import sample.language.model.symbols.SymbolName;
import sample.language.model.symbols.SymbolScope;
import sample.language.model.types.Type;
import sample.language.model.types.Types;
import sample.language.model.utils.NodeLocation;

public class SemanticAnalyzer implements NodeVisitor {

    private SymbolScope currentScope;

    public SemanticAnalyzer() {
        currentScope = GlobalScope.getInstance();
    }

    @Override
    public void visit(CompilationUnit compilationUnit) throws Exception {
        compilationUnit.getStart().accept(this);
    }

    @Override
    public void visit(BlockStmt blockStatement) throws Exception {
        openScope(blockStatement);

        for (Statement statement : blockStatement.getStatements()) {
            statement.accept(this);
        }

        closeScope();
    }

    @Override
    public void visit(VariableDef variableDef) throws Exception {
        // Check for type
        Symbol typeSymbol = currentScope.resolve(new SymbolName(variableDef.getTypeName()));
        variableDef.setType((Type) typeSymbol);

        // Check whether the variable is already declared
        SymbolName varName = variableDef.getSymbolName();
        Symbol varSymbol = currentScope.resolve(varName);
        if (varSymbol != null) {
            handleSemanticError(variableDef.getNodeLocation(), ErrorMessages.REDECLARED_VAR, varName);
        }

        // Then declare the variable
        currentScope.define(varName, variableDef);
    }

    @Override
    public void visit(VariableDefStmt variableDefStmt) throws Exception {
        VariableDef varDef = variableDefStmt.getVarDef();
        varDef.accept(this);

        Expression rExpr = variableDefStmt.getRExpr();
        if (rExpr == null) {
            return;
        }

        rExpr.accept(this);

        if (isAssignable(rExpr.getType(), varDef.getType())) {
            return;
        }

        handleSemanticError(varDef.getNodeLocation(), ErrorMessages.INCOMPATIBLE_TYPES, varDef.getType(),
                rExpr.getType());
    }

    @Override
    public void visit(AssignmentStmt assignmentStmt) throws Exception {
        Expression lExpr = assignmentStmt.getLExpr();
        lExpr.accept(this);

        Expression rExpr = assignmentStmt.getRExpr();
        rExpr.accept(this);

        if (isAssignable(rExpr.getType(), lExpr.getType())) {
            return;
        }

        handleSemanticError(lExpr.getNodeLocation(), ErrorMessages.INCOMPATIBLE_TYPES, lExpr.getType(),
                rExpr.getType());
    }

    @Override
    public void visit(VariableRefExpr variableRefExpr) throws Exception {
        // Check whether the variable is declared
        SymbolName varName = variableRefExpr.getSymbolName();
        Symbol varDefSymbol = currentScope.resolve(varName);
        if (varDefSymbol == null) {
            handleSemanticError(variableRefExpr.getNodeLocation(), ErrorMessages.UNDECLARED_VAR, varName);
        }

        variableRefExpr.setVariableDef((sample.language.model.VariableDef) varDefSymbol);
    }

    @Override
    public void visit(FloatLiteral floatLiteral) throws Exception {
        // Do nothing
    }

    @Override
    public void visit(IntegerLiteral integerLiteral) throws Exception {
        // Do nothing
    }

    @Override
    public void visit(BooleanLiteral booleanLiteral) throws Exception {
        // Do nothing
    }

    @Override
    public void visit(UnaryExpression unaryExpression) throws Exception {
        // Do nothing
    }

    @Override
    public void visit(AddExpression addExpression) throws Exception {
        Expression lExpr = addExpression.getLExpr();
        lExpr.accept(this);

        Expression rExpr = addExpression.getRExpr();
        rExpr.accept(this);

        Type exprType = getBinaryArithmeticExprType(Operator.ADD, lExpr.getType(), rExpr.getType(),
                addExpression.getNodeLocation());
        addExpression.setType(exprType);
    }

    @Override
    public void visit(LessThanExpression lessThanExpression) throws Exception {
        Expression lExpr = lessThanExpression.getLExpr();
        lExpr.accept(this);

        Expression rExpr = lessThanExpression.getRExpr();
        rExpr.accept(this);

        verifyBinaryCompareExprTypes(Operator.LESS_THAN, lExpr.getType(), rExpr.getType(),
                lessThanExpression.getNodeLocation());

        lessThanExpression.setType(Types.BOOLEAN_TYPE);
    }

    @Override
    public void visit(ForLoopStmt forLoopStmt) throws Exception {
        forLoopStmt.getInitStmt().accept(this);

        Expression terminateCondition = forLoopStmt.getTerminateCondition();
        terminateCondition.accept(this);
        if (terminateCondition.getType() != Types.BOOLEAN_TYPE) {
            handleSemanticError(terminateCondition.getNodeLocation(), ErrorMessages.INCOMPATIBLE_TYPES,
                    Types.BOOLEAN_TYPE, terminateCondition.getType());
        }

        forLoopStmt.getIncrementStmt().accept(this);

        openScope(forLoopStmt);
        for (Statement statement : forLoopStmt.getStatements()) {
            statement.accept(this);
        }
        closeScope();
    }

    @Override
    public void visit(IncrementExpression incrementExpression) throws Exception {
        Expression varRef = incrementExpression.getRExpr();
        varRef.accept(this);

        if (varRef.getType() != Types.INT_TYPE) {
            handleSemanticError(incrementExpression.getNodeLocation(), ErrorMessages.INVALID_UNARY_OPERATION,
                    incrementExpression.getOperator(), varRef.getType());
        }

        incrementExpression.setType(varRef.getType());
    }

    @Override
    public void visit(IncrementStmt incrementStmt) throws Exception {
        incrementStmt.getIncrementExpr().accept(this);
    }

    /*
     * Private methods
     */

    private void openScope(SymbolScope symbolScope) {
        currentScope = symbolScope;
    }

    private void closeScope() {
        currentScope = currentScope.getEnclosingScope();
    }

    private void handleSemanticError(NodeLocation location, String message, Object... params) throws SemanticException {
        String locationStr = "[" + location.getFileName() + ":line " + location.getLineNumber() + "] ";

        String errorMsg = MessageFormat.format(message, params);
        throw new SemanticException(locationStr + errorMsg);
    }

    private boolean isAssignable(Type srcType, Type targetType) {
        if (srcType == targetType) {
            return true;
        }

        // Check whether widening is possible
        if (targetType == Types.FLOAT_TYPE && srcType == Types.INT_TYPE) {
            return true;
        }

        return false;
    }

    private Type getBinaryArithmeticExprType(Operator operator, Type lType, Type rType, NodeLocation location)
            throws SemanticException {
        if (lType == Types.BOOLEAN_TYPE || rType == Types.BOOLEAN_TYPE) {
            handleSemanticError(location, ErrorMessages.INVALID_BINARY_OPERATION, lType, rType);
        }

        if (lType == rType) {
            return lType;
        }

        if (lType == Types.FLOAT_TYPE || rType == Types.FLOAT_TYPE) {
            return Types.FLOAT_TYPE;
        }

        handleSemanticError(location, ErrorMessages.INVALID_BINARY_OPERATION, operator, lType, rType);
        return null;
    }

    private void verifyBinaryCompareExprTypes(Operator operator, Type lType, Type rType, NodeLocation location)
            throws SemanticException {
        if (lType == rType && lType != Types.BOOLEAN_TYPE) {
            return;
        }

        handleSemanticError(location, ErrorMessages.INVALID_BINARY_OPERATION, operator, lType, rType);
        return;
    }
}
