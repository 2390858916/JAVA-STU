package Extends.duotai04;

public class AnimalDemo {
    public static void main(String[] args) {
        //��̬
        Animal a = new Cat(); //����ת��
        a.eat();
        //a.playGame()

        //����ת��
        Cat c = (Cat) a;
        c.eat();
        c.playGame();
    }
}
