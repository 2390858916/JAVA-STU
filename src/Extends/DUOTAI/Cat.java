package Extends.DUOTAI;

public class Cat extends Animal{
    //重写方法
    public int age = 20;
    public int weight = 10;




    ///重写方法
    @Override
    public void eat() {
        System.out.println("cat eat fiesh");
    }

    public void playGame(){
        System.out.println("play");
    }
}
