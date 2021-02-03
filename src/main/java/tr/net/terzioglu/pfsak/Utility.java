package tr.net.terzioglu.pfsak;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Utility {

    public static void copyStream(InputStream inxz, OutputStream op) throws IOException {
        byte[] buffer = new byte[4000];
        int n;
        do {
            n = inxz.read(buffer);
            if (n >= 0) {
                op.write(buffer, 0, n);
            }
        } while (n >= 0);
    }
}
