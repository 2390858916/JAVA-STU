package ��̬;

public class poly01 {
    //��������ʵ�ֶ�̬
    public static void main(String[] args) {
        master m = new master("tom2 ");
        dog d = new dog("dog ");
        bone b = new bone("bone ");

        cat c = new cat("cat2");
        fish fish = new fish("fish");

        pig p = new pig("pig");
        rice r = new rice("rice");


        m.feed(d,b);
        m.feed(c,fish);
        m.feed(p,r);

    }
}
