package BasePackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
    Date date1 = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String date1Str = simpleDateFormat.format(date1);
}
