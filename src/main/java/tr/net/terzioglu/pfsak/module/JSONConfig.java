package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;

public class JSONConfig extends ConfigBase implements UIConfig {

    private JSONConfig inverse = null;

    private String JSonData = null;

    @Override
    public void showConfigDialog(JFrame frame) {
        JSONConfigDialog configDialog = new JSONConfigDialog(null, true);

        configDialog.setJSONConfig(this);
        configDialog.setLocationRelativeTo(frame);
        configDialog.setVisible(true);
    }

    @Override
    public Object inverse() {
        if (inverse == null) {
            inverse = new JSONConfig();

            inverse.JSonData = JSonData;

        }
        return inverse;
    }

    @Override
    public void updateInverse() {
        inverse.JSonData = JSonData;

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        JSONConfig clone = new JSONConfig();

        clone.JSonData = JSonData;
        clone.inverse = inverse != null ? (JSONConfig) inverse.clone() : null;

        return clone;
    }

    public String getJSonData() {
        return JSonData;
    }

    public void setJSonData(String JSonData) {
        this.JSonData = JSonData;
    }

    public JSONConfig getInverse() {
        return inverse;
    }

    @Override
    public String toString() {
        return "JSONConfig{" + "JSonData=" + JSonData + '}';
    }

}
