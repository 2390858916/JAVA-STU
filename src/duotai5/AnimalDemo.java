package duotai5;
//text
public class AnimalDemo {
    public static void main(String[] args) {
        //create cat …œ≤Œ¿‡i
        Animal a = new Cat();
        a.setName("cat1");
        a.setAge(2);
        System.out.println(a.getName() +"," + a.getAge());
        a.eat();

        a = new Cat("666",7);
        System.out.println(a.getName() +"," + a.getAge());
        a.eat();
    }
}
