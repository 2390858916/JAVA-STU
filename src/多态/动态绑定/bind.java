package 多态.动态绑定;

public class bind {
    public static void main(String[] args) {
        //向上绑定
        A a = new B();
        System.out.println(a.sum()); //40
        System.out.println(a.sum1()); //30
    }
}
class A{
    public int i = 10;
    public int sum(){
        return geti() + 10;
    }
    public int sum1(){
        return i+10;
    }
    public int geti(){
        return i;
    }
}
class B extends A{
    public int i = 20;
//    public int sum(){
//        return i+20;
//    }，
    public int geti(){
        return i;
    }
    public int sum1(){
        return i + 10;
    }
}

