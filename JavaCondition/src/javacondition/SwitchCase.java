package javacondition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCase {

    public static void main(String[] args) throws IOException {
        System.out.print("Enter number of month : ");
        InputStreamReader in1 = new InputStreamReader(System.in);
        BufferedReader buf1 = new BufferedReader(in1);
        String s1 = buf1.readLine();
        int month = Integer.parseInt(s1);
        
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febuary");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("Not found your month");
                break;
        }
    }

}
