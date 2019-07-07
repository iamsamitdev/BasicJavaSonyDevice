package javafile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class JavaFile {

    public static void main(String[] args) {

        try {

            // File Compair
            File file1 = new File("C:/File/demo1.txt");
            File file2 = new File("C:/File/demo1.txt");

            if (file1.compareTo(file2) == 0) {
                System.out.println("Both path are same");
            } else {
                System.out.println("Path are not same");
            }

            // file1.delete(); // การลบไฟล์
            
            // การสร้างไฟล์ใหม่
            if(file1.createNewFile()){
                System.out.println("Create file success");
                
                // เขียนข้อมูลลงในไฟล์
                /*
                BufferedWriter out = new BufferedWriter(new FileWriter(file1,true));
                out.write("Welcome to Java basic lerning\r\n");
                out.write("ยินดีต้อนรับการเรียนจาวาพื้นฐาน\r\n");
                out.close();
                System.out.println("Write file success");
                */
                
            }else{
                System.out.println("Error , File alread exists.");
            }
            
             // เขียนข้อมูลลงในไฟล์
                BufferedWriter out = new BufferedWriter(new FileWriter(file1,true));
                out.write("Welcome to Java basic lerning\r\n");
                out.write("ยินดีต้อนรับการเรียนจาวาพื้นฐาน\r\n");
                out.close();
                System.out.println("Write file success");
            
        } catch (Exception e) {
              System.out.println(e);
        }
    }

}
