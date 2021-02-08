package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;

public class DatabaseConfig implements UIConfig {

    private String url = null;
    private String driverName = null;
    private String user = null;
    private String password = null;
    private String table = null;
    private String column = null;
    private String where = null;

    @Override
    public void showConfigDialog(JFrame frame) {
        DatabaseConfigDialog dcd = new DatabaseConfigDialog(null, true);

        dcd.setDatabaseConfig(this);
        dcd.setLocationRelativeTo(frame);
        dcd.setVisible(true);
    }

    @Override
    public Object inverse() {
//  I do not insert  database;
        return this;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    @Override
    public String toString() {
        return "DatabaseConfig{" + "url=" + url + ", driverName=" + driverName + ", user=" + user + ", password=" + password + ", table=" + table + ", column=" + column + ", where=" + where + '}';
    }

    @Override
    public void updateInverse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
