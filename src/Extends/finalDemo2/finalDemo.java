package Extends.finalDemo2;

public class finalDemo {
    public static void main(String[] args) {
        /// no change
        final int age = 2;
        System.out.println(age);

        // final 的是 s 的地址 数值可以改变
        final student s = new student();
        s.age = 60;
        System.out.println(s.age);


    }
}
