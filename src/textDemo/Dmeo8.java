package textDemo;

public class Dmeo8 {
    public static void main(String[] args) {
        int sum = 0;
        int a = 0;
        int b = 0;
        for (int i = 1; i <=100; i++) {
            a = a+i;
            b = b+a;
            for (int j = 1; j <=i ; j++) {
                sum += j;
            }
        }
        System.out.println(sum);
        System.out.println(b);
    }
}
