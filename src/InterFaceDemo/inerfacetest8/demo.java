package InterFaceDemo.inerfacetest8;

public class demo {
    public static void main(String[] args) {
        student s = new student();
        System.out.println("学生去");
        s.eat();
        s.sleep();
        System.out.println("------------------");
        praent p = new praent();
        System.out.println("家长去");
        p.eat();
        p.sleep();
        System.out.println("-------------------");
        System.out.println("老师去");
        teacher t = new teacher();
        t.eat();
        t.sleep();
    }
}
