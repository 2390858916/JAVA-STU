package ��̬;

public class poly01 {
    //��������ʵ�ֶ�̬
    public static void main(String[] args) {
        master m = new master("tom");
        dog d = new dog("dog");
        bone b = new bone("bone");

        cat c = new cat("cat");
        fish fish = new fish("fish");

        m.feed(d,b);
        m.feed(c,fish);

    }
}
