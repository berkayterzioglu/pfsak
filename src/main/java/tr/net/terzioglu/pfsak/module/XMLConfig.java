package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;

public class XMLConfig extends ConfigBase implements UIConfig {

    private XMLConfig inverse = null;

    private String XMLdata = null;

    @Override
    public void showConfigDialog(JFrame frame) {
        XMLConfigDialog xmlcd = new XMLConfigDialog(null, true);

        xmlcd.setXMLConfig(this);
        xmlcd.setLocationRelativeTo(frame);
        xmlcd.setVisible(true);
    }

    @Override
    public Object inverse() {
        if (inverse == null) {
            inverse = new XMLConfig();

            inverse.XMLdata = XMLdata;

        }
        return inverse;
    }

    @Override
    public void updateInverse() {
        inverse.XMLdata = XMLdata;

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        XMLConfig clone = new XMLConfig();

        clone.XMLdata = XMLdata;
        clone.inverse = inverse != null ? (XMLConfig) inverse.clone() : null;

        return clone;
    }

    public String getXMLdata() {
        return XMLdata;
    }

    public void setXMLdata(String XMLdata) {
        this.XMLdata = XMLdata;
    }

    public XMLConfig getInverse() {
        return inverse;
    }

    @Override
    public String toString() {
        return "XMLConfig{" + "XMLdata=" + XMLdata + '}';
    }

}
