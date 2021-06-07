package ChainOfResponsibility;

public class SmallFruitSorting extends AbstractFruitSort{
    public SmallFruitSorting(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("果汁："+fruit);
    }
}
