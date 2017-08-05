package sample.language.model.expressions;

import sample.language.model.node.NodeVisitor;
import sample.language.model.types.Type;
import sample.language.model.types.TypeNames;
import sample.language.model.utils.NodeLocation;

public abstract class AbstractExpression implements Expression {

    Type type;
    NodeLocation location;

    public AbstractExpression(NodeLocation location) {
        this.location = location;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public abstract void accept(NodeVisitor visitor) throws Exception;

    @Override
    public NodeLocation getNodeLocation() {
        return location;
    }
}
