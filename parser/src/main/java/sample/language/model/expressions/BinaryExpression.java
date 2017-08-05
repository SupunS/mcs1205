package sample.language.model.expressions;

import sample.language.model.Operator;
import sample.language.model.utils.NodeLocation;

/**
 * {@code BinaryExpression} represents a binary expression.
 */
public abstract class BinaryExpression extends UnaryExpression {

    protected Expression lExpr;

    public BinaryExpression(NodeLocation location, Expression lExpr, Operator op, Expression rExpr) {
        super(location, op, rExpr);
        this.lExpr = lExpr;
    }

    public Expression getLExpr() {
        return lExpr;
    }

    public void setLExpr(Expression lExpr) {
        this.lExpr = lExpr;
    }
}
