package innerClass2;

public class InnerDemo {
    public static void main(String[] args) {
        //Inner i = new Inner();
        // 用法 隐藏类 不让外界看到 不常用
        //Outer.Inner i = new Outer().new Inner();
        //i.show();

        //调用隐藏私有类
        Outer o = new Outer();
        o.method();
    }
}
