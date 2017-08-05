package sample.language.model.utils;

public class NodeLocation {
    private String fileName;
    private int lineNumber = -1;

    public NodeLocation(String fileName, int lineNumber) {
        this.fileName = fileName;
        this.lineNumber = lineNumber;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NodeLocation)) {
            return false;
        }

        NodeLocation other = (NodeLocation) obj;
        return (this.fileName.equals(other.getFileName()) && this.lineNumber == other.getLineNumber());
    }

    public int hashCode() {
        int result = this.fileName.hashCode() + lineNumber;
        return result * 43;
    }

    @Override
    public String toString() {
        return fileName + ":" + lineNumber;
    }
}
