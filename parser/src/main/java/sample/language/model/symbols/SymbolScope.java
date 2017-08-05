package sample.language.model.symbols;

import java.util.Map;

public abstract class SymbolScope {

    public abstract SymbolScope getEnclosingScope();

    public abstract void define(SymbolName name, Symbol symbol);

    public abstract Symbol resolve(SymbolName name);

    public abstract Map<SymbolName, Symbol> getSymbolMap();

    public Symbol resolve(Map<SymbolName, Symbol> symbolMap, SymbolName name) {
        Symbol symbol = symbolMap.get(name);
        if (symbol == null && getEnclosingScope() != null) {
            return getEnclosingScope().resolve(name);
        }

        return symbol;
    }
}
