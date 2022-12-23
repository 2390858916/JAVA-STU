package AbstractDemo3;

public class AnimaleDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("11");
        a.setAge(1);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("222",2);
        System.out.println(a.getName());
        System.out.println(a.getAge());
        a.eat();
    }
}
