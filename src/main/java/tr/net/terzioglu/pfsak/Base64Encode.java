package tr.net.terzioglu.pfsak;

import java.util.Base64;

public class Base64Encode implements Encode {

    @Override
    public byte[] encode(byte[] data) {
        byte[] encodedBytes = Base64.getMimeEncoder(-1, new byte[0]).encode(data);
        return encodedBytes;

    }

    @Override
    public byte[] decode(byte[] data) {
        byte[] decodedBytes = Base64.getMimeDecoder().decode(data);
        return decodedBytes;

    }

}
