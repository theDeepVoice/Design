package Strategy;

public class FruitKnife implements ICutFruit{
    @Override
    public void CutStrategy(String fruitName) {
        System.out.println(fruitName+"一次切一片");
    }
}
