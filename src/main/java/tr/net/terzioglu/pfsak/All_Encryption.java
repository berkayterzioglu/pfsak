package tr.net.terzioglu.pfsak;

import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

public class All_Encryption implements Encryption {

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

    //FOR TESTING
//            String b = "berkay terzioğlu";
//        byte[] text = b.getBytes("Utf-8");
//        System.out.println("original: " + new String(text, "Utf-8"));
//
//        Random r = new Random();
//        byte[] keyValue = new byte[16];
//        r.nextBytes(keyValue);
//        Encryption ee = new AES_Encryption();
//
//        byte[] encripted = ee.encrypt(text, "AES", keyValue);
//        System.out.println(new String(encripted, "UTF-8"));
//        byte[] depcripted = ee.decrypt(encripted, "AES", keyValue);
//        System.out.println(new String(depcripted, "UTF-8"));
//        System.out.println("");
//        keyValue = new byte[8];
//        r.nextBytes(keyValue);
//        encripted = ee.encrypt(text, "DES", keyValue);
//        System.out.println(new String(encripted, "UTF-8"));
//        depcripted = ee.decrypt(encripted, "DES", keyValue);
//        System.out.println(new String(depcripted, "UTF-8"));
//        System.out.println("");
//        keyValue = new byte[24];
//        r.nextBytes(keyValue);
//        encripted = ee.encrypt(text, "DESede", keyValue);
//        System.out.println(new String(encripted, "UTF-8"));
//        depcripted = ee.decrypt(encripted, "DESede", keyValue);
//        System.out.println(new String(depcripted, "UTF-8"));
}
