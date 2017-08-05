package sample.language.model.statements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sample.language.model.node.NodeVisitor;
import sample.language.model.symbols.Symbol;
import sample.language.model.symbols.SymbolName;
import sample.language.model.symbols.SymbolScope;
import sample.language.model.utils.NodeLocation;

public class BlockStmt extends SymbolScope implements Statement {

    private List<Statement> statements = new ArrayList<Statement>();
    private SymbolScope enclosingScope;
    private Map<SymbolName, Symbol> symbolMap;

    public BlockStmt(NodeLocation location, SymbolScope enclosingScope) {
        this.enclosingScope = enclosingScope;
        this.symbolMap = new HashMap<>();
    }

    @Override
    public SymbolScope getEnclosingScope() {
        return enclosingScope;
    }

    @Override
    public void define(SymbolName name, Symbol symbol) {
        symbolMap.put(name, symbol);
    }

    @Override
    public Symbol resolve(SymbolName name) {
        return resolve(symbolMap, name);
    }

    @Override
    public Map<SymbolName, Symbol> getSymbolMap() {
        return symbolMap;
    }

    public void addStatement(Statement stmt) {
        statements.add(stmt);
    }

    public Statement[] getStatements() {
        return statements.toArray(new Statement[0]);
    }

    @Override
    public void accept(NodeVisitor visitor) throws Exception {
        visitor.visit(this);

    }

    @Override
    public NodeLocation getNodeLocation() {
        return null;
    }
}
