package tr.net.terzioglu.pfsak;

import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionProcessor implements Encryption {

    @Override
    public byte[] encrypt(byte[] data, String algo, byte[] keySpec) throws Exception {
        Key k = new SecretKeySpec(keySpec, algo);
        Cipher c = Cipher.getInstance(algo);
        c.init(Cipher.ENCRYPT_MODE, k);

        byte[] encVal = c.doFinal(data);
        return encVal;

    }

    @Override
    public byte[] decrypt(byte[] data, String algo, byte[] keySpec) throws Exception {
        Key k = new SecretKeySpec(keySpec, algo);
        Cipher c = Cipher.getInstance(algo);
        c.init(Cipher.DECRYPT_MODE, k);

        byte[] decValue = c.doFinal(data);
        return decValue;
    }

}
