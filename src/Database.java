import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by INSICT on 06.02.14.
 */
public class Database {

    private String pass = "SecurityMaster08";
    private String login = "sa";
    private String ip = "192.168.56.102";
    private String dbName = "SecurePerfect";

    public Database() {
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        String url = "jdbc:jtds:sqlserver://" + ip + "/" + dbName + ";instance=SPSQL;user=" + login + ";password=" + pass
                + ";";
        return DriverManager.getConnection(url);
    }

    public boolean testConnection() {
        Connection conn = null;
        try {
            conn = getConnection();
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}
