package singleton;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ramesha
 */
public class TestRun {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        long start;
        long end;

        start = System.currentTimeMillis();
        Connection jdbc = JDBC.getConnection();
        end = System.currentTimeMillis();
        System.out.println(jdbc);
        System.out.println(end-start);

        start = System.currentTimeMillis();
        Connection jdbc1 = JDBC.getConnection();
        end = System.currentTimeMillis();
        System.out.println(jdbc1);
        System.out.println(end-start);
    }
}
