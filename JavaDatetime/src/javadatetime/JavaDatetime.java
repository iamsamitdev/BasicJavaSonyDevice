package javadatetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JavaDatetime {

    public static void main(String[] args) throws ParseException {
        /*
        Date date = new Date(); // หาวันเวลาปัจจุบันของเครื่อง

        SimpleDateFormat fd = new SimpleDateFormat("dd MMMM yyyy");  // กำหนดรูปแบบแสดงผลวันเดือนปี
        SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss"); // กำหนดรูปแบบแสดงผลเวลา

        System.out.println(fd.format(date));
        System.out.println(ft.format(date));
        
        ConvertDataFormat cv = new ConvertDataFormat();
        cv.convertFormat("2019-06-30", "yyyy");
        */

        Date date = new Date();
        String strDateFormat = "dd/MM/yyyy HH:mm:ss a";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(date.toString());
        System.out.println(sdf.format(date));

    }

}
