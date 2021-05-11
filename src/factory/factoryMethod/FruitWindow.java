package factory.factoryMethod;

public class FruitWindow {
    public static void main(String[] args) {
        fruitFactory factory = new fruitFactory();

        Fruit fruit1 = factory.CreateFruit("A");
        fruit1.eat();

        Fruit fruit2 = factory.CreateFruit("B");
        fruit2.eat();
    }
}
