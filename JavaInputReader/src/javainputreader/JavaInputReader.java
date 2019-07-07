package javainputreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInputReader {

    public static void main(String[] args) throws IOException {

        /*
         System.out.print("Enter your weight: ");
         
         // เรียกใช้ Method รับค่าใน java
         InputStreamReader in1 = new InputStreamReader(System.in);
         BufferedReader buffer1 = new BufferedReader(in1);
         String s1 = buffer1.readLine();
         int weight = Integer.parseInt(s1); // Convert String to interger
         
         System.out.println("I Geuss your weight is "+ (weight+5 )+ " kg. in next month");
         */
        System.out.print("ป้อนรัศมีของวงกลม: ");

        // เรียกใช้ Method รับค่าใน java
        InputStreamReader in1 = new InputStreamReader(System.in);
        BufferedReader buffer1 = new BufferedReader(in1);

        String s1 = buffer1.readLine();
        int number1 = Integer.parseInt(s1);

        double area = Math.PI * Math.pow(number1, 2);

        System.out.println(String.format("พื้นที่วงกลมนี้คือ: %.2f ", area));
        
    }

}
