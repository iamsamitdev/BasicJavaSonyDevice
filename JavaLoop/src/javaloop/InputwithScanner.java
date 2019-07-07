package javaloop;

import java.util.Scanner;

public class InputwithScanner {
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Insert Number1 : ");
        String First = Sc.nextLine();
        int data = Integer.parseInt(First);
        System.out.println("Your number is "+(data+8));
    }
    
}
