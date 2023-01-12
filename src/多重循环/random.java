package ∂‡÷ÿ—≠ª∑;

public class random {
    public static void main(String[] args) {
        int sum = 0;
        while (true) {
            int rom = (int)(Math.random()*100)+1;
            System.out.println(rom);
            sum++;
            if (rom==97){
                System.out.println("di:"+sum);
                break;
            }
        }
//        for (int i = 0; i <= 10; i++) {
//            int rom = (int)(Math.random() * 100)+1;
//            if (rom==99){
//                break;
//            }
//        }
    }
}
