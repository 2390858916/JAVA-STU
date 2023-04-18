package 多态.detail;

public class poly {
    public static void main(String[] args) {
        animal animal = new cat();
        animal animal1 = new dog();
        animal.eat();
        animal.show();

        //多态向下转型
        //cat 编译类型 运行类型cat
        cat cat = (cat) animal;
        dog dog = (dog) animal1;
        cat.eat();
        //可访问子类独有方法
        //要求父类的引用必须的是当前目标类型的对象
        cat.catchmos();


    }
}
