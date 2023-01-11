package BasesTypePackaging;

public class StringÀàĞÍ×ª»» {
    public static void main(String[] args) {
        int number = 100;
        // int conversion to String
        String s1 = "" + number;
        System.out.println(s1);

        String s2 = String.valueOf(number);
        System.out.println(s2);


        // String conversion to int
        String s = "100";
        int i = Integer.parseInt(s);
        System.out.println(i);

        int y = Integer.parseInt(s);
        System.out.println(y);
    }
}
