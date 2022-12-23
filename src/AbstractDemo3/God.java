package AbstractDemo3;

public class God extends Animal{
    public God() {
    }

    public God(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("dog eat");
    }
}
