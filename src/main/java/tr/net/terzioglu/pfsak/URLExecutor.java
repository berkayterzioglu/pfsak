package tr.net.terzioglu.pfsak;

import java.util.Base64;
import javax.swing.DefaultListModel;
import tr.net.terzioglu.pfsak.module.URLConfig;

public class URLExecutor {

    private DefaultListModel defaultListModel;

    public URLExecutor() {
    }

    public URLExecutor(DefaultListModel defaultListModel) {
        this.defaultListModel = defaultListModel;
    }

    public byte[] execute(URLConfig config, byte[] data) throws Exception {
        URLProcessor up = new URLProcessor();
        byte[] rs;
        switch (config.getFileType()) {

            case GET:

                defaultListModel.addElement("GETTING ...");
                rs = up.getURL(data, config);
                defaultListModel.addElement(Base64.getMimeEncoder().encodeToString(rs));
                return rs;

            case POST:
                defaultListModel.addElement("POSTTING ...");
                rs = up.postURL(data, config);
                defaultListModel.addElement(Base64.getMimeEncoder().encodeToString(data));
                return rs;

            case PUT:
                defaultListModel.addElement("PUTTING ...");
                rs = up.putURL(data, config);
                defaultListModel.addElement(Base64.getMimeEncoder().encodeToString(data));
                return rs;
        }
        return null;

    }

}
