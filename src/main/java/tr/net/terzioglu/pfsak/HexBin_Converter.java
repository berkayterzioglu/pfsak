package tr.net.terzioglu.pfsak;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

public class HexBin_Converter {

    public byte[] hexToBinaryConverter(byte[] bytes) throws Exception {
        String s = new String(bytes);

        return Hex.decodeHex(s);
    }

    public byte[] binaryToHexConverter(byte[] bytes) {

        return Hex.encodeHexString(bytes).getBytes();
    }

}
