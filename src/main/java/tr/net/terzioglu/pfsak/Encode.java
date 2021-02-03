package tr.net.terzioglu.pfsak;

public interface Encode {

    byte[] decode(byte[] data) throws Exception;

    byte[] encode(byte[] data) throws Exception;
}
