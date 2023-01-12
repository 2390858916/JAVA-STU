package ∂‡÷ÿ—≠ª∑;
public class Demo2Pro {
    public static void main(String[] args) {
        int totalLevel = 10;
        for (int i = 1; i <=totalLevel; i++) {
            for (int k = 1; k <=totalLevel-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                if (j==1 || j==2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = totalLevel; i >=1; i--) {
            for (int k = totalLevel-i; k >=1 ; k--) {
                System.out.print(" ");
            }
            for (int j = 2*i-1; j >=1; j--) {
                if (j==2*i-1 || j==1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
