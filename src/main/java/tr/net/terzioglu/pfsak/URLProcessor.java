package tr.net.terzioglu.pfsak;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import tr.net.terzioglu.pfsak.module.URLConfig;

public class URLProcessor {

    public byte[] getURL(byte[] data, URLConfig config) throws Exception {

        URL url = new URL(config.getUrlAddress());
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        return copyStream(connection);

    }

    public byte[] postURL(byte[] data, URLConfig config) throws Exception {
        int dataLength = data.length;

        URL url = new URL(config.getUrlAddress());
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setDoOutput(true);
        connection.setInstanceFollowRedirects(true);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", config.getContentType());

        if (config.getVariable() != null && !config.getVariable().isEmpty()) {
            connection.getOutputStream().write(config.getVariable().getBytes("UTF-8"));
            connection.getOutputStream().write("=".getBytes());
        }

        connection.getOutputStream().write(URLEncoder.encode(new String(data), "ISO-8859-1").getBytes());
        return copyStream(connection);

    }

    public byte[] putURL(byte[] data, URLConfig config) throws Exception {

        URL url = new URL(config.getUrlAddress());

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setDoOutput(true);
        connection.setInstanceFollowRedirects(true);
        connection.setRequestMethod("PUT");
        connection.setRequestProperty("Content-Type", config.getContentType());

        if (config.getVariable() != null && !config.getVariable().isEmpty()) {
            connection.getOutputStream().write(config.getVariable().getBytes("UTF-8"));
            connection.getOutputStream().write("=".getBytes());
        }
        connection.getOutputStream().write(URLEncoder.encode(new String(data), "ISO-8859-1").getBytes());
        return copyStream(connection);

    }

    private byte[] copyStream(HttpURLConnection connection) throws IOException {
        InputStream is = connection.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int res = 0;
        byte buf[] = new byte[1024];
        while (res >= 0) {
            res = is.read(buf, 0, buf.length);
            if (res > 0) {
                baos.write(buf, 0, res);
            }
        }
        return baos.toByteArray();
    }

}
