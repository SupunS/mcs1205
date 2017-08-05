package sample.language.model;

import sample.language.model.node.Node;
import sample.language.model.node.NodeVisitor;
import sample.language.model.statements.BlockStmt;
import sample.language.model.utils.NodeLocation;

public class CompilationUnit implements Node {

    private BlockStmt start;

    public CompilationUnit(BlockStmt start) {
        this.start = start;
    }

    public BlockStmt getStart() {
        return start;
    }

    public void setStart(BlockStmt start) {
        this.start = start;
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
