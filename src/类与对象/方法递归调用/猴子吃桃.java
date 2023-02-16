package 类与对象.方法递归调用;

public class 猴子吃桃 {
    public static void main(String[] args) {
        //第10天 1
        //第9天 (day10 +1) * 2 = 4
        //第8天 (day9 +1) * 2 = 10
        //第一天 倒循环
        t t1 = new t();
        int num = 9;
        System.out.println(t1.peach(num));
    }

}
class t {
    public int peach(int day){
        if (day==10){
            return 1;
        } else if (day >=1 && day <=9) {
            return (peach(day +1)+1)*2;
        }else {
            return -1;
        }
    }
}
