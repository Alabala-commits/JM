package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
                                                    //  127.0.0.1
    private static final String URL      = "jdbc.mysql://localhost:3306/testbase";
    private static final String LOGIN    = "root";
    private static final String PASSWORD = "Password";

    public static Connection connection() throws SQLException, ClassNotFoundException {
        return DriverManager.getConnection(URL, LOGIN, PASSWORD);
    }
}
