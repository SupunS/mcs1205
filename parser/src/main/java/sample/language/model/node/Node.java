package sample.language.model.node;

import sample.language.model.utils.NodeLocation;

/**
 * This class represents a Node in AST (Abstract Syntax Tree).
 */
public interface Node {

    /**
     * Accept a {link NodeVisitor} and executes the visitor.
     * 
     * @param visitor Node visitor to traverse the node
     * @throws Exception
     */
    void accept(NodeVisitor visitor) throws Exception;

    /**
     * Returns the location of this node. {@link NodeLocation} includes the
     * source filename and the line number.
     *
     * @return location of this node
     */
    NodeLocation getNodeLocation();
}
