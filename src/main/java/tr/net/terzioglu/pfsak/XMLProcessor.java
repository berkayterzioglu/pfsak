package tr.net.terzioglu.pfsak;

import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import tr.net.terzioglu.pfsak.module.XMLConfig;

public class XMLProcessor {

    public byte[] readFromXML(byte[] data, XMLConfig config) throws Exception {

        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);

        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document xmlDocument = builder.parse(inputStream);

        XPath xPath = XPathFactory.newInstance().newXPath();
        XPathExpression expression = xPath.compile(config.getXMLdata());

        NodeList nodeList = (NodeList) expression.evaluate(xmlDocument, XPathConstants.NODESET);

        String nodeValue = nodeList.item(0).getTextContent();
        return nodeValue.getBytes("UTF-8");
    }
}
