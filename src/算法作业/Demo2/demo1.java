package 算法作业.Demo2;

import java.util.Date;

public class demo1 {
    public static void main(String[] args) {
        demo1();
        ///2
        int n = 8;
        int result = demo2(n);
        System.out.println("第" + n + "项的数值为: " + result);
        ///3
        demo3(10);

    }
    public static void currentDate() {
        System.out.println("----------------------------------");
        Date currentTime = new Date();
        System.out.println("当前时间: " + currentTime);
        System.out.println("作者：钟佳霖");
        System.out.println("学号： 2020108040935");
        System.out.println("----------------------------------");
    }
    public static void demo1(){
        int sum = 0;
        for (int i = 1; i <= 99; i+=2) {
            sum += i*(i+1)*(i+2);
        }
        System.out.println(sum);
        currentDate();
    }
    public static int demo2(int n) {
        currentDate();
        if (n <= 0) {
            //抛出不合理参数错误
            throw new IllegalArgumentException("n必须大于0");
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 5;
        } else {
            int prev1 = 0; // 前一项
            int prev2 = 5; // 前两项
            int result = 0; // 第n项
            for (int i = 3; i <= n; i++) {
                result = prev1 + prev2;
                prev1 = prev2;
                prev2 = result;
            }
            return result;
        }
    }
    public static void demo3(int n) {
        int peachCount = 2;

        for (int i = n - 1; i >= 1; i--) {
            peachCount = (peachCount + 2) * 2;
        }
        System.out.println("第一天摘了 " + peachCount + " 个桃子");
    }

}
