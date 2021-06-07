package Strategy;

public class MultiBlade implements ICutFruit{

    @Override
    public void CutStrategy(String fruitName) {
        System.out.println(fruitName+"一次被切成8片");
    }
}
