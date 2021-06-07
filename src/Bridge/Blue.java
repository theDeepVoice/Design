package Bridge;

public class Blue implements Color{
    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType+" Blue "+name);
    }
}
