package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;

public class EncodeConfig implements UIConfig {

    @Override
    public void showConfigDialog(JFrame frame) {
        EncodeConfigDialog ecd = new EncodeConfigDialog(null, true);

        ecd.setEncodeConfig(this);
        ecd.setLocationRelativeTo(frame);
        ecd.setVisible(true);
    }

    public enum Type {
        BASE64, HEXBIN, UU
    }

    private String fileName;
    private Type encodeType;
    private boolean encode; // false = deEncode

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Type getEncodeType() {
        return encodeType;
    }

    public void setEncodeType(Type encodeType) {
        this.encodeType = encodeType;
    }

    public boolean isEncode() {
        return encode;
    }

    public void setEncode(boolean encode) {
        this.encode = encode;
    }

    @Override
    public String toString() {
        return "EncodeConfig{" + "fileName=" + fileName + ", encodeType=" + encodeType + ", encode=" + encode + '}';
    }

}
