package 构造器;

public class 构造器调用 {
    public static void main(String[] args) {
        new MyParent("666");
    }
}
class MyParent{
    public MyParent(){
        System.out.println("无参构造器调用");
    }
    MyParent(String hello){
        this();
        System.out.println("打个招呼："+hello);
    }
}

