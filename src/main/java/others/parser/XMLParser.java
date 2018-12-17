package others.parser;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-16 上午11:19
 **/
public class XMLParser {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        //创建节点对象
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(XMLParser.class.getResource("/") + "Test.xml");
//        /Users/yangnk/IdeaProjects/MyComputerScienceBasis/src/main/resources/Test.xml
        //获取节点名
        NodeList nodeList = document.getElementsByTagName("chartType");
        String s = nodeList.item(0).getFirstChild().getNodeValue().trim();
        System.out.println(s);
    }
}
