package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;

public class CompressConfig implements UIConfig {

    private CompressConfig inverse = null;

    private String fileName = null;
    private boolean compress = true; // false = decompress
    private Type compressionType = Type.XZ;

    public enum Type {
        XZ, GZIP, ZIP
    };

    @Override
    public void showConfigDialog(JFrame frame) {
        CompressConfigDialog ccd = new CompressConfigDialog(frame, true);

        ccd.setCompressConfig(this);
        ccd.setLocationRelativeTo(frame);
        ccd.setVisible(true);

    }

    @Override
    public Object inverse() {
        if (inverse == null) {
            inverse = new CompressConfig();

            inverse.compress = !compress;
            inverse.fileName = fileName;
            inverse.compressionType = compressionType;
        }
        return inverse;
    }

    @Override
    public void updateInverse() {
        inverse.compress = !compress;
        inverse.fileName = fileName;
        inverse.compressionType = compressionType;
    }

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
        return fileName;
    }

    public void setFilName(String filName) {
        this.fileName = filName;
    }

    @Override
    public String toString() {
        return "CompressConfig{" + "File Name=" + fileName + ", compressionType=" + compressionType + ", compress=" + compress + '}';
    }

}
