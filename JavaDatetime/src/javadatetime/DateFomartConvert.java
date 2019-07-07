package javadatetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFomartConvert {
    public static void main(String[] args) throws ParseException {
        
            String dateString = "2019-07-03 17:30:20"; // from mySQL database
            
            // Convert String to date
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date date = f.parse(dateString);
            
            // Change the date format
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); // hh:mm aaa
            String result = df.format(date);
            
            System.out.println(result);
        
    }
}
