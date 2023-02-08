package 类与对象.方法递归调用;

public class Demo1 {
    public static void main(String[] args) {
        T t = new T();
        t.test(4);
    }
}
class T {
    public void test(int n){
        if (n>2){
            test(n-1);
        }
        System.out.println(n);
    }
}
