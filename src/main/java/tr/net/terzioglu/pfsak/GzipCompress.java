package tr.net.terzioglu.pfsak;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GzipCompress implements Compress {

    @Override
    public byte[] compress(byte[] data, String opt) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(data.length);
        GZIPOutputStream gzip = new GZIPOutputStream(bos);

        gzip.write(data);
        gzip.close();
        byte[] compressed = bos.toByteArray();
        bos.close();
        return compressed;
    }

    @Override
    public byte[] decompress(byte[] data, String opt) throws Exception {
        ByteArrayInputStream bytein = new ByteArrayInputStream(data);
        GZIPInputStream gzin = new GZIPInputStream(bytein);

        ByteArrayOutputStream byteout = new ByteArrayOutputStream();

        int res = 0;
        byte buf[] = new byte[1024];
        while (res >= 0) {
            res = gzin.read(buf, 0, buf.length);
            if (res > 0) {
                byteout.write(buf, 0, res);
            }
        }
        byte uncompressed[] = byteout.toByteArray();
        return uncompressed;
    }

}
