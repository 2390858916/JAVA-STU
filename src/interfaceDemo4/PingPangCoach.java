package interfaceDemo4;

public class PingPangCoach extends Coach implements SpeakEnglish{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("PingPqang teach");
    }

    @Override
    public void eat() {
        System.out.println("PingPang eat");
    }

    @Override
    public void speak() {
        System.out.println("PIngPang speak english");
    }
}
