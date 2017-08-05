package sample.language.model.expressions;

import sample.language.model.Operator;
import sample.language.model.node.NodeVisitor;
import sample.language.model.utils.NodeLocation;

public class IncrementExpression extends UnaryExpression {

    public IncrementExpression(NodeLocation location, Operator op, Expression varRef) {
        super(location, op, varRef);
    }

    @Override
    public void accept(NodeVisitor visitor) throws Exception {
        visitor.visit(this);
    }
}
