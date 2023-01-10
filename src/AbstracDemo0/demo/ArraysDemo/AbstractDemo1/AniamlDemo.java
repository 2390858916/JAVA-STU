package AbstracDemo0.demo.ArraysDemo.AbstractDemo1;

public class AniamlDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        // 执行时 cat 继承Animal sleep 方法
        a.sleep();
    }
}
