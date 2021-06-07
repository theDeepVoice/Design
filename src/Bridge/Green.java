package Bridge;

public class Green implements Color{
    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType+" Green "+name);
    }
}
