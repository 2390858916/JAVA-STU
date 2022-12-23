package DUOTAI;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        System.out.println(a.age);
//        cat 是 复写 在Animanl中定义相同的内容后才能使用
//        System.out.println(a.weight);

        a.eat();
        //成员方法也是一样
        //e.play()
    }
}
