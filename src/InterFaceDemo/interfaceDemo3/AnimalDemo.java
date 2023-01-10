package InterFaceDemo.interfaceDemo3;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.jump();
        System.out.println("-------------");

        Animal a = new Cat();
        a.setName("1");
        a.setAge(4);
        System.out.println(a.getAge() + "," + a.getAge());
        a.eat();

        a = new Cat("22",11);
        System.out.println(a.getAge() + "," + a.getAge());
        a.eat();
        System.out.println("-----------------");

        ///C常用最后一个
        Cat c = new Cat();
        c.setName("222");
        c.setAge(2);
        System.out.println(c.getName()+ "," +c.getAge());
        c.eat();
        c.jump();
    }
}
