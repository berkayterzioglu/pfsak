package tr.net.terzioglu.pfsak;

import java.util.Base64;
import javax.swing.DefaultListModel;
import tr.net.terzioglu.pfsak.module.CompressConfig;

public class CompressExecutor {

    private DefaultListModel defaultListModel;

    public CompressExecutor() {
    }

    public CompressExecutor(DefaultListModel defaultListModel) {
        this.defaultListModel = defaultListModel;
    }

    public byte[] execute(CompressConfig config, byte[] data) throws Exception {

        Compress c = null;

        switch (config.getCompressionType()) {
            case GZIP:
                c = new GzipCompress();
                defaultListModel.addElement("COMPRESS -- GZIP");
                break;
            case XZ:
                c = new XZCompress();
                defaultListModel.addElement("ENCODE -- XZ");
                break;
            case ZIP:
                c = new ZipCompress();
                defaultListModel.addElement("ENCODE -- ZIP");
                break;
        }
        byte[] rs;
        if (config.isCompress()) {
            rs = c.compress(data, config.getFilName());
            defaultListModel.addElement(Base64.getMimeEncoder().encodeToString(rs));
            return rs;
        } else {
            rs = c.decompress(data, config.getFilName());
            defaultListModel.addElement(Base64.getMimeEncoder().encodeToString(rs));
            return rs;
        }

    }
}
