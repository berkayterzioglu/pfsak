package tr.net.terzioglu.pfsak;

import javax.swing.DefaultListModel;
import tr.net.terzioglu.pfsak.module.XMLConfig;

public class XMLExecutor {

    private DefaultListModel defaultListModel;

    public XMLExecutor() {
    }

    public XMLExecutor(DefaultListModel defaultListModel) {
        this.defaultListModel = defaultListModel;
    }

    public byte[] execute(XMLConfig config, byte[] data) throws Exception {

        XMLProcessor processor = new XMLProcessor();

        defaultListModel.addElement("XML executing...");
        byte[] rs = processor.readFromXML(data, config);
        return rs;

    }
}
