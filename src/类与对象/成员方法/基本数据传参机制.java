package 类与对象.成员方法;

public class 基本数据传参机制 {
    public static void main(String[] args) {
        swap sw = new swap();
        int a = 10;
        int b = 20;
        //值传递
        sw.swap1(a,b);
        System.out.println("a=" + a + "; b=" + b);

        //地址传递
        int[] arr = {1,3,4};
        sw.adress(arr);
        System.out.println(arr[0]);

    }
}
class swap{
    public void swap1(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public void adress(int[] arr){
        arr[0] = 200;
        System.out.println(arr[0]);

    }
}
