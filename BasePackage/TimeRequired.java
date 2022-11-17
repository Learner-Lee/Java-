package BasePackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeRequired {
    public static void main(String[] args) {
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(date1);
        System.out.println("当前时间为=" + date1Str);

        Date date2 = new Date();
        String date2Str = simpleDateFormat.format(date2);
        System.out.println("完成后时间为=" + date2Str);
    }
}
