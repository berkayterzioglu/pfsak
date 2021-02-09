package tr.net.terzioglu.pfsak;

import java.util.Base64;
import javax.swing.DefaultListModel;
import tr.net.terzioglu.pfsak.module.RegExConfig;

public class RegExExecutor {

    private DefaultListModel defaultListModel;

    public RegExExecutor() {
    }

    public RegExExecutor(DefaultListModel defaultListModel) {
        this.defaultListModel = defaultListModel;
    }

    public byte[] execute(RegExConfig config, byte[] data) throws Exception {

        RegEx ex = new RegEx();

        defaultListModel.addElement("REGEX Seaching...");

        byte[] rs = ex.pattern(data, config.getSearch());
        defaultListModel.addElement("RegEx: " + Base64.getMimeEncoder().encodeToString(rs));

        return rs;
    }
}
