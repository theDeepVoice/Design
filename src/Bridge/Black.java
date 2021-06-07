package Bridge;

public class Black implements Color{

    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType+" Black "+name);
    }
}
