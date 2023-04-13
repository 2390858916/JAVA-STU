package 多态;

public class poly01 {
    //基本函数实现多态
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
