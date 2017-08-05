package sample.language.model.expressions;

import sample.language.model.node.NodeVisitor;
import sample.language.model.types.Types;
import sample.language.model.utils.NodeLocation;

public class IntegerLiteral extends AbstractExpression {

    int value;

    public IntegerLiteral(int value, NodeLocation location) {
        super(location);
        this.value = value;
        this.type = Types.INT_TYPE;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void accept(NodeVisitor visitor) throws Exception {
        visitor.visit(this);
    }
}
