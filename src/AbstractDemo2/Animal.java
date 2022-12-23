package AbstractDemo2;

public abstract class Animal {
    private int age = 20;
    private final String city = "beijin";
    // final 化常量 不可改变

    public Animal(){}
    public Animal(int age) {
        this.age = age;
    }

    public void show(){
        age = 40;
        System.out.println(age);
        System.out.println(city);
    }

    public abstract void eat();
}
