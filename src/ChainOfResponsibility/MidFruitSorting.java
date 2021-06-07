package ChainOfResponsibility;

public class MidFruitSorting extends AbstractFruitSort{
    public MidFruitSorting(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("罐头："+fruit);
    }
}
