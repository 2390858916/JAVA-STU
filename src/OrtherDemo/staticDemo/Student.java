package OrtherDemo.staticDemo;

public class Student {
    public String name;
    public int age;

    // 变量添加static就是给予默认值是第一次的赋值 静态修饰
    public static String univercit;

    public void show(){
        System.out.println(name+ "," +age+ "," +univercit);
    }
}
