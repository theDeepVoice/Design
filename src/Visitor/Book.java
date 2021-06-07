package Visitor;

public class Book implements IProduct{
    @Override
    public void accept(AVisitor aVisitor) {
        aVisitor.visit(this);
    }
}
