package tr.net.terzioglu.pfsak;

import org.apache.commons.codec.binary.Hex;

public class HexBinEncode implements Encode {

    @Override
    public byte[] decode(byte[] data) throws Exception {
        String s = new String(data);
        return Hex.decodeHex(s);

    }

    @Override
    public byte[] encode(byte[] data) throws Exception {
        return Hex.encodeHexString(data).getBytes();

    }

}
