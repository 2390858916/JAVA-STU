package �������.��Ա����;

public class MethodDetail01 {
    public static void main(String[] args) {
        a a = new a();a.sayOk();a.m1();}}
class a{
    public void print(int n){
        System.out.println("print use"+ n);}
    public void sayOk(){
        print(10);System.out.println("sayOk use");}
    //������÷���
    public void m1(){b b = new b();b.hi();}
}
class b{
    public void hi(){System.out.println("b �����");}
}
