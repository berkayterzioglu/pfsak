package tr.net.terzioglu.pfsak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import tr.net.terzioglu.pfsak.module.DatabaseConfig;

public class DatabaseExecutor {

    private static Connection connect = null;
    private static PreparedStatement statement = null;
    private static ResultSet rs = null;

    public byte[] execute(DatabaseConfig config, byte[] data) throws Exception {
        Class.forName(config.getDriverName());
        try ( Connection connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword())) {

            System.out.println("Connected local !!!");

            statement = connection.prepareStatement("select " + config.getColumn() + " from " + config.getTable() + " where " + config.getWhere());
            rs = statement.executeQuery();

            if (rs.next()) {

                return rs.getBytes(1);

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
}
