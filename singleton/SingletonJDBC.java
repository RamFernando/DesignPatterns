package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SingletonJDBC {

    private static volatile Connection connection;
    
    private SingletonJDBC(){}
    
    public static void createMyConnection()throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/foodcity", "root", "123");
    }
    
    public static void  iud(String sql) throws Exception{
        if (connection==null) {
            createMyConnection();
        }
        connection.createStatement().executeUpdate(sql);
    }
    
    public static ResultSet search(String sql) throws SQLException, ClassNotFoundException{
        if (connection==null) {
            createMyConnection();
        }
        return connection.createStatement().executeQuery(sql);
    }
    
    public static Connection getMyConnection() throws SQLException, ClassNotFoundException{
        Connection connection = SingletonJDBC.connection;
        if (connection==null) {
            synchronized(Connection.class){
                connection = SingletonJDBC.connection;
                if (connection == null) {
                    createMyConnection();
                }
            }
        }
        return connection;
    }

}
