package sample.language.model.symbols;

public class SymbolName {
    protected String name;

    public SymbolName(String name) {
        this.name = name;
    }

    /**
     * Returns the name of this {@code SymbolName}.
     *
     * @return name of the {@code SymbolName}
     */
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SymbolName)) {
            return false;
        }
        return this.name.equals(((SymbolName) obj).getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 57;
    }

    @Override
    public String toString() {
        return name;
    }
}
