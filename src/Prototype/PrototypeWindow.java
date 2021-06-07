package Prototype;

public class PrototypeWindow {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape = (Shape) ShapeCache.getShape("1");
        System.out.println(cloneShape.getType());

        cloneShape = (Shape) ShapeCache.getShape("2");
        System.out.println(cloneShape.getType());


    }

}
