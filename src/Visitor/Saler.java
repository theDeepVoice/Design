package Visitor;

public class Saler extends AVisitor{
    @Override
    public void visit(Apple apple) {
        System.out.println("收银员"+name+"计算苹果的价格");
    }

    @Override
    public void visit(Book book) {
        System.out.println("收银员"+name+"计算书的价格");
    }
}
