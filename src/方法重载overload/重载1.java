package 方法重载overload;

public class 重载1 {
    public static void main(String[] args) {
        Overload o = new Overload();
        o.methed(6,108);
        o.methed(8);
        o.methed("6666");

    }
}
class Overload{
    public void methed(int a){
        System.out.println(a * a);
    }
    public void methed(int a,int b){
        System.out.println(a * b);
    }
    public void methed(String a){
        System.out.println(a);
        System.out.println(a);

    }


}
