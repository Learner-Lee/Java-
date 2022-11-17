package BasePackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CompletionTime {
    //
    private String CurT;
    private String Time;

    public String getTime() {
        return Time;
    }

    public CompletionTime(String curT) {
        CurT = curT;
    }

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date2 = new Date();
    String date2Str = simpleDateFormat.format(date2);
    Time = CurT - 

}
