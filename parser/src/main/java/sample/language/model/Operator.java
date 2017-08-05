package sample.language.model;

/**
 * {code Operator} represents available arithmetic and logical operators.
 */
public enum Operator {

    ADD("+"),
    LESS_THAN("<"),
    INCREMENT("++"),
    ASSIGN("=");

    private final String opValue;

    Operator(String opValue) {
        this.opValue = opValue;
    }

    @Override
    public String toString() {
        return opValue;
    }
}
