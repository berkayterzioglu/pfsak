package tr.net.terzioglu.pfsak;

public interface Encryption {

    byte[] encrypt(byte[] data, String algo, byte[] keySpec) throws Exception;

    byte[] decrypt(byte[] data, String algo, byte[] keySpec) throws Exception;
}
