package tr.net.terzioglu.pfsak;

import java.util.Base64;
import javax.swing.DefaultListModel;
import tr.net.terzioglu.pfsak.module.FileConfig;

public class FileExecutor {

    private DefaultListModel defaultListModel;

    public FileExecutor() {
    }

    public FileExecutor(DefaultListModel defaultListModel) {
        this.defaultListModel = defaultListModel;
    }

    public byte[] execute(FileConfig config, byte[] data) throws Exception {

        FileProcessor fp = new FileProcessor();

        switch (config.getFileType()) {

            case READ:
                byte[] rs;
                defaultListModel.addElement("FILE Reading...");
                rs = fp.read(config.getFileName());
                defaultListModel.addElement(Base64.getMimeEncoder().encodeToString(rs));
                return rs;

            case WRITE:
                defaultListModel.addElement("FILE Writing...");
                rs = fp.write(config.getFileName(), data);
                defaultListModel.addElement(Base64.getMimeEncoder().encodeToString(rs));
                return rs;
        }

        return null;

    }

}
