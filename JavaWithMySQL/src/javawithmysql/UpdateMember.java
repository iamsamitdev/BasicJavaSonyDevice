package javawithmysql;

import java.sql.Statement;

public class UpdateMember {
    public static void main(String[] args) {
         try {
            // Create connect object
            ConnectMySQL db = new ConnectMySQL();

            // Add data to table member
            Statement stm = db.connect().createStatement();
            String sql = "UPDATE member SET fullname='John Doe',email='john@gmail.com', tel='093898393' WHERE id='3'";
            int result = stm.executeUpdate(sql);

            if (result == 1) {
                if (result == 1) {
                    System.out.println("Update member success");
                } else {
                    System.out.println("Update member fail");
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
     
}
