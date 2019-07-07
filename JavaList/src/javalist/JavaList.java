
package javalist;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JavaList {

    public static void main(String[] args) {
        // Array List
        List<String> listString = new ArrayList<String>();
        
        // Add Member to list
        listString.add("John");
        listString.add("Jany");
        listString.add("Boy");
        
        System.out.println(listString.get(1));
        
        System.out.println("---------loop list------------");
        // loop
        for(String data: listString){
            System.out.println(data);
        }
        
        System.out.println("------Search member in list-------");
        // Serach member in list
        if(listString.contains("Jany")){
            System.out.println("Found the element");
        }else{
            System.out.println("There is no such element");
        }
        
        System.out.println("-------Sorting member in list-------");
        Collections.sort(listString);
         for(String data: listString){
            System.out.println(data);
        }
         
         // Random Array list
         List<Integer> number = new ArrayList<Integer>();
         for(int i=0; i<=10; i++){
             number.add(i);
         }
         
         System.out.println("----------List befor shuffle---------");
         System.out.println(number);
         
         System.out.println("------------List after shuffle--------");
         Collections.shuffle(number);
         System.out.println(number);
         
         System.out.println("---------Convert list to array--------");
         List<String> listName = Arrays.asList("Peter","Tommy","Sam","Mary","David");
         List<Integer> listNum = Arrays.asList(8,12,14,7,22,90);
         System.out.println(listName);
         System.out.println(listNum);
         System.out.println(listName.get(2));
         
         System.out.println("---------Java join string-------");
         String s1 = "aaa,bbb,ccc,ddd,eee,ffff";
         String result = "\""+s1.toString().replace(",","\",\"")+"\"";
         System.out.println(result);
         
         List<String> lists1 = Arrays.asList(result);
         System.out.println(lists1);
        
    }
    
}
