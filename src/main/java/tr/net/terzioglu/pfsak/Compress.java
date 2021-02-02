package tr.net.terzioglu.pfsak;

public interface Compress {

    byte[] compress(byte[] data, String opt) throws Exception;

    byte[] decompress(byte[] data, String opt) throws Exception;
}
