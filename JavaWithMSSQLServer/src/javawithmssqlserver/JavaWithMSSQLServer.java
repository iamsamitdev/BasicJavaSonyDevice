package javawithmssqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaWithMSSQLServer {

    public static void main(String[] args) {
        Connection connect;
        
        try {

            String dbURL = "jdbc:sqlserver://DESKTOP-5KFFN0F;databaseName=OnlineStore";
            String user = "sa";
            String pass = "377040";
            
            connect = DriverManager.getConnection(dbURL, user, pass);
            
            // เช็คว่าเชื่อมต่อได้หรือไม่
            if(connect != null){
                System.out.println("Connect to sql server success");
                
                 Statement stm = connect.createStatement();
                
                // Select from table [Customers]
                String sql = "SELECT * FROM Customer";
                ResultSet rs = stm.executeQuery(sql);
                
                // Loop data
                System.out.println("------------------------------------------------");
                while(rs.next()){
                    System.out.println("ID: "+rs.getInt("CustomerId")+"  Firstname: "+rs.getString("FirstName"));
                }
                System.out.println("------------------------------------------------");
            }else{
                System.out.println("Connection fail !!!");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
