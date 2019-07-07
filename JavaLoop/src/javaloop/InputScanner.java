package javaloop;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        
        System.out.print("Enter your name: ");
        Scanner sc1 = new Scanner(System.in);
        String s1 = sc1.nextLine();
        
        System.out.print("Enter your age: ");
        Scanner sc2 = new Scanner(System.in);
        String s2 = sc2.nextLine();
        int age = Integer.parseInt(s2);
        
        System.out.println("Hello "+s1);
        System.out.println("In next year your age is "+(age+1));
    }
}
