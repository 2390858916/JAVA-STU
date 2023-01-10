package InterFaceDemo.interfaceDemo2;

public interface Inter {

    //接口所有变量都是 以常量形式存在 接口不能有构造方法
    public int num = 10;
    public final int num2 = 20;
    public static final int num3 =30;

    ///接口中要使用抽象方法
    public abstract void method();
    void show();
}
