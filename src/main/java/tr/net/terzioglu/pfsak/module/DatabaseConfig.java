package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;

public class DatabaseConfig extends ConfigBase implements UIConfig, Cloneable {

    private DatabaseConfig inverse = null;

    private String url = null;
    private String driverName = null;
    private String user = null;
    private String password = null;
    private String table = null;
    private String column = null;
    private String where = null;
    private Type databaseType = Type.SELECT;

    public enum Type {
        SELECT, UPDATE
    };

    @Override
    public void showConfigDialog(JFrame frame) {
        DatabaseConfigDialog dcd = new DatabaseConfigDialog(null, true);

        dcd.setDatabaseConfig(this);
        dcd.setLocationRelativeTo(frame);
        dcd.setVisible(true);
    }

    @Override
    public Object inverse() {
        if (inverse == null) {
            inverse = new DatabaseConfig();

            inverse.driverName = driverName;
            inverse.url = url;
            inverse.user = user;
            inverse.password = password;
            inverse.table = table;
            inverse.column = column;
            inverse.where = where;

            if (databaseType == Type.SELECT) {
                inverse.databaseType = Type.UPDATE;

            } else if (databaseType == Type.UPDATE) {
                inverse.databaseType = Type.SELECT;
            }

        }
        return inverse;
    }

    @Override
    public void updateInverse() {
        inverse.driverName = driverName;
        inverse.url = url;
        inverse.user = user;
        inverse.password = password;
        inverse.table = table;
        inverse.column = column;
        inverse.where = where;

        if (databaseType == Type.SELECT) {
            inverse.databaseType = Type.UPDATE;

        } else if (databaseType == Type.UPDATE) {
            inverse.databaseType = Type.SELECT;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DatabaseConfig clone = new DatabaseConfig();
        clone.column = column;
        clone.databaseType = databaseType;
        clone.driverName = driverName;
        clone.password = password;
        clone.table = table;
        clone.url = url;
        clone.user = user;
        clone.where = where;

        clone.inverse = inverse != null ? (DatabaseConfig) inverse.clone() : null;

        return clone;

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
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

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public Type getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(Type databaseType) {
        this.databaseType = databaseType;
    }

    public DatabaseConfig getInverse() {
        return inverse;
    }

    @Override
    public String toString() {
        return "DatabaseConfig{" + "url=" + url + ", driverName=" + driverName + ", user=" + user + ", password=" + password + ", table=" + table + ", column=" + column + ", where=" + where + ", databaseType=" + databaseType + ", inverse=" + inverse + '}';
    }

}
