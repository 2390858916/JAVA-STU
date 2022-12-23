package crycatch4;

public class crythow {
    public static void main(String[] args) {
        thow();
    }
    public static void thow(){
        try {
            int s = 1/0;
            System.out.println(s);
            throw new ArithmeticException("´íÎó");
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
