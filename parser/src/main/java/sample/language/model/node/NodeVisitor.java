package sample.language.model.node;

import sample.language.model.CompilationUnit;
import sample.language.model.VariableDef;
import sample.language.model.expressions.AddExpression;
import sample.language.model.expressions.BooleanLiteral;
import sample.language.model.expressions.FloatLiteral;
import sample.language.model.expressions.IncrementExpression;
import sample.language.model.expressions.IntegerLiteral;
import sample.language.model.expressions.LessThanExpression;
import sample.language.model.expressions.UnaryExpression;
import sample.language.model.expressions.VariableRefExpr;
import sample.language.model.statements.AssignmentStmt;
import sample.language.model.statements.BlockStmt;
import sample.language.model.statements.ForLoopStmt;
import sample.language.model.statements.IncrementStmt;
import sample.language.model.statements.VariableDefStmt;

/**
 * {@code NodeVisitor} responsible for traversing statements and expressions.
 */
public interface NodeVisitor {

    void visit(CompilationUnit compilationUnit) throws Exception;

    void visit(VariableDef variableDef) throws Exception;

    /*
     * Statements
     */

    void visit(BlockStmt blockStatement) throws Exception;

    void visit(VariableDefStmt variableDefStmt) throws Exception;

    void visit(AssignmentStmt assignmentStmt) throws Exception;

    void visit(ForLoopStmt forLoopStmt) throws Exception;

    void visit(IncrementStmt incrementStmt) throws Exception;

    /*
     * Expressions
     */

    void visit(VariableRefExpr variableRefExpr) throws Exception;

    void visit(IntegerLiteral integerLiteral) throws Exception;

    void visit(FloatLiteral floatLiteral) throws Exception;

    void visit(BooleanLiteral booleanLiteral) throws Exception;

    void visit(UnaryExpression unaryExpression) throws Exception;

    void visit(AddExpression addExpression) throws Exception;

    void visit(LessThanExpression lessThanExpression) throws Exception;

    void visit(IncrementExpression incrementExpression) throws Exception;

}
