package tr.net.terzioglu.pfsak;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class PBDKF2 {

    public byte[] hashPassword(String password) throws Exception {
        int iterations = 1000;
        int keyLength = 128;
        char[] chars = password.toCharArray();

        PBEKeySpec keySpec = new PBEKeySpec(chars, "istanbuluDinliyo".getBytes(), iterations, keyLength);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        return factory.generateSecret(keySpec).getEncoded();
    }

}
