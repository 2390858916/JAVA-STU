package 方法重载overload;

public class 重载2 {
    public static void main(String[] args) {
        demo d = new demo();
        System.out.println(d.function(1,2));

    }
}
class demo{
    public int function(int a,int b){
        return a+b;
    }
}
