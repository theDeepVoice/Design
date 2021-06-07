package Bridge;

public class MiddlePen extends Pen{

    @Override
    public void draw(String string) {
        String penType="Middle pen draws ";
        this.color.bePaint(penType,string);
    }
}
