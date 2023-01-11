package BasesTypePackaging.Date;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //日期格式化和解析
        Date d = new Date();
        //默认模式
        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s2 = sdf2.format(d);
        String s = sdf.format(d);
        System.out.println(s);
        System.out.println(s2);

        String sss = "2022-02-02 11:11:11";
        SimpleDateFormat ssss = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date dd = ssss.parse(sss);
        System.out.println(dd);

    }
}
