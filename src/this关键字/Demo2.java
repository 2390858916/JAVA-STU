package this关键字;

public class Demo2 {
    public static void main(String[] args) {
        Person p1 = new Person("tom",15);
        Person p2 = new Person("jerry" ,16);
        System.out.println("p1比较p2" + p1.TestPersion(p2));
        // 使用p1时 tom 和 15 先传值给 方法定义的name和age
        // 在p1对象中把p2的值传给p1类对象的TestPerson方法
        //
    }
}
class Person{
    private String name; //tom
    private int age; //15
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public boolean TestPersion(Person p){ //p.name = jerry age = 16
       return this.name.equals(p.name) && this.age == p.age;
    }
}
