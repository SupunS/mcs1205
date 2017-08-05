package sample.language.model.statements;

import sample.language.model.expressions.Expression;
import sample.language.model.node.NodeVisitor;
import sample.language.model.symbols.SymbolScope;
import sample.language.model.utils.NodeLocation;

/**
 * An {@code ForLoopStmt} represents a for-loop.
 */
public class ForLoopStmt extends BlockStmt {
    private Statement initStmt;
    private Expression terminateCondition;

    // Supports increment/decrement
    private Statement incrementStmt;

    public ForLoopStmt(NodeLocation location, SymbolScope enclosingScope) {
        super(location, enclosingScope);
    }

    public Statement getInitStmt() {
        return initStmt;
    }

    public void setInitStmt(Statement initStmt) {
        this.initStmt = initStmt;
    }

    public Expression getTerminateCondition() {
        return terminateCondition;
    }

    public void setTerminateCondition(Expression terminateCondition) {
        this.terminateCondition = terminateCondition;
    }

    public Statement getIncrementStmt() {
        return incrementStmt;
    }

    public void setIncrementStmt(Statement terminateStmt) {
        this.incrementStmt = terminateStmt;
    }

    @Override
    public void addStatement(Statement stmt) {
        if (initStmt == null) {
            initStmt = stmt;
            return;
        }

        if (incrementStmt == null) {
            incrementStmt = stmt;
            return;
        }

        super.addStatement(stmt);
    }

    @Override
    public void accept(NodeVisitor visitor) throws Exception {
        visitor.visit(this);
    }
}
