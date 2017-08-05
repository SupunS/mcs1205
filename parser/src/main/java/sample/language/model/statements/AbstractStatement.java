package sample.language.model.statements;

import sample.language.model.utils.NodeLocation;

/**
 * Represents an abstract statement. All statements nodes extends this abstract
 * class.
 */
public abstract class AbstractStatement implements Statement {

    protected NodeLocation location;

    public AbstractStatement(NodeLocation location) {
        this.location = location;
    }

    public NodeLocation getNodeLocation() {
        return location;
    }

    public void setLocation(NodeLocation location) {
        this.location = location;
    }
}
