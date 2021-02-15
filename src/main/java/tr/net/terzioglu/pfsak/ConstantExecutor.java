package tr.net.terzioglu.pfsak;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import tr.net.terzioglu.pfsak.module.ConstantConfig;

public class ConstantExecutor {

    private DefaultListModel defaultListModel;

    public ConstantExecutor() {

    }

    public ConstantExecutor(DefaultListModel printListModel) {
        this.defaultListModel = printListModel;

    }

    public byte[] execute(ConstantConfig config, byte[] data) {
        defaultListModel.addElement("CONSTANT Data...");

        try {
            return config.getData().getBytes("UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ConstantExecutor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return config.getData().getBytes();
    }

}
