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

    private FileConfig inverse = null;

    @Override
    public Object inverse() {
        if (inverse == null) {
            inverse = new FileConfig();

            inverse.fileName = fileName;

            if (fileType == Type.READ) {
                inverse.fileType = Type.WRITE;

            } else if (fileType == Type.WRITE) {
                inverse.fileType = Type.READ;
            }
        }

        return inverse;

    }

    @Override
    public void updateInverse() {
        inverse.fileName = fileName;
        if (fileType == Type.READ) {
            inverse.fileType = Type.WRITE;

        } else if (fileType == Type.WRITE) {
            inverse.fileType = Type.READ;
        }
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
        return "FileConfig{" + "File Name=" + fileName + ", fileType=" + fileType + '}';
    }

}
