package jm.task.core.jdbc.util;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    final static String URL = "jdbc:mysql://127.0.0.1:3306/mydbtest?autoReconnect=true&useSSL=false&serverTimezone=UTC";

    final static String USERNAME = "root";
    final static String PASSWORD = "root1";




    public static Connection getConnection() {

        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

        return connection;
    }
    // реализуйте настройку соеденения с БД
}
