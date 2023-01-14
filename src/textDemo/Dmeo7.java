package textDemo;

public class Dmeo7 {
    public static void main(String[] args) {
        double count = 0;
        for (double i = 1; i <= 100; i++) {
            if (i %2!=0){
                count += 1/i;
            }else {
                count -= 1/i;
            }
        }
        System.out.println(count);
    }
}
