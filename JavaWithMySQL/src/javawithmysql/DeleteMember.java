package javawithmysql;

import java.sql.Statement;

public class DeleteMember {
    public static void main(String[] args) {
         try {
            // Create connect object
            ConnectMySQL db = new ConnectMySQL();

            // Add data to table member
            Statement stm = db.connect().createStatement();
            String sql = "DELETE FROM member WHERE id='3'";
            int result = stm.executeUpdate(sql);

            if (result == 1) {
                if (result == 1) {
                    System.out.println("Delete member success");
                } else {
                    System.out.println("Delete member fail");
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
