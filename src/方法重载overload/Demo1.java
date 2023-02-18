package ∑Ω∑®÷ÿ‘ÿoverload;

public class Demo1 {
    public static void main(String[] args) {
        Mycalculate mc = new Mycalculate();
        System.out.println(mc.calculate(1.1,2));
    }
}
class Mycalculate{
    public int calculate(int a,int b){
        return a+b;
    }
    public double calculate(double a,int b){
        return a-b;
    }
}
