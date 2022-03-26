package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*класс для подключения к БД*/
public class Util {
    private static final String dbURL = "jdbc:mysql://localhost:3306/mydb";
    private static final String dbUserName = "root";
    private static final String dbPassword = "12345";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
