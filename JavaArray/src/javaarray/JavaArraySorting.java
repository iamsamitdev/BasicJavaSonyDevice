package javaarray;

import java.util.Arrays;
import java.util.Collections;

public class JavaArraySorting {
    public static void main(String[] args) {
        String fruits[] = {"Banana","orange","Kiwi","apple"};
        String thainame[] = {"สามิตร","ขณิษฐา","วิเชียร","ภาวินี"};
         
        // คำสั่งในการจัดเรียงสมาชิกของ array
        //Arrays.sort(fruits, String.CASE_INSENSITIVE_ORDER); // น้อยไปมาก
        Arrays.sort(fruits,Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER)); // มากไปน้อย       
        Arrays.sort(thainame);
        
         System.out.println("------------Fruits-------------");
         
        // loop
        for(String fruit: fruits){
            System.out.println(fruit);
        }
        
        System.out.println("------------Thainame-------------");
        
        for(String thname: thainame){
            System.out.println(thname);
        }
    }
}
