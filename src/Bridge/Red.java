package Bridge;

public class Red implements Color{
    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType+" Red "+name);
    }
}
