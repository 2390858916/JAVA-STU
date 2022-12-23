package test61;

public class demo {
    public static void main(String[] args) {
        student s = new student();
        s.setName("111");
        s.setScore("52");
        s.show();
        student s2 = new student("222","62");
        s2.show();
    }
}
