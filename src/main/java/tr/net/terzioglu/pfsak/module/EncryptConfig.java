package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;

public class EncryptConfig implements UIConfig {

    @Override
    public void showConfigDialog(JFrame frame) {
        EncryptConfigDialog ecd = new EncryptConfigDialog(null, true);

        ecd.setEncryptConfig(this);
        ecd.setLocationRelativeTo(frame);
        ecd.setVisible(true);
    }

    public enum Type {
        AES, DES, TRIPLE_DES
    }

    private String keyValue = null;
    private Type encryptionType = Type.AES;
    private boolean encrypt = true; // false = deEncrypt

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
        return "EncryptConfig{" + "fileName=" + keyValue + ", encryptionType=" + encryptionType + ", encrypt=" + encrypt + '}';
    }

}
