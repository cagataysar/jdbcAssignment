package com.garanti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Constants {
    public static final String USER = "BILGE";

    public static final String PASSWORD = "12345";

    public static final String URL = "jdbc:oracle:thin:@localhost:1521";

    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
