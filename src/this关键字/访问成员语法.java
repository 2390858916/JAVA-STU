package this关键字;

public class 访问成员语法 {
    public static void main(String[] args) {
        T t1 = new T();
        t1.f2();
    }
}
class T{
    private String name = "niub";
    private int age;
    public T(){
        //在一个构造器中访问另一个构造器 必须放在第一行
        this("niui",18);
        System.out.println("T 构造器");
    }
    public T(String name,int age){
        System.out.println("T(canshu) 构造器");
    }
    public void f1(){
        String name =  "list";
        //在方法中不使用this默认使用最近的值
        System.out.println("normle"+ name);
        System.out.println("this name"+ this.name);
    }
    public void f2(){
        //第一种方法
        f1();
        //第二种方法
        this.f1();
    }
}
