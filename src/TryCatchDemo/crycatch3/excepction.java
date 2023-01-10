package TryCatchDemo.crycatch3;

public class excepction {
    public static int sum() throws ArithmeticException{
        int x = (1/0);
        return x;
    }

    public static void main(String[] args) {
        try {
            System.out.println(sum());
        }catch (ArithmeticException e){
            System.out.println("“Ï≥£–≈œ¢");
        }
    }
}
