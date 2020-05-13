package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ramesha
 */
public class JDBC {

    private static volatile Connection connection;

    private JDBC() {
        if (connection != null) {
            throw new RuntimeException("Please use getConnection method");
        }
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null) {
            synchronized (Connection.class) {
                if (connection == null) {
                    Class.forName("com.mysql.jdbc.Driver");
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "ramesha", "1234");
                }
            }
        }
        return connection;
    }

}
