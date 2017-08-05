package sample.language.model;

import sample.language.model.node.Node;
import sample.language.model.node.NodeVisitor;
import sample.language.model.symbols.Symbol;
import sample.language.model.symbols.SymbolName;
import sample.language.model.symbols.SymbolScope;
import sample.language.model.types.Type;
import sample.language.model.utils.NodeLocation;

/**
 * {@code VariableDef} represent a Variable definition.
 */
public class VariableDef implements Symbol, Node {

    private NodeLocation location;
    private String typeName;
    private Type type;
    private SymbolName varName;

    public VariableDef(NodeLocation location, String typeName, SymbolName varName) {
        this.location = location;
        this.typeName = typeName;
        this.varName = varName;
    }

    public String getTypeName() {
        return typeName;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return varName.getName();
    }

    @Override
    public SymbolName getSymbolName() {
        return varName;
    }

    // Methods in Node interface

    @Override
    public void accept(NodeVisitor visitor) throws Exception {
        visitor.visit(this);
    }

    @Override
    public NodeLocation getNodeLocation() {
        return location;
    }

    @Override
    public SymbolScope getSymbolScope() {
        return null;
    }

    @Override
    public String toString() {
        return typeName;
    }
}
