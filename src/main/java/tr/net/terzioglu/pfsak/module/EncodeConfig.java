package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;

public class EncodeConfig implements UIConfig, Cloneable {

    private EncodeConfig inverse = null;

    private boolean encode = true; // false = deEncode
    private Type encodeType = Type.BASE64;

    public enum Type {
        BASE64, HEXBIN, UU
    }

    @Override
    public void showConfigDialog(JFrame frame) {
        EncodeConfigDialog ecd = new EncodeConfigDialog(null, true);

        ecd.setEncodeConfig(this);
        ecd.setLocationRelativeTo(frame);
        ecd.setVisible(true);
    }

    @Override
    public Object inverse() {

        if (inverse == null) {
            inverse = new EncodeConfig();

            inverse.encodeType = encodeType;
            inverse.encode = !encode;

        }
        return inverse;
    }

    @Override
    public void updateInverse() {

        inverse.encodeType = encodeType;
        inverse.encode = !encode;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        EncodeConfig clone = new EncodeConfig();
        clone.encode = encode;
        clone.encodeType = encodeType;
        clone.inverse = inverse != null ? (EncodeConfig) inverse.clone() : null;

        return clone;
    }

    public EncodeConfig getInverse() {
        return inverse;
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
        return "EncodeConfig{" + "encodeType=" + encodeType + ", encode=" + encode + '}';
    }

}
