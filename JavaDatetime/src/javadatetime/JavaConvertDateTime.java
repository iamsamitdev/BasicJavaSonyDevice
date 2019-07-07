package javadatetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaConvertDateTime {
    public static void main(String[] args) throws ParseException {
        
        String defaultFomat = "yyyy-MM-dd hh:mm:ss";
        String inputFormat = "dd/MM/yyyy";
        String inputData = "2019-07-06 09:30:00";
        
        System.out.println(DateConvert(defaultFomat, inputFormat, inputData));
    }
    
    
    // สร้างเป็นฟังก์ชันสำหรับการ Convert Data Format
    public  static String DateConvert(String DefaultFormat, String InputFormat, String InputData) throws ParseException{
        
        // กำหนดวันที่ เวลาที่ต้องการนำมาแปลง fotmat
        // เช่นการดึงจากฐานข้อมูล
        String dataString = InputData;
        
        // ฟังก์ชันแปลงจาก String เป็น Date
        SimpleDateFormat f = new SimpleDateFormat(DefaultFormat);
        Date date = f.parse(dataString);
        
        // เปลี่ยนรูปแบบการแสดงผลวันเวลา ตามที่ต้องการ
        SimpleDateFormat df = new SimpleDateFormat(InputFormat);
        String result = df.format(date);
        
        return result;
    }
}
