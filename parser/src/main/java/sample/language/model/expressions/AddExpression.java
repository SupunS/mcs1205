package sample.language.model.expressions;

import sample.language.model.Operator;
import sample.language.model.node.NodeVisitor;
import sample.language.model.utils.NodeLocation;

/**
 * {@code AddExpression} represents a binary add expression.
 */
public class AddExpression extends BinaryExpression {

    public AddExpression(NodeLocation location, Expression lExpr, Expression rExpr) {
        super(location, lExpr, Operator.ADD, rExpr);
    }

    @Override
    public void accept(NodeVisitor visitor) throws Exception {
        visitor.visit(this);
    }
}
