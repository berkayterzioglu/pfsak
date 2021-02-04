package tr.net.terzioglu.pfsak;

import tr.net.terzioglu.pfsak.module.CompressConfig;

public class CompressExecutor {

    public byte[] execute(CompressConfig config, byte[] data) throws Exception {

        Compress c = null;

        switch (config.getCompressionType()) {
            case GZIP:
                c = new GzipCompress();
                break;
            case XZ:
                c = new XZCompress();
                break;
            case ZIP:
                c = new ZipCompress();
                break;
        }
        if (config.isCompress()) {
            return c.compress(data, config.getFilName());
        } else {
            return c.decompress(data, config.getFilName());

        }

    }
}
