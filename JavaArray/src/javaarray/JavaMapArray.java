package javaarray;

import java.util.HashMap;
import java.util.Map;

public class JavaMapArray {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        // Add value to map
        map.put("th", "Thailand");
        map.put("jp", "Japan");
        map.put("kr", "Korea");
        map.put("ch", "China");

        // เรียกแสดงข้อมูลจาก map
        System.out.println(map.getOrDefault("ths", "Not found this country"));

        System.out.println("------------------loop map---------------------");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }
}
