package BasesTypePackaging.Date;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);
        System.out.println("*************");

        System.out.println("------------");
        long time = 1000*60*60;
        long tome2 = System.currentTimeMillis();
        d1.setTime(tome2);
        System.out.println(d1);
    }
}
