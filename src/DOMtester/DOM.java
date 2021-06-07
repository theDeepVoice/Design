package DOMtester;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class DOM {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        //1、获取文档构建对象的工厂

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //2通过工厂对象获取文档构建对象

        DocumentBuilder builder = factory.newDocumentBuilder();

        //3、通过构建对象解析xml

        Document document = builder.parse("D:\\Design Patterns\\design patterns public\\src\\abstractFactory\\DOMTest.xml");

        //4、通过文档对象获取指定标签名称的集合对象。

        NodeList name = document.getElementsByTagName("name");
        int length = name.getLength();
        for (int i = 0; i < length; i++) {

            //取出第一个元素/获取每个元素
            Node node = name.item(i);
            //获取该节点的第一个子节点（文本节点）。

            Node firstChild = node.getFirstChild();
            //获取该节点的值

            String nodeValue = firstChild.getNodeValue();

            System.out.println(nodeValue);

        }
   /* //取出第一个元素
    Node node = name.item(1);
    //获取该节点的第一个子节点（文本节点）。

    Node firstChild = node.getFirstChild();
    //获取该节点的值

    String nodeValue = firstChild.getNodeValue();

    System.out.println(nodeValue);*/

        NodeList email = document.getElementsByTagName("email");

        Node node = email.item(0);

        Node firstChild = node.getFirstChild();

        String emailValue = firstChild.getNodeValue();
        System.out.println(emailValue);

    }
}
