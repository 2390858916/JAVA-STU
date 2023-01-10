package OrtherDemo.staticDemo;

public class staicDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "1";
        s.age = 12;
        Student.univercit = "jjjjj";
        s.show();

        Student s2 = new Student();
        s2.name = "2";
        s2.age = 2;
        s2.show();

    }
}
