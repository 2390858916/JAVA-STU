package ������;

public class ���������� {
    public static void main(String[] args) {
        new MyParent("666");
    }
}
class MyParent{
    public MyParent(){
        System.out.println("�޲ι���������");
    }
    MyParent(String hello){
        this();
        System.out.println("����к���"+hello);
    }
}

