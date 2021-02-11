package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;

public class URLConfig implements UIConfig {

    private URLConfig inverse = null;

    private String urlAddress = null;
    private String contentType = null;
    private Type fileType = Type.GET;

    public enum Type {
        GET, POST, PUT
    }

    @Override
    public void showConfigDialog(JFrame frame) {
        URLConfigDialog urlcd = new URLConfigDialog(null, true);

        urlcd.setUrlConfıg(this);
        urlcd.setLocationRelativeTo(frame);
        urlcd.setVisible(true);
    }

    @Override
    public Object inverse() {
        if (inverse == null) {
            inverse = new URLConfig();

            inverse.urlAddress = urlAddress;
            inverse.fileType = Type.GET;
            inverse.contentType = contentType;

        }
        return inverse;
    }

    @Override
    public void updateInverse() {
        inverse.urlAddress = urlAddress;
        inverse.fileType = Type.GET;
        inverse.contentType = contentType;

    }

    public String getUrlAddress() {
        return urlAddress;
    }

    public void setUrlAddress(String urlAddress) {
        this.urlAddress = urlAddress;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Type getFileType() {
        return fileType;
    }

    public void setFileType(Type fileType) {
        this.fileType = fileType;
    }

    public URLConfig getInverse() {
        return inverse;
    }

    public void setInverse(URLConfig inverse) {
        this.inverse = inverse;
    }

    @Override
    public String toString() {
        return "URLConfig{" + "urlAddress=" + urlAddress + ", contentType=" + contentType + ", fileType=" + fileType + '}';
    }

}
