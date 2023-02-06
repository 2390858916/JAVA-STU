package 类与对象.成员方法;

public class Method3 {
    public static void main(String[] args) {
        fun f = new fun();
        boolean odd = f.Judgment_Odd(6);
        System.out.println(odd);
    }
}
class fun{
    public boolean Judgment_Odd(int n){
        return n % 2 == 0;
    }
}
