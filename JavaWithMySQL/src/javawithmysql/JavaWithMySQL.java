package javawithmysql;

import java.sql.*;

public class JavaWithMySQL {

    public static void main(String[] args) {

        try {
            // Create connect object
            ConnectMySQL db = new ConnectMySQL();
            
            // Read data from table member
            Statement stm = db.connect().createStatement();
            String sql = "SELECT * FROM member";
            ResultSet rs = stm.executeQuery(sql);

            // Loop ResultSet
            System.out.println("-----------------------------------------------------------------");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" + rs.getString("fullname") + "\t" + rs.getString("email") + "\t" + rs.getString("tel"));
            }
            System.out.println("-----------------------------------------------------------------");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
