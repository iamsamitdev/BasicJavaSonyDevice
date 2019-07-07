package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQL {
    public static Connection connect() throws SQLException, ClassNotFoundException{
            // Load Driver
            Class.forName("com.mysql.jdbc.Driver");

            // Connect Database
            String url = "jdbc:mysql://localhost/basicdb?useUnicode=true&characterEncoding=UTF-8";
            java.sql.Connection connect = DriverManager.getConnection(url, "root", "1234");
            
            return connect;
    }
}
