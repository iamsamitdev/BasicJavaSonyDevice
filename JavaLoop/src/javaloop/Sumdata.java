package javaloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sumdata {

    public static void main(String[] args) throws IOException {
        System.out.println("โปรแกรมหาผลรวมที่ผู้ใช้ป้อนเข้ามา\n====");

        int sum = 0;
        for (int a = 1; a <= 5; a++) {
            System.out.print("Input number " +a+ ":");

            // เรียกใช้ Method รับค่าใน java
            InputStreamReader in1 = new InputStreamReader(System.in);
            BufferedReader buffer1 = new BufferedReader(in1);
            String s1 = buffer1.readLine();
            int number = Integer.parseInt(s1);
            
            sum += number;
        }

        System.out.println("====\nผลรวมที่ได้คือ: "+sum);
    }
}
