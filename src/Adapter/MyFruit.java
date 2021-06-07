package Adapter;

public class MyFruit implements Cloneable {
    protected String kind;
    public void Display(){
        System.out.println(kind);
    }

    public String getKind() {
        return kind;
    }

    public Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        return o;
    }
}
