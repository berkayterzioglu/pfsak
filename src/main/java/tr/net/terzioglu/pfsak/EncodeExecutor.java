package tr.net.terzioglu.pfsak;

import java.util.Base64;
import javax.swing.DefaultListModel;
import tr.net.terzioglu.pfsak.module.EncodeConfig;

public class EncodeExecutor {

    private DefaultListModel defaultListModel;

    public EncodeExecutor() {
    }

    public EncodeExecutor(DefaultListModel defaultListModel) {
        this.defaultListModel = defaultListModel;
    }

    public byte[] execute(EncodeConfig config, byte[] data) throws Exception {

        Encode e = null;

        switch (config.getEncodeType()) {
            case BASE64:
                e = new Base64_Encode();
                defaultListModel.addElement("ENCODE -- BASE64");
                break;
            case HEXBIN:
                e = new HexBin_Encode();
                defaultListModel.addElement("ENCODE -- HEXBIN");
                break;
            case UU:
                e = new UU_Encode();
                defaultListModel.addElement("ENCODE -- UU");
                break;
        }
        byte[] rs;
        if (config.isEncode()) {
            rs = e.encode(data);
            defaultListModel.addElement(Base64.getMimeEncoder().encodeToString(rs));
            return rs;
        } else {
            rs = e.decode(data);
            defaultListModel.addElement(Base64.getMimeEncoder().encodeToString(rs));
            return rs;

        }

    }
}
