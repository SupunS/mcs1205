package sample.language.model.expressions;

import sample.language.model.node.Node;
import sample.language.model.types.Type;

public interface Expression extends Node {

    public Type getType();

    void setType(Type type);
}
