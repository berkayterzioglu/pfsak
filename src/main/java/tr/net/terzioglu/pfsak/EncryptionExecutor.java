package tr.net.terzioglu.pfsak;

import java.util.Base64;
import tr.net.terzioglu.pfsak.module.EncryptConfig;

public class EncryptionExecutor {

    public byte[] execute(EncryptConfig config, byte[] data) throws Exception {

        Encryption e = new All_Encryption();
        String algo = null;
        String keyValue = config.getKeyValue();

        switch (config.getEncryptionType()) {
            case AES:
                algo = "AES";
                break;
            case DES:
                algo = "DES";
                break;
            case TRIPLE_DES:
                algo = "DESede";
                break;
        }

        if (config.isEncrypt()) {
            return e.encrypt(data, algo, Base64.getMimeDecoder().decode(keyValue));
        } else {
            return e.decrypt(data, algo, Base64.getMimeDecoder().decode(keyValue));

        }

    }
}
