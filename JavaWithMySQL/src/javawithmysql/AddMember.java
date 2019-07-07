package javawithmysql;

import java.sql.Statement;

public class AddMember {

    public static void main(String[] args) {
        try {
            // Create connect object
            ConnectMySQL db = new ConnectMySQL();

            // Add data to table member
            Statement stm = db.connect().createStatement();
            String sql = "INSERT INTO member(fullname,email,tel) VALUES('somchi','somchai@gmail.com','08939289282')";
            int result = stm.executeUpdate(sql);

            if (result == 1) {
                if (result == 1) {
                    System.out.println("Add member success");
                } else {
                    System.out.println("Add member fail");
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
