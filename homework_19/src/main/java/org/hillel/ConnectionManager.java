package org.hillel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    public static Connection getConnection()
    {
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection("jdbc:sqlite:resources/jdbc-demo.sqlite3");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return connection;
    }
}
