package �ݹ�;

public class Demo1 {
    public static void main(String[] args) {
        recursion re = new recursion();
        re.test(5);
    }
}
class recursion{
    //��
    public void test(int num){
        if(num >2){
            test(num -2);
        }
        System.out.println(num);
    }
}
