package Bridge;

public class BigPen extends Pen{
    @Override
    public void draw(String string) {
        String penType="Big pen draws ";
        this.color.bePaint(penType,string);
    }
}
