package tr.net.terzioglu.pfsak;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Base64;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import org.tukaani.xz.XZInputStream;

public class Main {

    private static Connection connect = null;
    private static PreparedStatement statement = null;
    private static ResultSet rs = null;

    final private static String url = "jdbc:postgresql://localhost:5432/postgres";
    final private static String user = "postgres";
    final private static String pass = "bt12345";

    private Scanner sc = new Scanner(System.in);

    private int x;
    private String y = sc.nextLine();

    public static void main(String[] args) throws SQLException, IOException {
        System.out.println("Bir adet objcontent verisi girilmesi lazım... ");
        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "posthre sql no available", ex);
        }

        Main obj = new Main();
        byte[] data = obj.vtTest();
        System.out.println(Base64.getMimeEncoder().encodeToString(data));

        byte[] uncompressed = obj.xzTest(data);
        System.out.println(new String(Base64.getMimeDecoder().decode(uncompressed)));
    }

    private byte[] vtTest() {
        try ( Connection connection = DriverManager.getConnection(url, user, pass)) {

            System.out.println("Connected local !!!");

            statement = connection.prepareStatement("select objcontent from objectstore_2023 where objectid = ?");
            statement.setString(1, y);
            rs = statement.executeQuery();

            if (rs.next()) {

                return rs.getBytes("objcontent");

            }

        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();

        } finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

    public static byte[] convert(String s) {

        int len = s.length();
        byte[] data = new byte[len / 2];

        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }

    private byte[] xzTest(byte[] data) throws FileNotFoundException, IOException {
        // decompress etmem lazım        
        InputStream infile = new ByteArrayInputStream(data);
        XZInputStream inxz = new XZInputStream(infile);

        ByteArrayOutputStream op = new ByteArrayOutputStream();
        byte[] buffer = new byte[4000];
        int n;
        do {
            n = inxz.read(buffer);
            if (n >= 0) {
                op.write(buffer, 0, n);
            }
        } while (n >= 0);

        return op.toByteArray();
    }

}
