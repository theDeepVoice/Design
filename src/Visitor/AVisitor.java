package Visitor;

public abstract class AVisitor {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }
    public abstract void visit(Apple apple);
    public abstract void visit(Book book);
}
