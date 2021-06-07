package Strategy;

public class HoriBlade implements ICutFruit{
    @Override
    public void CutStrategy(String fruitName) {
        System.out.println(fruitName+"一次被切成几片");
    }
}
