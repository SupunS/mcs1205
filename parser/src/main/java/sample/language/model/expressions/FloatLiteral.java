package sample.language.model.expressions;

import sample.language.model.node.NodeVisitor;
import sample.language.model.types.Types;
import sample.language.model.utils.NodeLocation;

public class FloatLiteral extends AbstractExpression {

    float value;

    public FloatLiteral(float value, NodeLocation location) {
        super(location);
        this.value = value;
        this.type = Types.FLOAT_TYPE;
    }

    public float getValue() {
        return value;
    }

    @Override
    public void accept(NodeVisitor visitor) throws Exception {
        visitor.visit(this);
    }
}
