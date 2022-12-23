package interfaceDemo4;

public class PingPangPlayer extends Player implements SpeakEnglish{
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("PingPangPlayer Study");
    }

    @Override
    public void eat() {
        System.out.println("PingPangPlayer Eat");
    }

    @Override
    public void speak() {
        System.out.println("PingPangPLayer speak");
    }
}
