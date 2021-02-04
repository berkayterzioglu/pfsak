package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;

public class FileConfig implements UIConfig {

    @Override
    public void showConfigDialog(JFrame frame) {
        FileConfigDialog fcd = new FileConfigDialog(null, true);

        fcd.setFileConfig(this);
        fcd.setLocationRelativeTo(frame);
        fcd.setVisible(true);
    }

    public enum Type {
        READ, WRITE
    }

    private String fileName = null;
    private Type fileType = Type.READ;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Type getFileType() {
        return fileType;
    }

    public void setFileType(Type fileType) {
        this.fileType = fileType;
    }

    @Override
    public String toString() {
        return "FileConfig{" + "fileName=" + fileName + ", fileType=" + fileType + '}';
    }

}
