package AbstractDemo2;

public abstract class Animal {
    private int age = 20;
    private final String city = "beijin";
    // final ������ ���ɸı�

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
