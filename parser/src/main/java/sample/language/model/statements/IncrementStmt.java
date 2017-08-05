package sample.language.model.statements;

import sample.language.model.expressions.IncrementExpression;
import sample.language.model.node.NodeVisitor;
import sample.language.model.utils.NodeLocation;

public class IncrementStmt implements Statement {

    private IncrementExpression incrementExpr;
    private NodeLocation location;

    public IncrementStmt(NodeLocation location, IncrementExpression incrementExpr) {
        this.incrementExpr = incrementExpr;
        this.location = location;
    }

    public IncrementExpression getIncrementExpr() {
        return incrementExpr;
    }

    @Override
    public void accept(NodeVisitor visitor) throws Exception {
        visitor.visit(this);
    }

    @Override
    public NodeLocation getNodeLocation() {
        return location;
    }
}
