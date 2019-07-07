package javawithmysql;

import java.sql.*;

public class ConnectMySQL {
    public static Connection connect() throws SQLException, ClassNotFoundException{
            // Load Driver
            Class.forName("com.mysql.jdbc.Driver");

            // Connect Database
            String url = "jdbc:mysql://localhost/basicdb";
            java.sql.Connection connect = DriverManager.getConnection(url, "root", "1234");
            
            return connect;
    }
}
