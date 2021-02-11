package tr.net.terzioglu.pfsak;

import java.util.Base64;
import javax.swing.DefaultListModel;
import tr.net.terzioglu.pfsak.module.EncryptConfig;

public class EncryptionExecutor {

    private DefaultListModel defaultListModel;

    public EncryptionExecutor() {
    }

    public EncryptionExecutor(DefaultListModel defaultListModel) {
        this.defaultListModel = defaultListModel;
    }

    public byte[] execute(EncryptConfig config, byte[] data) throws Exception {

        Encryption e = new EncryptionProcessor();
        String algo = null;
        String keyValue = config.getKeyValue();

        switch (config.getEncryptionType()) {
            case AES:
                algo = "AES";
                defaultListModel.addElement("ENCRYPTION -- AES");
                break;
            case DES:
                algo = "DES";
                defaultListModel.addElement("ENCRYPTION -- DES");
                break;
            case TRIPLE_DES:
                algo = "DESede";
                defaultListModel.addElement("ENCRYPTION -- 3DES");
                break;
        }
        byte[] rs;
        if (config.isEncrypt()) {
            rs = e.encrypt(data, algo, Base64.getMimeDecoder().decode(keyValue));
            defaultListModel.addElement(Base64.getMimeEncoder().encodeToString(rs));
            return rs;
        } else {
            rs = e.decrypt(data, algo, Base64.getMimeDecoder().decode(keyValue));
            defaultListModel.addElement(Base64.getMimeEncoder().encodeToString(rs));
            return rs;

        }

    }
}
