package InterFaceDemo.inerfacetest8;

public class demo {
    public static void main(String[] args) {
        student s = new student();
        System.out.println("ѧ��ȥ");
        s.eat();
        s.sleep();
        System.out.println("------------------");
        praent p = new praent();
        System.out.println("�ҳ�ȥ");
        p.eat();
        p.sleep();
        System.out.println("-------------------");
        System.out.println("��ʦȥ");
        teacher t = new teacher();
        t.eat();
        t.sleep();
    }
}
