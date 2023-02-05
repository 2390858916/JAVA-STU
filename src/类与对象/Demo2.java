package 类与对象;

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
        //b = null 时 b失去对象，无法获取a的对象属性 就会出错
        System.out.println(a.age);
        System.out.println(b.age);
    }

}
class Person{
    int age;
    String name;
}
