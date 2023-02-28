package 可变参数;

public class Demo1 {
    public static void main(String[] args) {
        Mothed m = new Mothed();
        m.canshu(1,5,6);
    }
}
class Mothed{
    public void canshu(int... num){
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
