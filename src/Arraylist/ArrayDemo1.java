package Arraylist;

public class ArrayDemo1 {
    public static void main(String[] args) {
        double[] heaver = {3,5,1,3.4,2,50};
        double avg = 0;
        double totalheaver = 0;
        for (double v : heaver) {
            totalheaver += v;
        }
        System.out.println("×ÜÌåÖØ"+ totalheaver + "kg");
        System.out.println("avg:\n" + totalheaver/heaver.length);
    }
}
