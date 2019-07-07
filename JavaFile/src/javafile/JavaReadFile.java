package javafile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:/File/demo1.txt");
            
            BufferedReader in = new BufferedReader(new FileReader(file));
            
            String str;
            while ((str = in.readLine()) != null) {                
                System.out.println(str);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
