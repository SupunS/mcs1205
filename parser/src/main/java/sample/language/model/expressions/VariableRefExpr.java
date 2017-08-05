package sample.language.model.expressions;

import sample.language.model.VariableDef;
import sample.language.model.node.NodeVisitor;
import sample.language.model.symbols.SymbolName;
import sample.language.model.types.Type;
import sample.language.model.utils.NodeLocation;

/**
 * {@code VariableRefExpr} represents a variable reference expression with just
 * the variable name.
 */
public class VariableRefExpr extends AbstractExpression {
    private String varName;
    private SymbolName symbolName;
    private VariableDef variableDef;

    public VariableRefExpr(NodeLocation location, String varName) {
        super(location);
        this.varName = varName;
        this.symbolName = new SymbolName(varName);
    }

    public String getVarName() {
        return varName;
    }

    public SymbolName getSymbolName() {
        return symbolName;
    }

    public VariableDef getVariableDef() {
        return variableDef;
    }

    public void setVariableDef(VariableDef variableDef) {
        this.variableDef = variableDef;
    }

    public Type getType() {
        return variableDef.getType();
    }

    @Override
    public void accept(NodeVisitor visitor) throws Exception {
        visitor.visit(this);
    }
}
