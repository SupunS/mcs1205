// Generated from SampleParser.g4 by ANTLR 4.5.3
package sample.language.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SampleParser}.
 */
public interface SampleParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SampleParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(SampleParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(SampleParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(SampleParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(SampleParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SampleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SampleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#variableDefinitionStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinitionStatement(SampleParser.VariableDefinitionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#variableDefinitionStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinitionStatement(SampleParser.VariableDefinitionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(SampleParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(SampleParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#incrementStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncrementStatement(SampleParser.IncrementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#incrementStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncrementStatement(SampleParser.IncrementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#forLoopStatement}.
	 * @param ctx the parse tree
	 */
	void enterForLoopStatement(SampleParser.ForLoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#forLoopStatement}.
	 * @param ctx the parse tree
	 */
	void exitForLoopStatement(SampleParser.ForLoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#incrementExpr}.
	 * @param ctx the parse tree
	 */
	void enterIncrementExpr(SampleParser.IncrementExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#incrementExpr}.
	 * @param ctx the parse tree
	 */
	void exitIncrementExpr(SampleParser.IncrementExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(SampleParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(SampleParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableRefExpression}
	 * labeled alternative in {@link SampleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableRefExpression(SampleParser.VariableRefExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableRefExpression}
	 * labeled alternative in {@link SampleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableRefExpression(SampleParser.VariableRefExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleLiteralExpression}
	 * labeled alternative in {@link SampleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleLiteralExpression(SampleParser.SimpleLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleLiteralExpression}
	 * labeled alternative in {@link SampleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleLiteralExpression(SampleParser.SimpleLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryCompareExpression}
	 * labeled alternative in {@link SampleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryCompareExpression(SampleParser.BinaryCompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryCompareExpression}
	 * labeled alternative in {@link SampleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryCompareExpression(SampleParser.BinaryCompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incrementExpression}
	 * labeled alternative in {@link SampleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIncrementExpression(SampleParser.IncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrementExpression}
	 * labeled alternative in {@link SampleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIncrementExpression(SampleParser.IncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryAddExpression}
	 * labeled alternative in {@link SampleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryAddExpression(SampleParser.BinaryAddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryAddExpression}
	 * labeled alternative in {@link SampleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryAddExpression(SampleParser.BinaryAddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#simpleLiteral}.
	 * @param ctx the parse tree
	 */
	void enterSimpleLiteral(SampleParser.SimpleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#simpleLiteral}.
	 * @param ctx the parse tree
	 */
	void exitSimpleLiteral(SampleParser.SimpleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(SampleParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(SampleParser.TypeNameContext ctx);
}