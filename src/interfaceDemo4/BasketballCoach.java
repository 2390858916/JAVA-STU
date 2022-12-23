package interfaceDemo4;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("basketball teach");
    }

    @Override
    public void eat() {
        System.out.println("basketball eat");
    }
}
