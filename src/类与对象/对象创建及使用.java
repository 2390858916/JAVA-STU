package 类与对象;

public class 对象创建及使用 {
    public static void main(String[] args) {
        //实例化一只猫对象
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";

        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";
    }
}
class Cat {
    String name;
    int age;
    String color;
}
