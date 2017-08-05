package sample.language.model.types;

import sample.language.model.symbols.Symbol;
import sample.language.model.symbols.SymbolName;
import sample.language.model.symbols.SymbolScope;

public class Type implements Symbol {

    String typeName;
    SymbolName typeSymbolName;

    public Type(String typeName) {
        this.typeName = typeName;
        typeSymbolName = new SymbolName(typeName);
    }

    public String getName() {
        return typeName;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public SymbolName getSymbolName() {
        return typeSymbolName;
    }

    @Override
    public SymbolScope getSymbolScope() {
        return null;
    }
}
