package Bridge;

public class White implements Color
{
    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType+" White "+name);
    }
}


