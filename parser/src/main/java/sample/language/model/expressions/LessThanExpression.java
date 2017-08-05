package sample.language.model.expressions;

import sample.language.model.Operator;
import sample.language.model.node.NodeVisitor;
import sample.language.model.utils.NodeLocation;

/**
 * {@code LessThanExpression} represents a less than (<) expression.
 */
public class LessThanExpression extends BinaryExpression {

    public LessThanExpression(NodeLocation location, Expression lExpr, Expression rExpr) {
        super(location, lExpr, Operator.LESS_THAN, rExpr);
    }

    @Override
    public void accept(NodeVisitor visitor) throws Exception {
        visitor.visit(this);
    }
}
