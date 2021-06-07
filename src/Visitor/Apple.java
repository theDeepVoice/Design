package Visitor;

public class Apple implements IProduct{
    @Override
    public void accept(AVisitor aVisitor) {
        aVisitor.visit(this);
    }
}
