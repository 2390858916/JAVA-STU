package BasesTypePackaging.Date;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //���ڸ�ʽ���ͽ���
        Date d = new Date();
        //Ĭ��ģʽ
        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
        String s2 = sdf2.format(d);
        String s = sdf.format(d);
        System.out.println(s);
        System.out.println(s2);

        String sss = "2022-02-02 11:11:11";
        SimpleDateFormat ssss = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
        Date dd = ssss.parse(sss);
        System.out.println(dd);

    }
}
