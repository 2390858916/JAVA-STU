package ∂‡÷ÿ—≠ª∑;

import java.util.Scanner;

public class for_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 3;
        String usernam = "jinzhen";
        String password = "123456";
        for (int i = 1; i <= 3; i++) {
            System.out.println("input usernaEme");
            String intuser = sc.next();
            System.out.println("input password");
            String intpass = sc.next();
            if ("jinzhen".equals(intuser) && "123456".equals(intpass)){
                System.out.println("login success");
            }
            num--;
            System.out.println("username/password error you have"+ num + "change");

        }
    }
}
