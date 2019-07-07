package javaarray;

import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add("Samit");
        myList.add("Wichai");
        myList.add(30);
        myList.add(200.60);
        myList.add(true);
        
        System.out.println(myList);
        
        System.out.println("-----------------Loop MyList-----------------");
        
        for(Object ml: myList){
            System.out.println(ml);
        }
        
        // การลบสมาชิกบางตัวออก
        System.out.println("-----------------Remove-----------------");
        myList.remove(3);
        
        System.out.println(myList);
        
    }
}
