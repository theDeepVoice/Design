package Bridge;

public class SmallPen extends Pen{
    @Override
    public void draw(String string) {
        String penType="Small pen draws ";
        this.color.bePaint(penType,string);
    }
}
