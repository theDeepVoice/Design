package Command;

import java.util.HashMap;

public class Order {
    private int ID;
    private HashMap<String,Integer> fruitMap;
    public Order(){
        fruitMap=new HashMap<String, Integer>();
    }

    public HashMap<String, Integer> getFruitMap() {
        return fruitMap;
    }

    public void setFruitMap(String kind,int quantity) {
        fruitMap.put(kind,quantity);
    }

    public void setID(int id) {
        this.ID = id;
    }

    public int getID(){
        return ID;
    }
}
