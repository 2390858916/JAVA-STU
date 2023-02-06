package 类与对象.成员方法;

public class MethodDetail01 {
    public static void main(String[] args) {
        a a = new a();a.sayOk();a.m1();}}
class a{
    public void print(int n){
        System.out.println("print use"+ n);}
    public void sayOk(){
        print(10);System.out.println("sayOk use");}
    //跨类调用方法
    public void m1(){b b = new b();b.hi();}
}
class b{
    public void hi(){System.out.println("b 类调用");}
}
