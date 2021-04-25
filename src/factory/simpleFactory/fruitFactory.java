package factory.simpleFactory;

public class fruitFactory {

    public Fruit CreateFruit(String FruitType){
        if ("A".equals(FruitType)){
            System.out.println("You get an Apple!");
            return new Apple();
        }

        if ("B".equals(FruitType)){
            System.out.println("You get a Banana!");
            return new Banana();
        }

        return null;
    }
}
