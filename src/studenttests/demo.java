package studenttests;

public class demo {
    public static void main(String[] args) {
        Student student = new Student("liming", 15);
        student.show();
        Undergraduate undergraduate = new Undergraduate("小明", 20, "博士");
        undergraduate.show();
    }
}
