package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;

public class EncryptConfig implements UIConfig {

    private EncryptConfig inverse = null;

    private String keyValue = null;
    private boolean encrypt = true; // false = deEncrypt
    private Type encryptionType = Type.AES;

    public enum Type {
        AES, DES, TRIPLE_DES
    }

    @Override
    public void showConfigDialog(JFrame frame) {
        EncryptConfigDialog ecd = new EncryptConfigDialog(null, true);

        ecd.setEncryptConfig(this);
        ecd.setLocationRelativeTo(frame);
        ecd.setVisible(true);
    }

    @Override
    public Object inverse() {
        if (inverse == null) {
            inverse = new EncryptConfig();

            inverse.encrypt = !encrypt;
            inverse.encryptionType = encryptionType;
            inverse.keyValue = keyValue;
        }

        return inverse;
    }

    @Override
    public void updateInverse() {

        inverse.encrypt = !encrypt;
        inverse.encryptionType = encryptionType;
        inverse.keyValue = keyValue;

    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public Type getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(Type encryptionType) {
        this.encryptionType = encryptionType;
    }

    public boolean isEncrypt() {
        return encrypt;
    }

    public void setEncrypt(boolean encrypt) {
        this.encrypt = encrypt;
    }

    @Override
    public String toString() {
        return "EncryptConfig{" + "File Name=" + keyValue + ", encryptionType=" + encryptionType + ", encrypt=" + encrypt + '}';
    }

}
