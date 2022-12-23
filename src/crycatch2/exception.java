package crycatch2;

public class exception {
    public static void main(String[] args) {
        try {
            int a[] = {1,2,3,4,5},sum=0;
            for (int i =0;i<=5;i++) sum=sum+a[i];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }finally {
            System.out.println("已执行");
        }
    }
}
