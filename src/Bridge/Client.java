package Bridge;

import javax.xml.parsers.ParserConfigurationException;

public class Client {
    public static void main(String[] args) throws ParserConfigurationException {
        Color color;
        Pen pen;
        color=(Color) XMLUtilPen.getBean("color");
        pen= (Pen) XMLUtilPen.getBean("pen");
        pen.setColor(color);
        pen.draw("flower");

    }
}
