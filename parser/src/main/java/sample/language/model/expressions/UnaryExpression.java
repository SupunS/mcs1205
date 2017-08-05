package sample.language.model.expressions;

import sample.language.model.Operator;
import sample.language.model.utils.NodeLocation;

/**
 * {@code UnaryExpression} represents a unary expression.
 */
public abstract class UnaryExpression extends AbstractExpression {

    protected Operator op;
    protected Expression rExpr;

    public UnaryExpression(NodeLocation location, Operator op, Expression rExpr) {
        super(location);
        this.op = op;
        this.rExpr = rExpr;
    }

    public Expression getRExpr() {
        return rExpr;
    }

    public void setRExpr(Expression rExpr) {
        this.rExpr = rExpr;
    }

    public Operator getOperator() {
        return op;
    }
}
