package tr.net.terzioglu.pfsak;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static Connection connect = null;
    private static PreparedStatement statement = null;
    private static ResultSet rs = null;

    final private static String url = "jdbc:postgresql://localhost:5432/postgres";
    final private static String user = "postgres";
    final private static String pass = "bt12345";

    private Scanner sc = new Scanner(System.in);
    private int x;
    private String y;// = sc.nextLine();

//    private String y = sc.nextLine();
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

    public static void main(String[] args) throws Exception {

        System.out.println("Bir adet veris girilmesi lazım... ");
        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "postgre SQL not available", ex);
        }

//        Main obj = new Main();
//        ExCompress c = new ExCompress();
//
//        byte[] data = obj.vtTest();
//        System.out.println(Base64.getMimeEncoder().encodeToString(data));
//
//        byte[] uncompressedXZ = c.xzTestDecompressed(data);
//        System.out.println(new String(Base64.getMimeDecoder().decode(uncompressedXZ)));
//
//        byte[] compressedXZ = c.xzTestCompressed(data);
//        System.out.println(new String(Base64.getMimeDecoder().decode(compressedXZ)));
// Samples...
//        ExCompress c = new ExCompress();
//        byte[] text = "berkay terzioğlu".getBytes("Utf-8");
//        System.out.println("original: " + new String(text, "Utf-8"));
//
//        byte[] gzipcommpresResult = c.GzipFileCompress(text);
//
//        byte[] gzipdecommpresResult = c.GzipFileDecompress(gzipcommpresResult);
//        System.out.println("gzip: " + new String(gzipdecommpresResult, "Utf-8"));
//
//        byte[] xzComp = c.xzTestCompressed(text);
//
//        byte[] xzDecomp = c.xzTestDecompressed(xzComp);
//        System.out.println("xz: " + new String(xzDecomp, "Utf-8"));
//        System.out.println("********************************************");
//        byte[] zipComp = c.ZipFileCompress(text, "bbb.txt");
//        new FileOutputStream("C:/Users/ufukt/Desktop/deneme.zip").write(zipComp);
//        System.out.println("ZIP binary: " + new String(zipComp));
//
//        byte[] zipdeComp = c.ZipFileDecompress(zipComp, "bbb.txt");
//        System.out.println("ZIP: " + new String(zipdeComp, "UTF-8"));
// other Samples...
        String b = "berkay terzioğlu";
        byte[] text = b.getBytes("Utf-8");
        System.out.println("original: " + new String(text, "Utf-8"));
        HexBin_Converter hh = new HexBin_Converter();
        byte[] hex = hh.binaryToHexConverter(text);
        System.out.println("unhex : " + new String(hex, "UTF-8"));
        byte[] unhex = hh.hexToBinaryConverter(hex);
        System.out.println("hex : " + new String(unhex, "UTF-8"));
        System.out.println("hex.length = " + hex.length);
        System.out.println("unhex.length = " + unhex.length);
        System.out.println("b.length() = " + b.length());

        Compress gz = new GzipCompress();
        byte[] gzipCom = gz.compress(text, null);
        byte[] gzipDecomp = gz.decompress(gzipCom, null);
        System.out.println("gzip: " + new String(gzipDecomp, "Utf-8"));

        System.out.println("--------------------------------------------");
        System.out.println();

        Compress xz = new XZCompress();
        byte[] xzComp = xz.compress(text, null);
        byte[] xzDecomp = xz.decompress(xzComp, null);
        System.out.println("xz: " + new String(xzDecomp, "Utf-8"));

        System.out.println("********************************************");
        System.out.println();
        Compress z = new ZipCompress();
        byte[] zipComp = z.compress(text, "bbb.txt");
        new FileOutputStream("C:/Users/ufukt/Desktop/deneme.zip").write(zipComp);
        System.out.println("ZIP binary: " + new String(zipComp));

        byte[] zipdeComp = z.decompress(zipComp, "bbb.txt");
        System.out.println("ZIP: " + new String(zipdeComp, "UTF-8"));
    }

}
