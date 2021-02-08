package tr.net.terzioglu.pfsak;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.mail.internet.MimeUtility;

public class UU_Encode implements Encode {

    @Override
    public byte[] decode(byte[] data) throws Exception {

        InputStream inputStream = MimeUtility.decode(new ByteArrayInputStream(data), "uuencode");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        Utility.copyStream(inputStream, baos);

        return baos.toByteArray();

    }

    @Override
    public byte[] encode(byte[] data) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        OutputStream outputStream = MimeUtility.encode(baos, "uuencode");
        outputStream.write(data);
        outputStream.flush();
        outputStream.close();
        return baos.toByteArray();

    }

}
