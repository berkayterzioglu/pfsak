package tr.net.terzioglu.pfsak;

import tr.net.terzioglu.pfsak.module.EncodeConfig;

public class EncodeExecutor {

    public byte[] execute(EncodeConfig config, byte[] data) throws Exception {

        Encode e = null;

        switch (config.getEncodeType()) {
            case BASE64:
                e = new Base64_Encode();
                break;
            case HEXBIN:
                e = new HexBin_Encode();
                break;
            case UU:
                e = new UU_Encode();
                break;
        }

        if (config.isEncode()) {
            return e.encode(data);
        } else {
            return e.decode(data);

        }

    }
}
