package textDemo;

public class whilebreakDemo {
    public static void main(String[] args) {
        double money =  100000;
        int num = 0;
        while (true){
            if (money>50000){
                money *=0.95;
                num++;
            } else if (money>=1000) {
                money -= 1000;
                num++;
            }else{
                System.out.println(num);
                break;
            }
        }
    }
}
