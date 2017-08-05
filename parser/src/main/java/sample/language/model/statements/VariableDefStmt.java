package sample.language.model.statements;

import sample.language.model.VariableDef;
import sample.language.model.expressions.Expression;
import sample.language.model.node.NodeVisitor;
import sample.language.model.symbols.SymbolName;
import sample.language.model.symbols.SymbolScope;
import sample.language.model.utils.NodeLocation;

public class VariableDefStmt implements Statement {

    private VariableDef varDef;
    private SymbolScope symbolScope;
    private Expression rhsExpr;
    private NodeLocation location;

    public VariableDefStmt(NodeLocation location, VariableDef varDef, Expression rExpr, SymbolScope symbolScope) {
        this.varDef = varDef;
        this.symbolScope = symbolScope;
        this.rhsExpr = rExpr;
    }

    public Expression getRExpr() {
        return rhsExpr;
    }

    public void setRExpr(Expression rhsExpr) {
        this.rhsExpr = rhsExpr;
    }

    public SymbolName getVarName() {
        return varDef.getSymbolName();
    }

    public VariableDef getVarDef() {
        return varDef;
    }

    public SymbolScope getSymbolScope() {
        return symbolScope;
    }

    public void setSymbolScope(SymbolScope symbolScope) {
        this.symbolScope = symbolScope;
    }

    @Override
    public void accept(NodeVisitor visitor) throws Exception {
        visitor.visit(this);
    }

    @Override
    public NodeLocation getNodeLocation() {
        return location;
    }

}
