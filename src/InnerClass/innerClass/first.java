package InnerClass.innerClass;

public class first {
    private int num = 10;
    //外部类
    public class Inner{
        //内部类可以直接访问外部类的成员 包括私有
        // 外部类要访问内部类成员 必须创建对象
        public void show(){
            System.out.println(num);
        }
    }
    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
