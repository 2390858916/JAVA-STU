package this¹Ø¼ü×Ö;

public class MaxArray {
    public static void main(String[] args) {
        A01 max = new A01();
        double[] arr = {1.0,4.8,0,9.5,9.8};
        System.out.println(max.max(arr));
    }
}
class A01{
    public  double max(double[] arr){
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

}
