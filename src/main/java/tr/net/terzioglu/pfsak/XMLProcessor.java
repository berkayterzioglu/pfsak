package tr.net.terzioglu.pfsak;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Iterator;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import tr.net.terzioglu.pfsak.module.XMLConfig;

public class XMLProcessor {

    public byte[] readFromXML(byte[] data, XMLConfig config) throws Exception {

        InputStream inputStream = new ByteArrayInputStream(data);

        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        builderFactory.setNamespaceAware(true);

        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document xmlDocument = builder.parse(inputStream);

        XPath xPath = XPathFactory.newInstance().newXPath();

        xPath.setNamespaceContext(new NamespaceContext() {

            @Override
            public Iterator getPrefixes(String arg0) {
                return null;
            }

            @Override
            public String getPrefix(String arg0) {
                return xmlDocument.lookupPrefix(arg0);
            }

            @Override
            public String getNamespaceURI(String arg0) {
                if (arg0.equals(XMLConstants.DEFAULT_NS_PREFIX)) {
                    return xmlDocument.lookupNamespaceURI(null);
                } else {
                    return xmlDocument.lookupNamespaceURI(arg0);
                }
            }
        }
        );

        XPathExpression expression = xPath.compile(config.getXMLdata());
        Object result = expression.evaluate(xmlDocument, XPathConstants.NODESET);
        
        NodeList nodeList = (NodeList) result;
        String nodeValue = nodeList.item(0).getTextContent();
        
        return nodeValue.getBytes("UTF-8");
    }

}
