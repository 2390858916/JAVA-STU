package �������;

public class Demo2 {
    public static void main(String[] args) {
        Person a = new Person();
        a.age = 10;
        a.name = "110";
        Person b;
        b = a;
        System.out.println(b.name);
        b.age = 200;
        b = null;
        //b = null ʱ bʧȥ�����޷���ȡa�Ķ������� �ͻ����
        System.out.println(a.age);
        System.out.println(b.age);
    }

}
class Person{
    int age;
    String name;
}
