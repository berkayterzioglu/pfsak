package tr.net.terzioglu.pfsak;

import java.util.Base64;

public class Encoding implements Encode {

    @Override
    public byte[] encode(byte[] data) {
        String encodedString = Base64.getEncoder().encodeToString(decode(data));
        return encodedString.getBytes();

    }

    @Override
    public byte[] decode(byte[] data) {
        byte[] decodedBytes = Base64.getDecoder().decode(data);
        return decodedBytes;

    }

}
