package javafile;

import java.io.File;

public class JavaDirectory {
    public static void main(String[] args) {
        String directory = "C:/Java";
        File file = new File(directory);
        
        boolean result = file.mkdirs(); // สร้างโฟลเดอร์
        System.out.println("Create directory success");
        
        // ลบ directory
        file.delete(); // ลบโฟลเดอร์
    }
}
