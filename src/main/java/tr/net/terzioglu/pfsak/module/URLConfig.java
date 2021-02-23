package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;

public class URLConfig extends ConfigBase implements UIConfig {

    private URLConfig inverse = null;

    private String urlAddress = null;
    private String variable = null;
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
            inverse.variable = variable;
            inverse.fileType = Type.GET;
            inverse.contentType = contentType;

        }
        return inverse;
    }

    @Override
    public void updateInverse() {
        inverse.urlAddress = urlAddress;
        inverse.variable = variable;
        inverse.fileType = Type.GET;
        inverse.contentType = contentType;

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        URLConfig clone = new URLConfig();
        clone.contentType = contentType;
        clone.fileType = fileType;
        clone.urlAddress = urlAddress;
        clone.variable = variable;
        clone.inverse = inverse != null ? (URLConfig) inverse.clone() : null;

        return clone;
    }

    public URLConfig getInverse() {
        return inverse;
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

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "URLConfig{" + "urlAddress=" + urlAddress + ", variable=" + variable + ", contentType=" + contentType + ", fileType=" + fileType + '}';
    }

}
