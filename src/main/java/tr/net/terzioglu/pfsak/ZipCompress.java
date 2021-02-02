package tr.net.terzioglu.pfsak;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipCompress implements Compress {

    @Override
    public byte[] compress(byte[] data, String opt) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipOutputStream zos = new ZipOutputStream(baos);

        ZipEntry entry = new ZipEntry(opt);

        entry.setSize(data.length);

        zos.putNextEntry(entry);
        zos.write(data);
        zos.closeEntry();
        zos.close();
        return baos.toByteArray();
    }

    @Override
    public byte[] decompress(byte[] data, String opt) throws Exception {
        try ( ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(data))) {
            ZipEntry zipEntry = zis.getNextEntry();
            while (zipEntry != null) {
                if (zipEntry.getName().equals(opt)) {
                    ByteArrayOutputStream fos = new ByteArrayOutputStream();
                    int len;
                    byte[] buffer = new byte[1024];

                    while ((len = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, len);
                    }
                    zis.closeEntry();
                    return fos.toByteArray();
                }
                zis.closeEntry();

                zipEntry = zis.getNextEntry();
            }
        }
        return null;
    }

}
