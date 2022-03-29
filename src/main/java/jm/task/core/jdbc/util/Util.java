package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

/*класс для подключения к БД*/
public class Util {
    public static Connection getConnection() throws Exception {
        String dbURL = "jdbc:mysql://localhost:3306/mydb";
        String dbUserName = "root";
        String dbPassword = "12345";
        return DriverManager.getConnection(dbURL, dbUserName, dbPassword);
    }
}