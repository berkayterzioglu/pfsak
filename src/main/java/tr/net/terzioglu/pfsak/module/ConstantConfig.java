package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;
import tr.net.terzioglu.pfsak.module.UIConfig;

public class ConstantConfig extends ConfigBase implements UIConfig, Cloneable {

    private ConstantConfig inverse = null;

    private String data = null;

    @Override
    public void showConfigDialog(JFrame frame) {
        ConstantConfigDialog cd = new ConstantConfigDialog(null, true);

        cd.setConstantConfig(this);
        cd.setLocationRelativeTo(frame);
        cd.setVisible(true);
    }

    @Override
    public Object inverse() {
        if (inverse == null) {
            inverse = new ConstantConfig();

            inverse.data = data;
        }
        return inverse;
    }

    @Override
    public void updateInverse() {
        inverse.data = data;

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ConstantConfig clone = new ConstantConfig();
        clone.data = data;
        
        clone.inverse = inverse != null ? (ConstantConfig) inverse.clone() : null;

        return clone;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public ConstantConfig getInverse() {
        return inverse;
    }

    @Override
    public String toString() {
        return "ConstantConfig{Data=" + data + '}';
    }

}
