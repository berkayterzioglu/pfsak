package tr.net.terzioglu.pfsak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import tr.net.terzioglu.pfsak.module.DatabaseConfig;

public class DatabaseExecutor {

    private DefaultListModel defaultListModel;

    public DatabaseExecutor() {

    }

    public DatabaseExecutor(DefaultListModel defaultListModel) {
        this.defaultListModel = defaultListModel;
    }

    public void writeDatabase(DatabaseConfig config, byte[] data) throws Exception {
        Class.forName(config.getDriverName());
        PreparedStatement statement = null;

        try ( Connection connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword())) {
            statement = connection.prepareStatement("update " + config.getTable() + " set " + config.getColumn() + "=? where " + config.getWhere());
            statement.setBytes(1, data);
            int x = statement.executeUpdate();
            if (x == 1) {
                defaultListModel.addElement("DATABASE: Successfully Inserted");
            } else {
                defaultListModel.addElement("DATABASE: Not Inserted!");
            }
        } catch (SQLException e) {
            defaultListModel.addElement("DATABASE: Connection failure.");
            e.printStackTrace();

        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NoMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public byte[] execute(DatabaseConfig config, byte[] data) throws Exception {
        Class.forName(config.getDriverName());
        PreparedStatement statement = null;
        ResultSet rs = null;
        try ( Connection connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword())) {

            defaultListModel.addElement("DATABASE: Connected local !!!");

            statement = connection.prepareStatement("select " + config.getColumn() + " from " + config.getTable() + " where " + config.getWhere());
            rs = statement.executeQuery();

            if (rs.next()) {

                return rs.getBytes(1);

            }

        } catch (SQLException e) {
            defaultListModel.addElement("DATABASE: Connection failure.");
            e.printStackTrace();

        } finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NoMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NoMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }
}
