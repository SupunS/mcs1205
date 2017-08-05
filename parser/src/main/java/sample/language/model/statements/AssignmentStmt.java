package sample.language.model.statements;

import sample.language.model.expressions.Expression;
import sample.language.model.node.NodeVisitor;
import sample.language.model.utils.NodeLocation;

/**
 * An {@code AssignStmt} represents an assignment.
 */
public class AssignmentStmt extends AbstractStatement {
    private Expression lhsExpr;
    private Expression rhsExpr;

    public AssignmentStmt(NodeLocation location, Expression lhsExpr, Expression rhsExpr) {
        super(location);
        this.lhsExpr = lhsExpr;
        this.rhsExpr = rhsExpr;
    }

    public Expression getLExpr() {
        return lhsExpr;
    }

    public Expression getRExpr() {
        return rhsExpr;
    }

    public void setRExpr(Expression rhsExpr) {
        this.rhsExpr = rhsExpr;
    }

    public void setRhsExpr(Expression rhsExpr) {
        this.rhsExpr = rhsExpr;
    }

    @Override
    public void accept(NodeVisitor visitor) throws Exception {
        visitor.visit(this);
    }
}
