package 递归;

public class Demo1 {
    public static void main(String[] args) {
        recursion re = new recursion();
        re.test(5);
        System.out.println(re.factorial(5));
        System.out.println(re.fbnq(7));
    }
}
class recursion{
    //打印问题
    public void test(int num){
        if(num >2){
            test(num -1);
        }else {
            System.out.println(num);
        }
    }
    //阶乘问题
    public int factorial(int n){
        if (n==1) {
            return 1;
        }else {
            return factorial(n-1) * n;
        }
    }
    public int fbnq(int n ){
        if (n>=1){
            if (n==1 || n==2){
                return 1;
            }else {
                return fbnq(n-1) + fbnq(n-2);
            }
        }else {
            System.out.println("error");
        }
        return -1;
    }
}
