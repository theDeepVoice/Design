package Prototype;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Sanjiao sanjiao = new Sanjiao();
        sanjiao.setId("2");
        shapeMap.put(sanjiao.getId(),sanjiao);
    }

}
