package ∂‡÷ÿ—≠ª∑;

public class demo2 {
    public static void main(String[] args) {
        int totalLevel = 10;
        for (int i = 1; i <=totalLevel; i++) {
            for (int k = 1; k <=totalLevel-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
        for (int i = 1; i <=totalLevel; i++) {
            for (int k = 1; k <=totalLevel-i ; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*i-1; j++) {
                //if (j==1 || j==2*i-1 || i==totalLevel)
                if (j==1 || j==2*i-1){
                    System.out.print("*");
                } else if (i==totalLevel) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
