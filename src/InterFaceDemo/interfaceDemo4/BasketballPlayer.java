package InterFaceDemo.interfaceDemo4;

public class BasketballPlayer extends Player{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("BasketballPLayer study");
    }

    @Override
    public void eat() {
        System.out.println("BasketballPlayer eat");
    }
}
