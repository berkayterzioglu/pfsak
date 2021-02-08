package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;

public class CompressConfig implements UIConfig {

    @Override
    public void showConfigDialog(JFrame frame) {
        CompressConfigDialog ccd = new CompressConfigDialog(frame, true);

        ccd.setCompressConfig(this);
        ccd.setLocationRelativeTo(frame);
        ccd.setVisible(true);

    }

    private CompressConfig inverse = null;

    @Override
    public Object inverse() {
        if (inverse == null) {
            inverse = new CompressConfig();

            inverse.compress = !compress;
            inverse.filName = filName;
            inverse.compressionType = compressionType;
        }
        return inverse;
    }

    @Override
    public void updateInverse() {
        inverse.compress = !compress;
        inverse.filName = filName;
        inverse.compressionType = compressionType;
    }

    public enum Type {
        XZ, GZIP, ZIP
    };
    private String filName = null;
    private Type compressionType = Type.XZ;
    private boolean compress = true; // false = decompress

    public Type getCompressionType() {
        return compressionType;
    }

    public void setCompressionType(Type compressionType) {
        this.compressionType = compressionType;
    }

    public boolean isCompress() {
        return compress;
    }

    public void setCompress(boolean compress) {
        this.compress = compress;
    }

    public String getFilName() {
        return filName;
    }

    public void setFilName(String filName) {
        this.filName = filName;
    }

    @Override
    public String toString() {
        return "CompressConfig{" + "Fiel Name=" + filName + ", compressionType=" + compressionType + ", compress=" + compress + '}';
    }

}
