package Bridge;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLUtilPen {
    public static Object getBean(String s) throws ParserConfigurationException {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =dFactory.newDocumentBuilder();
            Document doc;
            doc= builder.parse(new File("design patterns public/src/Bridge/config.xml"));
            //获取包含类名的文本节点
            NodeList nl =doc.getElementsByTagName(s);
            Node classNode=nl.item(0).getFirstChild();
            String cName =classNode.getNodeValue();

            //通过类名生成实例对象并返回
            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return  obj;

        } catch (SAXException | ClassNotFoundException | IOException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
