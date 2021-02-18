package tr.net.terzioglu.pfsak;

import javax.swing.DefaultListModel;
import tr.net.terzioglu.pfsak.module.JSONConfig;

public class JSONExecutor {

    private DefaultListModel defaultListModel;

    public JSONExecutor() {
    }

    public JSONExecutor(DefaultListModel defaultListModel) {
        this.defaultListModel = defaultListModel;
    }

    public byte[] execute(JSONConfig config, byte[] data) throws Exception {

        JSONProcessor processor = new JSONProcessor();

        defaultListModel.addElement("JSON executing...");
        byte[] rs = processor.deserializeJSON(data, config);
        return rs;

    }
}
