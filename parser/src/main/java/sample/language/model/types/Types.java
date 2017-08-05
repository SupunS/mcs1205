package sample.language.model.types;

import sample.language.model.symbols.GlobalScope;

public class Types {

    public static final Type INT_TYPE = new Type(TypeNames.INT_TNAME);
    public static final Type FLOAT_TYPE = new Type(TypeNames.FLOAT_TNAME);
    public static final Type BOOLEAN_TYPE = new Type(TypeNames.BOOLEAN_TNAME);

    public static void loadBuiltInTypes(GlobalScope globalScope) {
        globalScope.define(INT_TYPE.getSymbolName(), INT_TYPE);
        globalScope.define(FLOAT_TYPE.getSymbolName(), FLOAT_TYPE);
        globalScope.define(BOOLEAN_TYPE.getSymbolName(), BOOLEAN_TYPE);
    }
}
