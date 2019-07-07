package javaarray;

public class JavaArray {

    public static void main(String[] args) {
        
        // การสร้างตัวแปรแบบ Array
        int number[] = {2,8,7,18,22,9,10};
        // แสดงสมาชิกออกมา
        System.out.println(number[5]);
        
        String fullname[] = {"John","Jane","Joe","Jim"};
        System.out.println(fullname[2]);
        
        System.out.println("--------------For---------------");
        
        double myList[] = {1.8,2.9,3.4,5.7};
        for(int i = 0; i < myList.length; i++){
            System.out.println(myList[i]);
        }
        
        // การแทนที่สมาชิก  array
        myList[3] = 8.5;
        
        System.out.println("----------ForEach---------------");
        
        // ฟังก์ชัน foreach ไว้สำหรับวนลูปสมาชิกของ array เท่านั้น
        for(double data: myList){
            System.out.println(data);
        }
    }
    
}
