package 多重循环;

import java.util.Arrays;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[5];
        int classNum = 3;
        int stuNum = 5;
        double temp = 0;
        int pass = 0;
        for (int i = 1; i <= classNum; i++) {
            double classS = 0;
            int classpass = 0;
            for (int j = 1; j <= stuNum; j++) {
                System.out.println("第"+i+"个班第"+j+"同学成绩");
                double score = sc.nextDouble();
                temp += score;
                classS += score;
                if (score>=60){
                    pass++;
                    classpass++;
                }
            }
            System.out.println(" 第"+i+" 班级总分"+classS+" avg:"+classS/stuNum+ " pass" + classpass);
        }
        System.out.println("sum = "+temp+" score avg:"+ temp/(classNum*stuNum)+" pass"+pass);
    }
}
