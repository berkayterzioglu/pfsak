package tr.net.terzioglu.pfsak;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.tukaani.xz.LZMA2Options;
import org.tukaani.xz.XZInputStream;
import org.tukaani.xz.XZOutputStream;

public class XZCompress implements Compress {

    @Override
    public byte[] compress(byte[] data, String opt) throws IOException {

        LZMA2Options lzma2 = new LZMA2Options();

        ByteArrayOutputStream outfile = new ByteArrayOutputStream();
        XZOutputStream outxz = new XZOutputStream(outfile, lzma2);

        outxz.write(data);
        outxz.close();

        return outfile.toByteArray();
    }

    @Override
    public byte[] decompress(byte[] data, String opt) throws IOException {
        InputStream infile = new ByteArrayInputStream(data);
        XZInputStream inxz = new XZInputStream(infile);

        ByteArrayOutputStream op = new ByteArrayOutputStream();
        Utility.copyStream(inxz, op);

        return op.toByteArray();
    }

}
