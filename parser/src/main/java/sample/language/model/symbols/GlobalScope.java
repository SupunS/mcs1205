package sample.language.model.symbols;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GlobalScope extends SymbolScope {

    private static Map<SymbolName, Symbol> symbolMap;

    private static GlobalScope instance = new GlobalScope();

    private GlobalScope() {
        symbolMap = new HashMap<>();
    }

    public static GlobalScope getInstance() {
        return instance;
    }

    @Override
    public SymbolScope getEnclosingScope() {
        return null;
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
        return Collections.unmodifiableMap(symbolMap);
    }
}
