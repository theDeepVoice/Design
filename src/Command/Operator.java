package Command;

public class Operator {
    public void MakeFruit(Order order){
        String string="";
        for (String key:order.getFruitMap().keySet()){
            string+=key+order.getFruitMap().get(key);
        }
        System.out.println("汁:"+string);
    }
}
